package p067l;

import bin.p000mt.plus.R;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۛ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8406 extends AbstractC14618 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ boolean f22543;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ActivityC22429 f22544;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8406(ActivityC22429 activityC22429, ActivityC22429 activityC224210, boolean z) {
        super(R.layout.MT_Protector, activityC224210, "dex_search_type_constant");
        this.f22544 = activityC22429;
        this.f22543 = z;
    }

    @Override // p067l.AbstractC14618
    /* JADX INFO: renamed from: ֫ */
    public final void mo19589(String str, String str2, boolean z) {
        C2981 c2981;
        AbstractC17958 abstractC17958;
        boolean z2;
        AbstractC17958 abstractC17959;
        ActivityC22429 activityC22429 = this.f22544;
        if (!activityC22429.f70775.f60063.isEmpty()) {
            ((C2981) activityC22429.f70775.f60063.peek()).f5265 = activityC22429.f70771.getFirstVisiblePosition();
        }
        Collection<C13068> collectionValues = this.f22543 ? ((C2981) activityC22429.f70775.f60063.peek()).f5264 : activityC22429.f70775.f60049.values();
        int i = 1;
        if (!z) {
            c2981 = new C2981();
            c2981.f5266 = str2;
            try {
                long j = Long.parseLong(str);
                for (C13068 c13068 : collectionValues) {
                    C9534 c9534M29924 = c13068.m29924();
                    if (c9534M29924 != null) {
                        C24286[] c24286ArrM22226 = c9534M29924.m22226();
                        AbstractC17958[] abstractC17958Arr = c13068.m29922().m34414().f22284;
                        int i2 = 0;
                        boolean z3 = false;
                        while (i2 < abstractC17958Arr.length) {
                            C24286 c24286 = c24286ArrM22226[i2];
                            if (c24286.m53616() && c24286.m53615() && (abstractC17958 = abstractC17958Arr[i2]) != null) {
                                int i3 = C21088.f66248[abstractC17958.mo7664().ordinal()];
                                if (i3 != i) {
                                    if (i3 != 2) {
                                        if (i3 == 3 && ((C10583) abstractC17958).f29309 == j) {
                                            c2981.f5264.add(c13068);
                                            z3 = true;
                                        }
                                    } else if (((C8571) abstractC17958).f23048 == j) {
                                        c2981.f5264.add(c13068);
                                        z3 = true;
                                    }
                                } else if (((C24664) abstractC17958).f78038 == j) {
                                    c2981.f5264.add(c13068);
                                    z3 = true;
                                }
                            }
                            if (z3) {
                                break;
                            }
                            i2++;
                            i = 1;
                        }
                        if (!z3) {
                            for (C15568 c15568 : c9534M29924.m22225()) {
                                if (C7676.m17776(c15568, j)) {
                                    c2981.f5264.add(c13068);
                                    z3 = true;
                                    break;
                                }
                            }
                            if (!z3) {
                                for (C15568 c15569 : c9534M29924.m22230()) {
                                    if (C7676.m17776(c15569, j)) {
                                        c2981.f5264.add(c13068);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    i = 1;
                }
            } catch (NumberFormatException unused) {
            }
        } else {
            c2981 = new C2981();
            c2981.f5266 = str2;
            String lowerCase = str.toLowerCase();
            for (C13068 c13069 : collectionValues) {
                C9534 c9534M29925 = c13069.m29924();
                if (c9534M29925 != null) {
                    C24286[] c24286ArrM22227 = c9534M29925.m22226();
                    AbstractC17958[] abstractC17958Arr2 = c13069.m29922().m34414().f22284;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= abstractC17958Arr2.length) {
                            z2 = false;
                            break;
                        }
                        C24286 c24287 = c24286ArrM22227[i4];
                        if (c24287.m53616() && c24287.m53615() && c24287.f76932.f60618.m53168().equals("Ljava/lang/String;") && (abstractC17959 = abstractC17958Arr2[i4]) != null && abstractC17959.mo7664() == EnumC5889.VALUE_STRING && ((C17287) abstractC17959).f51525.m30317().toLowerCase().contains(lowerCase)) {
                            c2981.f5264.add(c13069);
                            z2 = true;
                            break;
                        }
                        i4++;
                    }
                    if (!z2) {
                        for (C15568 c155610 : c9534M29925.m22225()) {
                            if (C7676.m17777(c155610, lowerCase)) {
                                c2981.f5264.add(c13069);
                                z2 = true;
                                break;
                            }
                        }
                        if (!z2) {
                            for (C15568 c155611 : c9534M29925.m22230()) {
                                if (C7676.m17777(c155611, lowerCase)) {
                                    c2981.f5264.add(c13069);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        activityC22429.f70775.f60063.push(c2981);
        activityC22429.f70775.f60050 = activityC22429.f70775.m44881();
    }

    @Override // p067l.AbstractC14618
    /* JADX INFO: renamed from: ֫ */
    public final void mo19588() {
        ActivityC22429 activityC22429 = this.f22544;
        activityC22429.setTitle(((C2981) activityC22429.f70775.f60063.peek()).f5266);
        activityC22429.m50379(EnumC9017.SEARCH_RESULT_CLASS);
    }
}
