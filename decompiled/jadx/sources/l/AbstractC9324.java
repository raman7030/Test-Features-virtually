package l;

/* JADX INFO: renamed from: l.ۢۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC9324 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[EnumC8618.values().length];
        b = iArr;
        try {
            iArr[EnumC8618.YEARS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[EnumC8618.DECADES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[EnumC8618.CENTURIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[EnumC8618.MILLENNIA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            b[EnumC8618.ERAS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[EnumC18496.values().length];
        a = iArr2;
        try {
            iArr2[EnumC18496.YEAR_OF_ERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[EnumC18496.YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[EnumC18496.ERA.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
