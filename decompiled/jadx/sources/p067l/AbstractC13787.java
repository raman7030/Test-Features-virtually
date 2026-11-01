package p067l;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;

/* JADX INFO: renamed from: l.ۨ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VS */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13787 {

    /* JADX INFO: renamed from: ֫ */
    public final DataSetObservable f38976 = new DataSetObservable();

    /* JADX INFO: renamed from: ۧ */
    public DataSetObserver f38977;

    /* JADX INFO: renamed from: ֫ */
    public CharSequence mo13848(int i) {
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo15096() {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo15097(Object obj) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo15098(C2798 c2798) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo13851(View view, Object obj);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo13852();

    /* JADX INFO: renamed from: ֫ */
    public Object mo13849(C2798 c2798, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo13850(C2798 c2798, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m31441() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f38977;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f38976.notifyChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31439(DataSetObserver dataSetObserver) {
        this.f38976.registerObserver(dataSetObserver);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m31442(DataSetObserver dataSetObserver) {
        this.f38976.unregisterObserver(dataSetObserver);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m31440(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f38977 = dataSetObserver;
        }
    }
}
