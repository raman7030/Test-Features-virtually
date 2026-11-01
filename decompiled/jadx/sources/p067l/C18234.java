package p067l;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q886 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18234 extends AbstractC10288 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC22339 f54417;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC10288 f54418;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC10288 f54419;

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            c24726.m54383();
            return;
        }
        c24726.m54389();
        for (Map.Entry entry : map.entrySet()) {
            c24726.m54378(String.valueOf(entry.getKey()));
            this.f54419.mo5174(c24726, entry.getValue());
        }
        c24726.m54388();
    }

    public C18234(C19576 c19576, AbstractC10288 abstractC10288, AbstractC10288 abstractC10289, InterfaceC22339 interfaceC22339) {
        this.f54418 = abstractC10288;
        this.f54419 = abstractC10289;
        this.f54417 = interfaceC22339;
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        EnumC16008 enumC16008M42643 = c18691.m42643();
        if (enumC16008M42643 == EnumC16008.NULL) {
            c18691.m42639();
            return null;
        }
        Map map = (Map) this.f54417.mo14676();
        if (enumC16008M42643 != EnumC16008.BEGIN_ARRAY) {
            c18691.m42647();
            while (c18691.m42649()) {
                AbstractC24369.f77157.mo44096(c18691);
                Object objMo5173 = this.f54418.mo5173(c18691);
                if (map.put(objMo5173, this.f54419.mo5173(c18691)) != null) {
                    throw new C16322(C7470.m17246(objMo5173, "duplicate key: "));
                }
            }
            c18691.m42655();
            return map;
        }
        c18691.m42636();
        while (c18691.m42649()) {
            c18691.m42636();
            Object objMo5174 = this.f54418.mo5173(c18691);
            if (map.put(objMo5174, this.f54419.mo5173(c18691)) != null) {
                throw new C16322(C7470.m17246(objMo5174, "duplicate key: "));
            }
            c18691.m42645();
        }
        c18691.m42645();
        return map;
    }
}
