package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫ܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 44P2 */
/* JADX INFO: loaded from: classes2.dex */
public class C1875 implements InterfaceC14574 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f6381;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC23747 f6383;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f6384 = new ArrayList(100);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f6382 = -1;

    @Override // l.InterfaceC14574
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo6200() {
        return 0;
    }

    @Override // l.InterfaceC14574
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo6207(int i) {
    }

    public C1875(AbstractC23747 abstractC23747) {
        this.f6383 = abstractC23747;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m6208(int i) {
        return m6202(i);
    }

    @Override // l.InterfaceC14574
    public final int index() {
        return this.f6382;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC0463 mo6211(int i) {
        m6209();
        if (i == 0) {
            return null;
        }
        if (i < 0) {
            int i2 = -i;
            ArrayList arrayList = this.f6384;
            if (i2 != 0) {
                int size = this.f6382;
                if (size - i2 >= 0) {
                    for (int i3 = 1; i3 <= i2 && size > 0; i3++) {
                        size--;
                        m6212(size);
                        if (size >= arrayList.size()) {
                            size = arrayList.size() - 1;
                        } else {
                            while (size >= 0) {
                                InterfaceC0463 interfaceC0463 = (InterfaceC0463) arrayList.get(size);
                                if (interfaceC0463.getType() == -1 || interfaceC0463.mo2050() == 0) {
                                    break;
                                }
                                size--;
                            }
                        }
                    }
                    if (size >= 0) {
                        return (InterfaceC0463) arrayList.get(size);
                    }
                }
            }
            return null;
        }
        int iM6202 = this.f6382;
        for (int i4 = 1; i4 < i; i4++) {
            int i5 = iM6202 + 1;
            if (m6212(i5)) {
                iM6202 = m6202(i5);
            }
        }
        return (InterfaceC0463) this.f6384.get(iM6202);
    }

    @Override // l.InterfaceC14574
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6201(int i) {
        m6209();
        this.f6382 = m6208(i);
    }

    @Override // l.InterfaceC14574
    public final int size() {
        return this.f6384.size();
    }

    @Override // l.InterfaceC14574
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo6204() {
        ArrayList arrayList = this.f6384;
        int i = this.f6382;
        if ((i < 0 || (!this.f6381 ? i >= arrayList.size() : i >= arrayList.size() - 1)) && mo6203(1) == -1) {
            throw new IllegalStateException("cannot consume EOF");
        }
        if (m6212(this.f6382 + 1)) {
            this.f6382 = m6208(this.f6382 + 1);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m6212(int i) {
        int size = (i - this.f6384.size()) + 1;
        return size <= 0 || mo6205(size) >= size;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int mo6205(int i) {
        ArrayList arrayList = this.f6384;
        if (this.f6381) {
            return 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC0463 interfaceC0463NextToken = this.f6383.nextToken();
            if (interfaceC0463NextToken instanceof C13952) {
                ((C13952) interfaceC0463NextToken).m33392(arrayList.size());
            }
            arrayList.add(interfaceC0463NextToken);
            if (interfaceC0463NextToken.getType() == -1) {
                this.f6381 = true;
                return i2 + 1;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC0463 m6213(int i) {
        ArrayList arrayList = this.f6384;
        if (i >= 0 && i < arrayList.size()) {
            return (InterfaceC0463) arrayList.get(i);
        }
        StringBuilder sbM32308 = C13325.m32308(i, "token index ", " out of range 0..");
        sbM32308.append(arrayList.size() - 1);
        throw new IndexOutOfBoundsException(sbM32308.toString());
    }

    @Override // l.InterfaceC14574
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo6203(int i) {
        return mo6211(i).getType();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m6209() {
        if (this.f6382 == -1) {
            m6212(0);
            this.f6382 = m6208(0);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList m6210() {
        return this.f6384;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m6202(int i) {
        ArrayList arrayList = this.f6384;
        m6212(i);
        if (i >= arrayList.size()) {
            return arrayList.size() - 1;
        }
        Object obj = arrayList.get(i);
        while (true) {
            InterfaceC0463 interfaceC0463 = (InterfaceC0463) obj;
            if (interfaceC0463.mo2050() == 0 || interfaceC0463.getType() == -1) {
                break;
            }
            i++;
            m6212(i);
            obj = arrayList.get(i);
        }
        return i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m6206() {
        m6209();
        while (mo6205(1000) >= 1000) {
        }
    }
}
