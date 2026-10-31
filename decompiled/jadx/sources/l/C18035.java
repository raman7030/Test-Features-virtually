package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ᩳۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes4.dex */
public final class C18035 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f56227;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f56228;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C18035(C2978 c2978, C2978 c2979) {
        this.f56228 = c2978;
        this.f56227 = c2979;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        boolean z = EnumC8139.values()[i].f25125;
        C2978 c2978 = this.f56227;
        C2978 c2979 = this.f56228;
        if (z) {
            c2979.setVisibility(0);
            if (c2978 != null) {
                c2978.setVisibility(8);
                return;
            }
            return;
        }
        c2979.setVisibility(8);
        if (c2978 != null) {
            c2978.setVisibility(0);
        }
    }
}
