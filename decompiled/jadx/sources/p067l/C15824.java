package p067l;

import java.security.AccessControlContext;
import java.security.AccessController;

/* JADX INFO: renamed from: l.ܰ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15824 implements InterfaceC9790 {

    /* JADX INFO: renamed from: ֫ */
    public static final AccessControlContext f45807 = C18705.m42672(new RuntimePermission("getClassLoader"));

    @Override // p067l.InterfaceC9790
    /* JADX INFO: renamed from: ֫ */
    public final C5965 mo22812(C18705 c18705) {
        return (C5965) AccessController.doPrivileged(new C24542(c18705), f45807);
    }
}
