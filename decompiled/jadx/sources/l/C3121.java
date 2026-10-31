package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۗ۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public class C3121 extends AbstractC18587 {
    @Override // l.InterfaceC12050
    public C12293 parsePartialFrom(AbstractC7297 abstractC7297, C17798 c17798) throws C2025 {
        C12998 c12998NewBuilder = C12293.newBuilder();
        try {
            c12998NewBuilder.mergeFrom(abstractC7297, c17798);
            return c12998NewBuilder.buildPartial();
        } catch (C2025 e) {
            e.m6587(c12998NewBuilder.buildPartial());
            throw e;
        } catch (IOException e2) {
            C2025 c2025 = new C2025(e2.getMessage(), e2);
            c2025.m6587(c12998NewBuilder.buildPartial());
            throw c2025;
        } catch (C17715 e3) {
            C2025 c2025M41494 = e3.m41494();
            c2025M41494.m6587(c12998NewBuilder.buildPartial());
            throw c2025M41494;
        }
    }
}
