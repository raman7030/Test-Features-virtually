package l;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes5.dex */
public class C21218 extends C21529 {
    @Override // l.C21529
    /* JADX INFO: renamed from: ֫ */
    public final void mo10947(int i, Bundle bundle) {
        if (bundle != null) {
            C23645.m52135(bundle);
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
            arrayList.add((C14866) parcelable);
        }
        throw null;
    }
}
