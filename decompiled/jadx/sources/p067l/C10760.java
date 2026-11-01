package p067l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10760 extends AbstractRunnableC16711 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f29825;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C23500 f29826;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10760(C23500 c23500, Object[] objArr, int i, ArrayList arrayList, boolean z) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.f29826 = c23500;
        this.f29825 = i;
    }

    @Override // p067l.AbstractRunnableC16711
    /* JADX INFO: renamed from: ֫ */
    public final void mo5904() {
        this.f29826.f74882.getClass();
        try {
            this.f29826.f74872.m18742(this.f29825, EnumC15197.CANCEL);
            synchronized (this.f29826) {
                this.f29826.f74867.remove(Integer.valueOf(this.f29825));
            }
        } catch (IOException unused) {
        }
    }
}
