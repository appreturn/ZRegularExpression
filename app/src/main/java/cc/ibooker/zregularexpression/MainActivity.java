package cc.ibooker.zregularexpression;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import cc.ibooker.zregularexpressionlib.RegularExpressionUtil;
import cc.ibooker.zregularexpressionlib.ValidIDCard;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 验证邮箱
        boolean bool1 = RegularExpressionUtil.isEmail("182313*2505@qq.com");
        Log.d("Log111", bool1 + "");

        // 验证域名
        boolean bool2 = RegularExpressionUtil.isDomainName("g9)oogle.com");
        Log.d("Log1112", bool2 + "");

        // 验证Url
        boolean bool3 = RegularExpressionUtil.isInternetURL("Ahttp://github.com/a");
        Log.d("Log1113", bool3 + "");

        // 验证手机号
        boolean bool4 = RegularExpressionUtil.isPhone("11546285182");
        Log.d("Log1114", bool4 + "");

        // 验证固话
        boolean bool5 = RegularExpressionUtil.isMobile("03746-82198637");
        Log.d("Log1115", bool5 + "");

        // 验证姓名
        boolean bool6 = RegularExpressionUtil.isName("中");
        Log.d("Log1116", bool6 + "");

        // 验证账号
        boolean bool7 = RegularExpressionUtil.isAccount("us中erAs");
        Log.d("Log1117", bool7 + "");

        // 验证密码
        boolean bool8 = RegularExpressionUtil.isPassword("a15");
        Log.d("Log1118", bool8 + "");

        // 验证强密码
        boolean bool9 = RegularExpressionUtil.isStrongPassword("asasdAdaf");
        Log.d("Log1119", bool9 + "");

        // 验证日期格式
        boolean bool10 = RegularExpressionUtil.isDate("2017-9-101");
        Log.d("Log11110", bool10 + "");

        // 验证邮政编码
        boolean bool11 = RegularExpressionUtil.isZipCode("1234131");
        Log.d("Log11111", bool11 + "");

        // 验证QQ
        boolean bool12 = RegularExpressionUtil.isQq("1823");
        Log.d("Log11112", bool12 + "");

        // 验证IP
        boolean bool13 = RegularExpressionUtil.isIp("192.168.13");
        Log.d("Log11113", bool13 + "");

        // 验证中文
        boolean bool14 = RegularExpressionUtil.isChinese("中a文");
        Log.d("Log11114", bool14 + "");

        // 验证身份证，没有任何返回值的时候验证通过
        String error = ValidIDCard.iDCardValidate("456314651646455");
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();

        // 是否为数字
        boolean bool15 = RegularExpressionUtil.isNumeric("40610");
        Log.d("Log11115", bool15 + "");
    }
}
