package l;

import bin.mt.json.JSONArray;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܿᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes4.dex */
public final class C17534 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f53547;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f53548;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f53549;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17534)) {
            return false;
        }
        C17534 c17534 = (C17534) obj;
        return this.f53548 == c17534.f53548 && this.f53549 == c17534.f53549 && C11233.m27802((Object) this.f53547, (Object) c17534.f53547);
    }

    public final int hashCode() {
        return this.f53547.hashCode() + (((this.f53548 * 31) + (this.f53549 ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkStorageInfo(id=");
        sb.append(this.f53548);
        sb.append(", isDir=");
        sb.append(this.f53549);
        sb.append(", backupTag=");
        return C9045.m23341(sb, this.f53547, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C17534(int i, String str, boolean z) {
        this.f53548 = i;
        this.f53549 = z;
        this.f53547 = str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m40974() {
        return this.f53548;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m40975() {
        return this.f53549;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m40972() {
        return this.f53547;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C17534(AbstractC3577 abstractC3577, boolean z) {
        int i = abstractC3577.f11356;
        String strMo6365 = abstractC3577.mo6365();
        C11233.m27803(strMo6365, "getBackupTag(...)");
        this(i, strMo6365, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C17534(JSONArray jSONArray) {
        int i = jSONArray.getInt(0);
        boolean z = jSONArray.getBoolean(1);
        String string = jSONArray.getString(2);
        C11233.m27803(string, "getString(...)");
        this(i, string, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17534 m40973(AbstractC3577 abstractC3577) {
        return new C17534(abstractC3577, this.f53549);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final JSONArray m40976() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(this.f53548);
        jSONArray.add(this.f53549);
        jSONArray.add(this.f53547);
        return jSONArray;
    }
}
