package l;

import java.security.AccessControlContext;
import java.security.AccessController;

/* JADX INFO: renamed from: l.ۧۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10840 implements InterfaceC7808 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AccessControlContext f32588 = C17189.m40427(C17189.f52698, new RuntimePermission("enableContextClassLoaderOverride"), new RuntimePermission("modifyThreadGroup"), new RuntimePermission("getClassLoader"), new RuntimePermission("setContextClassLoader"));

    @Override // l.InterfaceC7808
    /* JADX INFO: renamed from: ֫ */
    public final C3784 mo20831(C17189 c17189) {
        return (C3784) AccessController.doPrivileged(new C1667(c17189), f32588);
    }
}
