package p067l;

import android.content.DialogInterface;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WS */
/* JADX INFO: loaded from: classes5.dex */
public final class C22632 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ ArrayList f71403;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ AbstractActivityC5549 f71404;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C9662 f71405;

    public C22632(AbstractActivityC5549 abstractActivityC5549, ArrayList arrayList, C9662 c9662) {
        this.f71404 = abstractActivityC5549;
        this.f71403 = arrayList;
        this.f71405 = c9662;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f71404, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C3924 {
        ArrayList arrayList = this.f71403;
        boolean z = ((C23302) arrayList.get(0)).f73307;
        boolean z2 = ((C23302) arrayList.get(1)).f73307;
        boolean z3 = ((C23302) arrayList.get(2)).f73307;
        boolean z4 = ((C23302) arrayList.get(3)).f73307;
        boolean z5 = ((C23302) arrayList.get(4)).f73307;
        boolean z6 = ((C23302) C20013.m45383(arrayList, 1)).f73307;
        C9662 c9662 = this.f71405;
        if (c9662 != null) {
            C13215.m30215(c9662.m22511(), z, z2, z3, z4, z5, z6);
            return;
        }
        if (z) {
            C19701 c19701M44739 = C19701.m44739(4132);
            c19701M44739.m44742(2);
            C25065 c25065M44754 = c19701M44739.m44754();
            if (!c25065M44754.m55016()) {
                throw new C3924(C3865.m7621(c25065M44754, R.string.MT_Protector));
            }
            if (c25065M44754.m55024()) {
                C9191.m21145(new JSONObject(c25065M44754.m55010()));
            }
        }
        if (z2) {
            C19701 c19701M447310 = C19701.m44739(4132);
            c19701M447310.m44742(0);
            C25065 c25065M44755 = c19701M447310.m44754();
            if (!c25065M44755.m55016()) {
                throw new C3924(C3865.m7621(c25065M44755, R.string.MT_Protector));
            }
            if (c25065M44755.m55024()) {
                C9191.m21144(new JSONArray(c25065M44755.m55010()), z6);
            }
        }
        if (z3) {
            C19701 c19701M447311 = C19701.m44739(4132);
            c19701M447311.m44742(1);
            C25065 c25065M44756 = c19701M447311.m44754();
            if (!c25065M44756.m55016()) {
                throw new C3924(C3865.m7621(c25065M44756, R.string.MT_Protector));
            }
            if (c25065M44756.m55024()) {
                C9191.m21146(new JSONArray(c25065M44756.m55010()), z6);
            }
        }
        if (z4) {
            C19701 c19701M447312 = C19701.m44739(4132);
            c19701M447312.m44742(3);
            C25065 c25065M44757 = c19701M447312.m44754();
            if (!c25065M44757.m55016()) {
                throw new C3924(C3865.m7621(c25065M44757, R.string.MT_Protector));
            }
            if (c25065M44757.m55024()) {
                JSONArray jSONArray = new JSONArray(c25065M44757.m55010());
                ArrayList arrayList2 = new ArrayList(jSONArray.size());
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(C4463.m9370(jSONArray.getJSONObject(i)));
                }
                if (z6) {
                    C4463.m9379(arrayList2);
                } else {
                    C4463.m9384(arrayList2);
                }
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C22682.m50793(R.string.MT_Protector);
        if (((C23302) this.f71403.get(0)).f73307) {
            this.f71404.recreate();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f71404.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
