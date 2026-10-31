package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۠ۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8124 extends AbstractRunnableC15091 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1938 f25092;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21530 f25093;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8124(C21530 c21530, Object[] objArr, C1938 c1938) {
        super("OkHttp %s ACK Settings", objArr);
        this.f25093 = c21530;
        this.f25092 = c1938;
    }

    @Override // l.AbstractRunnableC15091
    /* JADX INFO: renamed from: ֫ */
    public final void mo3633() {
        C10241[] c10241Arr;
        long j;
        C21530 c21530 = this.f25093;
        C1938 c1938 = this.f25092;
        synchronized (c21530.f69210.f72147) {
            synchronized (c21530.f69210) {
                int iM6393 = c21530.f69210.f72149.m6393();
                c21530.f69210.f72149.m6392(c1938);
                int iM6394 = c21530.f69210.f72149.m6393();
                c10241Arr = null;
                if (iM6394 == -1 || iM6394 == iM6393) {
                    j = 0;
                } else {
                    j = iM6394 - iM6393;
                    if (!c21530.f69210.f72144.isEmpty()) {
                        c10241Arr = (C10241[]) c21530.f69210.f72144.values().toArray(new C10241[c21530.f69210.f72144.size()]);
                    }
                }
            }
            try {
                C22235 c22235 = c21530.f69210;
                c22235.f72147.m16818(c22235.f72149);
            } catch (IOException unused) {
                C22235 c22236 = c21530.f69210;
                try {
                    EnumC13499 enumC13499 = EnumC13499.PROTOCOL_ERROR;
                    c22236.m49933(enumC13499, enumC13499);
                } catch (IOException unused2) {
                }
            }
        }
        if (c10241Arr != null) {
            for (C10241 c10241 : c10241Arr) {
                synchronized (c10241) {
                    c10241.f30866 += j;
                    if (j > 0) {
                        c10241.notifyAll();
                    }
                }
            }
        }
        C22235.f72139.execute(new C15178(c21530, c21530.f69210.f72148));
    }
}
