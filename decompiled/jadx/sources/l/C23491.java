package l;

/* JADX INFO: renamed from: l.᩻ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88S1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23491 implements InterfaceC14773 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f75424 = new C17714();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f75425;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9248 f75426;

    public C23491(int i, C9248 c9248) {
        this.f75425 = i;
        this.f75426 = c9248;
    }

    @Override // l.InterfaceC14773
    /* JADX INFO: renamed from: ֫ */
    public final C17596 mo27214(InterfaceC8424 interfaceC8424, long j) {
        long j2;
        long position = interfaceC8424.getPosition();
        int iMin = (int) Math.min(112800, interfaceC8424.getLength() - position);
        C17714 c17714 = this.f75424;
        c17714.m41481(iMin);
        interfaceC8424.mo22061(0, iMin, c17714.m41482());
        int iM41483 = c17714.m41483();
        long j3 = -1;
        long j4 = -9223372036854775807L;
        long j5 = -1;
        while (true) {
            if (c17714.m41457() < 188) {
                j2 = -9223372036854775807L;
                break;
            }
            byte[] bArrM41482 = c17714.m41482();
            int iM41485 = c17714.m41485();
            while (iM41485 < iM41483 && bArrM41482[iM41485] != 71) {
                iM41485++;
            }
            j2 = -9223372036854775807L;
            int i = iM41485 + 188;
            if (i > iM41483) {
                break;
            }
            long jM28860 = C11807.m28860(c17714, iM41485, this.f75425);
            if (jM28860 != -9223372036854775807L) {
                long jM23734 = this.f75426.m23734(jM28860);
                if (jM23734 > j) {
                    if (j4 == -9223372036854775807L) {
                        return C17596.m41127(jM23734, position);
                    }
                    return C17596.m41126(position + j5);
                }
                if (100000 + jM23734 > j) {
                    return C17596.m41126(position + ((long) iM41485));
                }
                j5 = iM41485;
                j4 = jM23734;
            }
            c17714.m41484(i);
            j3 = i;
        }
        if (j4 != j2) {
            return C17596.m41129(j4, position + j3);
        }
        return C17596.f53767;
    }

    @Override // l.InterfaceC14773
    /* JADX INFO: renamed from: ֫ */
    public final void mo27215() {
        byte[] bArr = C3603.f11423;
        C17714 c17714 = this.f75424;
        c17714.getClass();
        c17714.m41462(bArr.length, bArr);
    }
}
