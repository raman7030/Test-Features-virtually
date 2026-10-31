package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class CheckableGroup {
    public final Map checkables = new HashMap();
    public final Set checkedIds = new HashSet();
    public OnCheckedStateChangeListener onCheckedStateChangeListener;
    public boolean selectionRequired;
    public boolean singleSelection;

    public interface OnCheckedStateChangeListener {
        void onCheckedStateChanged(Set set);
    }

    public void setSingleSelection(boolean z) {
        if (this.singleSelection != z) {
            this.singleSelection = z;
            clearCheck();
        }
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void setSelectionRequired(boolean z) {
        this.selectionRequired = z;
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public void setOnCheckedStateChangeListener(OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.onCheckedStateChangeListener = onCheckedStateChangeListener;
    }

    public void addCheckable(MaterialCheckable materialCheckable) {
        this.checkables.put(Integer.valueOf(materialCheckable.getId()), materialCheckable);
        if (materialCheckable.isChecked()) {
            checkInternal(materialCheckable);
        }
        materialCheckable.setInternalOnCheckedChangeListener(new MaterialCheckable.OnCheckedChangeListener() { // from class: com.google.android.material.internal.CheckableGroup.1
            @Override // com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener
            public void onCheckedChanged(MaterialCheckable materialCheckable2, boolean z) {
                if (z) {
                    if (!CheckableGroup.this.checkInternal(materialCheckable2)) {
                        return;
                    }
                } else {
                    CheckableGroup checkableGroup = CheckableGroup.this;
                    if (!checkableGroup.uncheckInternal(materialCheckable2, checkableGroup.selectionRequired)) {
                        return;
                    }
                }
                CheckableGroup.this.onCheckedStateChanged();
            }
        });
    }

    public void removeCheckable(MaterialCheckable materialCheckable) {
        materialCheckable.setInternalOnCheckedChangeListener(null);
        this.checkables.remove(Integer.valueOf(materialCheckable.getId()));
        this.checkedIds.remove(Integer.valueOf(materialCheckable.getId()));
    }

    public void check(int i) {
        MaterialCheckable materialCheckable = (MaterialCheckable) this.checkables.get(Integer.valueOf(i));
        if (materialCheckable != null && checkInternal(materialCheckable)) {
            onCheckedStateChanged();
        }
    }

    public void uncheck(int i) {
        MaterialCheckable materialCheckable = (MaterialCheckable) this.checkables.get(Integer.valueOf(i));
        if (materialCheckable != null && uncheckInternal(materialCheckable, this.selectionRequired)) {
            onCheckedStateChanged();
        }
    }

    public void clearCheck() {
        boolean zIsEmpty = this.checkedIds.isEmpty();
        Iterator it = this.checkables.values().iterator();
        while (it.hasNext()) {
            uncheckInternal((MaterialCheckable) it.next(), false);
        }
        if (zIsEmpty) {
            return;
        }
        onCheckedStateChanged();
    }

    public int getSingleCheckedId() {
        if (!this.singleSelection || this.checkedIds.isEmpty()) {
            return -1;
        }
        return ((Integer) this.checkedIds.iterator().next()).intValue();
    }

    public Set getCheckedIds() {
        return new HashSet(this.checkedIds);
    }

    public List getCheckedIdsSortedByChildOrder(ViewGroup viewGroup) {
        Set checkedIds = getCheckedIds();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof MaterialCheckable) && checkedIds.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkInternal(MaterialCheckable materialCheckable) {
        int id = materialCheckable.getId();
        if (this.checkedIds.contains(Integer.valueOf(id))) {
            return false;
        }
        MaterialCheckable materialCheckable2 = (MaterialCheckable) this.checkables.get(Integer.valueOf(getSingleCheckedId()));
        if (materialCheckable2 != null) {
            uncheckInternal(materialCheckable2, false);
        }
        boolean zAdd = this.checkedIds.add(Integer.valueOf(id));
        if (!materialCheckable.isChecked()) {
            materialCheckable.setChecked(true);
        }
        return zAdd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uncheckInternal(MaterialCheckable materialCheckable, boolean z) {
        int id = materialCheckable.getId();
        if (!this.checkedIds.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && this.checkedIds.size() == 1 && this.checkedIds.contains(Integer.valueOf(id))) {
            materialCheckable.setChecked(true);
            return false;
        }
        boolean zRemove = this.checkedIds.remove(Integer.valueOf(id));
        if (materialCheckable.isChecked()) {
            materialCheckable.setChecked(false);
        }
        return zRemove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCheckedStateChanged() {
        OnCheckedStateChangeListener onCheckedStateChangeListener = this.onCheckedStateChangeListener;
        if (onCheckedStateChangeListener != null) {
            onCheckedStateChangeListener.onCheckedStateChanged(getCheckedIds());
        }
    }
}
