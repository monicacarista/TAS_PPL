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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://testingjarkom.000webhostapp.com/admin/login.php')

WebUI.setText(findTestObject('Page_Login/input_Login Akun_username (4)'), 'admin ')

WebUI.setEncryptedText(findTestObject('Page_Login/input_Login Akun_password (4)'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_Login/button_Login (4)'))

WebUI.navigateToUrl('https://testingjarkom.000webhostapp.com/admin/login.php')

tes = WebUI.getUrl()

if (tes == 'https://testingjarkom.000webhostapp.com/admin/dashboard.php') {
    WebUI.comment('berhasil loginnnn')
} else {
    WebUI.comment('gagal')
}

WebUI.click(findTestObject('Object Repository/Page_Sistem Antrian Disabilitas/a_Pasien'))

WebUI.click(findTestObject('Page_Sistem Antrian Disabilitas/a_Tambah (2)'))

WebUI.setText(findTestObject('Page_Sistem Antrian Disabilitas/input_Nama_name (3)'), nama)

WebUI.setText(findTestObject('Page_Sistem Antrian Disabilitas/input_Nomor Rekam Medis_medical_record_number (3)'), nomor_rekam_medis)

WebUI.setText(findTestObject('Page_Sistem Antrian Disabilitas/input_Nomor Telepon_phone_number (3)'), nomor_hp)

WebUI.click(findTestObject('Page_Sistem Antrian Disabilitas/input_Tanggal Lahir_dob (3)'))

WebUI.setText(findTestObject('Page_Sistem Antrian Disabilitas/textarea_Alamat_address (3)'), alamat)

WebUI.click(findTestObject('Page_Sistem Antrian Disabilitas/label_Disabilitas (3)'))

WebUI.click(findTestObject('Page_Sistem Antrian Disabilitas/button_Simpan (3)'))

WebUI.closeBrowser()

