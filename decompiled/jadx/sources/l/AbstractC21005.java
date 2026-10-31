package l;

/* JADX INFO: renamed from: l.᩷ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21005 extends AbstractC18182 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f67814;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f67815;

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo35370();

    public AbstractC21005(int i) {
        super(i);
        this.f67815 = -1;
        this.f67814 = false;
    }

    public AbstractC21005(int i, int i2) {
        super(i);
        this.f67815 = i2;
        this.f67814 = true;
    }

    @Override // l.AbstractC18182
    /* JADX INFO: renamed from: ֫ */
    public final int mo42413() {
        return this.f67814 ? this.f67815 : mo35370();
    }

    @Override // l.AbstractC18182, l.AbstractC1153, l.InterfaceC15234
    public final InterfaceC16770 trySplit() {
        InterfaceC16770 interfaceC16770TrySplit = super.trySplit();
        if (!this.f67814 && interfaceC16770TrySplit != null) {
            this.f67815 = mo35370();
            this.f67814 = true;
        }
        return interfaceC16770TrySplit;
    }
}
