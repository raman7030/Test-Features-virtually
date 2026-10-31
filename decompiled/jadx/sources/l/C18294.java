package l;

import android.view.View;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: F63S */
/* JADX INFO: loaded from: classes4.dex */
public final class C18294 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC16176 f56886 = new C9828();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC16176 f56887;

    static {
        AbstractC16176 abstractC16176 = null;
        try {
            abstractC16176 = (AbstractC16176) FragmentTransitionSupport.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f56887 = abstractC16176;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42642(ArrayList arrayList, int i) {
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
