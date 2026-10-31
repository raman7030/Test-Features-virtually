package l;

/* JADX INFO: renamed from: l.ۚ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I73O */
/* JADX INFO: loaded from: classes2.dex */
public final class C5018 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f15806;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f15807;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f15808;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f15809 = new byte[96];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f15810;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final byte[] f15798 = m14509("#EXT-X-TARGETDURATION");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final byte[] f15803 = m14509("#EXT-X-MEDIA-SEQUENCE");

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final byte[] f15800 = m14509("#EXTINF");

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final byte[] f15801 = m14509("#EXT-X-KEY");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f15802 = m14509("#EXT-X-BYTERANGE");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final byte[] f15805 = m14509("#EXT-X-DISCONTINUITY");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final byte[] f15799 = m14509("#EXT-X-DISCONTINUITY-SEQUENCE");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final byte[] f15804 = m14509("#EXT-X-ENDLIST");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14512(int i, int i2, byte[] bArr) {
        if (this.f15806) {
            throw new IllegalStateException("HLS playlist classifier is already finished");
        }
        int i3 = i2 + i;
        while (i < i3) {
            byte b = bArr[i];
            if (b == 10) {
                m14510();
            } else if (b != 13) {
                int i4 = this.f15810;
                byte[] bArr2 = this.f15809;
                if (i4 < bArr2.length) {
                    this.f15810 = i4 + 1;
                    bArr2[i4] = b;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC0784 m14511() {
        if (!this.f15806) {
            m14510();
            this.f15806 = true;
        }
        if (this.f15808) {
            return this.f15807 ? EnumC0784.VOD : EnumC0784.LIVE;
        }
        return EnumC0784.UNKNOWN;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m14510() {
        byte[] bArr;
        byte b;
        int i = this.f15810;
        int i2 = 0;
        while (true) {
            bArr = this.f15809;
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
        if (m14508(false, i2, i, f15804)) {
            this.f15807 = true;
            this.f15808 = true;
        } else if (m14508(true, i2, i, f15798) || m14508(true, i2, i, f15803) || m14508(true, i2, i, f15800) || m14508(true, i2, i, f15801) || m14508(true, i2, i, f15802) || m14508(false, i2, i, f15805) || m14508(false, i2, i, f15799)) {
            this.f15808 = true;
        }
        this.f15810 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m14508(boolean z, int i, int i2, byte[] bArr) {
        int i3 = i2 - i;
        if (i3 >= bArr.length && (z || i3 == bArr.length)) {
            for (int i4 = 0; i4 < bArr.length; i4++) {
                if (this.f15809[i + i4] == bArr[i4]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m14509(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }
}
