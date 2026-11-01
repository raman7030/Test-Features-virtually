package p067l;

import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* JADX INFO: renamed from: l.᩶ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21621 implements InterfaceC13379 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ UserPrincipal f68146a;

    public /* synthetic */ C21621(UserPrincipal userPrincipal) {
        this.f68146a = userPrincipal;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC13379 m48825a(UserPrincipal userPrincipal) {
        if (userPrincipal == null) {
            return null;
        }
        if (userPrincipal instanceof C12038) {
            return ((C12038) userPrincipal).f33537a;
        }
        return userPrincipal instanceof GroupPrincipal ? C3515.m6292a((GroupPrincipal) userPrincipal) : new C21621(userPrincipal);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipal userPrincipal = this.f68146a;
        if (obj instanceof C21621) {
            obj = ((C21621) obj).f68146a;
        }
        return userPrincipal.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.f68146a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.f68146a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.f68146a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.f68146a.toString();
    }
}
