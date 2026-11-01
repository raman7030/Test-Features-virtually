package p067l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ۧۖ */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes3.dex */
public final class C1373 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1303 f35184;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C1373(C1303 c1303) {
        this.f35184 = c1303;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C1462 c1462;
        if (i == -1 || (c1462 = this.f35184.f31096) == null) {
            return;
        }
        c1462.m32745(false);
    }
}
