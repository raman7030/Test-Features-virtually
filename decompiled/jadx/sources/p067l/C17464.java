package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܺۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17464 extends AbstractRunnableC16711 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ int f52207;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ int f52208;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C14268 f52209;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C23500 f52210;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17464(C23500 c23500, Object[] objArr, int i, C14268 c14268, int i2, boolean z) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.f52210 = c23500;
        this.f52207 = i;
        this.f52209 = c14268;
        this.f52208 = i2;
    }

    @Override // p067l.AbstractRunnableC16711
    /* JADX INFO: renamed from: ֫ */
    public final void mo5904() {
        try {
            InterfaceC9418 interfaceC9418 = this.f52210.f74882;
            C14268 c14268 = this.f52209;
            int i = this.f52208;
            ((C15452) interfaceC9418).getClass();
            c14268.skip(i);
            this.f52210.f74872.m18742(this.f52207, EnumC15197.CANCEL);
            synchronized (this.f52210) {
                this.f52210.f74867.remove(Integer.valueOf(this.f52207));
            }
        } catch (IOException unused) {
        }
    }
}
