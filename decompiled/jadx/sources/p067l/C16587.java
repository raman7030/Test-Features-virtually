package p067l;

/* JADX INFO: renamed from: l.ܶۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16587 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C14849 f48726;

    public C16587(C14849 c14849) {
        this.f48726 = c14849;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37589(C7673 c7673) {
        int i = c7673.f20122;
        C14849 c14849 = this.f48726;
        if (i == 1) {
            c14849.mLayout.onItemsAdded(c14849, c7673.f20125, c7673.f20123);
            return;
        }
        if (i == 2) {
            c14849.mLayout.onItemsRemoved(c14849, c7673.f20125, c7673.f20123);
        } else if (i == 4) {
            c14849.mLayout.onItemsUpdated(c14849, c7673.f20125, c7673.f20123, c7673.f20124);
        } else {
            if (i != 8) {
                return;
            }
            c14849.mLayout.onItemsMoved(c14849, c7673.f20125, c7673.f20123, 1);
        }
    }
}
