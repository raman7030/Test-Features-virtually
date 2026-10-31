package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ᩴۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45IA */
/* JADX INFO: loaded from: classes5.dex */
public final class C18534 extends AbstractC10232 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC16724 f57440;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC10232 f57441;

    public C18534(InterfaceC16724 interfaceC16724, AbstractC10232 abstractC10232) {
        interfaceC16724.getClass();
        this.f57440 = interfaceC16724;
        this.f57441 = abstractC10232;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC16724 interfaceC16724 = this.f57440;
        return this.f57441.compare(interfaceC16724.apply(obj), interfaceC16724.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18534) {
            C18534 c18534 = (C18534) obj;
            if (this.f57440.equals(c18534.f57440) && this.f57441.equals(c18534.f57441)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C11003.hash(this.f57440, this.f57441);
    }

    public final String toString() {
        return this.f57441 + ".onResultOf(" + this.f57440 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
