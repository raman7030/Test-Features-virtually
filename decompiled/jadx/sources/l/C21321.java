package l;

import android.content.DialogInterface;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WS */
/* JADX INFO: loaded from: classes5.dex */
public final class C21321 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f68709;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f68710;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7674 f68711;

    public C21321(AbstractActivityC3346 abstractActivityC3346, ArrayList arrayList, C7674 c7674) {
        this.f68710 = abstractActivityC3346;
        this.f68709 = arrayList;
        this.f68711 = c7674;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f68710, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws C1637 {
        ArrayList arrayList = this.f68709;
        boolean z = ((C22026) arrayList.get(0)).f70590;
        boolean z2 = ((C22026) arrayList.get(1)).f70590;
        boolean z3 = ((C22026) arrayList.get(2)).f70590;
        boolean z4 = ((C22026) arrayList.get(3)).f70590;
        boolean z5 = ((C22026) arrayList.get(4)).f70590;
        boolean z6 = ((C22026) C18566.m43105(arrayList, 1)).f70590;
        C7674 c7674 = this.f68711;
        if (c7674 != null) {
            C11413.m28171(c7674.m20531(), z, z2, z3, z4, z5, z6);
            return;
        }
        if (z) {
            C18237 c18237M42480 = C18237.m42480(4132);
            c18237M42480.m42483(2);
            C23881 c23881M42495 = c18237M42480.m42495();
            if (!c23881M42495.m52607()) {
                throw new C1637(C1575.m5392(c23881M42495, R.string.MT_Protector));
            }
            if (c23881M42495.m52615()) {
                C7179.m19198(new JSONObject(c23881M42495.m52601()));
            }
        }
        if (z2) {
            C18237 c18237M42481 = C18237.m42480(4132);
            c18237M42481.m42483(0);
            C23881 c23881M42496 = c18237M42481.m42495();
            if (!c23881M42496.m52607()) {
                throw new C1637(C1575.m5392(c23881M42496, R.string.MT_Protector));
            }
            if (c23881M42496.m52615()) {
                C7179.m19197(new JSONArray(c23881M42496.m52601()), z6);
            }
        }
        if (z3) {
            C18237 c18237M42482 = C18237.m42480(4132);
            c18237M42482.m42483(1);
            C23881 c23881M42497 = c18237M42482.m42495();
            if (!c23881M42497.m52607()) {
                throw new C1637(C1575.m5392(c23881M42497, R.string.MT_Protector));
            }
            if (c23881M42497.m52615()) {
                C7179.m19199(new JSONArray(c23881M42497.m52601()), z6);
            }
        }
        if (z4) {
            C18237 c18237M42483 = C18237.m42480(4132);
            c18237M42483.m42483(3);
            C23881 c23881M42498 = c18237M42483.m42495();
            if (!c23881M42498.m52607()) {
                throw new C1637(C1575.m5392(c23881M42498, R.string.MT_Protector));
            }
            if (c23881M42498.m52615()) {
                JSONArray jSONArray = new JSONArray(c23881M42498.m52601());
                ArrayList arrayList2 = new ArrayList(jSONArray.size());
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(C2204.m7291(jSONArray.getJSONObject(i)));
                }
                if (z6) {
                    C2204.m7300(arrayList2);
                } else {
                    C2204.m7305(arrayList2);
                }
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C21374.m48457(R.string.MT_Protector);
        if (((C22026) this.f68709.get(0)).f70590) {
            this.f68710.recreate();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f68710.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
