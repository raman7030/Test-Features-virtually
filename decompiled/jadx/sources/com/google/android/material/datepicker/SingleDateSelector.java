package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import l.C15813;
import l.C17931;
import l.C20754;
import l.C3820;

/* JADX INFO: loaded from: classes.dex */
public class SingleDateSelector implements DateSelector {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.google.android.material.datepicker.SingleDateSelector.2
        @Override // android.os.Parcelable.Creator
        public SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.selectedItem = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        public SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    };
    public CharSequence error;
    public Long selectedItem;
    public SimpleDateFormat textInputFormat;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j) {
        this.selectedItem = Long.valueOf(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelection() {
        this.selectedItem = null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setSelection(Long l2) {
        this.selectedItem = l2 == null ? null : Long.valueOf(UtcDates.canonicalYearMonthDay(l2.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        return this.selectedItem != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection getSelectedRanges() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l2 = this.selectedItem;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Long getSelection() {
        return this.selectedItem;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            simpleDateFormat = (SimpleDateFormat) UtcDates.getNormalizedFormat(simpleDateFormat);
        }
        this.textInputFormat = simpleDateFormat;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, final OnSelectionChangedListener onSelectionChangedListener) {
        String defaultTextInputHint;
        View viewInflate = layoutInflater.inflate(C15813.f48801, viewGroup, false);
        final TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(C20754.f67006);
        EditText editText = textInputLayout.getEditText();
        if (ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            editText.setInputType(17);
        }
        SimpleDateFormat defaultTextInputFormat = this.textInputFormat;
        boolean z = defaultTextInputFormat != null;
        if (!z) {
            defaultTextInputFormat = UtcDates.getDefaultTextInputFormat();
        }
        SimpleDateFormat simpleDateFormat = defaultTextInputFormat;
        if (z) {
            defaultTextInputHint = simpleDateFormat.toPattern();
        } else {
            defaultTextInputHint = UtcDates.getDefaultTextInputHint(viewInflate.getResources(), simpleDateFormat);
        }
        String str = defaultTextInputHint;
        textInputLayout.setPlaceholderText(str);
        Long l2 = this.selectedItem;
        if (l2 != null) {
            editText.setText(simpleDateFormat.format(l2));
        }
        editText.addTextChangedListener(new DateFormatTextWatcher(str, simpleDateFormat, textInputLayout, calendarConstraints) { // from class: com.google.android.material.datepicker.SingleDateSelector.1
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onValidDate(Long l3) {
                if (l3 == null) {
                    SingleDateSelector.this.clearSelection();
                } else {
                    SingleDateSelector.this.select(l3.longValue());
                }
                SingleDateSelector.this.error = null;
                onSelectionChangedListener.onSelectionChanged(SingleDateSelector.this.getSelection());
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onInvalidDate() {
                SingleDateSelector.this.error = textInputLayout.getError();
                onSelectionChangedListener.onIncompleteSelectionChanged();
            }
        });
        DateSelector.CC.showKeyboardWithAutoHideBehavior(editText);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(Context context) {
        return MaterialAttributes.resolveOrThrow(context, C17931.f54980, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String getSelectionDisplayString(Context context) {
        Resources resources = context.getResources();
        Long l2 = this.selectedItem;
        if (l2 == null) {
            return resources.getString(C3820.f12085);
        }
        return resources.getString(C3820.f12166, DateStrings.getYearMonthDay(l2.longValue()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String getSelectionContentDescription(Context context) {
        String yearMonthDay;
        Resources resources = context.getResources();
        Long l2 = this.selectedItem;
        if (l2 == null) {
            yearMonthDay = resources.getString(C3820.f12201);
        } else {
            yearMonthDay = DateStrings.getYearMonthDay(l2.longValue());
        }
        return resources.getString(C3820.f12104, yearMonthDay);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String getError() {
        if (TextUtils.isEmpty(this.error)) {
            return null;
        }
        return this.error.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return C3820.f12075;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.selectedItem);
    }
}
