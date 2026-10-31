package l;

import android.os.SystemClock;
import android.text.TextUtils;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩶֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BV */
/* JADX INFO: loaded from: classes4.dex */
public final class C19818 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2884 f64028;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f64027 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicLong f64026 = new AtomicLong(1);

    public C19818(C2884 c2884) {
        this.f64028 = c2884;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C7822 m45598(C15996 c15996) {
        JSONObject jSONObjectM17736 = C6411.m17736(c15996);
        C7822 c7822 = new C7822();
        c7822.f24206 = C6411.m17738(jSONObjectM17736);
        c7822.f24205 = C6411.m17742(jSONObjectM17736, "basePath");
        return c7822;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m45599(C15996 c15996) {
        final AbstractC21934 c0766;
        final long jUptimeMillis = SystemClock.uptimeMillis();
        ConcurrentMapC10942 concurrentMapC10942 = this.f64027;
        C5378.removeIf(concurrentMapC10942.entrySet(), new Predicate() { // from class: l.֡֡ۢ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((AbstractC21934) ((Map.Entry) obj).getValue()).m49408(jUptimeMillis);
            }
        });
        EnumC4003 enumC4003M37807 = c15996.m37807();
        boolean zEquals = EnumC4003.POST.equals(enumC4003M37807);
        C2884 c2884 = this.f64028;
        if (!zEquals) {
            if (EnumC4003.GET.equals(enumC4003M37807)) {
                String strM40234 = C17140.m40234(c15996, "taskId");
                if (TextUtils.isEmpty(strM40234)) {
                    EnumC1180 enumC1180 = EnumC1180.BAD_REQUEST;
                    Object[] objArr = {"taskId"};
                    c2884.getClass();
                    return C2884.m8818(enumC1180, C4925.m14306(R.string.MT_Protector, objArr));
                }
                AbstractC21934 abstractC21934 = (AbstractC21934) concurrentMapC10942.get(strM40234);
                if (abstractC21934 == null) {
                    EnumC1180 enumC1181 = EnumC1180.NOT_FOUND;
                    c2884.getClass();
                    return C2884.m8818(enumC1181, C4925.m14306(R.string.MT_Protector, new Object[0]));
                }
                LinkedHashMap linkedHashMapM49406 = abstractC21934.m49406();
                c2884.getClass();
                return C2884.m8817(linkedHashMapM49406);
            }
            if (!EnumC4003.DELETE.equals(enumC4003M37807)) {
                EnumC1180 enumC1182 = EnumC1180.METHOD_NOT_ALLOWED;
                c2884.getClass();
                return C2884.m8818(enumC1182, C4925.m14306(R.string.MT_Protector, new Object[0]));
            }
            String strM40235 = C17140.m40234(c15996, "taskId");
            if (TextUtils.isEmpty(strM40235)) {
                EnumC1180 enumC1183 = EnumC1180.BAD_REQUEST;
                Object[] objArr2 = {"taskId"};
                c2884.getClass();
                return C2884.m8818(enumC1183, C4925.m14306(R.string.MT_Protector, objArr2));
            }
            AbstractC21934 abstractC21935 = (AbstractC21934) concurrentMapC10942.remove(strM40235);
            if (abstractC21935 == null) {
                EnumC1180 enumC1184 = EnumC1180.NOT_FOUND;
                c2884.getClass();
                return C2884.m8818(enumC1184, C4925.m14306(R.string.MT_Protector, new Object[0]));
            }
            abstractC21935.m49409();
            Map map = Collections.EMPTY_MAP;
            c2884.getClass();
            return C2884.m8817(map);
        }
        try {
            C7822 c7822M45598 = m45598(c15996);
            ArrayList arrayList = c7822M45598.f24206;
            if (arrayList == null || arrayList.isEmpty()) {
                EnumC1180 enumC1185 = EnumC1180.BAD_REQUEST;
                Object[] objArr3 = {"paths"};
                c2884.getClass();
                return C2884.m8818(enumC1185, C4925.m14306(R.string.MT_Protector, objArr3));
            }
            if (c7822M45598.f24206.size() > 1 && TextUtils.isEmpty(c7822M45598.f24205)) {
                EnumC1180 enumC1186 = EnumC1180.BAD_REQUEST;
                Object[] objArr4 = {"basePath"};
                c2884.getClass();
                return C2884.m8818(enumC1186, C4925.m14306(R.string.MT_Protector, objArr4));
            }
            ArrayList arrayList2 = new ArrayList(c7822M45598.f24206.size());
            Iterator it = c7822M45598.f24206.iterator();
            while (it.hasNext()) {
                C9555 c9555 = (C9555) C2499.f7958.mo7638((String) it.next());
                if (c9555 == null) {
                    c9555 = null;
                }
                if (c9555 == null || !(c9555.mo36978() || c9555.mo24433().mo23120())) {
                    EnumC1180 enumC1187 = EnumC1180.NOT_FOUND;
                    c2884.getClass();
                    return C2884.m8818(enumC1187, C4925.m14306(R.string.MT_Protector, new Object[0]));
                }
                arrayList2.add(c9555);
            }
            if (arrayList2.size() == 1 && ((C9555) arrayList2.get(0)).mo36969()) {
                C9555 c9556 = (C9555) arrayList2.get(0);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("done", Boolean.TRUE);
                LinkedHashMap linkedHashMapM45595 = m45595(c9556);
                long size = c9556.getSize();
                long jMo36979 = c9556.mo36979();
                if (jMo36979 == -1 || jMo36979 == size) {
                    linkedHashMapM45595.put("sizeBytes", Long.valueOf(size));
                } else {
                    linkedHashMapM45595.put("logicalSizeBytes", Long.valueOf(size));
                    linkedHashMapM45595.put("actualSizeBytes", Long.valueOf(jMo36979));
                }
                m45597(linkedHashMapM45595, c9556);
                linkedHashMap.put("property", linkedHashMapM45595);
                c2884.getClass();
                return C2884.m8817(linkedHashMap);
            }
            String str = "fp-" + this.f64026.getAndIncrement();
            if (arrayList2.size() == 1) {
                C9555 c9557 = (C9555) arrayList2.get(0);
                LinkedHashMap linkedHashMapM45596 = m45595(c9557);
                linkedHashMapM45596.put("sizeBytes", 0L);
                m45597(linkedHashMapM45596, c9557);
                linkedHashMapM45596.put("fileCount", 0);
                linkedHashMapM45596.put("folderCount", 0);
                c0766 = new C5000(this, str, linkedHashMapM45596, c9557);
            } else {
                String str2 = c7822M45598.f24205;
                String strSubstring = "/";
                if (!TextUtils.isEmpty(str2) && !"/".equals(str2)) {
                    int length = str2.length();
                    while (length > 1 && str2.charAt(length - 1) == '/') {
                        length--;
                    }
                    strSubstring = str2.substring(0, length);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("mode", "multi");
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((C9555) it2.next()).getName());
                }
                linkedHashMap2.put("names", arrayList3);
                linkedHashMap2.put("parent", strSubstring);
                linkedHashMap2.put("sizeBytes", 0L);
                linkedHashMap2.put("fileCount", 0);
                linkedHashMap2.put("folderCount", 0);
                c0766 = new C0766(this, str, linkedHashMap2, arrayList2);
            }
            LinkedHashMap linkedHashMapM49407 = c0766.m49406();
            concurrentMapC10942.put(str, c0766);
            C1802.f6208.execute(new Runnable() { // from class: l.ܶ֡ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC21934.m49403(c0766);
                }
            });
            c2884.getClass();
            return C2884.m8817(linkedHashMapM49407);
        } catch (IOException | C15290 | C23344 unused) {
            EnumC1180 enumC1188 = EnumC1180.BAD_REQUEST;
            c2884.getClass();
            return C2884.m8818(enumC1188, C4925.m14306(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m45595(C9555 c9555) {
        String strM14327;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("mode", c9555.isDirectory() ? "single-folder" : "single-file");
        linkedHashMap.put("name", c9555.getName());
        linkedHashMap.put("parent", c9555.getParent());
        if (c9555.mo36978()) {
            strM14327 = C4925.m14327(R.string.MT_Protector);
        } else {
            strM14327 = C4925.m14327(c9555.isDirectory() ? R.string.MT_Protector : R.string.MT_Protector);
        }
        linkedHashMap.put("typeLabel", strM14327);
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45597(LinkedHashMap linkedHashMap, C9555 c9555) {
        C16477 c16477Mo24428;
        String path;
        linkedHashMap.put("timeLabel", C17283.m40576(c9555.getTime()));
        AbstractC15440 abstractC15440Mo24433 = c9555.mo24433();
        if (!c9555.isDirectory() || !c9555.m24435()) {
            if (C9555.m24427(c9555.mo24428())) {
                if (!abstractC15440Mo24433.mo35196()) {
                    try {
                        if (abstractC15440Mo24433 instanceof C11893) {
                            path = ((C11893) abstractC15440Mo24433).m29018();
                        } else {
                            path = c9555.getPath();
                        }
                        c9555.m24429(new C16477(C20402.m46724(path)));
                        c16477Mo24428 = c9555.mo24428();
                        linkedHashMap.put("permissionsLabel", c16477Mo24428.m38841().toString());
                        if (!TextUtils.isEmpty(c16477Mo24428.m38837())) {
                            linkedHashMap.put("ownerLabel", c16477Mo24428.m38837());
                        }
                        if (!TextUtils.isEmpty(c16477Mo24428.m38833())) {
                            linkedHashMap.put("groupLabel", c16477Mo24428.m38833());
                        }
                    } catch (IOException | RuntimeException unused) {
                    }
                }
            } else {
                c16477Mo24428 = c9555.mo24428();
                linkedHashMap.put("permissionsLabel", c16477Mo24428.m38841().toString());
                if (!TextUtils.isEmpty(c16477Mo24428.m38837())) {
                    linkedHashMap.put("ownerLabel", c16477Mo24428.m38837());
                }
                if (!TextUtils.isEmpty(c16477Mo24428.m38833())) {
                    linkedHashMap.put("groupLabel", c16477Mo24428.m38833());
                }
            }
        }
        if (c9555.mo36978()) {
            linkedHashMap.put("linkPath", c9555.mo36977());
        }
    }
}
