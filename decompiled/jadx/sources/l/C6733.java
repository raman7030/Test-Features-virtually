package l;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;
import com.alipay.sdk.m.t0.b;

/* JADX INFO: renamed from: l.ۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14IM */
/* JADX INFO: loaded from: classes2.dex */
public final class C6733 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final PointerIcon f20916;

    public C6733(PointerIcon pointerIcon) {
        this.f20916 = pointerIcon;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m18330() {
        return this.f20916;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6733 m18329(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C6733(C23666.m52190(context, b.c));
        }
        return new C6733(null);
    }
}
