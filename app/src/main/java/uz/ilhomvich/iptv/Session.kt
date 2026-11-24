package uz.ilhomvich.iptv

import android.content.Context

/** Faqat server tanlovini saqlaydi (stream2 / stream8). */
object Session {
    private fun p(c: Context) = c.applicationContext.getSharedPreferences("settings", Context.MODE_PRIVATE)
    fun server(c: Context): String = p(c).getString("server", "stream2") ?: "stream2"
    fun setServer(c: Context, s: String) {
        p(c).edit().putString("server", s).apply()
    }
}
