package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬ᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 44P2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13268 implements InterfaceC21010 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f39732;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2628 f39736;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f39735 = new ArrayList(100);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f39733 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f39734 = -1;

    @Override // l.InterfaceC11858
    /* JADX INFO: renamed from: ۧ */
    public final void mo28965() {
        if (this.f39733 == -1) {
            m32227();
        }
        int i = this.f39733 + 1;
        this.f39733 = i;
        m32230(i);
        while (((InterfaceC6898) this.f39735.get(this.f39733)).mo10334() != 0) {
            int i2 = this.f39733 + 1;
            this.f39733 = i2;
            m32230(i2);
        }
    }

    public C13268(C2628 c2628) {
        this.f39736 = c2628;
    }

    @Override // l.InterfaceC11858
    public final int index() {
        return this.f39733;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m32232() {
        if (this.f39733 == -1) {
            m32227();
        }
        int i = this.f39733;
        this.f39732 = i;
        return i;
    }

    @Override // l.InterfaceC21010
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6898 mo32228(int i) {
        if (this.f39733 == -1) {
            m32227();
        }
        if (i == 0) {
            return null;
        }
        ArrayList arrayList = this.f39735;
        int i2 = 1;
        if (i >= 0) {
            int i3 = this.f39733;
            while (i2 < i) {
                i3++;
                m32230(i3);
                while (((InterfaceC6898) arrayList.get(i3)).mo10334() != 0) {
                    i3++;
                    m32230(i3);
                }
                i2++;
            }
            if (i3 > this.f39734) {
                this.f39734 = i3;
            }
            return (InterfaceC6898) arrayList.get(i3);
        }
        int i4 = -i;
        if (i4 == 0) {
            return null;
        }
        int i5 = this.f39733;
        if (i5 - i4 < 0) {
            return null;
        }
        while (i2 <= i4) {
            do {
                i5--;
                if (i5 < 0) {
                    break;
                }
            } while (((InterfaceC6898) arrayList.get(i5)).mo10334() != 0);
            i2++;
        }
        if (i5 < 0) {
            return null;
        }
        return (InterfaceC6898) arrayList.get(i5);
    }

    @Override // l.InterfaceC11858
    /* JADX INFO: renamed from: ܳ */
    public final void mo28966() {
        this.f39733 = this.f39732;
    }

    @Override // l.InterfaceC11858
    /* JADX INFO: renamed from: ֫ */
    public final void mo28963(int i) {
        this.f39733 = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m32231(int i) {
        this.f39733 = i;
    }

    @Override // l.InterfaceC11858
    public final int size() {
        return this.f39735.size();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m32230(int i) {
        ArrayList arrayList = this.f39735;
        int size = (i - arrayList.size()) + 1;
        if (size > 0) {
            for (int i2 = 1; i2 <= size; i2++) {
                C3391 c3391M8278 = this.f39736.m8278();
                c3391M8278.f10730 = arrayList.size();
                arrayList.add(c3391M8278);
                if (c3391M8278.f10726 == -1) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m32227() {
        int i = 0;
        this.f39733 = 0;
        m32230(0);
        while (((InterfaceC6898) this.f39735.get(i)).mo10334() != 0) {
            i++;
            m32230(i);
        }
        this.f39733 = i;
    }

    @Override // l.InterfaceC11858
    /* JADX INFO: renamed from: ۧ */
    public final int mo28964(int i) {
        return mo32228(i).getType();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m32229() {
        return this.f39736.m8276();
    }

    public final String toString() {
        if (this.f39733 == -1) {
            m32227();
        }
        if (this.f39733 == -1) {
            m32227();
        }
        int i = this.f39733;
        ArrayList arrayList = this.f39735;
        if (((InterfaceC6898) arrayList.get(i)).getType() != -1) {
            int i2 = this.f39733 + 1;
            m32230(i2);
            while (((InterfaceC6898) arrayList.get(i2)).getType() != -1) {
                i2++;
                m32230(i2);
            }
        }
        return mo32225(0, arrayList.size() - 1);
    }

    @Override // l.InterfaceC21010
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo32225(int i, int i2) {
        if (i < 0 || i2 < 0) {
            return null;
        }
        if (this.f39733 == -1) {
            m32227();
        }
        ArrayList arrayList = this.f39735;
        if (i2 >= arrayList.size()) {
            i2 = arrayList.size() - 1;
        }
        StringBuilder sb = new StringBuilder();
        while (i <= i2) {
            InterfaceC6898 interfaceC6898 = (InterfaceC6898) arrayList.get(i);
            if (interfaceC6898.getType() == -1) {
                break;
            }
            sb.append(interfaceC6898.getText());
            i++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m32226(InterfaceC6898 interfaceC6898, InterfaceC6898 interfaceC6899) {
        if (interfaceC6898 == null || interfaceC6899 == null) {
            return null;
        }
        return mo32225(interfaceC6898.mo10336(), interfaceC6899.mo10336());
    }
}
