package p067l;

/* JADX INFO: renamed from: l.ۗۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAQM */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5254 extends AbstractC16652 {

    /* JADX INFO: renamed from: ᩶ */
    public boolean f12370;

    /* JADX INFO: renamed from: ᩹ */
    public int f12371;

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo11329();

    public AbstractC5254(int i) {
        super(i);
        this.f12371 = -1;
        this.f12370 = false;
    }

    public AbstractC5254(int i, int i2) {
        super(i);
        this.f12371 = i2;
        this.f12370 = true;
    }

    @Override // p067l.AbstractC16652
    /* JADX INFO: renamed from: ֫ */
    public final int mo11328() {
        return this.f12370 ? this.f12371 : mo11329();
    }

    @Override // p067l.AbstractC16652, p067l.InterfaceC16847
    public final InterfaceC9948 trySplit() {
        InterfaceC9948 interfaceC9948TrySplit = super.trySplit();
        if (!this.f12370 && interfaceC9948TrySplit != null) {
            this.f12371 = mo11329();
            this.f12370 = true;
        }
        return interfaceC9948TrySplit;
    }
}
