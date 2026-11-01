package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܽۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18146 implements Comparator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f54175;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f54175) {
            case 0:
                return ((Integer) obj).compareTo((Integer) obj2);
            default:
                return Integer.compare(((InterfaceC13340) obj).mo17550(), ((InterfaceC13340) obj2).mo17550());
        }
    }
}
