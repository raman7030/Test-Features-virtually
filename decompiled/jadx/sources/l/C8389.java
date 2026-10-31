package l;

/* JADX INFO: renamed from: l.۠᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A28 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8389 extends AbstractC12601 {

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public byte[] f25726;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public byte f25727;

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) throws C17771 {
        if (C1480.m5121(i, bArr) != 24) {
            throw new C17771("Expected structureSize = 24");
        }
        this.f25727 = bArr[i + 2];
        byte[] bArr2 = new byte[16];
        this.f25726 = bArr2;
        System.arraycopy(bArr, i + 8, bArr2, 0, 16);
        return (i + 24) - i;
    }

    @Override // l.AbstractC3429
    public final String toString() {
        StringBuilder sb = new StringBuilder("Smb2OpblockBreakNotification[oplockLevel=");
        sb.append((int) this.f25727);
        sb.append(",fileId=");
        byte[] bArr = this.f25726;
        sb.append(C12085.m29468(bArr, 0, bArr.length));
        sb.append("]");
        return sb.toString();
    }
}
