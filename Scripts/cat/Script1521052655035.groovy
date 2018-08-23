import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.annotation.Keyword as Keyword

//def info = WebUI.callTestCase(findTestCase('New Test Case'), [:], FailureHandling.STOP_ON_FAILURE)
def info = WebUI.callTestCase(findTestCase('Log'), [:], FailureHandling.STOP_ON_FAILURE)
def videos = info.video

/*WebUI.openBrowser('')

WebUI.navigateToUrl('http://app.staging.catvideoslive.com.s3-website-us-east-1.amazonaws.com/auth/users/signin')

WebUI.setText(findTestObject('Page_CAT Videos  Admin/input_login (2)'), 'administrator@email.com')

WebUI.setText(findTestObject('Page_CAT Videos  Admin/input_password (3)'), 'admin9010')

WebUI.click(findTestObject('Page_CAT Videos  Admin/button_Log in (2)'))*/

WebUI.click(findTestObject('Page_CAT Videos  Admin/i_fa fa-plus-circle'))

//Thread.sleep(5000)
WebUI.setText(findTestObject('Page_CAT Videos  Admin/namevideo'), 'this-is-automatedvideo')

//Thread.sleep(5000)
WebUI.setText(findTestObject('Page_CAT Videos  Admin/descriptionvideo'), 'this-is-automatedvideo')

//Thread.sleep(5000)
WebUI.click(findTestObject('Page_CAT Videos  Admin/Channel'))

//Thread.sleep(5000)
WebUI.click(findTestObject('Page_CAT Videos  Admin/canalchannel'))

CustomKeywords.'tools.uploadFiles.uploadFiles.uploadFile'(findTestObject("Upload"), 'Gato.jpg')

//Thread.sleep(5000)
Thread.sleep(10000)

WebUI.click(findTestObject('Page_CAT Videos  Admin/Createvideo'))

Thread.sleep(5000)

WebUI.closeBrowser()



