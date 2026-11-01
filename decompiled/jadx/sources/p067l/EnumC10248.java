package p067l;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.۠ܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q87L */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC10248 implements InterfaceC16952 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC10248 f28377;

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC10248 f28378;

    /* JADX INFO: renamed from: ۤ */
    public static final EnumC10248 f28379;

    /* JADX INFO: renamed from: ۫ */
    public static final EnumC10248 f28380;

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC10248 f28381;

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC10248 f28382;

    /* JADX INFO: renamed from: ᩹ */
    public static final EnumC10248 f28384 = new C4884("IDENTITY", 0);

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ EnumC10248[] f28383 = m23858();

    /* JADX INFO: renamed from: ۧ */
    public abstract /* synthetic */ String mo4615(Field field);

    public EnumC10248(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC10248(String str, int i, C4884 c4884) {
        this(str, i);
    }

    public static EnumC10248 valueOf(String str) {
        return (EnumC10248) Enum.valueOf(EnumC10248.class, str);
    }

    public static EnumC10248[] values() {
        return (EnumC10248[]) f28383.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ EnumC10248[] m23858() {
        return new EnumC10248[]{f28384, f28381, f28380, f28379, f28377, f28382, f28378};
    }

    static {
        final String str = "UPPER_CAMEL_CASE";
        final int i = 1;
        f28381 = new EnumC10248(str, i) { // from class: l.ۘܽۖ
            {
                C4884 c4884 = null;
            }

            @Override // p067l.EnumC10248, p067l.InterfaceC16952
            /* JADX INFO: renamed from: ֫ */
            public List mo4614(Field field) {
                return Collections.EMPTY_LIST;
            }

            @Override // p067l.EnumC10248, p067l.InterfaceC16952
            /* JADX INFO: renamed from: ۧ */
            public String mo4615(Field field) {
                return EnumC10248.m23856(field.getName());
            }
        };
        final String str2 = "UPPER_CAMEL_CASE_WITH_SPACES";
        final int i2 = 2;
        f28380 = new EnumC10248(str2, i2) { // from class: l.ᩴܽۖ
            @Override // p067l.EnumC10248, p067l.InterfaceC16952
            /* JADX INFO: renamed from: ֫ */
            public List mo4614(Field field) {
                return Collections.EMPTY_LIST;
            }

            {
                C4884 c4884 = null;
            }

            @Override // p067l.EnumC10248, p067l.InterfaceC16952
            /* JADX INFO: renamed from: ۧ */
            public String mo4615(Field field) {
                return EnumC10248.m23856(EnumC10248.m23857(field.getName(), ' '));
            }
        };
        final String str3 = "UPPER_CASE_WITH_UNDERSCORES";
        final int i3 = 3;
        f28379 = new EnumC10248(str3, i3) { // from class: l.᩵ܽۖ
            @Override // p067l.EnumC10248, p067l.InterfaceC16952
            /* JADX INFO: renamed from: ֫ */
            public List mo4614(Field field) {
                return Collections.EMPTY_LIST;
            }

            {
                C4884 c4884 = null;
            }

            @Override // p067l.EnumC10248, p067l.InterfaceC16952
            /* JADX INFO: renamed from: ۧ */
            public String mo4615(Field field) {
                return EnumC10248.m23857(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        final String str4 = "LOWER_CASE_WITH_UNDERSCORES";
        final int i4 = 4;
        f28377 = new EnumC10248(str4, i4) { // from class: l.֡ܽۖ
            @Override // p067l.EnumC10248, p067l.InterfaceC16952
            /* JADX INFO: renamed from: ֫ */
            public List mo4614(Field field) {
                return Collections.EMPTY_LIST;
            }

            {
                C4884 c4884 = null;
            }

            @Override // p067l.EnumC10248, p067l.InterfaceC16952
            /* JADX INFO: renamed from: ۧ */
            public String mo4615(Field field) {
                return EnumC10248.m23857(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        final String str5 = "LOWER_CASE_WITH_DASHES";
        final int i5 = 5;
        f28382 = new EnumC10248(str5, i5) { // from class: l.ۚܽۖ
            @Override // p067l.EnumC10248, p067l.InterfaceC16952
            /* JADX INFO: renamed from: ֫ */
            public List mo4614(Field field) {
                return Collections.EMPTY_LIST;
            }

            {
                C4884 c4884 = null;
            }

            @Override // p067l.EnumC10248, p067l.InterfaceC16952
            /* JADX INFO: renamed from: ۧ */
            public String mo4615(Field field) {
                return EnumC10248.m23857(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        final String str6 = "LOWER_CASE_WITH_DOTS";
        final int i6 = 6;
        f28378 = new EnumC10248(str6, i6) { // from class: l.֨ܽۖ
            @Override // p067l.EnumC10248, p067l.InterfaceC16952
            /* JADX INFO: renamed from: ֫ */
            public List mo4614(Field field) {
                return Collections.EMPTY_LIST;
            }

            {
                C4884 c4884 = null;
            }

            @Override // p067l.EnumC10248, p067l.InterfaceC16952
            /* JADX INFO: renamed from: ۧ */
            public String mo4615(Field field) {
                return EnumC10248.m23857(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
    }

    /* JADX INFO: renamed from: ֫ */
    public List mo4614(Field field) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m23857(String str, char c) {
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

    /* JADX INFO: renamed from: ֫ */
    public static String m23856(String str) {
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
                    return C21459.m48621(1, str, sb);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str.substring(0, i));
                sb2.append(upperCase);
                return C21459.m48621(i + 1, str, sb2);
            }
        }
        return str;
    }
}
