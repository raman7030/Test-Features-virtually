package p067l;

/* JADX INFO: renamed from: l.᩷ۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes5.dex */
public final class C22044 implements InterfaceC1885 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractC7291 f69368;

    public C22044(AbstractC7291 abstractC7291) {
        this.f69368 = abstractC7291;
    }

    @Override // p067l.InterfaceC1885
    /* JADX INFO: renamed from: ֫ */
    public final void mo7780(Object obj) {
        C1185 c1185 = (C1185) obj;
        AbstractC7291 abstractC7291 = this.f69368;
        C5950 c5950 = (C5950) abstractC7291.f19084.pollFirst();
        if (c5950 == null) {
            return;
        }
        String str = c5950.f14696;
        int i = c5950.f14695;
        ComponentCallbacksC11117 componentCallbacksC11117M30446 = abstractC7291.f19076.m30446(str);
        if (componentCallbacksC11117M30446 == null) {
            return;
        }
        componentCallbacksC11117M30446.onActivityResult(i, c1185.m20659(), c1185.m20658());
    }
}
