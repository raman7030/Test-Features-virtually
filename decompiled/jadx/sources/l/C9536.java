package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9536 extends AbstractRunnableC15091 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f28936;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22235 f28937;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9536(C22235 c22235, Object[] objArr, int i, ArrayList arrayList) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.f28937 = c22235;
        this.f28936 = i;
    }

    @Override // l.AbstractRunnableC15091
    /* JADX INFO: renamed from: ֫ */
    public final void mo3633() {
        this.f28937.f72157.getClass();
        try {
            this.f28937.f72147.m16815(this.f28936, EnumC13499.CANCEL);
            synchronized (this.f28937) {
                this.f28937.f72142.remove(Integer.valueOf(this.f28936));
            }
        } catch (IOException unused) {
        }
    }
}
