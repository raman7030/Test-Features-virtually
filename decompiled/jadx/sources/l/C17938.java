package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳ۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public class C17938 extends AbstractC18587 {
    @Override // l.InterfaceC12050
    public C6649 parsePartialFrom(AbstractC7297 abstractC7297, C17798 c17798) throws C2025 {
        C17232 c17232NewBuilder = C6649.newBuilder();
        try {
            c17232NewBuilder.mergeFrom(abstractC7297, c17798);
            return c17232NewBuilder.buildPartial();
        } catch (C2025 e) {
            e.m6587(c17232NewBuilder.buildPartial());
            throw e;
        } catch (IOException e2) {
            C2025 c2025 = new C2025(e2.getMessage(), e2);
            c2025.m6587(c17232NewBuilder.buildPartial());
            throw c2025;
        } catch (C17715 e3) {
            C2025 c2025M41494 = e3.m41494();
            c2025M41494.m6587(c17232NewBuilder.buildPartial());
            throw c2025M41494;
        }
    }
}
