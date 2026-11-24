package uz.ilhomvich.iptv

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/** Yordam / Haqida sahifalari. */
class PageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page)
        val title = findViewById<TextView>(R.id.tvPageTitle)
        val body = findViewById<TextView>(R.id.tvBody)
        val box = findViewById<LinearLayout>(R.id.buttons)
        findViewById<Button>(R.id.btnClose).setOnClickListener { finish() }

        fun addButton(text: String, onClick: () -> Unit) {
            val b = Button(this)
            b.text = text
            b.setOnClickListener { onClick() }
            box.addView(b, LinearLayout.LayoutParams(-1, -2))
        }
        fun openTelegram() =
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/ilhomvich_sh")))

        when (intent.getStringExtra("page")) {
            "help" -> {
                title.text = "Yordam"
                body.text = "• Kanalni tanlang va PLAY bosing.\n" +
                    "• Kanal ishlamasa, boshqa serverni (stream2 / stream8) tanlang.\n" +
                    "• Player ichida PiP tugmasi — rasm ustida rasm rejimi.\n" +
                    "• TV pultida: CH+/CH- yoki PageUp/PageDown kanalni almashtiradi.\n" +
                    "• Aloqa: t.me/ilhomvich_sh"
                addButton("Telegram: @ilhomvich_sh") { openTelegram() }
            }
            else -> {
                title.text = "Haqida"
                body.text = "IPTV Player v${BuildConfig.VERSION_NAME}\n\n" +
                    "by Shakhzodjon Khudaybediyev\n\n" +
                    "Ochiq manbali (open source) ilova."
                addButton("Telegram: @ilhomvich_sh") { openTelegram() }
            }
        }
    }
}
