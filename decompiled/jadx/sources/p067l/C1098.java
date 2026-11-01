package p067l;

import android.os.Build;
import android.view.DisplayCutout;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۚۛ */
/* JADX INFO: compiled from: 51AH */
/* JADX INFO: loaded from: classes2.dex */
public final class C1098 {

    /* JADX INFO: renamed from: ֫ */
    public final DisplayCutout f18963;

    public C1098(DisplayCutout displayCutout) {
        this.f18963 = displayCutout;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m16652() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0853.m3878(this.f18963);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m16649() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0853.m3876(this.f18963);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m16650() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0853.m3877(this.f18963);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m16651() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0853.m3879(this.f18963);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1098.class != obj.getClass()) {
            return false;
        }
        return C12826.equals(this.f18963, ((C1098) obj).f18963);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f18963;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f18963 + C0249l.f1198d;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1098 m16648(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C1098(displayCutout);
    }
}
