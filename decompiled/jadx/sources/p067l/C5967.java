package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.ۘۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AHS */
/* JADX INFO: loaded from: classes2.dex */
public final class C5967 {

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC17365 f14767;

    /* JADX INFO: renamed from: ܽ */
    public boolean f14768;

    /* JADX INFO: renamed from: ֫ */
    public final ConcurrentMapC12768 f14766 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ᩳ */
    public final ConcurrentMapC12768 f14769 = new ConcurrentMapC12768();

    public C5967(InterfaceC17365 interfaceC17365, boolean z) {
        this.f14767 = interfaceC17365;
        this.f14768 = z;
    }

    /* JADX INFO: renamed from: ܿ */
    private Object m13375(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis() % 100;
        ConcurrentMapC12768 concurrentMapC12768 = this.f14769;
        if (jCurrentTimeMillis == 0) {
            C7480.removeIf(concurrentMapC12768.entrySet(), new C10661());
        }
        return ((C4626) C19473.compute(concurrentMapC12768, str, new C11332())).f10375;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Map m13382(String str) {
        boolean z = this.f14768;
        String strM41972 = AbstractC18422.m41972(str);
        String lowerCase = z ? strM41972.toLowerCase() : strM41972;
        synchronized (m13375(lowerCase)) {
            Map map = (Map) this.f14766.get(lowerCase);
            if (map != null) {
                return map;
            }
            List listMo5645 = this.f14767.mo5645(strM41972);
            boolean z2 = this.f14768;
            if (z2 != z) {
                if (z2) {
                    strM41972 = strM41972.toLowerCase();
                }
                lowerCase = strM41972;
                z = z2;
            }
            return m13374(lowerCase, listMo5645, z);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private LinkedHashMap m13374(String str, List list, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String strMo5647 = this.f14767.mo5647(obj);
            if (z) {
                strMo5647 = strMo5647.toLowerCase();
            }
            if (!strMo5647.equals(".") && !strMo5647.equals("..")) {
                linkedHashMap.put(strMo5647, obj);
            }
        }
        this.f14766.put(str, linkedHashMap);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m13381(String str) {
        Object objM13376 = m13376(C11419.m26416(str), C11419.m26414(str));
        return objM13376 != null && this.f14767.mo5646(objM13376);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m13376(String str, String str2) {
        if (this.f14768) {
            str2 = str2.toLowerCase();
        }
        return m13382(str).get(str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13378(String str) {
        String strM41972 = AbstractC18422.m41972(str);
        if (this.f14768) {
            strM41972 = strM41972.toLowerCase();
        }
        synchronized (m13375(strM41972)) {
            this.f14766.remove(strM41972);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13377() {
        synchronized (this) {
            this.f14766.clear();
            this.f14769.clear();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13379(boolean z) {
        if (this.f14768 != z) {
            this.f14768 = z;
            m13377();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m13380(String str) {
        String strSubstring;
        String str2;
        String strM26416 = C11419.m26416(str);
        String strM26414 = C11419.m26414(str);
        if (strM26416 == null) {
            return str;
        }
        m13378(strM26416);
        if (m13376(strM26416, strM26414) != null) {
            int iLastIndexOf = strM26414.lastIndexOf(46);
            int i = 0;
            if (iLastIndexOf == -1) {
                strSubstring = "";
            } else {
                String strSubstring2 = strM26414.substring(0, iLastIndexOf);
                strSubstring = strM26414.substring(iLastIndexOf);
                strM26414 = strSubstring2;
            }
            Matcher matcher = AbstractC17043.f50422.matcher(strM26414);
            if (matcher.matches()) {
                try {
                    i = Integer.parseInt(matcher.group(2));
                    strM26414 = matcher.group(1);
                } catch (Exception unused) {
                }
            }
            String strM40053 = C17588.m40053(strM26414, " (");
            String strM48631 = C21466.m48631(MotionUtils.EASING_TYPE_FORMAT_END, strSubstring);
            do {
                i++;
                str2 = strM40053 + i + strM48631;
            } while (m13376(strM26416, str2) != null);
            strM26414 = str2;
        }
        return C17588.m40053(strM26416, strM26414);
    }
}
