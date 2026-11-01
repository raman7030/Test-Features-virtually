package p067l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.ۙ᩹᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A92H */
/* JADX INFO: loaded from: classes2.dex */
public final class C7070 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C15116 f18416;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ String[] f18417;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C7070(C15116 c15116, String[] strArr) {
        this.f18416 = c15116;
        this.f18417 = strArr;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        boolean zEquals = this.f18417[i].equals("exec-script");
        C15116 c15116 = this.f18416;
        if (zEquals) {
            c15116.f43163.setVisibility(0);
        } else {
            c15116.f43163.setVisibility(8);
        }
    }
}
