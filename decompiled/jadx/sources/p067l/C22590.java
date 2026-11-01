package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩸֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7JE */
/* JADX INFO: loaded from: classes5.dex */
public final class C22590 implements InterfaceC15641 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C12588 f71310;

    public C22590(C12588 c12588) {
        this.f71310 = c12588;
    }

    @Override // p067l.InterfaceC15641
    /* JADX INFO: renamed from: ۧ */
    public final void mo3702(String str) throws IOException {
        this.f71310.startTag(null, str);
    }

    @Override // p067l.InterfaceC15641
    /* JADX INFO: renamed from: ֫ */
    public final void mo3698(String str) throws IOException {
        this.f71310.endTag(null, str);
    }

    @Override // p067l.InterfaceC15641
    /* JADX INFO: renamed from: ֫ */
    public final void mo3699(String str, String str2) throws IOException {
        this.f71310.attribute(null, str, str2);
    }

    @Override // p067l.InterfaceC15641
    public final void text(String str) throws IOException {
        this.f71310.text(str);
    }
}
