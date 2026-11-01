package p067l;

import android.text.TextUtils;
import com.alipay.sdk.p010m.p037n.C0172c;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.C0708d;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: l.֨᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7CF */
/* JADX INFO: loaded from: classes2.dex */
public final class C3628 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f7521;

    /* JADX INFO: renamed from: ۖ */
    public long f7522;

    /* JADX INFO: renamed from: ۘ */
    public List f7524;

    /* JADX INFO: renamed from: ۙ */
    public final String f7525;

    /* JADX INFO: renamed from: ۚ */
    public List f7526;

    /* JADX INFO: renamed from: ۜ */
    public boolean f7527;

    /* JADX INFO: renamed from: ۠ */
    public List f7528;

    /* JADX INFO: renamed from: ۡ */
    public boolean f7529;

    /* JADX INFO: renamed from: ۢ */
    public C20323 f7530;

    /* JADX INFO: renamed from: ۧ */
    public C23568 f7531;

    /* JADX INFO: renamed from: ۬ */
    public final String f7532;

    /* JADX INFO: renamed from: ܿ */
    public boolean f7537;

    /* JADX INFO: renamed from: ᩳ */
    public C23568 f7538;

    /* JADX INFO: renamed from: ᩴ */
    public int f7539;

    /* JADX INFO: renamed from: ᩵ */
    public List f7540;

    /* JADX INFO: renamed from: ᩷ */
    public ScheduledFuture f7542;

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC5996 f7543;

    /* JADX INFO: renamed from: ᩹ */
    public long f7544;

    /* JADX INFO: renamed from: ᩻ */
    public String f7545;

    /* JADX INFO: renamed from: ᩶ */
    public String f7541 = "running";

    /* JADX INFO: renamed from: ۗ */
    public String f7523 = "";

    /* JADX INFO: renamed from: ֡ */
    public String f7519 = "";

    /* JADX INFO: renamed from: ֨ */
    public int f7520 = 0;

    /* JADX INFO: renamed from: ܶ */
    public String f7534 = "";

    /* JADX INFO: renamed from: ܺ */
    public String f7535 = "";

    /* JADX INFO: renamed from: ܽ */
    public String f7536 = "";

    /* JADX INFO: renamed from: ܳ */
    public String f7533 = "";

    public C3628(String str, String str2) {
        C23568 c23568 = C23568.f75044;
        this.f7538 = c23568;
        this.f7531 = c23568;
        this.f7545 = "";
        List list = Collections.EMPTY_LIST;
        this.f7528 = list;
        this.f7524 = list;
        this.f7526 = list;
        this.f7540 = list;
        this.f7525 = str;
        this.f7532 = str2;
    }

    /* JADX INFO: renamed from: ۘ */
    public static LinkedHashMap m6864(C3628 c3628) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("taskId", c3628.f7525);
        linkedHashMap2.put("type", c3628.f7532);
        linkedHashMap2.put("done", Boolean.valueOf(c3628.f7529));
        linkedHashMap2.put(C0172c.f705a, c3628.f7541);
        linkedHashMap2.put("title", c3628.f7523);
        linkedHashMap2.put("name", c3628.f7519);
        linkedHashMap2.put("progress", Integer.valueOf(c3628.f7520));
        linkedHashMap2.put("remaining", c3628.f7534);
        linkedHashMap2.put("speed", Long.valueOf(c3628.f7544));
        linkedHashMap2.put(C0708d.f2599O, c3628.f7535);
        linkedHashMap2.put("refreshDirectories", c3628.f7528);
        linkedHashMap2.put("invalidatePrefixes", c3628.f7524);
        linkedHashMap2.put("pathMoves", c3628.f7526);
        linkedHashMap2.put("markedPaths", c3628.f7540);
        if (TextUtils.isEmpty(c3628.f7536)) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("id", c3628.f7536);
            linkedHashMap3.put(MotionUtils.EASING_TYPE_PATH, c3628.f7533);
            linkedHashMap3.put("incoming", C10334.m23946(c3628.f7538));
            linkedHashMap3.put("existing", C10334.m23946(c3628.f7531));
            linkedHashMap3.put("selectedAction", c3628.f7545);
            linkedHashMap3.put("recyclable", Boolean.valueOf(c3628.f7527));
            linkedHashMap3.put("moveToRecycleBin", Boolean.valueOf(c3628.f7537));
            linkedHashMap = linkedHashMap3;
        }
        linkedHashMap2.put("conflict", linkedHashMap);
        return linkedHashMap2;
    }
}
