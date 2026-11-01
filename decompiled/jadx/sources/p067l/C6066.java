package p067l;

import java.net.Socket;

/* JADX INFO: renamed from: l.ۘۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6066 {

    /* JADX INFO: renamed from: ֫ */
    public String f15254;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC2712 f15255 = AbstractC2712.f4553;

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC8233 f15256;

    /* JADX INFO: renamed from: ܽ */
    public int f15257;

    /* JADX INFO: renamed from: ܿ */
    public Socket f15258;

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC12257 f15259;

    /* JADX INFO: renamed from: ֫ */
    public final void m13690(Socket socket, String str, InterfaceC8233 interfaceC8233, InterfaceC12257 interfaceC12257) {
        this.f15258 = socket;
        this.f15254 = str;
        this.f15256 = interfaceC8233;
        this.f15259 = interfaceC12257;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13691(C24585 c24585) {
        this.f15255 = c24585;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13689(int i) {
        this.f15257 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23500 m13688() {
        return new C23500(this);
    }
}
