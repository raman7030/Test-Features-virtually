package l;

import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* JADX INFO: renamed from: l.᩶ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20257 implements InterfaceC11585 {
    public final /* synthetic */ UserPrincipal a;

    public /* synthetic */ C20257(UserPrincipal userPrincipal) {
        this.a = userPrincipal;
    }

    public static /* synthetic */ InterfaceC11585 a(UserPrincipal userPrincipal) {
        if (userPrincipal == null) {
            return null;
        }
        if (userPrincipal instanceof C10174) {
            return ((C10174) userPrincipal).a;
        }
        return userPrincipal instanceof GroupPrincipal ? C1206.a((GroupPrincipal) userPrincipal) : new C20257(userPrincipal);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipal userPrincipal = this.a;
        if (obj instanceof C20257) {
            obj = ((C20257) obj).a;
        }
        return userPrincipal.equals(obj);
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
