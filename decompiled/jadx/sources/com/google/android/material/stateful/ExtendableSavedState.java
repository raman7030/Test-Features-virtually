package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.sdk.m.y.l;
import l.AbstractC7152;
import l.C3432;

/* JADX INFO: loaded from: classes.dex */
public class ExtendableSavedState extends AbstractC7152 {
    public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: com.google.android.material.stateful.ExtendableSavedState.1
        @Override // android.os.Parcelable.ClassLoaderCreator
        public ExtendableSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public ExtendableSavedState createFromParcel(Parcel parcel) {
            return new ExtendableSavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public ExtendableSavedState[] newArray(int i) {
            return new ExtendableSavedState[i];
        }
    };
    public final C3432 extendableStates;

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.extendableStates = new C3432();
    }

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.extendableStates = new C3432(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.extendableStates.put(strArr[i2], bundleArr[i2]);
        }
    }

    @Override // l.AbstractC7152, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.extendableStates.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = (String) this.extendableStates.m10499(i2);
            bundleArr[i2] = (Bundle) this.extendableStates.m10498(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.extendableStates + l.d;
    }
}
