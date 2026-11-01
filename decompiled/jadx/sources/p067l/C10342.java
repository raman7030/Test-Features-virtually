package p067l;

/* JADX INFO: renamed from: l.۠᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A28 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10342 extends AbstractC14345 {

    /* JADX INFO: renamed from: ᩴ֫ */
    public byte[] f28639;

    /* JADX INFO: renamed from: ᩵֫ */
    public byte f28640;

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) throws C19258 {
        if (C3775.m7363(i, bArr) != 24) {
            throw new C19258("Expected structureSize = 24");
        }
        this.f28640 = bArr[i + 2];
        byte[] bArr2 = new byte[16];
        this.f28639 = bArr2;
        System.arraycopy(bArr, i + 8, bArr2, 0, 16);
        return (i + 24) - i;
    }

    @Override // p067l.AbstractC5628
    public final String toString() {
        StringBuilder sb = new StringBuilder("Smb2OpblockBreakNotification[oplockLevel=");
        sb.append((int) this.f28640);
        sb.append(",fileId=");
        byte[] bArr = this.f28639;
        sb.append(C13854.m31530(bArr, 0, bArr.length));
        sb.append("]");
        return sb.toString();
    }
}
