package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨ۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1068 extends AbstractRunnableC15091 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10241 f3916;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21530 f3917;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1068(C21530 c21530, Object[] objArr, C10241 c10241) {
        super("OkHttp %s stream %d", objArr);
        this.f3917 = c21530;
        this.f3916 = c10241;
    }

    @Override // l.AbstractRunnableC15091
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3633() {
        C10241 c10241 = this.f3916;
        C22235 c22235 = this.f3917.f69210;
        try {
            c22235.f72153.mo1801(c10241);
        } catch (IOException e) {
            C18872.m43580().mo43582(4, "Http2Connection.Listener failure for " + c22235.f72148, e);
            try {
                c10241.m25937(EnumC13499.PROTOCOL_ERROR);
            } catch (IOException unused) {
            }
        }
    }
}
