package p067l;

/* JADX INFO: renamed from: l.᩷ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AUY */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC22172 {
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


    /* JADX INFO: renamed from: ۬ */
    public static final EnumC22172[] f70143 = new EnumC22172[0];

    /* JADX INFO: renamed from: ᩸ */
    public final int f70155 = 1 << ordinal();

    EnumC22172() {
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m49980(EnumC22172[] enumC22172Arr) {
        if (enumC22172Arr == null) {
            return 0;
        }
        int i = 0;
        for (EnumC22172 enumC22172 : enumC22172Arr) {
            i |= enumC22172.f70155;
        }
        return i;
    }
}
