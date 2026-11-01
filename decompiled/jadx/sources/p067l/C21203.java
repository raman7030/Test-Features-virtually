package p067l;

import android.os.SystemClock;
import android.text.TextUtils;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.R;
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
public final class C21203 {

    /* JADX INFO: renamed from: ܽ */
    public final C5109 f66665;

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f66664 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ֫ */
    public final AtomicLong f66663 = new AtomicLong(1);

    public C21203(C5109 c5109) {
        this.f66665 = c5109;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C9802 m47909(C17571 c17571) {
        JSONObject jSONObjectM19683 = C8461.m19683(c17571);
        C9802 c9802 = new C9802();
        c9802.f27122 = C8461.m19685(jSONObjectM19683);
        c9802.f27121 = C8461.m19689(jSONObjectM19683, "basePath");
        return c9802;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10196 m47910(C17571 c17571) {
        final AbstractC23214 c3096;
        final long jUptimeMillis = SystemClock.uptimeMillis();
        ConcurrentMapC12768 concurrentMapC12768 = this.f66664;
        C7480.removeIf(concurrentMapC12768.entrySet(), new Predicate() { // from class: l.֡֡ۢ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m3394or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((AbstractC23214) ((Map.Entry) obj).getValue()).m51745(jUptimeMillis);
            }
        });
        EnumC6173 enumC6173M39993 = c17571.m39993();
        boolean zEquals = EnumC6173.POST.equals(enumC6173M39993);
        C5109 c5109 = this.f66665;
        if (!zEquals) {
            if (EnumC6173.GET.equals(enumC6173M39993)) {
                String strM42479 = C18658.m42479(c17571, "taskId");
                if (TextUtils.isEmpty(strM42479)) {
                    EnumC3490 enumC3490 = EnumC3490.BAD_REQUEST;
                    Object[] objArr = {"taskId"};
                    c5109.getClass();
                    return C5109.m10885(enumC3490, C7050.m16203(R.string.MT_Protector, objArr));
                }
                AbstractC23214 abstractC23214 = (AbstractC23214) concurrentMapC12768.get(strM42479);
                if (abstractC23214 == null) {
                    EnumC3490 enumC3491 = EnumC3490.NOT_FOUND;
                    c5109.getClass();
                    return C5109.m10885(enumC3491, C7050.m16203(R.string.MT_Protector, new Object[0]));
                }
                LinkedHashMap linkedHashMapM51743 = abstractC23214.m51743();
                c5109.getClass();
                return C5109.m10884(linkedHashMapM51743);
            }
            if (!EnumC6173.DELETE.equals(enumC6173M39993)) {
                EnumC3490 enumC3492 = EnumC3490.METHOD_NOT_ALLOWED;
                c5109.getClass();
                return C5109.m10885(enumC3492, C7050.m16203(R.string.MT_Protector, new Object[0]));
            }
            String strM424710 = C18658.m42479(c17571, "taskId");
            if (TextUtils.isEmpty(strM424710)) {
                EnumC3490 enumC3493 = EnumC3490.BAD_REQUEST;
                Object[] objArr2 = {"taskId"};
                c5109.getClass();
                return C5109.m10885(enumC3493, C7050.m16203(R.string.MT_Protector, objArr2));
            }
            AbstractC23214 abstractC23215 = (AbstractC23214) concurrentMapC12768.remove(strM424710);
            if (abstractC23215 == null) {
                EnumC3490 enumC3494 = EnumC3490.NOT_FOUND;
                c5109.getClass();
                return C5109.m10885(enumC3494, C7050.m16203(R.string.MT_Protector, new Object[0]));
            }
            abstractC23215.m51746();
            Map map = Collections.EMPTY_MAP;
            c5109.getClass();
            return C5109.m10884(map);
        }
        try {
            C9802 c9802M47909 = m47909(c17571);
            ArrayList arrayList = c9802M47909.f27122;
            if (arrayList == null || arrayList.isEmpty()) {
                EnumC3490 enumC3495 = EnumC3490.BAD_REQUEST;
                Object[] objArr3 = {"paths"};
                c5109.getClass();
                return C5109.m10885(enumC3495, C7050.m16203(R.string.MT_Protector, objArr3));
            }
            if (c9802M47909.f27122.size() > 1 && TextUtils.isEmpty(c9802M47909.f27121)) {
                EnumC3490 enumC3496 = EnumC3490.BAD_REQUEST;
                Object[] objArr4 = {"basePath"};
                c5109.getClass();
                return C5109.m10885(enumC3496, C7050.m16203(R.string.MT_Protector, objArr4));
            }
            ArrayList arrayList2 = new ArrayList(c9802M47909.f27122.size());
            Iterator it = c9802M47909.f27122.iterator();
            while (it.hasNext()) {
                C11450 c11450 = (C11450) C4744.f10749.mo9709((String) it.next());
                if (c11450 == null) {
                    c11450 = null;
                }
                if (c11450 == null || !(c11450.mo39144() || c11450.mo26445().mo25094())) {
                    EnumC3490 enumC3497 = EnumC3490.NOT_FOUND;
                    c5109.getClass();
                    return C5109.m10885(enumC3497, C7050.m16203(R.string.MT_Protector, new Object[0]));
                }
                arrayList2.add(c11450);
            }
            if (arrayList2.size() == 1 && ((C11450) arrayList2.get(0)).mo39135()) {
                C11450 c11451 = (C11450) arrayList2.get(0);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("done", Boolean.TRUE);
                LinkedHashMap linkedHashMapM47906 = m47906(c11451);
                long size = c11451.getSize();
                long jMo39145 = c11451.mo39145();
                if (jMo39145 == -1 || jMo39145 == size) {
                    linkedHashMapM47906.put("sizeBytes", Long.valueOf(size));
                } else {
                    linkedHashMapM47906.put("logicalSizeBytes", Long.valueOf(size));
                    linkedHashMapM47906.put("actualSizeBytes", Long.valueOf(jMo39145));
                }
                m47908(linkedHashMapM47906, c11451);
                linkedHashMap.put("property", linkedHashMapM47906);
                c5109.getClass();
                return C5109.m10884(linkedHashMap);
            }
            String str = "fp-" + this.f66663.getAndIncrement();
            if (arrayList2.size() == 1) {
                C11450 c11452 = (C11450) arrayList2.get(0);
                LinkedHashMap linkedHashMapM47907 = m47906(c11452);
                linkedHashMapM47907.put("sizeBytes", 0L);
                m47908(linkedHashMapM47907, c11452);
                linkedHashMapM47907.put("fileCount", 0);
                linkedHashMapM47907.put("folderCount", 0);
                c3096 = new C7120(this, str, linkedHashMapM47907, c11452);
            } else {
                String str2 = c9802M47909.f27121;
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
                    arrayList3.add(((C11450) it2.next()).getName());
                }
                linkedHashMap2.put("names", arrayList3);
                linkedHashMap2.put("parent", strSubstring);
                linkedHashMap2.put("sizeBytes", 0L);
                linkedHashMap2.put("fileCount", 0);
                linkedHashMap2.put("folderCount", 0);
                c3096 = new C3096(this, str, linkedHashMap2, arrayList2);
            }
            LinkedHashMap linkedHashMapM51744 = c3096.m51743();
            concurrentMapC12768.put(str, c3096);
            C4081.f8987.execute(new Runnable() { // from class: l.ܶ֡ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC23214.m51740(c3096);
                }
            });
            c5109.getClass();
            return C5109.m10884(linkedHashMapM51744);
        } catch (IOException | C16900 | C24554 unused) {
            EnumC3490 enumC3498 = EnumC3490.BAD_REQUEST;
            c5109.getClass();
            return C5109.m10885(enumC3498, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static LinkedHashMap m47906(C11450 c11450) {
        String strM16224;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("mode", c11450.isDirectory() ? "single-folder" : "single-file");
        linkedHashMap.put("name", c11450.getName());
        linkedHashMap.put("parent", c11450.getParent());
        if (c11450.mo39144()) {
            strM16224 = C7050.m16224(R.string.MT_Protector);
        } else {
            strM16224 = C7050.m16224(c11450.isDirectory() ? R.string.MT_Protector : R.string.MT_Protector);
        }
        linkedHashMap.put("typeLabel", strM16224);
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    /* JADX INFO: renamed from: ֫ */
    public static void m47908(LinkedHashMap linkedHashMap, C11450 c11450) {
        C18028 c18028Mo26440;
        String path;
        linkedHashMap.put("timeLabel", C18794.m42827(c11450.getTime()));
        AbstractC17043 abstractC17043Mo26445 = c11450.mo26445();
        if (!c11450.isDirectory() || !c11450.m26447()) {
            if (C11450.m26439(c11450.mo26440())) {
                if (!abstractC17043Mo26445.mo37343()) {
                    try {
                        if (abstractC17043Mo26445 instanceof C13672) {
                            path = ((C13672) abstractC17043Mo26445).m31070();
                        } else {
                            path = c11450.getPath();
                        }
                        c11450.m26441(new C18028(C21759.m49047(path)));
                        c18028Mo26440 = c11450.mo26440();
                        linkedHashMap.put("permissionsLabel", c18028Mo26440.m41067().toString());
                        if (!TextUtils.isEmpty(c18028Mo26440.m41063())) {
                            linkedHashMap.put("ownerLabel", c18028Mo26440.m41063());
                        }
                        if (!TextUtils.isEmpty(c18028Mo26440.m41059())) {
                            linkedHashMap.put("groupLabel", c18028Mo26440.m41059());
                        }
                    } catch (IOException | RuntimeException unused) {
                    }
                }
            } else {
                c18028Mo26440 = c11450.mo26440();
                linkedHashMap.put("permissionsLabel", c18028Mo26440.m41067().toString());
                if (!TextUtils.isEmpty(c18028Mo26440.m41063())) {
                    linkedHashMap.put("ownerLabel", c18028Mo26440.m41063());
                }
                if (!TextUtils.isEmpty(c18028Mo26440.m41059())) {
                    linkedHashMap.put("groupLabel", c18028Mo26440.m41059());
                }
            }
        }
        if (c11450.mo39144()) {
            linkedHashMap.put("linkPath", c11450.mo39143());
        }
    }
}
