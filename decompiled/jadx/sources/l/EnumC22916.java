package l;

/* JADX INFO: renamed from: l.᩺ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: SA0U */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC22916 {
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


    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f73857 = 255;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int f73865 = 15;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f73870;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f73871;

    EnumC22916(String str, int i) {
        this.f73870 = str;
        this.f73871 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m51006() {
        return this.f73870;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int m51007() {
        return this.f73871;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC22916 m51003(int i) {
        int i2 = i & 15;
        for (EnumC22916 enumC22916 : values()) {
            if (enumC22916.f73871 == i2) {
                return enumC22916;
            }
        }
        return Unknown;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC22916 m51004(int i, int i2) {
        int i3 = (i & 15) | ((i2 >> 28) & 255);
        for (EnumC22916 enumC22916 : values()) {
            if (enumC22916.f73871 == i3) {
                return enumC22916;
            }
        }
        return Unknown;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m51007();
    }
}
