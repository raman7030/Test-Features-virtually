package p067l;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes5.dex */
public class C1894 extends C1910 {
    @Override // p067l.C1910
    /* JADX INFO: renamed from: ֫ */
    public final void mo12923(int i, Bundle bundle) {
        if (bundle != null) {
            C2015.m54538(bundle);
            try {
                bundle.isEmpty();
            } catch (BadParcelableException unused) {
                bundle = null;
            }
        }
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        parcelableArray.getClass();
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((C1579) parcelable);
        }
        throw null;
    }
}
