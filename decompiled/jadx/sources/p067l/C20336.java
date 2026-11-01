package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: LBAF */
/* JADX INFO: loaded from: classes5.dex */
public final class C20336 extends AbstractC3491 {

    /* JADX INFO: renamed from: ۜ */
    public final C16981 f62805;

    /* JADX INFO: renamed from: ܳ */
    public final int f62806;

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC15405 f62807;

    /* JADX INFO: renamed from: ᩷ */
    public final ArrayList f62808;

    /* JADX INFO: renamed from: ᩻ */
    public final int f62809;

    public C20336(C12054 c12054, C16981 c16981, ArrayList arrayList, AbstractC15405 abstractC15405) {
        super(c12054, C21442.f67643);
        if (c16981 == null) {
            throw new NullPointerException("user == null");
        }
        if (arrayList == null) {
            throw new NullPointerException("values == null");
        }
        if (arrayList.size() <= 0) {
            throw new IllegalArgumentException("Illegal number of init values");
        }
        this.f62807 = abstractC15405;
        if (abstractC15405 == C14260.f40617 || abstractC15405 == C14260.f40608) {
            this.f62806 = 1;
        } else if (abstractC15405 == C14260.f40626 || abstractC15405 == C14260.f40613) {
            this.f62806 = 2;
        } else if (abstractC15405 == C14260.f40606 || abstractC15405 == C14260.f40618) {
            this.f62806 = 4;
        } else if (abstractC15405 == C14260.f40620 || abstractC15405 == C14260.f40615) {
            this.f62806 = 8;
        } else {
            throw new IllegalArgumentException("Unexpected constant type");
        }
        this.f62805 = c16981;
        this.f62808 = arrayList;
        this.f62809 = arrayList.size();
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ۧ */
    public final int mo4465() {
        return (((this.f62809 * this.f62806) + 1) / 2) + 4;
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final void mo4463(C19705 c19705) {
        ArrayList arrayList = this.f62808;
        int size = arrayList.size();
        c19705.m44770(768);
        int i = this.f62806;
        c19705.m44770(i);
        c19705.m44773(this.f62809);
        if (i == 1) {
            for (int i2 = 0; i2 < size; i2++) {
                c19705.m44776((byte) ((AbstractC2860) ((AbstractC15405) arrayList.get(i2))).mo4598());
            }
        } else if (i == 2) {
            for (int i3 = 0; i3 < size; i3++) {
                c19705.m44770((short) ((AbstractC2860) ((AbstractC15405) arrayList.get(i3))).mo4598());
            }
        } else if (i == 4) {
            for (int i4 = 0; i4 < size; i4++) {
                c19705.m44773(((AbstractC2860) ((AbstractC15405) arrayList.get(i4))).mo4598());
            }
        } else if (i == 8) {
            for (int i5 = 0; i5 < size; i5++) {
                c19705.m44761(((AbstractC7555) ((AbstractC15405) arrayList.get(i5))).mo4594());
            }
        }
        if (i != 1 || size % 2 == 0) {
            return;
        }
        c19705.m44776(0);
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6924 mo4462(C21442 c21442) {
        return new C20336(m15863(), this.f62805, this.f62808, this.f62807);
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ֫ */
    public final String mo4461() {
        StringBuilder sb = new StringBuilder(100);
        ArrayList arrayList = this.f62808;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append("\n    ");
            sb.append(i);
            sb.append(": ");
            sb.append(((AbstractC15405) arrayList.get(i)).mo4819());
        }
        return sb.toString();
    }

    @Override // p067l.AbstractC6924
    /* JADX INFO: renamed from: ܺ */
    public final String mo4466() {
        int iM15870 = this.f62805.m15870();
        StringBuilder sb = new StringBuilder(100);
        ArrayList arrayList = this.f62808;
        int size = arrayList.size();
        sb.append("fill-array-data-payload // for fill-array-data @ ");
        sb.append(C16351.m37153(iM15870));
        for (int i = 0; i < size; i++) {
            sb.append("\n  ");
            sb.append(i);
            sb.append(": ");
            sb.append(((AbstractC15405) arrayList.get(i)).mo4819());
        }
        return sb.toString();
    }
}
