package l;

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

/* JADX INFO: renamed from: l.ᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G58J */
/* JADX INFO: loaded from: classes4.dex */
public class C18892 {
    public final C9720 P;
    public final int mTheme;

    public C18892(Context context) {
        this(context, DialogInterfaceC19598.m45033(context, 0));
    }

    public C18892(Context context, int i) {
        this.P = new C9720(new ContextThemeWrapper(context, DialogInterfaceC19598.m45033(context, i)));
        this.mTheme = i;
    }

    public Context getContext() {
        return this.P.f29456;
    }

    public C18892 setTitle(int i) {
        C9720 c9720 = this.P;
        c9720.f29466 = c9720.f29456.getText(i);
        return this;
    }

    public C18892 setTitle(CharSequence charSequence) {
        this.P.f29466 = charSequence;
        return this;
    }

    public C18892 setCustomTitle(View view) {
        this.P.f29467 = view;
        return this;
    }

    public C18892 setMessage(int i) {
        C9720 c9720 = this.P;
        c9720.f29461 = c9720.f29456.getText(i);
        return this;
    }

    public C18892 setMessage(CharSequence charSequence) {
        this.P.f29461 = charSequence;
        return this;
    }

    public C18892 setIcon(int i) {
        this.P.f29463 = i;
        return this;
    }

    public C18892 setIcon(Drawable drawable) {
        this.P.f29439 = drawable;
        return this;
    }

    public C18892 setIconAttribute(int i) {
        TypedValue typedValue = new TypedValue();
        this.P.f29456.getTheme().resolveAttribute(i, typedValue, true);
        this.P.f29463 = typedValue.resourceId;
        return this;
    }

    public C18892 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        C9720 c9720 = this.P;
        c9720.f29447 = c9720.f29456.getText(i);
        this.P.f29438 = onClickListener;
        return this;
    }

    public C18892 setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C9720 c9720 = this.P;
        c9720.f29447 = charSequence;
        c9720.f29438 = onClickListener;
        return this;
    }

    public C18892 setPositiveButtonIcon(Drawable drawable) {
        this.P.f29444 = drawable;
        return this;
    }

    public C18892 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        C9720 c9720 = this.P;
        c9720.f29430 = c9720.f29456.getText(i);
        this.P.f29437 = onClickListener;
        return this;
    }

    public C18892 setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C9720 c9720 = this.P;
        c9720.f29430 = charSequence;
        c9720.f29437 = onClickListener;
        return this;
    }

    public C18892 setNegativeButtonIcon(Drawable drawable) {
        this.P.f29429 = drawable;
        return this;
    }

    public C18892 setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
        C9720 c9720 = this.P;
        c9720.f29464 = c9720.f29456.getText(i);
        this.P.f29452 = onClickListener;
        return this;
    }

    public C18892 setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        C9720 c9720 = this.P;
        c9720.f29464 = charSequence;
        c9720.f29452 = onClickListener;
        return this;
    }

    public C18892 setNeutralButtonIcon(Drawable drawable) {
        this.P.f29441 = drawable;
        return this;
    }

    public C18892 setCancelable(boolean z) {
        this.P.f29445 = z;
        return this;
    }

    public C18892 setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.P.f29465 = onCancelListener;
        return this;
    }

    public C18892 setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.P.f29434 = onDismissListener;
        return this;
    }

    public C18892 setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        this.P.f29448 = onKeyListener;
        return this;
    }

    public C18892 setItems(int i, DialogInterface.OnClickListener onClickListener) {
        C9720 c9720 = this.P;
        c9720.f29435 = c9720.f29456.getResources().getTextArray(i);
        this.P.f29436 = onClickListener;
        return this;
    }

    public C18892 setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        C9720 c9720 = this.P;
        c9720.f29435 = charSequenceArr;
        c9720.f29436 = onClickListener;
        return this;
    }

    public C18892 setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        C9720 c9720 = this.P;
        c9720.f29431 = listAdapter;
        c9720.f29436 = onClickListener;
        return this;
    }

    public C18892 setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
        C9720 c9720 = this.P;
        c9720.f29451 = cursor;
        c9720.f29460 = str;
        c9720.f29436 = onClickListener;
        return this;
    }

    public C18892 setMultiChoiceItems(int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        C9720 c9720 = this.P;
        c9720.f29435 = c9720.f29456.getResources().getTextArray(i);
        C9720 c9721 = this.P;
        c9721.f29462 = onMultiChoiceClickListener;
        c9721.f29458 = zArr;
        c9721.f29453 = true;
        return this;
    }

    public C18892 setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        C9720 c9720 = this.P;
        c9720.f29435 = charSequenceArr;
        c9720.f29462 = onMultiChoiceClickListener;
        c9720.f29458 = zArr;
        c9720.f29453 = true;
        return this;
    }

    public C18892 setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        C9720 c9720 = this.P;
        c9720.f29451 = cursor;
        c9720.f29462 = onMultiChoiceClickListener;
        c9720.f29442 = str;
        c9720.f29460 = str2;
        c9720.f29453 = true;
        return this;
    }

    public C18892 setSingleChoiceItems(int i, int i2, DialogInterface.OnClickListener onClickListener) {
        C9720 c9720 = this.P;
        c9720.f29435 = c9720.f29456.getResources().getTextArray(i);
        C9720 c9721 = this.P;
        c9721.f29436 = onClickListener;
        c9721.f29454 = i2;
        c9721.f29433 = true;
        return this;
    }

    public C18892 setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
        C9720 c9720 = this.P;
        c9720.f29451 = cursor;
        c9720.f29436 = onClickListener;
        c9720.f29454 = i;
        c9720.f29460 = str;
        c9720.f29433 = true;
        return this;
    }

    public C18892 setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        C9720 c9720 = this.P;
        c9720.f29435 = charSequenceArr;
        c9720.f29436 = onClickListener;
        c9720.f29454 = i;
        c9720.f29433 = true;
        return this;
    }

    public C18892 setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        C9720 c9720 = this.P;
        c9720.f29431 = listAdapter;
        c9720.f29436 = onClickListener;
        c9720.f29454 = i;
        c9720.f29433 = true;
        return this;
    }

    public C18892 setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.P.f29449 = onItemSelectedListener;
        return this;
    }

    public C18892 setView(int i) {
        C9720 c9720 = this.P;
        c9720.f29450 = null;
        c9720.f29440 = i;
        c9720.f29459 = false;
        return this;
    }

    public C18892 setView(View view) {
        C9720 c9720 = this.P;
        c9720.f29450 = view;
        c9720.f29440 = 0;
        c9720.f29459 = false;
        return this;
    }

    @Deprecated
    public C18892 setView(View view, int i, int i2, int i3, int i4) {
        C9720 c9720 = this.P;
        c9720.f29450 = view;
        c9720.f29440 = 0;
        c9720.f29459 = true;
        c9720.f29446 = i;
        c9720.f29457 = i2;
        c9720.f29455 = i3;
        c9720.f29432 = i4;
        return this;
    }

    @Deprecated
    public C18892 setInverseBackgroundForced(boolean z) {
        this.P.getClass();
        return this;
    }

    public C18892 setRecycleOnMeasureEnabled(boolean z) {
        this.P.getClass();
        return this;
    }

    public DialogInterfaceC19598 create() {
        int i;
        ListAdapter simpleCursorAdapter;
        DialogInterfaceC19598 dialogInterfaceC19598 = new DialogInterfaceC19598(this.P.f29456, this.mTheme);
        C9720 c9720 = this.P;
        View view = c9720.f29467;
        ContextThemeWrapper contextThemeWrapper = c9720.f29456;
        C4075 c4075 = dialogInterfaceC19598.f63287;
        if (view != null) {
            c4075.m12268(view);
        } else {
            CharSequence charSequence = c9720.f29466;
            if (charSequence != null) {
                c4075.m12273(charSequence);
            }
            Drawable drawable = c9720.f29439;
            if (drawable != null) {
                c4075.m12267(drawable);
            }
            int i2 = c9720.f29463;
            if (i2 != 0) {
                c4075.m12265(i2);
            }
        }
        CharSequence charSequence2 = c9720.f29461;
        if (charSequence2 != null) {
            c4075.m12270(charSequence2);
        }
        CharSequence charSequence3 = c9720.f29447;
        if (charSequence3 != null || c9720.f29444 != null) {
            c4075.m12266(-1, charSequence3, c9720.f29438, c9720.f29444);
        }
        CharSequence charSequence4 = c9720.f29430;
        if (charSequence4 != null || c9720.f29429 != null) {
            c4075.m12266(-2, charSequence4, c9720.f29437, c9720.f29429);
        }
        CharSequence charSequence5 = c9720.f29464;
        if (charSequence5 != null || c9720.f29441 != null) {
            c4075.m12266(-3, charSequence5, c9720.f29452, c9720.f29441);
        }
        if (c9720.f29435 != null || c9720.f29451 != null || c9720.f29431 != null) {
            C2664 c2664 = (C2664) c9720.f29443.inflate(c4075.f12953, (ViewGroup) null);
            if (c9720.f29453) {
                if (c9720.f29451 == null) {
                    simpleCursorAdapter = new C14657(c9720, contextThemeWrapper, c4075.f12957, c9720.f29435, c2664);
                } else {
                    simpleCursorAdapter = new C23830(c9720, contextThemeWrapper, c9720.f29451, c2664, c4075);
                }
            } else {
                if (c9720.f29433) {
                    i = c4075.f12970;
                } else {
                    i = c4075.f12955;
                }
                int i3 = i;
                if (c9720.f29451 != null) {
                    simpleCursorAdapter = new SimpleCursorAdapter(contextThemeWrapper, i3, c9720.f29451, new String[]{c9720.f29460}, new int[]{R.id.text1});
                } else {
                    ListAdapter c16068 = c9720.f29431;
                    if (c16068 == null) {
                        c16068 = new C16068(contextThemeWrapper, i3, R.id.text1, c9720.f29435);
                    }
                    simpleCursorAdapter = c16068;
                }
            }
            c4075.f12950 = simpleCursorAdapter;
            c4075.f12948 = c9720.f29454;
            if (c9720.f29436 != null) {
                c2664.setOnItemClickListener(new C6897(c9720, c4075));
            } else if (c9720.f29462 != null) {
                c2664.setOnItemClickListener(new C21009(c9720, c2664, c4075));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = c9720.f29449;
            if (onItemSelectedListener != null) {
                c2664.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (c9720.f29433) {
                c2664.setChoiceMode(1);
            } else if (c9720.f29453) {
                c2664.setChoiceMode(2);
            }
            c4075.f12969 = c2664;
        }
        View view2 = c9720.f29450;
        if (view2 != null) {
            if (c9720.f29459) {
                c4075.m12269(view2, c9720.f29446, c9720.f29457, c9720.f29455, c9720.f29432);
            } else {
                c4075.m12272(view2);
            }
        } else {
            int i4 = c9720.f29440;
            if (i4 != 0) {
                c4075.m12271(i4);
            }
        }
        dialogInterfaceC19598.setCancelable(this.P.f29445);
        if (this.P.f29445) {
            dialogInterfaceC19598.setCanceledOnTouchOutside(true);
        }
        dialogInterfaceC19598.setOnCancelListener(this.P.f29465);
        dialogInterfaceC19598.setOnDismissListener(this.P.f29434);
        DialogInterface.OnKeyListener onKeyListener = this.P.f29448;
        if (onKeyListener != null) {
            dialogInterfaceC19598.setOnKeyListener(onKeyListener);
        }
        return dialogInterfaceC19598;
    }

    public DialogInterfaceC19598 show() {
        DialogInterfaceC19598 dialogInterfaceC19598Create = create();
        dialogInterfaceC19598Create.show();
        return dialogInterfaceC19598Create;
    }
}
