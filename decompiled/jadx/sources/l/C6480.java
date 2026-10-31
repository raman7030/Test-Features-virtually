package l;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.Filter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes2.dex */
public final class C6480 extends Filter {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f20009;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f20010;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20592 f20012;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f20011 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C23866 f20013 = new C23866();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7637 f20008 = new C7637(2);

    public C6480(C20592 c20592) {
        this.f20012 = c20592;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x010d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0129 A[SYNTHETIC] */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        int i;
        String lowerCase;
        C0681 c0681;
        String lowerCase2;
        int iIndexOf;
        C20592 c20592 = this.f20012;
        ForegroundColorSpan foregroundColorSpan = c20592.f66295;
        ForegroundColorSpan foregroundColorSpan2 = c20592.f66294;
        ViewOnClickListenerC8597 viewOnClickListenerC8597 = c20592.f66291;
        String string = charSequence == null ? "" : charSequence.toString();
        this.f20009 = string.length();
        boolean zStartsWith = string.startsWith("@");
        C23866<SpannableString> c23866 = this.f20013;
        String lowerCase3 = null;
        if (zStartsWith || string.startsWith("?")) {
            int iIndexOf2 = string.indexOf(47);
            boolean z = string.indexOf("android:") == 1;
            C7637 c7637 = this.f20008;
            if (iIndexOf2 == -1) {
                boolean zStartsWith2 = string.startsWith("?");
                int i2 = zStartsWith2 ? 1 : 2;
                if (this.f20011 != i2) {
                    this.f20011 = i2;
                    c23866.clear();
                    InterfaceC9922 interfaceC9922M30769 = viewOnClickListenerC8597.f26257.m30769();
                    if (interfaceC9922M30769 != null) {
                        m17875(interfaceC9922M30769, zStartsWith2);
                    }
                    if (interfaceC9922M30769 == null || !interfaceC9922M30769.mo23369()) {
                        m17875(C11166.m27700(), zStartsWith2);
                    }
                    c23866.sort(c7637);
                }
            } else {
                String strSubstring = z ? string.substring(9, iIndexOf2) : string.substring(1, iIndexOf2);
                int i3 = iIndexOf2 + 1;
                lowerCase3 = string.substring(i3).toLowerCase();
                if (lowerCase3.isEmpty()) {
                    i3 = -1;
                }
                int i4 = z ? 3 : 4;
                if (this.f20011 == i4) {
                    if (!strSubstring.equals(this.f20010)) {
                    }
                    i = i3;
                } else {
                    this.f20011 = i4;
                }
                this.f20010 = strSubstring;
                c23866.clear();
                InterfaceC9922 interfaceC9922M307610 = viewOnClickListenerC8597.f26257.m30769();
                if (z && (interfaceC9922M307610 == null || !interfaceC9922M307610.mo23369())) {
                    interfaceC9922M307610 = C11166.m27700();
                }
                String strConcat = strSubstring.equals("attr") ? "?" : "@";
                if (z) {
                    strConcat = strConcat.concat("android:");
                }
                String strM50967 = C22870.m50967(strConcat, strSubstring, "/");
                int i5 = z ? 1 : 127;
                m17874(interfaceC9922M307610, i5, strM50967);
                if (z) {
                    m17874(viewOnClickListenerC8597.f26257.m30769(), i5, strM50967);
                }
                c23866.sort(c7637);
                i = i3;
            }
            lowerCase = string.toLowerCase();
            c0681 = new C0681();
            for (SpannableString spannableString : c23866) {
                spannableString.removeSpan(foregroundColorSpan2);
                spannableString.removeSpan(foregroundColorSpan);
                lowerCase2 = spannableString.toString().toLowerCase();
                if (lowerCase2.startsWith(lowerCase)) {
                    c0681.m2763(spannableString, 0);
                    spannableString.setSpan(foregroundColorSpan2, 0, lowerCase.length(), 33);
                } else if (i == -1 && (iIndexOf = lowerCase2.indexOf(lowerCase3, i)) != -1) {
                    c0681.m2763(spannableString, iIndexOf);
                    spannableString.setSpan(foregroundColorSpan2, 0, i, 33);
                    spannableString.setSpan(foregroundColorSpan, iIndexOf, lowerCase3.length() + iIndexOf, 33);
                }
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = c0681.m2765();
            filterResults.count = c0681.m2762();
            return filterResults;
        }
        this.f20011 = 0;
        c23866.clear();
        i = -1;
        lowerCase = string.toLowerCase();
        c0681 = new C0681();
        while (r6.hasNext()) {
            spannableString.removeSpan(foregroundColorSpan2);
            spannableString.removeSpan(foregroundColorSpan);
            lowerCase2 = spannableString.toString().toLowerCase();
            if (lowerCase2.startsWith(lowerCase)) {
                c0681.m2763(spannableString, 0);
                spannableString.setSpan(foregroundColorSpan2, 0, lowerCase.length(), 33);
            } else if (i == -1) {
            }
        }
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        filterResults2.values = c0681.m2765();
        filterResults2.count = c0681.m2762();
        return filterResults2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17875(InterfaceC9922 interfaceC9922, boolean z) {
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            boolean z2 = interfaceC4277.mo12858() == 1;
            Iterator it = interfaceC4277.mo12850().iterator();
            while (it.hasNext()) {
                String typeName = ((InterfaceC0748) it.next()).getTypeName();
                C23866 c23866 = this.f20013;
                if (z) {
                    if (typeName.equals("attr")) {
                        if (z2) {
                            c23866.m52575(new SpannableString("?android:attr/"));
                        } else {
                            c23866.m52575(new SpannableString("?attr/"));
                        }
                    }
                } else if (!typeName.equals("attr")) {
                    if (z2) {
                        c23866.m52575(new SpannableString(C4860.m14172("@android:", typeName, "/")));
                    } else {
                        c23866.m52575(new SpannableString(C4860.m14172("@", typeName, "/")));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17874(InterfaceC9922 interfaceC9922, int i, String str) {
        InterfaceC21211 interfaceC21211Mo2346;
        if (interfaceC9922 == null) {
            return;
        }
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (interfaceC4277.mo12858() == i) {
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (interfaceC0748.getTypeName().equals(this.f20010)) {
                        int iMo2878 = interfaceC0748.mo2878();
                        for (int i2 = 0; i2 < iMo2878; i2++) {
                            for (InterfaceC7099 interfaceC7099 : interfaceC0748.mo2872()) {
                                if (interfaceC7099.mo2347(i2) && (interfaceC21211Mo2346 = interfaceC7099.mo2346(i2)) != null) {
                                    StringBuilder sbM15339 = C5368.m15339(str);
                                    sbM15339.append(interfaceC21211Mo2346.mo29406());
                                    this.f20013.m52575(new SpannableString(sbM15339.toString()));
                                    break;
                                }
                            }
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults == null) {
            return;
        }
        List list = (List) filterResults.values;
        C20592 c20592 = this.f20012;
        c20592.f66289 = list;
        if (filterResults.count > 0) {
            c20592.notifyDataSetChanged();
        } else {
            c20592.notifyDataSetInvalidated();
        }
    }
}
