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
import com.umeng.commonsdk.statistics.idtracking.C0810i;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Locale;
import p067l.C11060;
import p067l.C11731;
import p067l.C11751;
import p067l.C12026;
import p067l.C14037;
import p067l.C15377;
import p067l.C19797;
import p067l.C22460;
import p067l.C22755;
import p067l.C23130;
import p067l.C24095;
import p067l.C25161;
import p067l.C5410;
import p067l.C5515;
import p067l.C9068;
import p067l.DialogInterfaceOnDismissListenerC5320;
import p067l.HandlerC8002;
import p067l.InterfaceC6386;
import p067l.ViewOnClickListenerC23425;
import p067l.ViewOnLongClickListenerC21414;
import p067l.ViewOnTouchListenerC6661;

/* JADX INFO: renamed from: com.tencent.connect.auth.a */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0602a extends Dialog {

    /* JADX INFO: renamed from: ֫֫ */
    public int f2065;

    /* JADX INFO: renamed from: ۗ */
    public FrameLayout f2066;

    /* JADX INFO: renamed from: ۙ */
    public Handler f2067;

    /* JADX INFO: renamed from: ۛ */
    public String f2068;

    /* JADX INFO: renamed from: ۟ */
    public boolean f2069;

    /* JADX INFO: renamed from: ۤ */
    public ProgressBar f2070;

    /* JADX INFO: renamed from: ۧ֫ */
    public String f2071;

    /* JADX INFO: renamed from: ۨ */
    public C11731 f2072;

    /* JADX INFO: renamed from: ۫ */
    public FrameLayout f2073;

    /* JADX INFO: renamed from: ۬ */
    public LinearLayout f2074;

    /* JADX INFO: renamed from: ܰ */
    public C11751 f2075;

    /* JADX INFO: renamed from: ܳ֫ */
    public HashMap f2076;

    /* JADX INFO: renamed from: ܽ֫ */
    public String f2077;

    /* JADX INFO: renamed from: ܿ֫ */
    public long f2078;

    /* JADX INFO: renamed from: ᩳ֫ */
    public long f2079;

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC6386 f2080;

    /* JADX INFO: renamed from: ᩸ */
    public String f2081;

    /* JADX INFO: renamed from: ᩹ */
    public C12026 f2082;

    /* JADX INFO: renamed from: ᩺ */
    public Context f2083;

    /* JADX INFO: renamed from: ۧ */
    public static boolean m1991(DialogC0602a dialogC0602a) {
        if (C15377.f43922 == null) {
            C15377 c15377 = new C15377();
            c15377.f43924 = new HashMap();
            C15377.f43922 = c15377;
        }
        C15377 c15378 = C15377.f43922;
        c15378.getClass();
        int iCeil = (int) Math.ceil((Math.random() * 20.0d) + 3.0d);
        char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        int length = charArray.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iCeil; i++) {
            stringBuffer.append(charArray[(int) (Math.random() * ((double) length))]);
        }
        String string = stringBuffer.toString();
        C24095 c24095 = new C24095();
        c24095.f76490 = dialogC0602a.f2080;
        String strM35050 = c15378.m35050(c24095);
        String str = dialogC0602a.f2081;
        String strSubstring = str.substring(0, str.indexOf("?"));
        Bundle bundleM45003 = C19797.m45003(dialogC0602a.f2081);
        bundleM45003.putString("token_key", string);
        bundleM45003.putString(C0810i.f3439a, strM35050);
        bundleM45003.putString("browser", "1");
        String str2 = strSubstring + "?" + C23130.m51585(bundleM45003);
        dialogC0602a.f2081 = str2;
        return C19797.m45002(dialogC0602a.f2083, str2);
    }

    /* JADX INFO: renamed from: ۖ */
    public static /* synthetic */ void m1985(DialogC0602a dialogC0602a) {
        dialogC0602a.f2065++;
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m1990(DialogC0602a dialogC0602a, String str) {
        dialogC0602a.f2081 += ((Object) str);
    }

    public DialogC0602a(Context context, String str, InterfaceC6386 interfaceC6386, C22755 c22755) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.f2069 = false;
        this.f2079 = 0L;
        this.f2078 = 30000L;
        this.f2083 = context;
        this.f2081 = str;
        c22755.getClass();
        C12026 c12026 = new C12026(this, str, interfaceC6386);
        this.f2082 = c12026;
        this.f2067 = new HandlerC8002(this, c12026, context.getMainLooper());
        this.f2080 = interfaceC6386;
        this.f2068 = "action_login";
        this.f2075 = new C11751();
        getWindow().setSoftInputMode(32);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        C5515.m12161(getWindow());
        Context context = this.f2083;
        try {
            m1980();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C11731 c11731 = new C11731(context);
            this.f2072 = c11731;
            c11731.setLayerType(1, null);
            this.f2072.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            C22460 c22460 = new C22460(context);
            c22460.setLayoutParams(layoutParams);
            c22460.addView(this.f2072);
            FrameLayout frameLayout = new FrameLayout(context);
            this.f2066 = frameLayout;
            frameLayout.addView(c22460);
            this.f2066.setBackgroundColor(-1);
            this.f2066.addView(this.f2073);
            String string = C19797.m45003(this.f2081).getString("style");
            if (string != null && "qr".equals(string)) {
                m1981(this.f2066);
            }
            setContentView(this.f2066);
        } catch (Throwable th) {
            C11060.m25465("openSDK_LOG.AuthDialog", "onCreateView exception", th);
            C5515.m12160(this, this.f2067);
        }
        C11731 c11732 = this.f2072;
        if (c11732 != null) {
            c11732.setVerticalScrollBarEnabled(false);
            this.f2072.setHorizontalScrollBarEnabled(false);
            this.f2072.setWebViewClient(new C14037(this));
            this.f2072.setWebChromeClient(new WebChromeClient());
            this.f2072.clearFormData();
            this.f2072.clearSslPreferences();
            this.f2072.setOnLongClickListener(new ViewOnLongClickListenerC21414());
            this.f2072.setOnTouchListener(new ViewOnTouchListenerC6661());
            WebSettings settings = this.f2072.getSettings();
            C25161.m55206(this.f2072);
            settings.setSaveFormData(false);
            settings.setCacheMode(-1);
            settings.setNeedInitialFocus(false);
            settings.setBuiltInZoomControls(true);
            settings.setSupportZoom(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setDatabaseEnabled(true);
            settings.setDatabasePath(context.getDir("databases", 0).getPath());
            settings.setDomStorageEnabled(true);
            C11060.m25471("openSDK_LOG.AuthDialog", "-->mUrl : " + this.f2081);
            String str = this.f2081;
            this.f2071 = str;
            this.f2072.loadUrl(str);
            this.f2072.setVisibility(4);
            this.f2075.m43414(new C9068(), "SecureJsInterface");
            super.setOnDismissListener(new DialogInterfaceOnDismissListenerC5320());
        }
        this.f2076 = new HashMap();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (!this.f2069) {
            this.f2082.mo5756();
        }
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m1983(DialogC0602a dialogC0602a, String str) {
        new StringBuilder(str);
        if (TextUtils.isEmpty(dialogC0602a.f2077) || dialogC0602a.f2077.length() < 4) {
            return;
        }
        String str2 = dialogC0602a.f2077;
        str2.substring(str2.length() - 4);
    }

    /* JADX INFO: renamed from: ᩴ */
    public static String m1999(DialogC0602a dialogC0602a) {
        String str = dialogC0602a.f2081;
        String str2 = "https://imgcache.qq.com/ptlogin/static/qzsjump.html?" + str.substring(str.indexOf("?") + 1);
        C11060.m25469("openSDK_LOG.AuthDialog", "-->generateDownloadUrl, url: https://imgcache.qq.com/ptlogin/static/qzsjump.html?");
        return str2;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m1981(FrameLayout frameLayout) throws Throwable {
        InputStream inputStreamOpen;
        StringBuilder sb;
        Context context = this.f2083;
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
                        C11060.m25467("openSDK_LOG.Util", sb.toString());
                    }
                } catch (IOException e2) {
                    e = e2;
                    C11060.m25467("openSDK_LOG.Util", "getDrawable exception: " + e.getMessage());
                    try {
                        inputStreamOpen.close();
                    } catch (Exception e3) {
                        e = e3;
                        sb = new StringBuilder("inputStream close exception: ");
                        sb.append(e.getMessage());
                        C11060.m25467("openSDK_LOG.Util", sb.toString());
                    }
                }
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpen;
                try {
                    inputStream.close();
                } catch (Exception e4) {
                    C11060.m25467("openSDK_LOG.Util", "inputStream close exception: " + e4.getMessage());
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
        imageView.setOnClickListener(new ViewOnClickListenerC23425(this));
        frameLayout.addView(imageView);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m1980() {
        TextView textView;
        Context context = this.f2083;
        this.f2070 = new ProgressBar(context);
        this.f2070.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f2074 = new LinearLayout(context);
        if (this.f2068.equals("action_login")) {
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
        this.f2074.setLayoutParams(layoutParams2);
        this.f2074.addView(this.f2070);
        if (textView != null) {
            this.f2074.addView(textView);
        }
        this.f2073 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        this.f2073.setLayoutParams(layoutParams3);
        this.f2073.setBackgroundColor(Color.parseColor("#B3000000"));
        this.f2073.addView(this.f2074);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m2003(String str) {
        if (this.f2072 != null) {
            StringBuilder sbM11879 = C5410.m11879("javascript:", str, "();void(");
            sbM11879.append(System.currentTimeMillis());
            sbM11879.append(");");
            this.f2072.loadUrl(sbM11879.toString());
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.f2076.clear();
        this.f2067.removeCallbacksAndMessages(null);
        try {
            Context context = this.f2083;
            if ((context instanceof Activity) && !((Activity) context).isFinishing() && isShowing()) {
                super.dismiss();
                C11060.m25469("openSDK_LOG.AuthDialog", "-->dismiss dialog");
            }
        } catch (Exception e) {
            C11060.m25465("openSDK_LOG.AuthDialog", "-->dismiss dialog exception:", e);
        }
        C11731 c11731 = this.f2072;
        if (c11731 != null) {
            c11731.destroy();
            this.f2072 = null;
        }
    }
}
