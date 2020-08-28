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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('/Users/happyfresh/Downloads/NiceDay_1.3.1.apk', false)

Mobile.waitForElementPresent(findTestObject('Object Repository/NiceDay/Create new Account'), 10)

Mobile.tap(findTestObject('Object Repository/NiceDay/Create new Account'), 0)

Mobile.setText(findTestObject('NiceDay/First Name'), 'Irkham', 0)

Mobile.setText(findTestObject('Object Repository/NiceDay/Last Name'), 'Agung', 0)

Mobile.setText(findTestObject('Object Repository/NiceDay/Email Address'), 'irkhamtest11@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/NiceDay/Password'), 'Testing@123', 0)

Mobile.tap(findTestObject('Object Repository/NiceDay/Terms'), 0)

Mobile.tap(findTestObject('Object Repository/NiceDay/Privacy'), 0)

Mobile.tap(findTestObject('Object Repository/NiceDay/16 Years'), 0)

Mobile.tap(findTestObject('Object Repository/NiceDay/Register'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/NiceDay/Welcome to NiceDay'), 10)

Mobile.tap(findTestObject('Object Repository/NiceDay/Skip'), 0)

Mobile.tap(findTestObject('Object Repository/NiceDay/Next'), 0)

Mobile.tap(findTestObject('Object Repository/NiceDay/Done'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/NiceDay/Choose 3'), 10)

Mobile.tap(findTestObject('Object Repository/NiceDay/Choose 3'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/NiceDay/continue'), 10)

Mobile.tap(findTestObject('Object Repository/NiceDay/continue'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/NiceDay/Support'), 10)

Mobile.tap(findTestObject('Object Repository/NiceDay/Support'), 0)

Mobile.tap(findTestObject('Object Repository/NiceDay/Next'), 0)

Mobile.tap(findTestObject('Object Repository/NiceDay/Next'), 0)

Mobile.tap(findTestObject('Object Repository/NiceDay/Done'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/NiceDay/add'), 10)

Mobile.tap(findTestObject('Object Repository/NiceDay/add'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/NiceDay/Search for a professional'), 10)

Mobile.setText(findTestObject('NiceDay/Search for a professional'), 'Bahar Kurt', 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/NiceDay/Bahar'), 10)

Mobile.tap(findTestObject('Object Repository/NiceDay/Bahar'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Send Connection Request'), 10)

Mobile.tap(findTestObject('Object Repository/NiceDay/Send Connection Request'), 0)

Mobile.tap(findTestObject('Object Repository/NiceDay/Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/NiceDay/NO THANKS 2'), 0)

Mobile.verifyElementExist(findTestObject('NiceDay/Connection request has been sent'), 10, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

