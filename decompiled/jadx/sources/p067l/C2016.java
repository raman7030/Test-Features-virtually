package p067l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* JADX INFO: renamed from: l.᩻ۨ */
/* JADX INFO: compiled from: 14IM */
/* JADX INFO: loaded from: classes.dex */
public final class C2016 {
    /* JADX INFO: renamed from: ֫ */
    public static PointerIcon m54593(Context context, int i) {
        return PointerIcon.getSystemIcon(context, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static PointerIcon m54595(Bitmap bitmap, float f, float f2) {
        return PointerIcon.create(bitmap, f, f2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static PointerIcon m54594(Resources resources, int i) {
        return PointerIcon.load(resources, i);
    }
}
