package com.dm.tutorialactionbartoolbar2

import android.os.Bundle
import android.view.Menu                        //Importazione della Classe: Menu
import android.view.MenuItem                    //Importazione della Classe: MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    //dichiarazione della variabile ti tipo Menu
    private var myiconmenu: Menu? = null
    //dichiarazione variabile di tipo Boolean
    //per verificare lo stato del pulsante in ActionBar
    private var stateicon: Boolean? = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Popola il menu; questo aggiunge elementi alla barra delle azioni se è presente.
        menuInflater.inflate(R.menu.menu, menu)
        //assegnazione del menu alla variabile myiconmenu
        //all'interno della funzione onCreateOptionsMenu
        this.myiconmenu = menu

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //  Gestisci i clic degli elementi della barra delle azioni qui.
        when (item.itemId) {
            R.id.action_one -> {
                //se lo stato del pulsante è falso cambia icona ed imposta lo stato pulsante a vero
                if(stateicon == false) {
                    //questo è per poter modificare l'icona
                    myiconmenu!!.getItem(0).setIcon(R.drawable.ic_fav_on)
                    //altro codice che viene eseguito
                    stateicon = true
                    Toast.makeText(this, "Aggiunto ai preferiti", Toast.LENGTH_LONG).show()
                }
                //se lo stato del pulsante è vero cambia icona ed imposta lo stato pulsante a falso
                else
                {
                    //questo è per poter modificare l'icona
                    myiconmenu!!.getItem(0).setIcon(R.drawable.ic_fav_off)
                    //altro codice che viene eseguito
                    stateicon = false
                    Toast.makeText(this, "Rimosso dai preferiti", Toast.LENGTH_LONG).show()
                }

            }
            R.id.action_two -> {
                Toast.makeText(this, "Elemento 2 premuto", Toast.LENGTH_LONG).show()
            }
            R.id.action_three -> {
                Toast.makeText(this, "Elemento 3 premuto", Toast.LENGTH_LONG).show()
            }
            else -> super.onOptionsItemSelected(item)
        }
        return true
    }
}
