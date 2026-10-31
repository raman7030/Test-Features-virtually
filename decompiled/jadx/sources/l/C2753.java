package l;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48YG */
/* JADX INFO: loaded from: classes2.dex */
public final class C2753 implements InterfaceC9103 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Context f8560;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f8562 = new ArrayList(3);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public TextView.BufferType f8559 = TextView.BufferType.SPANNABLE;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f8561 = true;

    public C2753(Context context) {
        this.f8560 = context;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8506(C21349 c21349) {
        this.f8562.add(c21349);
    }

    @Override // l.InterfaceC9103
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9103 mo8505(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC5575 interfaceC5575 = (InterfaceC5575) it.next();
            interfaceC5575.getClass();
            this.f8562.add(interfaceC5575);
        }
        return this;
    }

    @Override // l.InterfaceC9103
    public final AbstractC16157 build() {
        ArrayList arrayList = this.f8562;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        ArrayList<InterfaceC5575> arrayListM51505 = new C23213(arrayList).m51505();
        C13602 c13602 = new C13602();
        C3004 c3004M31313 = C12881.m31313(this.f8560);
        C4164 c4164 = new C4164();
        C10514 c10514 = new C10514();
        C15451 c15451 = new C15451();
        for (InterfaceC5575 interfaceC5575 : arrayListM51505) {
            interfaceC5575.mo15842(c13602);
            interfaceC5575.mo15841(c3004M31313);
            interfaceC5575.mo9851(c4164);
            interfaceC5575.mo15335(c10514);
            interfaceC5575.mo9850(c15451);
        }
        C13335 c13335 = new C13335(c10514, c4164.m12595(c3004M31313.m9158(), c15451.m36544()));
        return new C19687(this.f8559, c13602.m32710(), c13335, C20195.unmodifiableList(arrayListM51505), this.f8561);
    }
}
