package com.tencent.open;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import l.C18338;
import l.C18834;
import l.C21140;
import l.C21451;
import l.C23982;
import l.C2606;
import l.C3311;
import l.C4017;
import l.C7028;
import l.C9145;
import l.HandlerC19540;
import l.InterfaceC4227;
import l.RunnableC16010;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class TDialog extends c {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static WeakReference f896;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C18834 f898;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f899;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Handler f900;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C7028 f901;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C21140 f902;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InterfaceC4227 f903;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public WeakReference f904;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final FrameLayout.LayoutParams f895 = new FrameLayout.LayoutParams(-1, -1);

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static Toast f897 = null;

    public TDialog(Context context, String str, InterfaceC4227 interfaceC4227, C21451 c21451) {
        super(context);
        this.f904 = new WeakReference(context);
        this.f899 = str;
        c21451.getClass();
        C18834 c18834 = new C18834(context, str, interfaceC4227);
        this.f898 = c18834;
        this.f900 = new HandlerC19540(this, c18834, context.getMainLooper());
        this.f903 = interfaceC4227;
    }

    @Override // com.tencent.open.c, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        C3311.m10125(getWindow());
        WeakReference weakReference = this.f904;
        try {
            new TextView((Context) weakReference.get()).setText("test");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C7028 c7028 = new C7028((Context) weakReference.get());
            this.f901 = c7028;
            c7028.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            C21140 c21140 = new C21140((Context) weakReference.get());
            this.f902 = c21140;
            c21140.setLayoutParams(layoutParams);
            this.f902.setBackgroundColor(-1);
            this.f902.addView(this.f901);
            setContentView(this.f902);
        } catch (Throwable th) {
            C9145.m23514("openSDK_LOG.TDialog", "onCreateView exception", th);
            C3311.m10124(this, this.f900);
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC16010(this));
        C7028 c7029 = this.f901;
        if (c7029 != null) {
            c7029.setVerticalScrollBarEnabled(false);
            this.f901.setHorizontalScrollBarEnabled(false);
            this.f901.setWebViewClient(new C2606(this));
            this.f901.setWebChromeClient(this.f906);
            this.f901.clearFormData();
            WebSettings settings = this.f901.getSettings();
            if (settings == null) {
                return;
            }
            C23982.m52800(this.f901);
            settings.setSaveFormData(false);
            settings.setCacheMode(-1);
            settings.setNeedInitialFocus(false);
            settings.setBuiltInZoomControls(true);
            settings.setSupportZoom(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            if (weakReference != null && weakReference.get() != null) {
                settings.setDatabaseEnabled(true);
                settings.setDatabasePath(((Context) weakReference.get()).getApplicationContext().getDir("databases", 0).getPath());
            }
            settings.setDomStorageEnabled(true);
            this.f905.m41168(new C4017(), "sdk_js_if");
            this.f901.loadUrl(this.f899);
            this.f901.setLayoutParams(f895);
            this.f901.setVisibility(4);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        C18834 c18834 = this.f898;
        if (c18834 != null) {
            c18834.mo3453();
        }
        super.onBackPressed();
    }

    @Override // com.tencent.open.c
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo924(String str) {
        C9145.m23513("openSDK_LOG.TDialog", "--onConsoleMessage--");
        try {
            this.f905.mo24963(this.f901, str);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m921(Context context, String str) {
        WeakReference weakReference;
        if (context == null || str == null) {
            return;
        }
        try {
            JSONObject jSONObjectM42748 = C18338.m42748(str);
            int i = jSONObjectM42748.getInt("action");
            String string = jSONObjectM42748.getString("msg");
            if (i == 1) {
                WeakReference weakReference2 = f896;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((ProgressDialog) f896.get()).setMessage(string);
                    if (((ProgressDialog) f896.get()).isShowing()) {
                        return;
                    }
                    ((ProgressDialog) f896.get()).show();
                    return;
                }
                ProgressDialog progressDialog = new ProgressDialog(context);
                progressDialog.setMessage(string);
                f896 = new WeakReference(progressDialog);
                progressDialog.show();
                return;
            }
            if (i != 0 || (weakReference = f896) == null || weakReference.get() == null || !((ProgressDialog) f896.get()).isShowing()) {
                return;
            }
            ((ProgressDialog) f896.get()).dismiss();
            f896 = null;
        } catch (JSONException unused) {
        }
    }
}
