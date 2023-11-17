import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Open Movie Listing page'
WebUI.callTestCase(findTestCase('Movie Listings Sorting/TC_MovieApp_ML_S_01'), [:], FailureHandling.STOP_ON_FAILURE)

'Tap Sort button'
Mobile.tap(findTestObject('MovieListing_sortings/movieListing_sortButton'), 0)

'Tap Title'
Mobile.tap(findTestObject('MovieListing_sortings/Title/sortBy -Title'), 0)

'Tap Accending button'
Mobile.tap(findTestObject('MovieListing_sortings/Title/sortBy - Title accending and decending button'), 0)

'Wait until page load'
Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

'Take Screenshot as Checkpoint'
Mobile.takeScreenshotAsCheckpoint('Sort Title accending', [])

'Tap Decending button'
Mobile.tap(findTestObject('MovieListing_sortings/Title/sortBy - Title accending and decending button'), 0)

'Wait until page load'
Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

'Take Screenshot as Checkpoint'
Mobile.takeScreenshotAsCheckpoint('Sort Title decending', [])

'Close Application'
Mobile.closeApplication()

