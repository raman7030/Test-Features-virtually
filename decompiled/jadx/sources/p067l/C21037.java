package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: renamed from: l.᩵ᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U8TP */
/* JADX INFO: loaded from: classes4.dex */
public final class C21037 implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = new C4943();

    /* JADX INFO: renamed from: ۙ */
    public final String f66009;

    /* JADX INFO: renamed from: ᩶ */
    public final C20366[] f66010;

    /* JADX INFO: renamed from: ᩸ */
    public int f66011;

    /* JADX INFO: renamed from: ᩹ */
    public final int f66012;

    public C21037() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C20366 c20366 = (C20366) obj;
        C20366 c20367 = (C20366) obj2;
        UUID uuid = C25059.f79956;
        if (uuid.equals(c20366.f62957)) {
            return uuid.equals(c20367.f62957) ? 0 : 1;
        }
        return c20366.f62957.compareTo(c20367.f62957);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21037 m47448(C21037 c21037, C21037 c21038) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (c21037 != null) {
            str = c21037.f66009;
            for (C20366 c20366 : c21037.f66010) {
                if (c20366.f62960 != null) {
                    arrayList.add(c20366);
                }
            }
        } else {
            str = null;
        }
        if (c21038 != null) {
            if (str == null) {
                str = c21038.f66009;
            }
            int size = arrayList.size();
            for (C20366 c20367 : c21038.f66010) {
                if (c20367.f62960 != null) {
                    UUID uuid = c20367.f62957;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            arrayList.add(c20367);
                            break;
                        }
                        if (((C20366) arrayList.get(i)).f62957.equals(uuid)) {
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
        return new C21037(str, false, (C20366[]) arrayList.toArray(new C20366[0]));
    }

    public C21037(ArrayList arrayList) {
        this(null, false, (C20366[]) arrayList.toArray(new C20366[0]));
    }

    public C21037(String str, C20366... c20366Arr) {
        this(str, true, c20366Arr);
    }

    public C21037(C20366... c20366Arr) {
        this(null, true, c20366Arr);
    }

    public C21037(String str, boolean z, C20366... c20366Arr) {
        this.f66009 = str;
        c20366Arr = z ? (C20366[]) c20366Arr.clone() : c20366Arr;
        this.f66010 = c20366Arr;
        this.f66012 = c20366Arr.length;
        Arrays.sort(c20366Arr, this);
    }

    public C21037(Parcel parcel) {
        this.f66009 = parcel.readString();
        C20366[] c20366Arr = (C20366[]) parcel.createTypedArray(C20366.CREATOR);
        String str = C5792.f14228;
        this.f66010 = c20366Arr;
        this.f66012 = c20366Arr.length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20366 m47449(int i) {
        return this.f66010[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21037 m47450(String str) {
        return C12826.equals(this.f66009, str) ? this : new C21037(str, false, this.f66010);
    }

    public final int hashCode() {
        if (this.f66011 == 0) {
            String str = this.f66009;
            this.f66011 = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f66010);
        }
        return this.f66011;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C21037.class == obj.getClass()) {
            C21037 c21037 = (C21037) obj;
            if (C12826.equals(this.f66009, c21037.f66009) && Arrays.equals(this.f66010, c21037.f66010)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f66009);
        parcel.writeTypedArray(this.f66010, 0);
    }
}
