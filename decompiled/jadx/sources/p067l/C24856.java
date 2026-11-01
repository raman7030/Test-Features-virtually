package p067l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.᩻ۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 33YQ */
/* JADX INFO: loaded from: classes.dex */
public final class C24856 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C8763 f79401;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C24856(C8763 c8763) {
        this.f79401 = c8763;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C8763 c8763 = this.f79401;
        if (adapterView == c8763.f23776) {
            if (c8763.f23771) {
                return;
            }
            c8763.f23782 = (String) c8763.f23773.get(i);
            C8763.f23763 = (String) c8763.f23772.get(i);
            if (c8763.f23774.targetLanguageMutable) {
                c8763.m20268();
                return;
            }
            return;
        }
        if (adapterView != c8763.f23765 || c8763.f23771 || c8763.f23768) {
            return;
        }
        c8763.f23769 = (String) c8763.f23780.get(i);
        C8763.f23764 = (String) c8763.f23781.get(i);
    }
}
