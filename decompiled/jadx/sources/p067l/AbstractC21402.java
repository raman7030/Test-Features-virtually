package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7ON */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21402 {

    /* JADX INFO: renamed from: ܽ */
    public static final C15444 f67491 = C15444.m35182((Integer) (-1), (Integer) (-1));

    /* JADX INFO: renamed from: ᩳ */
    public static final AbstractC20614 f67492 = AbstractC20614.m46566();

    /* JADX INFO: renamed from: ֫ */
    public AbstractC16192 f67493 = AbstractC16192.m36872of();

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f67494 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final void m48476(AbstractC16192 abstractC16192) {
        this.f67493 = abstractC16192;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m48472() {
        return this.f67493.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m48473(int i) {
        return (String) this.f67493.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48474(AbstractC16192 abstractC16192) {
        ArrayList arrayList;
        Iterator it = abstractC16192.iterator();
        int i = 0;
        while (it.hasNext()) {
            InterfaceC16706 interfaceC16706 = (InterfaceC16706) it.next();
            String strMo37859 = interfaceC16706.mo37859();
            int i2 = C14695.f41914;
            int iM15491 = (C6786.m15491(new C5308(strMo37859)) - 1) + i;
            int index = interfaceC16706.getIndex();
            if (index >= 0) {
                while (i <= iM15491) {
                    while (true) {
                        arrayList = this.f67494;
                        if (arrayList.size() > i) {
                            break;
                        } else {
                            arrayList.add(f67491);
                        }
                    }
                    C15444 c15444 = (C15444) arrayList.get(i);
                    arrayList.set(i, C15444.m35182(Integer.valueOf(c15444.m35187() ? index : ((Integer) c15444.m35190()).intValue()), Integer.valueOf(index + 1)));
                    i++;
                }
            }
            i = iM15491;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static HashMap m48471(C20151 c20151) {
        HashMap map = new HashMap();
        int size = c20151.f67493.size();
        for (int i = 0; i <= size; i++) {
            C15444 c15444M35186 = c20151.m48475(i).m35186(f67492);
            for (int iIntValue = ((Integer) c15444M35186.m35190()).intValue(); iIntValue < ((Integer) c15444M35186.m35192()).intValue(); iIntValue++) {
                if (map.containsKey(Integer.valueOf(iIntValue))) {
                    map.put(Integer.valueOf(iIntValue), C15444.m35182((Integer) ((C15444) map.get(Integer.valueOf(iIntValue))).m35190(), Integer.valueOf(i + 1)));
                } else {
                    map.put(Integer.valueOf(iIntValue), C15444.m35182(Integer.valueOf(i), Integer.valueOf(i + 1)));
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C15444 m48475(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.f67494;
            if (i < arrayList.size()) {
                return (C15444) arrayList.get(i);
            }
        }
        return f67491;
    }

    public String toString() {
        return "InputOutput{lines=" + this.f67493 + ", ranges=" + this.f67494 + '}';
    }
}
