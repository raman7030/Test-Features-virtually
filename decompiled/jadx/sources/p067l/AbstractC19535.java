package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩳ۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 857M */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19535 implements InterfaceC21909 {

    /* JADX INFO: renamed from: ᩸ */
    public static final Comparator f59481 = new C18193();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC21909 interfaceC21909 = (InterfaceC21909) obj;
        int iCompare = Integer.compare(getVisibility(), interfaceC21909.getVisibility());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = getType().compareTo(interfaceC21909.getType());
        return iCompareTo != 0 ? iCompareTo : C10330.m23943(getElements(), interfaceC21909.getElements());
    }

    public final int hashCode() {
        return getElements().hashCode() + ((getType().hashCode() + (getVisibility() * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC21909)) {
            return false;
        }
        InterfaceC21909 interfaceC21909 = (InterfaceC21909) obj;
        return getVisibility() == interfaceC21909.getVisibility() && getType().equals(interfaceC21909.getType()) && getElements().equals(interfaceC21909.getElements());
    }
}
