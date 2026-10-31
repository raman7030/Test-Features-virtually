package com.google.android.material.datepicker;

import java.util.LinkedHashSet;
import l.ComponentCallbacksC9205;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PickerFragment extends ComponentCallbacksC9205 {
    public final LinkedHashSet onSelectionChangedListeners = new LinkedHashSet();

    public abstract DateSelector getDateSelector();

    public boolean addOnSelectionChangedListener(OnSelectionChangedListener onSelectionChangedListener) {
        return this.onSelectionChangedListeners.add(onSelectionChangedListener);
    }

    public boolean removeOnSelectionChangedListener(OnSelectionChangedListener onSelectionChangedListener) {
        return this.onSelectionChangedListeners.remove(onSelectionChangedListener);
    }

    public void clearOnSelectionChangedListeners() {
        this.onSelectionChangedListeners.clear();
    }
}
