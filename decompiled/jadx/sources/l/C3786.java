package l;

import com.google.android.material.motion.MotionUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.ۘۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AHS */
/* JADX INFO: loaded from: classes2.dex */
public final class C3786 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15779 f11961;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f11962;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f11960 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f11963 = new ConcurrentMapC10942();

    public C3786(InterfaceC15779 interfaceC15779, boolean z) {
        this.f11961 = interfaceC15779;
        this.f11962 = z;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private Object m11439(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis() % 100;
        ConcurrentMapC10942 concurrentMapC10942 = this.f11963;
        if (jCurrentTimeMillis == 0) {
            C5378.removeIf(concurrentMapC10942.entrySet(), new C8725());
        }
        return ((C2375) C17997.compute(concurrentMapC10942, str, new C9431())).f7584;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Map m11446(String str) {
        boolean z = this.f11962;
        String strM39731 = AbstractC16891.m39731(str);
        String lowerCase = z ? strM39731.toLowerCase() : strM39731;
        synchronized (m11439(lowerCase)) {
            Map map = (Map) this.f11960.get(lowerCase);
            if (map != null) {
                return map;
            }
            List listMo3326 = this.f11961.mo3326(strM39731);
            boolean z2 = this.f11962;
            if (z2 != z) {
                if (z2) {
                    strM39731 = strM39731.toLowerCase();
                }
                lowerCase = strM39731;
                z = z2;
            }
            return m11438(lowerCase, listMo3326, z);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private LinkedHashMap m11438(String str, List list, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String strMo3328 = this.f11961.mo3328(obj);
            if (z) {
                strMo3328 = strMo3328.toLowerCase();
            }
            if (!strMo3328.equals(".") && !strMo3328.equals("..")) {
                linkedHashMap.put(strMo3328, obj);
            }
        }
        this.f11960.put(str, linkedHashMap);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m11445(String str) {
        Object objM11440 = m11440(C9523.m24406(str), C9523.m24404(str));
        return objM11440 != null && this.f11961.mo3327(objM11440);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m11440(String str, String str2) {
        if (this.f11962) {
            str2 = str2.toLowerCase();
        }
        return m11446(str).get(str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11442(String str) {
        String strM39731 = AbstractC16891.m39731(str);
        if (this.f11962) {
            strM39731 = strM39731.toLowerCase();
        }
        synchronized (m11439(strM39731)) {
            this.f11960.remove(strM39731);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11441() {
        synchronized (this) {
            this.f11960.clear();
            this.f11963.clear();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11443(boolean z) {
        if (this.f11962 != z) {
            this.f11962 = z;
            m11441();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m11444(String str) {
        String strSubstring;
        String str2;
        String strM24406 = C9523.m24406(str);
        String strM24404 = C9523.m24404(str);
        if (strM24406 == null) {
            return str;
        }
        m11442(strM24406);
        if (m11440(strM24406, strM24404) != null) {
            int iLastIndexOf = strM24404.lastIndexOf(46);
            int i = 0;
            if (iLastIndexOf == -1) {
                strSubstring = "";
            } else {
                String strSubstring2 = strM24404.substring(0, iLastIndexOf);
                strSubstring = strM24404.substring(iLastIndexOf);
                strM24404 = strSubstring2;
            }
            Matcher matcher = AbstractC15440.f47293.matcher(strM24404);
            if (matcher.matches()) {
                try {
                    i = Integer.parseInt(matcher.group(2));
                    strM24404 = matcher.group(1);
                } catch (Exception unused) {
                }
            }
            String strM37867 = C16014.m37867(strM24404, " (");
            String strM46315 = C20094.m46315(MotionUtils.EASING_TYPE_FORMAT_END, strSubstring);
            do {
                i++;
                str2 = strM37867 + i + strM46315;
            } while (m11440(strM24406, str2) != null);
            strM24404 = str2;
        }
        return C16014.m37867(strM24406, strM24404);
    }
}
