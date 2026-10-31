package l;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: l.֫ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85A3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1662 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C16892 f5809;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C4484 f5810;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4484 f5811;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C10129 f5812;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AbstractC5895[] f5813;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C4484 f5814;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f5815;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C8012 f5816;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C4484 f5817;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21915 f5818;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f5819;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C21418 f5820;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4484 f5821;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9733 f5822;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13447 f5823;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C4484 f5824;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C2076 f5825;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9424 f5826;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C6601 f5827;

    public C1662(C9733 c9733) {
        this.f5822 = c9733;
        C9424 c9424 = new C9424(this);
        this.f5826 = c9424;
        EnumC20007 enumC20007 = EnumC20007.NONE;
        C4484 c4484 = new C4484(null, this, 4, enumC20007);
        this.f5814 = c4484;
        EnumC20007 enumC20008 = EnumC20007.TYPE;
        C4484 c4485 = new C4484("word_data", this, 4, enumC20008);
        this.f5810 = c4485;
        C4484 c4486 = new C4484("string_data", this, 1, EnumC20007.INSTANCE);
        this.f5824 = c4486;
        C4484 c4487 = new C4484(null, this, 1, enumC20007);
        this.f5821 = c4487;
        C4484 c4488 = new C4484("byte_data", this, 1, enumC20008);
        this.f5811 = c4488;
        C2076 c2076 = new C2076(this);
        this.f5825 = c2076;
        C16892 c16892 = new C16892(this);
        this.f5809 = c16892;
        C10129 c10129 = new C10129(this);
        this.f5812 = c10129;
        C6601 c6601 = new C6601(this);
        this.f5827 = c6601;
        C21418 c21418 = new C21418(this);
        this.f5820 = c21418;
        C13447 c13447 = new C13447(this);
        this.f5823 = c13447;
        C4484 c4489 = new C4484("map", this, 4, enumC20007);
        this.f5817 = c4489;
        if (c9733.m24724(26)) {
            C21915 c21915 = new C21915(this);
            this.f5818 = c21915;
            C8012 c8012 = new C8012(this);
            this.f5816 = c8012;
            this.f5813 = new AbstractC5895[]{c9424, c2076, c16892, c10129, c6601, c21418, c13447, c21915, c8012, c4485, c4484, c4486, c4488, c4487, c4489};
        } else {
            this.f5818 = null;
            this.f5816 = null;
            this.f5813 = new AbstractC5895[]{c9424, c2076, c16892, c10129, c6601, c21418, c13447, c4485, c4484, c4486, c4488, c4487, c4489};
        }
        this.f5815 = -1;
        this.f5819 = 79;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9733 m5629() {
        return this.f5822;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5617(C3570 c3570) {
        this.f5823.m32476(c3570);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18241 m5616(C7803 c7803) {
        return m5611(false, c7803);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final byte[] m5613() {
        return m5611(false, null).m42515();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m5634() {
        int i = this.f5815;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("file size not yet known");
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C4484 m5619() {
        return this.f5824;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C4484 m5620() {
        return this.f5810;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C4484 m5612() {
        return this.f5814;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C4484 m5623() {
        return this.f5817;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C2076 m5631() {
        return this.f5825;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13447 m5630() {
        return this.f5823;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4484 m5628() {
        return this.f5821;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C16892 m5632() {
        return this.f5809;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C10129 m5618() {
        return this.f5812;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C6601 m5626() {
        return this.f5827;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C21418 m5627() {
        return this.f5820;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C8012 m5622() {
        return this.f5816;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21915 m5624() {
        return this.f5818;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4484 m5614() {
        return this.f5811;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C4484 m5621() {
        return this.f5810;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4484 m5633() {
        return this.f5817;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5625(AbstractC13717 abstractC13717) {
        if (abstractC13717 == null) {
            throw new NullPointerException("cst == null");
        }
        if (abstractC13717 instanceof C13217) {
            this.f5825.m6832((C13217) abstractC13717);
            return;
        }
        if (abstractC13717 instanceof C12512) {
            this.f5809.m39750((C12512) abstractC13717);
            return;
        }
        if (abstractC13717 instanceof AbstractC16745) {
            this.f5820.m48540((AbstractC16745) abstractC13717);
            return;
        }
        boolean z = abstractC13717 instanceof C8985;
        C6601 c6601 = this.f5827;
        if (z) {
            c6601.m18104((C8985) abstractC13717);
            return;
        }
        if (abstractC13717 instanceof C9691) {
            c6601.m18104(((C9691) abstractC13717).m24635());
            return;
        }
        if (abstractC13717 instanceof C4751) {
            this.f5812.m25412(((C4751) abstractC13717).m13898());
        } else if (abstractC13717 instanceof C21685) {
            this.f5816.m21325((C21685) abstractC13717);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15772 m5615(AbstractC13717 abstractC13717) {
        if (abstractC13717 instanceof C13217) {
            return this.f5825.m6831(abstractC13717);
        }
        if (abstractC13717 instanceof C12512) {
            return this.f5809.m39749(abstractC13717);
        }
        if (abstractC13717 instanceof AbstractC16745) {
            return this.f5820.m48539(abstractC13717);
        }
        boolean z = abstractC13717 instanceof C8985;
        C6601 c6601 = this.f5827;
        if (z) {
            return c6601.m18103(abstractC13717);
        }
        if (abstractC13717 instanceof C9691) {
            return c6601.m18104(((C9691) abstractC13717).m24635());
        }
        if (abstractC13717 instanceof C4751) {
            return this.f5812.m25411(abstractC13717);
        }
        if (abstractC13717 instanceof C21685) {
            return this.f5816.m21324(abstractC13717);
        }
        if (abstractC13717 instanceof C23801) {
            return this.f5818.m49323(abstractC13717);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C18241 m5611(boolean z, C7803 c7803) {
        byte[] bArr;
        this.f5823.m16523();
        this.f5821.m16523();
        C4484 c4484 = this.f5810;
        c4484.m16523();
        C9733 c9733 = this.f5822;
        boolean zM24724 = c9733.m24724(26);
        C21915 c21915 = this.f5818;
        if (zM24724) {
            c21915.m16523();
        }
        this.f5811.m16523();
        boolean zM24725 = c9733.m24724(26);
        C8012 c8012 = this.f5816;
        if (zM24725) {
            c8012.m16523();
        }
        this.f5820.m16523();
        this.f5827.m16523();
        this.f5812.m16523();
        this.f5814.m16523();
        this.f5809.m16523();
        this.f5825.m16523();
        this.f5824.m16523();
        this.f5826.m16523();
        AbstractC5895[] abstractC5895Arr = this.f5813;
        int length = abstractC5895Arr.length;
        int iMo13226 = 0;
        for (int i = 0; i < length; i++) {
            AbstractC5895 abstractC5895 = abstractC5895Arr[i];
            if ((abstractC5895 != c21915 && abstractC5895 != c8012) || !abstractC5895.mo6834().isEmpty()) {
                int iM16520 = abstractC5895.m16520(iMo13226);
                if (iM16520 < iMo13226) {
                    throw new RuntimeException(C19370.m44628(i, "bogus placement for section "));
                }
                C4484 c4485 = this.f5817;
                if (abstractC5895 == c4485) {
                    try {
                        C18596.m43133(abstractC5895Arr, c4485);
                        c4485.m16523();
                    } catch (RuntimeException e) {
                        throw C8136.m21601("...while writing section " + i, e);
                    }
                }
                if (abstractC5895 instanceof C4484) {
                    ((C4484) abstractC5895).m13222();
                }
                iMo13226 = abstractC5895.mo13226() + iM16520;
            }
        }
        this.f5815 = iMo13226;
        if (c7803 == null) {
            bArr = new byte[iMo13226];
        } else {
            if (c7803.f24111.length < iMo13226) {
                Logger.getAnonymousLogger().log(Level.FINER, "DexFile storage too small  " + c7803.f24111.length + " vs " + iMo13226);
                c7803.f24111 = new byte[iMo13226];
            }
            bArr = c7803.f24111;
        }
        C18241 c18241 = new C18241(bArr);
        if (z) {
            c18241.m42513(this.f5819);
        }
        for (int i2 = 0; i2 < length; i2++) {
            try {
                AbstractC5895 abstractC5896 = abstractC5895Arr[i2];
                if ((abstractC5896 != c21915 && abstractC5896 != c8012) || !abstractC5896.mo6834().isEmpty()) {
                    int iM16522 = abstractC5896.m16522() - c18241.m42510();
                    if (iM16522 < 0) {
                        throw new C8136("excess write of " + (-iM16522), null);
                    }
                    c18241.m42518(iM16522);
                    abstractC5896.m16518(c18241);
                }
            } catch (RuntimeException e2) {
                C8136 c8136 = e2 instanceof C8136 ? (C8136) e2 : new C8136(null, e2);
                c8136.m21602("...while writing section " + i2);
                throw c8136;
            }
        }
        if (c18241.m42510() != this.f5815) {
            throw new RuntimeException("foreshortened write");
        }
        int iM42510 = c18241.m42510();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, 32, iM42510 - 32);
            try {
                int iDigest = messageDigest.digest(bArr, 12, 20);
                if (iDigest != 20) {
                    throw new RuntimeException("unexpected digest write: " + iDigest + " bytes");
                }
                int iM42511 = c18241.m42510();
                Adler32 adler32 = new Adler32();
                adler32.update(bArr, 12, iM42511 - 12);
                int value = (int) adler32.getValue();
                bArr[8] = (byte) value;
                bArr[9] = (byte) (value >> 8);
                bArr[10] = (byte) (value >> 16);
                bArr[11] = (byte) (value >> 24);
                if (z) {
                    c4484.m13221(c18241, EnumC3779.TYPE_CODE_ITEM);
                    C22828 c22828 = new C22828();
                    for (AbstractC5895 abstractC5897 : abstractC5895Arr) {
                        c22828.m50938(abstractC5897);
                    }
                    c22828.m50939(c18241);
                    c18241.m42512();
                }
                return c18241;
            } catch (DigestException e3) {
                throw new RuntimeException(e3);
            }
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        }
    }
}
