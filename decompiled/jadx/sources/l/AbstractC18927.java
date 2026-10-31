package l;

/* JADX INFO: renamed from: l.ᩴᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QS */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18927 implements InterfaceC2866 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f59642;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C15859 f59643;

    public AbstractC18927(int i, C15859 c15859) {
        this.f59642 = i;
        this.f59643 = c15859;
    }

    @Override // l.InterfaceC2866
    /* JADX INFO: renamed from: ܺ */
    public final int mo8776() {
        return this.f59642;
    }

    @Override // l.InterfaceC2866
    /* JADX INFO: renamed from: ۙ֫ */
    public final InterfaceC1022 mo8775() {
        return this.f59643;
    }

    @Override // l.InterfaceC8510
    /* JADX INFO: renamed from: ֫ */
    public final void mo12336(InterfaceC8510 interfaceC8510) {
        InterfaceC2866 interfaceC2866 = (InterfaceC2866) interfaceC8510;
        if (this.f59642 != interfaceC2866.mo8776()) {
            throw new RuntimeException();
        }
        InterfaceC1022 interfaceC1022Mo8775 = interfaceC2866.mo8775();
        C15859 c15859 = this.f59643;
        if (c15859.size() != interfaceC1022Mo8775.size()) {
            throw new RuntimeException();
        }
        for (int i = 0; i < c15859.size(); i++) {
            if (c15859.getInt(i) != interfaceC1022Mo8775.getInt(i)) {
                throw new RuntimeException();
            }
        }
    }
}
