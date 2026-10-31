package l;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;

/* JADX INFO: renamed from: l.ۨ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VS */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12014 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final DataSetObservable f35966 = new DataSetObservable();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public DataSetObserver f35967;

    /* JADX INFO: renamed from: ֫ */
    public CharSequence mo11912(int i) {
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo13214() {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo13215(Object obj) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo13216(C0452 c0452) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo11915(View view, Object obj);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo11916();

    /* JADX INFO: renamed from: ֫ */
    public Object mo11913(C0452 c0452, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo11914(C0452 c0452, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m29381() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f35967;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f35966.notifyChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29379(DataSetObserver dataSetObserver) {
        this.f35966.registerObserver(dataSetObserver);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m29382(DataSetObserver dataSetObserver) {
        this.f35966.unregisterObserver(dataSetObserver);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29380(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f35967 = dataSetObserver;
        }
    }
}
