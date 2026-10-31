package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۟ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: H38Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C7552 implements InterfaceC6141, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f23334;

    public C7552(Object obj) {
        this.f23334 = obj;
    }

    @Override // l.InterfaceC6141
    public final Object get() {
        return this.f23334;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7552) {
            return C11003.equals(this.f23334, ((C7552) obj).f23334);
        }
        return false;
    }

    public final int hashCode() {
        return C11003.hash(this.f23334);
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f23334 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
