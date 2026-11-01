package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۟᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: JAK2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9693 extends AbstractC9542 {

    /* JADX INFO: renamed from: ֡ */
    public final /* synthetic */ long f26715;

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ HashSet f26716;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ boolean f26717;

    /* JADX INFO: renamed from: ۚ */
    public C19561 f26718;

    /* JADX INFO: renamed from: ۜ */
    public C23105 f26719;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ HashSet f26720;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ boolean f26721;

    /* JADX INFO: renamed from: ܳ */
    public C23298 f26722;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ ArrayList f26723;

    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ RunnableC15965 f26724;

    /* JADX INFO: renamed from: ᩵ */
    public final /* synthetic */ C13457 f26725;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C3896 f26726;

    /* JADX INFO: renamed from: ᩻ */
    public long f26727;

    public C9693(C3896 c3896, C13457 c13457, boolean z, HashSet hashSet, ArrayList arrayList, boolean z2, long j, HashSet hashSet2, RunnableC15965 runnableC15965) {
        this.f26726 = c3896;
        this.f26725 = c13457;
        this.f26717 = z;
        this.f26716 = hashSet;
        this.f26723 = arrayList;
        this.f26721 = z2;
        this.f26715 = j;
        this.f26720 = hashSet2;
        this.f26724 = runnableC15965;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C23298 c23298 = new C23298(this.f26726.f8445.m41282());
        c23298.m51894(R.string.MT_Protector);
        c23298.m51892("...");
        c23298.mo51878((Runnable) null);
        c23298.m51884();
        this.f26722 = c23298;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C3896 c3896 = this.f26726;
        this.f26718 = new C19561(c3896.f8444);
        AbstractC17043 abstractC17043 = c3896.f8444;
        C13457 c13457 = this.f26725;
        C23105 c23105M52841 = C23775.m52841(abstractC17043, c13457 != null);
        this.f26719 = c23105M52841;
        C10844 c10844M51527 = c23105M52841.m51527();
        if (c13457 == null && this.f26717 && this.f26718.m44460()) {
            c10844M51527.m24990(this.f26718);
        }
        if (this.f26718.m44471()) {
            c10844M51527.m24999();
        }
        Collection collectionM44469 = this.f26718.m44469();
        C15727 c15727 = new C15727(this, C23775.m52838(collectionM44469));
        Iterator it = collectionM44469.iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            HashSet hashSet = this.f26720;
            boolean z = this.f26721;
            long j = this.f26715;
            ArrayList arrayList = this.f26723;
            if (zHasNext) {
                C5738 c5738 = (C5738) it.next();
                if (this.f26722.m53444()) {
                    return;
                }
                if (!this.f26716.contains(c5738.getName())) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            String str = (String) it2.next();
                            if (z) {
                                if (c5738.getName().startsWith(str)) {
                                    c5738.setTime(j);
                                    if (c5738.isDirectory()) {
                                        hashSet.add(c5738.getName());
                                    }
                                }
                            } else if (c5738.getName().equals(str)) {
                                c5738.setTime(j);
                                if (c5738.isDirectory()) {
                                    hashSet.add(c5738.getName());
                                }
                            }
                        }
                    }
                } else {
                    c5738.setTime(j);
                    if (c5738.isDirectory()) {
                        hashSet.add(c5738.getName());
                    }
                }
                i++;
                this.f26722.m51890(C7050.m16224(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i + "/" + collectionM44469.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                this.f26722.m51892(c5738.getName());
                if (c5738.isDirectory()) {
                    c10844M51527.m24987(c5738);
                } else {
                    C23775.m52845(c5738, this.f26718, c10844M51527, c15727);
                    this.f26727 = c5738.m12774() + this.f26727;
                }
            } else {
                C8092.m18777(true);
                if (arrayList.contains("META-INF/")) {
                    C8092.m18774(new C13717(j));
                }
                if (!z) {
                    arrayList.removeAll(hashSet);
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        C5738 c5739 = new C5738((String) it3.next());
                        c5739.setTime(j);
                        c10844M51527.m24987(c5739);
                    }
                }
                this.f26722.m51889(100);
                this.f26722.m51886(100);
                c10844M51527.close();
                if (c13457 != null) {
                    C11896.m27210(c3896.f8445.m41282(), this.f26719, c13457, this.f26722);
                }
                C20272.m45790(c3896.f8444);
                C19056 c19056 = new C19056();
                c19056.m43296(c3896.f8444);
                this.f26719.m51526(c3896.f8444, new Runnable() { // from class: l.᩺᩶᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9693 c9693 = this.f77388;
                        c9693.f26722.m51894(R.string.MT_Protector);
                        c9693.f26722.m51892(c9693.f26726.f8444.getName());
                    }
                }, this.f26718);
                c19056.m43298(c3896.f8444);
                return;
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (!this.f26722.m53444()) {
            this.f26726.f8445.m41241();
            this.f26724.run();
            return;
        }
        C23105 c23105 = this.f26719;
        if (c23105 != null) {
            C2700.m4192(c23105.m51527());
            this.f26719.m51525().mo25503();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        C23105 c23105 = this.f26719;
        if (c23105 != null) {
            C2700.m4192(c23105.m51527());
            this.f26719.m51525().mo25503();
        }
        this.f26726.f8445.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C8092.m18777(false);
        C8092.m18774((C13717) null);
        this.f26722.m53442();
        C2700.m4192(this.f26718);
        C17127.m38756();
    }
}
