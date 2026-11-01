package p067l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: l.ۛ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 48R2 */
/* JADX INFO: loaded from: classes2.dex */
public class C8315 {

    /* JADX INFO: renamed from: ֡ */
    public int f22214;

    /* JADX INFO: renamed from: ֨ */
    public AbstractC16192 f22215;

    /* JADX INFO: renamed from: ֫ */
    public C12339 f22216;

    /* JADX INFO: renamed from: ۖ */
    public int f22217;

    /* JADX INFO: renamed from: ۗ */
    public int f22218;

    /* JADX INFO: renamed from: ۘ */
    public int f22219;

    /* JADX INFO: renamed from: ۙ */
    public AbstractC16192 f22220;

    /* JADX INFO: renamed from: ۚ */
    public HashMap f22221;

    /* JADX INFO: renamed from: ۛ */
    public boolean f22222;

    /* JADX INFO: renamed from: ۜ */
    public int f22223;

    /* JADX INFO: renamed from: ۠ */
    public AbstractC16192 f22224;

    /* JADX INFO: renamed from: ۡ */
    public int f22225;

    /* JADX INFO: renamed from: ۢ */
    public int f22226;

    /* JADX INFO: renamed from: ۤ */
    public int f22227;

    /* JADX INFO: renamed from: ۧ */
    public HashSet f22228;

    /* JADX INFO: renamed from: ۨ */
    public int f22229;

    /* JADX INFO: renamed from: ۫ */
    public boolean f22230;

    /* JADX INFO: renamed from: ۬ */
    public boolean f22231;

    /* JADX INFO: renamed from: ܳ */
    public boolean f22232;

    /* JADX INFO: renamed from: ܶ */
    public int f22233;

    /* JADX INFO: renamed from: ܺ */
    public int f22234;

    /* JADX INFO: renamed from: ܽ */
    public boolean f22235;

    /* JADX INFO: renamed from: ܿ */
    public int f22236;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f22237;

    /* JADX INFO: renamed from: ᩴ */
    public int f22238;

    /* JADX INFO: renamed from: ᩵ */
    public int f22239;

    /* JADX INFO: renamed from: ᩶ */
    public AbstractC16192 f22240;

    /* JADX INFO: renamed from: ᩷ */
    public int f22241;

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC16192 f22242;

    /* JADX INFO: renamed from: ᩹ */
    public int f22243;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f22244;

    /* JADX INFO: renamed from: ֫ */
    public C8315 mo19202(C14350 c14350) {
        C15020 c15020 = c14350.f41039;
        mo19199(c15020.f42920);
        this.f22221.put(c15020, c14350);
        return this;
    }

    public C8315() {
        this.f22217 = Integer.MAX_VALUE;
        this.f22234 = Integer.MAX_VALUE;
        this.f22225 = Integer.MAX_VALUE;
        this.f22226 = Integer.MAX_VALUE;
        this.f22229 = Integer.MAX_VALUE;
        this.f22227 = Integer.MAX_VALUE;
        this.f22244 = true;
        this.f22222 = true;
        this.f22220 = AbstractC16192.m36872of();
        this.f22240 = AbstractC16192.m36872of();
        this.f22218 = 0;
        this.f22215 = AbstractC16192.m36872of();
        this.f22233 = 0;
        this.f22241 = Integer.MAX_VALUE;
        this.f22223 = Integer.MAX_VALUE;
        this.f22224 = AbstractC16192.m36872of();
        this.f22216 = C12339.f34437;
        this.f22242 = AbstractC16192.m36872of();
        this.f22243 = 0;
        this.f22230 = true;
        this.f22236 = 0;
        this.f22231 = false;
        this.f22232 = false;
        this.f22237 = false;
        this.f22235 = false;
        this.f22221 = new HashMap();
        this.f22228 = new HashSet();
    }

    public C8315(C13680 c13680) {
        m19182(c13680);
    }

    @EnsuresNonNull({"preferredVideoMimeTypes", "preferredVideoLanguages", "preferredAudioLanguages", "preferredAudioMimeTypes", "audioOffloadPreferences", "preferredTextLanguages", "overrides", "disabledTrackTypes"})
    /* JADX INFO: renamed from: ۧ */
    private void m19182(C13680 c13680) {
        this.f22217 = c13680.f38558;
        this.f22234 = c13680.f38575;
        this.f22225 = c13680.f38566;
        this.f22226 = c13680.f38567;
        this.f22214 = c13680.f38555;
        this.f22239 = c13680.f38580;
        this.f22238 = c13680.f38579;
        this.f22219 = c13680.f38560;
        this.f22229 = c13680.f38570;
        this.f22227 = c13680.f38568;
        this.f22244 = c13680.f38585;
        this.f22222 = c13680.f38563;
        this.f22220 = c13680.f38561;
        this.f22240 = c13680.f38581;
        this.f22218 = c13680.f38559;
        this.f22215 = c13680.f38556;
        this.f22233 = c13680.f38574;
        this.f22241 = c13680.f38582;
        this.f22223 = c13680.f38564;
        this.f22224 = c13680.f38565;
        this.f22216 = c13680.f38557;
        this.f22242 = c13680.f38583;
        this.f22243 = c13680.f38584;
        this.f22230 = c13680.f38571;
        this.f22236 = c13680.f38577;
        this.f22231 = c13680.f38572;
        this.f22232 = c13680.f38573;
        this.f22237 = c13680.f38578;
        this.f22235 = c13680.f38576;
        this.f22228 = new HashSet(c13680.f38569);
        this.f22221 = new HashMap(c13680.f38562);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19205(C13680 c13680) {
        m19182(c13680);
    }

    /* JADX INFO: renamed from: ܽ */
    public C8315 mo19207() {
        return mo19203(new String[0]);
    }

    /* JADX INFO: renamed from: ᩳ */
    public C8315 mo19208() {
        this.f22243 = 0;
        this.f22230 = false;
        return this;
    }

    /* JADX INFO: renamed from: ۧ */
    public C8315 mo19206() {
        this.f22236 = -3;
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public C8315 mo19199(int i) {
        Iterator it = this.f22221.values().iterator();
        while (it.hasNext()) {
            if (((C14350) it.next()).f41039.f42920 == i) {
                it.remove();
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public C8315 mo19201(Set set) {
        this.f22228.clear();
        this.f22228.addAll(set);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public C8315 mo19200(int i, boolean z) {
        if (z) {
            this.f22228.add(Integer.valueOf(i));
            return this;
        }
        this.f22228.remove(Integer.valueOf(i));
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public C13680 mo19204() {
        return new C13680(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public C8315 mo19203(String... strArr) {
        int i = AbstractC16192.f47662;
        C4123 c4123 = new C4123();
        for (String str : strArr) {
            str.getClass();
            c4123.m18184(C5792.m13024(str));
        }
        this.f22242 = c4123.m8329();
        this.f22230 = false;
        return this;
    }
}
