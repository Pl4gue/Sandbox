def window():
    app = QtGui.QApplication(sys.argv)
    window = QtGui.QWidget()
    lbl = QtGui.QLabel(window)
    # TODO resize font large

    window.setWindowTitle("Clock")
    screen_dimensions = app.desktop().screenGeometry()
    window.setGeometry(0, 0, screen_dimensions.width(),
                       screen_dimensions.height())
    #
    lblfont = QtGui.QFont()
    lblfont.setFamily("Arial Black")
    lblfont.setPointSize(72)
    lblfont.setBold(True)
    lblfont.setWeight(75)
    lbl.setFont(lblfont)
    while 1:
        reload(lbl, window, app.desktop())


def reload(label, window, screen):
    label.setText(time.strftime("%H:%M:%S"))
    window.show()
    for x in range(0, 10):
        label.setText(time.strftime("%H:%M:%S"))
        window.repaint()
        time.sleep(0.5)

    label.move(randint(0, screen.screenGeometry().width() -
                       label.fontMetrics().boundingRect(
        label.text()).width()),
        randint(0, screen.screenGeometry().height() -
                label.fontMetrics().boundingRect(
            label.text()).height()))


if __name__ == '__main__':
    import sys
    import time
    from random import randint
    from PyQt4 import QtGui, QtCore

    try:
        _UTF8 = QtCore.QString.fromUtf8
    except AttributeError:
        def _UTF8(s):
            return s
    window()
