package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88HU */
/* JADX INFO: loaded from: classes2.dex */
public final class C7304 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f22414;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f22415;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final float f22416;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f22417;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f22418;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f22419;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f22420;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f22421;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f22422;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f22423;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f22424;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f22425;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7304 m19582(C17714 c17714) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        try {
            c17714.m41478(4);
            int iM41456 = (c17714.m41456() & 3) + 1;
            if (iM41456 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM41457 = c17714.m41456() & 31;
            for (int i9 = 0; i9 < iM41457; i9++) {
                int iM41464 = c17714.m41464();
                int iM41485 = c17714.m41485();
                c17714.m41478(iM41464);
                arrayList.add(C17839.m41770(iM41485, iM41464, c17714.m41482()));
            }
            int iM41458 = c17714.m41456();
            for (int i10 = 0; i10 < iM41458; i10++) {
                int iM41465 = c17714.m41464();
                int iM41486 = c17714.m41485();
                c17714.m41478(iM41465);
                arrayList.add(C17839.m41770(iM41486, iM41465, c17714.m41482()));
            }
            if (iM41457 > 0) {
                C10866 c10866M38891 = C16509.m38891(4, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i11 = c10866M38891.f32641;
                int i12 = c10866M38891.f32648;
                int i13 = c10866M38891.f32649 + 8;
                int i14 = c10866M38891.f32642 + 8;
                int i15 = c10866M38891.f32654;
                int i16 = c10866M38891.f32652;
                int i17 = c10866M38891.f32653;
                int i18 = c10866M38891.f32651;
                float f2 = c10866M38891.f32655;
                int i19 = c10866M38891.f32656;
                int i20 = c10866M38891.f32650;
                int i21 = c10866M38891.f32647;
                int i22 = C17839.f54488;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i19), Integer.valueOf(i20), Integer.valueOf(i21));
                i7 = i17;
                i8 = i18;
                f = f2;
                i4 = i14;
                i5 = i15;
                i6 = i16;
                i = i11;
                i2 = i12;
                i3 = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = 16;
                f = 1.0f;
            }
            return new C7304(arrayList, iM41456, i, i2, i3, i4, i5, i6, i7, i8, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C9080.m23440("Error parsing AVC config", e);
        }
    }

    public C7304(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.f22415 = arrayList;
        this.f22417 = i;
        this.f22420 = i2;
        this.f22425 = i3;
        this.f22418 = i4;
        this.f22414 = i5;
        this.f22422 = i6;
        this.f22423 = i7;
        this.f22419 = i8;
        this.f22424 = i9;
        this.f22416 = f;
        this.f22421 = str;
    }
}
