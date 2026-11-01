package p067l;

import android.os.Looper;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.֨ܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAQ9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3552 extends Error {

    /* JADX INFO: renamed from: ᩸ */
    public static final ArrayList f7204 = new ArrayList();

    /* JADX WARN: Illegal instructions before constructor call */
    public C3552(long j, Map map) {
        StringBuilder sbM33191 = C14536.m33191("Application unresponsive for at least ", " ms.", j);
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            sbM33191.append('\n');
            sbM33191.append(thread.getName());
            sbM33191.append(" (state = ");
            sbM33191.append(thread.getState());
            sbM33191.append(MotionUtils.EASING_TYPE_FORMAT_END);
            for (StackTraceElement stackTraceElement : (StackTraceElement[]) entry.getValue()) {
                sbM33191.append("\n    at ");
                sbM33191.append(stackTraceElement);
            }
        }
        super(sbM33191.toString());
        Iterator it = f7204.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String localizedMessage = getLocalizedMessage();
        return localizedMessage != null ? "ANRError: ".concat(localizedMessage) : "ANRError";
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3552 m6334() {
        return m6336(0L, "", null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3552 m6336(long j, String str, C16962 c16962) {
        final Thread thread = Looper.getMainLooper().getThread();
        TreeMap treeMap = new TreeMap(new Comparator() { // from class: l.ۚܽܽ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Thread thread2 = (Thread) obj;
                Thread thread3 = (Thread) obj2;
                if (thread2 == thread3) {
                    return 0;
                }
                Thread thread4 = thread;
                if (thread2 == thread4) {
                    return -1;
                }
                if (thread3 == thread4) {
                    return 1;
                }
                return thread3.getName().compareTo(thread2.getName());
            }
        });
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            if (key != c16962) {
                StackTraceElement[] value = entry.getValue();
                if (key == thread || (key.getName().startsWith(str) && value.length > 0)) {
                    treeMap.put(key, value);
                }
            }
        }
        if (!treeMap.containsKey(thread)) {
            treeMap.put(thread, thread.getStackTrace());
        }
        return new C3552(j, treeMap);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3552 m6335(long j) {
        Thread thread = Looper.getMainLooper().getThread();
        return new C3552(j, Collections.singletonMap(thread, thread.getStackTrace()));
    }
}
