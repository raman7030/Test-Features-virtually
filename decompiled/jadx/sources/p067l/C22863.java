package p067l;

import android.view.View;
import android.widget.AdapterView;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩸ۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C22863 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ IntConsumer f71992;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C22863(IntConsumer intConsumer) {
        this.f71992 = intConsumer;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f71992.accept(i);
    }
}
