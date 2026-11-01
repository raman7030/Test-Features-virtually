package p067l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U7MS */
/* JADX INFO: loaded from: classes2.dex */
public final class C7745 {

    /* JADX INFO: renamed from: ֡ */
    public String f20295;

    /* JADX INFO: renamed from: ֫ */
    public Uri f20296;

    /* JADX INFO: renamed from: ۜ */
    public boolean f20299;

    /* JADX INFO: renamed from: ۧ */
    public Uri f20302;

    /* JADX INFO: renamed from: ᩳ */
    public Boolean f20307;

    /* JADX INFO: renamed from: ᩵ */
    public String f20309;

    /* JADX INFO: renamed from: ᩷ */
    public final String f20310;

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f20305 = new HashMap();

    /* JADX INFO: renamed from: ᩴ */
    public long f20308 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩻ */
    public long f20311 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܳ */
    public long f20303 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۢ */
    public long f20301 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܿ */
    public ArrayList f20306 = new ArrayList();

    /* JADX INFO: renamed from: ۖ */
    public long f20297 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۡ */
    public long f20300 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۘ */
    public ArrayList f20298 = new ArrayList();

    /* JADX INFO: renamed from: ܺ */
    public ArrayList f20304 = new ArrayList();

    public C7745(String str) {
        this.f20310 = str;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17887(Uri uri) {
        if (uri == null) {
            return;
        }
        Uri uri2 = this.f20302;
        if (uri2 != null) {
            C23877.m52956("Can't change assetUri from " + this.f20302 + " to " + uri, uri2.equals(uri));
        }
        this.f20302 = uri;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17881(Uri uri) {
        if (uri == null) {
            return;
        }
        Uri uri2 = this.f20296;
        if (uri2 != null) {
            C23877.m52956("Can't change assetListUri from " + this.f20296 + " to " + uri, uri2.equals(uri));
        }
        this.f20296 = uri;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m17890(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f20308;
        if (j2 != -9223372036854775807L) {
            C23877.m52956("Can't change startDateUnixUs from " + this.f20308 + " to " + j, j2 == j);
        }
        this.f20308 = j;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17886(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f20311;
        if (j2 != -9223372036854775807L) {
            C23877.m52956("Can't change endDateUnixUs from " + this.f20311 + " to " + j, j2 == j);
        }
        this.f20311 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17880(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f20303;
        if (j2 != -9223372036854775807L) {
            C23877.m52956("Can't change durationUs from " + this.f20303 + " to " + j, j2 == j);
        }
        this.f20303 = j;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m17891(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f20301;
        if (j2 != -9223372036854775807L) {
            C23877.m52956("Can't change plannedDurationUs from " + this.f20301 + " to " + j, j2 == j);
        }
        this.f20301 = j;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17889(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (!this.f20306.isEmpty()) {
            boolean zEquals = this.f20306.equals(arrayList);
            StringBuilder sb = new StringBuilder("Can't change cue from ");
            ArrayList arrayList2 = this.f20306;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    } else {
                        sb2.append((CharSequence) ", ");
                    }
                }
            }
            sb.append(sb2.toString());
            sb.append(" to ");
            StringBuilder sb3 = new StringBuilder();
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb3.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        sb3.append((CharSequence) ", ");
                    }
                }
            }
            sb.append(sb3.toString());
            C23877.m52956(sb.toString(), zEquals);
        }
        this.f20306 = arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17885(boolean z) {
        if (z) {
            this.f20299 = true;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m17893(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f20297;
        if (j2 != -9223372036854775807L) {
            C23877.m52956("Can't change resumeOffsetUs from " + this.f20297 + " to " + j, j2 == j);
        }
        this.f20297 = j;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m17894(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f20300;
        if (j2 != -9223372036854775807L) {
            C23877.m52956("Can't change playoutLimitUs from " + this.f20300 + " to " + j, j2 == j);
        }
        this.f20300 = j;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m17895(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (!this.f20298.isEmpty()) {
            boolean zEquals = this.f20298.equals(arrayList);
            StringBuilder sb = new StringBuilder("Can't change snapTypes from ");
            ArrayList arrayList2 = this.f20298;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    } else {
                        sb2.append((CharSequence) ", ");
                    }
                }
            }
            sb.append(sb2.toString());
            sb.append(" to ");
            StringBuilder sb3 = new StringBuilder();
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb3.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        sb3.append((CharSequence) ", ");
                    }
                }
            }
            sb.append(sb3.toString());
            C23877.m52956(sb.toString(), zEquals);
        }
        this.f20298 = arrayList;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m17892(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (!this.f20304.isEmpty()) {
            boolean zEquals = this.f20304.equals(arrayList);
            StringBuilder sb = new StringBuilder("Can't change restrictions from ");
            ArrayList arrayList2 = this.f20304;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    } else {
                        sb2.append((CharSequence) ", ");
                    }
                }
            }
            sb.append(sb2.toString());
            sb.append(" to ");
            StringBuilder sb3 = new StringBuilder();
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb3.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        sb3.append((CharSequence) ", ");
                    }
                }
            }
            sb.append(sb3.toString());
            C23877.m52956(sb.toString(), zEquals);
        }
        this.f20304 = arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17884(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C3050 c3050 = (C3050) arrayList.get(i);
            String str = c3050.f5475;
            HashMap map = this.f20305;
            C3050 c3051 = (C3050) map.get(str);
            if (c3051 != null) {
                boolean zEquals = c3051.equals(c3050);
                StringBuilder sbM11879 = C5410.m11879("Can't change ", str, " from ");
                sbM11879.append(c3051.f5476);
                sbM11879.append(" ");
                sbM11879.append(c3051.f5474);
                sbM11879.append(" to ");
                sbM11879.append(c3050.f5476);
                sbM11879.append(" ");
                sbM11879.append(c3050.f5474);
                C23877.m52956(sbM11879.toString(), zEquals);
            }
            map.put(str, c3050);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17882(Boolean bool) {
        if (bool == null) {
            return;
        }
        Boolean bool2 = this.f20307;
        if (bool2 != null) {
            C23877.m52956("Can't change contentMayVary from " + this.f20307 + " to " + bool, bool2.equals(bool));
        }
        this.f20307 = bool;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17883(String str) {
        if (str == null) {
            return;
        }
        String str2 = this.f20309;
        if (str2 != null) {
            C23877.m52956("Can't change timelineOccupies from " + this.f20309 + " to " + str, str2.equals(str));
        }
        this.f20309 = str;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17888(String str) {
        if (str == null) {
            return;
        }
        String str2 = this.f20295;
        if (str2 != null) {
            C23877.m52956("Can't change timelineStyle from " + this.f20295 + " to " + str, str2.equals(str));
        }
        this.f20295 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3721 m17879() {
        Uri uri = this.f20296;
        if ((uri != null || this.f20302 == null) && (uri == null || this.f20302 != null)) {
            return null;
        }
        long j = this.f20308;
        if (j == -9223372036854775807L) {
            return null;
        }
        Uri uri2 = this.f20302;
        long j2 = this.f20311;
        long j3 = this.f20303;
        long j4 = this.f20301;
        ArrayList arrayList = this.f20306;
        boolean z = this.f20299;
        long j5 = this.f20297;
        long j6 = this.f20300;
        ArrayList arrayList2 = this.f20298;
        ArrayList arrayList3 = this.f20304;
        ArrayList arrayList4 = new ArrayList(this.f20305.values());
        Boolean bool = this.f20307;
        boolean z2 = bool == null || bool.booleanValue();
        String str = this.f20309;
        if (str == null) {
            str = "POINT";
        }
        String str2 = str;
        String str3 = this.f20295;
        if (str3 == null) {
            str3 = "HIGHLIGHT";
        }
        return new C3721(this.f20310, uri2, uri, j, j2, j3, j4, arrayList, z, j5, j6, arrayList2, arrayList3, arrayList4, z2, str2, str3);
    }
}
