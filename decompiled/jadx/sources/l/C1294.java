package l;

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
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.alipay.sdk.m.t0.b;

/* JADX INFO: renamed from: l.֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X58Q */
/* JADX INFO: loaded from: classes.dex */
public class C1294 {

    /* JADX INFO: renamed from: ۢ֨ۖ, reason: not valid java name and contains not printable characters */
    public static int f4556;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View f4557;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Context f4558;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f4559;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final WindowManager.LayoutParams f4560;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f4561;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TextView f4562;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Rect f4563;

    /* JADX INFO: renamed from: ֨ۙ۟, reason: not valid java name and contains not printable characters */
    public static boolean m4369(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: ֫᩻ܽ, reason: not valid java name and contains not printable characters */
    public static void m4370(Object obj, float f) {
        ((View) obj).setAlpha(f);
    }

    /* JADX INFO: renamed from: ۖ᩶ۜ, reason: not valid java name and contains not printable characters */
    public static long m4371() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ۘۖ֡, reason: not valid java name and contains not printable characters */
    public static int m4372() {
        return 694713445;
    }

    /* JADX INFO: renamed from: ۠᩹ܺ, reason: not valid java name and contains not printable characters */
    public static String m4373(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۡᩴ᩷, reason: not valid java name and contains not printable characters */
    public static String[] m4374(Object obj, Object obj2) {
        return ((String) obj).split((String) obj2);
    }

    /* JADX INFO: renamed from: ۧ֫ܽ, reason: not valid java name and contains not printable characters */
    public static JSONObject m4375(Object obj, Object obj2, int i) {
        return ((JSONObject) obj).add((String) obj2, i);
    }

    /* JADX INFO: renamed from: ۬ۖܺ, reason: not valid java name and contains not printable characters */
    public static void m4376(Object obj) {
        ((AbstractC19902) obj).notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۬᩶ᩳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13049 m4377(Object obj) {
        return ((InterfaceC12344) obj).edit();
    }

    /* JADX INFO: renamed from: ܶ֨ۧ, reason: not valid java name and contains not printable characters */
    public static String m4378(Object obj) {
        return ((C23881) obj).m52602();
    }

    /* JADX INFO: renamed from: ܿ֡᩵, reason: not valid java name and contains not printable characters */
    public static byte[] m4379(Object obj) {
        return ((AbstractC15440) obj).m36506();
    }

    /* JADX INFO: renamed from: ᩳۨۘ, reason: not valid java name and contains not printable characters */
    public static void m4380(Object obj, int i, Object obj2) {
        ((C19258) obj).m44442(i, (DialogInterface.OnClickListener) obj2);
    }

    /* JADX INFO: renamed from: ᩴۡܶ, reason: not valid java name and contains not printable characters */
    public static void m4381(Object obj, Object obj2) {
        ((C13132) obj).setAdapter((AbstractC19902) obj2);
    }

    /* JADX INFO: renamed from: ᩶ܳ᩹, reason: not valid java name and contains not printable characters */
    public static void m4382(Object obj, Object obj2, boolean z) {
        ((Bundle) obj).putBoolean((String) obj2, z);
    }

    /* JADX INFO: renamed from: ᩷ۢ᩶, reason: not valid java name and contains not printable characters */
    public static void m4383(Object obj, long j) {
        C4925.m14316((Runnable) obj, j);
    }

    /* JADX INFO: renamed from: ᩹֨ۡ, reason: not valid java name and contains not printable characters */
    public static int m4384(float f) {
        return C11266.m27878(f);
    }

    public C1294(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f4560 = layoutParams;
        this.f4563 = new Rect();
        this.f4561 = new int[2];
        this.f4559 = new int[2];
        this.f4558 = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) null);
        this.f4557 = viewInflate;
        this.f4562 = (TextView) viewInflate.findViewById(R.id.MT_Protector);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = b.c;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.MT_Protector;
        layoutParams.flags = 24;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo4386(View view, int i, int i2, boolean z, CharSequence charSequence) {
        int height;
        int i3;
        if (mo4387()) {
            mo4385();
        }
        this.f4562.setText(charSequence);
        IBinder applicationWindowToken = view.getApplicationWindowToken();
        WindowManager.LayoutParams layoutParams = this.f4560;
        layoutParams.token = applicationWindowToken;
        Context context = this.f4558;
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
        View view2 = this.f4557;
        if (rootView != null) {
            Rect rect = this.f4563;
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left < 0 && rect.top < 0) {
                Resources resources = context.getResources();
                int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            int[] iArr = this.f4559;
            rootView.getLocationOnScreen(iArr);
            int[] iArr2 = this.f4561;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo4385() {
        if (mo4387()) {
            ((WindowManager) this.f4558.getSystemService("window")).removeView(this.f4557);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean mo4387() {
        return this.f4557.getParent() != null;
    }
}
