package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ᩴۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45IA */
/* JADX INFO: loaded from: classes5.dex */
public final class C19983 extends AbstractC12093 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC18263 f60661;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC12093 f60662;

    public C19983(InterfaceC18263 interfaceC18263, AbstractC12093 abstractC12093) {
        interfaceC18263.getClass();
        this.f60661 = interfaceC18263;
        this.f60662 = abstractC12093;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC18263 interfaceC18263 = this.f60661;
        return this.f60662.compare(interfaceC18263.apply(obj), interfaceC18263.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C19983) {
            C19983 c19983 = (C19983) obj;
            if (this.f60661.equals(c19983.f60661) && this.f60662.equals(c19983.f60662)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C12826.hash(this.f60661, this.f60662);
    }

    public final String toString() {
        return this.f60662 + ".onResultOf(" + this.f60661 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
