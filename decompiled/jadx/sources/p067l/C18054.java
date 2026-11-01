package p067l;

import android.os.SystemClock;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18054 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ ActivityC18686 f53897;

    /* JADX INFO: renamed from: ܳ */
    public ArrayList f53898;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ int f53899;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C20738 f53900;

    public C18054(C20738 c20738, ActivityC18686 activityC18686, int i) {
        this.f53900 = c20738;
        this.f53897 = activityC18686;
        this.f53899 = i;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f53897, this.f53899);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C20738 c20738;
        while (true) {
            c20738 = this.f53900;
            if (c20738.f63998 != null) {
                break;
            } else {
                SystemClock.sleep(10L);
            }
        }
        Collection collectionM47153 = c20738.f63998.m47153();
        this.f53898 = new ArrayList(collectionM47153.size());
        Iterator it = collectionM47153.iterator();
        while (it.hasNext()) {
            this.f53898.add(new C24760((String) it.next()));
        }
        c20738.f63992 = false;
        c20738.f63996 = false;
        c20738.m46814(this.f53898);
        C20738.m46823(c20738);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        ArrayList arrayList = this.f53898;
        C20738 c20738 = this.f53900;
        c20738.f63990 = arrayList;
        c20738.f63997.notifyDataSetChanged();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        C20738 c20738 = this.f53900;
        c20738.f63999.m13320((Throwable) exc);
        boolean z = exc instanceof C7760;
        if (z) {
            C7760 c7760 = (C7760) exc;
            C20699 c20699M46760 = C20699.m46760(c7760.f20361, c7760.f20360);
            c20699M46760.f63908 = false;
            this.f53897.m42599(c7760.m17914(), c20699M46760);
            c20738.f63998.m47114(c7760.m17914());
        }
        if (z || (exc instanceof C3870)) {
            C22682.m50793(R.string.MT_Protector);
        }
        if (c20738.f63990 == null) {
            c20738.f63990 = Collections.EMPTY_LIST;
            c20738.f63992 = false;
            c20738.f63996 = false;
            c20738.f63997.notifyDataSetChanged();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
