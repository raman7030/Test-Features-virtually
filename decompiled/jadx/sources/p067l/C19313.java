package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes5.dex */
public final class C19313 extends AbstractC12605 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ArrayList f57670;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ List f57671;

    @Override // p067l.AbstractC12605
    /* JADX INFO: renamed from: ۧ */
    public final int mo3749() {
        return this.f57671.size();
    }

    @Override // p067l.AbstractC12605
    /* JADX INFO: renamed from: ֫ */
    public final int mo3747() {
        return this.f57670.size();
    }

    @Override // p067l.AbstractC12605
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo3750(int i, int i2) {
        int iIndexOf;
        int iIndexOf2;
        String strSubstring = (String) this.f57671.get(i);
        if (!C11567.m26629((CharSequence) strSubstring) && (iIndexOf2 = strSubstring.indexOf("/")) != -1) {
            strSubstring = strSubstring.substring(0, iIndexOf2);
        }
        String strSubstring2 = (String) this.f57670.get(i2);
        if (!C11567.m26629((CharSequence) strSubstring2) && (iIndexOf = strSubstring2.indexOf("/")) != -1) {
            strSubstring2 = strSubstring2.substring(0, iIndexOf);
        }
        return strSubstring.equals(strSubstring2);
    }

    @Override // p067l.AbstractC12605
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3748(int i, int i2) {
        return ((String) this.f57671.get(i)).equals(this.f57670.get(i2));
    }

    public C19313(List list, ArrayList arrayList) {
        this.f57671 = list;
        this.f57670 = arrayList;
    }
}
