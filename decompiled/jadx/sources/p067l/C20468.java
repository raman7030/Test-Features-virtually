package p067l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p052u0.C0227c;
import com.alipay.sdk.p010m.p058y.C0252o;
import com.umeng.analytics.pro.C0708d;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ᩴ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C20468 {

    /* JADX INFO: renamed from: ۧ */
    public static C20468 f63208;

    /* JADX INFO: renamed from: ܽ */
    public static boolean f63209;

    /* JADX INFO: renamed from: ֫ */
    public final C9343 f63210;

    /* JADX INFO: renamed from: ۧ */
    public static synchronized C20468 m46165(Context context) {
        C24158.m53415(context.getApplicationContext());
        C11060.m25469("openSDK_LOG.Tencent", "createInstance()  -- start, appId = 101492915");
        if (TextUtils.isEmpty("101492915")) {
            C11060.m25467("openSDK_LOG.Tencent", "appId should not be empty!");
            return null;
        }
        C20468 c20468 = f63208;
        if (c20468 == null) {
            f63208 = new C20468(context);
        } else {
            c20468.f63210.m21680().getClass();
            C11060.m25469("openSDK_LOG.Tencent", "getAppId() appid =101492915");
            C13562.m30863().m30868("getAppId", "", "101492915");
        }
        if (!m46164(context)) {
            return null;
        }
        m46163("createInstance", C0227c.f1027d, "101492915");
        C21609.m48810().m48814(C24470.m53965(context, "101492915"));
        C11060.m25469("openSDK_LOG.Tencent", "createInstance()  -- end");
        return f63208;
    }

    public C20468(Context context) {
        this.f63210 = C9343.m21678(context);
        C13562.m30863().m30866(context);
        C12401.m28567().m28569(context);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m46167() {
        C11060.m25469("openSDK_LOG.Tencent", "setIsPermissionGranted, isPermissionGranted: true");
        C12401.m28567().m28569(C24158.m53410());
        String strM28571 = C12401.m28567().m28571();
        if (strM28571 == null || strM28571.isEmpty()) {
            strM28571 = Build.MODEL;
        }
        C11060.m25469("openSDK_LOG.Tencent", "setIsPermissionGranted, isPermissionGranted: true, model = " + strM28571);
        if (strM28571 == null || strM28571.trim().isEmpty()) {
            C11060.m25467("openSDK_LOG.Tencent", "setIsPermissionGranted error! model= [" + strM28571 + "]");
            strM28571 = "unknown";
        }
        f63209 = true;
        C12401.m28567().m28570(C24158.m53410(), strM28571);
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m46166() {
        return !f63209 || TextUtils.isEmpty(C12401.m28567().m28571());
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m46164(Context context) {
        try {
            context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.tauth.AuthActivity"), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            C11060.m25467("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.tauth.AuthActivity没有在AndroidManifest.xml中检测到com.tencent.tauth.AuthActivity,请加上com.tencent.tauth.AuthActivity,并配置<data android:scheme=\"tencent101492915\" />,详细信息请查看官网文档.\n配置示例如下: \n<activity\n     android:name=\"com.tencent.tauth.AuthActivity\"\n     android:noHistory=\"true\"\n     android:launchMode=\"singleTask\">\n<intent-filter>\n    <action android:name=\"android.intent.action.VIEW\" />\n    <category android:name=\"android.intent.category.DEFAULT\" />\n    <category android:name=\"android.intent.category.BROWSABLE\" />\n    <data android:scheme=\"tencent101492915\" />\n</intent-filter>\n</activity>");
            return false;
        } catch (Throwable th) {
            C11060.m25465("openSDK_LOG.Tencent", "checkManifestConfig exception", th);
        }
        try {
            context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.connect.common.AssistActivity"), 128);
            return true;
        } catch (PackageManager.NameNotFoundException unused2) {
            C11060.m25467("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.connect.common.AssistActivity\n没有在AndroidManifest.xml中检测到com.tencent.connect.common.AssistActivity,请加上com.tencent.connect.common.AssistActivity,详细信息请查看官网文档.\n配置示例如下: \n<activity\n     android:name=\"com.tencent.connect.common.AssistActivity\"\n     android:screenOrientation=\"behind\"\n     android:theme=\"@android:style/Theme.Translucent.NoTitleBar\"\n     android:configChanges=\"orientation|keyboardHidden\">\n</activity>");
            return false;
        } catch (Throwable th2) {
            C11060.m25465("openSDK_LOG.Tencent", "checkManifestConfig exception", th2);
            return true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46168(AbstractActivityC5549 abstractActivityC5549, InterfaceC6386 interfaceC6386) {
        C11060.m25469("openSDK_LOG.Tencent", "login() with activity, scope is get_simple_userinfo");
        m46163("login_scope", "scope", "get_simple_userinfo");
        this.f63210.m21679(abstractActivityC5549, interfaceC6386);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46170() {
        C11060.m25469("openSDK_LOG.Tencent", "logout()");
        m46163("logout", new Object[0]);
        C9343 c9343 = this.f63210;
        c9343.m21680().m50931((String) null, "0");
        c9343.m21680().m50930((String) null);
        C22755 c22755M21680 = c9343.m21680();
        c9343.m21680().getClass();
        c22755M21680.getClass();
        C22755.m50927("101492915");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46162(int i, int i2, Intent intent, InterfaceC6386 interfaceC6386) {
        StringBuilder sbM49005 = C21720.m49005("onActivityResultData() reqcode = ", i, ", resultcode = ", ", data = null ? ", i2);
        sbM49005.append(intent == null);
        sbM49005.append(", listener = null ? ");
        sbM49005.append(interfaceC6386 == null);
        C11060.m25469("openSDK_LOG.Tencent", sbM49005.toString());
        m46163("onActivityResultData", "requestCode", Integer.valueOf(i), "resultCode", Integer.valueOf(i2));
        C10880 c10880M25064 = C10880.m25064();
        c10880M25064.getClass();
        C11060.m25469("openSDK_LOG.UIListenerManager", "onActivityResult req=" + i + " res=" + i2);
        InterfaceC6386 interfaceC6386M25066 = c10880M25064.m25066(i);
        if (interfaceC6386M25066 != null) {
            interfaceC6386 = interfaceC6386M25066;
        } else if (interfaceC6386 == null) {
            C11060.m25467("openSDK_LOG.UIListenerManager", "onActivityResult can't find the listener");
            return;
        } else if (i == 11101) {
            C11060.m25467("openSDK_LOG.UIListenerManager", "登录的接口回调不能重新构建，暂时无法提供，先记录下来这种情况是否存在");
        } else if (i == 11105) {
            C11060.m25467("openSDK_LOG.UIListenerManager", "Social Api 的接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
        } else if (i == 11106) {
            C11060.m25467("openSDK_LOG.UIListenerManager", "Social Api 的H5接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
        }
        if (i2 != -1) {
            interfaceC6386.mo5756();
            return;
        }
        if (intent == null) {
            interfaceC6386.mo5757(new C21139(-6, "onActivityResult intent data is null.", "onActivityResult intent data is null."));
            return;
        }
        String stringExtra = intent.getStringExtra("key_action");
        if ("action_login".equals(stringExtra)) {
            if (intent.getBooleanExtra("key_auth_ignore_on_activity_result", false)) {
                C11060.m25469("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, ignoreOnActivityResult");
                return;
            }
            int intExtra = intent.getIntExtra("key_error_code", 0);
            if (intExtra != 0) {
                C11060.m25467("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onError = " + intExtra);
                interfaceC6386.mo5757(new C21139(intExtra, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail")));
                return;
            }
            String stringExtra2 = intent.getStringExtra("key_response");
            if (stringExtra2 == null) {
                C11060.m25464("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onComplete");
                interfaceC6386.mo5757(new C21139(-4, "服务器返回数据格式有误!", "response is null"));
                return;
            }
            try {
                interfaceC6386.mo5758(C19797.m45010(stringExtra2));
                return;
            } catch (JSONException e) {
                interfaceC6386.mo5757(new C21139(-4, "服务器返回数据格式有误!", stringExtra2));
                C11060.m25465("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, json error", e);
                return;
            }
        }
        if ("action_share".equals(stringExtra) || "action_request_avatar".equals(stringExtra) || "action_request_dynamic_avatar".equals(stringExtra) || "action_request_set_emotion".equals(stringExtra) || "guildOpen".equals(stringExtra)) {
            String stringExtra3 = intent.getStringExtra(C0252o.f1208c);
            String stringExtra4 = intent.getStringExtra("response");
            if ("cancel".equals(stringExtra3)) {
                interfaceC6386.mo5756();
                return;
            }
            if (C0708d.f2599O.equals(stringExtra3)) {
                interfaceC6386.mo5757(new C21139(-6, "unknown error", C17588.m40053(stringExtra4, "")));
                return;
            }
            if ("complete".equals(stringExtra3)) {
                try {
                    interfaceC6386.mo5758(new JSONObject(stringExtra4 == null ? "{\"ret\": 0}" : stringExtra4));
                    return;
                } catch (JSONException e2) {
                    C11060.m25465("openSDK_LOG.UIListenerManager", "JSONException", e2);
                    interfaceC6386.mo5757(new C21139(-4, "json error", C17588.m40053(stringExtra4, "")));
                    return;
                }
            }
            return;
        }
        if (!"action_common_channel".equals(stringExtra)) {
            int intExtra2 = intent.getIntExtra("key_error_code", 0);
            if (intExtra2 != 0) {
                interfaceC6386.mo5757(new C21139(intExtra2, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail")));
                return;
            }
            String stringExtra5 = intent.getStringExtra("key_response");
            if (stringExtra5 == null) {
                interfaceC6386.mo5758(new JSONObject());
                return;
            }
            try {
                interfaceC6386.mo5758(C19797.m45010(stringExtra5));
                return;
            } catch (JSONException unused) {
                interfaceC6386.mo5757(new C21139(-4, "服务器返回数据格式有误!", stringExtra5));
                return;
            }
        }
        int intExtra3 = intent.getIntExtra("key_error_code", 0);
        if (intExtra3 != 0) {
            interfaceC6386.mo5757(new C21139(intExtra3, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail")));
            return;
        }
        String stringExtra6 = intent.getStringExtra("response");
        if (stringExtra6 == null) {
            interfaceC6386.mo5758(new JSONObject());
            return;
        }
        try {
            String stringExtra7 = intent.getStringExtra("message");
            JSONObject jSONObjectM45010 = C19797.m45010(stringExtra6);
            jSONObjectM45010.put("message", stringExtra7);
            interfaceC6386.mo5758(jSONObjectM45010);
        } catch (JSONException unused2) {
            interfaceC6386.mo5757(new C21139(-4, "服务器返回数据格式有误!", stringExtra6));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m46169() {
        boolean zM21681 = this.f63210.m21681();
        C11060.m25469("openSDK_LOG.Tencent", "isSessionValid() isvalid =" + zM21681);
        C13562.m30863().m30868("isSessionValid", "", Boolean.valueOf(zM21681));
        return zM21681;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46163(String str, Object... objArr) {
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
        C13562.m30863().m30868(str, string, "");
    }
}
