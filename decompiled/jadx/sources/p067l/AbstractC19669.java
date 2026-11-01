package p067l;

/* JADX INFO: renamed from: l.ᩳܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ5 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19669 extends AbstractC23672 {

    /* JADX INFO: renamed from: ᩸ */
    public int f59802;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 16720;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract float mo23874(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo44679();

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC18327 mo23875(int i, int i2);

    public AbstractC19669(int i) {
        this.f59802 = i;
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        return ((long) mo44679()) - ((long) this.f59802);
    }

    @Override // p067l.InterfaceC3437
    /* JADX INFO: renamed from: ۧ, reason: merged with bridge method [inline-methods] */
    public boolean tryAdvance(InterfaceC6278 interfaceC6278) {
        if (this.f59802 >= mo44679()) {
            return false;
        }
        int i = this.f59802;
        this.f59802 = i + 1;
        interfaceC6278.mo14251(mo23874(i));
        return true;
    }

    @Override // p067l.AbstractC23672, p067l.InterfaceC3437
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public void forEachRemaining(InterfaceC6278 interfaceC6278) {
        int iMo44679 = mo44679();
        while (true) {
            int i = this.f59802;
            if (i >= iMo44679) {
                return;
            }
            interfaceC6278.mo14251(mo23874(i));
            this.f59802++;
        }
    }
}
