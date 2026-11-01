package p067l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ۙᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C6966 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C21438 f18112;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5625 f18113;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ View f18114;

    public C6966(C5625 c5625, C21438 c21438, View view) {
        this.f18113 = c5625;
        this.f18112 = c21438;
        this.f18114 = view;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        InterfaceC15012 interfaceC15012M12464;
        C5625 c5625 = this.f18113;
        if (c5625.f13613 != null && !c5625.f13613.mo8698().isEmpty()) {
            C5625.m12445(c5625.f13613 instanceof C15270).m29822((String) this.f18112.getItem(i));
            c5625.f13611 = true;
        } else {
            c5625.f13611 = false;
        }
        if (System.currentTimeMillis() - c5625.f13617 > 300 && (interfaceC15012M12464 = c5625.m12464()) != null) {
            c5625.mo12462(interfaceC15012M12464);
        }
        C5625.m12448(c5625, this.f18114);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C5625 c5625 = this.f18113;
        c5625.f13611 = false;
        C5625.m12448(c5625, this.f18114);
    }
}
