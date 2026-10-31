package l;

import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import com.google.android.material.badge.BadgeDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠ܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: FAV4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8239 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f25366 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f25367 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C5242 f25368 = new C5242();

    static {
        m21820();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m21820() {
        int i = C4301.f13875;
        m21823();
        String string = ApplicationC20075.f65008.getString("tfg", null);
        String string2 = ApplicationC20075.f65008.getString("text_function", null);
        ArrayList arrayList = f25367;
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
                    m21816(arrayList3, jSONArray2);
                    arrayList2.add(new C5417(string3, arrayList3));
                }
            }
            if (!arrayList2.isEmpty()) {
                if (string2 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    m21816(arrayList4, new JSONArray(string2));
                    ApplicationC20075.f65008.edit().remove("text_function").apply();
                    if (!arrayList4.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C5417 c5417 = (C5417) it.next();
                                if (c5417.m15502().equals("backup")) {
                                    ((ArrayList) c5417.m15500()).clear();
                                    ((ArrayList) c5417.m15500()).addAll(arrayList4);
                                    break;
                                }
                            } else {
                                arrayList2.add(0, new C5417("backup", arrayList4));
                                break;
                            }
                        }
                        z = true;
                    }
                }
                arrayList.clear();
                arrayList.addAll(arrayList2);
                if (z) {
                    m21824();
                    return;
                }
                return;
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (string2 == null) {
            arrayList5.add(new C15293("→", new C11146(9), null));
            arrayList5.add(m21814("/", "/"));
            arrayList5.add(m21814(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX));
            arrayList5.add(m21814("-", "-"));
            arrayList5.add(m21814("*", "*"));
            arrayList5.add(m21814("=", "="));
            arrayList5.add(m21814("<", "<"));
            arrayList5.add(m21814(">", ">"));
            arrayList5.add(m21814("\"", "\""));
            arrayList5.add(m21814("'", "'"));
            arrayList5.add(m21814(l.b, l.b));
            arrayList5.add(m21814("|", "|"));
            arrayList5.add(m21814("\\", "\\"));
            arrayList5.add(m21814("_", "_"));
            arrayList5.add(m21814("()", "($S$T$E)"));
            arrayList5.add(m21814("[]", "[$S$T$E]"));
            arrayList5.add(m21814("{}", "{$S$T$E}"));
            arrayList5.add(new C15293("…", new C11146(22), null));
        } else {
            m21816(arrayList5, new JSONArray(string2));
            ApplicationC20075.f65008.edit().remove("text_function").apply();
        }
        arrayList.clear();
        arrayList.add(new C5417(C4925.m14327(R.string.MT_Protector), arrayList5));
        m21824();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21816(ArrayList arrayList, JSONArray jSONArray) {
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            C15293 c15293M36301 = C15293.m36301(jSONArray.getJSONObject(i));
            if (c15293M36301.m36302()) {
                arrayList.add(c15293M36301);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15293 m21814(String str, String str2) {
        return new C15293(str, new C4816(str2), null);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static List m21821() {
        return f25367;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C5242 m21819() {
        return f25368;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m21822() {
        f25368.mo1664(new Object());
        C1802.m5991(new RunnableC1183(), C8239.class, 200L);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m21823() {
        f25368.mo1664(new Object());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m21813(ArrayList arrayList) {
        ArrayList arrayList2 = f25367;
        JSONArray jSONArray = new JSONArray(arrayList2.size());
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            if (arrayList == null || arrayList.contains(Integer.valueOf(i))) {
                C5417 c5417 = (C5417) arrayList2.get(i);
                ArrayList arrayList3 = (ArrayList) c5417.m15500();
                JSONArray jSONArray2 = new JSONArray(arrayList3.size());
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    jSONArray2.add(((C15293) it.next()).m36305());
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("n", c5417.m15502());
                jSONObject.put("d", jSONArray2);
                jSONArray.add(jSONObject);
            }
        }
        return jSONArray.toString();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m21824() {
        ApplicationC20075.f65008.edit().putString("tfg", m21813(null)).apply();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21818(AbstractC15440 abstractC15440, ArrayList arrayList) {
        abstractC15440.m36510(m21813(arrayList));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21817(AbstractC15440 abstractC15440, int i) throws C19401 {
        JSONArray jSONArray = new JSONArray(abstractC15440.m36489());
        if (jSONArray.size() == 0) {
            throw new C19401(R.string.MT_Protector);
        }
        JSONObject jSONObject = jSONArray.getJSONObject(0);
        if (jSONObject == null) {
            throw new C19401(R.string.MT_Protector);
        }
        ArrayList<C5417> arrayList = new ArrayList();
        if (jSONObject.size() == 2 && jSONObject.contains("n") && jSONObject.contains("d")) {
            JSONArray jSONArray2 = new JSONArray(jSONArray);
            int size = jSONArray2.size();
            for (int i2 = 0; i2 < size; i2++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                String string = jSONObject2.getString("n");
                JSONArray jSONArray3 = jSONObject2.getJSONArray("d");
                if (string == null || jSONArray3 == null) {
                    throw new C19401(R.string.MT_Protector);
                }
                ArrayList arrayList2 = new ArrayList();
                int size2 = jSONArray3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C15293 c15293M36301 = C15293.m36301(jSONArray3.getJSONObject(i3));
                    if (c15293M36301.m36302()) {
                        arrayList2.add(c15293M36301);
                    }
                }
                arrayList.add(new C5417(string, arrayList2));
            }
        } else {
            ArrayList arrayList3 = new ArrayList();
            int size3 = jSONArray.size();
            for (int i4 = 0; i4 < size3; i4++) {
                C15293 c15293M36302 = C15293.m36301(jSONArray.getJSONObject(i4));
                if (!c15293M36302.m36302()) {
                    throw new C19401(R.string.MT_Protector);
                }
                arrayList3.add(c15293M36302);
            }
            if (arrayList3.isEmpty()) {
                throw new C19401(R.string.MT_Protector);
            }
            arrayList.add(new C5417(C4925.m14327(i == 0 ? R.string.MT_Protector : R.string.MT_Protector), arrayList3));
        }
        ArrayList arrayList4 = f25367;
        if (i == 0) {
            arrayList4.addAll(arrayList);
        } else if (i == 1) {
            for (C5417 c5417 : arrayList) {
                Iterator it = arrayList4.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C5417 c5418 = (C5417) it.next();
                        if (c5418.m15502().equals(c5417.m15502())) {
                            ((ArrayList) c5418.m15500()).addAll(c5417.m15500());
                            break;
                        }
                    } else {
                        arrayList4.add(c5417);
                        break;
                    }
                }
            }
        } else if (i == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList);
        }
        f25368.mo1664(new Object());
        m21824();
    }
}
