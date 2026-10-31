package l;

/* JADX INFO: renamed from: l.ܶۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14961 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13132 f45614;

    public C14961(C13132 c13132) {
        this.f45614 = c13132;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35437(C5581 c5581) {
        int i = c5581.f17282;
        C13132 c13132 = this.f45614;
        if (i == 1) {
            c13132.mLayout.onItemsAdded(c13132, c5581.f17285, c5581.f17283);
            return;
        }
        if (i == 2) {
            c13132.mLayout.onItemsRemoved(c13132, c5581.f17285, c5581.f17283);
        } else if (i == 4) {
            c13132.mLayout.onItemsUpdated(c13132, c5581.f17285, c5581.f17283, c5581.f17284);
        } else {
            if (i != 8) {
                return;
            }
            c13132.mLayout.onItemsMoved(c13132, c5581.f17285, c5581.f17283, 1);
        }
    }
}
