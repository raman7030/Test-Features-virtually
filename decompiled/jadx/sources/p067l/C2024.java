package p067l;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;

/* JADX INFO: renamed from: l.᩻ܿ */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes.dex */
public final class C2024 extends CursorAdapter {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C0974 f79857;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C1044 f79858;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C1324 f79859;

    /* JADX INFO: renamed from: ᩸ */
    public final int f79860;

    /* JADX INFO: renamed from: ᩹ */
    public final int f79861;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2024(C1324 c1324, ContextThemeWrapper contextThemeWrapper, Cursor cursor, C0974 c0974, C1044 c1044) {
        super((Context) contextThemeWrapper, cursor, false);
        this.f79859 = c1324;
        this.f79857 = c0974;
        this.f79858 = c1044;
        Cursor cursor2 = getCursor();
        this.f79861 = cursor2.getColumnIndexOrThrow(c1324.f32410);
        this.f79860 = cursor2.getColumnIndexOrThrow(c1324.f32392);
    }

    @Override // android.widget.CursorAdapter
    public final void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f79861));
        this.f79857.setItemChecked(cursor.getPosition(), cursor.getInt(this.f79860) == 1);
    }

    @Override // android.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f79859.f32393.inflate(this.f79858.f15772, viewGroup, false);
    }
}
