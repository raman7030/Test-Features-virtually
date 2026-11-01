package p067l;

import android.view.View;
import bin.p000mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G9NZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11848 {
    /* JADX INFO: renamed from: ֫ */
    public static final void m27155(View view) {
        C13045.m29867(view, "<this>");
        for (View view2 : C0877.m5146(view)) {
            C13189 c13189 = (C13189) view2.getTag(R.id.MT_Protector);
            if (c13189 == null) {
                c13189 = new C13189();
                view2.setTag(R.id.MT_Protector, c13189);
            }
            c13189.m30193();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m27156(C14849 c14849) {
        Iterator it = C1787.m46208(c14849).iterator();
        while (true) {
            C1052 c1052 = (C1052) it;
            if (!c1052.hasNext()) {
                return;
            }
            View view = (View) c1052.next();
            C13189 c13189 = (C13189) view.getTag(R.id.MT_Protector);
            if (c13189 == null) {
                c13189 = new C13189();
                view.setTag(R.id.MT_Protector, c13189);
            }
            c13189.m30193();
        }
    }
}
