package l;

/* JADX INFO: renamed from: l.ۢۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8MM */
/* JADX INFO: loaded from: classes3.dex */
public final class C9381 implements InterfaceC17847 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16302 f28495 = new C16302(new byte[4], 4);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15729 f28496;

    @Override // l.InterfaceC17847
    /* JADX INFO: renamed from: ֫ */
    public final void mo22462(C9248 c9248, InterfaceC21830 interfaceC21830, C19259 c19259) {
    }

    public C9381(C15729 c15729) {
        this.f28496 = c15729;
    }

    @Override // l.InterfaceC17847
    /* JADX INFO: renamed from: ֫ */
    public final void mo22463(C17714 c17714) {
        C15729 c15729;
        if (c17714.m41456() == 0 && (c17714.m41456() & 128) != 0) {
            c17714.m41478(6);
            int iM41457 = c17714.m41457() / 4;
            int i = 0;
            while (true) {
                c15729 = this.f28496;
                if (i >= iM41457) {
                    break;
                }
                C16302 c16302 = this.f28495;
                c17714.m41461(0, 4, c16302.f50146);
                c16302.m38354(0);
                int iM38343 = c16302.m38343(16);
                c16302.m38351(3);
                if (iM38343 == 0) {
                    c16302.m38351(13);
                } else {
                    int iM38344 = c16302.m38343(13);
                    if (c15729.f48514.get(iM38344) == null) {
                        c15729.f48514.put(iM38344, new C17141(new C8675(c15729, iM38344)));
                        c15729.f48519++;
                    }
                }
                i++;
            }
            if (c15729.f48526 != 2) {
                c15729.f48514.remove(0);
            }
        }
    }
}
