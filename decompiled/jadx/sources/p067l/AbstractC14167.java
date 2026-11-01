package p067l;

/* JADX INFO: renamed from: l.۫۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 3ANU */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14167 extends AbstractC8132 {
    /* JADX INFO: renamed from: ܳ */
    public abstract boolean mo32647();

    /* JADX INFO: renamed from: ᩻ */
    public abstract boolean mo32649();

    /* JADX INFO: renamed from: ᩷ */
    public Object mo32648() {
        AbstractC22157 abstractC22157M18852 = m18852();
        return abstractC22157M18852 == null ? C12156.f33987 : abstractC22157M18852.mo44287();
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo32645(AbstractC24838 abstractC24838) {
        int iM49635;
        C22039 c22039M49642;
        if (mo32647()) {
            C18685 c18685M18851 = m18851();
            do {
                c22039M49642 = c18685M18851.m49642();
                if (c22039M49642 instanceof AbstractC22157) {
                    return false;
                }
            } while (!c22039M49642.m49637(abstractC24838, c18685M18851));
        } else {
            C18685 c18685M18852 = m18851();
            C14837 c14837 = new C14837(abstractC24838, this);
            do {
                C22039 c22039M49643 = c18685M18852.m49642();
                if (c22039M49643 instanceof AbstractC22157) {
                    return false;
                }
                iM49635 = c22039M49643.m49635(abstractC24838, c18685M18852, c14837);
                if (iM49635 != 1) {
                }
            } while (iM49635 != 2);
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC9473 m32646() {
        return new C21544(this);
    }
}
