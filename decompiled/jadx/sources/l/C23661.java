package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.᩻ۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 33YQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23661 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6728 f76655;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C23661(C6728 c6728) {
        this.f76655 = c6728;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C6728 c6728 = this.f76655;
        if (adapterView == c6728.f20902) {
            if (c6728.f20897) {
                return;
            }
            c6728.f20908 = (String) c6728.f20899.get(i);
            C6728.f20889 = (String) c6728.f20898.get(i);
            if (c6728.f20900.targetLanguageMutable) {
                c6728.m18320();
                return;
            }
            return;
        }
        if (adapterView != c6728.f20891 || c6728.f20897 || c6728.f20894) {
            return;
        }
        c6728.f20895 = (String) c6728.f20906.get(i);
        C6728.f20890 = (String) c6728.f20907.get(i);
    }
}
