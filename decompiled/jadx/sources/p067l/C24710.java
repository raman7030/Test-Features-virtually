package p067l;

/* JADX INFO: renamed from: l.᩻ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7FP */
/* JADX INFO: loaded from: classes.dex */
public final class C24710 {

    /* JADX INFO: renamed from: ֫ */
    public long f78204;

    /* JADX INFO: renamed from: ۧ */
    public String f78205;

    /* JADX INFO: renamed from: ܽ */
    public C15992 f78206;

    public C24710(String str, C15992 c15992, long j) {
        this.f78205 = str;
        this.f78206 = c15992;
        this.f78204 = j;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX INFO: renamed from: ֫ */
    public static C24710 m54349(C14677 c14677) {
        C15992 c15992;
        long j;
        C15992 c15992M49628;
        String strM33593 = c14677.m33593();
        int i = c14677.readByte() & 255;
        int i2 = c14677.readInt();
        String strM33590 = c14677.m33590();
        C15992 c15993 = null;
        if (i != 1) {
            if (i == 2) {
                c15992 = new C15992(EnumC8617.TRACK, i2, null);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException("Unknown selection type");
                }
                if (strM33590 != null) {
                    c15993 = new C15992(EnumC8617.FILE, -1, strM33590);
                }
            }
            if (c15993 != null) {
                throw new IllegalArgumentException("Invalid selection data");
            }
            j = c14677.readLong();
            c15992M49628 = C22029.m49628(c15993);
            if (c15992M49628 != null) {
                throw new IllegalArgumentException("Invalid selection payload");
            }
            return new C24710(strM33593, c15992M49628, j);
        }
        c15992 = new C15992(EnumC8617.OFF, -1, null);
        c15993 = c15992;
        if (c15993 != null) {
            throw new IllegalArgumentException("Invalid selection data");
        }
        j = c14677.readLong();
        c15992M49628 = C22029.m49628(c15993);
        if (c15992M49628 != null) {
            throw new IllegalArgumentException("Invalid selection payload");
        }
        return new C24710(strM33593, c15992M49628, j);
    }
}
