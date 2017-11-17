from Savoir import Savoir
import time

def main():
    rpcuser = 'multichainrpc'
    rpcpasswd = '7vaBMwWh5Fm7cbVDWiJsVqk3V3KLhax7fS1FmdiKyH1W'
    rpchost = '35.157.232.179'
    rpcport = '9552'
    chainname = 'happyEMI_testchain'

    api = Savoir(rpcuser, rpcpasswd, rpchost, rpcport, chainname)
    print(api)
    time.sleep(1)
    print (api.getaddressesbyaccount("")[0])

if __name__ == '__main__':
    main()