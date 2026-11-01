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
import org.json.JSONException;
import org.json.JSONObject;
import p067l.C11060;
import p067l.C19797;
import p067l.C20268;
import p067l.C22460;
import p067l.C22755;
import p067l.C25161;
import p067l.C4845;
import p067l.C5515;
import p067l.C6186;
import p067l.C9048;
import p067l.HandlerC20939;
import p067l.InterfaceC6386;
import p067l.RunnableC17584;

/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class TDialog extends AbstractDialogC0627c {

    /* JADX INFO: renamed from: ܰ */
    public static WeakReference f2130;

    /* JADX INFO: renamed from: ۗ */
    public C20268 f2132;

    /* JADX INFO: renamed from: ۙ */
    public String f2133;

    /* JADX INFO: renamed from: ۛ */
    public Handler f2134;

    /* JADX INFO: renamed from: ۤ */
    public C9048 f2135;

    /* JADX INFO: renamed from: ۫ */
    public C22460 f2136;

    /* JADX INFO: renamed from: ۬ */
    public InterfaceC6386 f2137;

    /* JADX INFO: renamed from: ᩶ */
    public WeakReference f2138;

    /* JADX INFO: renamed from: ۨ */
    public static final FrameLayout.LayoutParams f2129 = new FrameLayout.LayoutParams(-1, -1);

    /* JADX INFO: renamed from: ᩺ */
    public static Toast f2131 = null;

    public TDialog(Context context, String str, InterfaceC6386 interfaceC6386, C22755 c22755) {
        super(context);
        this.f2138 = new WeakReference(context);
        this.f2133 = str;
        c22755.getClass();
        C20268 c20268 = new C20268(context, str, interfaceC6386);
        this.f2132 = c20268;
        this.f2134 = new HandlerC20939(this, c20268, context.getMainLooper());
        this.f2137 = interfaceC6386;
    }

    @Override // com.tencent.open.AbstractDialogC0627c, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        C5515.m12161(getWindow());
        WeakReference weakReference = this.f2138;
        try {
            new TextView((Context) weakReference.get()).setText("test");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C9048 c9048 = new C9048((Context) weakReference.get());
            this.f2135 = c9048;
            c9048.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            C22460 c22460 = new C22460((Context) weakReference.get());
            this.f2136 = c22460;
            c22460.setLayoutParams(layoutParams);
            this.f2136.setBackgroundColor(-1);
            this.f2136.addView(this.f2135);
            setContentView(this.f2136);
        } catch (Throwable th) {
            C11060.m25465("openSDK_LOG.TDialog", "onCreateView exception", th);
            C5515.m12160(this, this.f2134);
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC17584(this));
        C9048 c9049 = this.f2135;
        if (c9049 != null) {
            c9049.setVerticalScrollBarEnabled(false);
            this.f2135.setHorizontalScrollBarEnabled(false);
            this.f2135.setWebViewClient(new C4845(this));
            this.f2135.setWebChromeClient(this.f2140);
            this.f2135.clearFormData();
            WebSettings settings = this.f2135.getSettings();
            if (settings == null) {
                return;
            }
            C25161.m55206(this.f2135);
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
            this.f2139.m43414(new C6186(), "sdk_js_if");
            this.f2135.loadUrl(this.f2133);
            this.f2135.setLayoutParams(f2129);
            this.f2135.setVisibility(4);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        C20268 c20268 = this.f2132;
        if (c20268 != null) {
            c20268.mo5756();
        }
        super.onBackPressed();
    }

    @Override // com.tencent.open.AbstractDialogC0627c
    /* JADX INFO: renamed from: ֫ */
    public final void mo2039(String str) {
        C11060.m25464("openSDK_LOG.TDialog", "--onConsoleMessage--");
        try {
            this.f2139.mo26978(this.f2135, str);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m2036(Context context, String str) {
        WeakReference weakReference;
        if (context == null || str == null) {
            return;
        }
        try {
            JSONObject jSONObjectM45010 = C19797.m45010(str);
            int i = jSONObjectM45010.getInt("action");
            String string = jSONObjectM45010.getString("msg");
            if (i == 1) {
                WeakReference weakReference2 = f2130;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((ProgressDialog) f2130.get()).setMessage(string);
                    if (((ProgressDialog) f2130.get()).isShowing()) {
                        return;
                    }
                    ((ProgressDialog) f2130.get()).show();
                    return;
                }
                ProgressDialog progressDialog = new ProgressDialog(context);
                progressDialog.setMessage(string);
                f2130 = new WeakReference(progressDialog);
                progressDialog.show();
                return;
            }
            if (i != 0 || (weakReference = f2130) == null || weakReference.get() == null || !((ProgressDialog) f2130.get()).isShowing()) {
                return;
            }
            ((ProgressDialog) f2130.get()).dismiss();
            f2130 = null;
        } catch (JSONException unused) {
        }
    }
}
