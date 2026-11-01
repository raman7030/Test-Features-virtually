package p067l;

import java.nio.file.Path;
import java.nio.file.PathMatcher;

/* JADX INFO: renamed from: l.۬ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C14914 implements PathMatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC11368 f42533a;

    public /* synthetic */ C14914(InterfaceC11368 interfaceC11368) {
        this.f42533a = interfaceC11368;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC11368 interfaceC11368 = this.f42533a;
        if (obj instanceof C14914) {
            obj = ((C14914) obj).f42533a;
        }
        return interfaceC11368.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f42533a.hashCode();
    }

    @Override // java.nio.file.PathMatcher
    public final /* synthetic */ boolean matches(Path path) {
        return this.f42533a.matches(C15764.m35828l(path));
    }
}
