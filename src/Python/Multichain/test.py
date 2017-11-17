import subprocess
import sys
global chainName


def main():
    print("main called")
    global chainName
    chainName = 'happyEMI_testchain'
    c = 1
    while True:
        cmd = sys.stdin.readline()
        cmdArr = cmd.split()
        if(cmdArr[0] == 'issue'):
            try:
                if(cmdArr[2] != '' and cmdArr[3] != ''):
                    issue(cmdArr[1], 'asset' + str(c),
                          unitAmount=cmdArr[2], subPartSize=cmdArr[3])
            except IndexError:
                try:
                    if(cmdArr[2] != ''):
                        issue(cmdArr[1], 'asset' + str(c),
                              subPartSize=cmdArr[3])
                except IndexError:
                    issue(cmdArr[1], 'asset' + str(c), subPartSize=cmdArr[3])
                try:
                    if(cmdArr[3] == ''):
                        issue(cmdArr[1], 'asset' + str(c),
                              unitAmount=cmdArr[2])
                except IndexError:
                    issue(cmdArr[1], 'asset' + str(c), unitAmount=cmdArr[2])
        if(cmdArr[0] == 'send'):
            sendassettoaddress(cmdArr[1], cmdArr[2], cmdArr[3])


def sendassettoaddress(address, assetName, unitAmount):
    subprocess.run(['multichain-cli',
                    chainName,
                    'sendassettoaddress',
                    address,
                    assetName,
                    unitAmount],
                   stdout=subprocess.PIPE).stdout.decode('utf-8')


def issue(address, assetName, unitAmount=1000, subPartSize=1):
    s = subprocess.run(['multichain-cli',
                        chainName,
                        'issue',
                        address,
                        assetName,
                        unitAmount,
                        subPartSize],
                       stdout=subprocess.PIPE).stdout.decode('utf-8')
    print('Created %s with id %s' % (assetName, s))
    print('Total balance: %s' % (getTotalBalance()))


def getTotalBalance():
    s = subprocess.run(['multichain-cli',
                        chainName,
                        'gettotalbalances'],
                       stdout=subprocess.PIPE).stdout.decode('utf-8')
    return s


if __name__ == '__main__':
    main()
