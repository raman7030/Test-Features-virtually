package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۨܿܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes3.dex */
public final class C11851 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC22003 f35374;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f35375;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Button f35376;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f35377;

    public C11851(EditText editText, TextView textView, Button button, RunnableC22003 runnableC22003) {
        this.f35377 = editText;
        this.f35375 = textView;
        this.f35376 = button;
        this.f35374 = runnableC22003;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i == 0) {
            onNothingSelected(adapterView);
            return;
        }
        C11146.m27657(C11146.f33465.getInt(i - 1)).mo20430(this.f35377, this.f35375, this.f35376);
        this.f35374.run();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C11146.f33463.mo20430(this.f35377, this.f35375, this.f35376);
        this.f35374.run();
    }
}
