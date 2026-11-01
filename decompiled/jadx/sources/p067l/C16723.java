package p067l;

import android.os.PowerManager;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: l.ܶ۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16723 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f49313 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final PowerManager.WakeLock f49314;

    /* JADX INFO: renamed from: ܳ */
    public static final Iterable f49315;

    /* JADX INFO: renamed from: ܽ */
    public static final CopyOnWriteArrayList f49316;

    /* JADX INFO: renamed from: ܿ */
    public static final CopyOnWriteArrayList f49317;

    /* JADX INFO: renamed from: ᩳ */
    public static final Set f49318;

    /* JADX INFO: renamed from: ᩻ */
    public static final C7350 f49319;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f49317 = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        f49316 = copyOnWriteArrayList2;
        Iterable iterableM24919 = C10810.m24919(copyOnWriteArrayList, copyOnWriteArrayList2);
        f49315 = iterableM24919;
        f49319 = new C7350(iterableM24919);
        f49318 = C21562.synchronizedSet(new HashSet());
        PowerManager powerManager = (PowerManager) C7050.m16232().getSystemService("power");
        if (powerManager == null) {
            f49314 = null;
        } else {
            f49314 = powerManager.newWakeLock(1, C7050.m16234().concat(":Task"));
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public static C7350 m37946() {
        return f49319;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static int m37955() {
        return f49317.size();
    }

    /* JADX INFO: renamed from: ᩻ */
    public static int m37956() {
        return f49316.size();
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m37952(AbstractC5996 abstractC5996) {
        return f49316.remove(abstractC5996);
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m37949() {
        f49316.clear();
        f49319.mo4067(f49315);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC5996 m37942(int i) {
        if (i <= 0) {
            return null;
        }
        for (AbstractC5996 abstractC5996 : f49317) {
            if (abstractC5996.m13480() == i) {
                return abstractC5996;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۜ */
    public static AbstractC5996 m37944() {
        for (AbstractC5996 abstractC5996 : f49317) {
            if (C24995.class.isInstance(abstractC5996)) {
                return abstractC5996;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܺ */
    public static void m37950() {
        f49317.clear();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37943(AbstractC5996 abstractC5996) {
        if (!abstractC5996.m13452()) {
            throw new IllegalStateException("Task is not finished.");
        }
        f49316.add(0, abstractC5996.m13490());
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m37948(AbstractC5996 abstractC5996) {
        f49318.remove(Integer.valueOf(abstractC5996.m13480()));
    }

    /* JADX INFO: renamed from: ۡ */
    public static boolean m37945() {
        return !f49318.isEmpty();
    }
}
