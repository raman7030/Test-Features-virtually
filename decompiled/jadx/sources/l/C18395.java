package l;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes5.dex */
public class C18395 extends C21529 {
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
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof C14866)) {
            throw null;
        }
        throw null;
    }
}
