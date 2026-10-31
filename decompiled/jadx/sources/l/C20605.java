package l;

import com.alipay.sdk.m.u0.b;
import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩷ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20605 extends C11433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9316 f66317;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20605(C9316 c9316, C16696 c16696, InterfaceC20561 interfaceC20561) {
        super(c16696, interfaceC20561);
        this.f66317 = c9316;
    }

    @Override // l.C11433, l.InterfaceC20561
    public final Set getElements() {
        ArrayList arrayList = new ArrayList(super.getElements());
        for (int i = 0; i < arrayList.size(); i++) {
            InterfaceC9272 interfaceC9272 = (InterfaceC9272) arrayList.get(i);
            if (interfaceC9272.getName().equals(b.d) && interfaceC9272.getValue().mo2302() == 28) {
                List value = ((InterfaceC20288) interfaceC9272.getValue()).getValue();
                ArrayList arrayList2 = new ArrayList(value.size());
                for (int i2 = 0; i2 < value.size(); i2++) {
                    String value2 = ((InterfaceC17507) ((InterfaceC10410) value.get(i2))).getValue();
                    if (value2.startsWith("L")) {
                        boolean zEndsWith = value2.endsWith(l.b);
                        C9316 c9316 = this.f66317;
                        if (zEndsWith) {
                            value2 = C9316.m23988(c9316, value2);
                        } else if (value2.endsWith("<")) {
                            String strM23988 = C9316.m23988(c9316, value2.substring(0, value2.length() - 1) + l.b);
                            value2 = strM23988.substring(0, strM23988.length() - 1) + "<";
                        } else if (i2 < value.size() - 1 && ((InterfaceC17507) value.get(i2 + 1)).getValue().startsWith("<")) {
                            value2 = C15472.m36561(1, 0, C9316.m23988(c9316, value2.concat(l.b)));
                        }
                    }
                    arrayList2.add(new C10727(value2));
                }
                arrayList.set(i, new C6493(interfaceC9272.getName(), new C23426(arrayList2)));
            }
        }
        return C9316.m23972(arrayList);
    }
}
