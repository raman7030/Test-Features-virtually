package l;

/* JADX INFO: renamed from: l.۬᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC13347 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EnumC8618.values().length];
        a = iArr;
        try {
            iArr[EnumC8618.NANOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[EnumC8618.MICROS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[EnumC8618.MILLIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[EnumC8618.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
