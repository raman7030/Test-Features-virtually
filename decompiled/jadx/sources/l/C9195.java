package l;

import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۡ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: U16Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C9195 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f27870;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f27871 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f27869 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f27868 = new ArrayList();

    public C9195(String str) {
        this.f27870 = str.replace('/', ' ').replace('\\', ' ');
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23630(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = this.f27871;
        arrayList.clear();
        ArrayList arrayList2 = this.f27869;
        arrayList2.clear();
        ArrayList arrayList3 = this.f27868;
        arrayList3.clear();
        JSONArray jSONArray = jSONObject.getJSONArray(am.av);
        for (int i = 0; i < jSONArray.length(); i++) {
            C21190 c21190 = new C21190();
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            C19779 c19779 = c21190.f68292;
            JSONObject jSONObject3 = jSONObject2.getJSONObject("b");
            c19779.f63854.m42216(jSONObject3, 'a');
            c19779.f63858.m42216(jSONObject3, 'd');
            c19779.f63856.m42216(jSONObject3, 'g');
            c19779.f63860.m42216(jSONObject3, 'j');
            c19779.f63859 = jSONObject3.getInt("m") != 0;
            c19779.f63855 = jSONObject3.getInt("n") != 0;
            c19779.f63857 = jSONObject3.getInt("o") != 0;
            if (jSONObject2.has("e")) {
                C24011 c24011 = c21190.f68290;
                JSONObject jSONObject4 = jSONObject2.getJSONObject("e");
                c24011.f77813.m42216(jSONObject4, 'a');
                c24011.f77819.m42216(jSONObject4, 'd');
                c24011.f77815.m42216(jSONObject4, 'g');
                c24011.f77814 = jSONObject4.getInt("j") != 0;
                c24011.f77818 = jSONObject4.getInt("k") != 0;
                c24011.f77816 = jSONObject4.getInt("l") != 0;
                c24011.f77817 = jSONObject4.getInt("m") != 0;
            }
            c21190.f68291 = jSONObject2.getInt(am.aF);
            c21190.f68293 = jSONObject2.getInt("d");
            int i2 = c21190.f68291;
            if (i2 != 0 && i2 != 1 && i2 != 2) {
                c21190.f68291 = 0;
            }
            arrayList.add(c21190);
            if (c21190.f68291 != 2) {
                arrayList2.add(c21190);
            } else {
                arrayList3.add(c21190);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final JSONObject m23632() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f27871.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C21190) it.next()).m48141());
            }
            jSONObject.put(am.av, jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23631() {
        for (C21190 c21190 : this.f27871) {
            if (c21190.f68291 != 2) {
                C19779 c19779 = c21190.f68292;
                c19779.f63854.m42219();
                c19779.f63858.m42219();
                c19779.f63856.m42219();
                c19779.f63860.m42219();
            } else {
                C24011 c24011 = c21190.f68290;
                c24011.f77813.m42219();
                c24011.f77815.m42219();
                c24011.f77819.m42219();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23629() {
        C18095 c18095;
        for (C21190 c21190 : this.f27871) {
            if (c21190.f68291 != 2) {
                C19779 c19779 = c21190.f68292;
                c19779.f63854.f56346 = null;
                c19779.f63858.f56346 = null;
                c19779.f63856.f56346 = null;
                c18095 = c19779.f63860;
            } else {
                C24011 c24011 = c21190.f68290;
                c24011.f77813.f56346 = null;
                c24011.f77815.f56346 = null;
                c18095 = c24011.f77819;
            }
            c18095.f56346 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x015c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19073 m23628(AbstractC7479 abstractC7479) {
        EnumC3664 enumC3664;
        boolean z;
        EnumC3664 enumC3665;
        boolean z2;
        EnumC0841 enumC0841Mo3975 = abstractC7479.mo3975();
        ArrayList<C21190> arrayList = this.f27869;
        C19073 c19073 = null;
        if (!arrayList.isEmpty() && (((enumC3665 = enumC0841Mo3975.f3316) == EnumC3664.Format35c || enumC3665 == EnumC3664.Format3rc) && enumC0841Mo3975.f3318 == 3)) {
            InterfaceC5471 interfaceC5471 = (InterfaceC5471) ((InterfaceC10952) abstractC7479).getReference();
            for (C21190 c21190 : arrayList) {
                C19779 c19779 = c21190.f68292;
                C18095 c18095 = c19779.f63856;
                boolean z3 = c19779.f63859 && (enumC0841Mo3975 == EnumC0841.f3092 || enumC0841Mo3975 == EnumC0841.f3183 || enumC0841Mo3975 == EnumC0841.f3084 || enumC0841Mo3975 == EnumC0841.f3256);
                if (!z3 && c19779.f63855) {
                    z3 = enumC0841Mo3975 == EnumC0841.f3141 || enumC0841Mo3975 == EnumC0841.f3068;
                }
                if (!z3 && c19779.f63857) {
                    z3 = enumC0841Mo3975 == EnumC0841.f3052 || enumC0841Mo3975 == EnumC0841.f3133;
                }
                if (!z3 || !c19779.f63854.m42218(interfaceC5471.mo3566()) || !c19779.f63858.m42218(interfaceC5471.getName())) {
                    z2 = false;
                } else if (!c18095.f56345) {
                    StringBuilder sb = new StringBuilder();
                    Iterator it = interfaceC5471.mo3565().iterator();
                    while (it.hasNext()) {
                        sb.append((CharSequence) it.next());
                    }
                    if (!c18095.m42218(sb.toString())) {
                        z2 = false;
                    } else if (c19779.f63860.m42218(interfaceC5471.mo3568())) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else if (c19779.f63860.m42218(interfaceC5471.mo3568())) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    if (c19073 == null) {
                        c19073 = new C19073();
                    }
                    int i = c21190.f68291;
                    if (i == 0) {
                        c19073.f60056 = true;
                    } else if (i == 1) {
                        if (interfaceC5471.getName().equals("<init>")) {
                            int i2 = c21190.f68293;
                            if ((i2 & 1) != 0) {
                                c19073.f60055 = true;
                                c19073.f60059 = 1;
                            }
                            int i3 = i2 & (-2);
                            if (i3 != 0) {
                                c19073.f60057 = true;
                                c19073.f60058 = i3 | c19073.f60058;
                            }
                        } else {
                            c19073.f60057 = true;
                            c19073.f60058 = c21190.f68293 | c19073.f60058;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                }
            }
            return c19073;
        }
        ArrayList arrayList2 = this.f27868;
        if (!arrayList2.isEmpty() && (((enumC3664 = enumC0841Mo3975.f3316) == EnumC3664.Format22c || enumC3664 == EnumC3664.Format21c) && enumC0841Mo3975.f3318 == 2)) {
            InterfaceC18877 interfaceC18877 = (InterfaceC18877) ((InterfaceC10952) abstractC7479).getReference();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C24011 c24011 = ((C21190) it2.next()).f68290;
                if (c24011.f77814) {
                    switch (C14838.f45255[enumC0841Mo3975.ordinal()]) {
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
                if (!z && c24011.f77818) {
                    switch (C14838.f45255[enumC0841Mo3975.ordinal()]) {
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
                if (!z && c24011.f77816) {
                    switch (C14838.f45255[enumC0841Mo3975.ordinal()]) {
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
                if (!z && c24011.f77817) {
                    switch (C14838.f45255[enumC0841Mo3975.ordinal()]) {
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
                if (z && c24011.f77813.m42218(interfaceC18877.mo8192()) && c24011.f77815.m42218(interfaceC18877.getName()) && c24011.f77819.m42218(interfaceC18877.getType())) {
                    C19073 c19074 = new C19073();
                    c19074.f60054 = true;
                    return c19074;
                }
            }
        }
        return null;
    }
}
