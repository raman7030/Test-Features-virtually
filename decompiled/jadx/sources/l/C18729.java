package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.Writer;

/* JADX INFO: renamed from: l.ᩴۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 65V2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18729 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC3912 f59201;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f59202;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f59203;

    public C18729(AbstractC3912 abstractC3912, int i) {
        this.f59201 = abstractC3912;
        this.f59202 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m43364() {
        return this.f59202;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43378(int i) {
        this.f59202 = i;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m43362() {
        int i;
        m43355();
        int i2 = this.f59202;
        int i3 = i2 + 1;
        AbstractC3912 abstractC3912 = this.f59201;
        byte bMo11933 = abstractC3912.mo11933(i2);
        int i4 = bMo11933 & 255;
        if (i4 <= 127) {
            i = (i4 << 25) >> 25;
        } else {
            int i5 = i2 + 2;
            byte bMo11934 = abstractC3912.mo11933(i3);
            int i6 = bMo11934 & 255;
            int i7 = ((bMo11934 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (bMo11933 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i6 <= 127) {
                i = (i7 << 18) >> 18;
            } else {
                int i8 = i2 + 3;
                byte bMo11935 = abstractC3912.mo11933(i5);
                int i9 = bMo11935 & 255;
                int i10 = i7 | ((bMo11935 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14);
                if (i9 <= 127) {
                    i = (i10 << 11) >> 11;
                    i3 = i8;
                } else {
                    i5 = i2 + 4;
                    byte bMo11936 = abstractC3912.mo11933(i8);
                    int i11 = bMo11936 & 255;
                    int i12 = i10 | ((bMo11936 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21);
                    if (i11 <= 127) {
                        i = (i12 << 4) >> 4;
                    } else {
                        int i13 = i2 + 5;
                        int iMo11933 = abstractC3912.mo11933(i5) & 255;
                        if (iMo11933 > 127) {
                            throw new C15431(null, "Invalid sleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f59202));
                        }
                        int i14 = i12 | (iMo11933 << 28);
                        i3 = i13;
                        i = i14;
                    }
                }
            }
            i3 = i5;
        }
        this.f59202 = i3;
        return i;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m43368() {
        return m43353(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m43353(boolean z) {
        m43355();
        int i = this.f59202;
        int i2 = i + 1;
        AbstractC3912 abstractC3912 = this.f59201;
        byte bMo11933 = abstractC3912.mo11933(i);
        int i3 = bMo11933 & 255;
        if (i3 > 127) {
            int i4 = i + 2;
            byte bMo11934 = abstractC3912.mo11933(i2);
            int i5 = bMo11934 & 255;
            int i6 = ((bMo11934 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (bMo11933 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i5 > 127) {
                int i7 = i + 3;
                byte bMo11935 = abstractC3912.mo11933(i4);
                int i8 = bMo11935 & 255;
                i3 = ((bMo11935 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14) | i6;
                if (i8 > 127) {
                    i2 = i + 4;
                    byte bMo11936 = abstractC3912.mo11933(i7);
                    int i9 = bMo11936 & 255;
                    i3 |= (bMo11936 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21;
                    if (i9 > 127) {
                        int i10 = i + 5;
                        byte bMo11937 = abstractC3912.mo11933(i2);
                        if (bMo11937 < 0) {
                            throw new C15431(null, "Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f59202));
                        }
                        if ((bMo11937 & 15) > 7 && !z) {
                            throw new C15431(null, "Encountered valid uleb128 that is out of range at offset 0x%x", Integer.valueOf(this.f59202));
                        }
                        i3 |= bMo11937 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
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
        this.f59202 = i2;
        return i3;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m43363() {
        return m43353(true);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m43360() {
        m43355();
        int i = this.f59202;
        int i2 = i + 1;
        AbstractC3912 abstractC3912 = this.f59201;
        byte bMo11933 = abstractC3912.mo11933(i);
        int i3 = bMo11933 & 255;
        if (i3 > 127) {
            int i4 = i + 2;
            byte bMo11934 = abstractC3912.mo11933(i2);
            int i5 = bMo11934 & 255;
            int i6 = ((bMo11934 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (bMo11933 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i5 > 127) {
                int i7 = i + 3;
                byte bMo11935 = abstractC3912.mo11933(i4);
                int i8 = bMo11935 & 255;
                i3 = ((bMo11935 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14) | i6;
                if (i8 > 127) {
                    i2 = i + 4;
                    byte bMo11936 = abstractC3912.mo11933(i7);
                    int i9 = bMo11936 & 255;
                    i3 |= (bMo11936 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21;
                    if (i9 > 127) {
                        int i10 = i + 5;
                        byte bMo11937 = abstractC3912.mo11933(i2);
                        if (bMo11937 < 0) {
                            throw new C15431(null, "Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f59202));
                        }
                        i3 |= bMo11937 << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
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
        this.f59202 = i2;
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045 A[PHI: r3
      0x0045: PHI (r3v2 int) = (r3v1 int), (r3v4 int) binds: [B:5:0x0015, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m43354() {
        m43355();
        int i = this.f59202;
        int i2 = i + 1;
        AbstractC3912 abstractC3912 = this.f59201;
        if (abstractC3912.mo11933(i) < 0) {
            int i3 = i + 2;
            if (abstractC3912.mo11933(i2) < 0) {
                i2 = i + 3;
                if (abstractC3912.mo11933(i3) < 0) {
                    i3 = i + 4;
                    if (abstractC3912.mo11933(i2) < 0) {
                        i2 = i + 5;
                        if (abstractC3912.mo11933(i3) < 0) {
                            throw new C15431(null, "Invalid uleb128 integer encountered at offset 0x%x", Integer.valueOf(this.f59202));
                        }
                    } else {
                        i2 = i3;
                    }
                }
            } else {
                i2 = i3;
            }
        }
        this.f59202 = i2;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m43366() {
        return this.f59201.m11936(this.f59202);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m43371() {
        return this.f59201.m11942(this.f59202);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m43358() {
        int i = this.f59202;
        int iM11942 = this.f59201.m11942(i);
        this.f59202 = i + 1;
        return iM11942;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m43377() {
        int i = this.f59202;
        byte bMo11933 = this.f59201.mo11933(i);
        this.f59202 = i + 1;
        return bMo11933;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m43376() {
        this.f59202++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43356(int i) {
        this.f59202 += i;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m43379() {
        return this.f59201.m11936(this.f59202 + 2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m43365(int i) {
        return this.f59201.mo11937(this.f59202 + i);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m43373() {
        return this.f59201.mo11943(this.f59202 + 2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m43369() {
        return this.f59201.mo11933(this.f59202 + 1);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m43370(int i) {
        int iMo11933;
        int iMo11934;
        int iMo11935;
        m43355();
        int i2 = this.f59202;
        AbstractC3912 abstractC3912 = this.f59201;
        if (i != 1) {
            if (i == 2) {
                iMo11934 = abstractC3912.mo11933(i2) & 255;
                iMo11935 = abstractC3912.mo11933(i2 + 1) << 8;
            } else if (i == 3) {
                iMo11934 = (abstractC3912.mo11933(i2) & 255) | ((abstractC3912.mo11933(i2 + 1) & 255) << 8);
                iMo11935 = abstractC3912.mo11933(i2 + 2) << 16;
            } else if (i == 4) {
                iMo11934 = (abstractC3912.mo11933(i2) & 255) | ((abstractC3912.mo11933(i2 + 1) & 255) << 8) | ((abstractC3912.mo11933(i2 + 2) & 255) << 16);
                iMo11935 = abstractC3912.mo11933(i2 + 3) << 24;
            } else {
                throw new C15431(null, "Invalid size %d for sized int at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f59202));
            }
            iMo11933 = iMo11935 | iMo11934;
        } else {
            iMo11933 = abstractC3912.mo11933(i2);
        }
        this.f59202 = i2 + i;
        return iMo11933;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m43380(int i) {
        m43355();
        int i2 = this.f59202;
        AbstractC3912 abstractC3912 = this.f59201;
        int iMo11933 = 0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        byte bMo11933 = abstractC3912.mo11933(i2 + 3);
                        if (bMo11933 < 0) {
                            throw new C15431(null, "Encountered valid sized uint that is out of range at offset 0x%x", Integer.valueOf(this.f59202));
                        }
                        iMo11933 = bMo11933 << 24;
                    } else {
                        throw new C15431(null, "Invalid size %d for sized uint at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f59202));
                    }
                }
                iMo11933 |= (abstractC3912.mo11933(i2 + 2) & 255) << 16;
            }
            iMo11933 |= (abstractC3912.mo11933(i2 + 1) & 255) << 8;
        }
        int iMo11934 = (abstractC3912.mo11933(i2) & 255) | iMo11933;
        this.f59202 = i2 + i;
        return iMo11934;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m43372(int i) {
        int iMo11933;
        int iMo11934;
        byte bMo11933;
        m43355();
        int i2 = this.f59202;
        AbstractC3912 abstractC3912 = this.f59201;
        if (i != 1) {
            if (i == 2) {
                iMo11934 = (abstractC3912.mo11933(i2) & 255) << 16;
                bMo11933 = abstractC3912.mo11933(i2 + 1);
            } else if (i == 3) {
                iMo11934 = ((abstractC3912.mo11933(i2) & 255) << 8) | ((abstractC3912.mo11933(i2 + 1) & 255) << 16);
                bMo11933 = abstractC3912.mo11933(i2 + 2);
            } else if (i == 4) {
                iMo11934 = (abstractC3912.mo11933(i2) & 255) | ((abstractC3912.mo11933(i2 + 1) & 255) << 8) | ((abstractC3912.mo11933(i2 + 2) & 255) << 16);
                bMo11933 = abstractC3912.mo11933(i2 + 3);
            } else {
                throw new C15431(null, "Invalid size %d for sized, right extended int at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f59202));
            }
            iMo11933 = (bMo11933 << 24) | iMo11934;
        } else {
            iMo11933 = abstractC3912.mo11933(i2) << 24;
        }
        this.f59202 = i2 + i;
        return iMo11933;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m43367(int i) {
        long jMo11933;
        long jMo11934;
        byte bMo11933;
        m43355();
        int i2 = this.f59202;
        AbstractC3912 abstractC3912 = this.f59201;
        switch (i) {
            case 1:
                jMo11933 = ((long) abstractC3912.mo11933(i2)) << 56;
                this.f59202 = i2 + i;
                return jMo11933;
            case 2:
                jMo11934 = (((long) abstractC3912.mo11933(i2)) & 255) << 48;
                bMo11933 = abstractC3912.mo11933(i2 + 1);
                jMo11933 = jMo11934 | (((long) bMo11933) << 56);
                this.f59202 = i2 + i;
                return jMo11933;
            case 3:
                jMo11934 = ((((long) abstractC3912.mo11933(i2)) & 255) << 40) | ((255 & ((long) abstractC3912.mo11933(i2 + 1))) << 48);
                bMo11933 = abstractC3912.mo11933(i2 + 2);
                jMo11933 = jMo11934 | (((long) bMo11933) << 56);
                this.f59202 = i2 + i;
                return jMo11933;
            case 4:
                jMo11934 = ((((long) abstractC3912.mo11933(i2)) & 255) << 32) | ((((long) abstractC3912.mo11933(i2 + 1)) & 255) << 40) | ((255 & ((long) abstractC3912.mo11933(i2 + 2))) << 48);
                bMo11933 = abstractC3912.mo11933(i2 + 3);
                jMo11933 = jMo11934 | (((long) bMo11933) << 56);
                this.f59202 = i2 + i;
                return jMo11933;
            case 5:
                jMo11934 = ((((long) abstractC3912.mo11933(i2 + 1)) & 255) << 32) | ((((long) abstractC3912.mo11933(i2)) & 255) << 24) | ((((long) abstractC3912.mo11933(i2 + 2)) & 255) << 40) | ((255 & ((long) abstractC3912.mo11933(i2 + 3))) << 48);
                bMo11933 = abstractC3912.mo11933(i2 + 4);
                jMo11933 = jMo11934 | (((long) bMo11933) << 56);
                this.f59202 = i2 + i;
                return jMo11933;
            case 6:
                jMo11934 = ((((long) abstractC3912.mo11933(i2 + 2)) & 255) << 32) | ((long) ((abstractC3912.mo11933(i2) & 255) << 16)) | ((((long) abstractC3912.mo11933(i2 + 1)) & 255) << 24) | ((((long) abstractC3912.mo11933(i2 + 3)) & 255) << 40) | ((255 & ((long) abstractC3912.mo11933(i2 + 4))) << 48);
                bMo11933 = abstractC3912.mo11933(i2 + 5);
                jMo11933 = jMo11934 | (((long) bMo11933) << 56);
                this.f59202 = i2 + i;
                return jMo11933;
            case 7:
                jMo11934 = ((((long) abstractC3912.mo11933(i2 + 3)) & 255) << 32) | ((long) (((abstractC3912.mo11933(i2) & 255) << 8) | ((abstractC3912.mo11933(i2 + 1) & 255) << 16))) | ((((long) abstractC3912.mo11933(i2 + 2)) & 255) << 24) | ((((long) abstractC3912.mo11933(i2 + 4)) & 255) << 40) | ((255 & ((long) abstractC3912.mo11933(i2 + 5))) << 48);
                bMo11933 = abstractC3912.mo11933(i2 + 6);
                jMo11933 = jMo11934 | (((long) bMo11933) << 56);
                this.f59202 = i2 + i;
                return jMo11933;
            case 8:
                jMo11934 = ((((long) abstractC3912.mo11933(i2 + 4)) & 255) << 32) | ((long) ((abstractC3912.mo11933(i2) & 255) | ((abstractC3912.mo11933(i2 + 1) & 255) << 8) | ((abstractC3912.mo11933(i2 + 2) & 255) << 16))) | ((((long) abstractC3912.mo11933(i2 + 3)) & 255) << 24) | ((((long) abstractC3912.mo11933(i2 + 5)) & 255) << 40) | ((255 & ((long) abstractC3912.mo11933(i2 + 6))) << 48);
                bMo11933 = abstractC3912.mo11933(i2 + 7);
                jMo11933 = jMo11934 | (((long) bMo11933) << 56);
                this.f59202 = i2 + i;
                return jMo11933;
            default:
                throw new C15431(null, "Invalid size %d for sized, right extended long at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f59202));
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m43374(int i) {
        int iMo11933;
        int iMo11934;
        int iMo11935;
        long j;
        long jMo11933;
        long jMo11934;
        long jMo11935;
        long jMo11936;
        m43355();
        int i2 = this.f59202;
        AbstractC3912 abstractC3912 = this.f59201;
        switch (i) {
            case 1:
                iMo11933 = abstractC3912.mo11933(i2);
                j = iMo11933;
                this.f59202 = i2 + i;
                return j;
            case 2:
                iMo11934 = abstractC3912.mo11933(i2) & 255;
                iMo11935 = abstractC3912.mo11933(i2 + 1) << 8;
                iMo11933 = iMo11934 | iMo11935;
                j = iMo11933;
                this.f59202 = i2 + i;
                return j;
            case 3:
                iMo11934 = (abstractC3912.mo11933(i2) & 255) | ((abstractC3912.mo11933(i2 + 1) & 255) << 8);
                iMo11935 = abstractC3912.mo11933(i2 + 2) << 16;
                iMo11933 = iMo11934 | iMo11935;
                j = iMo11933;
                this.f59202 = i2 + i;
                return j;
            case 4:
                jMo11933 = (abstractC3912.mo11933(i2) & 255) | ((abstractC3912.mo11933(i2 + 1) & 255) << 8) | ((abstractC3912.mo11933(i2 + 2) & 255) << 16);
                jMo11934 = ((long) abstractC3912.mo11933(i2 + 3)) << 24;
                j = jMo11933 | jMo11934;
                this.f59202 = i2 + i;
                return j;
            case 5:
                jMo11933 = ((long) ((abstractC3912.mo11933(i2) & 255) | ((abstractC3912.mo11933(i2 + 1) & 255) << 8) | ((abstractC3912.mo11933(i2 + 2) & 255) << 16))) | ((255 & ((long) abstractC3912.mo11933(i2 + 3))) << 24);
                jMo11934 = ((long) abstractC3912.mo11933(i2 + 4)) << 32;
                j = jMo11933 | jMo11934;
                this.f59202 = i2 + i;
                return j;
            case 6:
                jMo11935 = ((((long) abstractC3912.mo11933(i2 + 4)) & 255) << 32) | ((long) ((abstractC3912.mo11933(i2) & 255) | ((abstractC3912.mo11933(i2 + 1) & 255) << 8) | ((abstractC3912.mo11933(i2 + 2) & 255) << 16))) | ((((long) abstractC3912.mo11933(i2 + 3)) & 255) << 24);
                jMo11936 = ((long) abstractC3912.mo11933(i2 + 5)) << 40;
                j = jMo11936 | jMo11935;
                this.f59202 = i2 + i;
                return j;
            case 7:
                jMo11935 = ((((long) abstractC3912.mo11933(i2 + 4)) & 255) << 32) | ((long) ((abstractC3912.mo11933(i2) & 255) | ((abstractC3912.mo11933(i2 + 1) & 255) << 8) | ((abstractC3912.mo11933(i2 + 2) & 255) << 16))) | ((((long) abstractC3912.mo11933(i2 + 3)) & 255) << 24) | ((255 & ((long) abstractC3912.mo11933(i2 + 5))) << 40);
                jMo11936 = ((long) abstractC3912.mo11933(i2 + 6)) << 48;
                j = jMo11936 | jMo11935;
                this.f59202 = i2 + i;
                return j;
            case 8:
                jMo11933 = ((((long) abstractC3912.mo11933(i2 + 6)) & 255) << 48) | ((((long) abstractC3912.mo11933(i2 + 4)) & 255) << 32) | ((long) ((abstractC3912.mo11933(i2) & 255) | ((abstractC3912.mo11933(i2 + 1) & 255) << 8) | ((abstractC3912.mo11933(i2 + 2) & 255) << 16))) | ((((long) abstractC3912.mo11933(i2 + 3)) & 255) << 24) | ((((long) abstractC3912.mo11933(i2 + 5)) & 255) << 40);
                jMo11934 = ((long) abstractC3912.mo11933(i2 + 7)) << 56;
                j = jMo11933 | jMo11934;
                this.f59202 = i2 + i;
                return j;
            default:
                throw new C15431(null, "Invalid size %d for sized long at offset 0x%x", Integer.valueOf(i), Integer.valueOf(this.f59202));
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m43361(int i) {
        m43355();
        int[] iArr = new int[1];
        String strM20525 = C7671.m20525(this.f59201, this.f59202, i, iArr);
        this.f59202 += iArr[0];
        return strM20525;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43357(int i, Writer writer, boolean z) {
        m43355();
        int i2 = this.f59202;
        this.f59202 = C7671.m20524(writer, this.f59201, i2, i, z) + i2;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m43359() {
        if (this.f59203) {
            return;
        }
        this.f59203 = true;
        this.f59201.m11934(this);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m43375() {
        this.f59203 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43355() {
        if (this.f59203) {
            throw new IllegalStateException("Recycled");
        }
    }
}
