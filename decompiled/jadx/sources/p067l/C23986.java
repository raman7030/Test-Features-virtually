package p067l;

/* JADX INFO: renamed from: l.᩺ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBH8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23986 implements InterfaceC11659 {

    /* JADX INFO: renamed from: ֫ */
    public int[] f76188;

    public C23986(int i) {
        this.f76188 = C15268.m34734(i);
    }

    @Override // p067l.InterfaceC11659
    public final void add(int i) {
        m53156(i);
        int[] iArr = this.f76188;
        int i2 = i >> 5;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* JADX INFO: renamed from: ۧ */
    private void m53156(int i) {
        int[] iArr = this.f76188;
        if (i >= iArr.length * 32) {
            int[] iArrM34734 = C15268.m34734(Math.max(i + 1, iArr.length * 64));
            int[] iArr2 = this.f76188;
            System.arraycopy(iArr2, 0, iArrM34734, 0, iArr2.length);
            this.f76188 = iArrM34734;
        }
    }

    @Override // p067l.InterfaceC11659
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14296(int i) {
        int[] iArr = this.f76188;
        return i < iArr.length * 32 && C15268.m34738(i, iArr);
    }

    @Override // p067l.InterfaceC11659
    /* JADX INFO: renamed from: ֫ */
    public final void mo14295(InterfaceC11659 interfaceC11659) {
        int i = 0;
        if (interfaceC11659 instanceof C23986) {
            C23986 c23986 = (C23986) interfaceC11659;
            m53156((c23986.f76188.length * 32) + 1);
            int[] iArr = this.f76188;
            int[] iArr2 = c23986.f76188;
            while (i < iArr2.length) {
                iArr[i] = iArr[i] | iArr2[i];
                i++;
            }
            return;
        }
        if (interfaceC11659 instanceof C6294) {
            C22388 c22388 = ((C6294) interfaceC11659).f15906;
            int size = c22388.size();
            if (size > 0) {
                m53156(c22388.get(size - 1));
            }
            while (i < c22388.size()) {
                int[] iArr3 = this.f76188;
                int i2 = c22388.get(i);
                int i3 = i2 >> 5;
                iArr3[i3] = (1 << (i2 & 31)) | iArr3[i3];
                i++;
            }
            return;
        }
        InterfaceC8976 it = interfaceC11659.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    @Override // p067l.InterfaceC11659
    public final int elements() {
        int iBitCount = 0;
        for (int i : this.f76188) {
            iBitCount += Integer.bitCount(i);
        }
        return iBitCount;
    }

    @Override // p067l.InterfaceC11659
    public final InterfaceC8976 iterator() {
        return new C13258(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int iM34735 = C15268.m34735(0, this.f76188);
        boolean z = true;
        while (iM34735 >= 0) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(iM34735);
            iM34735 = C15268.m34735(iM34735 + 1, this.f76188);
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
