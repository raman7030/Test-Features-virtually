package l;

/* JADX INFO: renamed from: l.ۤܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21KW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10346 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f31144 = 1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9800 f31145;

    public C10346(int i) {
        this.f31145 = new C9800(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] m26147(int i, int i2, Object[] objArr) {
        int i3;
        int length = (objArr.length - i) - i2;
        int[] iArr = length == 0 ? C12462.f37470 : new int[length];
        for (int i4 = i; i4 < objArr.length - i2; i4++) {
            Object obj = objArr[i4];
            if (obj == null) {
                i3 = 0;
            } else {
                C9800 c9800 = this.f31145;
                int iMo21968 = c9800.mo21968(obj);
                if (iMo21968 == 0) {
                    int i5 = this.f31144;
                    this.f31144 = i5 + 1;
                    c9800.mo21965(i5, obj);
                    i3 = -i5;
                } else {
                    i3 = iMo21968;
                }
            }
            iArr[i4 - i] = Math.max(i3, -i3);
        }
        return iArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC12063 it = this.f31145.mo21967().iterator();
        while (it.hasNext()) {
            InterfaceC3428 interfaceC3428 = (InterfaceC3428) it.next();
            sb.append(interfaceC3428.mo10427());
            sb.append(": ");
            sb.append(interfaceC3428.getKey());
            sb.append("\n");
        }
        return sb.toString();
    }
}
