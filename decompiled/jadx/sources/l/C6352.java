package l;

import bin.mt.plus.R;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۛ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6352 extends AbstractC12889 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f19671;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f19672;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6352(ActivityC21107 activityC21107, ActivityC21107 activityC21108, boolean z) {
        super(R.layout.MT_Protector, activityC21108, "dex_search_type_constant");
        this.f19672 = activityC21107;
        this.f19671 = z;
    }

    @Override // l.AbstractC12889
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo17649(String str, String str2, boolean z) {
        C0644 c0644;
        AbstractC16404 abstractC16404;
        boolean z2;
        AbstractC16404 abstractC16405;
        ActivityC21107 activityC21107 = this.f19672;
        if (!activityC21107.f68093.f56846.isEmpty()) {
            ((C0644) activityC21107.f68093.f56846.peek()).f2493 = activityC21107.f68089.getFirstVisiblePosition();
        }
        Collection<C11258> collectionValues = this.f19671 ? ((C0644) activityC21107.f68093.f56846.peek()).f2492 : activityC21107.f68093.f56832.values();
        int i = 1;
        if (!z) {
            c0644 = new C0644();
            c0644.f2494 = str2;
            try {
                long j = Long.parseLong(str);
                for (C11258 c11258 : collectionValues) {
                    C7540 c7540M27863 = c11258.m27863();
                    if (c7540M27863 != null) {
                        C23062[] c23062ArrM20250 = c7540M27863.m20250();
                        AbstractC16404[] abstractC16404Arr = c11258.m27861().m32314().f19421;
                        int i2 = 0;
                        boolean z3 = false;
                        while (i2 < abstractC16404Arr.length) {
                            C23062 c23062 = c23062ArrM20250[i2];
                            if (c23062.m51223() && c23062.m51222() && (abstractC16404 = abstractC16404Arr[i2]) != null) {
                                int i3 = C19696.f63627[abstractC16404.mo5435().ordinal()];
                                if (i3 != i) {
                                    if (i3 != 2) {
                                        if (i3 == 3 && ((C8644) abstractC16404).f26391 == j) {
                                            c0644.f2492.add(c11258);
                                            z3 = true;
                                        }
                                    } else if (((C6527) abstractC16404).f20170 == j) {
                                        c0644.f2492.add(c11258);
                                        z3 = true;
                                    }
                                } else if (((C23460) abstractC16404).f75291 == j) {
                                    c0644.f2492.add(c11258);
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
                            for (C13889 c13889 : c7540M27863.m20249()) {
                                if (C5584.m15861(c13889, j)) {
                                    c0644.f2492.add(c11258);
                                    z3 = true;
                                    break;
                                }
                            }
                            if (!z3) {
                                for (C13889 c138810 : c7540M27863.m20254()) {
                                    if (C5584.m15861(c138810, j)) {
                                        c0644.f2492.add(c11258);
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
            c0644 = new C0644();
            c0644.f2494 = str2;
            String lowerCase = str.toLowerCase();
            for (C11258 c11259 : collectionValues) {
                C7540 c7540M27864 = c11259.m27863();
                if (c7540M27864 != null) {
                    C23062[] c23062ArrM20251 = c7540M27864.m20250();
                    AbstractC16404[] abstractC16404Arr2 = c11259.m27861().m32314().f19421;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= abstractC16404Arr2.length) {
                            z2 = false;
                            break;
                        }
                        C23062 c23063 = c23062ArrM20251[i4];
                        if (c23063.m51223() && c23063.m51222() && c23063.f74187.f57397.m50835().equals("Ljava/lang/String;") && (abstractC16405 = abstractC16404Arr2[i4]) != null && abstractC16405.mo5435() == EnumC3705.VALUE_STRING && ((C15698) abstractC16405).f48387.m28273().toLowerCase().contains(lowerCase)) {
                            c0644.f2492.add(c11259);
                            z2 = true;
                            break;
                        }
                        i4++;
                    }
                    if (!z2) {
                        for (C13889 c138811 : c7540M27864.m20249()) {
                            if (C5584.m15862(c138811, lowerCase)) {
                                c0644.f2492.add(c11259);
                                z2 = true;
                                break;
                            }
                        }
                        if (!z2) {
                            for (C13889 c138812 : c7540M27864.m20254()) {
                                if (C5584.m15862(c138812, lowerCase)) {
                                    c0644.f2492.add(c11259);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        activityC21107.f68093.f56846.push(c0644);
        activityC21107.f68093.f56833 = activityC21107.f68093.m42621();
    }

    @Override // l.AbstractC12889
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo17648() {
        ActivityC21107 activityC21107 = this.f19672;
        activityC21107.setTitle(((C0644) activityC21107.f68093.f56846.peek()).f2494);
        activityC21107.m48049(EnumC6995.SEARCH_RESULT_CLASS);
    }
}
