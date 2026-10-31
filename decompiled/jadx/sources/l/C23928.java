package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes.dex */
public final class C23928 implements Comparable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f77599;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23928 f77600;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f77601;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f77602;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f77603 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f77604 = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f77602.compareTo(((C23928) obj).f77602);
    }

    public C23928(ActivityC21107 activityC21107, String str, String str2, C23928 c23928) {
        this.f77601 = activityC21107;
        this.f77602 = str;
        this.f77599 = str2;
        this.f77600 = c23928;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23928 m52692(String str) {
        ActivityC21107 activityC21107 = this.f77601;
        boolean z = activityC21107.f68093.f56837;
        String str2 = this.f77599;
        ArrayList<C23928> arrayList = this.f77603;
        if (z) {
            if (str.startsWith("android/support/")) {
                return m52692("android/support").m52692(str.substring(16));
            }
            String strReplace = str.replace("/", ".");
            for (C23928 c23928 : arrayList) {
                if (c23928.f77602.equals(strReplace)) {
                    return c23928;
                }
            }
            C23928 c23929 = new C23928(activityC21107, strReplace, str2 + str + '/', this);
            arrayList.add(c23929);
            return c23929;
        }
        if (str.indexOf(47) == -1) {
            for (C23928 c239210 : arrayList) {
                if (c239210.f77602.equals(str)) {
                    return c239210;
                }
            }
            C23928 c239211 = new C23928(activityC21107, str, str2 + str + '/', this);
            arrayList.add(c239211);
            return c239211;
        }
        C23928 c23928M52692 = this;
        for (String str3 : str.split("/")) {
            c23928M52692 = c23928M52692.m52692(str3);
        }
        return c23928M52692;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52693() {
        ArrayList arrayList = this.f77603;
        Collections.sort(arrayList);
        Collections.sort(this.f77604);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C23928) it.next()).m52693();
        }
    }
}
