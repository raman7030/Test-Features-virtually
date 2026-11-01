package p067l;

/* JADX INFO: renamed from: l.ۚ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I73O */
/* JADX INFO: loaded from: classes2.dex */
public final class C7137 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f18638;

    /* JADX INFO: renamed from: ۧ */
    public boolean f18639;

    /* JADX INFO: renamed from: ܽ */
    public boolean f18640;

    /* JADX INFO: renamed from: ܿ */
    public final byte[] f18641 = new byte[96];

    /* JADX INFO: renamed from: ᩳ */
    public int f18642;

    /* JADX INFO: renamed from: ۖ */
    public static final byte[] f18630 = m16413("#EXT-X-TARGETDURATION");

    /* JADX INFO: renamed from: ܺ */
    public static final byte[] f18635 = m16413("#EXT-X-MEDIA-SEQUENCE");

    /* JADX INFO: renamed from: ۡ */
    public static final byte[] f18632 = m16413("#EXTINF");

    /* JADX INFO: renamed from: ۢ */
    public static final byte[] f18633 = m16413("#EXT-X-KEY");

    /* JADX INFO: renamed from: ܳ */
    public static final byte[] f18634 = m16413("#EXT-X-BYTERANGE");

    /* JADX INFO: renamed from: ᩻ */
    public static final byte[] f18637 = m16413("#EXT-X-DISCONTINUITY");

    /* JADX INFO: renamed from: ۜ */
    public static final byte[] f18631 = m16413("#EXT-X-DISCONTINUITY-SEQUENCE");

    /* JADX INFO: renamed from: ᩷ */
    public static final byte[] f18636 = m16413("#EXT-X-ENDLIST");

    /* JADX INFO: renamed from: ֫ */
    public final void m16416(int i, int i2, byte[] bArr) {
        if (this.f18638) {
            throw new IllegalStateException("HLS playlist classifier is already finished");
        }
        int i3 = i2 + i;
        while (i < i3) {
            byte b = bArr[i];
            if (b == 10) {
                m16414();
            } else if (b != 13) {
                int i4 = this.f18642;
                byte[] bArr2 = this.f18641;
                if (i4 < bArr2.length) {
                    this.f18642 = i4 + 1;
                    bArr2[i4] = b;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC3113 m16415() {
        if (!this.f18638) {
            m16414();
            this.f18638 = true;
        }
        if (this.f18640) {
            return this.f18639 ? EnumC3113.VOD : EnumC3113.LIVE;
        }
        return EnumC3113.UNKNOWN;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m16414() {
        byte[] bArr;
        byte b;
        int i = this.f18642;
        int i2 = 0;
        while (true) {
            bArr = this.f18641;
            if (i2 >= i || !((b = bArr[i2]) == 32 || b == 9 || b == 12)) {
                break;
            } else {
                i2++;
            }
        }
        while (i > i2) {
            byte b2 = bArr[i - 1];
            if (b2 != 32 && b2 != 9 && b2 != 12) {
                break;
            } else {
                i--;
            }
        }
        if (m16412(false, i2, i, f18636)) {
            this.f18639 = true;
            this.f18640 = true;
        } else if (m16412(true, i2, i, f18630) || m16412(true, i2, i, f18635) || m16412(true, i2, i, f18632) || m16412(true, i2, i, f18633) || m16412(true, i2, i, f18634) || m16412(false, i2, i, f18637) || m16412(false, i2, i, f18631)) {
            this.f18640 = true;
        }
        this.f18642 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m16412(boolean z, int i, int i2, byte[] bArr) {
        int i3 = i2 - i;
        if (i3 >= bArr.length && (z || i3 == bArr.length)) {
            for (int i4 = 0; i4 < bArr.length; i4++) {
                if (this.f18641[i + i4] == bArr[i4]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m16413(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }
}
