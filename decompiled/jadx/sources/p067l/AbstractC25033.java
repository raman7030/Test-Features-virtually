package p067l;

/* JADX INFO: renamed from: l.᩻ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ5 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC25033 extends AbstractC19669 {

    /* JADX INFO: renamed from: ᩶ */
    public boolean f79919;

    /* JADX INFO: renamed from: ᩹ */
    public int f79920;

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo23876();

    @Override // p067l.AbstractC23672, p067l.InterfaceC16847
    public final InterfaceC18327 trySplit() {
        InterfaceC18327 interfaceC18327Mo23875;
        int iMo44679 = mo44679();
        int i = this.f59802;
        int iMo446710 = mo44679();
        int i2 = this.f59802;
        int iM21912 = C9417.m21912(iMo446710, i2, 2, i);
        if (iM21912 == i2 || iM21912 == iMo44679) {
            interfaceC18327Mo23875 = null;
        } else {
            if (iM21912 < i2 || iM21912 > iMo44679) {
                StringBuilder sbM34408 = C15033.m34408(iM21912, "splitPoint ", " outside of range of current position ");
                sbM34408.append(this.f59802);
                sbM34408.append(" and range end ");
                sbM34408.append(iMo44679);
                throw new IndexOutOfBoundsException(sbM34408.toString());
            }
            interfaceC18327Mo23875 = mo23875(i2, iM21912);
            this.f59802 = iM21912;
        }
        if (!this.f79919 && interfaceC18327Mo23875 != null) {
            this.f79920 = mo23876();
            this.f79919 = true;
        }
        return interfaceC18327Mo23875;
    }

    public AbstractC25033(int i) {
        super(i);
        this.f79920 = -1;
        this.f79919 = false;
    }

    public AbstractC25033(int i, int i2) {
        super(i);
        this.f79920 = i2;
        this.f79919 = true;
    }

    @Override // p067l.AbstractC19669
    /* JADX INFO: renamed from: ֫ */
    public final int mo44679() {
        return this.f79919 ? this.f79920 : mo23876();
    }
}
