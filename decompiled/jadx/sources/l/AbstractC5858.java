package l;

/* JADX INFO: renamed from: l.ۛۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5858 {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;

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
        a = z;
        try {
            Class.forName("java.nio.file.FileSystems");
            z2 = true;
        } catch (ClassNotFoundException unused2) {
            z2 = false;
        }
        b = z2;
        try {
            Class.forName("android.os.Build");
            z3 = true;
        } catch (ClassNotFoundException unused3) {
        }
        c = z3;
    }
}
