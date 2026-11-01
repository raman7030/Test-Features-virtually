package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫ܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 44P2 */
/* JADX INFO: loaded from: classes2.dex */
public class C4150 implements InterfaceC16219 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f9163;

    /* JADX INFO: renamed from: ܽ */
    public AbstractC24937 f9165;

    /* JADX INFO: renamed from: ᩳ */
    public ArrayList f9166 = new ArrayList(100);

    /* JADX INFO: renamed from: ۧ */
    public int f9164 = -1;

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ֫ */
    public final int mo8402() {
        return 0;
    }

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ܽ */
    public final void mo8409(int i) {
    }

    public C4150(AbstractC24937 abstractC24937) {
        this.f9165 = abstractC24937;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m8410(int i) {
        return m8404(i);
    }

    @Override // p067l.InterfaceC16219
    public final int index() {
        return this.f9164;
    }

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC2808 mo8413(int i) {
        m8411();
        if (i == 0) {
            return null;
        }
        if (i < 0) {
            int i2 = -i;
            ArrayList arrayList = this.f9166;
            if (i2 != 0) {
                int size = this.f9164;
                if (size - i2 >= 0) {
                    for (int i3 = 1; i3 <= i2 && size > 0; i3++) {
                        size--;
                        m8414(size);
                        if (size >= arrayList.size()) {
                            size = arrayList.size() - 1;
                        } else {
                            while (size >= 0) {
                                InterfaceC2808 interfaceC2808 = (InterfaceC2808) arrayList.get(size);
                                if (interfaceC2808.getType() == -1 || interfaceC2808.mo4430() == 0) {
                                    break;
                                }
                                size--;
                            }
                        }
                    }
                    if (size >= 0) {
                        return (InterfaceC2808) arrayList.get(size);
                    }
                }
            }
            return null;
        }
        int iM8404 = this.f9164;
        for (int i4 = 1; i4 < i; i4++) {
            int i5 = iM8404 + 1;
            if (m8414(i5)) {
                iM8404 = m8404(i5);
            }
        }
        return (InterfaceC2808) this.f9166.get(iM8404);
    }

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ֫ */
    public final void mo8403(int i) {
        m8411();
        this.f9164 = m8410(i);
    }

    @Override // p067l.InterfaceC16219
    public final int size() {
        return this.f9166.size();
    }

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ۧ */
    public final void mo8406() {
        ArrayList arrayList = this.f9166;
        int i = this.f9164;
        if ((i < 0 || (!this.f9163 ? i >= arrayList.size() : i >= arrayList.size() - 1)) && mo8405(1) == -1) {
            throw new IllegalStateException("cannot consume EOF");
        }
        if (m8414(this.f9164 + 1)) {
            this.f9164 = m8410(this.f9164 + 1);
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m8414(int i) {
        int size = (i - this.f9166.size()) + 1;
        return size <= 0 || mo8407(size) >= size;
    }

    /* JADX INFO: renamed from: ܳ */
    public int mo8407(int i) {
        ArrayList arrayList = this.f9166;
        if (this.f9163) {
            return 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC2808 interfaceC2808NextToken = this.f9165.nextToken();
            if (interfaceC2808NextToken instanceof C15628) {
                ((C15628) interfaceC2808NextToken).m35511(arrayList.size());
            }
            arrayList.add(interfaceC2808NextToken);
            if (interfaceC2808NextToken.getType() == -1) {
                this.f9163 = true;
                return i2 + 1;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC2808 m8415(int i) {
        ArrayList arrayList = this.f9166;
        if (i >= 0 && i < arrayList.size()) {
            return (InterfaceC2808) arrayList.get(i);
        }
        StringBuilder sbM34408 = C15033.m34408(i, "token index ", " out of range 0..");
        sbM34408.append(arrayList.size() - 1);
        throw new IndexOutOfBoundsException(sbM34408.toString());
    }

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ۧ */
    public final int mo8405(int i) {
        return mo8413(i).getType();
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m8411() {
        if (this.f9164 == -1) {
            m8414(0);
            this.f9164 = m8410(0);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList m8412() {
        return this.f9166;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m8404(int i) {
        ArrayList arrayList = this.f9166;
        m8414(i);
        if (i >= arrayList.size()) {
            return arrayList.size() - 1;
        }
        Object obj = arrayList.get(i);
        while (true) {
            InterfaceC2808 interfaceC2808 = (InterfaceC2808) obj;
            if (interfaceC2808.mo4430() == 0 || interfaceC2808.getType() == -1) {
                break;
            }
            i++;
            m8414(i);
            obj = arrayList.get(i);
        }
        return i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m8408() {
        m8411();
        while (mo8407(1000) >= 1000) {
        }
    }
}
