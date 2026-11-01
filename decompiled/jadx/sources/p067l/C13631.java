package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6J0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13631 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f38375;

    /* JADX INFO: renamed from: ۧ */
    public final C10278 f38376;

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f38377;

    /* JADX INFO: renamed from: ᩳ */
    public final HashMap f38378;

    public C13631(C10278 c10278) {
        ArrayList arrayList = new ArrayList();
        this.f38375 = arrayList;
        this.f38377 = new HashMap();
        this.f38378 = new HashMap();
        this.f38376 = c10278;
        arrayList.add(new C8266());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = c10278.mo14714().iterator();
        while (it.hasNext()) {
            arrayList2.add((C21678) it.next());
        }
        Collections.sort(arrayList2, new C12290(0));
        HashMap map = new HashMap();
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C21678 c21678 = (C21678) it2.next();
            String typeName = c21678.getTypeName();
            Integer num = (Integer) map.get(typeName);
            int iIntValue = num != null ? num.intValue() : 0;
            map.put(typeName, Integer.valueOf(iIntValue + 1));
            if (iIntValue == this.f38375.size()) {
                this.f38375.add(new C8266());
            }
            C8266 c8266 = (C8266) this.f38375.get(iIntValue);
            c8266.f21894.add(c21678);
            this.f38377.put(Integer.valueOf(c21678.mo5199()), c8266);
            this.f38378.put(Integer.valueOf(c21678.mo5199()), c21678);
        }
        ArrayList<C8266> arrayList3 = this.f38375;
        for (C2901 c2901 : this.f38376.mo14709()) {
            HashMap map2 = new HashMap();
            if (c2901.mo4679() == 0) {
                ((C8266) arrayList3.get(0)).f21893.add(c2901);
            } else {
                for (C7596 c7596 : c2901.mo14242()) {
                    HashMap map3 = new HashMap();
                    if (((C17441) c7596.mo10842()).isEmpty()) {
                        map3.put((C8266) arrayList3.get(0), new C17441());
                    }
                    for (int i = 0; i < ((C17441) c7596.mo10842()).size(); i++) {
                        int i2 = ((C17441) c7596.mo10842()).getInt(i);
                        C8266 c8266M31012 = m31012(i2);
                        C17441 c17441 = (C17441) map3.get(c8266M31012);
                        if (c17441 == null) {
                            c17441 = new C17441();
                            map3.put(c8266M31012, c17441);
                        }
                        c17441.add(i2);
                    }
                    for (C8266 c8267 : arrayList3) {
                        C17441 c17442 = (C17441) map3.get(c8267);
                        if (c17442 != null) {
                            C2901 c2902 = (C2901) map2.get(c8267);
                            if (c2902 == null) {
                                c2902 = new C2901(c2901.getName(), c2901.mo14244());
                                map2.put(c8267, c2902);
                                c8267.f21893.add(c2902);
                            }
                            c2902.m4676(c7596.mo10843(), c17442);
                        }
                    }
                }
            }
        }
        for (C16982 c16982 : this.f38376.mo14721()) {
            if (c16982.mo38572() == 0) {
                ((C8266) this.f38375.get(0)).f21892.add(c16982);
            } else {
                HashMap map4 = new HashMap();
                for (C23019 c23019 : c16982.mo46275()) {
                    C8266 c8266M31013 = m31012(c23019.mo47853());
                    C16982 c16983 = (C16982) map4.get(c8266M31013);
                    if (c16983 == null) {
                        c16983 = new C16982();
                        map4.put(c8266M31013, c16983);
                        c8266M31013.f21892.add(c16983);
                    }
                    c16983.m38569(c23019.mo47854(), c23019.mo47853());
                }
            }
        }
        ArrayList arrayList4 = this.f38375;
        Collections.reverse(arrayList4.subList(1, arrayList4.size()));
    }

    /* JADX INFO: renamed from: ֫ */
    private C8266 m31012(int i) {
        int i2 = (i >>> 16) & 255;
        C21678 c21678 = (C21678) this.f38378.get(Integer.valueOf(i2));
        int i3 = 65535 & i;
        if ((i >>> 24) == this.f38376.mo14722() && c21678 != null && i3 < c21678.f68292.size() && c21678.m48945(i3) != null) {
            return (C8266) this.f38377.get(Integer.valueOf(i2));
        }
        return (C8266) this.f38375.get(0);
    }
}
