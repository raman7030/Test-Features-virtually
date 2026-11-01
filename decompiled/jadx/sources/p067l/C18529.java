package p067l;

import android.widget.EditText;

/* JADX INFO: renamed from: l.ܿ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: QA0A */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18529 implements InterfaceC1489 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ EditText f55340;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ EditText f55341;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ EditText f55342;

    public /* synthetic */ C18529(EditText editText, EditText editText2, EditText editText3) {
        this.f55340 = editText;
        this.f55341 = editText2;
        this.f55342 = editText3;
    }

    @Override // p067l.InterfaceC1489
    public final void accept(Object obj) {
        C19871 c19871 = (C19871) obj;
        this.f55340.setText(c19871.m45111());
        this.f55341.setText(String.valueOf(c19871.m45113()));
        this.f55342.setText(c19871.m45112());
    }
}
