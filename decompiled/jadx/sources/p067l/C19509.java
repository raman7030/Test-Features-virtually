package p067l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ᩳۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes4.dex */
public final class C19509 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C0990 f59425;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C0990 f59426;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C19509(C0990 c0990, C0990 c0991) {
        this.f59426 = c0990;
        this.f59425 = c0991;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        boolean z = EnumC10104.values()[i].f28038;
        C0990 c0990 = this.f59425;
        C0990 c0991 = this.f59426;
        if (z) {
            c0991.setVisibility(0);
            if (c0990 != null) {
                c0990.setVisibility(8);
                return;
            }
            return;
        }
        c0991.setVisibility(8);
        if (c0990 != null) {
            c0990.setVisibility(0);
        }
    }
}
