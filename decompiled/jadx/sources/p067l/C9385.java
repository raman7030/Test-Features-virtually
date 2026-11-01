package p067l;

import bin.p000mt.json.JSON;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06Y2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9385 {

    /* JADX INFO: renamed from: ֫ */
    public final List f25637;

    /* JADX INFO: renamed from: ۧ */
    public final String f25638;

    /* JADX INFO: renamed from: ܽ */
    public final List f25639;

    /* JADX INFO: renamed from: ܿ */
    public final List f25640;

    /* JADX INFO: renamed from: ᩳ */
    public final String f25641;

    public C9385(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        C12826.requireNonNull(str, "homePath");
        this.f25638 = str;
        C12826.requireNonNull(str2, "policyRevision");
        this.f25641 = str2;
        C15419.m35147(arrayList);
        ArrayList<C15419> arrayList3 = new ArrayList(arrayList);
        this.f25640 = C21562.unmodifiableList(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.sort(arrayList4);
        this.f25639 = C21562.unmodifiableList(arrayList4);
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList5.add(str);
        for (C15419 c15419 : arrayList3) {
            if (c15419.f44087 && c15419.f44089 == EnumC8890.DIRECTORY) {
                arrayList5.add(c15419.f44088);
            }
        }
        Collections.sort(arrayList5);
        this.f25637 = C21562.unmodifiableList(arrayList5);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24137 m21854(String str) {
        Iterator it = this.f25639.iterator();
        while (it.hasNext()) {
            if (C14059.m31906(str, (String) it.next())) {
                return new C24137(str, EnumC8044.DENY, EnumC13409.MANAGED_PATH);
            }
        }
        if (C14059.m31905(str)) {
            return m21853(str, EnumC13409.ANDROID_DATA);
        }
        if (C14059.m31906(str, this.f25638)) {
            return new C24137(str, EnumC8044.READ_WRITE, EnumC13409.HOME);
        }
        return m21853(str, EnumC13409.DEFAULT);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m21856(String str) {
        if (!m21854(str).f76571.m18662()) {
            throw C5276.m11411("FILE_ACCESS_DENIED", "Read access is denied by the MCP file policy.", "fatal", null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("policyRevision", this.f25641));
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m21857(String str) throws C5276 {
        if (!m21854(str).f76571.m18663()) {
            throw C5276.m11411("FILE_ACCESS_DENIED", "Write access is denied by the MCP file policy.", "fatal", null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("policyRevision", this.f25641));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m21855(String str) throws C5276 {
        Iterator it = this.f25637.iterator();
        while (it.hasNext()) {
            if (C14059.m31906((String) it.next(), str)) {
                throw C5276.m11411("FILE_ACCESS_ROOT_PROTECTED", "The operation would modify an MCP file access root.", "fatal", null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("policyRevision", this.f25641));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C24137 m21853(String str, EnumC13409 enumC13409) {
        boolean zEquals;
        for (C15419 c15419 : this.f25640) {
            boolean zM35148 = c15419.m35148();
            String str2 = c15419.f44088;
            EnumC8044 enumC8044 = c15419.f44086;
            if (zM35148) {
                return new C24137(str, enumC8044, enumC13409);
            }
            if (c15419.f44087) {
                if (c15419.f44089 == EnumC8890.DIRECTORY) {
                    zEquals = C14059.m31906(str, str2);
                } else {
                    zEquals = str.equals(str2);
                }
                if (zEquals) {
                    return new C24137(str, enumC8044, EnumC13409.RULE);
                }
            }
        }
        throw new IllegalStateException("Root rule is missing");
    }
}
