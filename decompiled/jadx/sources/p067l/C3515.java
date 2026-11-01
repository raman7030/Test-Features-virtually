package p067l;

import java.nio.file.attribute.GroupPrincipal;
import javax.security.auth.Subject;

/* JADX INFO: renamed from: l.֨ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3515 implements InterfaceC13379 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ GroupPrincipal f7124a;

    public /* synthetic */ C3515(GroupPrincipal groupPrincipal) {
        this.f7124a = groupPrincipal;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C3515 m6292a(GroupPrincipal groupPrincipal) {
        if (groupPrincipal == null) {
            return null;
        }
        return new C3515(groupPrincipal);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        GroupPrincipal groupPrincipal = this.f7124a;
        if (obj instanceof C3515) {
            obj = ((C3515) obj).f7124a;
        }
        return groupPrincipal.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.f7124a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.f7124a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.f7124a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.f7124a.toString();
    }
}
