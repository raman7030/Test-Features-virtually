package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.᩶ᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C20360 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f65729;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3426 f65730;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20065 f65731;

    public C20360(C3426 c3426, C20065 c20065, View view) {
        this.f65730 = c3426;
        this.f65731 = c20065;
        this.f65729 = view;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        InterfaceC13303 interfaceC13303M10425;
        C3426 c3426 = this.f65730;
        boolean z = false;
        if (c3426.f10808 != null && !c3426.f10808.mo6558().isEmpty()) {
            boolean z2 = c3426.f10808 instanceof C13575;
            C11188 c11188M10406 = C3426.m10406(z2);
            c11188M10406.m27758((String) this.f65731.getItem(i));
            if (!z2 && !c3426.f10805.equals(c11188M10406.m27757())) {
                z = true;
            }
            c3426.f10811 = z;
            if (c3426.f10808.mo6555()) {
                c3426.m10407(i, c11188M10406);
            }
        } else {
            c3426.f10811 = false;
        }
        if (System.currentTimeMillis() - c3426.f10812 > 300 && (interfaceC13303M10425 = c3426.m10425()) != null) {
            c3426.mo10423(interfaceC13303M10425);
        }
        C3426.m10409(c3426, this.f65729);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C3426 c3426 = this.f65730;
        c3426.f10811 = false;
        C3426.m10409(c3426, this.f65729);
    }
}
