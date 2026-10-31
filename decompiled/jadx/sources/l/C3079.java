package l;

import android.view.View;
import android.widget.AdapterView;
import bin.mt.plugin.api.ui.PluginSpinner;

/* JADX INFO: renamed from: l.ۗۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X7NV */
/* JADX INFO: loaded from: classes2.dex */
public final class C3079 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12956 f9649;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ PluginSpinner.OnItemSelectedListener f9650;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C3079(C12956 c12956, PluginSpinner.OnItemSelectedListener onItemSelectedListener) {
        this.f9649 = c12956;
        this.f9650 = onItemSelectedListener;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f9650.onItemSelected(this.f9649, i);
    }
}
