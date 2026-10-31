package l;

/* JADX INFO: renamed from: l.ۢۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes3.dex */
public final class C9414 implements InterfaceC21030 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5180 f28563;

    public C9414(AbstractC5180 abstractC5180) {
        this.f28563 = abstractC5180;
    }

    @Override // l.InterfaceC21030
    /* JADX INFO: renamed from: ֫ */
    public final void mo5550(Object obj) {
        C6918 c6918 = (C6918) obj;
        AbstractC5180 abstractC5180 = this.f28563;
        C3769 c3769 = (C3769) abstractC5180.f16243.pollFirst();
        if (c3769 == null) {
            return;
        }
        String str = c3769.f11890;
        int i = c3769.f11889;
        ComponentCallbacksC9205 componentCallbacksC9205M28400 = abstractC5180.f16235.m28400(str);
        if (componentCallbacksC9205M28400 == null) {
            return;
        }
        componentCallbacksC9205M28400.onActivityResult(i, c6918.m18710(), c6918.m18709());
    }
}
