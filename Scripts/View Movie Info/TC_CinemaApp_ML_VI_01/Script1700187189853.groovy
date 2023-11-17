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

'View Movie Listings'
Mobile.startApplication('C:\\Users\\REG-LPT-173\\Downloads\\movie-app-release\\movie-app-release.apk', true)

'Tap the first movie in the listing'
Mobile.tap(findTestObject('View Movie Info/First movie container'), 0)

'Wait until page load'
Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Take Screenshot as Checkpoint'
Mobile.takeScreenshotAsCheckpoint('View Movie Info', FailureHandling.STOP_ON_FAILURE)

'Tap Back button'
Mobile.tap(findTestObject('View Movie Info/Click Back button'), 0)

'Tap the third movie in the listing'
Mobile.tap(findTestObject('View Movie Info/Third movie container'), 0)

'Wait until page load'
Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Take Screenshot as Checkpoint'
Mobile.takeScreenshotAsCheckpoint('View Movie Info', FailureHandling.STOP_ON_FAILURE)

'Tap back button'
Mobile.tap(findTestObject('View Movie Info/Click Back button'), 0)

'Tap the fifth movie in the listing'
Mobile.tap(findTestObject('View Movie Info/Fifth movie container'), 0)

'Wait until page load'
Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Take Screenshot as Checkpoint'
Mobile.takeScreenshotAsCheckpoint('View Movie Info', FailureHandling.STOP_ON_FAILURE)

'Click back button'
Mobile.tap(findTestObject('View Movie Info/Click Back button'), 0)

'Tap the seventh movie in the listing'
Mobile.tap(findTestObject('View Movie Info/Seventh movie container'), 0)

'Wait until page load'
Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Take Screenshot as Checkpoint'
Mobile.takeScreenshotAsCheckpoint('View Movie Info', FailureHandling.STOP_ON_FAILURE)

'Click back button'
Mobile.tap(findTestObject('View Movie Info/Click Back button'), 0)

'Tap the ninth movie in the listing'
Mobile.tap(findTestObject('View Movie Info/Ninth movie container'), 0)

'Wait until page load'
Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Take Screenshot as Checkpoint'
Mobile.takeScreenshotAsCheckpoint('View Movie Info', FailureHandling.STOP_ON_FAILURE)

'Click back button'
Mobile.tap(findTestObject('View Movie Info/Click Back button'), 0)

'Close Application'
Mobile.closeApplication()

