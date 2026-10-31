package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public class C18143 extends AbstractC18587 {
    @Override // l.InterfaceC12050
    public C14614 parsePartialFrom(AbstractC7297 abstractC7297, C17798 c17798) throws C2025 {
        C17437 c17437NewBuilder = C14614.newBuilder();
        try {
            c17437NewBuilder.mergeFrom(abstractC7297, c17798);
            return c17437NewBuilder.buildPartial();
        } catch (C2025 e) {
            e.m6587(c17437NewBuilder.buildPartial());
            throw e;
        } catch (IOException e2) {
            C2025 c2025 = new C2025(e2.getMessage(), e2);
            c2025.m6587(c17437NewBuilder.buildPartial());
            throw c2025;
        } catch (C17715 e3) {
            C2025 c2025M41494 = e3.m41494();
            c2025M41494.m6587(c17437NewBuilder.buildPartial());
            throw c2025M41494;
        }
    }
}
