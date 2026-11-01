package p067l;

import java.nio.file.PathMatcher;

/* JADX INFO: renamed from: l.ۙܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6868 implements InterfaceC11368 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PathMatcher f17851a;

    public /* synthetic */ C6868(PathMatcher pathMatcher) {
        this.f17851a = pathMatcher;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PathMatcher pathMatcher = this.f17851a;
        if (obj instanceof C6868) {
            obj = ((C6868) obj).f17851a;
        }
        return pathMatcher.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f17851a.hashCode();
    }

    @Override // p067l.InterfaceC11368
    public final /* synthetic */ boolean matches(InterfaceC22097 interfaceC22097) {
        return this.f17851a.matches(C9730.m22751l(interfaceC22097));
    }
}
