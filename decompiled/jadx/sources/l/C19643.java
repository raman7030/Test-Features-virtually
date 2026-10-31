package l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩵ᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U8TP */
/* JADX INFO: loaded from: classes4.dex */
public final class C19643 implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = new C2709();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f63386;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18937[] f63387;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f63388;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f63389;

    public C19643() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C18937 c18937 = (C18937) obj;
        C18937 c18938 = (C18937) obj2;
        UUID uuid = C23875.f77204;
        if (uuid.equals(c18937.f59726)) {
            return uuid.equals(c18938.f59726) ? 0 : 1;
        }
        return c18937.f59726.compareTo(c18938.f59726);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19643 m45152(C19643 c19643, C19643 c19644) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (c19643 != null) {
            str = c19643.f63386;
            for (C18937 c18937 : c19643.f63387) {
                if (c18937.f59729 != null) {
                    arrayList.add(c18937);
                }
            }
        } else {
            str = null;
        }
        if (c19644 != null) {
            if (str == null) {
                str = c19644.f63386;
            }
            int size = arrayList.size();
            for (C18937 c18938 : c19644.f63387) {
                if (c18938.f59729 != null) {
                    UUID uuid = c18938.f59726;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            arrayList.add(c18938);
                            break;
                        }
                        if (((C18937) arrayList.get(i)).f59726.equals(uuid)) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C19643(str, false, (C18937[]) arrayList.toArray(new C18937[0]));
    }

    public C19643(ArrayList arrayList) {
        this(null, false, (C18937[]) arrayList.toArray(new C18937[0]));
    }

    public C19643(String str, C18937... c18937Arr) {
        this(str, true, c18937Arr);
    }

    public C19643(C18937... c18937Arr) {
        this(null, true, c18937Arr);
    }

    public C19643(String str, boolean z, C18937... c18937Arr) {
        this.f63386 = str;
        c18937Arr = z ? (C18937[]) c18937Arr.clone() : c18937Arr;
        this.f63387 = c18937Arr;
        this.f63389 = c18937Arr.length;
        Arrays.sort(c18937Arr, this);
    }

    public C19643(Parcel parcel) {
        this.f63386 = parcel.readString();
        C18937[] c18937Arr = (C18937[]) parcel.createTypedArray(C18937.CREATOR);
        String str = C3603.f11424;
        this.f63387 = c18937Arr;
        this.f63389 = c18937Arr.length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18937 m45153(int i) {
        return this.f63387[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19643 m45154(String str) {
        return C11003.equals(this.f63386, str) ? this : new C19643(str, false, this.f63387);
    }

    public final int hashCode() {
        if (this.f63388 == 0) {
            String str = this.f63386;
            this.f63388 = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f63387);
        }
        return this.f63388;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C19643.class == obj.getClass()) {
            C19643 c19643 = (C19643) obj;
            if (C11003.equals(this.f63386, c19643.f63386) && Arrays.equals(this.f63387, c19643.f63387)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f63386);
        parcel.writeTypedArray(this.f63387, 0);
    }
}
