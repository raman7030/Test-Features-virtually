package p067l;

/* JADX INFO: renamed from: l.᩶ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAOW */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21309 extends AbstractC9908 {

    /* JADX INFO: renamed from: ᩶ */
    public boolean f67161;

    /* JADX INFO: renamed from: ᩹ */
    public int f67162;

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo15786();

    public AbstractC21309(int i) {
        super(i);
        this.f67162 = -1;
        this.f67161 = false;
    }

    public AbstractC21309(int i, int i2) {
        super(i);
        this.f67162 = i2;
        this.f67161 = true;
    }

    @Override // p067l.AbstractC9908
    /* JADX INFO: renamed from: ֫ */
    public final int mo23206() {
        return this.f67161 ? this.f67162 : mo15786();
    }

    @Override // p067l.AbstractC9908, p067l.AbstractC24322, p067l.InterfaceC16847
    public final InterfaceC3202 trySplit() {
        InterfaceC3202 interfaceC3202TrySplit = super.trySplit();
        if (!this.f67161 && interfaceC3202TrySplit != null) {
            this.f67162 = mo15786();
            this.f67161 = true;
        }
        return interfaceC3202TrySplit;
    }
}
