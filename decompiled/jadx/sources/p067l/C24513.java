package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩺᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5XF */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24513 implements Comparator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f77657;

    public /* synthetic */ C24513(int i) {
        this.f77657 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f77657) {
            case 0:
                return -Long.compare(((C5738) obj).getSize(), ((C5738) obj2).getSize());
            case 1:
                return Integer.compare(((C12271) obj2).f34287, ((C12271) obj).f34287);
            case 2:
                return Integer.compare(((C21843) obj).f68735, ((C21843) obj2).f68735);
            default:
                return ((String) obj).compareToIgnoreCase((String) obj2);
        }
    }
}
