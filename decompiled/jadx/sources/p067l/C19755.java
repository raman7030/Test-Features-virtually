package p067l;

import android.view.View;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: F63S */
/* JADX INFO: loaded from: classes4.dex */
public final class C19755 {

    /* JADX INFO: renamed from: ֫ */
    public static final AbstractC17742 f60104 = new C11709();

    /* JADX INFO: renamed from: ۧ */
    public static final AbstractC17742 f60105;

    static {
        AbstractC17742 abstractC17742 = null;
        try {
            abstractC17742 = (AbstractC17742) FragmentTransitionSupport.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f60105 = abstractC17742;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44902(ArrayList arrayList, int i) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }
}
