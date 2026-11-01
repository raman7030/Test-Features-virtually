package p067l;

import android.view.View;
import android.widget.AdapterView;
import bin.p000mt.plugin.api.p002ui.PluginSpinner;

/* JADX INFO: renamed from: l.ۗۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X7NV */
/* JADX INFO: loaded from: classes2.dex */
public final class C5295 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14682 f12452;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ PluginSpinner.OnItemSelectedListener f12453;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C5295(C14682 c14682, PluginSpinner.OnItemSelectedListener onItemSelectedListener) {
        this.f12452 = c14682;
        this.f12453 = onItemSelectedListener;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f12453.onItemSelected(this.f12452, i);
    }
}
