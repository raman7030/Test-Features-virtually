package p067l;

/* JADX INFO: renamed from: l.ۤܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21KW */
/* JADX INFO: loaded from: classes3.dex */
public final class C12201 {

    /* JADX INFO: renamed from: ֫ */
    public int f34106 = 1;

    /* JADX INFO: renamed from: ۧ */
    public final C11683 f34107;

    public C12201(int i) {
        this.f34107 = new C11683(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int[] m28174(int i, int i2, Object[] objArr) {
        int i3;
        int length = (objArr.length - i) - i2;
        int[] iArr = length == 0 ? C14212.f40490 : new int[length];
        for (int i4 = i; i4 < objArr.length - i2; i4++) {
            Object obj = objArr[i4];
            if (obj == null) {
                i3 = 0;
            } else {
                C11683 c11683 = this.f34107;
                int iMo23939 = c11683.mo23939(obj);
                if (iMo23939 == 0) {
                    int i5 = this.f34106;
                    this.f34106 = i5 + 1;
                    c11683.mo23936(i5, obj);
                    i3 = -i5;
                } else {
                    i3 = iMo23939;
                }
            }
            iArr[i4 - i] = Math.max(i3, -i3);
        }
        return iArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC13833 it = this.f34107.mo23938().iterator();
        while (it.hasNext()) {
            InterfaceC5627 interfaceC5627 = (InterfaceC5627) it.next();
            sb.append(interfaceC5627.mo12466());
            sb.append(": ");
            sb.append(interfaceC5627.getKey());
            sb.append("\n");
        }
        return sb.toString();
    }
}
