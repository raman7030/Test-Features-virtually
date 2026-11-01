package p067l;

import com.umeng.analytics.pro.C0708d;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ۘ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6139 {

    /* JADX INFO: renamed from: b */
    public static final CopyOnWriteArrayList f15400b;

    /* JADX INFO: renamed from: c */
    public static final ConcurrentMapC12768 f15401c;

    /* JADX INFO: renamed from: d */
    public static volatile Set f15402d;

    /* JADX INFO: renamed from: a */
    public final Set f15403a;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f15400b = copyOnWriteArrayList;
        f15401c = new ConcurrentMapC12768(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new C11763(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static C17537 m13927a(String str) {
        C12826.requireNonNull(str, "zoneId");
        ConcurrentMapC12768 concurrentMapC12768 = f15401c;
        C6139 c6139 = (C6139) concurrentMapC12768.get(str);
        if (c6139 == null) {
            if (concurrentMapC12768.isEmpty()) {
                throw new C4798("No time-zone data files registered");
            }
            throw new C4798("Unknown time-zone ID: " + str);
        }
        if (c6139.f15403a.contains(str)) {
            return new C17537(TimeZone.getTimeZone(str));
        }
        throw new C4798("Not a built-in time zone: " + str);
    }

    /* JADX INFO: renamed from: b */
    public static void m13928b(C6139 c6139) {
        C12826.requireNonNull(c6139, C0708d.f2597M);
        synchronized (C6139.class) {
            for (String str : c6139.f15403a) {
                C12826.requireNonNull(str, "zoneId");
                if (((C6139) f15401c.putIfAbsent(str, c6139)) != null) {
                    throw new C4798("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + c6139);
                }
            }
            f15402d = Collections.unmodifiableSet(new HashSet(f15401c.keySet()));
        }
        f15400b.add(c6139);
    }

    public C6139() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f15403a = Collections.unmodifiableSet(linkedHashSet);
    }
}
