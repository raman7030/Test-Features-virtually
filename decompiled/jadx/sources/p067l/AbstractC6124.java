package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y676 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6124 extends AbstractC20877 implements InterfaceC2873 {
    @Override // p067l.InterfaceC2873
    public final int hashCode() {
        return mo4624().hashCode() + (mo4625().hashCode() * 31);
    }

    @Override // p067l.InterfaceC2873
    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC2873)) {
            return false;
        }
        InterfaceC2873 interfaceC2873 = (InterfaceC2873) obj;
        return mo4625().equals(interfaceC2873.mo4625()) && C3624.m6845(mo4624(), interfaceC2873.mo4624());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC2873 interfaceC2873) {
        int iCompareTo = mo4625().compareTo(interfaceC2873.mo4625());
        return iCompareTo != 0 ? iCompareTo : C10330.m23942(AbstractC12093.m27885(), mo4624(), interfaceC2873.mo4624());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        Iterator it = mo4624().iterator();
        while (it.hasNext()) {
            sb.append((CharSequence) it.next());
        }
        sb.append(')');
        sb.append(mo4625());
        return sb.toString();
    }
}
