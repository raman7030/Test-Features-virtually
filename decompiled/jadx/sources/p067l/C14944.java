package p067l;

/* JADX INFO: renamed from: l.۬ܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes3.dex */
public final class C14944 {

    /* JADX INFO: renamed from: ֫ */
    public final int f42667;

    /* JADX INFO: renamed from: ۜ */
    public String f42668 = "single_value";

    /* JADX INFO: renamed from: ۧ */
    public final String f42669;

    /* JADX INFO: renamed from: ܳ */
    public final String f42670;

    /* JADX INFO: renamed from: ܽ */
    public final int f42671;

    /* JADX INFO: renamed from: ܿ */
    public final int f42672;

    /* JADX INFO: renamed from: ᩳ */
    public C12974 f42673;

    /* JADX INFO: renamed from: ᩷ */
    public int f42674;

    /* JADX INFO: renamed from: ᩻ */
    public final int f42675;

    public C14944(String str, int i, int i2, int i3, int i4, String str2) {
        this.f42672 = i;
        this.f42671 = i2;
        this.f42670 = str;
        this.f42675 = i3;
        this.f42669 = str2;
        this.f42667 = i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m34194(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        if (str.regionMatches(true, 0, "0x", 0, 2)) {
            return C10962.m25260(this.f42672, str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f42670);
        sb.append("/");
        String str2 = this.f42669;
        sb.append(str2);
        return sb.toString().startsWith(str) || str2.startsWith(str);
    }
}
