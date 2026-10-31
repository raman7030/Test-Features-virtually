package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.UMConfigure;
import java.util.HashMap;
import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.۟ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E5S4 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC7233 {
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
    public static HashMap f22154;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC7233[] f22155;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f22175;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f22176;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f22177;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f22178;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f22179;

    static {
        EnumC7233[] enumC7233ArrValues = values();
        f22155 = enumC7233ArrValues;
        f22154 = new HashMap();
        for (EnumC7233 enumC7233 : enumC7233ArrValues) {
            f22154.put(enumC7233.f22178, enumC7233);
        }
    }

    EnumC7233(int i, String str, boolean z, boolean z2, boolean z3) {
        this.f22175 = i;
        this.f22178 = str;
        this.f22179 = z;
        this.f22176 = z2;
        this.f22177 = z3;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static EnumC7233[] m19342(int i) {
        int i2 = 0;
        for (EnumC7233 enumC7233 : f22155) {
            if (enumC7233.f22179 && (enumC7233.f22175 & i) != 0) {
                i2++;
            }
        }
        EnumC7233[] enumC7233Arr = new EnumC7233[i2];
        int i3 = 0;
        for (EnumC7233 enumC7234 : f22155) {
            if (enumC7234.f22179 && (enumC7234.f22175 & i) != 0) {
                enumC7233Arr[i3] = enumC7234;
                i3++;
            }
        }
        return enumC7233Arr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m19337(EnumC7233[] enumC7233Arr) {
        int length = 0;
        for (EnumC7233 enumC7233 : enumC7233Arr) {
            length += enumC7233.toString().length() + 1;
        }
        StringBuilder sb = new StringBuilder(length);
        for (EnumC7233 enumC7234 : enumC7233Arr) {
            sb.append(enumC7234.toString());
            sb.append(" ");
        }
        if (enumC7233Arr.length > 0) {
            sb.delete(sb.length() - 1, sb.length());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m19336(int i) {
        return m19337(m19342(i));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static EnumC7233[] m19344(int i) {
        int i2 = 0;
        for (EnumC7233 enumC7233 : f22155) {
            if (enumC7233.f22176 && (enumC7233.f22175 & i) != 0) {
                i2++;
            }
        }
        EnumC7233[] enumC7233Arr = new EnumC7233[i2];
        int i3 = 0;
        for (EnumC7233 enumC7234 : f22155) {
            if (enumC7234.f22176 && (enumC7234.f22175 & i) != 0) {
                enumC7233Arr[i3] = enumC7234;
                i3++;
            }
        }
        return enumC7233Arr;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m19343(int i) {
        return m19337(m19344(i));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static EnumC7233[] m19341(int i) {
        int i2 = 0;
        for (EnumC7233 enumC7233 : f22155) {
            if (enumC7233.f22177 && (enumC7233.f22175 & i) != 0) {
                i2++;
            }
        }
        EnumC7233[] enumC7233Arr = new EnumC7233[i2];
        int i3 = 0;
        for (EnumC7233 enumC7234 : f22155) {
            if (enumC7234.f22177 && (enumC7234.f22175 & i) != 0) {
                enumC7233Arr[i3] = enumC7234;
                i3++;
            }
        }
        return enumC7233Arr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m19340(int i) {
        return m19337(m19341(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC7233 m19338(String str) {
        return (EnumC7233) f22154.get(str);
    }

    public int getValue() {
        return this.f22175;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f22178;
    }
}
