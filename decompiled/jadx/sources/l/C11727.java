package l;

import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۨ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QB */
/* JADX INFO: loaded from: classes4.dex */
public final class C11727 implements InterfaceC23015 {
    @Override // l.InterfaceC23015
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo28630(InterfaceC20758 interfaceC20758) throws Throwable {
        C6082.m16997(interfaceC20758);
    }

    @Override // l.InterfaceC23015
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo28632(InterfaceC20758 interfaceC20758, byte[] bArr) throws IOException {
        C6082.m16998(interfaceC20758, bArr);
    }

    @Override // l.InterfaceC23015
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13137 mo28628(InterfaceC20758 interfaceC20758, boolean z) {
        return new C13137(interfaceC20758, z);
    }

    @Override // l.InterfaceC23015
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28631(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759) throws IOException {
        C17229.move(interfaceC20758, interfaceC20759, EnumC2413.ATOMIC_MOVE, EnumC2413.REPLACE_EXISTING);
    }

    @Override // l.InterfaceC23015
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28629(FileChannel fileChannel) throws IOException {
        fileChannel.force(true);
    }

    @Override // l.InterfaceC23015
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo28633(InterfaceC20758 interfaceC20758) {
        C17229.delete(interfaceC20758);
    }
}
