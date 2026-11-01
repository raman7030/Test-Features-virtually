package p067l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.᩸ᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Z */
/* JADX INFO: loaded from: classes.dex */
public final class C23060 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C21438 f72459;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C21438 f72460;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5625 f72461;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C20378 f72462;

    public C23060(C5625 c5625, C20378 c20378, C21438 c21438, C21438 c21439) {
        this.f72461 = c5625;
        this.f72462 = c20378;
        this.f72460 = c21438;
        this.f72459 = c21439;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        InterfaceC10319 interfaceC10319 = (InterfaceC10319) this.f72462.getItem(i);
        C5625 c5625 = this.f72461;
        c5625.f13613 = interfaceC10319;
        if (interfaceC10319 == null) {
            onNothingSelected(adapterView);
            return;
        }
        c5625.m12456();
        c5625.mo12461(i);
        ApplicationC21448.f67649.edit().putString("text_translator_engine", interfaceC10319.getId()).apply();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C5625 c5625 = this.f72461;
        c5625.f13613 = null;
        C5625.m12453(this.f72460, "");
        C5625.m12453(this.f72459, "");
        c5625.mo12461(-1);
    }
}
