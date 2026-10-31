package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes3.dex */
public final class C10698 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9287 f32209;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C10698(C9287 c9287) {
        this.f32209 = c9287;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C12499 c12499;
        if (i == -1 || (c12499 = this.f32209.f28147) == null) {
            return;
        }
        c12499.m30670(false);
    }
}
