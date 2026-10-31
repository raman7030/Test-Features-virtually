package l;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.۠ܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q87L */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC8291 implements InterfaceC15345 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC8291 f25467;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC8291 f25468;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC8291 f25469;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC8291 f25470;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC8291 f25471;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC8291 f25472;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final EnumC8291 f25474 = new C2647("IDENTITY", 0);

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC8291[] f25473 = m21888();

    /* JADX INFO: renamed from: ۧ */
    public abstract /* synthetic */ String mo2248(Field field);

    public EnumC8291(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC8291(String str, int i, C2647 c2647) {
        this(str, i);
    }

    public static EnumC8291 valueOf(String str) {
        return (EnumC8291) Enum.valueOf(EnumC8291.class, str);
    }

    public static EnumC8291[] values() {
        return (EnumC8291[]) f25473.clone();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC8291[] m21888() {
        return new EnumC8291[]{f25474, f25471, f25470, f25469, f25467, f25472, f25468};
    }

    static {
        final String str = "UPPER_CAMEL_CASE";
        final int i = 1;
        f25471 = new EnumC8291(str, i) { // from class: l.ۘܽۖ
            {
                C2647 c2647 = null;
            }

            @Override // l.EnumC8291, l.InterfaceC15345
            /* JADX INFO: renamed from: ֫ */
            public List mo2247(Field field) {
                return Collections.EMPTY_LIST;
            }

            @Override // l.EnumC8291, l.InterfaceC15345
            /* JADX INFO: renamed from: ۧ */
            public String mo2248(Field field) {
                return EnumC8291.m21886(field.getName());
            }
        };
        final String str2 = "UPPER_CAMEL_CASE_WITH_SPACES";
        final int i2 = 2;
        f25470 = new EnumC8291(str2, i2) { // from class: l.ᩴܽۖ
            @Override // l.EnumC8291, l.InterfaceC15345
            /* JADX INFO: renamed from: ֫ */
            public List mo2247(Field field) {
                return Collections.EMPTY_LIST;
            }

            {
                C2647 c2647 = null;
            }

            @Override // l.EnumC8291, l.InterfaceC15345
            /* JADX INFO: renamed from: ۧ */
            public String mo2248(Field field) {
                return EnumC8291.m21886(EnumC8291.m21887(field.getName(), ' '));
            }
        };
        final String str3 = "UPPER_CASE_WITH_UNDERSCORES";
        final int i3 = 3;
        f25469 = new EnumC8291(str3, i3) { // from class: l.᩵ܽۖ
            @Override // l.EnumC8291, l.InterfaceC15345
            /* JADX INFO: renamed from: ֫ */
            public List mo2247(Field field) {
                return Collections.EMPTY_LIST;
            }

            {
                C2647 c2647 = null;
            }

            @Override // l.EnumC8291, l.InterfaceC15345
            /* JADX INFO: renamed from: ۧ */
            public String mo2248(Field field) {
                return EnumC8291.m21887(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        final String str4 = "LOWER_CASE_WITH_UNDERSCORES";
        final int i4 = 4;
        f25467 = new EnumC8291(str4, i4) { // from class: l.֡ܽۖ
            @Override // l.EnumC8291, l.InterfaceC15345
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public List mo2247(Field field) {
                return Collections.EMPTY_LIST;
            }

            {
                C2647 c2647 = null;
            }

            @Override // l.EnumC8291, l.InterfaceC15345
            /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
            public String mo2248(Field field) {
                return EnumC8291.m21887(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        final String str5 = "LOWER_CASE_WITH_DASHES";
        final int i5 = 5;
        f25472 = new EnumC8291(str5, i5) { // from class: l.ۚܽۖ
            @Override // l.EnumC8291, l.InterfaceC15345
            /* JADX INFO: renamed from: ֫ */
            public List mo2247(Field field) {
                return Collections.EMPTY_LIST;
            }

            {
                C2647 c2647 = null;
            }

            @Override // l.EnumC8291, l.InterfaceC15345
            /* JADX INFO: renamed from: ۧ */
            public String mo2248(Field field) {
                return EnumC8291.m21887(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        final String str6 = "LOWER_CASE_WITH_DOTS";
        final int i6 = 6;
        f25468 = new EnumC8291(str6, i6) { // from class: l.֨ܽۖ
            @Override // l.EnumC8291, l.InterfaceC15345
            /* JADX INFO: renamed from: ֫ */
            public List mo2247(Field field) {
                return Collections.EMPTY_LIST;
            }

            {
                C2647 c2647 = null;
            }

            @Override // l.EnumC8291, l.InterfaceC15345
            /* JADX INFO: renamed from: ۧ */
            public String mo2248(Field field) {
                return EnumC8291.m21887(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
    }

    /* JADX INFO: renamed from: ֫ */
    public List mo2247(Field field) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m21887(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m21886(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(upperCase);
                    return C20087.m46305(1, str, sb);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str.substring(0, i));
                sb2.append(upperCase);
                return C20087.m46305(i + 1, str, sb2);
            }
        }
        return str;
    }
}
