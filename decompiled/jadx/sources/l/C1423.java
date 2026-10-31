package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.֨᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U7MS */
/* JADX INFO: loaded from: classes2.dex */
public final class C1423 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f5102;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Uri f5103;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f5104;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f5105;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f5106;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long f5107;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f5108;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Uri f5109;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f5110;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f5111;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f5112;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List f5113;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f5114;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f5115;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String f5116;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f5117;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f5118;

    public C1423(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3) {
        C22632.m50631((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f5117 = str;
        this.f5109 = uri;
        this.f5103 = uri2;
        this.f5115 = j;
        this.f5118 = j2;
        this.f5110 = j3;
        this.f5108 = j4;
        this.f5113 = arrayList;
        this.f5106 = z;
        this.f5104 = j5;
        this.f5107 = j6;
        this.f5105 = AbstractC14545.copyOf((Collection) arrayList2);
        this.f5111 = AbstractC14545.copyOf((Collection) arrayList3);
        this.f5112 = AbstractC14545.m34731(new C11935(1), arrayList4);
        this.f5114 = z2;
        this.f5116 = str2;
        this.f5102 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1423)) {
            return false;
        }
        C1423 c1423 = (C1423) obj;
        return this.f5115 == c1423.f5115 && this.f5118 == c1423.f5118 && this.f5110 == c1423.f5110 && this.f5108 == c1423.f5108 && this.f5106 == c1423.f5106 && this.f5104 == c1423.f5104 && this.f5107 == c1423.f5107 && this.f5114 == c1423.f5114 && C11003.equals(this.f5117, c1423.f5117) && C11003.equals(this.f5109, c1423.f5109) && C11003.equals(this.f5103, c1423.f5103) && C11003.equals(this.f5113, c1423.f5113) && C11003.equals(this.f5105, c1423.f5105) && C11003.equals(this.f5111, c1423.f5111) && C11003.equals(this.f5112, c1423.f5112) && C11003.equals(this.f5116, c1423.f5116) && C11003.equals(this.f5102, c1423.f5102);
    }

    public final int hashCode() {
        return C11003.hash(this.f5117, this.f5109, this.f5103, Long.valueOf(this.f5115), Long.valueOf(this.f5118), Long.valueOf(this.f5110), Long.valueOf(this.f5108), this.f5113, Boolean.valueOf(this.f5106), Long.valueOf(this.f5104), Long.valueOf(this.f5107), this.f5105, this.f5111, this.f5112, Boolean.valueOf(this.f5114), this.f5116, this.f5102);
    }
}
