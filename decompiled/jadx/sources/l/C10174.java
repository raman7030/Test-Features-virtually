package l;

import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* JADX INFO: renamed from: l.ۤ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10174 implements UserPrincipal {
    public final /* synthetic */ InterfaceC11585 a;

    public /* synthetic */ C10174(InterfaceC11585 interfaceC11585) {
        this.a = interfaceC11585;
    }

    public static /* synthetic */ UserPrincipal a(InterfaceC11585 interfaceC11585) {
        if (interfaceC11585 == null) {
            return null;
        }
        if (interfaceC11585 instanceof C20257) {
            return ((C20257) interfaceC11585).a;
        }
        return interfaceC11585 instanceof C1206 ? ((C1206) interfaceC11585).a : new C10174(interfaceC11585);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC11585 interfaceC11585 = this.a;
        if (obj instanceof C10174) {
            obj = ((C10174) obj).a;
        }
        return interfaceC11585.equals(obj);
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
