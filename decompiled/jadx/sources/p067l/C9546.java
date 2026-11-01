package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۟ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: H38Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C9546 implements InterfaceC8205, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final Object f26246;

    public C9546(Object obj) {
        this.f26246 = obj;
    }

    @Override // p067l.InterfaceC8205
    public final Object get() {
        return this.f26246;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9546) {
            return C12826.equals(this.f26246, ((C9546) obj).f26246);
        }
        return false;
    }

    public final int hashCode() {
        return C12826.hash(this.f26246);
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f26246 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
