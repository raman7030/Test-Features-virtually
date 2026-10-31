package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.m.u0.c;
import com.alipay.sdk.m.y.o;
import com.umeng.analytics.pro.d;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ᩴ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C19044 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C19044 f59979;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean f59980;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7339 f59981;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static synchronized C19044 m43896(Context context) {
        C22927.m51024(context.getApplicationContext());
        C9145.m23518("openSDK_LOG.Tencent", "createInstance()  -- start, appId = 101492915");
        if (TextUtils.isEmpty("101492915")) {
            C9145.m23516("openSDK_LOG.Tencent", "appId should not be empty!");
            return null;
        }
        C19044 c19044 = f59979;
        if (c19044 == null) {
            f59979 = new C19044(context);
        } else {
            c19044.f59981.m19707().getClass();
            C9145.m23518("openSDK_LOG.Tencent", "getAppId() appid =101492915");
            C11778.m28815().m28820("getAppId", "", "101492915");
        }
        if (!m43895(context)) {
            return null;
        }
        m43894("createInstance", c.d, "101492915");
        C20245.m46489().m46493(C23255.m51569(context, "101492915"));
        C9145.m23518("openSDK_LOG.Tencent", "createInstance()  -- end");
        return f59979;
    }

    public C19044(Context context) {
        this.f59981 = C7339.m19705(context);
        C11778.m28815().m28818(context);
        C10556.m26534().m26536(context);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m43898() {
        C9145.m23518("openSDK_LOG.Tencent", "setIsPermissionGranted, isPermissionGranted: true");
        C10556.m26534().m26536(C22927.m51019());
        String strM26538 = C10556.m26534().m26538();
        if (strM26538 == null || strM26538.isEmpty()) {
            strM26538 = Build.MODEL;
        }
        C9145.m23518("openSDK_LOG.Tencent", "setIsPermissionGranted, isPermissionGranted: true, model = " + strM26538);
        if (strM26538 == null || strM26538.trim().isEmpty()) {
            C9145.m23516("openSDK_LOG.Tencent", "setIsPermissionGranted error! model= [" + strM26538 + "]");
            strM26538 = "unknown";
        }
        f59980 = true;
        C10556.m26534().m26537(C22927.m51019(), strM26538);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m43897() {
        return !f59980 || TextUtils.isEmpty(C10556.m26534().m26538());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m43895(Context context) {
        try {
            context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.tauth.AuthActivity"), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            C9145.m23516("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.tauth.AuthActivity没有在AndroidManifest.xml中检测到com.tencent.tauth.AuthActivity,请加上com.tencent.tauth.AuthActivity,并配置<data android:scheme=\"tencent101492915\" />,详细信息请查看官网文档.\n配置示例如下: \n<activity\n     android:name=\"com.tencent.tauth.AuthActivity\"\n     android:noHistory=\"true\"\n     android:launchMode=\"singleTask\">\n<intent-filter>\n    <action android:name=\"android.intent.action.VIEW\" />\n    <category android:name=\"android.intent.category.DEFAULT\" />\n    <category android:name=\"android.intent.category.BROWSABLE\" />\n    <data android:scheme=\"tencent101492915\" />\n</intent-filter>\n</activity>");
            return false;
        } catch (Throwable th) {
            C9145.m23514("openSDK_LOG.Tencent", "checkManifestConfig exception", th);
        }
        try {
            context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.connect.common.AssistActivity"), 128);
            return true;
        } catch (PackageManager.NameNotFoundException unused2) {
            C9145.m23516("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.connect.common.AssistActivity\n没有在AndroidManifest.xml中检测到com.tencent.connect.common.AssistActivity,请加上com.tencent.connect.common.AssistActivity,详细信息请查看官网文档.\n配置示例如下: \n<activity\n     android:name=\"com.tencent.connect.common.AssistActivity\"\n     android:screenOrientation=\"behind\"\n     android:theme=\"@android:style/Theme.Translucent.NoTitleBar\"\n     android:configChanges=\"orientation|keyboardHidden\">\n</activity>");
            return false;
        } catch (Throwable th2) {
            C9145.m23514("openSDK_LOG.Tencent", "checkManifestConfig exception", th2);
            return true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43899(AbstractActivityC3346 abstractActivityC3346, InterfaceC4227 interfaceC4227) {
        C9145.m23518("openSDK_LOG.Tencent", "login() with activity, scope is get_simple_userinfo");
        m43894("login_scope", "scope", "get_simple_userinfo");
        this.f59981.m19706(abstractActivityC3346, interfaceC4227);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43901() {
        C9145.m23518("openSDK_LOG.Tencent", "logout()");
        m43894("logout", new Object[0]);
        C7339 c7339 = this.f59981;
        c7339.m19707().m48594((String) null, "0");
        c7339.m19707().m48593((String) null);
        C21451 c21451M19707 = c7339.m19707();
        c7339.m19707().getClass();
        c21451M19707.getClass();
        C21451.m48590("101492915");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43893(int i, int i2, Intent intent, InterfaceC4227 interfaceC4227) {
        StringBuilder sbM46682 = C20361.m46682("onActivityResultData() reqcode = ", i, ", resultcode = ", ", data = null ? ", i2);
        sbM46682.append(intent == null);
        sbM46682.append(", listener = null ? ");
        sbM46682.append(interfaceC4227 == null);
        C9145.m23518("openSDK_LOG.Tencent", sbM46682.toString());
        m43894("onActivityResultData", "requestCode", Integer.valueOf(i), "resultCode", Integer.valueOf(i2));
        C8956 c8956M23090 = C8956.m23090();
        c8956M23090.getClass();
        C9145.m23518("openSDK_LOG.UIListenerManager", "onActivityResult req=" + i + " res=" + i2);
        InterfaceC4227 interfaceC4227M23092 = c8956M23090.m23092(i);
        if (interfaceC4227M23092 != null) {
            interfaceC4227 = interfaceC4227M23092;
        } else if (interfaceC4227 == null) {
            C9145.m23516("openSDK_LOG.UIListenerManager", "onActivityResult can't find the listener");
            return;
        } else if (i == 11101) {
            C9145.m23516("openSDK_LOG.UIListenerManager", "登录的接口回调不能重新构建，暂时无法提供，先记录下来这种情况是否存在");
        } else if (i == 11105) {
            C9145.m23516("openSDK_LOG.UIListenerManager", "Social Api 的接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
        } else if (i == 11106) {
            C9145.m23516("openSDK_LOG.UIListenerManager", "Social Api 的H5接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
        }
        if (i2 != -1) {
            interfaceC4227.mo3453();
            return;
        }
        if (intent == null) {
            interfaceC4227.mo3454(new C19750(-6, "onActivityResult intent data is null.", "onActivityResult intent data is null."));
            return;
        }
        String stringExtra = intent.getStringExtra("key_action");
        if ("action_login".equals(stringExtra)) {
            if (intent.getBooleanExtra("key_auth_ignore_on_activity_result", false)) {
                C9145.m23518("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, ignoreOnActivityResult");
                return;
            }
            int intExtra = intent.getIntExtra("key_error_code", 0);
            if (intExtra != 0) {
                C9145.m23516("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onError = " + intExtra);
                interfaceC4227.mo3454(new C19750(intExtra, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail")));
                return;
            }
            String stringExtra2 = intent.getStringExtra("key_response");
            if (stringExtra2 == null) {
                C9145.m23513("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onComplete");
                interfaceC4227.mo3454(new C19750(-4, "服务器返回数据格式有误!", "response is null"));
                return;
            }
            try {
                interfaceC4227.mo3455(C18338.m42748(stringExtra2));
                return;
            } catch (JSONException e) {
                interfaceC4227.mo3454(new C19750(-4, "服务器返回数据格式有误!", stringExtra2));
                C9145.m23514("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, json error", e);
                return;
            }
        }
        if ("action_share".equals(stringExtra) || "action_request_avatar".equals(stringExtra) || "action_request_dynamic_avatar".equals(stringExtra) || "action_request_set_emotion".equals(stringExtra) || "guildOpen".equals(stringExtra)) {
            String stringExtra3 = intent.getStringExtra(o.c);
            String stringExtra4 = intent.getStringExtra("response");
            if ("cancel".equals(stringExtra3)) {
                interfaceC4227.mo3453();
                return;
            }
            if (d.O.equals(stringExtra3)) {
                interfaceC4227.mo3454(new C19750(-6, "unknown error", C16014.m37867(stringExtra4, "")));
                return;
            }
            if ("complete".equals(stringExtra3)) {
                try {
                    interfaceC4227.mo3455(new JSONObject(stringExtra4 == null ? "{\"ret\": 0}" : stringExtra4));
                    return;
                } catch (JSONException e2) {
                    C9145.m23514("openSDK_LOG.UIListenerManager", "JSONException", e2);
                    interfaceC4227.mo3454(new C19750(-4, "json error", C16014.m37867(stringExtra4, "")));
                    return;
                }
            }
            return;
        }
        if (!"action_common_channel".equals(stringExtra)) {
            int intExtra2 = intent.getIntExtra("key_error_code", 0);
            if (intExtra2 != 0) {
                interfaceC4227.mo3454(new C19750(intExtra2, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail")));
                return;
            }
            String stringExtra5 = intent.getStringExtra("key_response");
            if (stringExtra5 == null) {
                interfaceC4227.mo3455(new JSONObject());
                return;
            }
            try {
                interfaceC4227.mo3455(C18338.m42748(stringExtra5));
                return;
            } catch (JSONException unused) {
                interfaceC4227.mo3454(new C19750(-4, "服务器返回数据格式有误!", stringExtra5));
                return;
            }
        }
        int intExtra3 = intent.getIntExtra("key_error_code", 0);
        if (intExtra3 != 0) {
            interfaceC4227.mo3454(new C19750(intExtra3, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail")));
            return;
        }
        String stringExtra6 = intent.getStringExtra("response");
        if (stringExtra6 == null) {
            interfaceC4227.mo3455(new JSONObject());
            return;
        }
        try {
            String stringExtra7 = intent.getStringExtra("message");
            JSONObject jSONObjectM42748 = C18338.m42748(stringExtra6);
            jSONObjectM42748.put("message", stringExtra7);
            interfaceC4227.mo3455(jSONObjectM42748);
        } catch (JSONException unused2) {
            interfaceC4227.mo3454(new C19750(-4, "服务器返回数据格式有误!", stringExtra6));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m43900() {
        boolean zM19708 = this.f59981.m19708();
        C9145.m23518("openSDK_LOG.Tencent", "isSessionValid() isvalid =" + zM19708);
        C11778.m28815().m28820("isSessionValid", "", Boolean.valueOf(zM19708));
        return zM19708;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43894(String str, Object... objArr) {
        String string;
        if (objArr.length != 0 && objArr.length % 2 == 0) {
            StringBuilder sb = new StringBuilder();
            int length = objArr.length;
            for (int i = 0; i < length; i += 2) {
                if (i > 0) {
                    sb.append('|');
                }
                sb.append(objArr[i]);
                sb.append(':');
                sb.append(objArr[i + 1]);
            }
            string = sb.toString();
        } else {
            string = "";
        }
        C11778.m28815().m28820(str, string, "");
    }
}
