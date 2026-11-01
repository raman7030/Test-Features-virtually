package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BFT */
/* JADX INFO: loaded from: classes4.dex */
public final class C15229 extends AbstractC15938 {

    /* JADX INFO: renamed from: ۗ */
    public C21442 f43453;

    /* JADX INFO: renamed from: ۙ */
    public final int f43454;

    /* JADX INFO: renamed from: ᩶ */
    public final ArrayList f43455;

    @Override // p067l.AbstractC15938
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo31596() {
        return true;
    }

    @Override // p067l.AbstractC15938
    /* JADX INFO: renamed from: ۜ */
    public final C5348 mo31602() {
        return null;
    }

    @Override // p067l.AbstractC15938
    /* JADX INFO: renamed from: ܺ */
    public final AbstractC17417 mo31607() {
        return null;
    }

    @Override // p067l.AbstractC15938
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo31608() {
        return false;
    }

    public C15229(C22783 c22783, C17950 c17950) {
        super(c22783, c17950);
        this.f43455 = new ArrayList();
        this.f43454 = c22783.m50989();
    }

    public C15229(int i, C17950 c17950) {
        super(C22783.m50968(i, C9566.f26318), c17950);
        this.f43455 = new ArrayList();
        this.f43454 = i;
    }

    @Override // p067l.AbstractC15938
    public final Object clone() {
        throw new UnsupportedOperationException("can't clone phi");
    }

    @Override // p067l.AbstractC15938
    public final AbstractC15938 clone() {
        throw new UnsupportedOperationException("can't clone phi");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34673(C21975 c21975) {
        for (C13219 c13219 : this.f43455) {
            c13219.f37119 = c13219.f37119.m50978(c21975.m49521(c13219.f37119.m50989()).m36175().getType());
        }
        this.f43453 = null;
    }

    /* JADX INFO: renamed from: ܶ */
    public final int m34676() {
        return this.f43454;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34674(C22783 c22783, C17950 c17950) {
        this.f43455.add(new C13219(c22783, c17950.m40826(), c17950.m40824()));
        this.f43453 = null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m34675(C22783 c22783) {
        ArrayList arrayList = new ArrayList();
        ArrayList<C13219> arrayList2 = this.f43455;
        for (C13219 c13219 : arrayList2) {
            if (c13219.f37119.m50989() == c22783.m50989()) {
                arrayList.add(c13219);
            }
        }
        arrayList2.removeAll(arrayList);
        this.f43453 = null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m34677(int i) {
        return ((C13219) this.f43455.get(i)).f37118;
    }

    @Override // p067l.AbstractC15938
    /* JADX INFO: renamed from: ۘ */
    public final C21442 mo31600() {
        C21442 c21442 = this.f43453;
        if (c21442 != null) {
            return c21442;
        }
        ArrayList arrayList = this.f43455;
        if (arrayList.size() == 0) {
            return C21442.f67643;
        }
        int size = arrayList.size();
        this.f43453 = new C21442(size);
        for (int i = 0; i < size; i++) {
            this.f43453.m43248(i, ((C13219) arrayList.get(i)).f37119);
        }
        this.f43453.mo22326();
        return this.f43453;
    }

    @Override // p067l.AbstractC15938
    /* JADX INFO: renamed from: ۧ */
    public final void mo31604(AbstractC5208 abstractC5208) {
        for (C13219 c13219 : this.f43455) {
            C22783 c22783 = c13219.f37119;
            C22783 c22783Mo11174 = abstractC5208.mo11174(c22783);
            c13219.f37119 = c22783Mo11174;
            if (c22783 != c22783Mo11174) {
                m36177().m40835().m49507(this, c22783, c13219.f37119);
            }
        }
        this.f43453 = null;
    }

    @Override // p067l.AbstractC15938
    /* JADX INFO: renamed from: ۠ */
    public final AbstractC17417 mo31603() {
        throw new IllegalArgumentException("Cannot convert phi insns to rop form");
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m34672(int i, C21975 c21975) {
        ArrayList arrayList = new ArrayList();
        for (C13219 c13219 : this.f43455) {
            if (c13219.f37119.m50989() == i) {
                arrayList.add((C17950) c21975.m49517().get(c13219.f37118));
            }
        }
        return arrayList;
    }

    @Override // p067l.AbstractC15938
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo31609() {
        return C7854.m18150() && mo31605() != null;
    }

    @Override // p067l.AbstractC15938
    /* JADX INFO: renamed from: ֫ */
    public final void mo31598(InterfaceC18621 interfaceC18621) {
        interfaceC18621.mo9600(this);
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        StringBuilder sb = new StringBuilder(80);
        sb.append(C12054.f33582);
        sb.append(": phi");
        C22783 c22783M36175 = m36175();
        if (c22783M36175 == null) {
            sb.append(" .");
        } else {
            sb.append(" ");
            sb.append(c22783M36175.mo4819());
        }
        sb.append(" <-");
        int size = mo31600().size();
        if (size == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                sb.append(" ");
                sb.append(this.f43453.m56524get(i).mo4819() + "[b=" + C16351.m37153(((C13219) this.f43455.get(i)).f37120) + "]");
            }
        }
        return sb.toString();
    }
}
