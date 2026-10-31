package l;

import android.view.View;
import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G9NZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9975 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m25138(View view) {
        C11233.m27805(view, "<this>");
        for (View view2 : C0714.m2801(view)) {
            C11386 c11386 = (C11386) view2.getTag(R.id.MT_Protector);
            if (c11386 == null) {
                c11386 = new C11386();
                view2.setTag(R.id.MT_Protector, c11386);
            }
            c11386.m28149();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m25139(C13132 c13132) {
        Iterator it = C19060.m43915(c13132).iterator();
        while (true) {
            C4243 c4243 = (C4243) it;
            if (!c4243.hasNext()) {
                return;
            }
            View view = (View) c4243.next();
            C11386 c11386 = (C11386) view.getTag(R.id.MT_Protector);
            if (c11386 == null) {
                c11386 = new C11386();
                view.setTag(R.id.MT_Protector, c11386);
            }
            c11386.m28149();
        }
    }
}
