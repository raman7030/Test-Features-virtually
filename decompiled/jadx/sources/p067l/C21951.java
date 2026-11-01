package p067l;

import com.alipay.sdk.p010m.p052u0.C0226b;
import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩷ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21951 extends C13234 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C11222 f68997;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21951(C11222 c11222, C18236 c18236, InterfaceC21909 interfaceC21909) {
        super(c18236, interfaceC21909);
        this.f68997 = c11222;
    }

    @Override // p067l.C13234, p067l.InterfaceC21909
    public final Set getElements() {
        ArrayList arrayList = new ArrayList(super.getElements());
        for (int i = 0; i < arrayList.size(); i++) {
            InterfaceC11180 interfaceC11180 = (InterfaceC11180) arrayList.get(i);
            if (interfaceC11180.getName().equals(C0226b.f1011d) && interfaceC11180.getValue().mo4670() == 28) {
                List value = ((InterfaceC21650) interfaceC11180.getValue()).getValue();
                ArrayList arrayList2 = new ArrayList(value.size());
                for (int i2 = 0; i2 < value.size(); i2++) {
                    String value2 = ((InterfaceC19007) ((InterfaceC12262) value.get(i2))).getValue();
                    if (value2.startsWith("L")) {
                        boolean zEndsWith = value2.endsWith(C0249l.f1196b);
                        C11222 c11222 = this.f68997;
                        if (zEndsWith) {
                            value2 = C11222.m25997(c11222, value2);
                        } else if (value2.endsWith("<")) {
                            String strM25997 = C11222.m25997(c11222, value2.substring(0, value2.length() - 1) + C0249l.f1196b);
                            value2 = strM25997.substring(0, strM25997.length() - 1) + "<";
                        } else if (i2 < value.size() - 1 && ((InterfaceC19007) value.get(i2 + 1)).getValue().startsWith("<")) {
                            value2 = C17073.m38720(1, 0, C11222.m25997(c11222, value2.concat(C0249l.f1196b)));
                        }
                    }
                    arrayList2.add(new C12563(value2));
                }
                arrayList.set(i, new C8539(interfaceC11180.getName(), new C24632(arrayList2)));
            }
        }
        return C11222.m25981(arrayList);
    }
}
