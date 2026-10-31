package l;

import java.security.PrivilegedAction;

/* JADX INFO: renamed from: l.᩺᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23330 implements PrivilegedAction {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17189 f74985;

    public C23330(C17189 c17189) {
        this.f74985 = c17189;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        return new C3784(this.f74985, ClassLoader.getSystemClassLoader());
    }
}
