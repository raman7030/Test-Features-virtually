package l;

/* JADX INFO: renamed from: l.᩻ۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8I0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23449 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18677 f75269;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f75270;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f75271;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f75272;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f75273;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    public C23449(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        byte b = 0;
        int i4 = 1;
        C22632.m50631((i == 0) ^ (bArr2 == null));
        this.f75271 = z;
        this.f75272 = str;
        this.f75273 = i;
        this.f75270 = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b = -1;
                    }
                    break;
                case 3046671:
                    if (!str.equals("cbcs")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 3049895:
                    if (!str.equals("cens")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    i4 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    C19956.m46037("Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f75269 = new C18677(i4, bArr, i2, i3);
    }
}
