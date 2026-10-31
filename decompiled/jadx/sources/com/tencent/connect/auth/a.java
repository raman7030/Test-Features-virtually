package com.tencent.connect.auth;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.idtracking.i;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Locale;
import l.C10162;
import l.C12278;
import l.C13688;
import l.C18338;
import l.C21140;
import l.C21451;
import l.C21845;
import l.C22861;
import l.C23982;
import l.C3200;
import l.C3311;
import l.C7049;
import l.C9145;
import l.C9851;
import l.C9872;
import l.DialogInterfaceOnDismissListenerC3106;
import l.HandlerC5928;
import l.InterfaceC4227;
import l.ViewOnClickListenerC22156;
import l.ViewOnLongClickListenerC20040;
import l.ViewOnTouchListenerC4517;

/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class a extends Dialog {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f868;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public FrameLayout f869;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Handler f870;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f871;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f872;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ProgressBar f873;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public String f874;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C9851 f875;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public FrameLayout f876;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public LinearLayout f877;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C9872 f878;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public HashMap f879;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public String f880;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public long f881;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public long f882;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC4227 f883;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f884;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C10162 f885;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Context f886;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m905(a aVar) {
        if (C13688.f40840 == null) {
            C13688 c13688 = new C13688();
            c13688.f40842 = new HashMap();
            C13688.f40840 = c13688;
        }
        C13688 c13689 = C13688.f40840;
        c13689.getClass();
        int iCeil = (int) Math.ceil((Math.random() * 20.0d) + 3.0d);
        char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        int length = charArray.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iCeil; i++) {
            stringBuffer.append(charArray[(int) (Math.random() * ((double) length))]);
        }
        String string = stringBuffer.toString();
        C22861 c22861 = new C22861();
        c22861.f73759 = aVar.f883;
        String strM32935 = c13689.m32935(c22861);
        String str = aVar.f884;
        String strSubstring = str.substring(0, str.indexOf("?"));
        Bundle bundleM42741 = C18338.m42741(aVar.f884);
        bundleM42741.putString("token_key", string);
        bundleM42741.putString(i.a, strM32935);
        bundleM42741.putString("browser", "1");
        String str2 = strSubstring + "?" + C21845.m49234(bundleM42741);
        aVar.f884 = str2;
        return C18338.m42740(aVar.f886, str2);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m899(a aVar) {
        aVar.f868++;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m904(a aVar, String str) {
        aVar.f884 += ((Object) str);
    }

    public a(Context context, String str, InterfaceC4227 interfaceC4227, C21451 c21451) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.f872 = false;
        this.f882 = 0L;
        this.f881 = 30000L;
        this.f886 = context;
        this.f884 = str;
        c21451.getClass();
        C10162 c10162 = new C10162(this, str, interfaceC4227);
        this.f885 = c10162;
        this.f870 = new HandlerC5928(this, c10162, context.getMainLooper());
        this.f883 = interfaceC4227;
        this.f871 = "action_login";
        this.f878 = new C9872();
        getWindow().setSoftInputMode(32);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        C3311.m10125(getWindow());
        Context context = this.f886;
        try {
            m894();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C9851 c9851 = new C9851(context);
            this.f875 = c9851;
            c9851.setLayerType(1, null);
            this.f875.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            C21140 c21140 = new C21140(context);
            c21140.setLayoutParams(layoutParams);
            c21140.addView(this.f875);
            FrameLayout frameLayout = new FrameLayout(context);
            this.f869 = frameLayout;
            frameLayout.addView(c21140);
            this.f869.setBackgroundColor(-1);
            this.f869.addView(this.f876);
            String string = C18338.m42741(this.f884).getString("style");
            if (string != null && "qr".equals(string)) {
                m895(this.f869);
            }
            setContentView(this.f869);
        } catch (Throwable th) {
            C9145.m23514("openSDK_LOG.AuthDialog", "onCreateView exception", th);
            C3311.m10124(this, this.f870);
        }
        C9851 c9852 = this.f875;
        if (c9852 != null) {
            c9852.setVerticalScrollBarEnabled(false);
            this.f875.setHorizontalScrollBarEnabled(false);
            this.f875.setWebViewClient(new C12278(this));
            this.f875.setWebChromeClient(new WebChromeClient());
            this.f875.clearFormData();
            this.f875.clearSslPreferences();
            this.f875.setOnLongClickListener(new ViewOnLongClickListenerC20040());
            this.f875.setOnTouchListener(new ViewOnTouchListenerC4517());
            WebSettings settings = this.f875.getSettings();
            C23982.m52800(this.f875);
            settings.setSaveFormData(false);
            settings.setCacheMode(-1);
            settings.setNeedInitialFocus(false);
            settings.setBuiltInZoomControls(true);
            settings.setSupportZoom(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setDatabaseEnabled(true);
            settings.setDatabasePath(context.getDir("databases", 0).getPath());
            settings.setDomStorageEnabled(true);
            C9145.m23520("openSDK_LOG.AuthDialog", "-->mUrl : " + this.f884);
            String str = this.f884;
            this.f874 = str;
            this.f875.loadUrl(str);
            this.f875.setVisibility(4);
            this.f878.m41168(new C7049(), "SecureJsInterface");
            super.setOnDismissListener(new DialogInterfaceOnDismissListenerC3106());
        }
        this.f879 = new HashMap();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (!this.f872) {
            this.f885.mo3453();
        }
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m897(a aVar, String str) {
        new StringBuilder(str);
        if (TextUtils.isEmpty(aVar.f880) || aVar.f880.length() < 4) {
            return;
        }
        String str2 = aVar.f880;
        str2.substring(str2.length() - 4);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m913(a aVar) {
        String str = aVar.f884;
        String str2 = "https://imgcache.qq.com/ptlogin/static/qzsjump.html?" + str.substring(str.indexOf("?") + 1);
        C9145.m23518("openSDK_LOG.AuthDialog", "-->generateDownloadUrl, url: https://imgcache.qq.com/ptlogin/static/qzsjump.html?");
        return str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m895(FrameLayout frameLayout) throws Throwable {
        InputStream inputStreamOpen;
        StringBuilder sb;
        Context context = this.f886;
        ImageView imageView = new ImageView(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 15.6f) + 0.5f);
        int i2 = (int) ((context.getResources().getDisplayMetrics().density * 25.2f) + 0.5f);
        int i3 = (int) ((context.getResources().getDisplayMetrics().density * 10.0f) + 0.5f);
        int i4 = i3 * 2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i + i4, i2 + i4);
        layoutParams.leftMargin = i3;
        imageView.setLayoutParams(layoutParams);
        imageView.setPadding(i3, i3, i3, i3);
        InputStream inputStream = null;
        drawableCreateFromStream = null;
        Drawable drawableCreateFromStream = null;
        try {
            inputStreamOpen = context.getAssets().open("h5_qr_back.png");
            try {
                try {
                    drawableCreateFromStream = Drawable.createFromStream(inputStreamOpen, "h5_qr_back.png");
                    try {
                        inputStreamOpen.close();
                    } catch (Exception e) {
                        e = e;
                        sb = new StringBuilder("inputStream close exception: ");
                        sb.append(e.getMessage());
                        C9145.m23516("openSDK_LOG.Util", sb.toString());
                    }
                } catch (IOException e2) {
                    e = e2;
                    C9145.m23516("openSDK_LOG.Util", "getDrawable exception: " + e.getMessage());
                    try {
                        inputStreamOpen.close();
                    } catch (Exception e3) {
                        e = e3;
                        sb = new StringBuilder("inputStream close exception: ");
                        sb.append(e.getMessage());
                        C9145.m23516("openSDK_LOG.Util", sb.toString());
                    }
                }
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpen;
                try {
                    inputStream.close();
                } catch (Exception e4) {
                    C9145.m23516("openSDK_LOG.Util", "inputStream close exception: " + e4.getMessage());
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            inputStreamOpen = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream.close();
            throw th;
        }
        imageView.setImageDrawable(drawableCreateFromStream);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setOnClickListener(new ViewOnClickListenerC22156(this));
        frameLayout.addView(imageView);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m894() {
        TextView textView;
        Context context = this.f886;
        this.f873 = new ProgressBar(context);
        this.f873.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f877 = new LinearLayout(context);
        if (this.f871.equals("action_login")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            layoutParams.leftMargin = 5;
            textView = new TextView(context);
            if (Locale.getDefault().getLanguage().equals("zh")) {
                textView.setText("登录中...");
            } else {
                textView.setText("Logging in...");
            }
            textView.setTextColor(Color.rgb(255, 255, 255));
            textView.setTextSize(18.0f);
            textView.setLayoutParams(layoutParams);
        } else {
            textView = null;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        this.f877.setLayoutParams(layoutParams2);
        this.f877.addView(this.f873);
        if (textView != null) {
            this.f877.addView(textView);
        }
        this.f876 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        this.f876.setLayoutParams(layoutParams3);
        this.f876.setBackgroundColor(Color.parseColor("#B3000000"));
        this.f876.addView(this.f877);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m917(String str) {
        if (this.f875 != null) {
            StringBuilder sbM9834 = C3200.m9834("javascript:", str, "();void(");
            sbM9834.append(System.currentTimeMillis());
            sbM9834.append(");");
            this.f875.loadUrl(sbM9834.toString());
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.f879.clear();
        this.f870.removeCallbacksAndMessages(null);
        try {
            Context context = this.f886;
            if ((context instanceof Activity) && !((Activity) context).isFinishing() && isShowing()) {
                super.dismiss();
                C9145.m23518("openSDK_LOG.AuthDialog", "-->dismiss dialog");
            }
        } catch (Exception e) {
            C9145.m23514("openSDK_LOG.AuthDialog", "-->dismiss dialog exception:", e);
        }
        C9851 c9851 = this.f875;
        if (c9851 != null) {
            c9851.destroy();
            this.f875 = null;
        }
    }
}
