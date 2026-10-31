package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 05T5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20491 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Context f66063;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20491 m46951(Context context) {
        C20491 c20491 = new C20491();
        c20491.f66063 = context;
        return c20491;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m46955() {
        Configuration configuration = this.f66063.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m46953() {
        return this.f66063.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m46954() {
        return this.f66063.getResources().getBoolean(R.bool.MT_Protector);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m46956() {
        Context context = this.f66063;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C3390.f10696, R.attr.MT_Protector, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = context.getResources();
        if (!m46954()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.MT_Protector));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m46952() {
        return this.f66063.getApplicationInfo().targetSdkVersion < 14;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m46957() {
        return this.f66063.getResources().getDimensionPixelSize(R.dimen.MT_Protector);
    }
}
