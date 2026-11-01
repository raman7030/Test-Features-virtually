package p067l;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.۠᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7CF */
/* JADX INFO: loaded from: classes3.dex */
public final class C10334 {

    /* JADX INFO: renamed from: ܽ */
    public static final ScheduledExecutorService f28618 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC21064());

    /* JADX INFO: renamed from: ᩳ */
    public static final C10334 f28619 = new C10334();

    /* JADX INFO: renamed from: ֫ */
    public final AtomicLong f28620 = new AtomicLong(1);

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f28621 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ֫ */
    public static C10334 m23948() {
        return f28619;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23953(int i, String str) {
        C3628 c3628 = (C3628) this.f28621.get(str);
        if (c3628 == null) {
            return;
        }
        synchronized (c3628) {
            c3628.f7539 = i;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23956(String str, AbstractC21614 abstractC21614, C20323 c20323) {
        boolean z;
        C3628 c3628 = (C3628) this.f28621.get(str);
        if (c3628 == null) {
            return;
        }
        synchronized (c3628) {
            c3628.f7543 = abstractC21614;
            c3628.f7530 = c20323;
            z = c3628.f7521;
        }
        if (z) {
            if (c20323 != null) {
                c20323.m45881((String) null);
            }
            abstractC21614.cancel();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23954(String str, AbstractC21614 abstractC21614) {
        C3628 c3628 = (C3628) this.f28621.get(str);
        if (c3628 == null) {
            return;
        }
        synchronized (c3628) {
            if (c3628.f7529) {
                return;
            }
            c3628.f7523 = m23945(abstractC21614.m13493());
            c3628.f7519 = m23945(abstractC21614.m13470());
            c3628.f7520 = abstractC21614.m13475();
            c3628.f7534 = m23945((CharSequence) abstractC21614.mo14165());
            c3628.f7544 = abstractC21614.m48820();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m23957(final String str, final String str2, String str3, C23568 c23568, C23568 c23569, C20323 c20323, boolean z) {
        C3628 c3628 = (C3628) this.f28621.get(str);
        boolean z2 = false;
        if (c3628 == null) {
            return false;
        }
        synchronized (c3628) {
            if (!c3628.f7529 && !c3628.f7521) {
                c3628.f7530 = c20323;
                m23949(c3628, true);
                c3628.f7541 = "waiting_conflict";
                c3628.f7536 = str2;
                c3628.f7533 = m23945((CharSequence) str3);
                c3628.f7538 = c23568;
                c3628.f7531 = c23569;
                c3628.f7545 = c20323.m45882();
                boolean z3 = C23219.m51754() && z;
                c3628.f7527 = z3;
                if (z3 && "replace".equals(c3628.f7545) && c20323.m45880()) {
                    z2 = true;
                }
                c3628.f7537 = z2;
                c3628.f7542 = f28618.schedule(new Callable() { // from class: l.֡᩵ۢ
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(this.f5150.m23950(str, str2));
                    }
                }, 300000L, TimeUnit.MILLISECONDS);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m23958(String str, String str2, String str3, boolean z, boolean z2) {
        C3628 c3628 = (C3628) this.f28621.get(str);
        boolean z3 = false;
        if (c3628 == null) {
            return false;
        }
        synchronized (c3628) {
            if (!c3628.f7529 && !TextUtils.isEmpty(c3628.f7536) && TextUtils.equals(c3628.f7536, str2) && c3628.f7530 != null && c3628.f7530.m45883(str2)) {
                C20323 c20323 = c3628.f7530;
                if (z2 && c3628.f7527) {
                    z3 = true;
                }
                m23949(c3628, true);
                c3628.f7541 = "running";
                return c20323.m45879(str2, str3, z, z3);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23955(String str, AbstractC21614 abstractC21614, C18736 c18736, ArrayList arrayList, ArrayList arrayList2, List list, List list2) {
        String str2;
        List arrayList3;
        List arrayList4;
        List arrayList5;
        C3628 c3628 = (C3628) this.f28621.get(str);
        if (c3628 == null) {
            return;
        }
        synchronized (c3628) {
            m23949(c3628, false);
            c3628.f7529 = true;
            if (c18736.m42773()) {
                str2 = "success";
            } else {
                str2 = c18736.m42771() ? "cancelled" : "failure";
            }
            c3628.f7541 = str2;
            c3628.f7523 = m23945(abstractC21614.m13493());
            c3628.f7519 = m23945(abstractC21614.m13470());
            c3628.f7520 = abstractC21614.m13475();
            c3628.f7534 = m23945((CharSequence) abstractC21614.mo14165());
            c3628.f7544 = abstractC21614.m48820();
            c3628.f7535 = c18736.m42772() ? m23945((CharSequence) c18736.m42769()) : "";
            if (arrayList.isEmpty()) {
                arrayList3 = Collections.EMPTY_LIST;
            } else {
                arrayList3 = new ArrayList(arrayList);
            }
            c3628.f7528 = arrayList3;
            if (arrayList2.isEmpty()) {
                arrayList4 = Collections.EMPTY_LIST;
            } else {
                arrayList4 = new ArrayList(arrayList2);
            }
            c3628.f7524 = arrayList4;
            c3628.f7526 = m23947(list);
            if (list2 == null || list2.isEmpty()) {
                arrayList5 = Collections.EMPTY_LIST;
            } else {
                arrayList5 = new ArrayList(list2);
            }
            c3628.f7540 = arrayList5;
            c3628.f7522 = SystemClock.elapsedRealtime();
            c3628.f7543 = null;
            c3628.f7530 = null;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m23960(String str) {
        return m23950(str, (String) null);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m23950(String str, String str2) {
        C3628 c3628 = (C3628) this.f28621.get(str);
        if (c3628 == null) {
            return false;
        }
        synchronized (c3628) {
            if (c3628.f7529) {
                return true;
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.equals(c3628.f7536, str2)) {
                return true;
            }
            c3628.f7521 = true;
            AbstractC5996 abstractC5996 = c3628.f7543;
            int i = c3628.f7539;
            C20323 c20323 = c3628.f7530;
            m23949(c3628, true);
            c3628.f7541 = "running";
            if (c20323 != null) {
                c20323.m45881(str2);
            }
            if (abstractC5996 == null) {
                AbstractC5996 abstractC5996M37942 = C16723.m37942(i);
                if (abstractC5996M37942 != null) {
                    abstractC5996M37942.cancel();
                }
                return true;
            }
            abstractC5996.cancel();
            return true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23949(C3628 c3628, boolean z) {
        if (c3628.f7542 != null) {
            c3628.f7542.cancel(false);
            c3628.f7542 = null;
        }
        c3628.f7536 = "";
        c3628.f7533 = "";
        C23568 c23568 = C23568.f75044;
        c3628.f7538 = c23568;
        c3628.f7531 = c23568;
        c3628.f7545 = "";
        c3628.f7527 = false;
        c3628.f7537 = false;
        if (!c3628.f7529 && z && "waiting_conflict".equals(c3628.f7541)) {
            c3628.f7541 = "running";
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m23952(String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ConcurrentMapC12768 concurrentMapC12768 = this.f28621;
        C7480.removeIf(concurrentMapC12768.entrySet(), new C7652(this, jElapsedRealtime));
        String str2 = "ft-" + this.f28620.getAndIncrement();
        concurrentMapC12768.put(str2, new C3628(str2, str));
        return str2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final LinkedHashMap m23959(String str) {
        LinkedHashMap linkedHashMapM6864;
        C7480.removeIf(this.f28621.entrySet(), new C7652(this, SystemClock.elapsedRealtime()));
        C3628 c3628 = (C3628) this.f28621.get(str);
        if (c3628 == null) {
            return null;
        }
        synchronized (c3628) {
            linkedHashMapM6864 = C3628.m6864(c3628);
        }
        return linkedHashMapM6864;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m23951(C10334 c10334, long j, Map.Entry entry) {
        boolean z;
        C3628 c3628 = (C3628) entry.getValue();
        synchronized (c3628) {
            z = c3628.f7529 && j - c3628.f7522 > 300000;
            if (z) {
                m23949(c3628, false);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m23945(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m23947(List list) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (map != null && !TextUtils.isEmpty((CharSequence) map.get("from")) && !TextUtils.isEmpty((CharSequence) map.get("to"))) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("from", (String) map.get("from"));
                linkedHashMap.put("to", (String) map.get("to"));
                arrayList.add(linkedHashMap);
            }
        }
        return arrayList.isEmpty() ? Collections.EMPTY_LIST : arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static LinkedHashMap m23946(C23568 c23568) {
        if (c23568 == null || !c23568.m52382()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("size", Long.valueOf(c23568.m52380()));
        linkedHashMap.put("time", Long.valueOf(c23568.m52381()));
        return linkedHashMap;
    }
}
