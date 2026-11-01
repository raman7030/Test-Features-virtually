package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.Writer;

/* JADX INFO: renamed from: l.ᩴۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 65V2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20168 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6086 f62424;

    /* JADX INFO: renamed from: ۧ */
    public int f62425;

    /* JADX INFO: renamed from: ܽ */
    public boolean f62426;

    public C20168(AbstractC6086 abstractC6086, int i) {
        this.f62424 = abstractC6086;
        this.f62425 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m45631() {
        return this.f62425;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m45645(int i) {
        this.f62425 = i;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m45629() {
        int i;
        m45622();
        int i2 = this.f62425;
        int i3 = i2 + 1;
        AbstractC6086 abstractC6086 = this.f62424;
        byte bMo13853 = abstractC6086.mo13853(i2);
        int i4 = bMo13853 & 255;
        if (i4 <= 127) {
            i = (i4 << 25) >> 25;
        } else {
            int i5 = i2 + 2;
            byte bMo13854 = abstractC6086.mo13853(i3);
            int i6 = bMo13854 & 255;
            int i7 = ((bMo13854 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (bMo13853 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i6 <= 127) {
                i = (i7 << 18) >> 18;
            } else {
                int i8 = i2 + 3;
                byte bMo13855 = abstractC6086.mo13853(i5);
                int i9 = bMo13855 & 255;
                int i10 = i7 | ((bMo13855 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14);
                if (i9 <= 127) {
                    i = (i10 << 11) >> 11;
                    i3 = i8;
                } else {
                    i5 = i2 + 4;
                    byte bMo13856 = abstractC6086.mo13853(i8);
                    int i11 = bMo13856 & 255;
                    int i12 = i10 | ((bMo13856 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21);
                    if (i11 <= 127) {
                        i = (i12 << 4) >> 4;
                    } else {
                        int i13 = i2 + 5;
                        int iMo13853 = abstractC6086.mo13853(i5) & 255;
                        if (iMo13853 > 127) {
                            throw new C17034(null, "Invalid sleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f62425));
                        }
                        int i14 = i12 | (iMo13853 << 28);
                        i3 = i13;
                        i = i14;
                    }
                }
            }
            i3 = i5;
        }
        this.f62425 = i3;
        return i;
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m45635() {
        return m45620(false);
    }

    /* JADX INFO: renamed from: ֫ */
    private int m45620(boolean z) {
        m45622();
        int i = this.f62425;
        int i2 = i + 1;
        AbstractC6086 abstractC6086 = this.f62424;
        byte bMo13853 = abstractC6086.mo13853(i);
        int i3 = bMo13853 & 255;
        if (i3 > 127) {
            int i4 = i + 2;
            byte bMo13854 = abstractC6086.mo13853(i2);
            int i5 = bMo13854 & 255;
            int i6 = ((bMo13854 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (bMo13853 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i5 > 127) {
                int i7 = i + 3;
                byte bMo13855 = abstractC6086.mo13853(i4);
                int i8 = bMo13855 & 255;
                i3 = ((bMo13855 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14) | i6;
                if (i8 > 127) {
                    i2 = i + 4;
                    byte bMo13856 = abstractC6086.mo13853(i7);
                    int i9 = bMo13856 & 255;
                    i3 |= (bMo13856 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21;
                    if (i9 > 127) {
                        int i10 = i + 5;
                        byte bMo13857 = abstractC6086.mo13853(i2);
                        if (bMo13857 < 0) {
                            throw new C17034(null, "Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f62425));
                        }
                        if ((bMo13857 & 15) > 7 && !z) {
                            throw new C17034(null, "Encountered valid uleb128 that is out of range at offset 0x%x", Integer.valueOf(this.f62425));
                        }
                        i3 |= bMo13857 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                        i2 = i10;
                    }
                } else {
                    i2 = i7;
                }
            } else {
                i3 = i6;
                i2 = i4;
            }
        }
        this.f62425 = i2;
        return i3;
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m45630() {
        return m45620(true);
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m45627() {
        m45622();
        int i = this.f62425;
        int i2 = i + 1;
        AbstractC6086 abstractC6086 = this.f62424;
        byte bMo13853 = abstractC6086.mo13853(i);
        int i3 = bMo13853 & 255;
        if (i3 > 127) {
            int i4 = i + 2;
            byte bMo13854 = abstractC6086.mo13853(i2);
            int i5 = bMo13854 & 255;
            int i6 = ((bMo13854 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (bMo13853 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i5 > 127) {
                int i7 = i + 3;
                byte bMo13855 = abstractC6086.mo13853(i4);
                int i8 = bMo13855 & 255;
                i3 = ((bMo13855 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14) | i6;
                if (i8 > 127) {
                    i2 = i + 4;
                    byte bMo13856 = abstractC6086.mo13853(i7);
                    int i9 = bMo13856 & 255;
                    i3 |= (bMo13856 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21;
                    if (i9 > 127) {
                        int i10 = i + 5;
                        byte bMo13857 = abstractC6086.mo13853(i2);
                        if (bMo13857 < 0) {
                            throw new C17034(null, "Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f62425));
                        }
                        i3 |= bMo13857 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                        i2 = i10;
                    }
                } else {
                    i2 = i7;
                }
            } else {
                i3 = i6;
                i2 = i4;
            }
        }
        this.f62425 = i2;
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045 A[PHI: r3
      0x0045: PHI (r3v2 int) = (r3v1 int), (r3v4 int) binds: [B:5:0x0015, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֡ */
    public final void m45621() {
        m45622();
        int i = this.f62425;
        int i2 = i + 1;
        AbstractC6086 abstractC6086 = this.f62424;
        if (abstractC6086.mo13853(i) < 0) {
            int i3 = i + 2;
            if (abstractC6086.mo13853(i2) < 0) {
                i2 = i + 3;
                if (abstractC6086.mo13853(i3) < 0) {
                    i3 = i + 4;
                    if (abstractC6086.mo13853(i2) < 0) {
                        i2 = i + 5;
                        if (abstractC6086.mo13853(i3) < 0) {
                            throw new C17034(null, "Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f62425));
                        }
                    } else {
                        i2 = i3;
                    }
                }
            } else {
                i2 = i3;
            }
        }
        this.f62425 = i2;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m45633() {
        return this.f62424.m13856(this.f62425);
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m45638() {
        return this.f62424.m13862(this.f62425);
    }

    /* JADX INFO: renamed from: ۖ */
    public final int m45625() {
        int i = this.f62425;
        int iM13862 = this.f62424.m13862(i);
        this.f62425 = i + 1;
        return iM13862;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m45644() {
        int i = this.f62425;
        byte bMo13853 = this.f62424.mo13853(i);
        this.f62425 = i + 1;
        return bMo13853;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m45643() {
        this.f62425++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45623(int i) {
        this.f62425 += i;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m45646() {
        return this.f62424.m13856(this.f62425 + 2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m45632(int i) {
        return this.f62424.mo13857(this.f62425 + i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m45640() {
        return this.f62424.mo13863(this.f62425 + 2);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m45636() {
        return this.f62424.mo13853(this.f62425 + 1);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m45637(int i) {
        int iMo13853;
        int iMo13854;
        int iMo13855;
        m45622();
        int i2 = this.f62425;
        AbstractC6086 abstractC6086 = this.f62424;
        if (i != 1) {
            if (i == 2) {
                iMo13854 = abstractC6086.mo13853(i2) & 255;
                iMo13855 = abstractC6086.mo13853(i2 + 1) << 8;
            } else if (i == 3) {
                iMo13854 = (abstractC6086.mo13853(i2) & 255) | ((abstractC6086.mo13853(i2 + 1) & 255) << 8);
                iMo13855 = abstractC6086.mo13853(i2 + 2) << 16;
            } else if (i == 4) {
                iMo13854 = (abstractC6086.mo13853(i2) & 255) | ((abstractC6086.mo13853(i2 + 1) & 255) << 8) | ((abstractC6086.mo13853(i2 + 2) & 255) << 16);
                iMo13855 = abstractC6086.mo13853(i2 + 3) << 24;
            } else {
                throw new C17034(null, "Invalid size %d for sized int at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f62425));
            }
            iMo13853 = iMo13855 | iMo13854;
        } else {
            iMo13853 = abstractC6086.mo13853(i2);
        }
        this.f62425 = i2 + i;
        return iMo13853;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m45647(int i) {
        m45622();
        int i2 = this.f62425;
        AbstractC6086 abstractC6086 = this.f62424;
        int iMo13853 = 0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        byte bMo13853 = abstractC6086.mo13853(i2 + 3);
                        if (bMo13853 < 0) {
                            throw new C17034(null, "Encountered valid sized uint that is out of range at offset 0x%x", Integer.valueOf(this.f62425));
                        }
                        iMo13853 = bMo13853 << 24;
                    } else {
                        throw new C17034(null, "Invalid size %d for sized uint at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f62425));
                    }
                }
                iMo13853 |= (abstractC6086.mo13853(i2 + 2) & 255) << 16;
            }
            iMo13853 |= (abstractC6086.mo13853(i2 + 1) & 255) << 8;
        }
        int iMo13854 = (abstractC6086.mo13853(i2) & 255) | iMo13853;
        this.f62425 = i2 + i;
        return iMo13854;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m45639(int i) {
        int iMo13853;
        int iMo13854;
        byte bMo13853;
        m45622();
        int i2 = this.f62425;
        AbstractC6086 abstractC6086 = this.f62424;
        if (i != 1) {
            if (i == 2) {
                iMo13854 = (abstractC6086.mo13853(i2) & 255) << 16;
                bMo13853 = abstractC6086.mo13853(i2 + 1);
            } else if (i == 3) {
                iMo13854 = ((abstractC6086.mo13853(i2) & 255) << 8) | ((abstractC6086.mo13853(i2 + 1) & 255) << 16);
                bMo13853 = abstractC6086.mo13853(i2 + 2);
            } else if (i == 4) {
                iMo13854 = (abstractC6086.mo13853(i2) & 255) | ((abstractC6086.mo13853(i2 + 1) & 255) << 8) | ((abstractC6086.mo13853(i2 + 2) & 255) << 16);
                bMo13853 = abstractC6086.mo13853(i2 + 3);
            } else {
                throw new C17034(null, "Invalid size %d for sized, right extended int at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f62425));
            }
            iMo13853 = (bMo13853 << 24) | iMo13854;
        } else {
            iMo13853 = abstractC6086.mo13853(i2) << 24;
        }
        this.f62425 = i2 + i;
        return iMo13853;
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m45634(int i) {
        long jMo13853;
        long jMo13854;
        byte bMo13853;
        m45622();
        int i2 = this.f62425;
        AbstractC6086 abstractC6086 = this.f62424;
        switch (i) {
            case 1:
                jMo13853 = ((long) abstractC6086.mo13853(i2)) << 56;
                this.f62425 = i2 + i;
                return jMo13853;
            case 2:
                jMo13854 = (((long) abstractC6086.mo13853(i2)) & 255) << 48;
                bMo13853 = abstractC6086.mo13853(i2 + 1);
                jMo13853 = jMo13854 | (((long) bMo13853) << 56);
                this.f62425 = i2 + i;
                return jMo13853;
            case 3:
                jMo13854 = ((((long) abstractC6086.mo13853(i2)) & 255) << 40) | ((255 & ((long) abstractC6086.mo13853(i2 + 1))) << 48);
                bMo13853 = abstractC6086.mo13853(i2 + 2);
                jMo13853 = jMo13854 | (((long) bMo13853) << 56);
                this.f62425 = i2 + i;
                return jMo13853;
            case 4:
                jMo13854 = ((((long) abstractC6086.mo13853(i2)) & 255) << 32) | ((((long) abstractC6086.mo13853(i2 + 1)) & 255) << 40) | ((255 & ((long) abstractC6086.mo13853(i2 + 2))) << 48);
                bMo13853 = abstractC6086.mo13853(i2 + 3);
                jMo13853 = jMo13854 | (((long) bMo13853) << 56);
                this.f62425 = i2 + i;
                return jMo13853;
            case 5:
                jMo13854 = ((((long) abstractC6086.mo13853(i2 + 1)) & 255) << 32) | ((((long) abstractC6086.mo13853(i2)) & 255) << 24) | ((((long) abstractC6086.mo13853(i2 + 2)) & 255) << 40) | ((255 & ((long) abstractC6086.mo13853(i2 + 3))) << 48);
                bMo13853 = abstractC6086.mo13853(i2 + 4);
                jMo13853 = jMo13854 | (((long) bMo13853) << 56);
                this.f62425 = i2 + i;
                return jMo13853;
            case 6:
                jMo13854 = ((((long) abstractC6086.mo13853(i2 + 2)) & 255) << 32) | ((long) ((abstractC6086.mo13853(i2) & 255) << 16)) | ((((long) abstractC6086.mo13853(i2 + 1)) & 255) << 24) | ((((long) abstractC6086.mo13853(i2 + 3)) & 255) << 40) | ((255 & ((long) abstractC6086.mo13853(i2 + 4))) << 48);
                bMo13853 = abstractC6086.mo13853(i2 + 5);
                jMo13853 = jMo13854 | (((long) bMo13853) << 56);
                this.f62425 = i2 + i;
                return jMo13853;
            case 7:
                jMo13854 = ((((long) abstractC6086.mo13853(i2 + 3)) & 255) << 32) | ((long) (((abstractC6086.mo13853(i2) & 255) << 8) | ((abstractC6086.mo13853(i2 + 1) & 255) << 16))) | ((((long) abstractC6086.mo13853(i2 + 2)) & 255) << 24) | ((((long) abstractC6086.mo13853(i2 + 4)) & 255) << 40) | ((255 & ((long) abstractC6086.mo13853(i2 + 5))) << 48);
                bMo13853 = abstractC6086.mo13853(i2 + 6);
                jMo13853 = jMo13854 | (((long) bMo13853) << 56);
                this.f62425 = i2 + i;
                return jMo13853;
            case 8:
                jMo13854 = ((((long) abstractC6086.mo13853(i2 + 4)) & 255) << 32) | ((long) ((abstractC6086.mo13853(i2) & 255) | ((abstractC6086.mo13853(i2 + 1) & 255) << 8) | ((abstractC6086.mo13853(i2 + 2) & 255) << 16))) | ((((long) abstractC6086.mo13853(i2 + 3)) & 255) << 24) | ((((long) abstractC6086.mo13853(i2 + 5)) & 255) << 40) | ((255 & ((long) abstractC6086.mo13853(i2 + 6))) << 48);
                bMo13853 = abstractC6086.mo13853(i2 + 7);
                jMo13853 = jMo13854 | (((long) bMo13853) << 56);
                this.f62425 = i2 + i;
                return jMo13853;
            default:
                throw new C17034(null, "Invalid size %d for sized, right extended long at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f62425));
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m45641(int i) {
        int iMo13853;
        int iMo13854;
        int iMo13855;
        long j;
        long jMo13853;
        long jMo13854;
        long jMo13855;
        long jMo13856;
        m45622();
        int i2 = this.f62425;
        AbstractC6086 abstractC6086 = this.f62424;
        switch (i) {
            case 1:
                iMo13853 = abstractC6086.mo13853(i2);
                j = iMo13853;
                this.f62425 = i2 + i;
                return j;
            case 2:
                iMo13854 = abstractC6086.mo13853(i2) & 255;
                iMo13855 = abstractC6086.mo13853(i2 + 1) << 8;
                iMo13853 = iMo13854 | iMo13855;
                j = iMo13853;
                this.f62425 = i2 + i;
                return j;
            case 3:
                iMo13854 = (abstractC6086.mo13853(i2) & 255) | ((abstractC6086.mo13853(i2 + 1) & 255) << 8);
                iMo13855 = abstractC6086.mo13853(i2 + 2) << 16;
                iMo13853 = iMo13854 | iMo13855;
                j = iMo13853;
                this.f62425 = i2 + i;
                return j;
            case 4:
                jMo13853 = (abstractC6086.mo13853(i2) & 255) | ((abstractC6086.mo13853(i2 + 1) & 255) << 8) | ((abstractC6086.mo13853(i2 + 2) & 255) << 16);
                jMo13854 = ((long) abstractC6086.mo13853(i2 + 3)) << 24;
                j = jMo13853 | jMo13854;
                this.f62425 = i2 + i;
                return j;
            case 5:
                jMo13853 = ((long) ((abstractC6086.mo13853(i2) & 255) | ((abstractC6086.mo13853(i2 + 1) & 255) << 8) | ((abstractC6086.mo13853(i2 + 2) & 255) << 16))) | ((255 & ((long) abstractC6086.mo13853(i2 + 3))) << 24);
                jMo13854 = ((long) abstractC6086.mo13853(i2 + 4)) << 32;
                j = jMo13853 | jMo13854;
                this.f62425 = i2 + i;
                return j;
            case 6:
                jMo13855 = ((((long) abstractC6086.mo13853(i2 + 4)) & 255) << 32) | ((long) ((abstractC6086.mo13853(i2) & 255) | ((abstractC6086.mo13853(i2 + 1) & 255) << 8) | ((abstractC6086.mo13853(i2 + 2) & 255) << 16))) | ((((long) abstractC6086.mo13853(i2 + 3)) & 255) << 24);
                jMo13856 = ((long) abstractC6086.mo13853(i2 + 5)) << 40;
                j = jMo13856 | jMo13855;
                this.f62425 = i2 + i;
                return j;
            case 7:
                jMo13855 = ((((long) abstractC6086.mo13853(i2 + 4)) & 255) << 32) | ((long) ((abstractC6086.mo13853(i2) & 255) | ((abstractC6086.mo13853(i2 + 1) & 255) << 8) | ((abstractC6086.mo13853(i2 + 2) & 255) << 16))) | ((((long) abstractC6086.mo13853(i2 + 3)) & 255) << 24) | ((255 & ((long) abstractC6086.mo13853(i2 + 5))) << 40);
                jMo13856 = ((long) abstractC6086.mo13853(i2 + 6)) << 48;
                j = jMo13856 | jMo13855;
                this.f62425 = i2 + i;
                return j;
            case 8:
                jMo13853 = ((((long) abstractC6086.mo13853(i2 + 6)) & 255) << 48) | ((((long) abstractC6086.mo13853(i2 + 4)) & 255) << 32) | ((long) ((abstractC6086.mo13853(i2) & 255) | ((abstractC6086.mo13853(i2 + 1) & 255) << 8) | ((abstractC6086.mo13853(i2 + 2) & 255) << 16))) | ((((long) abstractC6086.mo13853(i2 + 3)) & 255) << 24) | ((((long) abstractC6086.mo13853(i2 + 5)) & 255) << 40);
                jMo13854 = ((long) abstractC6086.mo13853(i2 + 7)) << 56;
                j = jMo13853 | jMo13854;
                this.f62425 = i2 + i;
                return j;
            default:
                throw new C17034(null, "Invalid size %d for sized long at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f62425));
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m45628(int i) {
        m45622();
        int[] iArr = new int[1];
        String strM22505 = C9659.m22505(this.f62424, this.f62425, i, iArr);
        this.f62425 += iArr[0];
        return strM22505;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45624(int i, Writer writer, boolean z) {
        m45622();
        int i2 = this.f62425;
        this.f62425 = C9659.m22504(writer, this.f62424, i2, i, z) + i2;
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m45626() {
        if (this.f62426) {
            return;
        }
        this.f62426 = true;
        this.f62424.m13854(this);
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m45642() {
        this.f62426 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45622() {
        if (this.f62426) {
            throw new IllegalStateException("Recycled");
        }
    }
}
