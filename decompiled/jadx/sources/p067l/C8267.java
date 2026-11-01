package p067l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۛܿܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes2.dex */
public final class C8267 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ RunnableC23280 f21895;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ TextView f21896;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Button f21897;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ EditText f21898;

    public C8267(EditText editText, TextView textView, Button button, RunnableC23280 runnableC23280) {
        this.f21898 = editText;
        this.f21896 = textView;
        this.f21897 = button;
        this.f21895 = runnableC23280;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C12962.m29719(C12962.f36464.getInt(i)).mo22409(this.f21898, this.f21896, this.f21897);
        this.f21895.run();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C12962.f36463.mo22409(this.f21898, this.f21896, this.f21897);
        this.f21895.run();
    }
}
