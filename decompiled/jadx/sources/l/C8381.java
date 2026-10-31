package l;

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
public final class C8381 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final ScheduledExecutorService f25705 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC19671());

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C8381 f25706 = new C8381();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicLong f25707 = new AtomicLong(1);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f25708 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8381 m21977() {
        return f25706;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21982(int i, String str) {
        C1325 c1325 = (C1325) this.f25708.get(str);
        if (c1325 == null) {
            return;
        }
        synchronized (c1325) {
            c1325.f4769 = i;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21985(String str, AbstractC20250 abstractC20250, C18891 c18891) {
        boolean z;
        C1325 c1325 = (C1325) this.f25708.get(str);
        if (c1325 == null) {
            return;
        }
        synchronized (c1325) {
            c1325.f4773 = abstractC20250;
            c1325.f4760 = c18891;
            z = c1325.f4751;
        }
        if (z) {
            if (c18891 != null) {
                c18891.m43615((String) null);
            }
            abstractC20250.cancel();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21983(String str, AbstractC20250 abstractC20250) {
        C1325 c1325 = (C1325) this.f25708.get(str);
        if (c1325 == null) {
            return;
        }
        synchronized (c1325) {
            if (c1325.f4759) {
                return;
            }
            c1325.f4753 = m21974(abstractC20250.m11557());
            c1325.f4749 = m21974(abstractC20250.m11534());
            c1325.f4750 = abstractC20250.m11539();
            c1325.f4764 = m21974((CharSequence) abstractC20250.mo12244());
            c1325.f4774 = abstractC20250.m46499();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21986(final String str, final String str2, String str3, C22306 c22306, C22306 c22307, C18891 c18891, boolean z) {
        C1325 c1325 = (C1325) this.f25708.get(str);
        boolean z2 = false;
        if (c1325 == null) {
            return false;
        }
        synchronized (c1325) {
            if (!c1325.f4759 && !c1325.f4751) {
                c1325.f4760 = c18891;
                m21978(c1325, true);
                c1325.f4771 = "waiting_conflict";
                c1325.f4766 = str2;
                c1325.f4763 = m21974((CharSequence) str3);
                c1325.f4768 = c22306;
                c1325.f4761 = c22307;
                c1325.f4775 = c18891.m43616();
                boolean z3 = C21939.m49417() && z;
                c1325.f4757 = z3;
                if (z3 && "replace".equals(c1325.f4775) && c18891.m43614()) {
                    z2 = true;
                }
                c1325.f4767 = z2;
                c1325.f4772 = f25705.schedule(new Callable() { // from class: l.֡᩵ۢ
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(this.f2377.m21979(str, str2));
                    }
                }, 300000L, TimeUnit.MILLISECONDS);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21987(String str, String str2, String str3, boolean z, boolean z2) {
        C1325 c1325 = (C1325) this.f25708.get(str);
        boolean z3 = false;
        if (c1325 == null) {
            return false;
        }
        synchronized (c1325) {
            if (!c1325.f4759 && !TextUtils.isEmpty(c1325.f4766) && TextUtils.equals(c1325.f4766, str2) && c1325.f4760 != null && c1325.f4760.m43617(str2)) {
                C18891 c18891 = c1325.f4760;
                if (z2 && c1325.f4757) {
                    z3 = true;
                }
                m21978(c1325, true);
                c1325.f4771 = "running";
                return c18891.m43613(str2, str3, z, z3);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21984(String str, AbstractC20250 abstractC20250, C17222 c17222, ArrayList arrayList, ArrayList arrayList2, List list, List list2) {
        String str2;
        List arrayList3;
        List arrayList4;
        List arrayList5;
        C1325 c1325 = (C1325) this.f25708.get(str);
        if (c1325 == null) {
            return;
        }
        synchronized (c1325) {
            m21978(c1325, false);
            c1325.f4759 = true;
            if (c17222.m40526()) {
                str2 = "success";
            } else {
                str2 = c17222.m40524() ? "cancelled" : "failure";
            }
            c1325.f4771 = str2;
            c1325.f4753 = m21974(abstractC20250.m11557());
            c1325.f4749 = m21974(abstractC20250.m11534());
            c1325.f4750 = abstractC20250.m11539();
            c1325.f4764 = m21974((CharSequence) abstractC20250.mo12244());
            c1325.f4774 = abstractC20250.m46499();
            c1325.f4765 = c17222.m40525() ? m21974((CharSequence) c17222.m40522()) : "";
            if (arrayList.isEmpty()) {
                arrayList3 = Collections.EMPTY_LIST;
            } else {
                arrayList3 = new ArrayList(arrayList);
            }
            c1325.f4758 = arrayList3;
            if (arrayList2.isEmpty()) {
                arrayList4 = Collections.EMPTY_LIST;
            } else {
                arrayList4 = new ArrayList(arrayList2);
            }
            c1325.f4754 = arrayList4;
            c1325.f4756 = m21976(list);
            if (list2 == null || list2.isEmpty()) {
                arrayList5 = Collections.EMPTY_LIST;
            } else {
                arrayList5 = new ArrayList(list2);
            }
            c1325.f4770 = arrayList5;
            c1325.f4752 = SystemClock.elapsedRealtime();
            c1325.f4773 = null;
            c1325.f4760 = null;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m21989(String str) {
        return m21979(str, (String) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m21979(String str, String str2) {
        C1325 c1325 = (C1325) this.f25708.get(str);
        if (c1325 == null) {
            return false;
        }
        synchronized (c1325) {
            if (c1325.f4759) {
                return true;
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.equals(c1325.f4766, str2)) {
                return true;
            }
            c1325.f4751 = true;
            AbstractC3817 abstractC3817 = c1325.f4773;
            int i = c1325.f4769;
            C18891 c18891 = c1325.f4760;
            m21978(c1325, true);
            c1325.f4771 = "running";
            if (c18891 != null) {
                c18891.m43615(str2);
            }
            if (abstractC3817 == null) {
                AbstractC3817 abstractC3817M35784 = C15104.m35784(i);
                if (abstractC3817M35784 != null) {
                    abstractC3817M35784.cancel();
                }
                return true;
            }
            abstractC3817.cancel();
            return true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21978(C1325 c1325, boolean z) {
        if (c1325.f4772 != null) {
            c1325.f4772.cancel(false);
            c1325.f4772 = null;
        }
        c1325.f4766 = "";
        c1325.f4763 = "";
        C22306 c22306 = C22306.f72317;
        c1325.f4768 = c22306;
        c1325.f4761 = c22306;
        c1325.f4775 = "";
        c1325.f4757 = false;
        c1325.f4767 = false;
        if (!c1325.f4759 && z && "waiting_conflict".equals(c1325.f4771)) {
            c1325.f4771 = "running";
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m21981(String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ConcurrentMapC10942 concurrentMapC10942 = this.f25708;
        C5378.removeIf(concurrentMapC10942.entrySet(), new C5559(this, jElapsedRealtime));
        String str2 = "ft-" + this.f25707.getAndIncrement();
        concurrentMapC10942.put(str2, new C1325(str2, str));
        return str2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m21988(String str) {
        LinkedHashMap linkedHashMapM4632;
        C5378.removeIf(this.f25708.entrySet(), new C5559(this, SystemClock.elapsedRealtime()));
        C1325 c1325 = (C1325) this.f25708.get(str);
        if (c1325 == null) {
            return null;
        }
        synchronized (c1325) {
            linkedHashMapM4632 = C1325.m4632(c1325);
        }
        return linkedHashMapM4632;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m21980(C8381 c8381, long j, Map.Entry entry) {
        boolean z;
        C1325 c1325 = (C1325) entry.getValue();
        synchronized (c1325) {
            z = c1325.f4759 && j - c1325.f4752 > 300000;
            if (z) {
                m21978(c1325, false);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m21974(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m21976(List list) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m21975(C22306 c22306) {
        if (c22306 == null || !c22306.m50052()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("size", Long.valueOf(c22306.m50050()));
        linkedHashMap.put("time", Long.valueOf(c22306.m50051()));
        return linkedHashMap;
    }
}
