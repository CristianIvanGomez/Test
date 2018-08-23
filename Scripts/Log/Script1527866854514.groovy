import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword as Keyword
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://ec2-184-72-193-34.compute-1.amazonaws.com:3003/lms/admin#/')

WebUI.setText(findTestObject('Page_CAT Videos  Admin/Proulex_email'), 'admin1@yopmail.com')

WebUI.setText(findTestObject('Proulex_password'), 'admin9010')

WebUI.click(findTestObject('Proulex_Iniciar Sesin'))

WebUI.click(findTestObject('Page_CAT Videos  Admin/Proulex_Configuracin'))

WebUI.click(findTestObject('Page_CAT Videos  Admin/Proulex_Idiomas'))

WebUI.click(findTestObject('Page_CAT Videos  Admin/ProulexIdioma_Agregar'))

WebUI.click(findTestObject('select_Activo    Inactivo (1)'))

