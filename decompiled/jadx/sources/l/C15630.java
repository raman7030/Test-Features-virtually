package l;

import android.widget.ListAdapter;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺ֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9R5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15630 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0814 f48122;

    public C15630(ActivityC0814 activityC0814) {
        this.f48122 = activityC0814;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f48122, R.string.MT_Protector);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x0211  */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        C17748 c17748;
        Iterator it;
        Iterator it2;
        Map map;
        InterfaceC3571 interfaceC3571;
        C16336 c16336;
        ActivityC0814.f2970.mo23552();
        ActivityC0814.f2970.m36508();
        ActivityC0814 activityC0814 = this.f48122;
        byte[] bArrM1795 = C0349.m1795(activityC0814.f2972.mo27926(), 0);
        C23326 c23326 = new C23326(bArrM1795);
        c23326.m51732();
        ActivityC0814.f2970.m36526("arsc").m36502(bArrM1795);
        C17748 c17749 = new C17748(c23326);
        Iterator it3 = c23326.mo21936().iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((InterfaceC4277) it3.next()).mo12850().iterator();
            while (it4.hasNext()) {
                InterfaceC0748 interfaceC0748 = (InterfaceC0748) it4.next();
                String typeName = interfaceC0748.getTypeName();
                if (typeName.equals("string") || typeName.equals("array") || typeName.equals("plurals")) {
                    Iterator it5 = interfaceC0748.mo2872().iterator();
                    while (it5.hasNext()) {
                        InterfaceC7099 interfaceC7099 = (InterfaceC7099) it5.next();
                        String string = interfaceC7099.mo18743().toString();
                        C1520 c1520M41563 = c17749.m41563(string);
                        C7870 c7870 = (C7870) activityC0814.f2973.get(string);
                        String typeName2 = interfaceC7099.getType().getTypeName();
                        Iterator it6 = interfaceC7099.mo18746().iterator();
                        while (it6.hasNext()) {
                            InterfaceC21211 interfaceC21211 = (InterfaceC21211) it6.next();
                            int i = -1;
                            for (InterfaceC1454 interfaceC1454 : interfaceC21211.values()) {
                                int i2 = i + 1;
                                if (interfaceC1454.mo5009()) {
                                    c17748 = c17749;
                                    if (typeName2.equals("plurals")) {
                                        it = it3;
                                        int iMo5006 = interfaceC1454.mo5006();
                                        if (iMo5006 < 16777220 || iMo5006 > 16777225) {
                                        }
                                        string = string;
                                        it3 = it;
                                        string = string;
                                        c17749 = c17748;
                                        it4 = it2;
                                        it5 = it5;
                                        it6 = it6;
                                        interfaceC7099 = interfaceC7099;
                                        i = i2;
                                    } else {
                                        it = it3;
                                    }
                                    InterfaceC3571 interfaceC3571Mo5008 = interfaceC1454.mo5008();
                                    if (interfaceC3571Mo5008.mo10323() || C9445.m24273(interfaceC3571Mo5008.getValue())) {
                                        it2 = it4;
                                        it5 = it5;
                                        it6 = it6;
                                    } else {
                                        it2 = it4;
                                        Map map2 = c1520M41563.f5388;
                                        if (!(map2 == null ? false : map2.containsKey(new C10693(interfaceC21211.mo47884(), i2)))) {
                                            string = string;
                                        }
                                        it3 = it;
                                        string = string;
                                        c17749 = c17748;
                                        it4 = it2;
                                        it5 = it5;
                                        it6 = it6;
                                        interfaceC7099 = interfaceC7099;
                                        i = i2;
                                    }
                                    if (c7870 == null) {
                                        activityC0814.f2975.add(string);
                                        c7870 = new C7870(interfaceC7099.mo18743().m49025());
                                        activityC0814.f2973.put(string, c7870);
                                    }
                                    C14925 c14925 = new C14925();
                                    c14925.f45501 = interfaceC21211.mo47884();
                                    c14925.f45504 = i2;
                                    c14925.f45503 = interfaceC21211.mo29406();
                                    if (typeName2.equals("array")) {
                                        c14925.f45503 = "array:" + c14925.f45503 + "[" + i2 + "]";
                                    } else {
                                        if (typeName2.equals("plurals")) {
                                            int iMo5007 = interfaceC1454.mo5006() - 16777220;
                                            StringBuilder sb = new StringBuilder("plurals:");
                                            sb.append(c14925.f45503);
                                            sb.append("[");
                                            c14925.f45503 = C9045.m23341(sb, InterfaceC1454.f5200[iMo5007], "]");
                                        }
                                        if (c1520M41563.f5388 != null) {
                                            c16336 = (C16336) c1520M41563.f5388.get(new C10693(interfaceC21211.mo47884(), i2));
                                            if (c16336 == null && interfaceC3571Mo5008.equals(c16336.f50296)) {
                                                interfaceC3571 = c16336.f50295;
                                            } else {
                                                interfaceC3571 = null;
                                            }
                                        } else {
                                            map = c1520M41563.f5389;
                                            if (map != null) {
                                                interfaceC3571 = (InterfaceC3571) map.get(interfaceC3571Mo5008);
                                            } else {
                                                interfaceC3571 = null;
                                            }
                                        }
                                        if (interfaceC3571 != null) {
                                            c14925.f45502 = new C21982(interfaceC3571).m49465();
                                            c14925.f45505 = new C21982(interfaceC3571Mo5008).m49465();
                                        } else {
                                            c14925.f45502 = new C21982(interfaceC3571Mo5008).m49465();
                                        }
                                        c7870.add(c14925);
                                        it3 = it;
                                        string = string;
                                        c17749 = c17748;
                                        it4 = it2;
                                        it5 = it5;
                                        it6 = it6;
                                        interfaceC7099 = interfaceC7099;
                                        i = i2;
                                    }
                                    if (c1520M41563.f5388 != null) {
                                        c16336 = (C16336) c1520M41563.f5388.get(new C10693(interfaceC21211.mo47884(), i2));
                                        if (c16336 == null) {
                                            interfaceC3571 = null;
                                        } else {
                                            interfaceC3571 = null;
                                        }
                                    } else {
                                        map = c1520M41563.f5389;
                                        if (map != null) {
                                            interfaceC3571 = (InterfaceC3571) map.get(interfaceC3571Mo5008);
                                        } else {
                                            interfaceC3571 = null;
                                        }
                                    }
                                    if (interfaceC3571 != null) {
                                        c14925.f45502 = new C21982(interfaceC3571).m49465();
                                        c14925.f45505 = new C21982(interfaceC3571Mo5008).m49465();
                                    } else {
                                        c14925.f45502 = new C21982(interfaceC3571Mo5008).m49465();
                                    }
                                    c7870.add(c14925);
                                    it3 = it;
                                    string = string;
                                    c17749 = c17748;
                                    it4 = it2;
                                    it5 = it5;
                                    it6 = it6;
                                    interfaceC7099 = interfaceC7099;
                                    i = i2;
                                } else {
                                    c17748 = c17749;
                                    it = it3;
                                }
                                it2 = it4;
                                it5 = it5;
                                it6 = it6;
                                string = string;
                                it3 = it;
                                string = string;
                                c17749 = c17748;
                                it4 = it2;
                                it5 = it5;
                                it6 = it6;
                                interfaceC7099 = interfaceC7099;
                                i = i2;
                            }
                        }
                    }
                }
                it3 = it3;
                c17749 = c17749;
                it4 = it4;
            }
        }
        Collections.sort(activityC0814.f2975);
        Iterator it7 = activityC0814.f2973.values().iterator();
        int i3 = 0;
        while (it7.hasNext()) {
            ((C7870) it7.next()).m21151(ActivityC0814.f2970.m36526(String.valueOf(i3)));
            i3++;
        }
        activityC0814.f2979 = activityC0814.m3064();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        ActivityC0814 activityC0814 = this.f48122;
        activityC0814.f2978.setAdapter((ListAdapter) new C19160(activityC0814));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f48122.m10224((Throwable) exc, true);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
