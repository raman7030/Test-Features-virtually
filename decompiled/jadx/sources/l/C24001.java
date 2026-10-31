package l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩻᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 27NH */
/* JADX INFO: loaded from: classes.dex */
public final class C24001 implements InterfaceC14723 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f77790;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f77791;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f77792;

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C8353 mo1025() {
        return null;
    }

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo1026(C18252 c18252) {
    }

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ byte[] mo1027() {
        return null;
    }

    public C24001(String str, String str2, List list) {
        this.f77790 = str;
        this.f77791 = str2;
        this.f77792 = C20195.unmodifiableList(new ArrayList(list));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f77790;
        sb.append(str != null ? C9045.m23341(C3200.m9834(" [", str, ", "), this.f77791, "]") : "");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C24001.class == obj.getClass()) {
            C24001 c24001 = (C24001) obj;
            if (TextUtils.equals(this.f77790, c24001.f77790) && TextUtils.equals(this.f77791, c24001.f77791) && this.f77792.equals(c24001.f77792)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f77790;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f77791;
        return this.f77792.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
