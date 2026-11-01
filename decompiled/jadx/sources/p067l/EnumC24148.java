package p067l;

/* JADX INFO: renamed from: l.᩺ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: SA0U */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC24148 {
    Unknown("Unknown", 65535),
    NoError("No Error", 0),
    FormErr("Format Error", 1),
    ServFail("Server Failure", 2),
    NXDomain("Non-Existent Domain", 3),
    NotImp("Not Implemented", 4),
    Refused("Query Refused", 5),
    YXDomain("Name Exists when it should not", 6),
    YXRRSet("RR Set Exists when it should not", 7),
    NXRRSet("RR Set that should exist does not", 8),
    NotAuth("Server Not Authoritative for zone", 9),
    NotZone("NotZone Name not contained in zone", 10);


    /* JADX INFO: renamed from: ۙ */
    public static final int f76587 = 255;

    /* JADX INFO: renamed from: ܰ */
    public static final int f76595 = 15;

    /* JADX INFO: renamed from: ᩸ */
    public final String f76600;

    /* JADX INFO: renamed from: ᩹ */
    public final int f76601;

    EnumC24148(String str, int i) {
        this.f76600 = str;
        this.f76601 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m53397() {
        return this.f76600;
    }

    /* JADX INFO: renamed from: ۧ */
    public int m53398() {
        return this.f76601;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC24148 m53394(int i) {
        int i2 = i & 15;
        for (EnumC24148 enumC24148 : values()) {
            if (enumC24148.f76601 == i2) {
                return enumC24148;
            }
        }
        return Unknown;
    }

    /* JADX INFO: renamed from: ۧ */
    public static EnumC24148 m53395(int i, int i2) {
        int i3 = (i & 15) | ((i2 >> 28) & 255);
        for (EnumC24148 enumC24148 : values()) {
            if (enumC24148.f76601 == i3) {
                return enumC24148;
            }
        }
        return Unknown;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m53398();
    }
}
