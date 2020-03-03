package br.com.vitor.demopersistencia.sharepreferences

import android.content.Context

class SharedPreferencesUtils(context: Context) {
    val sharedPreferences = context.getSharedPreferences("MEU_APP", Context.MODE_PRIVATE)

    fun save(key: String, value: String) {
        sharedPreferences.edit()
            .putString(key,value)
            .apply()
    }

    fun get(key: String): String? = sharedPreferences.getString(key, null)

    fun deleteAll()= sharedPreferences.edit().clear()

    fun delete(key: String)=sharedPreferences.edit().remove(key).apply()

}