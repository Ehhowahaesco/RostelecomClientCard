package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.File
import java.io.IOException
import java.io.PrintWriter


class ClientsCardActivityOOO : AppCompatActivity() {
    lateinit var sendEmail: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ooo)
        var fullNameOOO = findViewById<EditText>(R.id.full_name_ooo)
        var abbreviatedNameOOO = findViewById<EditText>(R.id.abbreviated_name_ooo)
        var basedOOO = findViewById<EditText>(R.id.based_ooo)
        var legalAddressOOO = findViewById<EditText>(R.id.legal_address_ooo)
        var mailAddressOOO = findViewById<EditText>(R.id.mail_address_ooo)
        var deliveryMethodOOO = findViewById<EditText>(R.id.delivery_method_PRD_ooo)
        var innOOO = findViewById<EditText>(R.id.INN_ooo)
        var kppOOO = findViewById<EditText>(R.id.KPP_ooo)
        var bikOOO = findViewById<EditText>(R.id.BIK_ooo)
        var nameOfBankOOO = findViewById<EditText>(R.id.name_of_the_bank_ooo)
        var pcOOO = findViewById<EditText>(R.id.P_C_ooo)
        var contactPhoneOOO = findViewById<EditText>(R.id.contact_phone_ooo)
        var subscriberAddressOOO = findViewById<EditText>(R.id.subscriber_address_ooo)
        var technologyOOO = findViewById<EditText>(R.id.technology_ooo)
        var technicalFeasibilityCheckOOO = findViewById<EditText>(R.id.technical_feasibility_check_ooo)
        var tariffPlanOOO = findViewById<EditText>(R.id.tariff_plan_ooo)
        var subscriptionFeeTPOOO = findViewById<EditText>(R.id.subscription_fee_TP_ooo)
        var equipmentOOO = findViewById<EditText>(R.id.equipment_ooo)
        var modelSNOOO = findViewById<EditText>(R.id.model_SN_ooo)
        var additionalServicesOOO = findViewById<EditText>(R.id.additional_services_ooo)
        var dateInstalOOO = findViewById<EditText>(R.id.date_instal_ooo)
        var additionalInfoOOO = findViewById<EditText>(R.id.additional_info_ooo)
        var mangerOOO = findViewById<EditText>(R.id.manager_ooo)

        sendEmail = findViewById(R.id.send_email_btn_ooo)

       findViewById<Button>(R.id.send_email_btn_ooo).setOnClickListener {

            try {
                sendEmail("Наименование клиента:  " + fullNameOOO.text + "\n"
                        + "В лице:  " + abbreviatedNameOOO.text + "\n"
                        + "На основании:  " + basedOOO.text + "\n"
                        + "Юридический адрес:  " + legalAddressOOO.text + "\n"
                        + "Почтовый адрес:  " + mailAddressOOO.text + "\n"
                        + "Способ доставки ПРД" + deliveryMethodOOO.text + "\n"
                        + "ИНН:  " + innOOO.text + "\n"
                        + "КПП:  " + kppOOO.text + "\n"
                        + "БИК:  " + bikOOO.text + "\n"
                        + "Наименование банка:  " + nameOfBankOOO.text + "\n"
                        + "Адрес установки абонентского оборудования" + subscriberAddressOOO.text + "\n"
                        + "\n"
                        + "Технология подключения  " + technologyOOO.text + "\n"
                        + "\n"
                        + "ПРоверка тех. возможности:  " + technicalFeasibilityCheckOOO.text + "\n"
                        + "\n"
                        + "Тарифный план:  " + tariffPlanOOO.text + "\n"
                        + "\n"
                        + "Абонетская плата по ТП:  " + subscriptionFeeTPOOO.text + "\n"
                        + "\n"
                        + "Оборудование:  " + equipmentOOO.text + "\n"
                        + "\n"
                        + "Модель/ сер.номер:  " + modelSNOOO.text + "\n"
                        + "\n"
                        + "Доп. Услуги:  " + additionalServicesOOO.text + "\n"
                        + "\n"
                        + "Дата инсталяции:  " + dateInstalOOO .text + "\n"
                        + "\n"
                        + "Доп. информация:  " + additionalInfoOOO.text + "\n"
                        + "\n"
                        + "Менеджер:  " + mangerOOO.text + "\n"
                        + "\n"
                )
            } catch (e: IOException) {
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
        mIntent.putExtra(Intent.EXTRA_SUBJECT, "Карточка клиента OOO")
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
