package p067l;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۤ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8SE */
/* JADX INFO: loaded from: classes3.dex */
public final class C12347 {

    /* JADX INFO: renamed from: ֫ */
    public final Set f34455;

    /* JADX INFO: renamed from: ۧ */
    public final String f34456;

    /* JADX INFO: renamed from: ܽ */
    public final int f34457;

    /* JADX INFO: renamed from: ᩳ */
    public final String f34458;

    public C12347(String str, int i, String str2, Set set) {
        this.f34457 = i;
        this.f34456 = str;
        this.f34458 = str2;
        this.f34455 = set;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12347 m28433(int i, String str) {
        String str2;
        String strTrim = str.trim();
        C23877.m52957(!strTrim.isEmpty());
        int iIndexOf = strTrim.indexOf(" ");
        if (iIndexOf == -1) {
            str2 = "";
        } else {
            String strTrim2 = strTrim.substring(iIndexOf).trim();
            strTrim = strTrim.substring(0, iIndexOf);
            str2 = strTrim2;
        }
        String str3 = C5792.f14228;
        String[] strArrSplit = strTrim.split("\\.", -1);
        String str4 = strArrSplit[0];
        HashSet hashSet = new HashSet();
        for (int i2 = 1; i2 < strArrSplit.length; i2++) {
            hashSet.add(strArrSplit[i2]);
        }
        return new C12347(str4, i, str2, hashSet);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12347 m28432() {
        return new C12347("", 0, "", Collections.EMPTY_SET);
    }
}
