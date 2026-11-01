package p067l;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* JADX INFO: renamed from: l.ܽۜ */
/* JADX INFO: compiled from: P54R */
/* JADX INFO: loaded from: classes4.dex */
public final class C1659 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m40994(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ActionMode m40993(Window.Callback callback, ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }
}
