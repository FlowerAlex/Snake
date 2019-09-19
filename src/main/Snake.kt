package main

import javax.swing.JFrame
import java.awt.EventQueue

class Snake :JFrame(){
    init {
        initUI()
    }

    private fun initUI() {
        add(Board())

        title = "main.Snake"

        isResizable = false
        pack()

        setLocationRelativeTo(null)
        defaultCloseOperation = EXIT_ON_CLOSE
    }

    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            EventQueue.invokeLater{
                val ex = Snake()
                ex.isVisible = true
            }
        }
    }
}
