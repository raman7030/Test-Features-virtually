package p067l;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

/* JADX INFO: renamed from: l.ᩴܿ */
/* JADX INFO: compiled from: G58J */
/* JADX INFO: loaded from: classes4.dex */
public class C1779 {

    /* JADX INFO: renamed from: P */
    public final C1324 f62782P;
    public final int mTheme;

    public C1779(Context context) {
        this(context, DialogInterfaceC1814.m47328(context, 0));
    }

    public C1779(Context context, int i) {
        this.f62782P = new C1324(new ContextThemeWrapper(context, DialogInterfaceC1814.m47328(context, i)));
        this.mTheme = i;
    }

    public Context getContext() {
        return this.f62782P.f32406;
    }

    public C1779 setTitle(int i) {
        C1324 c1324 = this.f62782P;
        c1324.f32416 = c1324.f32406.getText(i);
        return this;
    }

    public C1779 setTitle(CharSequence charSequence) {
        this.f62782P.f32416 = charSequence;
        return this;
    }

    public C1779 setCustomTitle(View view) {
        this.f62782P.f32417 = view;
        return this;
    }

    public C1779 setMessage(int i) {
        C1324 c1324 = this.f62782P;
        c1324.f32411 = c1324.f32406.getText(i);
        return this;
    }

    public C1779 setMessage(CharSequence charSequence) {
        this.f62782P.f32411 = charSequence;
        return this;
    }

    public C1779 setIcon(int i) {
        this.f62782P.f32413 = i;
        return this;
    }

    public C1779 setIcon(Drawable drawable) {
        this.f62782P.f32389 = drawable;
        return this;
    }

    public C1779 setIconAttribute(int i) {
        TypedValue typedValue = new TypedValue();
        this.f62782P.f32406.getTheme().resolveAttribute(i, typedValue, true);
        this.f62782P.f32413 = typedValue.resourceId;
        return this;
    }

    public C1779 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        C1324 c1324 = this.f62782P;
        c1324.f32397 = c1324.f32406.getText(i);
        this.f62782P.f32388 = onClickListener;
        return this;
    }

    public C1779 setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C1324 c1324 = this.f62782P;
        c1324.f32397 = charSequence;
        c1324.f32388 = onClickListener;
        return this;
    }

    public C1779 setPositiveButtonIcon(Drawable drawable) {
        this.f62782P.f32394 = drawable;
        return this;
    }

    public C1779 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        C1324 c1324 = this.f62782P;
        c1324.f32380 = c1324.f32406.getText(i);
        this.f62782P.f32387 = onClickListener;
        return this;
    }

    public C1779 setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C1324 c1324 = this.f62782P;
        c1324.f32380 = charSequence;
        c1324.f32387 = onClickListener;
        return this;
    }

    public C1779 setNegativeButtonIcon(Drawable drawable) {
        this.f62782P.f32379 = drawable;
        return this;
    }

    public C1779 setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
        C1324 c1324 = this.f62782P;
        c1324.f32414 = c1324.f32406.getText(i);
        this.f62782P.f32402 = onClickListener;
        return this;
    }

    public C1779 setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C1324 c1324 = this.f62782P;
        c1324.f32414 = charSequence;
        c1324.f32402 = onClickListener;
        return this;
    }

    public C1779 setNeutralButtonIcon(Drawable drawable) {
        this.f62782P.f32391 = drawable;
        return this;
    }

    public C1779 setCancelable(boolean z) {
        this.f62782P.f32395 = z;
        return this;
    }

    public C1779 setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.f62782P.f32415 = onCancelListener;
        return this;
    }

    public C1779 setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f62782P.f32384 = onDismissListener;
        return this;
    }

    public C1779 setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        this.f62782P.f32398 = onKeyListener;
        return this;
    }

    public C1779 setItems(int i, DialogInterface.OnClickListener onClickListener) {
        C1324 c1324 = this.f62782P;
        c1324.f32385 = c1324.f32406.getResources().getTextArray(i);
        this.f62782P.f32386 = onClickListener;
        return this;
    }

    public C1779 setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        C1324 c1324 = this.f62782P;
        c1324.f32385 = charSequenceArr;
        c1324.f32386 = onClickListener;
        return this;
    }

    public C1779 setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        C1324 c1324 = this.f62782P;
        c1324.f32381 = listAdapter;
        c1324.f32386 = onClickListener;
        return this;
    }

    public C1779 setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
        C1324 c1324 = this.f62782P;
        c1324.f32401 = cursor;
        c1324.f32410 = str;
        c1324.f32386 = onClickListener;
        return this;
    }

    public C1779 setMultiChoiceItems(int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        C1324 c1324 = this.f62782P;
        c1324.f32385 = c1324.f32406.getResources().getTextArray(i);
        C1324 c1325 = this.f62782P;
        c1325.f32412 = onMultiChoiceClickListener;
        c1325.f32408 = zArr;
        c1325.f32403 = true;
        return this;
    }

    public C1779 setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        C1324 c1324 = this.f62782P;
        c1324.f32385 = charSequenceArr;
        c1324.f32412 = onMultiChoiceClickListener;
        c1324.f32408 = zArr;
        c1324.f32403 = true;
        return this;
    }

    public C1779 setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        C1324 c1324 = this.f62782P;
        c1324.f32401 = cursor;
        c1324.f32412 = onMultiChoiceClickListener;
        c1324.f32392 = str;
        c1324.f32410 = str2;
        c1324.f32403 = true;
        return this;
    }

    public C1779 setSingleChoiceItems(int i, int i2, DialogInterface.OnClickListener onClickListener) {
        C1324 c1324 = this.f62782P;
        c1324.f32385 = c1324.f32406.getResources().getTextArray(i);
        C1324 c1325 = this.f62782P;
        c1325.f32386 = onClickListener;
        c1325.f32404 = i2;
        c1325.f32383 = true;
        return this;
    }

    public C1779 setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
        C1324 c1324 = this.f62782P;
        c1324.f32401 = cursor;
        c1324.f32386 = onClickListener;
        c1324.f32404 = i;
        c1324.f32410 = str;
        c1324.f32383 = true;
        return this;
    }

    public C1779 setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        C1324 c1324 = this.f62782P;
        c1324.f32385 = charSequenceArr;
        c1324.f32386 = onClickListener;
        c1324.f32404 = i;
        c1324.f32383 = true;
        return this;
    }

    public C1779 setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        C1324 c1324 = this.f62782P;
        c1324.f32381 = listAdapter;
        c1324.f32386 = onClickListener;
        c1324.f32404 = i;
        c1324.f32383 = true;
        return this;
    }

    public C1779 setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f62782P.f32399 = onItemSelectedListener;
        return this;
    }

    public C1779 setView(int i) {
        C1324 c1324 = this.f62782P;
        c1324.f32400 = null;
        c1324.f32390 = i;
        c1324.f32409 = false;
        return this;
    }

    public C1779 setView(View view) {
        C1324 c1324 = this.f62782P;
        c1324.f32400 = view;
        c1324.f32390 = 0;
        c1324.f32409 = false;
        return this;
    }

    @Deprecated
    public C1779 setView(View view, int i, int i2, int i3, int i4) {
        C1324 c1324 = this.f62782P;
        c1324.f32400 = view;
        c1324.f32390 = 0;
        c1324.f32409 = true;
        c1324.f32396 = i;
        c1324.f32407 = i2;
        c1324.f32405 = i3;
        c1324.f32382 = i4;
        return this;
    }

    @Deprecated
    public C1779 setInverseBackgroundForced(boolean z) {
        this.f62782P.getClass();
        return this;
    }

    public C1779 setRecycleOnMeasureEnabled(boolean z) {
        this.f62782P.getClass();
        return this;
    }

    public DialogInterfaceC1814 create() {
        int i;
        ListAdapter simpleCursorAdapter;
        DialogInterfaceC1814 dialogInterfaceC1814 = new DialogInterfaceC1814(this.f62782P.f32406, this.mTheme);
        C1324 c1324 = this.f62782P;
        View view = c1324.f32417;
        ContextThemeWrapper contextThemeWrapper = c1324.f32406;
        C1044 c1044 = dialogInterfaceC1814.f65905;
        if (view != null) {
            c1044.m14173(view);
        } else {
            CharSequence charSequence = c1324.f32416;
            if (charSequence != null) {
                c1044.m14178(charSequence);
            }
            Drawable drawable = c1324.f32389;
            if (drawable != null) {
                c1044.m14172(drawable);
            }
            int i2 = c1324.f32413;
            if (i2 != 0) {
                c1044.m14170(i2);
            }
        }
        CharSequence charSequence2 = c1324.f32411;
        if (charSequence2 != null) {
            c1044.m14175(charSequence2);
        }
        CharSequence charSequence3 = c1324.f32397;
        if (charSequence3 != null || c1324.f32394 != null) {
            c1044.m14171(-1, charSequence3, c1324.f32388, c1324.f32394);
        }
        CharSequence charSequence4 = c1324.f32380;
        if (charSequence4 != null || c1324.f32379 != null) {
            c1044.m14171(-2, charSequence4, c1324.f32387, c1324.f32379);
        }
        CharSequence charSequence5 = c1324.f32414;
        if (charSequence5 != null || c1324.f32391 != null) {
            c1044.m14171(-3, charSequence5, c1324.f32402, c1324.f32391);
        }
        if (c1324.f32385 != null || c1324.f32401 != null || c1324.f32381 != null) {
            C0974 c0974 = (C0974) c1324.f32393.inflate(c1044.f15768, (ViewGroup) null);
            if (c1324.f32403) {
                if (c1324.f32401 == null) {
                    simpleCursorAdapter = new C1569(c1324, contextThemeWrapper, c1044.f15772, c1324.f32385, c0974);
                } else {
                    simpleCursorAdapter = new C2024(c1324, contextThemeWrapper, c1324.f32401, c0974, c1044);
                }
            } else {
                if (c1324.f32383) {
                    i = c1044.f15785;
                } else {
                    i = c1044.f15770;
                }
                int i3 = i;
                if (c1324.f32401 != null) {
                    simpleCursorAdapter = new SimpleCursorAdapter(contextThemeWrapper, i3, c1324.f32401, new String[]{c1324.f32410}, new int[]{R.id.text1});
                } else {
                    ListAdapter c1639 = c1324.f32381;
                    if (c1639 == null) {
                        c1639 = new C1639(contextThemeWrapper, i3, R.id.text1, c1324.f32385);
                    }
                    simpleCursorAdapter = c1639;
                }
            }
            c1044.f15765 = simpleCursorAdapter;
            c1044.f15763 = c1324.f32404;
            if (c1324.f32386 != null) {
                c0974.setOnItemClickListener(new C1184(c1324, c1044));
            } else if (c1324.f32412 != null) {
                c0974.setOnItemClickListener(new C1884(c1324, c0974, c1044));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = c1324.f32399;
            if (onItemSelectedListener != null) {
                c0974.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (c1324.f32383) {
                c0974.setChoiceMode(1);
            } else if (c1324.f32403) {
                c0974.setChoiceMode(2);
            }
            c1044.f15784 = c0974;
        }
        View view2 = c1324.f32400;
        if (view2 != null) {
            if (c1324.f32409) {
                c1044.m14174(view2, c1324.f32396, c1324.f32407, c1324.f32405, c1324.f32382);
            } else {
                c1044.m14177(view2);
            }
        } else {
            int i4 = c1324.f32390;
            if (i4 != 0) {
                c1044.m14176(i4);
            }
        }
        dialogInterfaceC1814.setCancelable(this.f62782P.f32395);
        if (this.f62782P.f32395) {
            dialogInterfaceC1814.setCanceledOnTouchOutside(true);
        }
        dialogInterfaceC1814.setOnCancelListener(this.f62782P.f32415);
        dialogInterfaceC1814.setOnDismissListener(this.f62782P.f32384);
        DialogInterface.OnKeyListener onKeyListener = this.f62782P.f32398;
        if (onKeyListener != null) {
            dialogInterfaceC1814.setOnKeyListener(onKeyListener);
        }
        return dialogInterfaceC1814;
    }

    public DialogInterfaceC1814 show() {
        DialogInterfaceC1814 dialogInterfaceC1814Create = create();
        dialogInterfaceC1814Create.show();
        return dialogInterfaceC1814Create;
    }
}
