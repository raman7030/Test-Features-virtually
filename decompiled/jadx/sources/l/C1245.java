package l;

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
public final class C1245 extends Error {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final ArrayList f4435 = new ArrayList();

    /* JADX WARN: Illegal instructions before constructor call */
    public C1245(long j, Map map) {
        StringBuilder sbM31106 = C12803.m31106("Application unresponsive for at least ", " ms.", j);
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            sbM31106.append('\n');
            sbM31106.append(thread.getName());
            sbM31106.append(" (state = ");
            sbM31106.append(thread.getState());
            sbM31106.append(MotionUtils.EASING_TYPE_FORMAT_END);
            for (StackTraceElement stackTraceElement : (StackTraceElement[]) entry.getValue()) {
                sbM31106.append("\n    at ");
                sbM31106.append(stackTraceElement);
            }
        }
        super(sbM31106.toString());
        Iterator it = f4435.iterator();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1245 m4090() {
        return m4092(0L, "", null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1245 m4092(long j, String str, C15355 c15355) {
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
            if (key != c15355) {
                StackTraceElement[] value = entry.getValue();
                if (key == thread || (key.getName().startsWith(str) && value.length > 0)) {
                    treeMap.put(key, value);
                }
            }
        }
        if (!treeMap.containsKey(thread)) {
            treeMap.put(thread, thread.getStackTrace());
        }
        return new C1245(j, treeMap);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1245 m4091(long j) {
        Thread thread = Looper.getMainLooper().getThread();
        return new C1245(j, Collections.singletonMap(thread, thread.getStackTrace()));
    }
}
