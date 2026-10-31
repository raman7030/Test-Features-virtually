package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.᩸ᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Z */
/* JADX INFO: loaded from: classes.dex */
public final class C21771 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20065 f69751;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20065 f69752;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3426 f69753;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18949 f69754;

    public C21771(C3426 c3426, C18949 c18949, C20065 c20065, C20065 c20066) {
        this.f69753 = c3426;
        this.f69754 = c18949;
        this.f69752 = c20065;
        this.f69751 = c20066;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        InterfaceC8365 interfaceC8365 = (InterfaceC8365) this.f69754.getItem(i);
        C3426 c3426 = this.f69753;
        c3426.f10808 = interfaceC8365;
        if (interfaceC8365 == null) {
            onNothingSelected(adapterView);
            return;
        }
        c3426.m10417();
        c3426.mo10422(i);
        ApplicationC20075.f65008.edit().putString("text_translator_engine", interfaceC8365.getId()).apply();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C3426 c3426 = this.f69753;
        c3426.f10808 = null;
        C3426.m10414(this.f69752, "");
        C3426.m10414(this.f69751, "");
        c3426.mo10422(-1);
    }
}
