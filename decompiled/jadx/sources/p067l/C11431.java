package p067l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11431 extends AbstractRunnableC16711 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f31882;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C23500 f31883;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11431(C23500 c23500, Object[] objArr, int i, ArrayList arrayList) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.f31883 = c23500;
        this.f31882 = i;
    }

    @Override // p067l.AbstractRunnableC16711
    /* JADX INFO: renamed from: ֫ */
    public final void mo5904() {
        this.f31883.f74882.getClass();
        try {
            this.f31883.f74872.m18742(this.f31882, EnumC15197.CANCEL);
            synchronized (this.f31883) {
                this.f31883.f74867.remove(Integer.valueOf(this.f31882));
            }
        } catch (IOException unused) {
        }
    }
}
