package l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۤܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAIY */
/* JADX INFO: loaded from: classes3.dex */
public final class C10395 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f31270 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final List f31269 = C16895.m39756();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m26214(String str, String str2) {
        HashMap map = f31270;
        if (C11003.equals(map.get(str), str2)) {
            map.remove(str);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static synchronized void m26221(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            HashMap map = f31270;
            if (TextUtils.isEmpty((CharSequence) map.get(str))) {
                map.put(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized String m26212(String str) {
        String str2;
        str2 = (String) C13843.getOrDefault(f31270, str, "");
        if (str2 != null && !str2.isEmpty()) {
            System.out.println(">> Get password: " + str + " -> " + str2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static synchronized void m26217(String str, String str2) {
        if (str2 != null) {
            if (!str2.isEmpty()) {
                f31270.put(str, str2);
            }
            System.out.println("<< Set password: " + str + " -> " + str2);
        }
        if (f31270.remove(str) != null) {
            System.out.println("<< Set password: " + str + " -> " + str2);
        }
    }

    static {
        m26222();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m26222() {
        List list = f31269;
        list.clear();
        String string = ApplicationC20075.f65008.getString("cpwsj", null);
        try {
            if (string != null) {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONArray) {
                        JSONArray jSONArray2 = (JSONArray) obj;
                        list.add(new C12511(jSONArray2.getString(0), jSONArray2.getString(1)));
                    } else if (obj != null && obj != JSONObject.NULL) {
                        list.add(new C12511(obj.toString(), null));
                    }
                }
                return;
            }
            String[] strArrMo18255 = ApplicationC20075.f65008.mo18255("cpws", (String[]) null);
            if (strArrMo18255 != null) {
                for (String str : strArrMo18255) {
                    list.add(new C12511(str, null));
                }
                ApplicationC20075.f65008.edit().remove("cpws").putString("cpwsj", new JSONArray(strArrMo18255).toString()).apply();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26215(ArrayList arrayList) {
        List<C12511> list = f31269;
        if (arrayList.isEmpty()) {
            return;
        }
        for (C12511 c12511 : list) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    C12511 c12512 = (C12511) it.next();
                    if (C11003.equals(c12511.f37581, c12512.f37581)) {
                        if (!C11003.equals(c12511.f37580, c12512.f37580)) {
                            c12512.f37580 = c12511.f37580;
                            break;
                        }
                        break;
                    }
                } else {
                    arrayList.add(c12511);
                    break;
                }
            }
        }
        list.clear();
        list.addAll(arrayList);
        synchronized (f31269) {
            m26224();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Iterator m26216() {
        Iterator it;
        List list = f31269;
        synchronized (list) {
            it = ((List) C5378.stream(list).map(new C13216(0)).collect(C22976.toUnmodifiableList())).iterator();
        }
        return it;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static List m26220() {
        return f31269;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static List m26223() {
        List listUnmodifiableList;
        List<C12511> list = f31269;
        synchronized (list) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C12511 c12511 : list) {
                arrayList.add(new C12511(c12511.f37581, c12511.f37580));
            }
            listUnmodifiableList = C20195.unmodifiableList(arrayList);
        }
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m26219() {
        C1802.m5991(new RunnableC0318(1), f31269, 500L);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m26218(ArrayList arrayList) {
        List list = f31269;
        synchronized (list) {
            list.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C12511 c12511 = (C12511) it.next();
                f31269.add(new C12511(c12511.f37581, c12511.f37580));
            }
            m26224();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26213() {
        synchronized (f31269) {
            m26224();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m26224() {
        JSONArray jSONArray = new JSONArray();
        for (C12511 c12511 : f31269) {
            if (TextUtils.isEmpty(c12511.f37580)) {
                jSONArray.put(c12511.f37581);
            } else {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(c12511.f37581);
                jSONArray2.put(c12511.f37580);
                jSONArray.put(jSONArray2);
            }
        }
        ApplicationC20075.f65008.edit().putString("cpwsj", jSONArray.toString()).apply();
    }
}
