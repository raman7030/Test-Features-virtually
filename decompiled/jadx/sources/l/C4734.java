package l;

import java.nio.file.PathMatcher;

/* JADX INFO: renamed from: l.ۙܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4734 implements InterfaceC9469 {
    public final /* synthetic */ PathMatcher a;

    public /* synthetic */ C4734(PathMatcher pathMatcher) {
        this.a = pathMatcher;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PathMatcher pathMatcher = this.a;
        if (obj instanceof C4734) {
            obj = ((C4734) obj).a;
        }
        return pathMatcher.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC9469
    public final /* synthetic */ boolean matches(InterfaceC20758 interfaceC20758) {
        return this.a.matches(C7745.l(interfaceC20758));
    }
}
