package p067l;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: A7N6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16815 {

    /* JADX INFO: renamed from: ֡ */
    public final C22498 f49541;

    /* JADX INFO: renamed from: ֨ */
    public InterfaceC11617 f49542;

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC22753 f49543;

    /* JADX INFO: renamed from: ۖ */
    public final C10307[] f49544;

    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC18885 f49545;

    /* JADX INFO: renamed from: ۚ */
    public final C15020 f49546;

    /* JADX INFO: renamed from: ۡ */
    public Uri f49548;

    /* JADX INFO: renamed from: ۢ */
    public final List f49549;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC23522 f49550;

    /* JADX INFO: renamed from: ܺ */
    public final C15512 f49552;

    /* JADX INFO: renamed from: ܽ */
    public C10514 f49553;

    /* JADX INFO: renamed from: ܿ */
    public boolean f49554;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f49555;

    /* JADX INFO: renamed from: ᩴ */
    public final Uri[] f49556;

    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC22753 f49558;

    /* JADX INFO: renamed from: ᩻ */
    public Uri f49559;

    /* JADX INFO: renamed from: ܳ */
    public final C20170 f49551 = new C20170();

    /* JADX INFO: renamed from: ᩵ */
    public byte[] f49557 = C5792.f14227;

    /* JADX INFO: renamed from: ۜ */
    public long f49547 = -9223372036854775807L;

    public C16815(InterfaceC23522 interfaceC23522, InterfaceC18885 interfaceC18885, Uri[] uriArr, C10307[] c10307Arr, InterfaceC22852 interfaceC22852, InterfaceC2830 interfaceC2830, C22498 c22498, List list, C15512 c15512) {
        this.f49550 = interfaceC23522;
        this.f49545 = interfaceC18885;
        this.f49556 = uriArr;
        this.f49544 = c10307Arr;
        this.f49541 = c22498;
        this.f49549 = list;
        this.f49552 = c15512;
        InterfaceC22753 interfaceC22753Mo8240 = interfaceC22852.mo8240(1);
        this.f49558 = interfaceC22753Mo8240;
        if (interfaceC2830 != null) {
            interfaceC22753Mo8240.mo8132(interfaceC2830);
        }
        this.f49543 = interfaceC22852.mo8240(3);
        this.f49546 = new C15020("", c10307Arr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((c10307Arr[i].f28522 & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.f49542 = new C3405(this.f49546, C15129.m34551(arrayList));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m38106() throws C10514 {
        C10514 c10514 = this.f49553;
        if (c10514 != null) {
            throw c10514;
        }
        Uri uri = this.f49559;
        if (uri == null || !uri.equals(this.f49548)) {
            return;
        }
        this.f49545.mo11231(this.f49559);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15020 m38092() {
        return this.f49546;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m38104() {
        return this.f49555;
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC11617 m38103() {
        return this.f49542;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38096(boolean z) {
        this.f49554 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m38091(long j, C11491 c11491) {
        int iMo6029 = this.f49542.mo6029();
        Uri[] uriArr = this.f49556;
        int length = uriArr.length;
        InterfaceC18885 interfaceC18885 = this.f49545;
        C7074 c7074Mo11225 = (iMo6029 >= length || iMo6029 == -1) ? null : interfaceC18885.mo11225(uriArr[this.f49542.mo4761()], true);
        if (c7074Mo11225 != null) {
            AbstractC16192 abstractC16192 = c7074Mo11225.f18427;
            if (!abstractC16192.isEmpty()) {
                long jMo11224 = c7074Mo11225.f18433 - interfaceC18885.mo11224();
                long j2 = j - jMo11224;
                int iM12985 = C5792.m12985((List) abstractC16192, Long.valueOf(j2), true);
                long j3 = ((C23168) abstractC16192.get(iM12985)).f75743;
                return c11491.m26546(j2, j3, (!c7074Mo11225.f34778 || iM12985 == abstractC16192.size() - 1) ? j3 : ((C23168) abstractC16192.get(iM12985 + 1)).f75743) + jMo11224;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m38090(C21511 c21511) {
        AbstractC16192 abstractC16192;
        int i = c21511.f67864;
        if (i == -1) {
            return 1;
        }
        C7074 c7074Mo11225 = this.f49545.mo11225(this.f49556[this.f49546.m34394(c21511.f26379)], false);
        c7074Mo11225.getClass();
        AbstractC16192 abstractC16193 = c7074Mo11225.f18427;
        int i2 = (int) (c21511.f36524 - c7074Mo11225.f18434);
        if (i2 < 0) {
            return 1;
        }
        if (i2 < abstractC16193.size()) {
            abstractC16192 = ((C23168) abstractC16193.get(i2)).f72778;
        } else {
            abstractC16192 = c7074Mo11225.f18444;
        }
        if (i >= abstractC16192.size()) {
            return 2;
        }
        C10427 c10427 = (C10427) abstractC16192.get(i);
        if (c10427.f28831) {
            return 0;
        }
        return C12826.equals(Uri.parse(C10486.m24196(c7074Mo11225.f34777, c10427.f75749)), c21511.f26378.f12514) ? 1 : 2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m38102(C21511 c21511) {
        AbstractC16192 abstractC16192;
        int i = c21511.f67864;
        C23877.m52960(i != -1);
        C7074 c7074Mo11225 = this.f49545.mo11225(this.f49556[this.f49546.m34394(c21511.f26379)], false);
        c7074Mo11225.getClass();
        AbstractC16192 abstractC16193 = c7074Mo11225.f18427;
        int i2 = (int) (c21511.f36524 - c7074Mo11225.f18434);
        if (i2 < 0) {
            return 0L;
        }
        if (i2 < abstractC16193.size()) {
            abstractC16192 = ((C23168) abstractC16193.get(i2)).f72778;
        } else {
            abstractC16192 = c7074Mo11225.f18444;
        }
        return ((C10427) abstractC16192.get(i)).f75740;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38095(C13268 c13268, long j, long j2, List list, boolean z, C2734 c2734) {
        long j3;
        Uri uri;
        boolean z2;
        String str;
        C10111 c10111M38088;
        C21511 c21511 = list.isEmpty() ? null : (C21511) C10810.m24926(list);
        int iM34394 = c21511 == null ? -1 : this.f49546.m34394(c21511.f26379);
        long j4 = c13268.f37251;
        long jMax = j - j4;
        long j5 = this.f49547;
        long jMax2 = j5 != -9223372036854775807L ? j5 - j4 : -9223372036854775807L;
        if (c21511 == null || this.f49555) {
            j3 = -9223372036854775807L;
        } else {
            long j6 = c21511.f26380 - c21511.f26381;
            jMax = Math.max(0L, jMax - j6);
            j3 = -9223372036854775807L;
            if (jMax2 != -9223372036854775807L) {
                jMax2 = Math.max(0L, jMax2 - j6);
            }
        }
        this.f49542.mo6030(j4, jMax, jMax2, list, m38101(c21511, j));
        int iMo4761 = this.f49542.mo4761();
        boolean z3 = iM34394 != iMo4761;
        Uri[] uriArr = this.f49556;
        Uri uri2 = uriArr[iMo4761];
        InterfaceC18885 interfaceC18885 = this.f49545;
        if (!interfaceC18885.mo11236(uri2)) {
            c2734.f4597 = uri2;
            this.f49548 = uri2;
            return;
        }
        C7074 c7074Mo11225 = interfaceC18885.mo11225(uri2, true);
        c7074Mo11225.getClass();
        long j7 = c7074Mo11225.f18433;
        this.f49555 = c7074Mo11225.f34778;
        this.f49547 = c7074Mo11225.f18446 ? j3 : (c7074Mo11225.f18439 + j7) - interfaceC18885.mo11224();
        long jMo11224 = j7 - interfaceC18885.mo11224();
        C7074 c7074 = c7074Mo11225;
        Pair pairM38086 = m38086(c21511, z3, c7074Mo11225, jMo11224, j);
        long jLongValue = ((Long) pairM38086.first).longValue();
        int iIntValue = ((Integer) pairM38086.second).intValue();
        if (z3 && c21511 != null && (jLongValue < c7074.f18434 || ((c10111M38088 = m38088(c7074, jLongValue, iIntValue)) != null && c10111M38088.f28050.f75743 + jMo11224 < j2))) {
            Uri uri3 = uriArr[iM34394];
            C7074 c7074Mo11226 = interfaceC18885.mo11225(uri3, true);
            c7074Mo11226.getClass();
            jMo11224 = c7074Mo11226.f18433 - interfaceC18885.mo11224();
            Pair pairM38087 = m38086(c21511, false, c7074Mo11226, jMo11224, j);
            jLongValue = ((Long) pairM38087.first).longValue();
            iIntValue = ((Integer) pairM38087.second).intValue();
            uri = uri3;
            c7074 = c7074Mo11226;
            iMo4761 = iM34394;
        } else {
            uri = uri2;
        }
        String str2 = c7074.f34777;
        boolean z4 = c7074.f34778;
        long j8 = c7074.f18434;
        AbstractC16192 abstractC16192 = c7074.f18427;
        if (iMo4761 != iM34394 && iM34394 != -1) {
            interfaceC18885.mo11226(uriArr[iM34394]);
        }
        if (jLongValue < j8) {
            this.f49553 = new C10514();
            return;
        }
        C10111 c10111M38089 = m38088(c7074, jLongValue, iIntValue);
        if (c10111M38089 == null) {
            if (!c7074.f18446) {
                c2734.f4597 = uri;
                this.f49548 = uri;
                return;
            } else {
                if (z || abstractC16192.isEmpty()) {
                    c2734.f4596 = true;
                    return;
                }
                c10111M38089 = new C10111((C23838) C10810.m24926(abstractC16192), (j8 + ((long) abstractC16192.size())) - 1, -1);
            }
        }
        C10111 c10111 = c10111M38089;
        C23838 c23838 = c10111.f28050;
        this.f49548 = null;
        SystemClock.elapsedRealtime();
        C23168 c23168 = c23838.f75742;
        Uri uriM24199 = (c23168 == null || (str = c23168.f75745) == null) ? null : C10486.m24199(str2, str);
        AbstractC9584 abstractC9584M38087 = m38087(uriM24199, iMo4761, true);
        c2734.f4595 = abstractC9584M38087;
        if (abstractC9584M38087 != null) {
            return;
        }
        String str3 = c23838.f75745;
        Uri uriM241910 = str3 != null ? C10486.m24199(str2, str3) : null;
        boolean z5 = false;
        AbstractC9584 abstractC9584M38088 = m38087(uriM241910, iMo4761, false);
        c2734.f4595 = abstractC9584M38088;
        if (abstractC9584M38088 != null) {
            return;
        }
        if (c23838 instanceof C10427) {
            if (((C10427) c23838).f28832 || (c10111.f28049 == 0 && z4)) {
                z5 = true;
            }
            z2 = z5;
        } else {
            z2 = z4;
        }
        boolean zM48706 = C21511.m48706(c21511, j, uri, z2, c10111, jMo11224);
        if (zM48706 && c10111.f28047) {
            return;
        }
        int iMo6032 = this.f49542.mo6032();
        Object objMo6031 = this.f49542.mo6031();
        boolean z6 = this.f49554;
        C20170 c20170 = this.f49551;
        c2734.f4595 = C21511.m48704(this.f49550, this.f49558, this.f49544[iMo4761], jMo11224, c7074, c10111, uri, this.f49549, iMo6032, objMo6031, z6, this.f49541, c21511, c20170.m45649(uriM241910), c20170.m45649(uriM24199), zM48706, z2, this.f49552);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10111 m38088(C7074 c7074, long j, int i) {
        long j2 = c7074.f18434;
        AbstractC16192 abstractC16192 = c7074.f18444;
        int i2 = (int) (j - j2);
        AbstractC16192 abstractC16193 = c7074.f18427;
        if (i2 == abstractC16193.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < abstractC16192.size()) {
                return new C10111((C23838) abstractC16192.get(i), j, i);
            }
            return null;
        }
        C23168 c23168 = (C23168) abstractC16193.get(i2);
        if (i == -1) {
            return new C10111(c23168, j, -1);
        }
        if (i < c23168.f72778.size()) {
            return new C10111((C23838) c23168.f72778.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < abstractC16193.size()) {
            return new C10111((C23838) abstractC16193.get(i3), j + 1, -1);
        }
        if (abstractC16192.isEmpty()) {
            return null;
        }
        return new C10111((C23838) abstractC16192.get(0), j + 1, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38093(AbstractC9584 abstractC9584) {
        if (abstractC9584 instanceof C20841) {
            C20841 c20841 = (C20841) abstractC9584;
            this.f49557 = c20841.m8654();
            Uri uri = c20841.f26378.f12514;
            byte[] bArrM47073 = c20841.m47073();
            bArrM47073.getClass();
            this.f49551.m45648(uri, bArrM47073);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38100(AbstractC9584 abstractC9584, long j) {
        InterfaceC11617 interfaceC11617 = this.f49542;
        return interfaceC11617.mo4756(interfaceC11617.indexOf(this.f49546.m34394(abstractC9584.f26379)), j);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38099(Uri uri, long j) {
        int iIndexOf;
        int i = 0;
        while (true) {
            Uri[] uriArr = this.f49556;
            if (i >= uriArr.length) {
                i = -1;
                break;
            }
            if (uriArr[i].equals(uri)) {
                break;
            }
            i++;
        }
        if (i == -1 || (iIndexOf = this.f49542.indexOf(i)) == -1) {
            return true;
        }
        this.f49559 = uri;
        return j != -9223372036854775807L && this.f49542.mo4756(iIndexOf, j) && this.f49545.mo11229(uri, j);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19683[] m38101(C21511 c21511, long j) {
        List listM36872of;
        int iM34394 = c21511 == null ? -1 : this.f49546.m34394(c21511.f26379);
        int length = this.f49542.length();
        InterfaceC19683[] interfaceC19683Arr = new InterfaceC19683[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int iMo4755 = this.f49542.mo4755(i);
            Uri uri = this.f49556[iMo4755];
            InterfaceC18885 interfaceC18885 = this.f49545;
            if (!interfaceC18885.mo11236(uri)) {
                interfaceC19683Arr[i] = InterfaceC19683.f59831;
            } else {
                C7074 c7074Mo11225 = interfaceC18885.mo11225(uri, z);
                c7074Mo11225.getClass();
                long jMo11224 = c7074Mo11225.f18433 - interfaceC18885.mo11224();
                Pair pairM38086 = m38086(c21511, iMo4755 != iM34394, c7074Mo11225, jMo11224, j);
                long jLongValue = ((Long) pairM38086.first).longValue();
                int iIntValue = ((Integer) pairM38086.second).intValue();
                long j2 = c7074Mo11225.f18434;
                AbstractC16192 abstractC16192 = c7074Mo11225.f18444;
                AbstractC16192 abstractC16193 = c7074Mo11225.f18427;
                int i2 = (int) (jLongValue - j2);
                if (i2 < 0 || abstractC16193.size() < i2) {
                    listM36872of = AbstractC16192.m36872of();
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < abstractC16193.size()) {
                        if (iIntValue != -1) {
                            C23168 c23168 = (C23168) abstractC16193.get(i2);
                            if (iIntValue == 0) {
                                arrayList.add(c23168);
                            } else if (iIntValue < c23168.f72778.size()) {
                                AbstractC16192 abstractC16194 = c23168.f72778;
                                arrayList.addAll(abstractC16194.subList(iIntValue, abstractC16194.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(abstractC16193.subList(i2, abstractC16193.size()));
                        iIntValue = 0;
                    }
                    if (c7074Mo11225.f18438 != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < abstractC16192.size()) {
                            arrayList.addAll(abstractC16192.subList(iIntValue, abstractC16192.size()));
                        }
                    }
                    listM36872of = C21562.unmodifiableList(arrayList);
                }
                interfaceC19683Arr[i] = new C7429(jMo11224, listM36872of);
            }
            i++;
            z = false;
        }
        return interfaceC19683Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m38089(long j, List list) {
        if (this.f49553 != null || this.f49542.length() < 2) {
            return list.size();
        }
        return this.f49542.mo4746(j, list);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38097(long j, AbstractC9584 abstractC9584, List list) {
        if (this.f49553 != null) {
            return false;
        }
        return this.f49542.mo4752(j, abstractC9584, list);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38098(Uri uri) {
        return C5792.m13005(uri, this.f49556);
    }

    /* JADX INFO: renamed from: ֫ */
    private Pair m38086(C21511 c21511, boolean z, C7074 c7074, long j, long j2) {
        boolean z2 = true;
        if (c21511 != null) {
            long j3 = c21511.f36524;
            int i = c21511.f67864;
            if (!z) {
                if (c21511.m48715()) {
                    if (i == -1) {
                        j3 = j3 != -1 ? j3 + 1 : -1L;
                    }
                    return new Pair(Long.valueOf(j3), Integer.valueOf(i != -1 ? i + 1 : -1));
                }
                return new Pair(Long.valueOf(j3), Integer.valueOf(i));
            }
        }
        long j4 = c7074.f18439;
        AbstractC16192 abstractC16192 = c7074.f18444;
        long j5 = c7074.f18434;
        AbstractC16192 abstractC16193 = c7074.f18427;
        long j6 = j4 + j;
        if (c21511 != null && !this.f49555) {
            j2 = c21511.f26381;
        }
        if (!c7074.f18446 && j2 >= j6) {
            return new Pair(Long.valueOf(j5 + ((long) abstractC16193.size())), -1);
        }
        long j7 = j2 - j;
        Long lValueOf = Long.valueOf(j7);
        int i2 = 0;
        if (this.f49545.mo11234() && c21511 != null) {
            z2 = false;
        }
        int iM12985 = C5792.m12985(abstractC16193, lValueOf, z2);
        long j8 = ((long) iM12985) + j5;
        if (iM12985 >= 0) {
            C23168 c23168 = (C23168) abstractC16193.get(iM12985);
            AbstractC16192 abstractC16194 = j7 < c23168.f75743 + c23168.f75740 ? c23168.f72778 : abstractC16192;
            while (i2 < abstractC16194.size()) {
                C10427 c10427 = (C10427) abstractC16194.get(i2);
                if (j7 >= c10427.f75743 + c10427.f75740) {
                    i2++;
                } else if (c10427.f28832) {
                    j8 += abstractC16194 == abstractC16192 ? 1L : 0L;
                }
            }
            i2 = -1;
        } else {
            i2 = -1;
        }
        return new Pair(Long.valueOf(j8), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC9584 m38087(Uri uri, int i, boolean z) {
        if (uri == null) {
            return null;
        }
        C20170 c20170 = this.f49551;
        byte[] bArrM45650 = c20170.m45650(uri);
        if (bArrM45650 != null) {
            c20170.m45648(uri, bArrM45650);
            return null;
        }
        C6659 c6659 = new C6659();
        c6659.m15164(uri);
        c6659.m15162(1);
        return new C20841(this.f49543, c6659.m15161(), this.f49544[i], this.f49542.mo6032(), this.f49542.mo6031(), this.f49557);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38094(InterfaceC11617 interfaceC11617) {
        this.f49545.mo11226(this.f49556[this.f49542.mo4761()]);
        this.f49542 = interfaceC11617;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m38105() {
        this.f49545.mo11226(this.f49556[this.f49542.mo4761()]);
        this.f49553 = null;
    }
}
