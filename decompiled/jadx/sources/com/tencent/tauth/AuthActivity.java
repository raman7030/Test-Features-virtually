package com.tencent.tauth;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.connect.common.AssistActivity;
import java.util.HashMap;
import p067l.C10880;
import p067l.C11060;
import p067l.C17784;
import p067l.C19797;
import p067l.C7727;
import p067l.C9718;
import p067l.InterfaceC3032;
import p067l.InterfaceC6386;

/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class AuthActivity extends Activity {

    /* JADX INFO: renamed from: ᩹ */
    public static int f2142;

    /* JADX INFO: renamed from: ᩸ */
    public final HashMap f2143 = new HashMap();

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C11060.m25469("openSDK_LOG.AuthActivity", "->onCreate");
        C17784 c17784 = new C17784(this);
        HashMap map = this.f2143;
        map.put("action_common_channel", c17784);
        map.put("action_auth", new C7727());
        m2044();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C11060.m25469("openSDK_LOG.AuthActivity", "->onNewIntent");
        m2044();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m2044() {
        Uri data;
        Intent intent = getIntent();
        if (intent == null) {
            C11060.m25470("openSDK_LOG.AuthActivity", "-->onCreate, getIntent() return null");
            finish();
            return;
        }
        try {
            data = intent.getData();
        } catch (Exception e) {
            C11060.m25465("openSDK_LOG.AuthActivity", "onCreate exception: ", e);
            data = null;
        }
        C11060.m25471("openSDK_LOG.AuthActivity", "-->onCreate, uri: " + data);
        try {
            m2045(intent, data);
        } catch (Exception e2) {
            C11060.m25465("openSDK_LOG.AuthActivity", "onCreate exception: ", e2);
            finish();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m2045(Intent intent, Uri uri) {
        C11060.m25469("openSDK_LOG.AuthActivity", "-->handleActionUri--start");
        if (uri != null && uri.toString() != null) {
            String string = "";
            if (!uri.toString().equals("")) {
                String string2 = uri.toString();
                Bundle bundleM44996 = C19797.m44996(string2.substring(string2.indexOf("#") + 1));
                if (bundleM44996 == null) {
                    C11060.m25470("openSDK_LOG.AuthActivity", "-->handleActionUri, bundle is null");
                    finish();
                    return;
                }
                String string3 = bundleM44996.getString("action");
                C11060.m25469("openSDK_LOG.AuthActivity", "-->handleActionUri, action: " + string3);
                if (string3 == null) {
                    finish();
                    return;
                }
                if (string3.equals("shareToQQ") || string3.equals("shareToQzone") || string3.equals("sendToMyComputer") || string3.equals("shareToTroopBar")) {
                    if (string3.equals("shareToQzone") && C9718.m22694(this, "com.tencent.mobileqq") != null && C9718.m22689(C9718.m22694(this, "com.tencent.mobileqq"), "5.2.0") < 0) {
                        int i = f2142 + 1;
                        f2142 = i;
                        if (i == 2) {
                            f2142 = 0;
                            finish();
                            return;
                        }
                    }
                    C11060.m25469("openSDK_LOG.AuthActivity", "-->handleActionUri, most share action, start assistactivity");
                    Intent intent2 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent2.putExtras(bundleM44996);
                    intent2.setFlags(603979776);
                    startActivity(intent2);
                    finish();
                    return;
                }
                if (string3.equals("addToQQFavorites")) {
                    Intent intent3 = getIntent();
                    intent3.putExtras(bundleM44996);
                    intent3.putExtra("key_action", "action_share");
                    InterfaceC6386 interfaceC6386M25067 = C10880.m25064().m25067(string3);
                    if (interfaceC6386M25067 != null) {
                        C10880.m25064().getClass();
                        C10880.m25065(intent3, interfaceC6386M25067);
                    }
                    finish();
                    return;
                }
                if (string3.equals("sharePrize")) {
                    Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                    try {
                        string = C19797.m45010(bundleM44996.getString("response")).getString("activityid");
                    } catch (Exception e) {
                        C11060.m25465("openSDK_LOG.AuthActivity", "sharePrize parseJson has exception.", e);
                    }
                    if (!TextUtils.isEmpty(string)) {
                        launchIntentForPackage.putExtra("sharePrize", true);
                        Bundle bundle = new Bundle();
                        bundle.putString("activityid", string);
                        launchIntentForPackage.putExtras(bundle);
                    }
                    startActivity(launchIntentForPackage);
                    finish();
                    return;
                }
                if (string3.equals("sdkSetAvatar")) {
                    boolean booleanExtra = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent4 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent4.putExtra("key_request_code", 10108);
                    intent4.putExtra("stay_back_stack", booleanExtra);
                    intent4.putExtras(bundleM44996);
                    intent4.setFlags(603979776);
                    startActivity(intent4);
                    finish();
                    return;
                }
                if ("sdkSetDynamicAvatar".equals(string3)) {
                    boolean booleanExtra2 = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent5 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent5.putExtra("key_request_code", 10110);
                    intent5.putExtra("stay_back_stack", booleanExtra2);
                    intent5.putExtras(bundleM44996);
                    intent5.setFlags(603979776);
                    startActivity(intent5);
                    finish();
                    return;
                }
                if (string3.equals("sdkSetEmotion")) {
                    boolean booleanExtra3 = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent6 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent6.putExtra("key_request_code", 10109);
                    intent6.putExtra("stay_back_stack", booleanExtra3);
                    intent6.putExtras(bundleM44996);
                    intent6.setFlags(603979776);
                    startActivity(intent6);
                    finish();
                    return;
                }
                if (string3.equals("bindGroup")) {
                    C11060.m25469("openSDK_LOG.AuthActivity", "-->handleActionUri--bind group callback.");
                    boolean booleanExtra4 = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent7 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent7.putExtra("key_request_code", 10112);
                    intent7.putExtra("stay_back_stack", booleanExtra4);
                    intent7.putExtras(bundleM44996);
                    intent7.setFlags(603979776);
                    startActivity(intent7);
                    finish();
                    return;
                }
                if (string3.equals("joinGroup")) {
                    C11060.m25469("openSDK_LOG.AuthActivity", "-->handleActionUri--join group callback. ");
                    boolean booleanExtra5 = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent8 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent8.putExtra("key_request_code", 10111);
                    intent8.putExtra("stay_back_stack", booleanExtra5);
                    intent8.putExtras(bundleM44996);
                    intent8.setFlags(603979776);
                    startActivity(intent8);
                    finish();
                    return;
                }
                if ("guildOpen".equals(string3)) {
                    Intent intent9 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent9.putExtras(bundleM44996);
                    intent9.putExtra("key_request_code", 10113);
                    intent9.setFlags(603979776);
                    startActivity(intent9);
                    finish();
                    return;
                }
                InterfaceC3032 interfaceC3032 = (InterfaceC3032) this.f2143.get(string3);
                C11060.m25471("openSDK_LOG.AuthActivity", "actionHandler: " + interfaceC3032);
                if (interfaceC3032 != null) {
                    interfaceC3032.mo5130(intent, bundleM44996);
                }
                finish();
                return;
            }
        }
        C11060.m25470("openSDK_LOG.AuthActivity", "-->handleActionUri, uri invalid");
        finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        try {
            super.finish();
        } catch (Exception e) {
            C11060.m25465("openSDK_LOG.AuthActivity", "activity finish exception: ", e);
        }
    }
}
