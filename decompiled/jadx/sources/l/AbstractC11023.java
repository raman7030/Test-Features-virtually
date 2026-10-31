package l;

/* JADX INFO: renamed from: l.ۧ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC11023 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[EnumC8618.values().length];
        b = iArr;
        try {
            iArr[EnumC8618.MONTHS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[EnumC8618.YEARS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[EnumC8618.DECADES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[EnumC8618.CENTURIES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            b[EnumC8618.MILLENNIA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            b[EnumC8618.ERAS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr2 = new int[EnumC18496.values().length];
        a = iArr2;
        try {
            iArr2[EnumC18496.MONTH_OF_YEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[EnumC18496.PROLEPTIC_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[EnumC18496.YEAR_OF_ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[EnumC18496.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            a[EnumC18496.ERA.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
