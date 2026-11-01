package p067l;

import java.security.PrivilegedAction;

/* JADX INFO: renamed from: l.᩺᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes.dex */
public final class C24542 implements PrivilegedAction {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C18705 f77732;

    public C24542(C18705 c18705) {
        this.f77732 = c18705;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        return new C5965(this.f77732, ClassLoader.getSystemClassLoader());
    }
}
