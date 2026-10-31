package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩶ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8TI */
/* JADX INFO: loaded from: classes5.dex */
public final class C20067 implements InterfaceC14723 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C8353 f64992;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C8353 f64993;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f64994;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f64995;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f64996;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f64997;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f64998;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f64999;

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo1026(C18252 c18252) {
    }

    static {
        C1297 c1297 = new C1297();
        c1297.m4465("application/id3");
        f64993 = c1297.m4440();
        C1297 c1298 = new C1297();
        c1298.m4465("application/x-scte35");
        f64992 = c1298.m4440();
    }

    public C20067(String str, String str2, long j, long j2, byte[] bArr) {
        this.f64998 = str;
        this.f64996 = str2;
        this.f64994 = j;
        this.f64997 = j2;
        this.f64999 = bArr;
    }

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ֫ */
    public final C8353 mo1025() {
        String str = this.f64998;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f64992;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f64993;
            default:
                return null;
        }
    }

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo1027() {
        if (mo1025() != null) {
            return this.f64999;
        }
        return null;
    }

    public final int hashCode() {
        if (this.f64995 == 0) {
            String str = this.f64998;
            int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.f64996;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.f64994;
            int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f64997;
            this.f64995 = Arrays.hashCode(this.f64999) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f64995;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20067.class == obj.getClass()) {
            C20067 c20067 = (C20067) obj;
            if (this.f64994 == c20067.f64994 && this.f64997 == c20067.f64997 && C11003.equals(this.f64998, c20067.f64998) && C11003.equals(this.f64996, c20067.f64996) && Arrays.equals(this.f64999, c20067.f64999)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f64998 + ", id=" + this.f64997 + ", durationMs=" + this.f64994 + ", value=" + this.f64996;
    }
}
