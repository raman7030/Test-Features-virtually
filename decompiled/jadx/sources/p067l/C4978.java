package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۖ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09ZV */
/* JADX INFO: loaded from: classes3.dex */
public final class C4978 extends AbstractC15015 implements InterfaceC6969 {

    /* JADX INFO: renamed from: ۖ֫ */
    public InterfaceC23458 f11339;

    /* JADX INFO: renamed from: ۘ֫ */
    public int f11340;

    /* JADX INFO: renamed from: ۡ֫ */
    public byte[] f11341;

    /* JADX INFO: renamed from: ۢ֫ */
    public final int f11342;

    /* JADX INFO: renamed from: ܺ֫ */
    public int f11343;

    /* JADX INFO: renamed from: ᩴ֫ */
    public final byte[] f11344;

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) {
        return 0;
    }

    public C4978(InterfaceC3341 interfaceC3341, int i) {
        this(i, interfaceC3341, C12334.f34417);
    }

    public C4978(int i, InterfaceC3341 interfaceC3341, byte[] bArr) {
        super(interfaceC3341, 11);
        this.f11342 = i;
        this.f11341 = bArr;
        this.f11340 = ((C15410) interfaceC3341).m35117() & (-8);
        this.f11344 = null;
    }

    @Override // p067l.InterfaceC6969
    /* JADX INFO: renamed from: ֫ */
    public final void mo10536(byte[] bArr) {
        this.f11341 = bArr;
    }

    public C4978(InterfaceC3341 interfaceC3341, byte[] bArr, byte[] bArr2) {
        super(interfaceC3341, 11);
        this.f11342 = 1163287;
        this.f11341 = bArr;
        this.f11344 = bArr2;
        this.f11340 = bArr2.length;
    }

    @Override // p067l.AbstractC15015
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC14345 mo8764(InterfaceC20106 interfaceC20106) {
        return new C6319(this.f11342, interfaceC20106.mo29602(), this.f11344);
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public final void m10537() {
        this.f11343 = 1;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m10538(int i) {
        this.f11340 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10535(InterfaceC23458 interfaceC23458) {
        this.f11339 = interfaceC23458;
    }

    @Override // p067l.InterfaceC9571
    public final int size() {
        InterfaceC23458 interfaceC23458 = this.f11339;
        return AbstractC5628.m12467((interfaceC23458 != null ? interfaceC23458.size() : 0) + UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        C3775.m7364(57L, i, bArr);
        C3775.m7366(this.f11342, i + 4, bArr);
        System.arraycopy(this.f11341, 0, bArr, i + 8, 16);
        int i2 = i + 24;
        int i3 = i + 28;
        C3775.m7366(0, i + 32, bArr);
        int i4 = i + 36;
        int i5 = i + 40;
        C3775.m7366(this.f11340, i + 44, bArr);
        C3775.m7366(this.f11343, i + 48, bArr);
        int i6 = i + 56;
        if (this.f11339 != null) {
            C3775.m7366(i6 - m12492(), i2, bArr);
            int iMo11078 = this.f11339.mo11078(i6, bArr);
            C3775.m7366(iMo11078, i3, bArr);
            i6 += iMo11078;
        } else {
            C3775.m7366(0L, i2, bArr);
            C3775.m7366(0L, i3, bArr);
        }
        C3775.m7366(0L, i4, bArr);
        C3775.m7366(0L, i5, bArr);
        return i6 - i;
    }
}
