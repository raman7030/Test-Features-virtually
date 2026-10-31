package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ۙᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C4837 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20065 f15279;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3426 f15280;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f15281;

    public C4837(C3426 c3426, C20065 c20065, View view) {
        this.f15280 = c3426;
        this.f15279 = c20065;
        this.f15281 = view;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        InterfaceC13303 interfaceC13303M10425;
        C3426 c3426 = this.f15280;
        if (c3426.f10808 != null && !c3426.f10808.mo6556().isEmpty()) {
            C3426.m10406(c3426.f10808 instanceof C13575).m27760((String) this.f15279.getItem(i));
            c3426.f10806 = true;
        } else {
            c3426.f10806 = false;
        }
        if (System.currentTimeMillis() - c3426.f10812 > 300 && (interfaceC13303M10425 = c3426.m10425()) != null) {
            c3426.mo10423(interfaceC13303M10425);
        }
        C3426.m10409(c3426, this.f15281);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C3426 c3426 = this.f15280;
        c3426.f10806 = false;
        C3426.m10409(c3426, this.f15281);
    }
}
