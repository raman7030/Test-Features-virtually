package l;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۫֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAQ1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12098 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static WeakReference f36160;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12918 f36161;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f36162;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12098 m29512() {
        C12098 c12098;
        C12098 c12099;
        WeakReference weakReference = f36160;
        if (weakReference != null && (c12099 = (C12098) weakReference.get()) != null) {
            return c12099;
        }
        synchronized (C12098.class) {
            WeakReference weakReference2 = f36160;
            if (weakReference2 != null && (c12098 = (C12098) weakReference2.get()) != null) {
                return c12098;
            }
            C12098 c120910 = new C12098();
            f36160 = new WeakReference(c120910);
            return c120910;
        }
    }

    public C12098() {
        try {
            C12918 c12918M31381 = C12918.m31381(C8172.m21646("/assets/android_dex"));
            int iM31408 = c12918M31381.m31408();
            this.f36161 = c12918M31381;
            this.f36162 = new HashMap(iM31408);
            for (int i = 0; i < iM31408; i++) {
                int iM31383 = c12918M31381.m31383(i);
                int iM31397 = c12918M31381.m31397(i);
                this.f36162.put(c12918M31381.m31411(iM31383), new C9982(iM31383, iM31397));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22681 m29513(String str) {
        C9982 c9982 = (C9982) this.f36162.get(str);
        if (c9982 == null) {
            return null;
        }
        return new C22681(new C7980(this.f36161, c9982.f30098, c9982.f30097));
    }
}
