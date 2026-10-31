package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩳ۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 857M */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18063 implements InterfaceC20561 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Comparator f56276 = new C16651();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC20561 interfaceC20561 = (InterfaceC20561) obj;
        int iCompare = Integer.compare(getVisibility(), interfaceC20561.getVisibility());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = getType().compareTo(interfaceC20561.getType());
        return iCompareTo != 0 ? iCompareTo : C8377.m21972(getElements(), interfaceC20561.getElements());
    }

    public final int hashCode() {
        return getElements().hashCode() + ((getType().hashCode() + (getVisibility() * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC20561)) {
            return false;
        }
        InterfaceC20561 interfaceC20561 = (InterfaceC20561) obj;
        return getVisibility() == interfaceC20561.getVisibility() && getType().equals(interfaceC20561.getType()) && getElements().equals(interfaceC20561.getElements());
    }
}
