package l;

/* JADX INFO: renamed from: l.᩷ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AUY */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC20837 {
    QuoteFieldNames,
    UseSingleQuotes,
    WriteMapNullValue,
    WriteEnumUsingToString,
    UseISO8601DateFormat,
    WriteNullListAsEmpty,
    WriteNullStringAsEmpty,
    WriteNullNumberAsZero,
    WriteNullBooleanAsFalse,
    SkipTransientField,
    SortField,
    WriteTabAsSpecial,
    PrettyFormat,
    WriteClassName,
    DisableCircularReferenceDetect,
    WriteSlashAsSpecial,
    WriteDateUseDateFormat,
    NotWriteRootClassName,
    DisableCheckSpecialChar,
    BeanToArray,
    WriteNonStringKeyAsString,
    NotWriteDefaultValue;


    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC20837[] f67460 = new EnumC20837[0];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f67472 = 1 << ordinal();

    EnumC20837() {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m47652(EnumC20837[] enumC20837Arr) {
        if (enumC20837Arr == null) {
            return 0;
        }
        int i = 0;
        for (EnumC20837 enumC20837 : enumC20837Arr) {
            i |= enumC20837.f67472;
        }
        return i;
    }
}
