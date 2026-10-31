package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܺۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15884 extends AbstractRunnableC15091 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49067;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49068;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12521 f49069;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22235 f49070;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15884(C22235 c22235, Object[] objArr, int i, C12521 c12521, int i2, boolean z) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.f49070 = c22235;
        this.f49067 = i;
        this.f49069 = c12521;
        this.f49068 = i2;
    }

    @Override // l.AbstractRunnableC15091
    /* JADX INFO: renamed from: ֫ */
    public final void mo3633() {
        try {
            InterfaceC7418 interfaceC7418 = this.f49070.f72157;
            C12521 c12521 = this.f49069;
            int i = this.f49068;
            ((C13767) interfaceC7418).getClass();
            c12521.skip(i);
            this.f49070.f72147.m16815(this.f49067, EnumC13499.CANCEL);
            synchronized (this.f49070) {
                this.f49070.f72142.remove(Integer.valueOf(this.f49067));
            }
        } catch (IOException unused) {
        }
    }
}
