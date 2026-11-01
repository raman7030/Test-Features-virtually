package p067l;

import android.content.Context;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܽ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes5.dex */
public final class C17870 extends C21438 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ int f53386;

    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean f53387;

    /* JADX INFO: renamed from: ᩺ */
    public final /* synthetic */ AbstractC21895 f53388;

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17870(AbstractC21895 abstractC21895, Context context, EnumC8483[] enumC8483Arr, boolean z, int i) {
        super(context, enumC8483Arr);
        this.f53388 = abstractC21895;
        this.f53387 = z;
        this.f53386 = i;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        boolean z = this.f53387;
        AbstractC21895 abstractC21895 = this.f53388;
        return (!z && (this.f53386 <= 1 || abstractC21895.f68858.isChecked())) || i < abstractC21895.f68857.length + (-5);
    }

    @Override // p067l.C4338, android.widget.Adapter
    public final int getCount() {
        boolean z = this.f53387;
        AbstractC21895 abstractC21895 = this.f53388;
        if ((z || (this.f53386 > 1 && !abstractC21895.f68858.isChecked())) && abstractC21895.f68856.getSelectedItemPosition() >= abstractC21895.f68857.length - 5) {
            abstractC21895.f68856.setSelection(abstractC21895.f68856.getSelectedItemPosition() - 5);
        }
        return abstractC21895.f68857.length;
    }

    @Override // p067l.C21438
    /* JADX INFO: renamed from: ֫ */
    public final void mo40605(TextView textView, int i, boolean z) {
        if (z) {
            textView.setAlpha(isEnabled(i) ? 1.0f : 0.3f);
        }
    }
}
