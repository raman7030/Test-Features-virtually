package l;

import java.io.File;
import java.net.URI;

/* JADX INFO: renamed from: l.۠᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C7KL */
/* JADX INFO: loaded from: classes4.dex */
public final class C8400 extends AbstractC16160 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C5578 f25751;

    @Override // l.InterfaceC20758
    public final InterfaceC20758 toRealPath(EnumC14406[] enumC14406Arr) {
        return super.toAbsolutePath();
    }

    public C8400(C5578 c5578, String str) {
        super(str);
        C11003.requireNonNull(c5578);
        this.f25751 = c5578;
    }

    @Override // l.InterfaceC20758
    public final C5578 getFileSystem() {
        return this.f25751;
    }

    @Override // l.InterfaceC20758
    public final AbstractC7145 getFileSystem() {
        return this.f25751;
    }

    @Override // l.AbstractC16160
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8400 mo22009(String str) {
        return new C8400(this.f25751, str);
    }

    @Override // l.InterfaceC20758
    public final URI toUri() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC20758
    public final File toFile() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC20758, l.InterfaceC4923
    public final InterfaceC0295 register(InterfaceC5235 interfaceC5235, InterfaceC18641[] interfaceC18641Arr, InterfaceC19347[] interfaceC19347Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC20758, l.InterfaceC4923
    public final InterfaceC0295 register(InterfaceC5235 interfaceC5235, InterfaceC18641[] interfaceC18641Arr) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC20758
    public final String toString() {
        return this.f49781;
    }
}
