package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.UMConfigure;
import java.util.HashMap;
import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.ܺۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E5S4 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC17248 {
    PUBLIC(1, "public", true, true, true),
    PRIVATE(2, "private", true, true, true),
    PROTECTED(4, "protected", true, true, true),
    STATIC(8, "static", true, true, true),
    FINAL(16, "final", true, true, true),
    SYNCHRONIZED(32, MessageHandler.Properties.IsSynchronized, false, true, false),
    VOLATILE(64, "volatile", false, false, true),
    BRIDGE(64, "bridge", false, true, false),
    TRANSIENT(128, "transient", false, false, true),
    VARARGS(128, "varargs", false, true, false),
    NATIVE(256, UMConfigure.WRAPER_TYPE_NATIVE, false, true, false),
    INTERFACE(512, "interface", true, false, false),
    ABSTRACT(1024, "abstract", true, true, false),
    STRICTFP(2048, "strictfp", false, true, false),
    SYNTHETIC(4096, "synthetic", true, true, true),
    ANNOTATION(8192, "annotation", true, false, false),
    ENUM(16384, "enum", true, false, true),
    CONSTRUCTOR(65536, "constructor", false, true, false),
    DECLARED_SYNCHRONIZED(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, "declared-synchronized", false, true, false);


    /* JADX INFO: renamed from: ۖ֫ */
    public static HashMap f51324;

    /* JADX INFO: renamed from: ۘ֫ */
    public static final EnumC17248[] f51325;

    /* JADX INFO: renamed from: ۗ */
    public int f51345;

    /* JADX INFO: renamed from: ۙ */
    public boolean f51346;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f51347;

    /* JADX INFO: renamed from: ᩸ */
    public String f51348;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f51349;

    static {
        EnumC17248[] enumC17248ArrValues = values();
        f51325 = enumC17248ArrValues;
        f51324 = new HashMap();
        for (EnumC17248 enumC17248 : enumC17248ArrValues) {
            f51324.put(enumC17248.f51348, enumC17248);
        }
    }

    EnumC17248(int i, String str, boolean z, boolean z2, boolean z3) {
        this.f51345 = i;
        this.f51348 = str;
        this.f51349 = z;
        this.f51346 = z2;
        this.f51347 = z3;
    }

    /* JADX INFO: renamed from: ܳ */
    public static EnumC17248[] m39026(int i) {
        int i2 = 0;
        for (EnumC17248 enumC17248 : f51325) {
            if (enumC17248.f51349 && (enumC17248.f51345 & i) != 0) {
                i2++;
            }
        }
        EnumC17248[] enumC17248Arr = new EnumC17248[i2];
        int i3 = 0;
        for (EnumC17248 enumC17249 : f51325) {
            if (enumC17249.f51349 && (enumC17249.f51345 & i) != 0) {
                enumC17248Arr[i3] = enumC17249;
                i3++;
            }
        }
        return enumC17248Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m39022(EnumC17248[] enumC17248Arr) {
        int length = 0;
        for (EnumC17248 enumC17248 : enumC17248Arr) {
            length += enumC17248.toString().length() + 1;
        }
        StringBuilder sb = new StringBuilder(length);
        for (EnumC17248 enumC17249 : enumC17248Arr) {
            sb.append(enumC17249.toString());
            sb.append(" ");
        }
        if (enumC17248Arr.length > 0) {
            sb.delete(sb.length() - 1, sb.length());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m39025(int i) {
        return m39022(m39026(i));
    }

    /* JADX INFO: renamed from: ۜ */
    public static EnumC17248[] m39024(int i) {
        int i2 = 0;
        for (EnumC17248 enumC17248 : f51325) {
            if (enumC17248.f51346 && (enumC17248.f51345 & i) != 0) {
                i2++;
            }
        }
        EnumC17248[] enumC17248Arr = new EnumC17248[i2];
        int i3 = 0;
        for (EnumC17248 enumC17249 : f51325) {
            if (enumC17249.f51346 && (enumC17249.f51345 & i) != 0) {
                enumC17248Arr[i3] = enumC17249;
                i3++;
            }
        }
        return enumC17248Arr;
    }

    /* JADX INFO: renamed from: ܿ */
    public static String m39027(int i) {
        return m39022(m39024(i));
    }

    /* JADX INFO: renamed from: ᩻ */
    public static EnumC17248[] m39030(int i) {
        int i2 = 0;
        for (EnumC17248 enumC17248 : f51325) {
            if (enumC17248.f51347 && (enumC17248.f51345 & i) != 0) {
                i2++;
            }
        }
        EnumC17248[] enumC17248Arr = new EnumC17248[i2];
        int i3 = 0;
        for (EnumC17248 enumC17249 : f51325) {
            if (enumC17249.f51347 && (enumC17249.f51345 & i) != 0) {
                enumC17248Arr[i3] = enumC17249;
                i3++;
            }
        }
        return enumC17248Arr;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static String m39028(int i) {
        return m39022(m39030(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC17248 m39023(String str) {
        return (EnumC17248) f51324.get(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m39032(int i) {
        return (i & this.f51345) != 0;
    }

    public int getValue() {
        return this.f51345;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f51348;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m39031() {
        return this.f51348;
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean m39033() {
        return this.f51349;
    }

    /* JADX INFO: renamed from: ܿ */
    public boolean m39034() {
        return this.f51347;
    }

    /* JADX INFO: renamed from: ᩻ */
    public boolean m39035() {
        return this.f51346;
    }
}
