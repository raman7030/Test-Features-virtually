package l;

import java.nio.file.Path;
import java.nio.file.PathMatcher;

/* JADX INFO: renamed from: l.۬ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13200 implements PathMatcher {
    public final /* synthetic */ InterfaceC9469 a;

    public /* synthetic */ C13200(InterfaceC9469 interfaceC9469) {
        this.a = interfaceC9469;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC9469 interfaceC9469 = this.a;
        if (obj instanceof C13200) {
            obj = ((C13200) obj).a;
        }
        return interfaceC9469.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.PathMatcher
    public final /* synthetic */ boolean matches(Path path) {
        return this.a.matches(C14094.l(path));
    }
}
