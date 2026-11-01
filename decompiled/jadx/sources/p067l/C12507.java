package p067l;

import android.text.Editable;

/* JADX INFO: renamed from: l.ۧ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes4.dex */
public final class C12507 extends AbstractC5460 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC21895 f35055;

    public C12507(AbstractC21895 abstractC21895) {
        this.f35055 = abstractC21895;
    }

    @Override // p067l.AbstractC5460, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f35055.f68859.setEnabled(editable.length() > 0);
    }
}
