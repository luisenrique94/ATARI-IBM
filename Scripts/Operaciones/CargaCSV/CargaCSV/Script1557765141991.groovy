import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://atarifrontibm.chazki.com/#/login')

WebUI.maximizeWindow()

WebUI.clearText(findTestObject('LOGIN/Usuario'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('LOGIN/Usuario'), 'chazki_peru')

WebUI.sendKeys(findTestObject('LOGIN/Contrasena'), 'hviveso02')

WebUI.click(findTestObject('LOGIN/Ingresar'))

WebUI.click(findTestObject('MENU/ExpandirMenu'))

WebUI.delay(3)

WebUI.click(findTestObject('MENU/Opciones/Operaciones/Operaciones'))

WebUI.click(findTestObject('MENU/Opciones/Operaciones/CargarCSV/CargarCSV'))

WebUI.delay(10)

WebUI.click(findTestObject('MENU/Opciones/Operaciones/CargarCSV/NuevoCSV/BotonNuevo'))

WebUI.delay(3)

WebUI.click(findTestObject('MENU/Opciones/Operaciones/CargarCSV/NuevoCSV/SocioNegocio'))

WebUI.sendKeys(findTestObject('MENU/Opciones/Operaciones/CargarCSV/NuevoCSV/NombreSocioNegocio'), 'Empresa Prueba')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('MENU/Opciones/Operaciones/CargarCSV/NuevoCSV/NombreSocioNegocio'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('MENU/Opciones/Operaciones/CargarCSV/NuevoCSV/Almacen'))

WebUI.sendKeys(findTestObject('MENU/Opciones/Operaciones/CargarCSV/NuevoCSV/NombreAlmacen'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ARROW_DOWN, Keys.ENTER))

WebUI.uploadFile(findTestObject('MENU/Opciones/Operaciones/CargarCSV/NuevoCSV/SubirCSV'), 'C:\\Users\\Administrator\\Desktop\\pruebas ibm\\Empresa_Prueba_Lunes_2.csv')

WebUI.delay(3)

WebUI.click(findTestObject('MENU/Opciones/Operaciones/CargarCSV/NuevoCSV/SubirCSV'))

