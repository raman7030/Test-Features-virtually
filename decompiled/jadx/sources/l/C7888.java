package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠ۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBCZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C7888 extends C16354 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C22041 f24436;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f24437;

    public C7888(C22041 c22041, int i) {
        super(i);
        this.f24437 = new ArrayList();
        this.f24436 = c22041;
    }

    @Override // l.C16354
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21169(int i, int i2, int i3) {
        super.mo21169(i, i2, i3);
        m21168(i2, i);
        if (i3 == 2) {
            m21168(i2 + 1, i);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m21171(int i, int i2, int i3) {
        InterfaceC9775 interfaceC9775;
        ArrayList arrayList = this.f24437;
        if (i2 >= arrayList.size() || (interfaceC9775 = (InterfaceC9775) arrayList.get(i2)) == null) {
            return false;
        }
        if (i3 == 1) {
            return interfaceC9775.mo12406(i);
        }
        return interfaceC9775.mo12406(i) || m21171(i, i2 + 1, i3 - 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21168(int i, int i2) {
        int i3 = i + 1;
        ArrayList arrayList = this.f24437;
        arrayList.ensureCapacity(i3);
        while (i >= arrayList.size()) {
            arrayList.add(new C22746(i3));
        }
        this.f24436.m49589(i2, (InterfaceC9775) arrayList.get(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21170(C20069 c20069, int i, int i2) {
        int size = c20069.size();
        for (int i3 = 0; i3 < size; i3++) {
            C21480 c21480M41004get = c20069.m41004get(i3);
            int iM38501 = m38501(c21480M41004get.m48652());
            if (iM38501 == i) {
                return true;
            }
            if (c21480M41004get.m48645() == 2 && iM38501 + 1 == i) {
                return true;
            }
            if (i2 == 2 && iM38501 == i + 1) {
                return true;
            }
        }
        return false;
    }
}
