$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("searchEngine.feature");
formatter.feature({
  "line": 2,
  "name": "Search Engine feature",
  "description": "",
  "id": "search-engine-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@search-engine-test"
    }
  ]
});
formatter.before({
  "duration": 11654246579,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on the home page of joinallofus.com",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpSD.iAmOnTheHomePageOfJoinallofusCom()"
});
formatter.result({
  "duration": 292338683,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify search engine functionality",
  "description": "",
  "id": "search-engine-feature;verify-search-engine-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@search-engine-test-1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I click on Search box from top right corner of the home page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I write \"pmi\" into search box",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on GO button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on Who Can Join – PMI Requirements link",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I verify page title as \"Who Can Join – PMI Requirements | All of Us\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchPageSD.iClickOnSearchBoxFromTopRightCornerOfTheHomePage()"
});
formatter.result({
  "duration": 96438952,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pmi",
      "offset": 9
    }
  ],
  "location": "SearchPageSD.iWriteIntoSearchBox(String)"
});
formatter.result({
  "duration": 105712240,
  "status": "passed"
});
formatter.match({
  "location": "SearchPageSD.iClickOnGOButton()"
});
formatter.result({
  "duration": 2995657875,
  "status": "passed"
});
formatter.match({
  "location": "SearchPageSD.iClickOnLink()"
});
formatter.result({
  "duration": 1171563920,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Who Can Join – PMI Requirements | All of Us",
      "offset": 24
    }
  ],
  "location": "SearchPageSD.iVerifiedPageTitleAs(String)"
});
formatter.result({
  "duration": 17665982,
  "status": "passed"
});
formatter.after({
  "duration": 2562222840,
  "status": "passed"
});
});