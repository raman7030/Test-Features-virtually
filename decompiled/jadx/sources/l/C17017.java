package l;

import android.view.View;
import android.widget.AdapterView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܿ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes4.dex */
public final class C17017 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17723 f52179;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20546 f52180;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f52181;

    public C17017(AbstractC20546 abstractC20546, AtomicBoolean atomicBoolean, C17723 c17723) {
        this.f52180 = abstractC20546;
        this.f52181 = atomicBoolean;
        this.f52179 = c17723;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        AbstractC20546 abstractC20546 = this.f52180;
        int count = abstractC20546.f66190.getAdapter().getCount() - 1;
        C17723 c17723 = this.f52179;
        AtomicBoolean atomicBoolean = this.f52181;
        if (i != count) {
            if (atomicBoolean.compareAndSet(true, false)) {
                abstractC20546.f66192.setEnabled(false);
                c17723.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (atomicBoolean.compareAndSet(false, true)) {
            abstractC20546.f66192.setEnabled(true);
            c17723.notifyDataSetChanged();
        }
        abstractC20546.f66192.requestFocus();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        this.f52181.set(false);
        this.f52179.notifyDataSetChanged();
    }
}
