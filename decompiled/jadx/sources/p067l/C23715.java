package p067l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.᩹ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes.dex */
public final class C23715 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ RunnableC7622 f75465;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C23715(RunnableC7622 runnableC7622) {
        this.f75465 = runnableC7622;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f75465.run();
    }
}
