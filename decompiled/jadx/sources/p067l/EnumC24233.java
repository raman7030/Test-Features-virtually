package p067l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.math.p080ec.rfc8032.Scalar25519;

/* JADX INFO: renamed from: l.᩺۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77EG */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC24233 {
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


    /* JADX INFO: renamed from: ܳ֫ */
    public static HashMap f76809;

    /* JADX INFO: renamed from: ۗ */
    public final C21949 f76814;

    /* JADX INFO: renamed from: ۙ */
    public final String f76815;

    /* JADX INFO: renamed from: ᩶ */
    public final boolean f76816;

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f76817;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f76818;

    EnumC24233(int i, int i2, String str, boolean z, boolean z2, boolean z3) {
        this.f76814 = new C21949(Integer.valueOf(i), Integer.valueOf(i2));
        this.f76815 = str;
        this.f76818 = z;
        this.f76816 = z2;
        this.f76817 = z3;
    }

    /* JADX INFO: renamed from: ܿ */
    public boolean m53549() {
        return this.f76818;
    }

    /* JADX INFO: renamed from: ᩻ */
    public boolean m53551() {
        return this.f76816;
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean m53548() {
        return this.f76817;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC24233 m53541(String str) {
        if (f76809 == null) {
            f76809 = (HashMap) C23573.stream(values()).collect(C24205.toMap(new C4055(6), C22038.identity()));
        }
        EnumC24233 enumC24233 = (EnumC24233) f76809.get(str);
        return enumC24233 == null ? UNKNOWN_TYPE : enumC24233;
    }

    /* JADX INFO: renamed from: ۧ */
    public static EnumC24233 m53543(int i) {
        for (EnumC24233 enumC24233 : values()) {
            if (enumC24233.m53546(i)) {
                return enumC24233;
            }
        }
        return UNKNOWN_TYPE;
    }

    /* JADX INFO: renamed from: ֫ */
    public int m53545() {
        return ((Integer) this.f76814.m49471()).intValue();
    }

    /* JADX INFO: renamed from: ۢ */
    public String m53547() {
        return this.f76815;
    }

    /* JADX INFO: renamed from: ᩷ */
    public String m53550() {
        String strReplace = name().toLowerCase().replace("_frame", "");
        return strReplace.startsWith("chop") ? this.f76815 : strReplace;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m53546(int i) {
        return this.f76814.m49472(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m53544(int i) {
        Object[] objArr = {UNKNOWN_TYPE, RESERVED};
        HashSet hashSet = new HashSet(2);
        for (int i2 = 0; i2 < 2; i2++) {
            Object obj = objArr[i2];
            C12826.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
            }
        }
        Iterator it = C21562.unmodifiableSet(hashSet).iterator();
        while (it.hasNext()) {
            if (((EnumC24233) it.next()).m53546(i)) {
                return false;
            }
        }
        return true;
    }
}
