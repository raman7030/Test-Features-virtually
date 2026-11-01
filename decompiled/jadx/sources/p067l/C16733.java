package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܶ۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public class C16733 extends AbstractC20033 {
    @Override // p067l.InterfaceC13820
    public C23440 parsePartialFrom(AbstractC9303 abstractC9303, C19283 c19283) throws C4293 {
        C22770 c22770NewBuilder = C23440.newBuilder();
        try {
            c22770NewBuilder.mergeFrom(abstractC9303, c19283);
            return c22770NewBuilder.buildPartial();
        } catch (C4293 e) {
            e.m8713(c22770NewBuilder.buildPartial());
            throw e;
        } catch (IOException e2) {
            C4293 c4293 = new C4293(e2.getMessage(), e2);
            c4293.m8713(c22770NewBuilder.buildPartial());
            throw c4293;
        } catch (C19204 e3) {
            C4293 c4293M43740 = e3.m43740();
            c4293M43740.m8713(c22770NewBuilder.buildPartial());
            throw c4293M43740;
        }
    }
}
