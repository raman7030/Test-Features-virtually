package p067l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import bin.p000mt.plus.Main;

/* JADX INFO: renamed from: l.ܶᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public final class C17008 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C12096 f50288;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ TextView f50289;

    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ TextView f50290;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ Spinner f50291;

    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ CheckBox f50292;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ Spinner f50293;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ TextView f50294;

    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ RunnableC7622 f50295;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ EditText f50296;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C21704 f50297;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ View f50298;

    /* JADX INFO: renamed from: ᩺ */
    public final /* synthetic */ CheckBox f50299;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C17008(C21704 c21704, C12096 c12096, Spinner spinner, EditText editText, CheckBox checkBox, Spinner spinner2, CheckBox checkBox2, Main main, TextView textView, TextView textView2, View view, TextView textView3, RunnableC7622 runnableC7622) {
        this.f50297 = c21704;
        this.f50288 = c12096;
        this.f50293 = spinner;
        this.f50296 = editText;
        this.f50292 = checkBox;
        this.f50291 = spinner2;
        this.f50299 = checkBox2;
        this.f50294 = textView;
        this.f50289 = textView2;
        this.f50298 = view;
        this.f50290 = textView3;
        this.f50295 = runnableC7622;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C21704 c21704 = this.f50297;
        C12096 c12096 = this.f50288;
        Spinner spinner = this.f50293;
        EditText editText = this.f50296;
        CheckBox checkBox = this.f50292;
        Spinner spinner2 = this.f50291;
        CheckBox checkBox2 = this.f50299;
        C25036.m54967(c21704, c12096, spinner, editText, checkBox, spinner2, checkBox2);
        c21704.f68347 = i;
        C25036.m54969(c21704, this.f50294, c12096, spinner, this.f50289, editText, this.f50298, checkBox, this.f50290, spinner2, checkBox2);
        this.f50295.run();
    }
}
