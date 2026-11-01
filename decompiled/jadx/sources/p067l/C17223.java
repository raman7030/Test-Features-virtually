package p067l;

import android.widget.ListAdapter;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺ֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9R5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17223 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC3142 f51261;

    public C17223(ActivityC3142 activityC3142) {
        this.f51261 = activityC3142;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f51261, R.string.MT_Protector);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x0211  */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        C19236 c19236;
        Iterator it;
        Iterator it2;
        Map map;
        InterfaceC5763 interfaceC5763;
        C17894 c17894;
        ActivityC3142.f5741.mo25503();
        ActivityC3142.f5741.m38666();
        ActivityC3142 activityC3142 = this.f51261;
        byte[] bArrM4194 = C2700.m4194(activityC3142.f5743.mo29987(), 0);
        C24538 c24538 = new C24538(bArrM4194);
        c24538.m54129();
        ActivityC3142.f5741.m38684("arsc").m38660(bArrM4194);
        C19236 c19237 = new C19236(c24538);
        Iterator it3 = c24538.mo23906().iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((InterfaceC6434) it3.next()).mo14714().iterator();
            while (it4.hasNext()) {
                InterfaceC3080 interfaceC3080 = (InterfaceC3080) it4.next();
                String typeName = interfaceC3080.getTypeName();
                if (typeName.equals("string") || typeName.equals("array") || typeName.equals("plurals")) {
                    Iterator it5 = interfaceC3080.mo5201().iterator();
                    while (it5.hasNext()) {
                        InterfaceC9116 interfaceC9116 = (InterfaceC9116) it5.next();
                        String string = interfaceC9116.mo20693().toString();
                        C3813 c3813M43808 = c19237.m43808(string);
                        C9848 c9848 = (C9848) activityC3142.f5744.get(string);
                        String typeName2 = interfaceC9116.getType().getTypeName();
                        Iterator it6 = interfaceC9116.mo20696().iterator();
                        while (it6.hasNext()) {
                            InterfaceC22528 interfaceC22528 = (InterfaceC22528) it6.next();
                            int i = -1;
                            for (InterfaceC3751 interfaceC3751 : interfaceC22528.values()) {
                                int i2 = i + 1;
                                if (interfaceC3751.mo7252()) {
                                    c19236 = c19237;
                                    if (typeName2.equals("plurals")) {
                                        it = it3;
                                        int iMo7249 = interfaceC3751.mo7249();
                                        if (iMo7249 < 16777220 || iMo7249 > 16777225) {
                                        }
                                        string = string;
                                        it3 = it;
                                        string = string;
                                        c19237 = c19236;
                                        it4 = it2;
                                        it5 = it5;
                                        it6 = it6;
                                        interfaceC9116 = interfaceC9116;
                                        i = i2;
                                    } else {
                                        it = it3;
                                    }
                                    InterfaceC5763 interfaceC5763Mo7251 = interfaceC3751.mo7251();
                                    if (interfaceC5763Mo7251.mo12361() || C11345.m26283(interfaceC5763Mo7251.getValue())) {
                                        it2 = it4;
                                        it5 = it5;
                                        it6 = it6;
                                    } else {
                                        it2 = it4;
                                        Map map2 = c3813M43808.f8169;
                                        if (!(map2 == null ? false : map2.containsKey(new C12531(interfaceC22528.mo50214(), i2)))) {
                                            string = string;
                                        }
                                        it3 = it;
                                        string = string;
                                        c19237 = c19236;
                                        it4 = it2;
                                        it5 = it5;
                                        it6 = it6;
                                        interfaceC9116 = interfaceC9116;
                                        i = i2;
                                    }
                                    if (c9848 == null) {
                                        activityC3142.f5746.add(string);
                                        c9848 = new C9848(interfaceC9116.mo20693().m51374());
                                        activityC3142.f5744.put(string, c9848);
                                    }
                                    C16553 c16553 = new C16553();
                                    c16553.f48616 = interfaceC22528.mo50214();
                                    c16553.f48619 = i2;
                                    c16553.f48618 = interfaceC22528.mo31468();
                                    if (typeName2.equals("array")) {
                                        c16553.f48618 = "array:" + c16553.f48618 + "[" + i2 + "]";
                                    } else {
                                        if (typeName2.equals("plurals")) {
                                            int iMo72410 = interfaceC3751.mo7249() - 16777220;
                                            StringBuilder sb = new StringBuilder("plurals:");
                                            sb.append(c16553.f48618);
                                            sb.append("[");
                                            c16553.f48618 = C10965.m25286(sb, InterfaceC3751.f7973[iMo72410], "]");
                                        }
                                        if (c3813M43808.f8169 != null) {
                                            c17894 = (C17894) c3813M43808.f8169.get(new C12531(interfaceC22528.mo50214(), i2));
                                            if (c17894 == null && interfaceC5763Mo7251.equals(c17894.f53468)) {
                                                interfaceC5763 = c17894.f53467;
                                            } else {
                                                interfaceC5763 = null;
                                            }
                                        } else {
                                            map = c3813M43808.f8170;
                                            if (map != null) {
                                                interfaceC5763 = (InterfaceC5763) map.get(interfaceC5763Mo7251);
                                            } else {
                                                interfaceC5763 = null;
                                            }
                                        }
                                        if (interfaceC5763 != null) {
                                            c16553.f48617 = new C23260(interfaceC5763).m51802();
                                            c16553.f48620 = new C23260(interfaceC5763Mo7251).m51802();
                                        } else {
                                            c16553.f48617 = new C23260(interfaceC5763Mo7251).m51802();
                                        }
                                        c9848.add(c16553);
                                        it3 = it;
                                        string = string;
                                        c19237 = c19236;
                                        it4 = it2;
                                        it5 = it5;
                                        it6 = it6;
                                        interfaceC9116 = interfaceC9116;
                                        i = i2;
                                    }
                                    if (c3813M43808.f8169 != null) {
                                        c17894 = (C17894) c3813M43808.f8169.get(new C12531(interfaceC22528.mo50214(), i2));
                                        if (c17894 == null) {
                                            interfaceC5763 = null;
                                        } else {
                                            interfaceC5763 = null;
                                        }
                                    } else {
                                        map = c3813M43808.f8170;
                                        if (map != null) {
                                            interfaceC5763 = (InterfaceC5763) map.get(interfaceC5763Mo7251);
                                        } else {
                                            interfaceC5763 = null;
                                        }
                                    }
                                    if (interfaceC5763 != null) {
                                        c16553.f48617 = new C23260(interfaceC5763).m51802();
                                        c16553.f48620 = new C23260(interfaceC5763Mo7251).m51802();
                                    } else {
                                        c16553.f48617 = new C23260(interfaceC5763Mo7251).m51802();
                                    }
                                    c9848.add(c16553);
                                    it3 = it;
                                    string = string;
                                    c19237 = c19236;
                                    it4 = it2;
                                    it5 = it5;
                                    it6 = it6;
                                    interfaceC9116 = interfaceC9116;
                                    i = i2;
                                } else {
                                    c19236 = c19237;
                                    it = it3;
                                }
                                it2 = it4;
                                it5 = it5;
                                it6 = it6;
                                string = string;
                                it3 = it;
                                string = string;
                                c19237 = c19236;
                                it4 = it2;
                                it5 = it5;
                                it6 = it6;
                                interfaceC9116 = interfaceC9116;
                                i = i2;
                            }
                        }
                    }
                }
                it3 = it3;
                c19237 = c19237;
                it4 = it4;
            }
        }
        Collections.sort(activityC3142.f5746);
        Iterator it7 = activityC3142.f5744.values().iterator();
        int i3 = 0;
        while (it7.hasNext()) {
            ((C9848) it7.next()).m23116(ActivityC3142.f5741.m38684(String.valueOf(i3)));
            i3++;
        }
        activityC3142.f5750 = activityC3142.m5377();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        ActivityC3142 activityC3142 = this.f51261;
        activityC3142.f5749.setAdapter((ListAdapter) new C20578(activityC3142));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f51261.m12260((Throwable) exc, true);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
