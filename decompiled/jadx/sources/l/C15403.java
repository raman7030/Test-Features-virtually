package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ܶᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public final class C15403 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10235 f47158;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f47159;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f47160;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f47161;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f47162;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f47163;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f47164;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC5527 f47165;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f47166;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20344 f47167;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f47168;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f47169;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C15403(C20344 c20344, C10235 c10235, Spinner spinner, EditText editText, CheckBox checkBox, Spinner spinner2, CheckBox checkBox2, Main main, TextView textView, TextView textView2, View view, TextView textView3, RunnableC5527 runnableC5527) {
        this.f47167 = c20344;
        this.f47158 = c10235;
        this.f47163 = spinner;
        this.f47166 = editText;
        this.f47162 = checkBox;
        this.f47161 = spinner2;
        this.f47169 = checkBox2;
        this.f47164 = textView;
        this.f47159 = textView2;
        this.f47168 = view;
        this.f47160 = textView3;
        this.f47165 = runnableC5527;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C20344 c20344 = this.f47167;
        C10235 c10235 = this.f47158;
        Spinner spinner = this.f47163;
        EditText editText = this.f47166;
        CheckBox checkBox = this.f47162;
        Spinner spinner2 = this.f47161;
        CheckBox checkBox2 = this.f47169;
        C23850.m52558(c20344, c10235, spinner, editText, checkBox, spinner2, checkBox2);
        c20344.f65671 = i;
        C23850.m52560(c20344, this.f47164, c10235, spinner, this.f47159, editText, this.f47168, checkBox, this.f47160, spinner2, checkBox2);
        this.f47165.run();
    }
}
