package p067l;

import com.umeng.analytics.pro.C0655am;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۡ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: U16Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C11108 {

    /* JADX INFO: renamed from: ܽ */
    public final String f30809;

    /* JADX INFO: renamed from: ᩳ */
    public ArrayList f30810 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f30808 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f30807 = new ArrayList();

    public C11108(String str) {
        this.f30809 = str.replace('/', ' ').replace('\\', ' ');
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25583(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = this.f30810;
        arrayList.clear();
        ArrayList arrayList2 = this.f30808;
        arrayList2.clear();
        ArrayList arrayList3 = this.f30807;
        arrayList3.clear();
        JSONArray jSONArray = jSONObject.getJSONArray(C0655am.f2320av);
        for (int i = 0; i < jSONArray.length(); i++) {
            C22508 c22508 = new C22508();
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            C21167 c21167 = c22508.f70974;
            JSONObject jSONObject3 = jSONObject2.getJSONObject("b");
            c21167.f66492.m44475(jSONObject3, 'a');
            c21167.f66496.m44475(jSONObject3, 'd');
            c21167.f66494.m44475(jSONObject3, 'g');
            c21167.f66498.m44475(jSONObject3, 'j');
            c21167.f66497 = jSONObject3.getInt("m") != 0;
            c21167.f66493 = jSONObject3.getInt("n") != 0;
            c21167.f66495 = jSONObject3.getInt("o") != 0;
            if (jSONObject2.has("e")) {
                C25189 c25189 = c22508.f70972;
                JSONObject jSONObject4 = jSONObject2.getJSONObject("e");
                c25189.f80565.m44475(jSONObject4, 'a');
                c25189.f80571.m44475(jSONObject4, 'd');
                c25189.f80567.m44475(jSONObject4, 'g');
                c25189.f80566 = jSONObject4.getInt("j") != 0;
                c25189.f80570 = jSONObject4.getInt("k") != 0;
                c25189.f80568 = jSONObject4.getInt("l") != 0;
                c25189.f80569 = jSONObject4.getInt("m") != 0;
            }
            c22508.f70973 = jSONObject2.getInt(C0655am.f2278aF);
            c22508.f70975 = jSONObject2.getInt("d");
            int i2 = c22508.f70973;
            if (i2 != 0 && i2 != 1 && i2 != 2) {
                c22508.f70973 = 0;
            }
            arrayList.add(c22508);
            if (c22508.f70973 != 2) {
                arrayList2.add(c22508);
            } else {
                arrayList3.add(c22508);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final JSONObject m25585() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f30810.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C22508) it.next()).m50471());
            }
            jSONObject.put(C0655am.f2320av, jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m25584() {
        for (C22508 c22508 : this.f30810) {
            if (c22508.f70973 != 2) {
                C21167 c21167 = c22508.f70974;
                c21167.f66492.m44478();
                c21167.f66496.m44478();
                c21167.f66494.m44478();
                c21167.f66498.m44478();
            } else {
                C25189 c25189 = c22508.f70972;
                c25189.f80565.m44478();
                c25189.f80567.m44478();
                c25189.f80571.m44478();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25582() {
        C19566 c19566;
        for (C22508 c22508 : this.f30810) {
            if (c22508.f70973 != 2) {
                C21167 c21167 = c22508.f70974;
                c21167.f66492.f59558 = null;
                c21167.f66496.f59558 = null;
                c21167.f66494.f59558 = null;
                c19566 = c21167.f66498;
            } else {
                C25189 c25189 = c22508.f70972;
                c25189.f80565.f59558 = null;
                c25189.f80567.f59558 = null;
                c19566 = c25189.f80571;
            }
            c19566.f59558 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x015c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final C20496 m25581(AbstractC9476 abstractC9476) {
        EnumC5850 enumC5850;
        boolean z;
        EnumC5850 enumC5851;
        boolean z2;
        EnumC3167 enumC3167Mo6217 = abstractC9476.mo6217();
        ArrayList<C22508> arrayList = this.f30808;
        C20496 c20496 = null;
        if (!arrayList.isEmpty() && (((enumC5851 = enumC3167Mo6217.f6090) == EnumC5850.Format35c || enumC5851 == EnumC5850.Format3rc) && enumC3167Mo6217.f6092 == 3)) {
            InterfaceC7568 interfaceC7568 = (InterfaceC7568) ((InterfaceC12777) abstractC9476).getReference();
            for (C22508 c22508 : arrayList) {
                C21167 c21167 = c22508.f70974;
                C19566 c19566 = c21167.f66494;
                boolean z3 = c21167.f66497 && (enumC3167Mo6217 == EnumC3167.f5866 || enumC3167Mo6217 == EnumC3167.f5957 || enumC3167Mo6217 == EnumC3167.f5858 || enumC3167Mo6217 == EnumC3167.f6030);
                if (!z3 && c21167.f66493) {
                    z3 = enumC3167Mo6217 == EnumC3167.f5915 || enumC3167Mo6217 == EnumC3167.f5842;
                }
                if (!z3 && c21167.f66495) {
                    z3 = enumC3167Mo6217 == EnumC3167.f5826 || enumC3167Mo6217 == EnumC3167.f5907;
                }
                if (!z3 || !c21167.f66492.m44477(interfaceC7568.mo5853()) || !c21167.f66496.m44477(interfaceC7568.getName())) {
                    z2 = false;
                } else if (!c19566.f59557) {
                    StringBuilder sb = new StringBuilder();
                    Iterator it = interfaceC7568.mo5852().iterator();
                    while (it.hasNext()) {
                        sb.append((CharSequence) it.next());
                    }
                    if (!c19566.m44477(sb.toString())) {
                        z2 = false;
                    } else if (c21167.f66498.m44477(interfaceC7568.mo5855())) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else if (c21167.f66498.m44477(interfaceC7568.mo5855())) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    if (c20496 == null) {
                        c20496 = new C20496();
                    }
                    int i = c22508.f70973;
                    if (i == 0) {
                        c20496.f63290 = true;
                    } else if (i == 1) {
                        if (interfaceC7568.getName().equals("<init>")) {
                            int i2 = c22508.f70975;
                            if ((i2 & 1) != 0) {
                                c20496.f63289 = true;
                                c20496.f63293 = 1;
                            }
                            int i3 = i2 & (-2);
                            if (i3 != 0) {
                                c20496.f63291 = true;
                                c20496.f63292 = i3 | c20496.f63292;
                            }
                        } else {
                            c20496.f63291 = true;
                            c20496.f63292 = c22508.f70975 | c20496.f63292;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
            }
            return c20496;
        }
        ArrayList arrayList2 = this.f30807;
        if (!arrayList2.isEmpty() && (((enumC5850 = enumC3167Mo6217.f6090) == EnumC5850.Format22c || enumC5850 == EnumC5850.Format21c) && enumC3167Mo6217.f6092 == 2)) {
            InterfaceC20309 interfaceC20309 = (InterfaceC20309) ((InterfaceC12777) abstractC9476).getReference();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C25189 c25189 = ((C22508) it2.next()).f70972;
                if (c25189.f80566) {
                    switch (C16471.f48371[enumC3167Mo6217.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z = true;
                            break;
                        default:
                            z = false;
                            break;
                    }
                } else {
                    z = false;
                }
                if (!z && c25189.f80570) {
                    switch (C16471.f48371[enumC3167Mo6217.ordinal()]) {
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                            z = true;
                            break;
                    }
                }
                if (!z && c25189.f80568) {
                    switch (C16471.f48371[enumC3167Mo6217.ordinal()]) {
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                            z = true;
                            break;
                    }
                }
                if (!z && c25189.f80569) {
                    switch (C16471.f48371[enumC3167Mo6217.ordinal()]) {
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                            z = true;
                            break;
                    }
                }
                if (z && c25189.f80565.m44477(interfaceC20309.mo10231()) && c25189.f80567.m44477(interfaceC20309.getName()) && c25189.f80571.m44477(interfaceC20309.getType())) {
                    C20496 c20497 = new C20496();
                    c20497.f63288 = true;
                    return c20497;
                }
            }
        }
        return null;
    }
}
