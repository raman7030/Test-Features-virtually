package l;

import android.content.Context;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܽ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes5.dex */
public final class C16311 extends C20065 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50219;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f50220;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20546 f50221;

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16311(AbstractC20546 abstractC20546, Context context, EnumC6434[] enumC6434Arr, boolean z, int i) {
        super(context, enumC6434Arr);
        this.f50221 = abstractC20546;
        this.f50220 = z;
        this.f50219 = i;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        boolean z = this.f50220;
        AbstractC20546 abstractC20546 = this.f50221;
        return (!z && (this.f50219 <= 1 || abstractC20546.f66181.isChecked())) || i < abstractC20546.f66180.length + (-5);
    }

    @Override // l.C2072, android.widget.Adapter
    public final int getCount() {
        boolean z = this.f50220;
        AbstractC20546 abstractC20546 = this.f50221;
        if ((z || (this.f50219 > 1 && !abstractC20546.f66181.isChecked())) && abstractC20546.f66179.getSelectedItemPosition() >= abstractC20546.f66180.length - 5) {
            abstractC20546.f66179.setSelection(abstractC20546.f66179.getSelectedItemPosition() - 5);
        }
        return abstractC20546.f66180.length;
    }

    @Override // l.C20065
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo38390(TextView textView, int i, boolean z) {
        if (z) {
            textView.setAlpha(isEnabled(i) ? 1.0f : 0.3f);
        }
    }
}
