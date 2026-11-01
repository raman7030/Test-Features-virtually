package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.ۜ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9009 extends AbstractC25102 {

    /* JADX INFO: renamed from: ֡ */
    public C5656 f24414;

    /* JADX INFO: renamed from: ֨ */
    public C9739 f24415;

    /* JADX INFO: renamed from: ۖ */
    public int f24416;

    /* JADX INFO: renamed from: ۗ */
    public int f24417;

    /* JADX INFO: renamed from: ۘ */
    public int[] f24418;

    /* JADX INFO: renamed from: ۙ */
    public int f24419;

    /* JADX INFO: renamed from: ۚ */
    public C9739 f24420;

    /* JADX INFO: renamed from: ۛ */
    public int f24421;

    /* JADX INFO: renamed from: ۜ */
    public C18396 f24422;

    /* JADX INFO: renamed from: ۟ */
    public int f24423;

    /* JADX INFO: renamed from: ۠ */
    public C9739 f24424;

    /* JADX INFO: renamed from: ۡ */
    public C5656 f24425;

    /* JADX INFO: renamed from: ۢ */
    public C23091 f24426;

    /* JADX INFO: renamed from: ۤ */
    public int f24427;

    /* JADX INFO: renamed from: ۨ */
    public int f24428;

    /* JADX INFO: renamed from: ۫ */
    public C19738 f24429;

    /* JADX INFO: renamed from: ۬ */
    public int f24430;

    /* JADX INFO: renamed from: ܰ */
    public int f24431;

    /* JADX INFO: renamed from: ܳ */
    public int f24432;

    /* JADX INFO: renamed from: ܶ */
    public C9739 f24433;

    /* JADX INFO: renamed from: ܺ */
    public C19738 f24434;

    /* JADX INFO: renamed from: ܽ */
    public int f24435;

    /* JADX INFO: renamed from: ܿ */
    public C19738 f24436;

    /* JADX INFO: renamed from: ᩳ */
    public int f24437;

    /* JADX INFO: renamed from: ᩴ */
    public C20409 f24438;

    /* JADX INFO: renamed from: ᩵ */
    public C23091 f24439;

    /* JADX INFO: renamed from: ᩶ */
    public C19738 f24440;

    /* JADX INFO: renamed from: ᩷ */
    public C20409 f24441;

    /* JADX INFO: renamed from: ᩸ */
    public C21750 f24442;

    /* JADX INFO: renamed from: ᩹ */
    public int f24443;

    /* JADX INFO: renamed from: ᩺ */
    public final C8338 f24444;

    /* JADX INFO: renamed from: ᩻ */
    public int f24445;

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final void mo20836() {
    }

    public C9009(int i) {
        super(null);
        this.f24444 = new C8338(this);
        if ((i & 2) != 0) {
            this.f24437 = 4;
        } else if ((i & 1) != 0) {
            this.f24437 = 1;
        } else {
            this.f24437 = 0;
        }
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final void mo20837(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.f24423 = i;
        this.f24435 = i2;
        int i3 = i & 65535;
        C8338 c8338 = this.f24444;
        this.f24431 = c8338.m19254(i3, str);
        if (str2 != null) {
            this.f24427 = c8338.m19265(str2);
        }
        this.f24428 = str3 == null ? 0 : c8338.m19248(str3).f42967;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f24416 = length;
            this.f24418 = new int[length];
            for (int i4 = 0; i4 < this.f24416; i4++) {
                this.f24418[i4] = c8338.m19248(strArr[i4]).f42967;
            }
        }
        if (this.f24437 != 1 || i3 < 51) {
            return;
        }
        this.f24437 = 2;
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final void mo20840(String str, String str2) {
        if (str != null) {
            this.f24421 = this.f24444.m19265(str);
        }
        if (str2 != null) {
            C19738 c19738 = new C19738();
            c19738.m44871(0, Integer.MAX_VALUE, str2);
            this.f24436 = c19738;
        }
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC23761 mo20835(int i, String str, String str2) {
        C8338 c8338 = this.f24444;
        C21750 c21750 = new C21750(c8338, c8338.m19257(str).f42967, i, str2 == null ? 0 : c8338.m19265(str2));
        this.f24442 = c21750;
        return c21750;
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final void mo20838(String str) {
        this.f24443 = this.f24444.m19248(str).f42967;
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final void mo20841(String str, String str2, String str3) {
        C8338 c8338 = this.f24444;
        this.f24432 = c8338.m19248(str).f42967;
        if (str2 == null || str3 == null) {
            return;
        }
        this.f24445 = c8338.m19240(str2, str3);
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo20833(String str, boolean z) {
        C8338 c8338 = this.f24444;
        if (z) {
            C9739 c9739M22766 = C9739.m22766(c8338, str, this.f24424);
            this.f24424 = c9739M22766;
            return c9739M22766;
        }
        C9739 c9739M22767 = C9739.m22766(c8338, str, this.f24420);
        this.f24420 = c9739M22767;
        return c9739M22767;
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo20832(int i, C24431 c24431, String str, boolean z) {
        C8338 c8338 = this.f24444;
        if (z) {
            C9739 c9739M22765 = C9739.m22765(c8338, i, c24431, str, this.f24433);
            this.f24433 = c9739M22765;
            return c9739M22765;
        }
        C9739 c9739M22766 = C9739.m22765(c8338, i, c24431, str, this.f24415);
        this.f24415 = c9739M22766;
        return c9739M22766;
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final void mo20842(C18396 c18396) {
        c18396.f54924 = this.f24422;
        this.f24422 = c18396;
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ۧ */
    public final void mo20844(String str) {
        if (this.f24440 == null) {
            this.f24440 = new C19738();
        }
        this.f24417++;
        this.f24440.m44877(this.f24444.m19248(str).f42967);
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ܽ */
    public final void mo20846(String str) {
        if (this.f24429 == null) {
            this.f24429 = new C19738();
        }
        this.f24430++;
        this.f24429.m44877(this.f24444.m19248(str).f42967);
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final void mo20839(String str, int i, String str2, String str3) {
        if (this.f24434 == null) {
            this.f24434 = new C19738();
        }
        C8338 c8338 = this.f24444;
        C14373 c14373M19248 = c8338.m19248(str);
        if (c14373M19248.f42969 == 0) {
            this.f24419++;
            this.f24434.m44877(c14373M19248.f42967);
            this.f24434.m44877(str2 == null ? 0 : c8338.m19248(str2).f42967);
            this.f24434.m44877(str3 != null ? c8338.m19265(str3) : 0);
            this.f24434.m44877(i);
            c14373M19248.f42969 = this.f24419;
        }
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6997 mo20843(String str, String str2, String str3) {
        C5656 c5656 = new C5656(this.f24444, str, str2, str3);
        if (this.f24425 == null) {
            this.f24425 = c5656;
        } else {
            this.f24414.f18223 = c5656;
        }
        this.f24414 = c5656;
        return c5656;
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6327 mo20831(int i, String str, String str2, String str3, Object obj) {
        C20409 c20409 = new C20409(this.f24444, i, str, str2, str3, obj);
        if (this.f24441 == null) {
            this.f24441 = c20409;
        } else {
            this.f24438.f16399 = c20409;
        }
        this.f24438 = c20409;
        return c20409;
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17054 mo20834(int i, String str, String str2, String str3, String[] strArr) {
        C23091 c23091 = new C23091(this.f24444, i, str, str2, str3, strArr, this.f24437);
        if (this.f24426 == null) {
            this.f24426 = c23091;
        } else {
            this.f24439.f50440 = c23091;
        }
        this.f24439 = c23091;
        return c23091;
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte[] m20845() {
        int iM49027;
        int iM12607;
        int i;
        int i2;
        int i3;
        int i4;
        int iM41872 = (this.f24416 * 2) + 24;
        int i5 = 0;
        for (C20409 c20409 = this.f24441; c20409 != null; c20409 = (C20409) c20409.f16399) {
            i5++;
            iM41872 += c20409.m46084();
        }
        int i6 = 0;
        for (C23091 c23091 = this.f24426; c23091 != null; c23091 = (C23091) c23091.f50440) {
            i6++;
            iM41872 += c23091.m51501();
        }
        C19738 c19738 = this.f24434;
        C8338 c8338 = this.f24444;
        if (c19738 != null) {
            iM41872 += c19738.f60036 + 8;
            c8338.m19265("InnerClasses");
            iM49027 = 1;
        } else {
            iM49027 = 0;
        }
        if (this.f24432 != 0) {
            iM49027++;
            iM41872 += 10;
            c8338.m19265("EnclosingMethod");
        }
        if ((this.f24435 & 4096) != 0 && (this.f24423 & 65535) < 49) {
            iM49027++;
            iM41872 += 6;
            c8338.m19265("Synthetic");
        }
        if (this.f24427 != 0) {
            iM49027++;
            iM41872 += 8;
            c8338.m19265("Signature");
        }
        if (this.f24421 != 0) {
            iM49027++;
            iM41872 += 8;
            c8338.m19265("SourceFile");
        }
        C19738 c19739 = this.f24436;
        if (c19739 != null) {
            iM49027++;
            iM41872 += c19739.f60036 + 6;
            c8338.m19265("SourceDebugExtension");
        }
        if ((this.f24435 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            iM49027++;
            iM41872 += 6;
            c8338.m19265("Deprecated");
        }
        C9739 c9739 = this.f24424;
        if (c9739 != null) {
            iM49027++;
            iM41872 += c9739.m22775("RuntimeVisibleAnnotations");
        }
        C9739 c97310 = this.f24420;
        if (c97310 != null) {
            iM49027++;
            iM41872 += c97310.m22775("RuntimeInvisibleAnnotations");
        }
        C9739 c97311 = this.f24433;
        if (c97311 != null) {
            iM49027++;
            iM41872 += c97311.m22775("RuntimeVisibleTypeAnnotations");
        }
        C9739 c97312 = this.f24415;
        if (c97312 != null) {
            iM49027++;
            iM41872 += c97312.m22775("RuntimeInvisibleTypeAnnotations");
        }
        if (c8338.m19237() > 0) {
            iM49027++;
            iM41872 += c8338.m19237();
        }
        C21750 c21750 = this.f24442;
        if (c21750 != null) {
            iM49027 += c21750.m49027();
            iM41872 += this.f24442.m49026();
        }
        if (this.f24443 != 0) {
            iM49027++;
            iM41872 += 8;
            c8338.m19265("NestHost");
        }
        C19738 c197310 = this.f24440;
        if (c197310 != null) {
            iM49027++;
            iM41872 += c197310.f60036 + 8;
            c8338.m19265("NestMembers");
        }
        C19738 c197311 = this.f24429;
        if (c197311 != null) {
            iM49027++;
            iM41872 += c197311.f60036 + 8;
            c8338.m19265("PermittedSubclasses");
        }
        if ((this.f24435 & 65536) == 0 && this.f24425 == null) {
            iM12607 = 0;
            i = 0;
        } else {
            iM12607 = 0;
            int i7 = 0;
            for (C5656 c5656 = this.f24425; c5656 != null; c5656 = (C5656) c5656.f18223) {
                i7++;
                iM12607 += c5656.m12607();
            }
            iM49027++;
            iM41872 += iM12607 + 8;
            c8338.m19265("Record");
            i = i7;
        }
        C18396 c18396 = this.f24422;
        if (c18396 != null) {
            int i8 = 0;
            while (c18396 != null) {
                i8++;
                c18396 = c18396.f54924;
            }
            iM49027 += i8;
            iM41872 += this.f24422.m41872(c8338);
        }
        int iM19264 = iM41872 + c8338.m19264();
        if (c8338.m19259() > 65535) {
            throw new C16384(C21466.m48631("Class too large: ", c8338.m19255()));
        }
        C19738 c197312 = new C19738();
        c197312.f60035 = new byte[iM19264];
        c197312.m44875(-889275714);
        c197312.m44875(this.f24423);
        c8338.m19258(c197312);
        c197312.m44877((~((this.f24423 & 65535) < 49 ? 4096 : 0)) & this.f24435);
        c197312.m44877(this.f24431);
        c197312.m44877(this.f24428);
        c197312.m44877(this.f24416);
        for (int i9 = 0; i9 < this.f24416; i9++) {
            c197312.m44877(this.f24418[i9]);
        }
        c197312.m44877(i5);
        for (C20409 c204010 = this.f24441; c204010 != null; c204010 = (C20409) c204010.f16399) {
            c204010.m46083(c197312);
        }
        c197312.m44877(i6);
        boolean zM51498 = false;
        boolean zM51500 = false;
        for (C23091 c23092 = this.f24426; c23092 != null; c23092 = (C23091) c23092.f50440) {
            zM51498 |= c23092.m51498();
            zM51500 |= c23092.m51500();
            c23092.m51496(c197312);
        }
        c197312.m44877(iM49027);
        if (this.f24434 != null) {
            c197312.m44877(c8338.m19265("InnerClasses"));
            c197312.m44875(this.f24434.f60036 + 2);
            c197312.m44877(this.f24419);
            C19738 c197313 = this.f24434;
            c197312.m44872(0, c197313.f60036, c197313.f60035);
        }
        if (this.f24432 != 0) {
            c197312.m44877(c8338.m19265("EnclosingMethod"));
            c197312.m44875(4);
            c197312.m44877(this.f24432);
            c197312.m44877(this.f24445);
        }
        if ((this.f24435 & 4096) != 0 && (this.f24423 & 65535) < 49) {
            c197312.m44877(c8338.m19265("Synthetic"));
            c197312.m44875(0);
        }
        if (this.f24427 != 0) {
            c197312.m44877(c8338.m19265("Signature"));
            i2 = 2;
            c197312.m44875(2);
            c197312.m44877(this.f24427);
        } else {
            i2 = 2;
        }
        if (this.f24421 != 0) {
            c197312.m44877(c8338.m19265("SourceFile"));
            c197312.m44875(i2);
            c197312.m44877(this.f24421);
        }
        C19738 c197314 = this.f24436;
        if (c197314 != null) {
            int i10 = c197314.f60036;
            c197312.m44877(c8338.m19265("SourceDebugExtension"));
            c197312.m44875(i10);
            i3 = 0;
            c197312.m44872(0, i10, this.f24436.f60035);
        } else {
            i3 = 0;
        }
        if ((this.f24435 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            c197312.m44877(c8338.m19265("Deprecated"));
            c197312.m44875(i3);
        }
        C9739.m22768(this.f24444, this.f24424, this.f24420, this.f24433, this.f24415, c197312);
        c8338.m19253(c197312);
        C21750 c21751 = this.f24442;
        if (c21751 != null) {
            c21751.m49025(c197312);
        }
        if (this.f24443 != 0) {
            c197312.m44877(c8338.m19265("NestHost"));
            i4 = 2;
            c197312.m44875(2);
            c197312.m44877(this.f24443);
        } else {
            i4 = 2;
        }
        if (this.f24440 != null) {
            c197312.m44877(c8338.m19265("NestMembers"));
            c197312.m44875(this.f24440.f60036 + i4);
            c197312.m44877(this.f24417);
            C19738 c197315 = this.f24440;
            c197312.m44872(0, c197315.f60036, c197315.f60035);
        }
        if (this.f24429 != null) {
            c197312.m44877(c8338.m19265("PermittedSubclasses"));
            c197312.m44875(this.f24429.f60036 + 2);
            c197312.m44877(this.f24430);
            C19738 c197316 = this.f24429;
            c197312.m44872(0, c197316.f60036, c197316.f60035);
        }
        if ((this.f24435 & 65536) != 0 || this.f24425 != null) {
            c197312.m44877(c8338.m19265("Record"));
            c197312.m44875(iM12607 + 2);
            c197312.m44877(i);
            for (C5656 c5657 = this.f24425; c5657 != null; c5657 = (C5656) c5657.f18223) {
                c5657.m12606(c197312);
            }
        }
        C18396 c18397 = this.f24422;
        if (c18397 != null) {
            c18397.m41875(c8338, c197312);
        }
        if (!zM51500) {
            return c197312.f60035;
        }
        byte[] bArr = c197312.f60035;
        C13033 c13033 = new C13033();
        c13033.m29848(this.f24422);
        for (C20409 c204011 = this.f24441; c204011 != null; c204011 = (C20409) c204011.f16399) {
            c204011.m46082(c13033);
        }
        for (C23091 c23093 = this.f24426; c23093 != null; c23093 = (C23091) c23093.f50440) {
            c23093.m51495(c13033);
        }
        for (C5656 c5658 = this.f24425; c5658 != null; c5658 = (C5656) c5658.f18223) {
            c5658.m12604(c13033);
        }
        C18396[] c18396ArrM29849 = c13033.m29849();
        this.f24441 = null;
        this.f24438 = null;
        this.f24426 = null;
        this.f24439 = null;
        this.f24424 = null;
        this.f24420 = null;
        this.f24433 = null;
        this.f24415 = null;
        this.f24442 = null;
        this.f24443 = 0;
        this.f24417 = 0;
        this.f24440 = null;
        this.f24430 = 0;
        this.f24429 = null;
        this.f24425 = null;
        this.f24414 = null;
        this.f24422 = null;
        this.f24437 = zM51498 ? 3 : 0;
        new C19067(bArr, false).m43318(this, c18396ArrM29849, (zM51498 ? 8 : 0) | 256);
        return m20845();
    }
}
