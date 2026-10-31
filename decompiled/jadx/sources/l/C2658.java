package l;

import android.text.SpannableString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 469I */
/* JADX INFO: loaded from: classes2.dex */
public final class C2658 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f8361;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18886 f8362;

    public C2658(C18886 c18886) {
        this.f8362 = c18886;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8346(String str) {
        if (this.f8361 == null) {
            C18221 c18221 = (C18221) C11166.m27704().f53493.get(0);
            ArrayList arrayList = new ArrayList(c18221.m42445());
            this.f8361 = arrayList;
            Iterator it = c18221.m42442().iterator();
            while (it.hasNext()) {
                arrayList.add(((C16809) it.next()).f51605);
            }
            arrayList.trimToSize();
            Collections.sort(arrayList);
        }
        String lowerCase = str.toLowerCase();
        String[] strArrSplit = lowerCase.split(":", 2);
        C0681 c0681 = new C0681();
        C18886 c18886 = this.f8362;
        String lowerCase2 = c18886.f59528.m38009().toLowerCase();
        if (strArrSplit.length == 1) {
            int iIndexOf = lowerCase2.indexOf(lowerCase);
            if (iIndexOf != -1) {
                SpannableString spannableString = new SpannableString(lowerCase2.concat(":"));
                spannableString.setSpan(c18886.f59534, iIndexOf, lowerCase.length() + iIndexOf, 33);
                c0681.m2763(spannableString, 0);
            }
            int length = lowerCase2.length() + 1;
            for (String str2 : this.f8361) {
                int iIndexOf2 = str2.toLowerCase().indexOf(lowerCase);
                if (iIndexOf2 != -1) {
                    SpannableString spannableString2 = new SpannableString(C22870.m50967(lowerCase2, ":", str2));
                    int i = length + iIndexOf2;
                    spannableString2.setSpan(c18886.f59534, i, lowerCase.length() + i, 33);
                    c0681.m2763(spannableString2, iIndexOf2);
                }
            }
        } else if (lowerCase2.equals(strArrSplit[0])) {
            lowerCase = strArrSplit[1];
            int length2 = lowerCase2.length() + 1;
            for (String str3 : this.f8361) {
                int iIndexOf3 = str3.toLowerCase().indexOf(lowerCase);
                if (iIndexOf3 != -1) {
                    SpannableString spannableString3 = new SpannableString(C22870.m50967(lowerCase2, ":", str3));
                    spannableString3.setSpan(c18886.f59534, 0, lowerCase.length() + length2 + iIndexOf3, 33);
                    c0681.m2763(spannableString3, iIndexOf3);
                }
            }
        }
        c18886.f59529.clear();
        c0681.m2764(c18886.f59529);
        if (c18886.f59529.size() == 1 && ((SpannableString) c18886.f59529.get(0)).toString().equals(lowerCase)) {
            c18886.f59529.clear();
        }
    }
}
