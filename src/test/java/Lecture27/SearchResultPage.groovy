package Lecture27

import geb.Page

class SearchResultPage extends Page {
    static content = {
        resultStats { $('#result-stats') }
    }

}