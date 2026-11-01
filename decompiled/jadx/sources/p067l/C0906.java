package p067l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p050t0.C0215b;

/* JADX INFO: renamed from: l.֨ᩴ */
/* JADX INFO: compiled from: X58Q */
/* JADX INFO: loaded from: classes.dex */
public class C0906 {

    /* JADX INFO: renamed from: ۢ֨ۖ, reason: not valid java name and contains not printable characters */
    public static int f81862;

    /* JADX INFO: renamed from: ֫ */
    public final View f7329;

    /* JADX INFO: renamed from: ۧ */
    public final Context f7330;

    /* JADX INFO: renamed from: ܳ */
    public final int[] f7331;

    /* JADX INFO: renamed from: ܽ */
    public final WindowManager.LayoutParams f7332;

    /* JADX INFO: renamed from: ܿ */
    public final int[] f7333;

    /* JADX INFO: renamed from: ᩳ */
    public final TextView f7334;

    /* JADX INFO: renamed from: ᩻ */
    public final Rect f7335;

    /* JADX INFO: renamed from: ֨ۙ۟, reason: not valid java name and contains not printable characters */
    public static boolean m55806(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: ֫᩻ܽ, reason: not valid java name and contains not printable characters */
    public static void m55807(Object obj, float f) {
        ((View) obj).setAlpha(f);
    }

    /* JADX INFO: renamed from: ۖ᩶ۜ, reason: not valid java name and contains not printable characters */
    public static long m55808() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ۘۖ֡, reason: not valid java name and contains not printable characters */
    public static int m55809() {
        return 694713445;
    }

    /* JADX INFO: renamed from: ۠᩹ܺ, reason: not valid java name and contains not printable characters */
    public static String m55810(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۡᩴ᩷, reason: not valid java name and contains not printable characters */
    public static String[] m55811(Object obj, Object obj2) {
        return ((String) obj).split((String) obj2);
    }

    /* JADX INFO: renamed from: ۧ֫ܽ, reason: not valid java name and contains not printable characters */
    public static JSONObject m55812(Object obj, Object obj2, int i) {
        return ((JSONObject) obj).add((String) obj2, i);
    }

    /* JADX INFO: renamed from: ۬ۖܺ, reason: not valid java name and contains not printable characters */
    public static void m55813(Object obj) {
        ((AbstractC21283) obj).notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۬᩶ᩳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC14770 m55814(Object obj) {
        return ((InterfaceC14100) obj).edit();
    }

    /* JADX INFO: renamed from: ܶ֨ۧ, reason: not valid java name and contains not printable characters */
    public static String m55815(Object obj) {
        return ((C25065) obj).m55011();
    }

    /* JADX INFO: renamed from: ܿ֡᩵, reason: not valid java name and contains not printable characters */
    public static byte[] m55816(Object obj) {
        return ((AbstractC17043) obj).m38664();
    }

    /* JADX INFO: renamed from: ᩳۨۘ, reason: not valid java name and contains not printable characters */
    public static void m55817(Object obj, int i, Object obj2) {
        ((C20671) obj).m46736(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ᩴۡܶ, reason: not valid java name and contains not printable characters */
    public static void m55818(Object obj, Object obj2) {
        ((C14849) obj).setAdapter((AbstractC21283) obj2);
    }

    /* JADX INFO: renamed from: ᩶ܳ᩹, reason: not valid java name and contains not printable characters */
    public static void m55819(Object obj, Object obj2, boolean z) {
        ((Bundle) obj).putBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ᩷ۢ᩶, reason: not valid java name and contains not printable characters */
    public static void m55820(Object obj, long j) {
        C7050.m16213((Runnable) obj, j);
    }

    /* JADX INFO: renamed from: ᩹֨ۡ, reason: not valid java name and contains not printable characters */
    public static int m55821(float f) {
        return C13076.m29939(f);
    }

    public C0906(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f7332 = layoutParams;
        this.f7335 = new Rect();
        this.f7333 = new int[2];
        this.f7331 = new int[2];
        this.f7330 = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) null);
        this.f7329 = viewInflate;
        this.f7334 = (TextView) viewInflate.findViewById(R.id.MT_Protector);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = C0215b.f1000c;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.MT_Protector;
        layoutParams.flags = 24;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo6618(View view, int i, int i2, boolean z, CharSequence charSequence) {
        int height;
        int i3;
        if (mo6619()) {
            mo6617();
        }
        this.f7334.setText(charSequence);
        IBinder applicationWindowToken = view.getApplicationWindowToken();
        WindowManager.LayoutParams layoutParams = this.f7332;
        layoutParams.token = applicationWindowToken;
        Context context = this.f7330;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.MT_Protector);
        int width = view.getWidth() >= dimensionPixelOffset ? i : view.getWidth() / 2;
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.MT_Protector);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z ? R.dimen.MT_Protector : R.dimen.MT_Protector);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            for (Context context2 = view.getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                if (context2 instanceof Activity) {
                    rootView = ((Activity) context2).getWindow().getDecorView();
                    break;
                }
            }
        }
        View view2 = this.f7329;
        if (rootView != null) {
            Rect rect = this.f7335;
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left < 0 && rect.top < 0) {
                Resources resources = context.getResources();
                int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            int[] iArr = this.f7331;
            rootView.getLocationOnScreen(iArr);
            int[] iArr2 = this.f7333;
            view.getLocationOnScreen(iArr2);
            int i4 = iArr2[0] - iArr[0];
            iArr2[0] = i4;
            iArr2[1] = iArr2[1] - iArr[1];
            layoutParams.x = (i4 + width) - (rootView.getWidth() / 2);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i5 = iArr2[1];
            int i6 = ((i3 + i5) - dimensionPixelOffset3) - measuredHeight;
            int i7 = i5 + height + dimensionPixelOffset3;
            if (z) {
                if (i6 >= 0) {
                    layoutParams.y = i6;
                } else {
                    layoutParams.y = i7;
                }
            } else if (measuredHeight + i7 <= rect.height()) {
                layoutParams.y = i7;
            } else {
                layoutParams.y = i6;
            }
        }
        ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo6617() {
        if (mo6619()) {
            ((WindowManager) this.f7330.getSystemService("window")).removeView(this.f7329);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo6619() {
        return this.f7329.getParent() != null;
    }
}
