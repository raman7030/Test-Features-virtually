package l;

import bin.mt.json.JSON;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06Y2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7383 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f22725;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f22726;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f22727;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List f22728;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f22729;

    public C7383(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        C11003.requireNonNull(str, "homePath");
        this.f22726 = str;
        C11003.requireNonNull(str2, "policyRevision");
        this.f22729 = str2;
        C13732.m33033(arrayList);
        ArrayList<C13732> arrayList3 = new ArrayList(arrayList);
        this.f22728 = C20195.unmodifiableList(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.sort(arrayList4);
        this.f22727 = C20195.unmodifiableList(arrayList4);
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList5.add(str);
        for (C13732 c13732 : arrayList3) {
            if (c13732.f41008 && c13732.f41010 == EnumC6862.DIRECTORY) {
                arrayList5.add(c13732.f41009);
            }
        }
        Collections.sort(arrayList5);
        this.f22725 = C20195.unmodifiableList(arrayList5);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22905 m19881(String str) {
        Iterator it = this.f22727.iterator();
        while (it.hasNext()) {
            if (C12301.m29846(str, (String) it.next())) {
                return new C22905(str, EnumC5972.DENY, EnumC11617.MANAGED_PATH);
            }
        }
        if (C12301.m29845(str)) {
            return m19880(str, EnumC11617.ANDROID_DATA);
        }
        if (C12301.m29846(str, this.f22726)) {
            return new C22905(str, EnumC5972.READ_WRITE, EnumC11617.HOME);
        }
        return m19880(str, EnumC11617.DEFAULT);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m19883(String str) {
        if (!m19881(str).f73841.m16736()) {
            throw C3059.m9369("FILE_ACCESS_DENIED", "Read access is denied by the MCP file policy.", "fatal", null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("policyRevision", this.f22729));
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m19884(String str) throws C3059 {
        if (!m19881(str).f73841.m16737()) {
            throw C3059.m9369("FILE_ACCESS_DENIED", "Write access is denied by the MCP file policy.", "fatal", null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("policyRevision", this.f22729));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19882(String str) throws C3059 {
        Iterator it = this.f22725.iterator();
        while (it.hasNext()) {
            if (C12301.m29846((String) it.next(), str)) {
                throw C3059.m9369("FILE_ACCESS_ROOT_PROTECTED", "The operation would modify an MCP file access root.", "fatal", null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("policyRevision", this.f22729));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C22905 m19880(String str, EnumC11617 enumC11617) {
        boolean zEquals;
        for (C13732 c13732 : this.f22728) {
            boolean zM33034 = c13732.m33034();
            String str2 = c13732.f41009;
            EnumC5972 enumC5972 = c13732.f41007;
            if (zM33034) {
                return new C22905(str, enumC5972, enumC11617);
            }
            if (c13732.f41008) {
                if (c13732.f41010 == EnumC6862.DIRECTORY) {
                    zEquals = C12301.m29846(str, str2);
                } else {
                    zEquals = str.equals(str2);
                }
                if (zEquals) {
                    return new C22905(str, enumC5972, EnumC11617.RULE);
                }
            }
        }
        throw new IllegalStateException("Root rule is missing");
    }
}
