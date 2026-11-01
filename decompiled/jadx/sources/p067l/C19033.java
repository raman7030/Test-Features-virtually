package p067l;

import bin.p000mt.json.JSONArray;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܿᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes4.dex */
public final class C19033 {

    /* JADX INFO: renamed from: ֫ */
    public final String f56738;

    /* JADX INFO: renamed from: ۧ */
    public final int f56739;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f56740;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19033)) {
            return false;
        }
        C19033 c19033 = (C19033) obj;
        return this.f56739 == c19033.f56739 && this.f56740 == c19033.f56740 && C13045.m29864((Object) this.f56738, (Object) c19033.f56738);
    }

    public final int hashCode() {
        return this.f56738.hashCode() + (((this.f56739 * 31) + (this.f56740 ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkStorageInfo(id=");
        sb.append(this.f56739);
        sb.append(", isDir=");
        sb.append(this.f56740);
        sb.append(", backupTag=");
        return C10965.m25286(sb, this.f56738, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C19033(int i, String str, boolean z) {
        this.f56739 = i;
        this.f56740 = z;
        this.f56738 = str;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m43234() {
        return this.f56739;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m43235() {
        return this.f56740;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m43232() {
        return this.f56738;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19033(AbstractC5769 abstractC5769, boolean z) {
        int i = abstractC5769.f14161;
        String strMo8538 = abstractC5769.mo8538();
        C13045.m29865(strMo8538, "getBackupTag(...)");
        this(i, strMo8538, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19033(JSONArray jSONArray) {
        int i = jSONArray.getInt(0);
        boolean z = jSONArray.getBoolean(1);
        String string = jSONArray.getString(2);
        C13045.m29865(string, "getString(...)");
        this(i, string, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19033 m43233(AbstractC5769 abstractC5769) {
        return new C19033(abstractC5769, this.f56740);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final JSONArray m43236() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(this.f56739);
        jSONArray.add(this.f56740);
        jSONArray.add(this.f56738);
        return jSONArray;
    }
}
