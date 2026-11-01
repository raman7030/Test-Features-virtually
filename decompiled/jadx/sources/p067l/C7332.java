package p067l;

import android.app.Activity;
import android.app.Dialog;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.PaintDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۚ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C7332 extends C5045 {

    /* JADX INFO: renamed from: ֫ */
    public WeakReference f19205;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C10014 f19206;

    public C7332(C10014 c10014, InterfaceC6386 interfaceC6386) {
        this.f19206 = c10014;
        this.f19205 = new WeakReference(interfaceC6386);
    }

    @Override // p067l.InterfaceC6386
    /* JADX INFO: renamed from: ֫ */
    public final void mo5758(JSONObject jSONObject) {
        boolean z;
        String string;
        PackageInfo packageInfo;
        String str;
        try {
            z = jSONObject.getInt("sendinstall") == 1;
            try {
                string = jSONObject.getString("installwording");
            } catch (JSONException unused) {
                C11060.m25471("openSDK_LOG.AuthAgent", "FeedConfirmListener onComplete There is no value for sendinstall.");
                string = "";
            }
        } catch (JSONException unused2) {
            z = false;
        }
        String strDecode = C5136.decode(string);
        C11060.m25471("openSDK_LOG.AuthAgent", " WORDING = " + strDecode + "xx,showConfirmDialog=" + z);
        WeakReference weakReference = this.f19205;
        C10014 c10014 = this.f19206;
        if (z && !TextUtils.isEmpty(strDecode)) {
            InterfaceC6386 interfaceC6386 = (InterfaceC6386) weakReference.get();
            if (c10014.f27718 != null) {
                Activity activity = (Activity) c10014.f27718.get();
                if (activity == null) {
                    C11060.m25469("openSDK_LOG.AuthAgent", "showFeedConfirmDialog mActivity.get() null and return");
                } else {
                    Dialog dialog = new Dialog(activity);
                    dialog.requestWindowFeature(1);
                    PackageManager packageManager = activity.getPackageManager();
                    try {
                        packageInfo = packageManager.getPackageInfo(activity.getPackageName(), 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        C11060.m25465("openSDK_LOG.AuthAgent", "showFeedConfirmDialog exception:", e);
                        packageInfo = null;
                    }
                    Drawable drawableLoadIcon = packageInfo != null ? packageInfo.applicationInfo.loadIcon(packageManager) : null;
                    C5991 c5991 = new C5991(this, dialog, interfaceC6386, jSONObject);
                    C20073 c20073 = new C20073(dialog, interfaceC6386, jSONObject);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setAlpha(0);
                    dialog.getWindow().setBackgroundDrawable(colorDrawable);
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                    float f = displayMetrics.density;
                    RelativeLayout relativeLayout = new RelativeLayout(activity);
                    ImageView imageView = new ImageView(activity);
                    imageView.setImageDrawable(drawableLoadIcon);
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    imageView.setId(1);
                    int i = (int) (60.0f * f);
                    int i2 = (int) (14.0f * f);
                    int i3 = (int) (18.0f * f);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
                    layoutParams.addRule(9);
                    layoutParams.setMargins(0, i3, (int) (6.0f * f), i3);
                    relativeLayout.addView(imageView, layoutParams);
                    TextView textView = new TextView(activity);
                    textView.setText(strDecode);
                    textView.setTextSize(14.0f);
                    textView.setGravity(3);
                    textView.setIncludeFontPadding(false);
                    textView.setPadding(0, 0, 0, 0);
                    textView.setLines(2);
                    textView.setId(5);
                    textView.setMinWidth((int) (185.0f * f));
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams2.addRule(1, 1);
                    layoutParams2.addRule(6, 1);
                    float f2 = 5.0f * f;
                    layoutParams2.setMargins(0, 0, (int) f2, 0);
                    relativeLayout.addView(textView, layoutParams2);
                    View view = new View(activity);
                    view.setBackgroundColor(Color.rgb(214, 214, 214));
                    view.setId(3);
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, 2);
                    layoutParams3.addRule(3, 1);
                    layoutParams3.addRule(5, 1);
                    layoutParams3.addRule(7, 5);
                    int i4 = (int) (12.0f * f);
                    layoutParams3.setMargins(0, 0, 0, i4);
                    relativeLayout.addView(view, layoutParams3);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams4.addRule(5, 1);
                    layoutParams4.addRule(7, 5);
                    layoutParams4.addRule(3, 3);
                    Button button = new Button(activity);
                    button.setText("跳过");
                    button.setBackgroundDrawable(m16926(activity, "buttonNegt.png"));
                    str = "openSDK_LOG.AuthAgent";
                    button.setTextColor(Color.rgb(36, 97, 131));
                    button.setTextSize(20.0f);
                    button.setOnClickListener(c20073);
                    button.setId(4);
                    int i5 = (int) (45.0f * f);
                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, i5);
                    layoutParams5.rightMargin = i2;
                    int i6 = (int) (4.0f * f);
                    layoutParams5.leftMargin = i6;
                    layoutParams5.weight = 1.0f;
                    linearLayout.addView(button, layoutParams5);
                    Button button2 = new Button(activity);
                    button2.setText("确定");
                    button2.setTextSize(20.0f);
                    button2.setTextColor(Color.rgb(255, 255, 255));
                    button2.setBackgroundDrawable(m16926(activity, "buttonPost.png"));
                    button2.setOnClickListener(c5991);
                    LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, i5);
                    layoutParams6.weight = 1.0f;
                    layoutParams6.rightMargin = i6;
                    linearLayout.addView(button2, layoutParams6);
                    relativeLayout.addView(linearLayout, layoutParams4);
                    ViewGroup.LayoutParams layoutParams7 = new FrameLayout.LayoutParams((int) (279.0f * f), (int) (f * 163.0f));
                    relativeLayout.setPadding(i2, 0, i4, i4);
                    relativeLayout.setLayoutParams(layoutParams7);
                    relativeLayout.setBackgroundColor(Color.rgb(247, 251, 247));
                    PaintDrawable paintDrawable = new PaintDrawable(Color.rgb(247, 251, 247));
                    paintDrawable.setCornerRadius(f2);
                    relativeLayout.setBackgroundDrawable(paintDrawable);
                    dialog.setContentView(relativeLayout);
                    dialog.setOnCancelListener(new DialogInterfaceOnCancelListenerC20744(interfaceC6386, jSONObject));
                    if (!activity.isFinishing()) {
                        dialog.show();
                    }
                }
                C11060.m25469(str, " WORDING is not empty and return");
                return;
            }
            C11060.m25469("openSDK_LOG.AuthAgent", "showFeedConfirmDialog mActivity null and return");
            str = "openSDK_LOG.AuthAgent";
            C11060.m25469(str, " WORDING is not empty and return");
            return;
        }
        InterfaceC6386 interfaceC6387 = (InterfaceC6386) weakReference.get();
        if (interfaceC6387 != null) {
            C22755 unused3 = c10014.f79699;
            boolean zM50932 = c10014.f79699.m50932(jSONObject);
            C11060.m25469("openSDK_LOG.AuthAgent", " saveSession saveSuccess=" + zM50932);
            if (zM50932) {
                interfaceC6387.mo5758(jSONObject);
                return;
            } else {
                interfaceC6387.mo5757(new C21139(-6, "持久化失败!", null));
                return;
            }
        }
        C11060.m25467("openSDK_LOG.AuthAgent", " userListener is null");
    }

    /* JADX INFO: renamed from: ֫ */
    public static Drawable m16926(Activity activity, String str) {
        Bitmap bitmapDecodeStream;
        Drawable drawableCreateFromStream = null;
        try {
            InputStream inputStreamOpen = activity.getApplicationContext().getAssets().open(str);
            if (inputStreamOpen != null) {
                if (str.endsWith(".9.png")) {
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                    } catch (OutOfMemoryError unused) {
                        C11060.m25467("openSDK_LOG.AuthAgent", "getDrawable oom");
                        bitmapDecodeStream = null;
                    }
                    if (bitmapDecodeStream != null) {
                        byte[] ninePatchChunk = bitmapDecodeStream.getNinePatchChunk();
                        NinePatch.isNinePatchChunk(ninePatchChunk);
                        return new NinePatchDrawable(bitmapDecodeStream, ninePatchChunk, new Rect(), null);
                    }
                } else {
                    drawableCreateFromStream = Drawable.createFromStream(inputStreamOpen, str);
                    inputStreamOpen.close();
                }
                return drawableCreateFromStream;
            }
            return null;
        } catch (IOException e) {
            C11060.m25465("openSDK_LOG.AuthAgent", "getDrawable exception", e);
        }
    }

    @Override // p067l.InterfaceC6386
    /* JADX INFO: renamed from: ֫ */
    public final void mo5757(C21139 c21139) {
        WeakReference weakReference = this.f19205;
        if (weakReference.get() != null) {
            ((InterfaceC6386) weakReference.get()).mo5757(c21139);
        }
    }

    @Override // p067l.InterfaceC6386
    /* JADX INFO: renamed from: ֫ */
    public final void mo5756() {
        WeakReference weakReference = this.f19205;
        if (weakReference.get() != null) {
            ((InterfaceC6386) weakReference.get()).mo5756();
        }
    }
}
