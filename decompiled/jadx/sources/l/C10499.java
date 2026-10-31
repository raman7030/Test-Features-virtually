package l;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۤ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8SE */
/* JADX INFO: loaded from: classes3.dex */
public final class C10499 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set f31493;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f31494;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f31495;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f31496;

    public C10499(String str, int i, String str2, Set set) {
        this.f31495 = i;
        this.f31494 = str;
        this.f31496 = str2;
        this.f31493 = set;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10499 m26400(int i, String str) {
        String str2;
        String strTrim = str.trim();
        C22632.m50631(!strTrim.isEmpty());
        int iIndexOf = strTrim.indexOf(" ");
        if (iIndexOf == -1) {
            str2 = "";
        } else {
            String strTrim2 = strTrim.substring(iIndexOf).trim();
            strTrim = strTrim.substring(0, iIndexOf);
            str2 = strTrim2;
        }
        String str3 = C3603.f11424;
        String[] strArrSplit = strTrim.split("\\.", -1);
        String str4 = strArrSplit[0];
        HashSet hashSet = new HashSet();
        for (int i2 = 1; i2 < strArrSplit.length; i2++) {
            hashSet.add(strArrSplit[i2]);
        }
        return new C10499(str4, i, str2, hashSet);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10499 m26399() {
        return new C10499("", 0, "", Collections.EMPTY_SET);
    }
}
