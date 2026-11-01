package p067l;

import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import bin.p000mt.plugin.api.p002ui.PluginSpinner;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X7NV */
/* JADX INFO: loaded from: classes4.dex */
public final class C14682 extends C9318 implements PluginSpinner {
    @Override // bin.p000mt.plugin.api.p002ui.PluginSpinner
    public final void setItems(List list) {
        ((Spinner) this.f25339).setAdapter((SpinnerAdapter) new C21438(((Spinner) this.f25339).getContext(), list));
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginSpinner
    public final void setOnItemSelectedListener(PluginSpinner.OnItemSelectedListener onItemSelectedListener) {
        if (onItemSelectedListener == null) {
            ((Spinner) this.f25339).setOnItemSelectedListener(null);
        } else {
            ((Spinner) this.f25339).setOnItemSelectedListener(new C5295(this, onItemSelectedListener));
        }
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginSpinner
    public final int getSelection() {
        return ((Spinner) this.f25339).getSelectedItemPosition();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginSpinner
    public final Object getSelectedItem() {
        return ((Spinner) this.f25339).getSelectedItem();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginSpinner
    public final Object getItem(int i) {
        return ((Spinner) this.f25339).getItemAtPosition(i);
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginSpinner
    public final int getCount() {
        return ((Spinner) this.f25339).getCount();
    }

    @Override // bin.p000mt.plugin.api.p002ui.PluginSpinner
    public final void setSelection(int i) {
        if (C12799.m29347()) {
            if (i < 0 || i >= ((Spinner) this.f25339).getCount()) {
                i = 0;
            }
            ((Spinner) this.f25339).setSelection(i);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
