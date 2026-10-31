package l;

import android.content.Context;
import android.text.TextUtils;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 522K */
/* JADX INFO: loaded from: classes4.dex */
public final class C16016 extends C2095 {

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public long f49416;

    public C16016(Context context, ArrayList arrayList, long j) {
        super(context);
        m6919();
        m6923();
        m6928();
        m6933(EnumC3478.f11008);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        CharSequence string = null;
        while (it.hasNext()) {
            C2095 c2095 = (C2095) it.next();
            CharSequence charSequenceM6909 = c2095.m6909();
            boolean z = c2095 instanceof AbstractC3506;
            if (z && !TextUtils.isEmpty(charSequenceM6909)) {
                arrayList2.add((AbstractC3506) c2095);
            }
            if (arrayList2.contains(c2095.getParent())) {
                if (z) {
                    arrayList2.add((AbstractC3506) c2095);
                }
            } else if (!TextUtils.isEmpty(charSequenceM6909)) {
                string = string == null ? charSequenceM6909 : m6886().getString(R.string.MT_Protector, string, charSequenceM6909);
            }
        }
        mo6894(string);
        this.f49416 = j + 1000000;
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ֫ */
    public final void mo2792(C21167 c21167) {
        super.mo2792(c21167);
        c21167.m48105(false);
    }

    @Override // l.C2095
    /* JADX INFO: renamed from: ᩻ */
    public final long mo6941() {
        return this.f49416;
    }
}
