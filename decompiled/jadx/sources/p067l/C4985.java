package p067l;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48YG */
/* JADX INFO: loaded from: classes2.dex */
public final class C4985 implements InterfaceC11020 {

    /* JADX INFO: renamed from: ۧ */
    public final Context f11354;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f11356 = new ArrayList(3);

    /* JADX INFO: renamed from: ֫ */
    public TextView.BufferType f11353 = TextView.BufferType.SPANNABLE;

    /* JADX INFO: renamed from: ܽ */
    public boolean f11355 = true;

    public C4985(Context context) {
        this.f11354 = context;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10553(C22658 c22658) {
        this.f11356.add(c22658);
    }

    @Override // p067l.InterfaceC11020
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11020 mo10552(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC7667 interfaceC7667 = (InterfaceC7667) it.next();
            interfaceC7667.getClass();
            this.f11356.add(interfaceC7667);
        }
        return this;
    }

    @Override // p067l.InterfaceC11020
    public final AbstractC17724 build() {
        ArrayList arrayList = this.f11356;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        ArrayList<InterfaceC7667> arrayListM53902 = new C24430(arrayList).m53902();
        C15295 c15295 = new C15295();
        C5223 c5223M33399 = C14610.m33399(this.f11354);
        C6326 c6326 = new C6326();
        C12361 c12361 = new C12361();
        C17053 c17053 = new C17053();
        for (InterfaceC7667 interfaceC7667 : arrayListM53902) {
            interfaceC7667.mo17757(c15295);
            interfaceC7667.mo17756(c5223M33399);
            interfaceC7667.mo11898(c6326);
            interfaceC7667.mo17244(c12361);
            interfaceC7667.mo11897(c17053);
        }
        C15042 c15042 = new C15042(c12361, c6326.m14469(c5223M33399.m11209(), c17053.m38703()));
        return new C21079(this.f11353, c15295.m34822(), c15042, C21562.unmodifiableList(arrayListM53902), this.f11355);
    }
}
