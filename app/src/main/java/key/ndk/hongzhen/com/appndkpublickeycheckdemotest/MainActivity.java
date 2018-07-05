package key.ndk.hongzhen.com.appndkpublickeycheckdemotest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.hongzhen.publickeychecklibrary.CheckUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String key = CheckUtils.getKey(this);
        Log.i("Main:",key);
        //下方是获取验证数据的方法，与so中的方法是对应的。这个方法验证的整个签名信息的，包含公钥。不是对公钥的简单验证。
        /*try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), PackageManager.GET_SIGNATURES);
            Signature[] signs = packageInfo.signatures;
            Signature sign = signs[0];
            String s = sign.toCharsString();
            Log.i("Main:",s);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }*/
    }
}
