package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩵ᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: KAG4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21054 {

    /* JADX INFO: renamed from: ֫ */
    public final String f66102;

    /* JADX INFO: renamed from: ۜ */
    public final int f66103;

    /* JADX INFO: renamed from: ۢ */
    public final int f66104;

    /* JADX INFO: renamed from: ۧ */
    public final String f66105;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f66106;

    /* JADX INFO: renamed from: ܽ */
    public final String f66107;

    /* JADX INFO: renamed from: ܿ */
    public final String f66108;

    /* JADX INFO: renamed from: ᩳ */
    public final int f66109;

    /* JADX INFO: renamed from: ᩷ */
    public final String f66110;

    /* JADX INFO: renamed from: ᩻ */
    public final String f66111;

    /* JADX INFO: renamed from: ֫ */
    public static C21054 m47491(int i, AbstractC5769 abstractC5769) {
        if (abstractC5769 instanceof C16358) {
            return new C21054(i, (C16358) abstractC5769);
        }
        throw new RuntimeException();
    }

    public C21054(int i, C16358 c16358) {
        this.f66104 = i;
        this.f66105 = c16358.f48063;
        this.f66103 = c16358.f48068;
        this.f66110 = c16358.f48062;
        boolean z = c16358.f48069;
        this.f66106 = z;
        if (z) {
            this.f66111 = c16358.f48066;
            this.f66108 = c16358.f48064;
        } else {
            this.f66111 = c16358.f48061;
            this.f66108 = "";
        }
        this.f66102 = c16358.f48060;
        int i2 = c16358.f48067;
        this.f66109 = i2;
        if (i2 != -1) {
            this.f66107 = c16358.f48065;
        } else {
            this.f66107 = "";
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4547 m47490(int i, String str) {
        C4547 c4547M33134 = C14486.m33134(i);
        if (c4547M33134 == null) {
            c4547M33134 = C14486.m33126(str);
        }
        if (c4547M33134 != null) {
            return c4547M33134;
        }
        if (str.startsWith("sshj://")) {
            str = str.substring(7);
        }
        throw new C20807(C7050.m16203(R.string.MT_Protector, str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C21054.class == obj.getClass()) {
            C21054 c21054 = (C21054) obj;
            if (this.f66104 == c21054.f66104 && this.f66103 == c21054.f66103 && this.f66106 == c21054.f66106 && this.f66105.equals(c21054.f66105) && this.f66110.equals(c21054.f66110) && this.f66111.equals(c21054.f66111) && this.f66108.equals(c21054.f66108) && this.f66102.equals(c21054.f66102) && this.f66109 == c21054.f66109 && this.f66107.equals(c21054.f66107)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C12826.hash(Integer.valueOf(this.f66104), this.f66105, Integer.valueOf(this.f66103), this.f66110, this.f66111, this.f66108, Boolean.valueOf(this.f66106), this.f66102, Integer.valueOf(this.f66109), this.f66107);
    }
}
