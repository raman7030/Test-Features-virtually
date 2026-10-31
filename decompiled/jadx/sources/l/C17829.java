package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes5.dex */
public final class C17829 extends AbstractC10771 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f54474;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f54475;

    @Override // l.AbstractC10771
    /* JADX INFO: renamed from: ۧ */
    public final int mo1336() {
        return this.f54475.size();
    }

    @Override // l.AbstractC10771
    /* JADX INFO: renamed from: ֫ */
    public final int mo1334() {
        return this.f54474.size();
    }

    @Override // l.AbstractC10771
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo1337(int i, int i2) {
        int iIndexOf;
        int iIndexOf2;
        String strSubstring = (String) this.f54475.get(i);
        if (!C9679.m24615((CharSequence) strSubstring) && (iIndexOf2 = strSubstring.indexOf("/")) != -1) {
            strSubstring = strSubstring.substring(0, iIndexOf2);
        }
        String strSubstring2 = (String) this.f54474.get(i2);
        if (!C9679.m24615((CharSequence) strSubstring2) && (iIndexOf = strSubstring2.indexOf("/")) != -1) {
            strSubstring2 = strSubstring2.substring(0, iIndexOf);
        }
        return strSubstring.equals(strSubstring2);
    }

    @Override // l.AbstractC10771
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1335(int i, int i2) {
        return ((String) this.f54475.get(i)).equals(this.f54474.get(i2));
    }

    public C17829(List list, ArrayList arrayList) {
        this.f54475 = list;
        this.f54474 = arrayList;
    }
}
