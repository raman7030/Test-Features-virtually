package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.ۤ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 122L */
/* JADX INFO: loaded from: classes4.dex */
public final class C10603 extends AbstractC12719 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f31816;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f31817;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final SparseIntArray f31818;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f31819;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f31820;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f31821;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Parcel f31822;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f31823;

    public C10603(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C2727(), new C2727(), new C2727());
    }

    public C10603(Parcel parcel, int i, int i2, String str, C2727 c2727, C2727 c2728, C2727 c2729) {
        super(c2727, c2728, c2729);
        this.f31818 = new SparseIntArray();
        this.f31821 = -1;
        this.f31819 = -1;
        this.f31822 = parcel;
        this.f31816 = i;
        this.f31820 = i2;
        this.f31823 = i;
        this.f31817 = str;
    }

    @Override // l.AbstractC12719
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo26613(int i) {
        while (this.f31823 < this.f31820) {
            int i2 = this.f31819;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f31823;
            Parcel parcel = this.f31822;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.f31819 = parcel.readInt();
            this.f31823 += i4;
        }
        return this.f31819 == i;
    }

    @Override // l.AbstractC12719
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo26616(int i) {
        mo26608();
        this.f31821 = i;
        this.f31818.put(i, this.f31822.dataPosition());
        mo26619(0);
        mo26619(i);
    }

    @Override // l.AbstractC12719
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26608() {
        int i = this.f31821;
        if (i >= 0) {
            int i2 = this.f31818.get(i);
            Parcel parcel = this.f31822;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i2);
            parcel.writeInt(iDataPosition - i2);
            parcel.setDataPosition(iDataPosition);
        }
    }

    @Override // l.AbstractC12719
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC12719 mo26615() {
        Parcel parcel = this.f31822;
        int iDataPosition = parcel.dataPosition();
        int i = this.f31823;
        if (i == this.f31816) {
            i = this.f31820;
        }
        return new C10603(parcel, iDataPosition, i, C9045.m23341(new StringBuilder(), this.f31817, EnumC0121.f1143), this.f38270, this.f38271, this.f38269);
    }

    @Override // l.AbstractC12719
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo26617(byte[] bArr) {
        Parcel parcel = this.f31822;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        } else {
            parcel.writeInt(-1);
        }
    }

    @Override // l.AbstractC12719
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo26619(int i) {
        this.f31822.writeInt(i);
    }

    @Override // l.AbstractC12719
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26611(String str) {
        this.f31822.writeString(str);
    }

    @Override // l.AbstractC12719
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26609(Parcelable parcelable) {
        this.f31822.writeParcelable(parcelable, 0);
    }

    @Override // l.AbstractC12719
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26612(boolean z) {
        this.f31822.writeInt(z ? 1 : 0);
    }

    @Override // l.AbstractC12719
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26610(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f31822, 0);
    }

    @Override // l.AbstractC12719
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CharSequence mo26621() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f31822);
    }

    @Override // l.AbstractC12719
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int mo26618() {
        return this.f31822.readInt();
    }

    @Override // l.AbstractC12719
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String mo26614() {
        return this.f31822.readString();
    }

    @Override // l.AbstractC12719
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] mo26622() {
        Parcel parcel = this.f31822;
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // l.AbstractC12719
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Parcelable mo26623() {
        return this.f31822.readParcelable(C10603.class.getClassLoader());
    }

    @Override // l.AbstractC12719
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo26620() {
        return this.f31822.readInt() != 0;
    }
}
