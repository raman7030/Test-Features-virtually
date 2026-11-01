package p067l;

/* JADX INFO: renamed from: l.᩷ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: AAP5 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22312 extends AbstractC19629 {

    /* JADX INFO: renamed from: ᩶ */
    public boolean f70455;

    /* JADX INFO: renamed from: ᩹ */
    public int f70456;

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo26381();

    public AbstractC22312(int i) {
        super(i);
        this.f70456 = -1;
        this.f70455 = false;
    }

    public AbstractC22312(int i, int i2) {
        super(i);
        this.f70456 = i2;
        this.f70455 = true;
    }

    @Override // p067l.AbstractC19629
    /* JADX INFO: renamed from: ֫ */
    public final int mo44527() {
        return this.f70455 ? this.f70456 : mo26381();
    }

    @Override // p067l.AbstractC19629, p067l.AbstractC24362, p067l.InterfaceC3437, p067l.InterfaceC16847
    public final InterfaceC18287 trySplit() {
        InterfaceC18287 interfaceC18287TrySplit = super.trySplit();
        if (!this.f70455 && interfaceC18287TrySplit != null) {
            this.f70456 = mo26381();
            this.f70455 = true;
        }
        return interfaceC18287TrySplit;
    }
}
