package p067l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩶᩻ */
/* JADX INFO: compiled from: 05T5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1858 {

    /* JADX INFO: renamed from: ֫ */
    public Context f68742;

    /* JADX INFO: renamed from: ֫ */
    public static C1858 m49274(Context context) {
        C1858 c1858 = new C1858();
        c1858.f68742 = context;
        return c1858;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m49278() {
        Configuration configuration = this.f68742.getResources().getConfiguration();
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

    /* JADX INFO: renamed from: ۧ */
    public final int m49276() {
        return this.f68742.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m49277() {
        return this.f68742.getResources().getBoolean(R.bool.MT_Protector);
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m49279() {
        Context context = this.f68742;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C1010.f13503, R.attr.MT_Protector, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = context.getResources();
        if (!m49277()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.MT_Protector));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m49275() {
        return this.f68742.getApplicationInfo().targetSdkVersion < 14;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m49280() {
        return this.f68742.getResources().getDimensionPixelSize(R.dimen.MT_Protector);
    }
}
