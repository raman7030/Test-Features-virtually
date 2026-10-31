package l;

import java.nio.file.attribute.GroupPrincipal;
import javax.security.auth.Subject;

/* JADX INFO: renamed from: l.֨ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1206 implements InterfaceC11585 {
    public final /* synthetic */ GroupPrincipal a;

    public /* synthetic */ C1206(GroupPrincipal groupPrincipal) {
        this.a = groupPrincipal;
    }

    public static /* synthetic */ C1206 a(GroupPrincipal groupPrincipal) {
        if (groupPrincipal == null) {
            return null;
        }
        return new C1206(groupPrincipal);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        GroupPrincipal groupPrincipal = this.a;
        if (obj instanceof C1206) {
            obj = ((C1206) obj).a;
        }
        return groupPrincipal.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }
}
