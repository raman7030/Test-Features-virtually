package p067l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ܶᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: O416 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17010 {

    /* JADX INFO: renamed from: ۖ */
    public static final C17010 f50308;

    /* JADX INFO: renamed from: ۘ */
    public static final C17010 f50309;

    /* JADX INFO: renamed from: ۜ */
    public static final C17010 f50310;

    /* JADX INFO: renamed from: ۡ */
    public static final C17010 f50311;

    /* JADX INFO: renamed from: ۢ */
    public static final C17010 f50312;

    /* JADX INFO: renamed from: ۧ */
    public static final C17010 f50313;

    /* JADX INFO: renamed from: ܳ */
    public static final C17010 f50314 = new C17010(0);

    /* JADX INFO: renamed from: ܺ */
    public static final C17010 f50315;

    /* JADX INFO: renamed from: ܽ */
    public static final C17010 f50316;

    /* JADX INFO: renamed from: ܿ */
    public static final C17010 f50317;

    /* JADX INFO: renamed from: ᩳ */
    public static final C17010 f50318;

    /* JADX INFO: renamed from: ᩷ */
    public static final C17010 f50319;

    /* JADX INFO: renamed from: ᩻ */
    public static final C17010 f50320;

    /* JADX INFO: renamed from: ֫ */
    public final byte f50321;

    static {
        C17010 c17010 = new C17010(1);
        f50320 = c17010;
        C17010 c17011 = new C17010(2);
        f50319 = c17011;
        f50309 = new C17010(4);
        C17010 c17012 = new C17010(12);
        f50311 = c17012;
        C17010 c17013 = new C17010(16);
        f50317 = c17013;
        C17010 c17014 = new C17010(32);
        f50310 = c17014;
        f50318 = new C17010(64);
        f50316 = new C17010(127);
        f50313 = new C17010(132);
        f50312 = m38613(c17011, c17010);
        f50315 = m38613(c17012, c17013);
        m38613(c17012, c17014);
        f50308 = m38613(c17012, c17011);
        m38613(c17012, c17011, c17010);
    }

    public C17010(int i) {
        this.f50321 = (byte) i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17010 m38613(C17010... c17010Arr) {
        byte b = 0;
        for (C17010 c17010 : c17010Arr) {
            b = (byte) (b | c17010.f50321);
        }
        return new C17010(b);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m38616(C17010 c17010) {
        return ((~c17010.f50321) & this.f50321) == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38615(C17010 c17010) {
        return (c17010.f50321 & this.f50321) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumSet m38614() {
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC10306.class);
        byte b = f50311.f50321;
        byte b2 = this.f50321;
        int i = b & b2;
        if (i != 0) {
            if (i == f50309.f50321) {
                enumSetNoneOf.add(EnumC10306.VAR);
            } else {
                enumSetNoneOf.add(EnumC10306.VAL);
            }
        }
        if ((f50317.f50321 & b2) != 0) {
            enumSetNoneOf.add(EnumC10306.METHOD);
        }
        if ((f50319.f50321 & b2) != 0) {
            enumSetNoneOf.add(EnumC10306.CLASS);
        }
        if ((f50320.f50321 & b2) != 0) {
            enumSetNoneOf.add(EnumC10306.PACKAGE);
        }
        if ((f50318.f50321 & b2) != 0) {
            enumSetNoneOf.add(EnumC10306.MODULE);
        }
        return enumSetNoneOf;
    }
}
