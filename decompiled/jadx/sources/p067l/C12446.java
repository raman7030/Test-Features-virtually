package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.ۤ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 122L */
/* JADX INFO: loaded from: classes4.dex */
public final class C12446 extends AbstractC14457 {

    /* JADX INFO: renamed from: ۜ */
    public final int f34787;

    /* JADX INFO: renamed from: ۡ */
    public final String f34788;

    /* JADX INFO: renamed from: ۢ */
    public final SparseIntArray f34789;

    /* JADX INFO: renamed from: ܳ */
    public int f34790;

    /* JADX INFO: renamed from: ܿ */
    public final int f34791;

    /* JADX INFO: renamed from: ᩳ */
    public int f34792;

    /* JADX INFO: renamed from: ᩷ */
    public final Parcel f34793;

    /* JADX INFO: renamed from: ᩻ */
    public int f34794;

    public C12446(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0977(), new C0977(), new C0977());
    }

    public C12446(Parcel parcel, int i, int i2, String str, C0977 c0977, C0977 c0978, C0977 c0979) {
        super(c0977, c0978, c0979);
        this.f34789 = new SparseIntArray();
        this.f34792 = -1;
        this.f34790 = -1;
        this.f34793 = parcel;
        this.f34787 = i;
        this.f34791 = i2;
        this.f34794 = i;
        this.f34788 = str;
    }

    @Override // p067l.AbstractC14457
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo28652(int i) {
        while (this.f34794 < this.f34791) {
            int i2 = this.f34790;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f34794;
            Parcel parcel = this.f34793;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.f34790 = parcel.readInt();
            this.f34794 += i4;
        }
        return this.f34790 == i;
    }

    @Override // p067l.AbstractC14457
    /* JADX INFO: renamed from: ۧ */
    public final void mo28655(int i) {
        mo28647();
        this.f34792 = i;
        this.f34789.put(i, this.f34793.dataPosition());
        mo28658(0);
        mo28658(i);
    }

    @Override // p067l.AbstractC14457
    /* JADX INFO: renamed from: ֫ */
    public final void mo28647() {
        int i = this.f34792;
        if (i >= 0) {
            int i2 = this.f34789.get(i);
            Parcel parcel = this.f34793;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(iDataPosition - i2);
            parcel.setDataPosition(iDataPosition);
        }
    }

    @Override // p067l.AbstractC14457
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC14457 mo28654() {
        Parcel parcel = this.f34793;
        int iDataPosition = parcel.dataPosition();
        int i = this.f34794;
        if (i == this.f34787) {
            i = this.f34791;
        }
        return new C12446(parcel, iDataPosition, i, C10965.m25286(new StringBuilder(), this.f34788, EnumC2483.f3919), this.f41299, this.f41300, this.f41298);
    }

    @Override // p067l.AbstractC14457
    /* JADX INFO: renamed from: ۧ */
    public final void mo28656(byte[] bArr) {
        Parcel parcel = this.f34793;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        } else {
            parcel.writeInt(-1);
        }
    }

    @Override // p067l.AbstractC14457
    /* JADX INFO: renamed from: ܽ */
    public final void mo28658(int i) {
        this.f34793.writeInt(i);
    }

    @Override // p067l.AbstractC14457
    /* JADX INFO: renamed from: ֫ */
    public final void mo28650(String str) {
        this.f34793.writeString(str);
    }

    @Override // p067l.AbstractC14457
    /* JADX INFO: renamed from: ֫ */
    public final void mo28648(Parcelable parcelable) {
        this.f34793.writeParcelable(parcelable, 0);
    }

    @Override // p067l.AbstractC14457
    /* JADX INFO: renamed from: ֫ */
    public final void mo28651(boolean z) {
        this.f34793.writeInt(z ? 1 : 0);
    }

    @Override // p067l.AbstractC14457
    /* JADX INFO: renamed from: ֫ */
    public final void mo28649(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f34793, 0);
    }

    @Override // p067l.AbstractC14457
    /* JADX INFO: renamed from: ܿ */
    public final CharSequence mo28660() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f34793);
    }

    @Override // p067l.AbstractC14457
    /* JADX INFO: renamed from: ܳ */
    public final int mo28657() {
        return this.f34793.readInt();
    }

    @Override // p067l.AbstractC14457
    /* JADX INFO: renamed from: ۜ */
    public final String mo28653() {
        return this.f34793.readString();
    }

    @Override // p067l.AbstractC14457
    /* JADX INFO: renamed from: ᩳ */
    public final byte[] mo28661() {
        Parcel parcel = this.f34793;
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // p067l.AbstractC14457
    /* JADX INFO: renamed from: ᩻ */
    public final Parcelable mo28662() {
        return this.f34793.readParcelable(C12446.class.getClassLoader());
    }

    @Override // p067l.AbstractC14457
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo28659() {
        return this.f34793.readInt() != 0;
    }
}
