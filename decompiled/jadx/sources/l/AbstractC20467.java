package l;

/* JADX INFO: renamed from: l.᩶᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC20467 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EnumC18496.values().length];
        a = iArr;
        try {
            iArr[EnumC18496.PROLEPTIC_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[EnumC18496.YEAR_OF_ERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[EnumC18496.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
