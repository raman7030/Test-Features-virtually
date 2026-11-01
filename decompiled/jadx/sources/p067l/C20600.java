package p067l;

/* JADX INFO: renamed from: l.᩵ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O9YQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20600 implements InterfaceC10047 {

    /* JADX INFO: renamed from: ᩸ */
    public C19929[] f63667;

    @Override // p067l.InterfaceC10047
    /* JADX INFO: renamed from: ֫ */
    public final int mo4913(int i, int i2, byte[] bArr) throws C19258 {
        C3775.m7363(i + 2, bArr);
        int iM7365 = C3775.m7365(i + 4, bArr);
        int iM7366 = C3775.m7365(i + 8, bArr);
        C3775.m7365(i + 12, bArr);
        int iM7367 = C3775.m7365(i + 16, bArr);
        if (iM7365 > 0) {
            new C7267(bArr, iM7365 + i);
        }
        if (iM7366 > 0) {
            new C7267(bArr, iM7366 + i);
        }
        int iMo4913 = i + iM7367;
        if (iM7367 > 0) {
            C3775.m7363(iMo4913 + 2, bArr);
            int iM7368 = C3775.m7365(iMo4913 + 4, bArr);
            iMo4913 += 8;
            if (iM7368 > 4096) {
                throw new C19258("Invalid SecurityDescriptor");
            }
            this.f63667 = new C19929[iM7368];
            for (int i3 = 0; i3 < iM7368; i3++) {
                C19929[] c19929Arr = this.f63667;
                C19929 c19929 = new C19929();
                c19929Arr[i3] = c19929;
                iMo4913 += c19929.mo4913(iMo4913, i2 - iMo4913, bArr);
            }
        } else {
            this.f63667 = null;
        }
        return iMo4913 - i;
    }

    public final String toString() {
        if (this.f63667 == null) {
            return "SecurityDescriptor:\nNULL";
        }
        String string = "SecurityDescriptor:\n";
        for (int i = 0; i < this.f63667.length; i++) {
            StringBuilder sbM17248 = C7470.m17248(string);
            sbM17248.append(this.f63667[i].toString());
            sbM17248.append("\n");
            string = sbM17248.toString();
        }
        return string;
    }
}
