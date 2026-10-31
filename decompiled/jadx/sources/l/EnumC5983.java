package l;

import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.ۛۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K9U2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5983 {
    CLASS_UNKNOWN("?", 0),
    CLASS_IN("in", 1),
    CLASS_CS("cs", 2),
    CLASS_CH("ch", 3),
    CLASS_HS("hs", 4),
    CLASS_NONE("none", Scalar25519.TARGET_LENGTH),
    CLASS_ANY("any", 255);


    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final boolean f18406 = true;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final int f18409 = 32767;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final boolean f18410 = false;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f18412 = C11321.m27962(EnumC5983.class.getName());

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final int f18418 = 32768;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f18419;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f18420;

    EnumC5983(String str, int i) {
        this.f18419 = str;
        this.f18420 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m16800() {
        return this.f18419;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int m16802() {
        return this.f18420;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m16801(int i) {
        return (this == CLASS_UNKNOWN || (i & 32768) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC5983 m16797(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            for (EnumC5983 enumC5983 : values()) {
                if (enumC5983.f18419.equals(lowerCase)) {
                    return enumC5983;
                }
            }
        }
        f18412.mo7103(str, "Could not find record class for name: {}");
        return CLASS_UNKNOWN;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC5983 m16798(int i) {
        int i2 = i & f18409;
        for (EnumC5983 enumC5983 : values()) {
            if (enumC5983.f18420 == i2) {
                return enumC5983;
            }
        }
        f18412.mo7103(Integer.valueOf(i), "Could not find record class for index: {}");
        return CLASS_UNKNOWN;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m16802();
    }
}
