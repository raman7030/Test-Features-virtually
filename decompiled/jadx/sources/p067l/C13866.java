package p067l;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۫֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAQ1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13866 {

    /* JADX INFO: renamed from: ܽ */
    public static WeakReference f39171;

    /* JADX INFO: renamed from: ֫ */
    public final C14645 f39172;

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f39173;

    /* JADX INFO: renamed from: ֫ */
    public static C13866 m31575() {
        C13866 c13866;
        C13866 c13867;
        WeakReference weakReference = f39171;
        if (weakReference != null && (c13867 = (C13866) weakReference.get()) != null) {
            return c13867;
        }
        synchronized (C13866.class) {
            WeakReference weakReference2 = f39171;
            if (weakReference2 != null && (c13866 = (C13866) weakReference2.get()) != null) {
                return c13866;
            }
            C13866 c13868 = new C13866();
            f39171 = new WeakReference(c13868);
            return c13868;
        }
    }

    public C13866() {
        try {
            C14645 c14645M33467 = C14645.m33467(C10135.m23615("/assets/android_dex"));
            int iM33494 = c14645M33467.m33494();
            this.f39172 = c14645M33467;
            this.f39173 = new HashMap(iM33494);
            for (int i = 0; i < iM33494; i++) {
                int iM33469 = c14645M33467.m33469(i);
                int iM33483 = c14645M33467.m33483(i);
                this.f39173.put(c14645M33467.m33497(iM33469), new C11855(iM33469, iM33483));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23924 m31576(String str) {
        C11855 c11855 = (C11855) this.f39173.get(str);
        if (c11855 == null) {
            return null;
        }
        return new C23924(new C9952(this.f39172, c11855.f33057, c11855.f33056));
    }
}
