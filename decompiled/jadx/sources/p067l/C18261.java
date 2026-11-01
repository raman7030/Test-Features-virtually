package p067l;

import android.view.View;
import android.widget.AdapterView;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܽܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I69B */
/* JADX INFO: loaded from: classes4.dex */
public final class C18261 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C19603 f54536;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C18261(C19603 c19603) {
        this.f54536 = c19603;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i >= 0) {
            C19603 c19603 = this.f54536;
            String string = c19603.m47253()[i].toString();
            if (string.equals(c19603.getValue())) {
                return;
            }
            c19603.m9019((Serializable) string);
            c19603.m47257(string);
        }
    }
}
