package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۘܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public class C4032 extends AbstractC18587 {
    @Override // l.InterfaceC12050
    public C19555 parsePartialFrom(AbstractC7297 abstractC7297, C17798 c17798) throws C2025 {
        C18849 c18849NewBuilder = C19555.newBuilder();
        try {
            c18849NewBuilder.mergeFrom(abstractC7297, c17798);
            return c18849NewBuilder.buildPartial();
        } catch (C2025 e) {
            e.m6587(c18849NewBuilder.buildPartial());
            throw e;
        } catch (IOException e2) {
            C2025 c2025 = new C2025(e2.getMessage(), e2);
            c2025.m6587(c18849NewBuilder.buildPartial());
            throw c2025;
        } catch (C17715 e3) {
            C2025 c2025M41494 = e3.m41494();
            c2025M41494.m6587(c18849NewBuilder.buildPartial());
            throw c2025M41494;
        }
    }
}
