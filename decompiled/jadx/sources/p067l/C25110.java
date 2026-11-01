package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes.dex */
public final class C25110 implements Comparable {

    /* JADX INFO: renamed from: ۗ */
    public final String f80350;

    /* JADX INFO: renamed from: ۙ */
    public final C25110 f80351;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ ActivityC22429 f80352;

    /* JADX INFO: renamed from: ᩶ */
    public final String f80353;

    /* JADX INFO: renamed from: ᩸ */
    public final ArrayList f80354 = new ArrayList();

    /* JADX INFO: renamed from: ᩹ */
    public final ArrayList f80355 = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f80353.compareTo(((C25110) obj).f80353);
    }

    public C25110(ActivityC22429 activityC22429, String str, String str2, C25110 c25110) {
        this.f80352 = activityC22429;
        this.f80353 = str;
        this.f80350 = str2;
        this.f80351 = c25110;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C25110 m55098(String str) {
        ActivityC22429 activityC22429 = this.f80352;
        boolean z = activityC22429.f70775.f60054;
        String str2 = this.f80350;
        ArrayList<C25110> arrayList = this.f80354;
        if (z) {
            if (str.startsWith("android/support/")) {
                return m55098("android/support").m55098(str.substring(16));
            }
            String strReplace = str.replace("/", ".");
            for (C25110 c25110 : arrayList) {
                if (c25110.f80353.equals(strReplace)) {
                    return c25110;
                }
            }
            C25110 c25111 = new C25110(activityC22429, strReplace, str2 + str + '/', this);
            arrayList.add(c25111);
            return c25111;
        }
        if (str.indexOf(47) == -1) {
            for (C25110 c25112 : arrayList) {
                if (c25112.f80353.equals(str)) {
                    return c25112;
                }
            }
            C25110 c25113 = new C25110(activityC22429, str, str2 + str + '/', this);
            arrayList.add(c25113);
            return c25113;
        }
        C25110 c25110M55098 = this;
        for (String str3 : str.split("/")) {
            c25110M55098 = c25110M55098.m55098(str3);
        }
        return c25110M55098;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55099() {
        ArrayList arrayList = this.f80354;
        Collections.sort(arrayList);
        Collections.sort(this.f80355);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C25110) it.next()).m55099();
        }
    }
}
