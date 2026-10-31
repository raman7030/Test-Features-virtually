package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import l.AbstractC7152;
import l.C10884;
import l.C14369;
import l.C16445;
import l.C17648;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends C10884 implements Checkable {
    public static final int[] DRAWABLE_STATE_CHECKED = {R.attr.state_checked};
    public boolean checkable;
    public boolean checked;
    public boolean pressable;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.checkable = true;
        this.pressable = true;
        C17648.m41309(this, new C16445() { // from class: com.google.android.material.internal.CheckableImageButton.1
            @Override // l.C16445
            public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
            }

            @Override // l.C16445
            public void onInitializeAccessibilityNodeInfo(View view, C14369 c14369) {
                super.onInitializeAccessibilityNodeInfo(view, c14369);
                c14369.m34308(CheckableImageButton.this.isCheckable());
                c14369.m34320(CheckableImageButton.this.isChecked());
            }
        });
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.checkable || this.checked == z) {
            return;
        }
        this.checked = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.checked;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.checked);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.pressable) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.checked) {
            int[] iArr = DRAWABLE_STATE_CHECKED;
            return View.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.checked = this.checked;
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.checked);
    }

    public void setCheckable(boolean z) {
        if (this.checkable != z) {
            this.checkable = z;
            sendAccessibilityEvent(0);
        }
    }

    public boolean isCheckable() {
        return this.checkable;
    }

    public void setPressable(boolean z) {
        this.pressable = z;
    }

    public boolean isPressable() {
        return this.pressable;
    }

    public class SavedState extends AbstractC7152 {
        public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: com.google.android.material.internal.CheckableImageButton.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public boolean checked;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel);
        }

        @Override // l.AbstractC7152, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.checked ? 1 : 0);
        }

        private void readFromParcel(Parcel parcel) {
            this.checked = parcel.readInt() == 1;
        }
    }
}
