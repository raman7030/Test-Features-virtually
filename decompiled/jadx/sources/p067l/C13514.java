package p067l;

import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۨ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QB */
/* JADX INFO: loaded from: classes4.dex */
public final class C13514 implements InterfaceC24242 {
    @Override // p067l.InterfaceC24242
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo30678(InterfaceC22097 interfaceC22097) throws Throwable {
        C8149.m18928(interfaceC22097);
    }

    @Override // p067l.InterfaceC24242
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo30680(InterfaceC22097 interfaceC22097, byte[] bArr) throws IOException {
        C8149.m18929(interfaceC22097, bArr);
    }

    @Override // p067l.InterfaceC24242
    /* JADX INFO: renamed from: ֫ */
    public final C14854 mo30676(InterfaceC22097 interfaceC22097, boolean z) {
        return new C14854(interfaceC22097, z);
    }

    @Override // p067l.InterfaceC24242
    /* JADX INFO: renamed from: ֫ */
    public final void mo30679(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098) throws IOException {
        C18743.move(interfaceC22097, interfaceC22098, EnumC4662.ATOMIC_MOVE, EnumC4662.REPLACE_EXISTING);
    }

    @Override // p067l.InterfaceC24242
    /* JADX INFO: renamed from: ֫ */
    public final void mo30677(FileChannel fileChannel) throws IOException {
        fileChannel.force(true);
    }

    @Override // p067l.InterfaceC24242
    /* JADX INFO: renamed from: ۧ */
    public final void mo30681(InterfaceC22097 interfaceC22097) {
        C18743.delete(interfaceC22097);
    }
}
