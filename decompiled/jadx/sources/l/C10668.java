package l;

import android.text.Editable;

/* JADX INFO: renamed from: l.ۧ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes4.dex */
public final class C10668 extends AbstractC3253 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20546 f32084;

    public C10668(AbstractC20546 abstractC20546) {
        this.f32084 = abstractC20546;
    }

    @Override // l.AbstractC3253, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f32084.f66182.setEnabled(editable.length() > 0);
    }
}
