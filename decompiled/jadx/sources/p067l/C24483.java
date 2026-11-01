package p067l;

/* JADX INFO: renamed from: l.᩺᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AWA */
/* JADX INFO: loaded from: classes.dex */
public final class C24483 {

    /* JADX INFO: renamed from: ֫ */
    public static final Integer f77486;

    static {
        Integer num;
        Integer num2 = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            num = obj instanceof Integer ? (Integer) obj : null;
        } catch (Throwable unused) {
        }
        if (num != null && num.intValue() > 0) {
            num2 = num;
        }
        f77486 = num2;
    }
}
