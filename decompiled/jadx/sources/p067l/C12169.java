package p067l;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: l.ۤ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M2AR */
/* JADX INFO: loaded from: classes3.dex */
public final class C12169 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public ArrayList f34006;

    public C12169(Collator collator, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.f34006 = arrayList;
        if (z) {
            arrayList.add(new C8145(collator, str, false));
            return;
        }
        Matcher matcher = C9486.f25987.matcher(str);
        int length = 0;
        while (true) {
            if (!matcher.find()) {
                break;
            }
            String strGroup = matcher.group();
            if (!strGroup.isEmpty()) {
                length += strGroup.length();
                char cCharAt = strGroup.charAt(0);
                this.f34006.add(new C8145(collator, strGroup, '0' <= cCharAt && cCharAt <= '9'));
            }
        }
        C1446.m31704(length == str.length());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C12169 c12169) {
        Iterator it = this.f34006.iterator();
        Iterator it2 = c12169.f34006.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo = ((C8145) it.next()).compareTo((C8145) it2.next());
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
