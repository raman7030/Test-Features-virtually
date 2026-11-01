package p067l;

import android.view.View;
import android.widget.AdapterView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܿ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes4.dex */
public final class C18541 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C19212 f55359;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC21895 f55360;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AtomicBoolean f55361;

    public C18541(AbstractC21895 abstractC21895, AtomicBoolean atomicBoolean, C19212 c19212) {
        this.f55360 = abstractC21895;
        this.f55361 = atomicBoolean;
        this.f55359 = c19212;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        AbstractC21895 abstractC21895 = this.f55360;
        int count = abstractC21895.f68867.getAdapter().getCount() - 1;
        C19212 c19212 = this.f55359;
        AtomicBoolean atomicBoolean = this.f55361;
        if (i != count) {
            if (atomicBoolean.compareAndSet(true, false)) {
                abstractC21895.f68869.setEnabled(false);
                c19212.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (atomicBoolean.compareAndSet(false, true)) {
            abstractC21895.f68869.setEnabled(true);
            c19212.notifyDataSetChanged();
        }
        abstractC21895.f68869.requestFocus();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        this.f55361.set(false);
        this.f55359.notifyDataSetChanged();
    }
}
