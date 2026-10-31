package l;

import android.os.Build;
import android.view.DisplayCutout;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۚۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51AH */
/* JADX INFO: loaded from: classes2.dex */
public final class C5157 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final DisplayCutout f16124;

    public C5157(DisplayCutout displayCutout) {
        this.f16124 = displayCutout;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m14744() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0217.m1465(this.f16124);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14741() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0217.m1463(this.f16124);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m14742() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0217.m1464(this.f16124);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m14743() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0217.m1466(this.f16124);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5157.class != obj.getClass()) {
            return false;
        }
        return C11003.equals(this.f16124, ((C5157) obj).f16124);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f16124;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f16124 + l.d;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5157 m14740(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C5157(displayCutout);
    }
}
