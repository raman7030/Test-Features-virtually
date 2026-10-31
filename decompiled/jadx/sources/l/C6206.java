package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۛܿܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes2.dex */
public final class C6206 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC22003 f19034;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f19035;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Button f19036;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f19037;

    public C6206(EditText editText, TextView textView, Button button, RunnableC22003 runnableC22003) {
        this.f19037 = editText;
        this.f19035 = textView;
        this.f19036 = button;
        this.f19034 = runnableC22003;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C11146.m27657(C11146.f33464.getInt(i)).mo20430(this.f19037, this.f19035, this.f19036);
        this.f19034.run();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C11146.f33463.mo20430(this.f19037, this.f19035, this.f19036);
        this.f19034.run();
    }
}
