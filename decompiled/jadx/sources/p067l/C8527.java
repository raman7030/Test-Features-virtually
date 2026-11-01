package p067l;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.Filter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5MD */
/* JADX INFO: loaded from: classes2.dex */
public final class C8527 extends Filter {

    /* JADX INFO: renamed from: ۧ */
    public int f22884;

    /* JADX INFO: renamed from: ܳ */
    public String f22885;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C21939 f22887;

    /* JADX INFO: renamed from: ܽ */
    public int f22886 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public C25051 f22888 = new C25051();

    /* JADX INFO: renamed from: ֫ */
    public C9627 f22883 = new C9627(2);

    public C8527(C21939 c21939) {
        this.f22887 = c21939;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x010d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0129 A[SYNTHETIC] */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        int i;
        String lowerCase;
        C3016 c3016;
        String lowerCase2;
        int iIndexOf;
        C21939 c21939 = this.f22887;
        ForegroundColorSpan foregroundColorSpan = c21939.f68976;
        ForegroundColorSpan foregroundColorSpan2 = c21939.f68975;
        ViewOnClickListenerC10539 viewOnClickListenerC10539 = c21939.f68972;
        String string = charSequence == null ? "" : charSequence.toString();
        this.f22884 = string.length();
        boolean zStartsWith = string.startsWith("@");
        C25051<SpannableString> c25051 = this.f22888;
        String lowerCase3 = null;
        if (zStartsWith || string.startsWith("?")) {
            int iIndexOf2 = string.indexOf(47);
            boolean z = string.indexOf("android:") == 1;
            C9627 c9627 = this.f22883;
            if (iIndexOf2 == -1) {
                boolean zStartsWith2 = string.startsWith("?");
                int i2 = zStartsWith2 ? 1 : 2;
                if (this.f22886 != i2) {
                    this.f22886 = i2;
                    c25051.clear();
                    InterfaceC11799 interfaceC11799M32841 = viewOnClickListenerC10539.f29173.m32841();
                    if (interfaceC11799M32841 != null) {
                        m19823(interfaceC11799M32841, zStartsWith2);
                    }
                    if (interfaceC11799M32841 == null || !interfaceC11799M32841.mo25314()) {
                        m19823(C12981.m29762(), zStartsWith2);
                    }
                    c25051.sort(c9627);
                }
            } else {
                String strSubstring = z ? string.substring(9, iIndexOf2) : string.substring(1, iIndexOf2);
                int i3 = iIndexOf2 + 1;
                lowerCase3 = string.substring(i3).toLowerCase();
                if (lowerCase3.isEmpty()) {
                    i3 = -1;
                }
                int i4 = z ? 3 : 4;
                if (this.f22886 == i4) {
                    if (!strSubstring.equals(this.f22885)) {
                    }
                    i = i3;
                } else {
                    this.f22886 = i4;
                }
                this.f22885 = strSubstring;
                c25051.clear();
                InterfaceC11799 interfaceC11799M32842 = viewOnClickListenerC10539.f29173.m32841();
                if (z && (interfaceC11799M32842 == null || !interfaceC11799M32842.mo25314())) {
                    interfaceC11799M32842 = C12981.m29762();
                }
                String strConcat = strSubstring.equals("attr") ? "?" : "@";
                if (z) {
                    strConcat = strConcat.concat("android:");
                }
                String strM53357 = C24104.m53357(strConcat, strSubstring, "/");
                int i5 = z ? 1 : 127;
                m19822(interfaceC11799M32842, i5, strM53357);
                if (z) {
                    m19822(viewOnClickListenerC10539.f29173.m32841(), i5, strM53357);
                }
                c25051.sort(c9627);
                i = i3;
            }
            lowerCase = string.toLowerCase();
            c3016 = new C3016();
            for (SpannableString spannableString : c25051) {
                spannableString.removeSpan(foregroundColorSpan2);
                spannableString.removeSpan(foregroundColorSpan);
                lowerCase2 = spannableString.toString().toLowerCase();
                if (lowerCase2.startsWith(lowerCase)) {
                    c3016.m5102(spannableString, 0);
                    spannableString.setSpan(foregroundColorSpan2, 0, lowerCase.length(), 33);
                } else if (i == -1 && (iIndexOf = lowerCase2.indexOf(lowerCase3, i)) != -1) {
                    c3016.m5102(spannableString, iIndexOf);
                    spannableString.setSpan(foregroundColorSpan2, 0, i, 33);
                    spannableString.setSpan(foregroundColorSpan, iIndexOf, lowerCase3.length() + iIndexOf, 33);
                }
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = c3016.m5104();
            filterResults.count = c3016.m5101();
            return filterResults;
        }
        this.f22886 = 0;
        c25051.clear();
        i = -1;
        lowerCase = string.toLowerCase();
        c3016 = new C3016();
        while (r6.hasNext()) {
            spannableString.removeSpan(foregroundColorSpan2);
            spannableString.removeSpan(foregroundColorSpan);
            lowerCase2 = spannableString.toString().toLowerCase();
            if (lowerCase2.startsWith(lowerCase)) {
                c3016.m5102(spannableString, 0);
                spannableString.setSpan(foregroundColorSpan2, 0, lowerCase.length(), 33);
            } else if (i == -1) {
            }
        }
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        filterResults2.values = c3016.m5104();
        filterResults2.count = c3016.m5101();
        return filterResults2;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m19823(InterfaceC11799 interfaceC11799, boolean z) {
        for (InterfaceC6434 interfaceC6434 : interfaceC11799.mo23906()) {
            boolean z2 = interfaceC6434.mo14722() == 1;
            Iterator it = interfaceC6434.mo14714().iterator();
            while (it.hasNext()) {
                String typeName = ((InterfaceC3080) it.next()).getTypeName();
                C25051 c25051 = this.f22888;
                if (z) {
                    if (typeName.equals("attr")) {
                        if (z2) {
                            c25051.m54984(new SpannableString("?android:attr/"));
                        } else {
                            c25051.m54984(new SpannableString("?attr/"));
                        }
                    }
                } else if (!typeName.equals("attr")) {
                    if (z2) {
                        c25051.m54984(new SpannableString(C6988.m16053("@android:", typeName, "/")));
                    } else {
                        c25051.m54984(new SpannableString(C6988.m16053("@", typeName, "/")));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m19822(InterfaceC11799 interfaceC11799, int i, String str) {
        InterfaceC22528 interfaceC22528Mo4717;
        if (interfaceC11799 == null) {
            return;
        }
        for (InterfaceC6434 interfaceC6434 : interfaceC11799.mo23906()) {
            if (interfaceC6434.mo14722() == i) {
                for (InterfaceC3080 interfaceC3080 : interfaceC6434.mo14714()) {
                    if (interfaceC3080.getTypeName().equals(this.f22885)) {
                        int iMo5207 = interfaceC3080.mo5207();
                        for (int i2 = 0; i2 < iMo5207; i2++) {
                            for (InterfaceC9116 interfaceC9116 : interfaceC3080.mo5201()) {
                                if (interfaceC9116.mo4718(i2) && (interfaceC22528Mo4717 = interfaceC9116.mo4717(i2)) != null) {
                                    StringBuilder sbM17248 = C7470.m17248(str);
                                    sbM17248.append(interfaceC22528Mo4717.mo31468());
                                    this.f22888.m54984(new SpannableString(sbM17248.toString()));
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
        C21939 c21939 = this.f22887;
        c21939.f68970 = list;
        if (filterResults.count > 0) {
            c21939.notifyDataSetChanged();
        } else {
            c21939.notifyDataSetInvalidated();
        }
    }
}
