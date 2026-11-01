package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩶ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8TI */
/* JADX INFO: loaded from: classes5.dex */
public final class C21440 implements InterfaceC16361 {

    /* JADX INFO: renamed from: ۜ */
    public static final C10307 f67633;

    /* JADX INFO: renamed from: ᩻ */
    public static final C10307 f67634;

    /* JADX INFO: renamed from: ֫ */
    public final long f67635;

    /* JADX INFO: renamed from: ۧ */
    public int f67636;

    /* JADX INFO: renamed from: ܳ */
    public final String f67637;

    /* JADX INFO: renamed from: ܽ */
    public final long f67638;

    /* JADX INFO: renamed from: ܿ */
    public final String f67639;

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] f67640;

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo3422(C19715 c19715) {
    }

    static {
        C3601 c3601 = new C3601();
        c3601.m6697("application/id3");
        f67634 = c3601.m6672();
        C3601 c3602 = new C3601();
        c3602.m6697("application/x-scte35");
        f67633 = c3602.m6672();
    }

    public C21440(String str, String str2, long j, long j2, byte[] bArr) {
        this.f67639 = str;
        this.f67637 = str2;
        this.f67635 = j;
        this.f67638 = j2;
        this.f67640 = bArr;
    }

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ֫ */
    public final C10307 mo3421() {
        String str = this.f67639;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f67633;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f67634;
            default:
                return null;
        }
    }

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo3423() {
        if (mo3421() != null) {
            return this.f67640;
        }
        return null;
    }

    public final int hashCode() {
        if (this.f67636 == 0) {
            String str = this.f67639;
            int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.f67637;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.f67635;
            int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f67638;
            this.f67636 = Arrays.hashCode(this.f67640) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f67636;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C21440.class == obj.getClass()) {
            C21440 c21440 = (C21440) obj;
            if (this.f67635 == c21440.f67635 && this.f67638 == c21440.f67638 && C12826.equals(this.f67639, c21440.f67639) && C12826.equals(this.f67637, c21440.f67637) && Arrays.equals(this.f67640, c21440.f67640)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f67639 + ", id=" + this.f67638 + ", durationMs=" + this.f67635 + ", value=" + this.f67637;
    }
}
