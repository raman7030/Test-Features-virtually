package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BFT */
/* JADX INFO: loaded from: classes4.dex */
public final class C13532 extends AbstractC14278 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C20069 f40383;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f40384;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f40385;

    @Override // l.AbstractC14278
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo29531() {
        return true;
    }

    @Override // l.AbstractC14278
    /* JADX INFO: renamed from: ۜ */
    public final C3135 mo29537() {
        return null;
    }

    @Override // l.AbstractC14278
    /* JADX INFO: renamed from: ܺ */
    public final AbstractC15834 mo29542() {
        return null;
    }

    @Override // l.AbstractC14278
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo29543() {
        return false;
    }

    public C13532(C21480 c21480, C16395 c16395) {
        super(c21480, c16395);
        this.f40385 = new ArrayList();
        this.f40384 = c21480.m48652();
    }

    public C13532(int i, C16395 c16395) {
        super(C21480.m48631(i, C7573.f23406), c16395);
        this.f40385 = new ArrayList();
        this.f40384 = i;
    }

    @Override // l.AbstractC14278
    public final Object clone() {
        throw new UnsupportedOperationException("can't clone phi");
    }

    @Override // l.AbstractC14278
    public final AbstractC14278 clone() {
        throw new UnsupportedOperationException("can't clone phi");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32570(C20630 c20630) {
        for (C11417 c11417 : this.f40385) {
            c11417.f34123 = c11417.f34123.m48641(c20630.m47194(c11417.f34123.m48652()).m34042().getType());
        }
        this.f40383 = null;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m32573() {
        return this.f40384;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32571(C21480 c21480, C16395 c16395) {
        this.f40385.add(new C11417(c21480, c16395.m38609(), c16395.m38607()));
        this.f40383 = null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32572(C21480 c21480) {
        ArrayList arrayList = new ArrayList();
        ArrayList<C11417> arrayList2 = this.f40385;
        for (C11417 c11417 : arrayList2) {
            if (c11417.f34123.m48652() == c21480.m48652()) {
                arrayList.add(c11417);
            }
        }
        arrayList2.removeAll(arrayList);
        this.f40383 = null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m32574(int i) {
        return ((C11417) this.f40385.get(i)).f34122;
    }

    @Override // l.AbstractC14278
    /* JADX INFO: renamed from: ۘ */
    public final C20069 mo29535() {
        C20069 c20069 = this.f40383;
        if (c20069 != null) {
            return c20069;
        }
        ArrayList arrayList = this.f40385;
        if (arrayList.size() == 0) {
            return C20069.f65002;
        }
        int size = arrayList.size();
        this.f40383 = new C20069(size);
        for (int i = 0; i < size; i++) {
            this.f40383.m40988(i, ((C11417) arrayList.get(i)).f34123);
        }
        this.f40383.mo20349();
        return this.f40383;
    }

    @Override // l.AbstractC14278
    /* JADX INFO: renamed from: ۧ */
    public final void mo29539(AbstractC2988 abstractC2988) {
        for (C11417 c11417 : this.f40385) {
            C21480 c21480 = c11417.f34123;
            C21480 c21480Mo9123 = abstractC2988.mo9123(c21480);
            c11417.f34123 = c21480Mo9123;
            if (c21480 != c21480Mo9123) {
                m34044().m38618().m47180(this, c21480, c11417.f34123);
            }
        }
        this.f40383 = null;
    }

    @Override // l.AbstractC14278
    /* JADX INFO: renamed from: ۠ */
    public final AbstractC15834 mo29538() {
        throw new IllegalArgumentException("Cannot convert phi insns to rop form");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m32569(int i, C20630 c20630) {
        ArrayList arrayList = new ArrayList();
        for (C11417 c11417 : this.f40385) {
            if (c11417.f34123.m48652() == i) {
                arrayList.add((C16395) c20630.m47190().get(c11417.f34122));
            }
        }
        return arrayList;
    }

    @Override // l.AbstractC14278
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo29544() {
        return C5772.m16231() && mo29540() != null;
    }

    @Override // l.AbstractC14278
    /* JADX INFO: renamed from: ֫ */
    public final void mo29533(InterfaceC17101 interfaceC17101) {
        interfaceC17101.mo7532(this);
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        StringBuilder sb = new StringBuilder(80);
        sb.append(C10191.f30620);
        sb.append(": phi");
        C21480 c21480M34042 = m34042();
        if (c21480M34042 == null) {
            sb.append(" .");
        } else {
            sb.append(" ");
            sb.append(c21480M34042.mo2463());
        }
        sb.append(" <-");
        int size = mo29535().size();
        if (size == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                sb.append(" ");
                sb.append(this.f40383.m41004get(i).mo2463() + "[b=" + C14712.m35006(((C11417) this.f40385.get(i)).f34124) + "]");
            }
        }
        return sb.toString();
    }
}
