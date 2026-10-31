package l;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* JADX INFO: renamed from: l.ܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P54R */
/* JADX INFO: loaded from: classes4.dex */
public final class C16465 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38768(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ActionMode m38767(Window.Callback callback, ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }
}
