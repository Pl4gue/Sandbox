import srt
from datetime import timedelta


def main():
    n = int(input('Amount of .srt files: '))
    subtitlesmerged = []
    for i in (1, n):
        p = input('File no. %s: ' % i)
        with open(p, 'r') as file:
            data = file.read()
        data.replace(u'\ufeff', '')
        subtitles_gen = srt.parse(data)
        subtitles = list(subtitles_gen)
        subtitlesmerged = subtitlesmerged + subtitles

    subtitles = list(srt.sort_and_reindex(subtitlesmerged))

    subtitles_composed = srt.compose(subtitles)
    outputpath = input('Write merged .srt file to: ')
    with open(outputpath, 'w') as output:
        output.write(subtitles_composed)


if __name__ == '__main__':
    main()
