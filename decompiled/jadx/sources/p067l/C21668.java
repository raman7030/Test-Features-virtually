package p067l;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: O878 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21668 extends AbstractC10288 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC22339 f68246;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC10288 f68247;

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        Collection collection = (Collection) obj;
        if (collection == null) {
            c24726.m54383();
            return;
        }
        c24726.m54374();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f68247.mo5174(c24726, it.next());
        }
        c24726.m54391();
    }

    public C21668(AbstractC10288 abstractC10288, InterfaceC22339 interfaceC22339) {
        this.f68247 = abstractC10288;
        this.f68246 = interfaceC22339;
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        if (c18691.m42643() == EnumC16008.NULL) {
            c18691.m42639();
            return null;
        }
        Collection collection = (Collection) this.f68246.mo14676();
        c18691.m42636();
        while (c18691.m42649()) {
            collection.add(this.f68247.mo5173(c18691));
        }
        c18691.m42645();
        return collection;
    }
}
