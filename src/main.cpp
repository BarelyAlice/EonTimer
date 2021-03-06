#include <gui/ApplicationWindow.h>
#include <qapplication.h>

#include "app.h"

int main(int argc, char **argv) {
    QApplication app(argc, argv);
    QCoreApplication::setApplicationName(APP_NAME);
    QCoreApplication::setOrganizationName("DylanMeadows");
    QCoreApplication::setOrganizationDomain("io.github.dylmeadows");
    qRegisterMetaTypeStreamOperators<QList<int>>("QList<int>");

    gui::ApplicationWindow window;
    window.show();

    return QApplication::exec();
}