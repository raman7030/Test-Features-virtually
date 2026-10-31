package l;

/* JADX INFO: renamed from: l.᩺ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBH8 */
/* JADX INFO: loaded from: classes.dex */
public final class C22746 implements InterfaceC9775 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f73462;

    public C22746(int i) {
        this.f73462 = C13573.m32622(i);
    }

    @Override // l.InterfaceC9775
    public final void add(int i) {
        m50823(i);
        int[] iArr = this.f73462;
        int i2 = i >> 5;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m50823(int i) {
        int[] iArr = this.f73462;
        if (i >= iArr.length * 32) {
            int[] iArrM32622 = C13573.m32622(Math.max(i + 1, iArr.length * 64));
            int[] iArr2 = this.f73462;
            System.arraycopy(iArr2, 0, iArrM32622, 0, iArr2.length);
            this.f73462 = iArrM32622;
        }
    }

    @Override // l.InterfaceC9775
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo12406(int i) {
        int[] iArr = this.f73462;
        return i < iArr.length * 32 && C13573.m32626(i, iArr);
    }

    @Override // l.InterfaceC9775
    /* JADX INFO: renamed from: ֫ */
    public final void mo12405(InterfaceC9775 interfaceC9775) {
        int i = 0;
        if (interfaceC9775 instanceof C22746) {
            C22746 c22746 = (C22746) interfaceC9775;
            m50823((c22746.f73462.length * 32) + 1);
            int[] iArr = this.f73462;
            int[] iArr2 = c22746.f73462;
            while (i < iArr2.length) {
                iArr[i] = iArr[i] | iArr2[i];
                i++;
            }
            return;
        }
        if (interfaceC9775 instanceof C4130) {
            C21064 c21064 = ((C4130) interfaceC9775).f13092;
            int size = c21064.size();
            if (size > 0) {
                m50823(c21064.get(size - 1));
            }
            while (i < c21064.size()) {
                int[] iArr3 = this.f73462;
                int i2 = c21064.get(i);
                int i3 = i2 >> 5;
                iArr3[i3] = (1 << (i2 & 31)) | iArr3[i3];
                i++;
            }
            return;
        }
        InterfaceC6952 it = interfaceC9775.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    @Override // l.InterfaceC9775
    public final int elements() {
        int iBitCount = 0;
        for (int i : this.f73462) {
            iBitCount += Integer.bitCount(i);
        }
        return iBitCount;
    }

    @Override // l.InterfaceC9775
    public final InterfaceC6952 iterator() {
        return new C11458(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int iM32623 = C13573.m32623(0, this.f73462);
        boolean z = true;
        while (iM32623 >= 0) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(iM32623);
            iM32623 = C13573.m32623(iM32623 + 1, this.f73462);
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
