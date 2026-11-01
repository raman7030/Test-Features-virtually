package p067l;

/* JADX INFO: renamed from: l.᩻ۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8I0 */
/* JADX INFO: loaded from: classes.dex */
public final class C24654 {

    /* JADX INFO: renamed from: ֫ */
    public final C20119 f78016;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f78017;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f78018;

    /* JADX INFO: renamed from: ܿ */
    public final String f78019;

    /* JADX INFO: renamed from: ᩳ */
    public final int f78020;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    public C24654(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        byte b = 0;
        int i4 = 1;
        C23877.m52957((i == 0) ^ (bArr2 == null));
        this.f78018 = z;
        this.f78019 = str;
        this.f78020 = i;
        this.f78017 = bArr2;
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
                    C21334.m48351("Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f78016 = new C20119(i4, bArr, i2, i3);
    }
}
