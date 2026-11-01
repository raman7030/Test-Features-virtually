package p067l;

import android.content.Context;
import android.text.TextUtils;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 522K */
/* JADX INFO: loaded from: classes4.dex */
public final class C17590 extends C4360 {

    /* JADX INFO: renamed from: ۫֫ */
    public long f52579;

    public C17590(Context context, ArrayList arrayList, long j) {
        super(context);
        m9045();
        m9049();
        m9054();
        m9059(EnumC5674.f13813);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        CharSequence string = null;
        while (it.hasNext()) {
            C4360 c4360 = (C4360) it.next();
            CharSequence charSequenceM9035 = c4360.m9035();
            boolean z = c4360 instanceof AbstractC5701;
            if (z && !TextUtils.isEmpty(charSequenceM9035)) {
                arrayList2.add((AbstractC5701) c4360);
            }
            if (arrayList2.contains(c4360.getParent())) {
                if (z) {
                    arrayList2.add((AbstractC5701) c4360);
                }
            } else if (!TextUtils.isEmpty(charSequenceM9035)) {
                string = string == null ? charSequenceM9035 : m9012().getString(R.string.MT_Protector, string, charSequenceM9035);
            }
        }
        mo9020(string);
        this.f52579 = j + 1000000;
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ֫ */
    public final void mo5137(C22486 c22486) {
        super.mo5137(c22486);
        c22486.m50435(false);
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ᩻ */
    public final long mo9067() {
        return this.f52579;
    }
}
