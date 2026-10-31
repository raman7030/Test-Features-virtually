package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: JAK2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7706 extends AbstractC7548 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f23801;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f23802;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f23803;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C18090 f23804;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C21818 f23805;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f23806;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f23807;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22022 f23808;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f23809;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC14306 f23810;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11667 f23811;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1607 f23812;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f23813;

    public C7706(C1607 c1607, C11667 c11667, boolean z, HashSet hashSet, ArrayList arrayList, boolean z2, long j, HashSet hashSet2, RunnableC14306 runnableC14306) {
        this.f23812 = c1607;
        this.f23811 = c11667;
        this.f23803 = z;
        this.f23802 = hashSet;
        this.f23809 = arrayList;
        this.f23807 = z2;
        this.f23801 = j;
        this.f23806 = hashSet2;
        this.f23810 = runnableC14306;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C22022 c22022 = new C22022(this.f23812.f5665.m39056());
        c22022.m49558(R.string.MT_Protector);
        c22022.m49556("...");
        c22022.mo49542((Runnable) null);
        c22022.m49548();
        this.f23808 = c22022;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C1607 c1607 = this.f23812;
        this.f23804 = new C18090(c1607.f5664);
        AbstractC15440 abstractC15440 = c1607.f5664;
        C11667 c11667 = this.f23811;
        C21818 c21818M50499 = C22523.m50499(abstractC15440, c11667 != null);
        this.f23805 = c21818M50499;
        C8918 c8918M49176 = c21818M50499.m49176();
        if (c11667 == null && this.f23803 && this.f23804.m42201()) {
            c8918M49176.m23016(this.f23804);
        }
        if (this.f23804.m42212()) {
            c8918M49176.m23025();
        }
        Collection collectionM42210 = this.f23804.m42210();
        C14055 c14055 = new C14055(this, C22523.m50496(collectionM42210));
        Iterator it = collectionM42210.iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            HashSet hashSet = this.f23806;
            boolean z = this.f23807;
            long j = this.f23801;
            ArrayList arrayList = this.f23809;
            if (zHasNext) {
                C3545 c3545 = (C3545) it.next();
                if (this.f23808.m51053()) {
                    return;
                }
                if (!this.f23802.contains(c3545.getName())) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            String str = (String) it2.next();
                            if (z) {
                                if (c3545.getName().startsWith(str)) {
                                    c3545.setTime(j);
                                    if (c3545.isDirectory()) {
                                        hashSet.add(c3545.getName());
                                    }
                                }
                            } else if (c3545.getName().equals(str)) {
                                c3545.setTime(j);
                                if (c3545.isDirectory()) {
                                    hashSet.add(c3545.getName());
                                }
                            }
                        }
                    }
                } else {
                    c3545.setTime(j);
                    if (c3545.isDirectory()) {
                        hashSet.add(c3545.getName());
                    }
                }
                i++;
                this.f23808.m49554(C4925.m14327(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i + "/" + collectionM42210.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                this.f23808.m49556(c3545.getName());
                if (c3545.isDirectory()) {
                    c8918M49176.m23013(c3545);
                } else {
                    C22523.m50503(c3545, this.f23804, c8918M49176, c14055);
                    this.f23813 = c3545.m10793() + this.f23813;
                }
            } else {
                C6022.m16849(true);
                if (arrayList.contains("META-INF/")) {
                    C6022.m16846(new C11940(j));
                }
                if (!z) {
                    arrayList.removeAll(hashSet);
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        C3545 c3546 = new C3545((String) it3.next());
                        c3546.setTime(j);
                        c8918M49176.m23013(c3546);
                    }
                }
                this.f23808.m49553(100);
                this.f23808.m49550(100);
                c8918M49176.close();
                if (c11667 != null) {
                    C10025.m25193(c1607.f5665.m39056(), this.f23805, c11667, this.f23808);
                }
                C18838.m43524(c1607.f5664);
                C17558 c17558 = new C17558();
                c17558.m41050(c1607.f5664);
                this.f23805.m49175(c1607.f5664, new Runnable() { // from class: l.᩺᩶᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7706 c7706 = this.f74645;
                        c7706.f23808.m49558(R.string.MT_Protector);
                        c7706.f23808.m49556(c7706.f23812.f5664.getName());
                    }
                }, this.f23804);
                c17558.m41052(c1607.f5664);
                return;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (!this.f23808.m51053()) {
            this.f23812.f5665.m39015();
            this.f23810.run();
            return;
        }
        C21818 c21818 = this.f23805;
        if (c21818 != null) {
            C0349.m1793(c21818.m49176());
            this.f23805.m49174().mo23552();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C21818 c21818 = this.f23805;
        if (c21818 != null) {
            C0349.m1793(c21818.m49176());
            this.f23805.m49174().mo23552();
        }
        this.f23812.f5665.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C6022.m16849(false);
        C6022.m16846((C11940) null);
        this.f23808.m51051();
        C0349.m1793(this.f23804);
        C15528.m36596();
    }
}
