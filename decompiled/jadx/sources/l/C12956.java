package l;

import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import bin.mt.plugin.api.ui.PluginSpinner;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X7NV */
/* JADX INFO: loaded from: classes4.dex */
public final class C12956 extends C7312 implements PluginSpinner {
    @Override // bin.mt.plugin.api.ui.PluginSpinner
    public final void setItems(List list) {
        ((Spinner) this.f22448).setAdapter((SpinnerAdapter) new C20065(((Spinner) this.f22448).getContext(), list));
    }

    @Override // bin.mt.plugin.api.ui.PluginSpinner
    public final void setOnItemSelectedListener(PluginSpinner.OnItemSelectedListener onItemSelectedListener) {
        if (onItemSelectedListener == null) {
            ((Spinner) this.f22448).setOnItemSelectedListener(null);
        } else {
            ((Spinner) this.f22448).setOnItemSelectedListener(new C3079(this, onItemSelectedListener));
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginSpinner
    public final int getSelection() {
        return ((Spinner) this.f22448).getSelectedItemPosition();
    }

    @Override // bin.mt.plugin.api.ui.PluginSpinner
    public final Object getSelectedItem() {
        return ((Spinner) this.f22448).getSelectedItem();
    }

    @Override // bin.mt.plugin.api.ui.PluginSpinner
    public final Object getItem(int i) {
        return ((Spinner) this.f22448).getItemAtPosition(i);
    }

    @Override // bin.mt.plugin.api.ui.PluginSpinner
    public final int getCount() {
        return ((Spinner) this.f22448).getCount();
    }

    @Override // bin.mt.plugin.api.ui.PluginSpinner
    public final void setSelection(int i) {
        if (C10975.m27285()) {
            if (i < 0 || i >= ((Spinner) this.f22448).getCount()) {
                i = 0;
            }
            ((Spinner) this.f22448).setSelection(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
