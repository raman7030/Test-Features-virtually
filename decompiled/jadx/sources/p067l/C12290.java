package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۤܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6J0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12290 implements Comparator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f34330;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f34330) {
            case 0:
                return Integer.compare(((C21678) obj).mo5199(), ((C21678) obj2).mo5199());
            default:
                AbstractC17043 abstractC17043 = (AbstractC17043) obj;
                AbstractC17043 abstractC17044 = (AbstractC17043) obj2;
                boolean zMo25087 = abstractC17043.mo25087();
                if (zMo25087 == abstractC17044.mo25087()) {
                    return abstractC17043.getName().compareToIgnoreCase(abstractC17044.getName());
                }
                return zMo25087 ? -1 : 1;
        }
    }
}
