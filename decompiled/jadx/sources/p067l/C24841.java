package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes.dex */
public final class C24841 extends AbstractRunnableC16711 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ int f79341;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ EnumC15197 f79342;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C23500 f79343;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24841(C23500 c23500, Object[] objArr, int i, EnumC15197 enumC15197) {
        super("OkHttp %s stream %d", objArr);
        this.f79343 = c23500;
        this.f79341 = i;
        this.f79342 = enumC15197;
    }

    @Override // p067l.AbstractRunnableC16711
    /* JADX INFO: renamed from: ֫ */
    public final void mo5904() {
        C23500 c23500 = this.f79343;
        try {
            try {
                c23500.f74872.m18742(this.f79341, this.f79342);
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            EnumC15197 enumC15197 = EnumC15197.PROTOCOL_ERROR;
            c23500.m52261(enumC15197, enumC15197);
        }
    }
}
