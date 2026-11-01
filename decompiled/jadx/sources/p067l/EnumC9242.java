package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.UMConfigure;
import java.util.HashMap;
import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.۟ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E5S4 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC9242 {
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
    public static HashMap f25037;

    /* JADX INFO: renamed from: ۘ֫ */
    public static final EnumC9242[] f25038;

    /* JADX INFO: renamed from: ۗ */
    public int f25058;

    /* JADX INFO: renamed from: ۙ */
    public boolean f25059;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f25060;

    /* JADX INFO: renamed from: ᩸ */
    public String f25061;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f25062;

    static {
        EnumC9242[] enumC9242ArrValues = values();
        f25038 = enumC9242ArrValues;
        f25037 = new HashMap();
        for (EnumC9242 enumC9242 : enumC9242ArrValues) {
            f25037.put(enumC9242.f25061, enumC9242);
        }
    }

    EnumC9242(int i, String str, boolean z, boolean z2, boolean z3) {
        this.f25058 = i;
        this.f25061 = str;
        this.f25062 = z;
        this.f25059 = z2;
        this.f25060 = z3;
    }

    /* JADX INFO: renamed from: ܿ */
    public static EnumC9242[] m21291(int i) {
        int i2 = 0;
        for (EnumC9242 enumC9242 : f25038) {
            if (enumC9242.f25062 && (enumC9242.f25058 & i) != 0) {
                i2++;
            }
        }
        EnumC9242[] enumC9242Arr = new EnumC9242[i2];
        int i3 = 0;
        for (EnumC9242 enumC9243 : f25038) {
            if (enumC9243.f25062 && (enumC9243.f25058 & i) != 0) {
                enumC9242Arr[i3] = enumC9243;
                i3++;
            }
        }
        return enumC9242Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m21286(EnumC9242[] enumC9242Arr) {
        int length = 0;
        for (EnumC9242 enumC9242 : enumC9242Arr) {
            length += enumC9242.toString().length() + 1;
        }
        StringBuilder sb = new StringBuilder(length);
        for (EnumC9242 enumC9243 : enumC9242Arr) {
            sb.append(enumC9243.toString());
            sb.append(" ");
        }
        if (enumC9242Arr.length > 0) {
            sb.delete(sb.length() - 1, sb.length());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m21285(int i) {
        return m21286(m21291(i));
    }

    /* JADX INFO: renamed from: ᩻ */
    public static EnumC9242[] m21293(int i) {
        int i2 = 0;
        for (EnumC9242 enumC9242 : f25038) {
            if (enumC9242.f25059 && (enumC9242.f25058 & i) != 0) {
                i2++;
            }
        }
        EnumC9242[] enumC9242Arr = new EnumC9242[i2];
        int i3 = 0;
        for (EnumC9242 enumC9243 : f25038) {
            if (enumC9243.f25059 && (enumC9243.f25058 & i) != 0) {
                enumC9242Arr[i3] = enumC9243;
                i3++;
            }
        }
        return enumC9242Arr;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static String m21292(int i) {
        return m21286(m21293(i));
    }

    /* JADX INFO: renamed from: ܳ */
    public static EnumC9242[] m21290(int i) {
        int i2 = 0;
        for (EnumC9242 enumC9242 : f25038) {
            if (enumC9242.f25060 && (enumC9242.f25058 & i) != 0) {
                i2++;
            }
        }
        EnumC9242[] enumC9242Arr = new EnumC9242[i2];
        int i3 = 0;
        for (EnumC9242 enumC9243 : f25038) {
            if (enumC9243.f25060 && (enumC9243.f25058 & i) != 0) {
                enumC9242Arr[i3] = enumC9243;
                i3++;
            }
        }
        return enumC9242Arr;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m21289(int i) {
        return m21286(m21290(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC9242 m21287(String str) {
        return (EnumC9242) f25037.get(str);
    }

    public int getValue() {
        return this.f25058;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f25061;
    }
}
