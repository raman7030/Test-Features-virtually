package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֫ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3951 extends AbstractC18877 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ ActivityC8645 f8615;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3951(ActivityC8645 activityC8645, ActivityC8645 activityC8646, boolean z) {
        super(activityC8646, z);
        this.f8615 = activityC8645;
    }

    @Override // p067l.AbstractC18877
    /* JADX INFO: renamed from: ֫ */
    public final void mo7882(C19548 c19548, String str) {
        int[] iArr = C13812.f39037;
        ActivityC8645 activityC8645 = this.f8615;
        int i = iArr[activityC8645.f23213.m54402().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            activityC8645.f23213.getClass();
            C24738 c24738 = activityC8645.f23213;
            c24738.f78326 = true;
            if (c24738.f78317.length < c24738.f78312.mo31471()) {
                C24738 c24739 = activityC8645.f23213;
                c24739.f78317 = new int[c24739.f78312.mo31471()];
            }
            activityC8645.f23213.f78310 = 0;
            for (int i2 = 0; i2 < activityC8645.f23213.f78312.mo31471(); i2++) {
                C6925 value = activityC8645.f23213.f78312.getValue(i2);
                String strM46276 = C20518.m46276(activityC8645.f23213.f78313, value.mo7247(), value.getValue(), null);
                if (strM46276 != null && c19548.m44389(strM46276)) {
                    C24738 c247310 = activityC8645.f23213;
                    int[] iArr2 = c247310.f78317;
                    int i3 = c247310.f78310;
                    c247310.f78310 = i3 + 1;
                    iArr2[i3] = i2;
                } else if (c19548.m44389(activityC8645.f23213.f78315.m32844(value.mo7249()))) {
                    C24738 c247311 = activityC8645.f23213;
                    int[] iArr3 = c247311.f78317;
                    int i4 = c247311.f78310;
                    c247311.f78310 = i4 + 1;
                    iArr3[i4] = i2;
                }
            }
        } else if (i == 4) {
            C24738 c247312 = activityC8645.f23213;
            c247312.f78329 = str;
            c247312.f78334 = true;
            if (c247312.f78328.length < c247312.f78313.size()) {
                C24738 c247313 = activityC8645.f23213;
                c247313.f78328 = new int[c247313.f78313.size()];
            }
            C24738 c247314 = activityC8645.f23213;
            c247314.f78330 = 0;
            int size = c247314.f78313.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (c19548.m44389(activityC8645.f23213.f78313.m50188(i5))) {
                    C24738 c247315 = activityC8645.f23213;
                    int[] iArr4 = c247315.f78328;
                    int i6 = c247315.f78330;
                    c247315.f78330 = i6 + 1;
                    iArr4[i6] = i5;
                }
            }
        } else if (i == 5) {
            C24738 c247316 = activityC8645.f23213;
            c247316.f78329 = str;
            c247316.f78334 = true;
            if (c247316.f78328.length < c247316.f78325.size()) {
                C24738 c247317 = activityC8645.f23213;
                c247317.f78328 = new int[c247317.f78325.size()];
            }
            activityC8645.f23213.f78330 = 0;
            for (int i7 = 0; i7 < activityC8645.f23213.f78325.size(); i7++) {
                C20337 c20337 = (C20337) activityC8645.f23213.f78325.get(i7);
                if (c19548.m44389(c20337.mo31468())) {
                    C24738 c247318 = activityC8645.f23213;
                    int[] iArr5 = c247318.f78328;
                    int i8 = c247318.f78330;
                    c247318.f78330 = i8 + 1;
                    iArr5[i8] = i7;
                } else if (c19548.m44389(String.format("%04X", Integer.valueOf(c20337.mo50213())))) {
                    C24738 c247319 = activityC8645.f23213;
                    int[] iArr6 = c247319.f78328;
                    int i9 = c247319.f78330;
                    c247319.f78330 = i9 + 1;
                    iArr6[i9] = i7;
                } else if (!activityC8645.f23213.f78320.getTypeName().equals("id")) {
                    if (c20337.mo31474() && activityC8645.f23213.f78320.getTypeName().equals("style") && c20337.getParent() != 0 && c19548.m44389(activityC8645.f23213.f78315.m32844(c20337.getParent()))) {
                        C24738 c247320 = activityC8645.f23213;
                        int[] iArr7 = c247320.f78328;
                        int i10 = c247320.f78330;
                        c247320.f78330 = i10 + 1;
                        iArr7[i10] = i7;
                    } else {
                        for (int i11 = 0; i11 < c20337.mo31471(); i11++) {
                            C6925 value2 = c20337.getValue(i11);
                            String strM46277 = C20518.m46276(activityC8645.f23213.f78313, value2.mo7247(), value2.getValue(), null);
                            if (strM46277 != null && c19548.m44389(strM46277)) {
                                C24738 c247321 = activityC8645.f23213;
                                int[] iArr8 = c247321.f78328;
                                int i12 = c247321.f78330;
                                c247321.f78330 = i12 + 1;
                                iArr8[i12] = i7;
                                break;
                            }
                        }
                    }
                }
            }
        }
        activityC8645.setTitle(activityC8645.getString(R.string.MT_Protector, str));
        activityC8645.f23216.notifyDataSetChanged();
    }

    @Override // p067l.AbstractC18877
    /* JADX INFO: renamed from: ֫ */
    public final void mo7881() {
        int[] iArr = C13812.f39037;
        ActivityC8645 activityC8645 = this.f8615;
        int i = iArr[activityC8645.f23213.m54402().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            C24738 c24738 = activityC8645.f23213;
            c24738.f78326 = false;
            activityC8645.setTitle(c24738.f78312.mo31468());
        } else if (i == 4) {
            activityC8645.f23213.f78334 = false;
            activityC8645.m12277(R.string.MT_Protector);
        } else if (i == 5) {
            C24738 c24739 = activityC8645.f23213;
            c24739.f78334 = false;
            activityC8645.setTitle(c24739.f78314.mo20694());
        }
        activityC8645.f23216.notifyDataSetChanged();
    }
}
