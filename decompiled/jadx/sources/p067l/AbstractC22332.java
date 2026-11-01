package p067l;

/* JADX INFO: renamed from: l.᩷ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22332 extends AbstractC19649 {

    /* JADX INFO: renamed from: ᩶ */
    public boolean f70499;

    /* JADX INFO: renamed from: ᩹ */
    public int f70500;

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo37522();

    public AbstractC22332(int i) {
        super(i);
        this.f70500 = -1;
        this.f70499 = false;
    }

    public AbstractC22332(int i, int i2) {
        super(i);
        this.f70500 = i2;
        this.f70499 = true;
    }

    @Override // p067l.AbstractC19649
    /* JADX INFO: renamed from: ֫ */
    public final int mo44674() {
        return this.f70499 ? this.f70500 : mo37522();
    }

    @Override // p067l.AbstractC19649, p067l.AbstractC3464, p067l.InterfaceC16847
    public final InterfaceC18307 trySplit() {
        InterfaceC18307 interfaceC18307TrySplit = super.trySplit();
        if (!this.f70499 && interfaceC18307TrySplit != null) {
            this.f70500 = mo37522();
            this.f70499 = true;
        }
        return interfaceC18307TrySplit;
    }
}
