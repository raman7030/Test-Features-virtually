package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠ۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBCZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9865 extends C17911 {

    /* JADX INFO: renamed from: ܿ */
    public final C23316 f27352;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f27353;

    public C9865(C23316 c23316, int i) {
        super(i);
        this.f27353 = new ArrayList();
        this.f27352 = c23316;
    }

    @Override // p067l.C17911
    /* JADX INFO: renamed from: ֫ */
    public final void mo23134(int i, int i2, int i3) {
        super.mo23134(i, i2, i3);
        m23133(i2, i);
        if (i3 == 2) {
            m23133(i2 + 1, i);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m23136(int i, int i2, int i3) {
        InterfaceC11659 interfaceC11659;
        ArrayList arrayList = this.f27353;
        if (i2 >= arrayList.size() || (interfaceC11659 = (InterfaceC11659) arrayList.get(i2)) == null) {
            return false;
        }
        if (i3 == 1) {
            return interfaceC11659.mo14296(i);
        }
        return interfaceC11659.mo14296(i) || m23136(i, i2 + 1, i3 - 1);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m23133(int i, int i2) {
        int i3 = i + 1;
        ArrayList arrayList = this.f27353;
        arrayList.ensureCapacity(i3);
        while (i >= arrayList.size()) {
            arrayList.add(new C23986(i3));
        }
        this.f27352.m51925(i2, (InterfaceC11659) arrayList.get(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m23135(C21442 c21442, int i, int i2) {
        int size = c21442.size();
        for (int i3 = 0; i3 < size; i3++) {
            C22783 c22783M56524get = c21442.m56524get(i3);
            int iM40718 = m40718(c22783M56524get.m50989());
            if (iM40718 == i) {
                return true;
            }
            if (c22783M56524get.m50982() == 2 && iM40718 + 1 == i) {
                return true;
            }
            if (i2 == 2 && iM40718 == i + 1) {
                return true;
            }
        }
        return false;
    }
}
