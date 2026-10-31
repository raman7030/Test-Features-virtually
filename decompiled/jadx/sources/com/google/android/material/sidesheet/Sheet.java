package com.google.android.material.sidesheet;

import com.google.android.material.motion.MaterialBackHandler;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public interface Sheet extends MaterialBackHandler {
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 0;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface SheetEdge {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SheetState {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StableSheetState {
    }

    void addCallback(SheetCallback sheetCallback);

    int getState();

    void removeCallback(SheetCallback sheetCallback);

    void setState(int i);
}
