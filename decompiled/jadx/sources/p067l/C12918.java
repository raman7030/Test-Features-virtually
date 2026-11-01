package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8OW */
/* JADX INFO: loaded from: classes4.dex */
public final class C12918 extends AbstractC16269 {

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f36319;

    /* JADX INFO: renamed from: ܽ */
    public final String f36320;

    /* JADX INFO: renamed from: ܿ */
    public final String f36321;

    /* JADX INFO: renamed from: ᩳ */
    public final String f36322;

    public C12918(byte[] bArr, String str, String str2, String str3) {
        super("GEOB");
        this.f36321 = str;
        this.f36322 = str2;
        this.f36320 = str3;
        this.f36319 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12918.class == obj.getClass()) {
            C12918 c12918 = (C12918) obj;
            if (C12826.equals(this.f36321, c12918.f36321) && C12826.equals(this.f36322, c12918.f36322) && C12826.equals(this.f36320, c12918.f36320) && Arrays.equals(this.f36319, c12918.f36319)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f36321;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f36322;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f36320;
        return Arrays.hashCode(this.f36319) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // p067l.AbstractC16269
    public final String toString() {
        return this.f47841 + ": mimeType=" + this.f36321 + ", filename=" + this.f36322 + ", description=" + this.f36320;
    }
}
