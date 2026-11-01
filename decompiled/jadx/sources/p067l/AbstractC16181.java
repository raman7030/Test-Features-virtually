package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܳ۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M59C */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16181 implements InterfaceC11180 {

    /* JADX INFO: renamed from: ᩸ */
    public static final Comparator f47633 = new C18864();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC11180 interfaceC11180 = (InterfaceC11180) obj;
        int iCompareTo = getName().compareTo(interfaceC11180.getName());
        return iCompareTo != 0 ? iCompareTo : getValue().compareTo(interfaceC11180.getValue());
    }

    public final int hashCode() {
        return getValue().hashCode() + (getName().hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof InterfaceC11180)) {
            InterfaceC11180 interfaceC11180 = (InterfaceC11180) obj;
            if (getName().equals(interfaceC11180.getName()) && getValue().equals(interfaceC11180.getValue())) {
                return true;
            }
        }
        return false;
    }
}
