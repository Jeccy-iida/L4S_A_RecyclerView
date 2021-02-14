package app.iida.jessy.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val courseDate: List<CourseDate> = listOf(
        CourseDate(R.drawable.android,"Androidアプリプログラミングコース","色んなアプリを作って、プログラミングを楽しもう！"),
        CourseDate(R.drawable.iphone,"iPhoneアプリプログラミングコース","世界に一つだけのiPhoneアプリを作って、周りを驚かせよう！"),
        CourseDate(R.drawable.unity,"Unityゲームプログラミングコース","世界を動かすワクワクが止まらない！3Dゲームを制作しよう！"),
        CourseDate(R.drawable.minecraft,"Minecraftプログラミングコース","マインクラフトでJavaプログラミングを学ぼう！"),
        CourseDate(R.drawable.movie,"映像制作コース","オリジナの映像作品を作り出そう！"),
        CourseDate(R.drawable.animation,"アニメーションコース","描いたストーリーをアニメにしてみよう"),
        CourseDate(R.drawable.maya,"Maya 3DCGコース","君の想像を3Dで実現しよう！"),
        CourseDate(R.drawable.camera,"カメラ＆フォトグラフィーコース","みんなに一目置かれる写真作品を作れるようになろう！"),
        CourseDate(R.drawable.media_art,"メディアアートプログラミングコース","映像とプログラミングの融合！メディアアートの世界へ！"),
        CourseDate(R.drawable.designer,"デザイナーコース","描いたイメージをカタチに出来る、一生使える力を身につけよう！"),
        CourseDate(R.drawable.web_design,"Webデザインコース","HTML5、CSS3、JavaScriptで動くオリジナルWebサイトを作ろう！"),
        CourseDate(R.drawable.web_service,"Webサービスプログラミングコース","インターネットの仕組みを学び、Webサービスをリリースしよう！"),
        CourseDate(R.drawable.digital_music,"デジタルミュージックコース","今日から君はミュージシャン！その直感を音楽に変えよう！"),
        CourseDate(R.drawable.miku,"初音ミク V3コース","初音ミクにメロディを歌わせよう！"),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = RecyclerViewAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        adapter.addALL(courseDate)
    }
}