package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܰ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public class C13497 extends AbstractC18587 {
    @Override // l.InterfaceC12050
    public C1710 parsePartialFrom(AbstractC7297 abstractC7297, C17798 c17798) throws C2025 {
        C7148 c7148NewBuilder = C1710.newBuilder();
        try {
            c7148NewBuilder.mergeFrom(abstractC7297, c17798);
            return c7148NewBuilder.buildPartial();
        } catch (C2025 e) {
            e.m6587(c7148NewBuilder.buildPartial());
            throw e;
        } catch (IOException e2) {
            C2025 c2025 = new C2025(e2.getMessage(), e2);
            c2025.m6587(c7148NewBuilder.buildPartial());
            throw c2025;
        } catch (C17715 e3) {
            C2025 c2025M41494 = e3.m41494();
            c2025M41494.m6587(c7148NewBuilder.buildPartial());
            throw c2025M41494;
        }
    }
}
