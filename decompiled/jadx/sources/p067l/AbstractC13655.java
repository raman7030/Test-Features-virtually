package p067l;

import java.security.AccessController;

/* JADX INFO: renamed from: l.ۨᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13655 {

    /* JADX INFO: renamed from: a */
    public static final boolean f38425a = ((Boolean) AccessController.doPrivileged(new C14424(3))).booleanValue();

    /* JADX INFO: renamed from: a */
    public static void m31054a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
