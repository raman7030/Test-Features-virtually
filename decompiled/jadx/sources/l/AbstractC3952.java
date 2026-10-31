package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y676 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3952 extends AbstractC19475 implements InterfaceC0531 {
    @Override // l.InterfaceC0531
    public final int hashCode() {
        return mo2257().hashCode() + (mo2258().hashCode() * 31);
    }

    @Override // l.InterfaceC0531
    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC0531)) {
            return false;
        }
        InterfaceC0531 interfaceC0531 = (InterfaceC0531) obj;
        return mo2258().equals(interfaceC0531.mo2258()) && C1321.m4613(mo2257(), interfaceC0531.mo2257());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC0531 interfaceC0531) {
        int iCompareTo = mo2258().compareTo(interfaceC0531.mo2258());
        return iCompareTo != 0 ? iCompareTo : C8377.m21971(AbstractC10232.m25863(), mo2257(), interfaceC0531.mo2257());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        Iterator it = mo2257().iterator();
        while (it.hasNext()) {
            sb.append((CharSequence) it.next());
        }
        sb.append(')');
        sb.append(mo2258());
        return sb.toString();
    }
}
