package dk.myapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var tot :Double=0.0
    var cur:Double=0.0
    var cut:Double=0.0
    var per:Double=0.0
    var temp:Double=0.0
    var res:Double=0.0
    var perc:Int=0

    fun okButtonClick(view: View){
        tot=totvalue.text.toString().toDouble()
        cur=curvalue.text.toString().toDouble()
        cut=bunkvalue.text.toString().toDouble()
        temp=tot+cut
        res=cur/temp
        per=res*100
        perc=per.toInt()
        result.setText(perc.toString())
    }

}
