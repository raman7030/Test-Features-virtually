package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۤܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6J0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10439 implements Comparator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31366;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f31366) {
            case 0:
                return Integer.compare(((C20317) obj).mo2870(), ((C20317) obj2).mo2870());
            default:
                AbstractC15440 abstractC15440 = (AbstractC15440) obj;
                AbstractC15440 abstractC15441 = (AbstractC15440) obj2;
                boolean zMo23113 = abstractC15440.mo23113();
                if (zMo23113 == abstractC15441.mo23113()) {
                    return abstractC15440.getName().compareToIgnoreCase(abstractC15441.getName());
                }
                return zMo23113 ? -1 : 1;
        }
    }
}
