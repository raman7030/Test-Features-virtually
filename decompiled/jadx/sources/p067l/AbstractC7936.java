package p067l;

/* JADX INFO: renamed from: l.ۛۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7936 {

    /* JADX INFO: renamed from: a */
    public static final boolean f20816a;

    /* JADX INFO: renamed from: b */
    public static final boolean f20817b;

    /* JADX INFO: renamed from: c */
    public static final boolean f20818c;

    static {
        boolean z;
        boolean z2;
        boolean z3 = false;
        try {
            Class.forName("java.util.StringJoiner");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f20816a = z;
        try {
            Class.forName("java.nio.file.FileSystems");
            z2 = true;
        } catch (ClassNotFoundException unused2) {
            z2 = false;
        }
        f20817b = z2;
        try {
            Class.forName("android.os.Build");
            z3 = true;
        } catch (ClassNotFoundException unused3) {
        }
        f20818c = z3;
    }
}
