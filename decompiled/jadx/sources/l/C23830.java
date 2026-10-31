package l;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;

/* JADX INFO: renamed from: l.᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes.dex */
public final class C23830 extends CursorAdapter {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2664 f77106;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4075 f77107;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9720 f77108;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f77109;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f77110;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23830(C9720 c9720, ContextThemeWrapper contextThemeWrapper, Cursor cursor, C2664 c2664, C4075 c4075) {
        super((Context) contextThemeWrapper, cursor, false);
        this.f77108 = c9720;
        this.f77106 = c2664;
        this.f77107 = c4075;
        Cursor cursor2 = getCursor();
        this.f77110 = cursor2.getColumnIndexOrThrow(c9720.f29460);
        this.f77109 = cursor2.getColumnIndexOrThrow(c9720.f29442);
    }

    @Override // android.widget.CursorAdapter
    public final void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f77110));
        this.f77106.setItemChecked(cursor.getPosition(), cursor.getInt(this.f77109) == 1);
    }

    @Override // android.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f77108.f29443.inflate(this.f77107.f12957, viewGroup, false);
    }
}
