package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ܽۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16601 implements Comparator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50998;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f50998) {
            case 0:
                return ((Integer) obj).compareTo((Integer) obj2);
            default:
                return Integer.compare(((InterfaceC11544) obj).mo15639(), ((InterfaceC11544) obj2).mo15639());
        }
    }
}
