package l;

import android.widget.EditText;

/* JADX INFO: renamed from: l.ܿ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: QA0A */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17004 implements InterfaceC13041 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f52160;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f52161;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f52162;

    public /* synthetic */ C17004(EditText editText, EditText editText2, EditText editText3) {
        this.f52160 = editText;
        this.f52161 = editText2;
        this.f52162 = editText3;
    }

    @Override // l.InterfaceC13041
    public final void accept(Object obj) {
        C18416 c18416 = (C18416) obj;
        this.f52160.setText(c18416.m42838());
        this.f52161.setText(String.valueOf(c18416.m42840()));
        this.f52162.setText(c18416.m42839());
    }
}
