package p067l;

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
public final class C12248 {

    /* JADX INFO: renamed from: ۧ */
    public static final HashMap f34235 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public static final List f34234 = C18426.m41997();

    /* JADX INFO: renamed from: ֫ */
    public static synchronized void m28243(String str, String str2) {
        HashMap map = f34235;
        if (C12826.equals(map.get(str), str2)) {
            map.remove(str);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static synchronized void m28250(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            HashMap map = f34235;
            if (TextUtils.isEmpty((CharSequence) map.get(str))) {
                map.put(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static synchronized String m28241(String str) {
        String str2;
        str2 = (String) C15525.getOrDefault(f34235, str, "");
        if (str2 != null && !str2.isEmpty()) {
            System.out.println(">> Get password: " + str + " -> " + str2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ۧ */
    public static synchronized void m28246(String str, String str2) {
        if (str2 != null) {
            if (!str2.isEmpty()) {
                f34235.put(str, str2);
            }
            System.out.println("<< Set password: " + str + " -> " + str2);
        }
        if (f34235.remove(str) != null) {
            System.out.println("<< Set password: " + str + " -> " + str2);
        }
    }

    static {
        m28251();
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m28251() {
        List list = f34234;
        list.clear();
        String string = ApplicationC21448.f67649.getString("cpwsj", null);
        try {
            if (string != null) {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONArray) {
                        JSONArray jSONArray2 = (JSONArray) obj;
                        list.add(new C14259(jSONArray2.getString(0), jSONArray2.getString(1)));
                    } else if (obj != null && obj != JSONObject.NULL) {
                        list.add(new C14259(obj.toString(), null));
                    }
                }
                return;
            }
            String[] strArrMo20203 = ApplicationC21448.f67649.mo20203("cpws", (String[]) null);
            if (strArrMo20203 != null) {
                for (String str : strArrMo20203) {
                    list.add(new C14259(str, null));
                }
                ApplicationC21448.f67649.edit().remove("cpws").putString("cpwsj", new JSONArray(strArrMo20203).toString()).apply();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28244(ArrayList arrayList) {
        List<C14259> list = f34234;
        if (arrayList.isEmpty()) {
            return;
        }
        for (C14259 c14259 : list) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    C14259 c142510 = (C14259) it.next();
                    if (C12826.equals(c14259.f40605, c142510.f40605)) {
                        if (!C12826.equals(c14259.f40604, c142510.f40604)) {
                            c142510.f40604 = c14259.f40604;
                            break;
                        }
                        break;
                    }
                } else {
                    arrayList.add(c14259);
                    break;
                }
            }
        }
        list.clear();
        list.addAll(arrayList);
        synchronized (f34234) {
            m28253();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static Iterator m28245() {
        Iterator it;
        List list = f34234;
        synchronized (list) {
            it = ((List) C7480.stream(list).map(new C14929(0)).collect(C24205.toUnmodifiableList())).iterator();
        }
        return it;
    }

    /* JADX INFO: renamed from: ܽ */
    public static List m28249() {
        return f34234;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static List m28252() {
        List listUnmodifiableList;
        List<C14259> list = f34234;
        synchronized (list) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C14259 c14259 : list) {
                arrayList.add(new C14259(c14259.f40605, c14259.f40604));
            }
            listUnmodifiableList = C21562.unmodifiableList(arrayList);
        }
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m28248() {
        C4081.m8188(new RunnableC2671(1), f34234, 500L);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m28247(ArrayList arrayList) {
        List list = f34234;
        synchronized (list) {
            list.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C14259 c14259 = (C14259) it.next();
                f34234.add(new C14259(c14259.f40605, c14259.f40604));
            }
            m28253();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28242() {
        synchronized (f34234) {
            m28253();
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public static void m28253() {
        JSONArray jSONArray = new JSONArray();
        for (C14259 c14259 : f34234) {
            if (TextUtils.isEmpty(c14259.f40604)) {
                jSONArray.put(c14259.f40605);
            } else {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(c14259.f40605);
                jSONArray2.put(c14259.f40604);
                jSONArray.put(jSONArray2);
            }
        }
        ApplicationC21448.f67649.edit().putString("cpwsj", jSONArray.toString()).apply();
    }
}
