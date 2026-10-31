package l;

import android.database.DataSetObserver;
import android.widget.AdapterView;
import android.widget.Spinner;

/* JADX INFO: renamed from: l.᩹ᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Z */
/* JADX INFO: loaded from: classes.dex */
public final class C22476 extends DataSetObserver {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18949 f72778;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f72779;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AdapterView.OnItemSelectedListener f72780;

    public C22476(Spinner spinner, C18949 c18949, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f72779 = spinner;
        this.f72778 = c18949;
        this.f72780 = onItemSelectedListener;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int selectedItemPosition = this.f72779.getSelectedItemPosition();
        if (selectedItemPosition < this.f72778.getCount()) {
            ((C21771) this.f72780).onItemSelected(null, null, selectedItemPosition, 0L);
        }
    }
}
