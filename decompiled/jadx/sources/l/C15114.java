package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܶ۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public class C15114 extends AbstractC18587 {
    @Override // l.InterfaceC12050
    public C22171 parsePartialFrom(AbstractC7297 abstractC7297, C17798 c17798) throws C2025 {
        C21466 c21466NewBuilder = C22171.newBuilder();
        try {
            c21466NewBuilder.mergeFrom(abstractC7297, c17798);
            return c21466NewBuilder.buildPartial();
        } catch (C2025 e) {
            e.m6587(c21466NewBuilder.buildPartial());
            throw e;
        } catch (IOException e2) {
            C2025 c2025 = new C2025(e2.getMessage(), e2);
            c2025.m6587(c21466NewBuilder.buildPartial());
            throw c2025;
        } catch (C17715 e3) {
            C2025 c2025M41494 = e3.m41494();
            c2025M41494.m6587(c21466NewBuilder.buildPartial());
            throw c2025M41494;
        }
    }
}
