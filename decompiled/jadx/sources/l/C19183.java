package l;

/* JADX INFO: renamed from: l.᩵ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O9YQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19183 implements InterfaceC8079 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C18477[] f60436;

    @Override // l.InterfaceC8079
    /* JADX INFO: renamed from: ֫ */
    public final int mo2557(int i, int i2, byte[] bArr) throws C17771 {
        C1480.m5121(i + 2, bArr);
        int iM5123 = C1480.m5123(i + 4, bArr);
        int iM5124 = C1480.m5123(i + 8, bArr);
        C1480.m5123(i + 12, bArr);
        int iM5125 = C1480.m5123(i + 16, bArr);
        if (iM5123 > 0) {
            new C5154(bArr, iM5123 + i);
        }
        if (iM5124 > 0) {
            new C5154(bArr, iM5124 + i);
        }
        int iMo2557 = i + iM5125;
        if (iM5125 > 0) {
            C1480.m5121(iMo2557 + 2, bArr);
            int iM5126 = C1480.m5123(iMo2557 + 4, bArr);
            iMo2557 += 8;
            if (iM5126 > 4096) {
                throw new C17771("Invalid SecurityDescriptor");
            }
            this.f60436 = new C18477[iM5126];
            for (int i3 = 0; i3 < iM5126; i3++) {
                C18477[] c18477Arr = this.f60436;
                C18477 c18477 = new C18477();
                c18477Arr[i3] = c18477;
                iMo2557 += c18477.mo2557(iMo2557, i2 - iMo2557, bArr);
            }
        } else {
            this.f60436 = null;
        }
        return iMo2557 - i;
    }

    public final String toString() {
        if (this.f60436 == null) {
            return "SecurityDescriptor:\nNULL";
        }
        String string = "SecurityDescriptor:\n";
        for (int i = 0; i < this.f60436.length; i++) {
            StringBuilder sbM15339 = C5368.m15339(string);
            sbM15339.append(this.f60436[i].toString());
            sbM15339.append("\n");
            string = sbM15339.toString();
        }
        return string;
    }
}
