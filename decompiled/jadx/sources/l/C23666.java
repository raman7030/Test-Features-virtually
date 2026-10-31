package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* JADX INFO: renamed from: l.᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14IM */
/* JADX INFO: loaded from: classes.dex */
public final class C23666 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PointerIcon m52190(Context context, int i) {
        return PointerIcon.getSystemIcon(context, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PointerIcon m52192(Bitmap bitmap, float f, float f2) {
        return PointerIcon.create(bitmap, f, f2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PointerIcon m52191(Resources resources, int i) {
        return PointerIcon.load(resources, i);
    }
}
