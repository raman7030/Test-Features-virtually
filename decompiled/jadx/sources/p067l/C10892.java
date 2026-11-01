package p067l;

import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: l.ۡܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10892 implements FileAttribute {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC23437 f30178a;

    @Override // java.nio.file.attribute.FileAttribute
    public final String name() {
        return "posix:permissions";
    }

    public C10892(InterfaceC23437 interfaceC23437) {
        this.f30178a = interfaceC23437;
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final Object value() {
        return Collections.unmodifiableSet(AbstractC24029.m53253v((Set) this.f30178a.value()));
    }
}
