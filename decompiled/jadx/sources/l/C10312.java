package l;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.ۤ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10312 implements Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f31043;

    public C10312(Collator collator, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.f31043 = arrayList;
        if (z) {
            arrayList.add(new C6078(collator, str, false));
            return;
        }
        Matcher matcher = C7489.f23074.matcher(str);
        int length = 0;
        while (true) {
            if (!matcher.find()) {
                break;
            }
            String strGroup = matcher.group();
            if (!strGroup.isEmpty()) {
                length += strGroup.length();
                char cCharAt = strGroup.charAt(0);
                this.f31043.add(new C6078(collator, strGroup, '0' <= cCharAt && cCharAt <= '9'));
            }
        }
        C12171.m29642(length == str.length());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C10312 c10312) {
        Iterator it = this.f31043.iterator();
        Iterator it2 = c10312.f31043.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo = ((C6078) it.next()).compareTo((C6078) it2.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }
}
