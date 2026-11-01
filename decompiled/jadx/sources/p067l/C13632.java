package p067l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۨܿܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes3.dex */
public final class C13632 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ RunnableC23280 f38379;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ TextView f38380;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Button f38381;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ EditText f38382;

    public C13632(EditText editText, TextView textView, Button button, RunnableC23280 runnableC23280) {
        this.f38382 = editText;
        this.f38380 = textView;
        this.f38381 = button;
        this.f38379 = runnableC23280;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i == 0) {
            onNothingSelected(adapterView);
            return;
        }
        C12962.m29719(C12962.f36465.getInt(i - 1)).mo22409(this.f38382, this.f38380, this.f38381);
        this.f38379.run();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C12962.f36463.mo22409(this.f38382, this.f38380, this.f38381);
        this.f38379.run();
    }
}
