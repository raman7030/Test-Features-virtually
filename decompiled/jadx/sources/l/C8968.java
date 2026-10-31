package l;

import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: l.ۡܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8968 implements FileAttribute {
    public final /* synthetic */ InterfaceC22168 a;

    @Override // java.nio.file.attribute.FileAttribute
    public final String name() {
        return "posix:permissions";
    }

    public C8968(InterfaceC22168 interfaceC22168) {
        this.a = interfaceC22168;
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final Object value() {
        return Collections.unmodifiableSet(AbstractC22791.v((Set) this.a.value()));
    }
}
