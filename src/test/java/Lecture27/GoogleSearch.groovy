package Lecture27

import geb.Browser
import org.openqa.selenium.Keys
import spock.lang.Specification

class GoogleSearch extends Specification {

    def "Test Search "() {
        def browser = new Browser()
        given:
        browser.to GoogleSearchPage

        when:
        browser.page(GoogleSearchPage).searchField << "Hello world!"

        and:
        browser.page(GoogleSearchPage).searchField << Keys.ENTER

        then:
        assert browser.page(SearchResultPage).resultStats.text().contains("1")
    }
}