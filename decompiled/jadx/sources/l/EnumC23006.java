package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.᩺۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77EG */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC23006 {
    UNKNOWN_TYPE(-1, -1, "unknown", false, false, false),
    SAME_FRAME(0, 63, "same", false, false, false),
    SAME_LOCALS_1_STACK_ITEM_FRAME(64, 127, "stack1", false, true, false),
    RESERVED(128, 245, "reserved", false, false, false),
    EARLY_LARVAL(246, 246, "early_larval", false, false, true),
    SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED(247, 247, "stack1_ex", false, true, false),
    CHOP_1_FRAME(250, 250, "chop1", false, false, false),
    CHOP_2_FRAME(249, 249, "chop2", false, false, false),
    CHOP_3_FRAME(248, 248, "chop3", false, false, false),
    SAME_FRAME_EXTENDED(251, 251, "same_ex", false, false, false),
    APPEND_FRAME(252, Scalar25519.TARGET_LENGTH, "append", true, false, false),
    FULL_FRAME(255, 255, "full", true, true, false);


    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static HashMap f74070;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C20603 f74075;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f74076;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f74077;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f74078;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f74079;

    EnumC23006(int i, int i2, String str, boolean z, boolean z2, boolean z3) {
        this.f74075 = new C20603(Integer.valueOf(i), Integer.valueOf(i2));
        this.f74076 = str;
        this.f74079 = z;
        this.f74077 = z2;
        this.f74078 = z3;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean m51156() {
        return this.f74079;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean m51158() {
        return this.f74077;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m51155() {
        return this.f74078;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC23006 m51148(String str) {
        if (f74070 == null) {
            f74070 = (HashMap) C22311.stream(values()).collect(C22976.toMap(new C1775(6), C20696.identity()));
        }
        EnumC23006 enumC23006 = (EnumC23006) f74070.get(str);
        return enumC23006 == null ? UNKNOWN_TYPE : enumC23006;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC23006 m51150(int i) {
        for (EnumC23006 enumC23006 : values()) {
            if (enumC23006.m51153(i)) {
                return enumC23006;
            }
        }
        return UNKNOWN_TYPE;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m51152() {
        return ((Integer) this.f74075.m47145()).intValue();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String m51154() {
        return this.f74076;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String m51157() {
        String strReplace = name().toLowerCase().replace("_frame", "");
        return strReplace.startsWith("chop") ? this.f74076 : strReplace;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m51153(int i) {
        return this.f74075.m47146(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m51151(int i) {
        Object[] objArr = {UNKNOWN_TYPE, RESERVED};
        HashSet hashSet = new HashSet(2);
        for (int i2 = 0; i2 < 2; i2++) {
            Object obj = objArr[i2];
            C11003.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
            }
        }
        Iterator it = C20195.unmodifiableSet(hashSet).iterator();
        while (it.hasNext()) {
            if (((EnumC23006) it.next()).m51153(i)) {
                return false;
            }
        }
        return true;
    }
}
