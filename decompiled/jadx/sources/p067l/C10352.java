package p067l;

import java.io.File;
import java.net.URI;

/* JADX INFO: renamed from: l.۠᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C7KL */
/* JADX INFO: loaded from: classes4.dex */
public final class C10352 extends AbstractC17727 {

    /* JADX INFO: renamed from: ᩹ */
    public final C7670 f28664;

    @Override // p067l.InterfaceC22097
    public final InterfaceC22097 toRealPath(EnumC16060[] enumC16060Arr) {
        return super.toAbsolutePath();
    }

    public C10352(C7670 c7670, String str) {
        super(str);
        C12826.requireNonNull(c7670);
        this.f28664 = c7670;
    }

    @Override // p067l.InterfaceC22097
    public final C7670 getFileSystem() {
        return this.f28664;
    }

    @Override // p067l.InterfaceC22097
    public final AbstractC9159 getFileSystem() {
        return this.f28664;
    }

    @Override // p067l.AbstractC17727
    /* JADX INFO: renamed from: ֫ */
    public final C10352 mo23979(String str) {
        return new C10352(this.f28664, str);
    }

    @Override // p067l.InterfaceC22097
    public final URI toUri() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC22097
    public final File toFile() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC22097, p067l.InterfaceC7048
    public final InterfaceC2649 register(InterfaceC7344 interfaceC7344, InterfaceC20085[] interfaceC20085Arr, InterfaceC20756[] interfaceC20756Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC22097, p067l.InterfaceC7048
    public final InterfaceC2649 register(InterfaceC7344 interfaceC7344, InterfaceC20085[] interfaceC20085Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC22097
    public final String toString() {
        return this.f52947;
    }
}
