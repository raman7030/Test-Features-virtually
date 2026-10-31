package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨ܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public class C1209 extends AbstractC18587 {
    @Override // l.InterfaceC12050
    public C15319 parsePartialFrom(AbstractC7297 abstractC7297, C17798 c17798) throws C2025 {
        C8265 c8265NewBuilder = C15319.newBuilder();
        try {
            c8265NewBuilder.mergeFrom(abstractC7297, c17798);
            return c8265NewBuilder.buildPartial();
        } catch (C2025 e) {
            e.m6587(c8265NewBuilder.buildPartial());
            throw e;
        } catch (IOException e2) {
            C2025 c2025 = new C2025(e2.getMessage(), e2);
            c2025.m6587(c8265NewBuilder.buildPartial());
            throw c2025;
        } catch (C17715 e3) {
            C2025 c2025M41494 = e3.m41494();
            c2025M41494.m6587(c8265NewBuilder.buildPartial());
            throw c2025M41494;
        }
    }
}
