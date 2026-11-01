package p067l;

import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩷᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q78Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C22521 {

    /* JADX INFO: renamed from: ֫ */
    public final C17384 f71016;

    /* JADX INFO: renamed from: ۧ */
    public final C12107 f71017;

    public C22521(C10371 c10371, C13480 c13480, C17384 c17384, C12107 c12107) {
        this.f71016 = c17384;
        this.f71017 = c12107;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C21377 m50476(C16484 c16484, C13803 c13803) throws C5276 {
        ArrayList arrayList = new ArrayList();
        String str = c13803.f39001;
        int i = c13803.f39002;
        int i2 = 0;
        for (C15554 c15554 : this.f71016.m39601(c16484, str)) {
            if (c15554.f44436.startsWith(c13803.f39007)) {
                if (i2 >= i && arrayList.size() < c13803.f39003) {
                    arrayList.add(c15554);
                }
                i2++;
            }
        }
        int size = arrayList.size() + i;
        C21377 c21377 = new C21377(c16484.f48416, "zip_entries", c13803.f39007, arrayList.size(), i2, c13803.f39003, size < i2, size, null, null, null, 0);
        c21377.f67381.addAll(arrayList);
        try {
            c21377.f67380.putAll(C5401.m11855(c16484.f48414.m38684("cache"), c16484.f48407, c16484.f48428, arrayList));
            return c21377;
        } catch (IOException unused) {
            throw C19553.m44408(c16484.f48427, c16484.f48412);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21377 m50474(C16484 c16484, C13803 c13803) {
        ArrayList<C19160> arrayListM39580;
        String str = c13803.f39007;
        String strReplace = str == null ? "" : str.replace('.', '/');
        ArrayList arrayList = new ArrayList();
        C17384 c17384 = this.f71016;
        String str2 = c13803.f39001;
        synchronized (c17384) {
            arrayListM39580 = c17384.m39580(c16484, str2, false, (C17502) null);
        }
        int i = 0;
        for (C19160 c19160 : arrayListM39580) {
            if (!strReplace.isEmpty()) {
                String strM37402 = C16477.m37402(c19160.f57226);
                String strM45078 = C19831.m45078(strM37402);
                if (strM37402.startsWith(strReplace) || strM45078.replace('.', '/').startsWith(strReplace)) {
                }
            }
            if (i >= c13803.f39002 && arrayList.size() < c13803.f39003) {
                C9952 c9952M39584 = this.f71016.m39584(c16484, c13803.f39001, c19160);
                int i2 = 0;
                for (InterfaceC5815 interfaceC5815 : c9952M39584.getFields()) {
                    i2++;
                }
                int i3 = 0;
                for (InterfaceC19897 interfaceC19897 : c9952M39584.getMethods()) {
                    i3++;
                }
                String type = c9952M39584.getType();
                arrayList.add(new C24208(type, i2, i3, C19831.m45078(type)));
            }
            i++;
        }
        int size = c13803.f39002 + arrayList.size();
        C21377 c21377 = new C21377(c16484.f48416, "dex_classes", c13803.f39007, arrayList.size(), i, c13803.f39003, size < i, size, null, null, null, 0);
        c21377.f67376.addAll(arrayList);
        return c21377;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21377 m50475(C16484 c16484, C13803 c13803, C17502 c17502) {
        String str = c13803.f38999;
        int i = c13803.f39004;
        C17147 c17147M39598 = this.f71016.m39598(c16484, c13803.f39001, str, c17502);
        C5749 c5749M12802 = C5749.m12802(str, c17147M39598.f51074);
        LinkedHashMap linkedHashMap = c17147M39598.f51073;
        LinkedHashMap linkedHashMap2 = c17147M39598.f51072;
        ArrayList<C21843> arrayList = c5749M12802.f14099;
        for (C21843 c21843 : arrayList) {
            String str2 = c21843.f68740;
            String str3 = c21843.f68741;
            if (AbstractC0213e.f995s.equals(str2)) {
                C7090 c7090 = (C7090) linkedHashMap.get(str3);
                if (c7090 != null) {
                    c21843.f68739 = c7090;
                }
            } else if ("field".equals(c21843.f68740)) {
                c21843.f68736 = (C23184) linkedHashMap2.get(str3);
            }
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        for (int i3 = i; i3 < size && i2 < c13803.f39005; i3++) {
            C21843 c21844 = (C21843) arrayList.get(i3);
            if ("field".equals(c21844.f68740)) {
                arrayList2.add(c21844);
            } else {
                arrayList3.add(c21844);
            }
            i2++;
        }
        int i4 = i + i2;
        C21377 c21377 = new C21377(c16484.f48416, "dex_class_outline", "", i2, size, c13803.f39005, i4 < size, 0, str, C19831.m45078(str), c5749M12802, i4);
        c21377.f67377.addAll(arrayList2);
        c21377.f67384.addAll(arrayList3);
        return c21377;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C21377 m50477(C16484 c16484, C13803 c13803) throws C5276 {
        String str = c13803.f39001;
        C12107 c12107 = this.f71017;
        C17384 c17384 = this.f71016;
        C10962 c10962M28001 = c12107.m28001(c16484, c17384, str);
        try {
            String str2 = c13803.f39007;
            int i = c13803.f39002;
            int i2 = c13803.f39003;
            HashSet hashSet = new HashSet();
            Iterator it = c17384.m39601(c16484, str).iterator();
            while (it.hasNext()) {
                hashSet.add(((C15554) it.next()).f44436);
            }
            C8239 c8239M25275 = c10962M28001.m25275(i, i2, str2, hashSet);
            ArrayList arrayList = c8239M25275.f21831;
            C21377 c21377 = new C21377(c16484.f48416, "resource_table", c13803.f39007, arrayList.size(), c8239M25275.f21833, c13803.f39003, c8239M25275.f21830, c8239M25275.f21832, null, null, null, 0);
            c21377.f67371.addAll(arrayList);
            return c21377;
        } catch (C5276 e) {
            if (C17384.m39567(str)) {
                C12107.m27994(c16484, e);
            }
            throw e;
        }
    }
}
