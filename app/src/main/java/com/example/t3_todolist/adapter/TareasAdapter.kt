package com.example.t3_todolist.adapter

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.t3_todolist.R
import java.text.SimpleDateFormat
import java.util.*

class TareasAdapter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val titulo = intent.getStringExtra("titulo")
        val prioridad = intent.getStringExtra("prioridad")
        val fecha = Date(intent.getLongExtra("fecha", -1))
        val estado = intent.getStringExtra("estado")

        val fechaEnMilisegundos = intent.getLongExtra("fecha", -1)

        val fechaFormateada: String = if (fechaEnMilisegundos != -1L) {
            val fecha = Date(fechaEnMilisegundos)
            val formatoFecha = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
            formatoFecha.format(fecha)
        } else {
            "Sin fecha"
        }
        findViewById<TextView>(R.id.texto_titulo_detalle).text = titulo
        findViewById<TextView>(R.id.texto_prioridad_detalle).text = prioridad
        findViewById<TextView>(R.id.texto_estado_detalle).text = estado
        findViewById<TextView>(R.id.texto_fecha_detalle).text = fechaFormateada
    }
}