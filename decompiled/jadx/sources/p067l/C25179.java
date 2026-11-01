package p067l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩻᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 27NH */
/* JADX INFO: loaded from: classes.dex */
public final class C25179 implements InterfaceC16361 {

    /* JADX INFO: renamed from: ֫ */
    public final String f80542;

    /* JADX INFO: renamed from: ۧ */
    public final String f80543;

    /* JADX INFO: renamed from: ܽ */
    public final List f80544;

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C10307 mo3421() {
        return null;
    }

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo3422(C19715 c19715) {
    }

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ byte[] mo3423() {
        return null;
    }

    public C25179(String str, String str2, List list) {
        this.f80542 = str;
        this.f80543 = str2;
        this.f80544 = C21562.unmodifiableList(new ArrayList(list));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f80542;
        sb.append(str != null ? C10965.m25286(C5410.m11879(" [", str, ", "), this.f80543, "]") : "");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C25179.class == obj.getClass()) {
            C25179 c25179 = (C25179) obj;
            if (TextUtils.equals(this.f80542, c25179.f80542) && TextUtils.equals(this.f80543, c25179.f80543) && this.f80544.equals(c25179.f80544)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f80542;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f80543;
        return this.f80544.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
