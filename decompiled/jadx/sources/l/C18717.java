package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31WU */
/* JADX INFO: loaded from: classes4.dex */
public final class C18717 implements Comparable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C11459 f59171 = C11459.m28260("[0-9]+");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f59172;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f59173;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f59174;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f59175;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C18717 c18717 = (C18717) obj;
        int iCompareTo = this.f59175.compareTo(c18717.f59175);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i = this.f59173 - c18717.f59173;
        return i != 0 ? i : this.f59172.compareTo(c18717.f59172);
    }

    public C18717(String str) {
        this.f59174 = str;
        C12164 c12164Matcher = f59171.matcher((CharSequence) str);
        if (c12164Matcher.find() && c12164Matcher.end() - c12164Matcher.start() < 10) {
            this.f59175 = str.substring(0, c12164Matcher.start());
            this.f59173 = Integer.parseInt(c12164Matcher.group());
            this.f59172 = str.substring(c12164Matcher.end());
        } else {
            this.f59175 = str;
            this.f59173 = -1;
            this.f59172 = "";
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43345(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C18717((String) it.next()));
        }
        Collections.sort(arrayList2);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, ((C18717) arrayList2.get(i)).f59174);
        }
    }
}
