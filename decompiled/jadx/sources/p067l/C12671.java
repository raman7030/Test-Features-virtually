package p067l;

import java.security.AccessControlContext;
import java.security.AccessController;

/* JADX INFO: renamed from: l.ۧۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12671 implements InterfaceC9790 {

    /* JADX INFO: renamed from: ֫ */
    public static final AccessControlContext f35564 = C18705.m42672(C18705.f55879, new RuntimePermission("enableContextClassLoaderOverride"), new RuntimePermission("modifyThreadGroup"), new RuntimePermission("getClassLoader"), new RuntimePermission("setContextClassLoader"));

    @Override // p067l.InterfaceC9790
    /* JADX INFO: renamed from: ֫ */
    public final C5965 mo22812(C18705 c18705) {
        return (C5965) AccessController.doPrivileged(new C3953(c18705), f35564);
    }
}
