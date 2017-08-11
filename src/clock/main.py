import sys

from PyQt4.QtGui import QWidget, QApplication


class MyWidget(QWidget):
    def mousePressEvent(self, event):
        print "clicked"

    def show(self):
        self.setWindowTitle("a")
        QWidget.show(self)


app = QApplication(sys.argv)

widget = MyWidget()
widget.show()

app.exec_()
