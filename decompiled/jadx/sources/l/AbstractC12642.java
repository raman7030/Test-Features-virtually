package l;

/* JADX INFO: renamed from: l.۫᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC12642 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[EnumC8618.values().length];
        b = iArr;
        try {
            iArr[EnumC8618.NANOS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[EnumC8618.MICROS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[EnumC8618.MILLIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[EnumC8618.SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            b[EnumC8618.MINUTES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            b[EnumC8618.HOURS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            b[EnumC8618.HALF_DAYS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            b[EnumC8618.DAYS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        int[] iArr2 = new int[EnumC18496.values().length];
        a = iArr2;
        try {
            iArr2[EnumC18496.NANO_OF_SECOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[EnumC18496.MICRO_OF_SECOND.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            a[EnumC18496.MILLI_OF_SECOND.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            a[EnumC18496.INSTANT_SECONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
