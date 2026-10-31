package l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ۙ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A92H */
/* JADX INFO: loaded from: classes2.dex */
public final class C4946 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13412 f15582;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String[] f15583;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C4946(C13412 c13412, String[] strArr) {
        this.f15582 = c13412;
        this.f15583 = strArr;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        boolean zEquals = this.f15583[i].equals("exec-script");
        C13412 c13412 = this.f15582;
        if (zEquals) {
            c13412.f40094.setVisibility(0);
        } else {
            c13412.f40094.setVisibility(8);
        }
    }
}
