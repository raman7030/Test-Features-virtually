package p067l;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;
import com.alipay.sdk.p010m.p050t0.C0215b;

/* JADX INFO: renamed from: l.ۜۨ */
/* JADX INFO: compiled from: 14IM */
/* JADX INFO: loaded from: classes2.dex */
public final class C1176 {

    /* JADX INFO: renamed from: ֫ */
    public final PointerIcon f23790;

    public C1176(PointerIcon pointerIcon) {
        this.f23790 = pointerIcon;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m20278() {
        return this.f23790;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1176 m20277(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C1176(C2016.m54593(context, C0215b.f1000c));
        }
        return new C1176(null);
    }
}
