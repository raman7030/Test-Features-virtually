package p067l;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.۟֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BK7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9155 {

    /* JADX INFO: renamed from: ֫ */
    public final C11838 f24802;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC13179 f24803;

    /* JADX INFO: renamed from: ܽ */
    public final HashSet f24804;

    public C9155() {
        C3987 c3987 = new C3987();
        C11838 c11838 = new C11838();
        this.f24804 = new HashSet();
        this.f24803 = c3987;
        this.f24802 = c11838;
    }

    /* JADX INFO: renamed from: ֫ */
    public final File m21099(Context context) {
        ((C3987) this.f24803).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("pl_droidsonroids_gif"));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m21098(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }
}
