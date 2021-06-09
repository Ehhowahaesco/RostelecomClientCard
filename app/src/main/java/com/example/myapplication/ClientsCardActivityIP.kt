package com.example.myapplication

import android.annotation.SuppressLint
import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.KeyEvent
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import java.io.IOException

private const val REQUEST_CODE = 42
class ClientsCardActivityIP : AppCompatActivity() {
//    lateinit var  imageView : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clientscard_ip)
        var nameIP =  findViewById<EditText>(R.id.name_ip)
        var nameDirector = findViewById<EditText>(R.id.based_ip )
        var inn =  findViewById<EditText>(R.id.legal_address_ip)
        var ogrnip = findViewById<EditText>(R.id.mail_address_ip)
        var legalAddress = findViewById<EditText>(R.id.delivery_method_PRD_ip)
        var phone = findViewById<EditText>(R.id.INN_ip)
        var currentAccountNumber = findViewById<EditText>(R.id.KPP_ip)
        var nameOfBankInstitution = findViewById<EditText>(R.id.BIK_ip)
        var bankCorrespondentAccount = findViewById<EditText>(R.id.name_of_bank_institution_ip)
        var bik = findViewById<EditText>(R.id.R_S_ip)
        var contaktNumb = findViewById<EditText>(R.id.contact_number_ip)
        var emailIp = findViewById<EditText>(R.id.email_ip)
        var subscriberAddres = findViewById<EditText>(R.id.subscriber_address_ip)
        var technology = findViewById<EditText>(R.id.technology_ip)
        var technicalFeasibilityCheck = findViewById<EditText>(R.id.technical_feasibility_check_ip)
        var tariffPlan = findViewById<EditText>(R.id.tariff_plan_ip)
        var subscriberFee = findViewById<EditText>(R.id.subscriber_fee_ip)
        var equipment = findViewById<EditText>(R.id.equipment_ip)
        var modelSn = findViewById<EditText>(R.id.model_SN_ip)
        var additionalServices = findViewById<EditText>(R.id.additional_services_ip)
        var dateInstal = findViewById<EditText>(R.id.date_instal_ip)
        var additionalInfo = findViewById<EditText>(R.id.additional_info_ip)
        var manager = findViewById<EditText>(R.id.manager_ip)
        var curator = findViewById<EditText>(R.id.curator_ip)
       // imageView = findViewById<ImageView>(R.id.email_IP)

        findViewById<Button>(R.id.send_email_btn).setOnClickListener {
            try {
                sendEmail("Наименование предприятия:  " + nameIP.text + "\n"
                        + "\n"
                        + "Директор  :  " + nameDirector.text + "\n"
                        + "\n"
                        + "ИНН  :  " + inn.text + "\n"
                        + "\n"
                        + "ОГРНИП:  " + ogrnip.text + "\n"
                        + "\n"
                        + "Юридический адрес:  " + legalAddress.text + "\n"
                        + "\n"
                        + "Телефон:  " + phone.text + "\n"
                        + "\n"
                        + "Номер расчетного счета:  " + currentAccountNumber.text + "\n"
                        + "\n"
                        + "Наименование учреждения банка:  " + nameOfBankInstitution.text + "\n"
                        + "\n"
                        + "Корреспондентский счет банка:  " + bankCorrespondentAccount.text + "\n"
                        + "\n"
                        + "БИК:  " + bik.text + "\n"
                        + "\n"
                        + "Email:  " + emailIp.text + "\n"
                        + "\n"
                        + "Адрес установки абонентского оборудования:  " + subscriberAddres.text + "\n"
                        + "\n"
                        + "Технология подключения:  " + technology.text + "\n"
                        + "\n"
                        + "Проверка тех. возможности:  " + technicalFeasibilityCheck.text + "\n"
                        + "\n"
                        + "Тарифный план:  " + tariffPlan.text + "\n"
                        + "\n"
                        + "Абонентская плата по тп:  " + subscriberFee.text + "\n"
                        + "\n"
                        + "Оборудование:  " + equipment.text + "\n"
                        + "\n"
                        + "Модель/ сер. номер:  " + modelSn.text + "\n"
                        + "\n"
                        + "Доп. услуги:  " + additionalServices.text + "\n"
                        + "\n"
                        + "Дата инсталяции:  " + dateInstal.text + "\n"
                        + "\n"
                        + "Дополнительная информация:  " + additionalInfo.text + "\n"
                        + "\n"
                        + "Менеджер:  " + manager.text + "\n"
                        + "\n"
                        + "Куратор:  " + curator.text + "\n"
                )
            } catch (e : IOException){
                Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
            }
        }

    }


    private fun sendEmail( message: String) {
        /*ACTION_SEND action to launch an email client installed on your Android device.*/
        val mIntent = Intent(Intent.ACTION_SEND_MULTIPLE)
        /*To send an email you need to specify mailto: as URI using setData() method
        and data type will be to text/plain using setType() method*/
        mIntent.data = Uri.parse("mailto:")
        mIntent.type = "text/plain"
        // put recipient email in intent
        /* recipient is put as array because you may wanna send email to multiple emails
           so enter comma(,) separated emails, it will be stored in array*/
        mIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("vdolgyshev@gmail.com"))
        //put the Subject in the intent
        mIntent.putExtra(Intent.EXTRA_SUBJECT, "Карточка клиента ИП")
        //put the message in the intent
        mIntent.putExtra(Intent.EXTRA_TEXT, message)

        try {
            //start email intent
            startActivity(Intent.createChooser(mIntent, "Choose Email Client..."))
        }
        catch (e: Exception){
            //if any thing goes wrong for example no email client application or any exception
            //get and show exception message
            Toast.makeText(this, e.message, Toast.LENGTH_LONG).show()
        }

    }

}