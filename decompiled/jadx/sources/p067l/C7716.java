package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۚ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D77D */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7716 implements Comparator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f20242;

    public /* synthetic */ C7716(int i) {
        this.f20242 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f20242) {
            case 0:
                return C14421.f41223.compare(((C24299) obj).f76963, ((C24299) obj2).f76963);
            default:
                return ((AbstractC17043) obj).getName().compareToIgnoreCase(((AbstractC17043) obj2).getName());
        }
    }
}
