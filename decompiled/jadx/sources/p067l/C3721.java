package p067l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.֨᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U7MS */
/* JADX INFO: loaded from: classes2.dex */
public final class C3721 {

    /* JADX INFO: renamed from: ֡ */
    public final String f7875;

    /* JADX INFO: renamed from: ֫ */
    public final Uri f7876;

    /* JADX INFO: renamed from: ۖ */
    public final long f7877;

    /* JADX INFO: renamed from: ۘ */
    public final AbstractC16192 f7878;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f7879;

    /* JADX INFO: renamed from: ۡ */
    public final long f7880;

    /* JADX INFO: renamed from: ۢ */
    public final long f7881;

    /* JADX INFO: renamed from: ۧ */
    public final Uri f7882;

    /* JADX INFO: renamed from: ܳ */
    public final long f7883;

    /* JADX INFO: renamed from: ܺ */
    public final AbstractC16192 f7884;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC16192 f7885;

    /* JADX INFO: renamed from: ܿ */
    public final List f7886;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f7887;

    /* JADX INFO: renamed from: ᩴ */
    public final long f7888;

    /* JADX INFO: renamed from: ᩵ */
    public final String f7889;

    /* JADX INFO: renamed from: ᩷ */
    public final String f7890;

    /* JADX INFO: renamed from: ᩻ */
    public final long f7891;

    public C3721(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3) {
        C23877.m52957((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f7890 = str;
        this.f7882 = uri;
        this.f7876 = uri2;
        this.f7888 = j;
        this.f7891 = j2;
        this.f7883 = j3;
        this.f7881 = j4;
        this.f7886 = arrayList;
        this.f7879 = z;
        this.f7877 = j5;
        this.f7880 = j6;
        this.f7878 = AbstractC16192.copyOf((Collection) arrayList2);
        this.f7884 = AbstractC16192.copyOf((Collection) arrayList3);
        this.f7885 = AbstractC16192.m36880(new C13712(1), arrayList4);
        this.f7887 = z2;
        this.f7889 = str2;
        this.f7875 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3721)) {
            return false;
        }
        C3721 c3721 = (C3721) obj;
        return this.f7888 == c3721.f7888 && this.f7891 == c3721.f7891 && this.f7883 == c3721.f7883 && this.f7881 == c3721.f7881 && this.f7879 == c3721.f7879 && this.f7877 == c3721.f7877 && this.f7880 == c3721.f7880 && this.f7887 == c3721.f7887 && C12826.equals(this.f7890, c3721.f7890) && C12826.equals(this.f7882, c3721.f7882) && C12826.equals(this.f7876, c3721.f7876) && C12826.equals(this.f7886, c3721.f7886) && C12826.equals(this.f7878, c3721.f7878) && C12826.equals(this.f7884, c3721.f7884) && C12826.equals(this.f7885, c3721.f7885) && C12826.equals(this.f7889, c3721.f7889) && C12826.equals(this.f7875, c3721.f7875);
    }

    public final int hashCode() {
        return C12826.hash(this.f7890, this.f7882, this.f7876, Long.valueOf(this.f7888), Long.valueOf(this.f7891), Long.valueOf(this.f7883), Long.valueOf(this.f7881), this.f7886, Boolean.valueOf(this.f7879), Long.valueOf(this.f7877), Long.valueOf(this.f7880), this.f7878, this.f7884, this.f7885, Boolean.valueOf(this.f7887), this.f7889, this.f7875);
    }
}
