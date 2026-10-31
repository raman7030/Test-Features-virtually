package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.᩹ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes.dex */
public final class C22460 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC5527 f72737;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C22460(RunnableC5527 runnableC5527) {
        this.f72737 = runnableC5527;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f72737.run();
    }
}
