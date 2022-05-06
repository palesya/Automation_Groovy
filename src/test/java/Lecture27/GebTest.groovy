package Lecture27

import geb.Browser
import org.openqa.selenium.Keys

Browser.drive {
    go "/"
    $('[name="q"]') << "Hello world" << Keys.ENTER
    assert $('#result-stats').text().contains("Результатов")
}