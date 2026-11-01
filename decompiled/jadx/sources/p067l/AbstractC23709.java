package p067l;

/* JADX INFO: renamed from: l.᩹ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29QF */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23709 implements InterfaceC21187 {

    /* JADX INFO: renamed from: ᩸ */
    public int f75456;

    /* JADX INFO: renamed from: ᩹ */
    public int f75457;

    public AbstractC23709(int i, int i2) {
        this.f75457 = i;
        this.f75456 = i2;
    }

    @Override // p067l.InterfaceC21187
    /* JADX INFO: renamed from: ᩴ֫ */
    public final int mo47854() {
        return this.f75457;
    }

    @Override // p067l.InterfaceC21187
    /* JADX INFO: renamed from: ᩳۧ */
    public final int mo47853() {
        return this.f75456;
    }

    @Override // p067l.InterfaceC10457
    /* JADX INFO: renamed from: ֫ */
    public final void mo14241(InterfaceC10457 interfaceC10457) {
        InterfaceC21187 interfaceC21187 = (InterfaceC21187) interfaceC10457;
        if (this.f75457 != interfaceC21187.mo47854()) {
            throw new RuntimeException();
        }
        if (this.f75456 != interfaceC21187.mo47853()) {
            throw new RuntimeException();
        }
    }
}
