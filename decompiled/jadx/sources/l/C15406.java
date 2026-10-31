package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ܶᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: O416 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15406 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47178;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47179;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47180;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47181;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47182;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47183;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47184 = new C15406(0);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47185;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47186;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47187;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C15406 f47188;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C15406 f47189;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C15406 f47190;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte f47191;

    static {
        C15406 c15406 = new C15406(1);
        f47190 = c15406;
        C15406 c15407 = new C15406(2);
        f47189 = c15407;
        f47179 = new C15406(4);
        C15406 c15408 = new C15406(12);
        f47181 = c15408;
        C15406 c15409 = new C15406(16);
        f47187 = c15409;
        C15406 c154010 = new C15406(32);
        f47180 = c154010;
        f47188 = new C15406(64);
        f47186 = new C15406(127);
        f47183 = new C15406(132);
        f47182 = m36455(c15407, c15406);
        f47185 = m36455(c15408, c15409);
        m36455(c15408, c154010);
        f47178 = m36455(c15408, c15407);
        m36455(c15408, c15407, c15406);
    }

    public C15406(int i) {
        this.f47191 = (byte) i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15406 m36455(C15406... c15406Arr) {
        byte b = 0;
        for (C15406 c15406 : c15406Arr) {
            b = (byte) (b | c15406.f47191);
        }
        return new C15406(b);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m36458(C15406 c15406) {
        return ((~c15406.f47191) & this.f47191) == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36457(C15406 c15406) {
        return (c15406.f47191 & this.f47191) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumSet m36456() {
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC8352.class);
        byte b = f47181.f47191;
        byte b2 = this.f47191;
        int i = b & b2;
        if (i != 0) {
            if (i == f47179.f47191) {
                enumSetNoneOf.add(EnumC8352.VAR);
            } else {
                enumSetNoneOf.add(EnumC8352.VAL);
            }
        }
        if ((f47187.f47191 & b2) != 0) {
            enumSetNoneOf.add(EnumC8352.METHOD);
        }
        if ((f47189.f47191 & b2) != 0) {
            enumSetNoneOf.add(EnumC8352.CLASS);
        }
        if ((f47190.f47191 & b2) != 0) {
            enumSetNoneOf.add(EnumC8352.PACKAGE);
        }
        if ((f47188.f47191 & b2) != 0) {
            enumSetNoneOf.add(EnumC8352.MODULE);
        }
        return enumSetNoneOf;
    }
}
