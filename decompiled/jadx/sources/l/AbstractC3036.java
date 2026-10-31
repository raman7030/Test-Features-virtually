package l;

/* JADX INFO: renamed from: l.ۗۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3036 extends AbstractC15029 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f9568;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f9569;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract int mo9287();

    public AbstractC3036(int i) {
        super(i);
        this.f9569 = -1;
        this.f9568 = false;
    }

    public AbstractC3036(int i, int i2) {
        super(i);
        this.f9569 = i2;
        this.f9568 = true;
    }

    @Override // l.AbstractC15029
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo9286() {
        return this.f9568 ? this.f9569 : mo9287();
    }

    @Override // l.AbstractC15029, l.InterfaceC15234
    public final InterfaceC7975 trySplit() {
        InterfaceC7975 interfaceC7975TrySplit = super.trySplit();
        if (!this.f9568 && interfaceC7975TrySplit != null) {
            this.f9569 = mo9287();
            this.f9568 = true;
        }
        return interfaceC7975TrySplit;
    }
}
