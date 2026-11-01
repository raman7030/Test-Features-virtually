package p067l;

import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* JADX INFO: renamed from: l.ۤ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12038 implements UserPrincipal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC13379 f33537a;

    public /* synthetic */ C12038(InterfaceC13379 interfaceC13379) {
        this.f33537a = interfaceC13379;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ UserPrincipal m27552a(InterfaceC13379 interfaceC13379) {
        if (interfaceC13379 == null) {
            return null;
        }
        if (interfaceC13379 instanceof C21621) {
            return ((C21621) interfaceC13379).f68146a;
        }
        return interfaceC13379 instanceof C3515 ? ((C3515) interfaceC13379).f7124a : new C12038(interfaceC13379);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC13379 interfaceC13379 = this.f33537a;
        if (obj instanceof C12038) {
            obj = ((C12038) obj).f33537a;
        }
        return interfaceC13379.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.f33537a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.f33537a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.f33537a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.f33537a.toString();
    }
}
