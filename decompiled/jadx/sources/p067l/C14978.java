package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬ᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 44P2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14978 implements InterfaceC22336 {

    /* JADX INFO: renamed from: ֫ */
    public int f42797;

    /* JADX INFO: renamed from: ᩳ */
    public C4866 f42801;

    /* JADX INFO: renamed from: ܿ */
    public ArrayList f42800 = new ArrayList(100);

    /* JADX INFO: renamed from: ۧ */
    public int f42798 = -1;

    /* JADX INFO: renamed from: ܽ */
    public int f42799 = -1;

    @Override // p067l.InterfaceC13638
    /* JADX INFO: renamed from: ۧ */
    public final void mo31016() {
        if (this.f42798 == -1) {
            m34326();
        }
        int i = this.f42798 + 1;
        this.f42798 = i;
        m34329(i);
        while (((InterfaceC8924) this.f42800.get(this.f42798)).mo12373() != 0) {
            int i2 = this.f42798 + 1;
            this.f42798 = i2;
            m34329(i2);
        }
    }

    public C14978(C4866 c4866) {
        this.f42801 = c4866;
    }

    @Override // p067l.InterfaceC13638
    public final int index() {
        return this.f42798;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m34331() {
        if (this.f42798 == -1) {
            m34326();
        }
        int i = this.f42798;
        this.f42797 = i;
        return i;
    }

    @Override // p067l.InterfaceC22336
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC8924 mo34327(int i) {
        if (this.f42798 == -1) {
            m34326();
        }
        if (i == 0) {
            return null;
        }
        ArrayList arrayList = this.f42800;
        int i2 = 1;
        if (i >= 0) {
            int i3 = this.f42798;
            while (i2 < i) {
                i3++;
                m34329(i3);
                while (((InterfaceC8924) arrayList.get(i3)).mo12373() != 0) {
                    i3++;
                    m34329(i3);
                }
                i2++;
            }
            if (i3 > this.f42799) {
                this.f42799 = i3;
            }
            return (InterfaceC8924) arrayList.get(i3);
        }
        int i4 = -i;
        if (i4 == 0) {
            return null;
        }
        int i5 = this.f42798;
        if (i5 - i4 < 0) {
            return null;
        }
        while (i2 <= i4) {
            do {
                i5--;
                if (i5 < 0) {
                    break;
                }
            } while (((InterfaceC8924) arrayList.get(i5)).mo12373() != 0);
            i2++;
        }
        if (i5 < 0) {
            return null;
        }
        return (InterfaceC8924) arrayList.get(i5);
    }

    @Override // p067l.InterfaceC13638
    /* JADX INFO: renamed from: ܳ */
    public final void mo31017() {
        this.f42798 = this.f42797;
    }

    @Override // p067l.InterfaceC13638
    /* JADX INFO: renamed from: ֫ */
    public final void mo31014(int i) {
        this.f42798 = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m34330(int i) {
        this.f42798 = i;
    }

    @Override // p067l.InterfaceC13638
    public final int size() {
        return this.f42800.size();
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m34329(int i) {
        ArrayList arrayList = this.f42800;
        int size = (i - arrayList.size()) + 1;
        if (size > 0) {
            for (int i2 = 1; i2 <= size; i2++) {
                C5591 c5591M10322 = this.f42801.m10322();
                c5591M10322.f13537 = arrayList.size();
                arrayList.add(c5591M10322);
                if (c5591M10322.f13533 == -1) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m34326() {
        int i = 0;
        this.f42798 = 0;
        m34329(0);
        while (((InterfaceC8924) this.f42800.get(i)).mo12373() != 0) {
            i++;
            m34329(i);
        }
        this.f42798 = i;
    }

    @Override // p067l.InterfaceC13638
    /* JADX INFO: renamed from: ۧ */
    public final int mo31015(int i) {
        return mo34327(i).getType();
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m34328() {
        return this.f42801.m10320();
    }

    public final String toString() {
        if (this.f42798 == -1) {
            m34326();
        }
        if (this.f42798 == -1) {
            m34326();
        }
        int i = this.f42798;
        ArrayList arrayList = this.f42800;
        if (((InterfaceC8924) arrayList.get(i)).getType() != -1) {
            int i2 = this.f42798 + 1;
            m34329(i2);
            while (((InterfaceC8924) arrayList.get(i2)).getType() != -1) {
                i2++;
                m34329(i2);
            }
        }
        return mo34324(0, arrayList.size() - 1);
    }

    @Override // p067l.InterfaceC22336
    /* JADX INFO: renamed from: ֫ */
    public final String mo34324(int i, int i2) {
        if (i < 0 || i2 < 0) {
            return null;
        }
        if (this.f42798 == -1) {
            m34326();
        }
        ArrayList arrayList = this.f42800;
        if (i2 >= arrayList.size()) {
            i2 = arrayList.size() - 1;
        }
        StringBuilder sb = new StringBuilder();
        while (i <= i2) {
            InterfaceC8924 interfaceC8924 = (InterfaceC8924) arrayList.get(i);
            if (interfaceC8924.getType() == -1) {
                break;
            }
            sb.append(interfaceC8924.getText());
            i++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m34325(InterfaceC8924 interfaceC8924, InterfaceC8924 interfaceC8925) {
        if (interfaceC8924 == null || interfaceC8925 == null) {
            return null;
        }
        return mo34324(interfaceC8924.mo12375(), interfaceC8925.mo12375());
    }
}
