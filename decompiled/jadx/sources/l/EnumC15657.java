package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.UMConfigure;
import java.util.HashMap;
import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.ܺۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E5S4 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC15657 {
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


    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static HashMap f48185;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15657[] f48186;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f48206;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f48207;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f48208;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f48209;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f48210;

    static {
        EnumC15657[] enumC15657ArrValues = values();
        f48186 = enumC15657ArrValues;
        f48185 = new HashMap();
        for (EnumC15657 enumC15657 : enumC15657ArrValues) {
            f48185.put(enumC15657.f48209, enumC15657);
        }
    }

    EnumC15657(int i, String str, boolean z, boolean z2, boolean z3) {
        this.f48206 = i;
        this.f48209 = str;
        this.f48210 = z;
        this.f48207 = z2;
        this.f48208 = z3;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static EnumC15657[] m36860(int i) {
        int i2 = 0;
        for (EnumC15657 enumC15657 : f48186) {
            if (enumC15657.f48210 && (enumC15657.f48206 & i) != 0) {
                i2++;
            }
        }
        EnumC15657[] enumC15657Arr = new EnumC15657[i2];
        int i3 = 0;
        for (EnumC15657 enumC15658 : f48186) {
            if (enumC15658.f48210 && (enumC15658.f48206 & i) != 0) {
                enumC15657Arr[i3] = enumC15658;
                i3++;
            }
        }
        return enumC15657Arr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36856(EnumC15657[] enumC15657Arr) {
        int length = 0;
        for (EnumC15657 enumC15657 : enumC15657Arr) {
            length += enumC15657.toString().length() + 1;
        }
        StringBuilder sb = new StringBuilder(length);
        for (EnumC15657 enumC15658 : enumC15657Arr) {
            sb.append(enumC15658.toString());
            sb.append(" ");
        }
        if (enumC15657Arr.length > 0) {
            sb.delete(sb.length() - 1, sb.length());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m36859(int i) {
        return m36856(m36860(i));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static EnumC15657[] m36858(int i) {
        int i2 = 0;
        for (EnumC15657 enumC15657 : f48186) {
            if (enumC15657.f48207 && (enumC15657.f48206 & i) != 0) {
                i2++;
            }
        }
        EnumC15657[] enumC15657Arr = new EnumC15657[i2];
        int i3 = 0;
        for (EnumC15657 enumC15658 : f48186) {
            if (enumC15658.f48207 && (enumC15658.f48206 & i) != 0) {
                enumC15657Arr[i3] = enumC15658;
                i3++;
            }
        }
        return enumC15657Arr;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m36861(int i) {
        return m36856(m36858(i));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static EnumC15657[] m36864(int i) {
        int i2 = 0;
        for (EnumC15657 enumC15657 : f48186) {
            if (enumC15657.f48208 && (enumC15657.f48206 & i) != 0) {
                i2++;
            }
        }
        EnumC15657[] enumC15657Arr = new EnumC15657[i2];
        int i3 = 0;
        for (EnumC15657 enumC15658 : f48186) {
            if (enumC15658.f48208 && (enumC15658.f48206 & i) != 0) {
                enumC15657Arr[i3] = enumC15658;
                i3++;
            }
        }
        return enumC15657Arr;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m36862(int i) {
        return m36856(m36864(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC15657 m36857(String str) {
        return (EnumC15657) f48185.get(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m36866(int i) {
        return (i & this.f48206) != 0;
    }

    public int getValue() {
        return this.f48206;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f48209;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m36865() {
        return this.f48209;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m36867() {
        return this.f48210;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean m36868() {
        return this.f48208;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean m36869() {
        return this.f48207;
    }
}
