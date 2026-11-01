package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H8A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18825 {

    /* JADX INFO: renamed from: ֫ */
    public static Set f56207;

    static {
        m42883();
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m42883() {
        String string = ApplicationC21448.f67649.getString("mhf", null);
        if (!C11567.m26629((CharSequence) string)) {
            f56207 = m42881(string);
        } else {
            f56207 = Collections.EMPTY_SET;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m42880() {
        return ApplicationC21448.f67649.getBoolean("smhf", false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42876(boolean z) {
        C24104.m53360(ApplicationC21448.f67649, "smhf", z);
        m42884();
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m42882() {
        return ApplicationC21448.f67649.getBoolean("sshf", true);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m42879(boolean z) {
        C24104.m53360(ApplicationC21448.f67649, "sshf", z);
        m42884();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m42877(String str) {
        return f56207.contains(m42878(str));
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m42878(String str) {
        if (str.startsWith("/sdcard/")) {
            str = C17853.f53287 + str.substring(7);
        }
        while (str.length() > 1 && str.endsWith("/")) {
            str = C17073.m38720(1, 0, str);
        }
        return str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42875(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (m42880()) {
            C24104.m53360(ApplicationC21448.f67649, "smhf", false);
        }
        HashSet hashSet = new HashSet(f56207);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(m42878((String) it.next()));
        }
        m42874(hashSet);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m42872() {
        return m42873(f56207);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m42885(String str) {
        m42874(m42881(str));
    }

    /* JADX INFO: renamed from: ܽ */
    public static HashSet m42881(String str) {
        HashSet hashSet = new HashSet();
        for (String str2 : str.split("\n")) {
            if (str2.startsWith("/")) {
                hashSet.add(m42878(str2));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42874(HashSet hashSet) {
        String strM42873 = m42873((Set) hashSet);
        InterfaceC14770 interfaceC14770Edit = ApplicationC21448.f67649.edit();
        if (strM42873.endsWith("\n")) {
            strM42873 = C17073.m38720(1, 0, strM42873);
        }
        interfaceC14770Edit.putString("mhf", strM42873).apply();
        f56207 = hashSet;
        m42884();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m42884() {
        if (C12799.m29347()) {
            C17127.m38756();
        } else {
            C7050.m16212(new RunnableC17202(0));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m42873(Set set) {
        ArrayList arrayList = new ArrayList(set);
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append('\n');
        }
        return sb.toString();
    }
}
