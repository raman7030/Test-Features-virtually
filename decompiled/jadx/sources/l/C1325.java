package l;

import android.text.TextUtils;
import com.alipay.sdk.m.n.c;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.d;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: l.֨᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7CF */
/* JADX INFO: loaded from: classes2.dex */
public final class C1325 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f4751;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f4752;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public List f4754;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f4755;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public List f4756;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f4757;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public List f4758;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f4759;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C18891 f4760;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C22306 f4761;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f4762;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f4767;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C22306 f4768;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f4769;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public List f4770;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f4772;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC3817 f4773;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f4774;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f4775;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f4771 = "running";

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f4753 = "";

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f4749 = "";

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f4750 = 0;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f4764 = "";

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f4765 = "";

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f4766 = "";

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f4763 = "";

    public C1325(String str, String str2) {
        C22306 c22306 = C22306.f72317;
        this.f4768 = c22306;
        this.f4761 = c22306;
        this.f4775 = "";
        List list = Collections.EMPTY_LIST;
        this.f4758 = list;
        this.f4754 = list;
        this.f4756 = list;
        this.f4770 = list;
        this.f4755 = str;
        this.f4762 = str2;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m4632(C1325 c1325) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("taskId", c1325.f4755);
        linkedHashMap2.put("type", c1325.f4762);
        linkedHashMap2.put("done", Boolean.valueOf(c1325.f4759));
        linkedHashMap2.put(c.a, c1325.f4771);
        linkedHashMap2.put("title", c1325.f4753);
        linkedHashMap2.put("name", c1325.f4749);
        linkedHashMap2.put("progress", Integer.valueOf(c1325.f4750));
        linkedHashMap2.put("remaining", c1325.f4764);
        linkedHashMap2.put("speed", Long.valueOf(c1325.f4774));
        linkedHashMap2.put(d.O, c1325.f4765);
        linkedHashMap2.put("refreshDirectories", c1325.f4758);
        linkedHashMap2.put("invalidatePrefixes", c1325.f4754);
        linkedHashMap2.put("pathMoves", c1325.f4756);
        linkedHashMap2.put("markedPaths", c1325.f4770);
        if (TextUtils.isEmpty(c1325.f4766)) {
            linkedHashMap = null;
        } else {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("id", c1325.f4766);
            linkedHashMap3.put(MotionUtils.EASING_TYPE_PATH, c1325.f4763);
            linkedHashMap3.put("incoming", C8381.m21975(c1325.f4768));
            linkedHashMap3.put("existing", C8381.m21975(c1325.f4761));
            linkedHashMap3.put("selectedAction", c1325.f4775);
            linkedHashMap3.put("recyclable", Boolean.valueOf(c1325.f4757));
            linkedHashMap3.put("moveToRecycleBin", Boolean.valueOf(c1325.f4767));
            linkedHashMap = linkedHashMap3;
        }
        linkedHashMap2.put("conflict", linkedHashMap);
        return linkedHashMap2;
    }
}
