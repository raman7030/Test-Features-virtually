package p067l;

import org.bouncycastle.math.p080ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.ۛۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K9U2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC8055 {
    CLASS_UNKNOWN("?", 0),
    CLASS_IN("in", 1),
    CLASS_CS("cs", 2),
    CLASS_CH("ch", 3),
    CLASS_HS("hs", 4),
    CLASS_NONE("none", Scalar25519.TARGET_LENGTH),
    CLASS_ANY("any", 255);


    /* JADX INFO: renamed from: ֫֫ */
    public static final boolean f21258 = true;

    /* JADX INFO: renamed from: ۛ */
    public static final int f21261 = 32767;

    /* JADX INFO: renamed from: ۟ */
    public static final boolean f21262 = false;

    /* JADX INFO: renamed from: ۧ֫ */
    public static InterfaceC4410 f21264 = C13128.m30023(EnumC8055.class.getName());

    /* JADX INFO: renamed from: ᩺ */
    public static final int f21270 = 32768;

    /* JADX INFO: renamed from: ᩸ */
    public final String f21271;

    /* JADX INFO: renamed from: ᩹ */
    public final int f21272;

    EnumC8055(String str, int i) {
        this.f21271 = str;
        this.f21272 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m18726() {
        return this.f21271;
    }

    /* JADX INFO: renamed from: ۧ */
    public int m18728() {
        return this.f21272;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m18727(int i) {
        return (this == CLASS_UNKNOWN || (i & 32768) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC8055 m18723(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            for (EnumC8055 enumC8055 : values()) {
                if (enumC8055.f21271.equals(lowerCase)) {
                    return enumC8055;
                }
            }
        }
        f21264.mo9198(str, "Could not find record class for name: {}");
        return CLASS_UNKNOWN;
    }

    /* JADX INFO: renamed from: ۧ */
    public static EnumC8055 m18724(int i) {
        int i2 = i & f21261;
        for (EnumC8055 enumC8055 : values()) {
            if (enumC8055.f21272 == i2) {
                return enumC8055;
            }
        }
        f21264.mo9198(Integer.valueOf(i), "Could not find record class for index: {}");
        return CLASS_UNKNOWN;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m18728();
    }
}
