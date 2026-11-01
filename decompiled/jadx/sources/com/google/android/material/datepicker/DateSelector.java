package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.internal.ViewUtils;
import java.text.SimpleDateFormat;
import java.util.Collection;
import p067l.RunnableC20435;

/* JADX INFO: loaded from: classes.dex */
public interface DateSelector extends Parcelable {
    int getDefaultThemeResId(Context context);

    int getDefaultTitleResId();

    String getError();

    Collection getSelectedDays();

    Collection getSelectedRanges();

    Object getSelection();

    String getSelectionContentDescription(Context context);

    String getSelectionDisplayString(Context context);

    boolean isSelectionComplete();

    View onCreateTextInputView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, OnSelectionChangedListener onSelectionChangedListener);

    void select(long j);

    void setSelection(Object obj);

    void setTextInputFormat(SimpleDateFormat simpleDateFormat);

    /* JADX INFO: renamed from: com.google.android.material.datepicker.DateSelector$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void showKeyboardWithAutoHideBehavior(final EditText... editTextArr) {
            if (editTextArr.length == 0) {
                return;
            }
            View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.google.android.material.datepicker.DateSelector$$ExternalSyntheticLambda0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    DateSelector.CC.lambda$showKeyboardWithAutoHideBehavior$0(editTextArr, view, z);
                }
            };
            for (EditText editText : editTextArr) {
                editText.setOnFocusChangeListener(onFocusChangeListener);
            }
            EditText editText2 = editTextArr[0];
            editText2.postDelayed(new RunnableC20435(6, editText2), 100L);
        }

        public static /* synthetic */ void lambda$showKeyboardWithAutoHideBehavior$0(EditText[] editTextArr, View view, boolean z) {
            for (EditText editText : editTextArr) {
                if (editText.hasFocus()) {
                    return;
                }
            }
            ViewUtils.hideKeyboard(view, false);
        }
    }
}
