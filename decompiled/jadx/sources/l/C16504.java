package l;

import android.os.SystemClock;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16504 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f50718;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f50719;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50720;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19328 f50721;

    public C16504(C19328 c19328, ActivityC17169 activityC17169, int i) {
        this.f50721 = c19328;
        this.f50718 = activityC17169;
        this.f50720 = i;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f50718, this.f50720);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C19328 c19328;
        while (true) {
            c19328 = this.f50721;
            if (c19328.f60766 != null) {
                break;
            } else {
                SystemClock.sleep(10L);
            }
        }
        Collection collectionM44857 = c19328.f60766.m44857();
        this.f50719 = new ArrayList(collectionM44857.size());
        Iterator it = collectionM44857.iterator();
        while (it.hasNext()) {
            this.f50719.add(new C23560((String) it.next()));
        }
        c19328.f60760 = false;
        c19328.f60764 = false;
        c19328.m44520(this.f50719);
        C19328.m44529(c19328);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        ArrayList arrayList = this.f50719;
        C19328 c19328 = this.f50721;
        c19328.f60758 = arrayList;
        c19328.f60765.notifyDataSetChanged();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C19328 c19328 = this.f50721;
        c19328.f60767.m11384((Throwable) exc);
        boolean z = exc instanceof C5672;
        if (z) {
            C5672 c5672 = (C5672) exc;
            C19287 c19287M44466 = C19287.m44466(c5672.f17514, c5672.f17513);
            c19287M44466.f60678 = false;
            this.f50718.m40354(c5672.m15979(), c19287M44466);
            c19328.f60766.m44818(c5672.m15979());
        }
        if (z || (exc instanceof C1580)) {
            C21374.m48457(R.string.MT_Protector);
        }
        if (c19328.f60758 == null) {
            c19328.f60758 = Collections.EMPTY_LIST;
            c19328.f60760 = false;
            c19328.f60764 = false;
            c19328.f60765.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
