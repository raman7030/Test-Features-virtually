package p067l;

/* JADX INFO: renamed from: l.ᩴ۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y68W */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20206 extends AbstractC20877 implements InterfaceC7568 {
    @Override // p067l.InterfaceC7568
    public final int hashCode() {
        return mo5852().hashCode() + ((mo5855().hashCode() + ((getName().hashCode() + (mo5853().hashCode() * 31)) * 31)) * 31);
    }

    @Override // p067l.InterfaceC7568
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof InterfaceC7568)) {
            InterfaceC7568 interfaceC7568 = (InterfaceC7568) obj;
            if (mo5853().equals(interfaceC7568.mo5853()) && getName().equals(interfaceC7568.getName()) && mo5855().equals(interfaceC7568.mo5855()) && C3624.m6845(mo5852(), interfaceC7568.mo5852())) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return C16010.m36382((InterfaceC7568) this, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC7568 interfaceC7568) {
        int iCompareTo = mo5853().compareTo(interfaceC7568.mo5853());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = getName().compareTo(interfaceC7568.getName());
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        int iCompareTo3 = mo5855().compareTo(interfaceC7568.mo5855());
        return iCompareTo3 != 0 ? iCompareTo3 : C10330.m23942(AbstractC12093.m27885(), mo5852(), interfaceC7568.mo5852());
    }
}
