package p067l;

import android.text.SpannableString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 469I */
/* JADX INFO: loaded from: classes2.dex */
public final class C4895 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f11155;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C20318 f11156;

    public C4895(C20318 c20318) {
        this.f11156 = c20318;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final void m10390(String str) {
        if (this.f11155 == null) {
            C19686 c19686 = (C19686) C12981.m29766().f56682.get(0);
            ArrayList arrayList = new ArrayList(c19686.m44706());
            this.f11155 = arrayList;
            Iterator it = c19686.m44703().iterator();
            while (it.hasNext()) {
                arrayList.add(((C18344) it.next()).f54787);
            }
            arrayList.trimToSize();
            Collections.sort(arrayList);
        }
        String lowerCase = str.toLowerCase();
        String[] strArrSplit = lowerCase.split(":", 2);
        C3016 c3016 = new C3016();
        C20318 c20318 = this.f11156;
        String lowerCase2 = c20318.f62757.m40200().toLowerCase();
        if (strArrSplit.length == 1) {
            int iIndexOf = lowerCase2.indexOf(lowerCase);
            if (iIndexOf != -1) {
                SpannableString spannableString = new SpannableString(lowerCase2.concat(":"));
                spannableString.setSpan(c20318.f62763, iIndexOf, lowerCase.length() + iIndexOf, 33);
                c3016.m5102(spannableString, 0);
            }
            int length = lowerCase2.length() + 1;
            for (String str2 : this.f11155) {
                int iIndexOf2 = str2.toLowerCase().indexOf(lowerCase);
                if (iIndexOf2 != -1) {
                    SpannableString spannableString2 = new SpannableString(C24104.m53357(lowerCase2, ":", str2));
                    int i = length + iIndexOf2;
                    spannableString2.setSpan(c20318.f62763, i, lowerCase.length() + i, 33);
                    c3016.m5102(spannableString2, iIndexOf2);
                }
            }
        } else if (lowerCase2.equals(strArrSplit[0])) {
            lowerCase = strArrSplit[1];
            int length2 = lowerCase2.length() + 1;
            for (String str3 : this.f11155) {
                int iIndexOf3 = str3.toLowerCase().indexOf(lowerCase);
                if (iIndexOf3 != -1) {
                    SpannableString spannableString3 = new SpannableString(C24104.m53357(lowerCase2, ":", str3));
                    spannableString3.setSpan(c20318.f62763, 0, lowerCase.length() + length2 + iIndexOf3, 33);
                    c3016.m5102(spannableString3, iIndexOf3);
                }
            }
        }
        c20318.f62758.clear();
        c3016.m5103(c20318.f62758);
        if (c20318.f62758.size() == 1 && ((SpannableString) c20318.f62758.get(0)).toString().equals(lowerCase)) {
            c20318.f62758.clear();
        }
    }
}
