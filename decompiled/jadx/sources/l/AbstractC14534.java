package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܳ۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M59C */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14534 implements InterfaceC9272 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Comparator f44527 = new C17357();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC9272 interfaceC9272 = (InterfaceC9272) obj;
        int iCompareTo = getName().compareTo(interfaceC9272.getName());
        return iCompareTo != 0 ? iCompareTo : getValue().compareTo(interfaceC9272.getValue());
    }

    public final int hashCode() {
        return getValue().hashCode() + (getName().hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof InterfaceC9272)) {
            InterfaceC9272 interfaceC9272 = (InterfaceC9272) obj;
            if (getName().equals(interfaceC9272.getName()) && getValue().equals(interfaceC9272.getValue())) {
                return true;
            }
        }
        return false;
    }
}
