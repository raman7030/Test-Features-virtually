package p067l;

import android.database.DataSetObserver;
import android.widget.AdapterView;
import android.widget.Spinner;

/* JADX INFO: renamed from: l.᩹ᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Z */
/* JADX INFO: loaded from: classes.dex */
public final class C23730 extends DataSetObserver {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C20378 f75505;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ Spinner f75506;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ AdapterView.OnItemSelectedListener f75507;

    public C23730(Spinner spinner, C20378 c20378, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f75506 = spinner;
        this.f75505 = c20378;
        this.f75507 = onItemSelectedListener;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int selectedItemPosition = this.f75506.getSelectedItemPosition();
        if (selectedItemPosition < this.f75505.getCount()) {
            ((C23060) this.f75507).onItemSelected(null, null, selectedItemPosition, 0L);
        }
    }
}
