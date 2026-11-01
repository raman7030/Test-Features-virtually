package p067l;

import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.google.android.material.badge.BadgeDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠ܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: FAV4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10199 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f28276 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final ArrayList f28277 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public static C7350 f28278 = new C7350();

    static {
        m23789();
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m23789() {
        int i = C6456.f16690;
        m23792();
        String string = ApplicationC21448.f67649.getString("tfg", null);
        String string2 = ApplicationC21448.f67649.getString("text_function", null);
        ArrayList arrayList = f28277;
        if (string != null) {
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArray = new JSONArray(string);
            int size = jSONArray.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String string3 = jSONObject.getString("n");
                JSONArray jSONArray2 = jSONObject.getJSONArray("d");
                if (string3 != null && jSONArray2 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    m23785(arrayList3, jSONArray2);
                    arrayList2.add(new C7517(string3, arrayList3));
                }
            }
            if (!arrayList2.isEmpty()) {
                if (string2 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    m23785(arrayList4, new JSONArray(string2));
                    ApplicationC21448.f67649.edit().remove("text_function").apply();
                    if (!arrayList4.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C7517 c7517 = (C7517) it.next();
                                if (c7517.m17413().equals("backup")) {
                                    ((ArrayList) c7517.m17411()).clear();
                                    ((ArrayList) c7517.m17411()).addAll(arrayList4);
                                    break;
                                }
                            } else {
                                arrayList2.add(0, new C7517("backup", arrayList4));
                                break;
                            }
                        }
                        z = true;
                    }
                }
                arrayList.clear();
                arrayList.addAll(arrayList2);
                if (z) {
                    m23793();
                    return;
                }
                return;
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (string2 == null) {
            arrayList5.add(new C16903("→", new C12962(9), null));
            arrayList5.add(m23783("/", "/"));
            arrayList5.add(m23783(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX));
            arrayList5.add(m23783("-", "-"));
            arrayList5.add(m23783("*", "*"));
            arrayList5.add(m23783("=", "="));
            arrayList5.add(m23783("<", "<"));
            arrayList5.add(m23783(">", ">"));
            arrayList5.add(m23783("\"", "\""));
            arrayList5.add(m23783("'", "'"));
            arrayList5.add(m23783(C0249l.f1196b, C0249l.f1196b));
            arrayList5.add(m23783("|", "|"));
            arrayList5.add(m23783("\\", "\\"));
            arrayList5.add(m23783("_", "_"));
            arrayList5.add(m23783("()", "($S$T$E)"));
            arrayList5.add(m23783("[]", "[$S$T$E]"));
            arrayList5.add(m23783("{}", "{$S$T$E}"));
            arrayList5.add(new C16903("…", new C12962(22), null));
        } else {
            m23785(arrayList5, new JSONArray(string2));
            ApplicationC21448.f67649.edit().remove("text_function").apply();
        }
        arrayList.clear();
        arrayList.add(new C7517(C7050.m16224(R.string.MT_Protector), arrayList5));
        m23793();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23785(ArrayList arrayList, JSONArray jSONArray) {
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            C16903 c16903M38462 = C16903.m38462(jSONArray.getJSONObject(i));
            if (c16903M38462.m38463()) {
                arrayList.add(c16903M38462);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16903 m23783(String str, String str2) {
        return new C16903(str, new C6946(str2), null);
    }

    /* JADX INFO: renamed from: ܽ */
    public static List m23790() {
        return f28277;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C7350 m23788() {
        return f28278;
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m23791() {
        f28278.mo4062(new Object());
        C4081.m8188(new RunnableC3493(), C10199.class, 200L);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m23792() {
        f28278.mo4062(new Object());
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m23782(ArrayList arrayList) {
        ArrayList arrayList2 = f28277;
        JSONArray jSONArray = new JSONArray(arrayList2.size());
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            if (arrayList == null || arrayList.contains(Integer.valueOf(i))) {
                C7517 c7517 = (C7517) arrayList2.get(i);
                ArrayList arrayList3 = (ArrayList) c7517.m17411();
                JSONArray jSONArray2 = new JSONArray(arrayList3.size());
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    jSONArray2.add(((C16903) it.next()).m38466());
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("n", c7517.m17413());
                jSONObject.put("d", jSONArray2);
                jSONArray.add(jSONObject);
            }
        }
        return jSONArray.toString();
    }

    /* JADX INFO: renamed from: ᩻ */
    public static void m23793() {
        ApplicationC21448.f67649.edit().putString("tfg", m23782(null)).apply();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23787(AbstractC17043 abstractC17043, ArrayList arrayList) {
        abstractC17043.m38668(m23782(arrayList));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23786(AbstractC17043 abstractC17043, int i) throws C20807 {
        JSONArray jSONArray = new JSONArray(abstractC17043.m38647());
        if (jSONArray.size() == 0) {
            throw new C20807(R.string.MT_Protector);
        }
        JSONObject jSONObject = jSONArray.getJSONObject(0);
        if (jSONObject == null) {
            throw new C20807(R.string.MT_Protector);
        }
        ArrayList<C7517> arrayList = new ArrayList();
        if (jSONObject.size() == 2 && jSONObject.contains("n") && jSONObject.contains("d")) {
            JSONArray jSONArray2 = new JSONArray(jSONArray);
            int size = jSONArray2.size();
            for (int i2 = 0; i2 < size; i2++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                String string = jSONObject2.getString("n");
                JSONArray jSONArray3 = jSONObject2.getJSONArray("d");
                if (string == null || jSONArray3 == null) {
                    throw new C20807(R.string.MT_Protector);
                }
                ArrayList arrayList2 = new ArrayList();
                int size2 = jSONArray3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C16903 c16903M38462 = C16903.m38462(jSONArray3.getJSONObject(i3));
                    if (c16903M38462.m38463()) {
                        arrayList2.add(c16903M38462);
                    }
                }
                arrayList.add(new C7517(string, arrayList2));
            }
        } else {
            ArrayList arrayList3 = new ArrayList();
            int size3 = jSONArray.size();
            for (int i4 = 0; i4 < size3; i4++) {
                C16903 c16903M38463 = C16903.m38462(jSONArray.getJSONObject(i4));
                if (!c16903M38463.m38463()) {
                    throw new C20807(R.string.MT_Protector);
                }
                arrayList3.add(c16903M38463);
            }
            if (arrayList3.isEmpty()) {
                throw new C20807(R.string.MT_Protector);
            }
            arrayList.add(new C7517(C7050.m16224(i == 0 ? R.string.MT_Protector : R.string.MT_Protector), arrayList3));
        }
        ArrayList arrayList4 = f28277;
        if (i == 0) {
            arrayList4.addAll(arrayList);
        } else if (i == 1) {
            for (C7517 c7517 : arrayList) {
                Iterator it = arrayList4.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C7517 c7518 = (C7517) it.next();
                        if (c7518.m17413().equals(c7517.m17413())) {
                            ((ArrayList) c7518.m17411()).addAll(c7517.m17411());
                            break;
                        }
                    } else {
                        arrayList4.add(c7517);
                        break;
                    }
                }
            }
        } else if (i == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList);
        }
        f28278.mo4062(new Object());
        m23793();
    }
}
