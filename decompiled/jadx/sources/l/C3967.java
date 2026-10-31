package l;

import com.umeng.analytics.pro.d;
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
public final class C3967 {
    public static final CopyOnWriteArrayList b;
    public static final ConcurrentMapC10942 c;
    public static volatile Set d;
    public final Set a;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        b = copyOnWriteArrayList;
        c = new ConcurrentMapC10942(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new C9884(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C15960 a(String str) {
        C11003.requireNonNull(str, "zoneId");
        ConcurrentMapC10942 concurrentMapC10942 = c;
        C3967 c3967 = (C3967) concurrentMapC10942.get(str);
        if (c3967 == null) {
            if (concurrentMapC10942.isEmpty()) {
                throw new C2556("No time-zone data files registered");
            }
            throw new C2556("Unknown time-zone ID: " + str);
        }
        if (c3967.a.contains(str)) {
            return new C15960(TimeZone.getTimeZone(str));
        }
        throw new C2556("Not a built-in time zone: " + str);
    }

    public static void b(C3967 c3967) {
        C11003.requireNonNull(c3967, d.M);
        synchronized (C3967.class) {
            for (String str : c3967.a) {
                C11003.requireNonNull(str, "zoneId");
                if (((C3967) c.putIfAbsent(str, c3967)) != null) {
                    throw new C2556("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + c3967);
                }
            }
            d = Collections.unmodifiableSet(new HashSet(c.keySet()));
        }
        b.add(c3967);
    }

    public C3967() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.a = Collections.unmodifiableSet(linkedHashSet);
    }
}
