package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H4NZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3422 implements InterfaceC20568 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f6814;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f6815;

    /* JADX INFO: renamed from: ܽ */
    public int f6816;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f6817;

    public C3422(InterfaceC20568 interfaceC20568) {
        AbstractC19516 c14821;
        this.f6815 = C9468.m21991(new C17503(null, 0, 0));
        this.f6817 = new ArrayList();
        this.f6814 = true;
        this.f6816 = interfaceC20568.mo6075();
        Iterator it = interfaceC20568.mo6074().iterator();
        int iMo6216 = 0;
        int i = 0;
        while (it.hasNext()) {
            iMo6216 += ((InterfaceC23920) it.next()).mo6216();
            i++;
            this.f6815.add(new C17503(null, iMo6216, i));
        }
        int[] iArr = new int[iMo6216 + 1];
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < this.f6815.size(); i2++) {
            iArr[((C17503) this.f6815.get(i2)).f52332] = i2;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (InterfaceC23920 interfaceC23920 : interfaceC20568.mo6074()) {
            C17503 c17503 = (C17503) this.f6815.get(i3);
            EnumC3167 enumC3167Mo6217 = interfaceC23920.mo6217();
            if (enumC3167Mo6217 == EnumC3167.f6043 || enumC3167Mo6217 == EnumC3167.f5900) {
                arrayList.add(new C4764(this, c17503, iArr, interfaceC23920));
            } else {
                m6056(c17503, iArr, interfaceC23920);
            }
            i3++;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC7446) it2.next()).perform();
        }
        for (InterfaceC9838 interfaceC9838 : interfaceC20568.mo6069()) {
            C17503 c17504 = (C17503) this.f6815.get(m6053(interfaceC9838.mo16884(), iArr));
            switch (interfaceC9838.mo10470()) {
                case 3:
                    InterfaceC5145 interfaceC5145 = (InterfaceC5145) interfaceC9838;
                    c14821 = new C14821(interfaceC5145.mo10988(), interfaceC5145.mo10991(), interfaceC5145.mo10989(), interfaceC5145.mo10990());
                    break;
                case 4:
                default:
                    throw new C17034(null, "Invalid debug item type: " + interfaceC9838.mo10470(), new Object[0]);
                case 5:
                    c14821 = new C16832(((InterfaceC16543) interfaceC9838).mo25235());
                    break;
                case 6:
                    c14821 = new C6775(((InterfaceC21239) interfaceC9838).mo14222());
                    break;
                case 7:
                    c14821 = new C21528();
                    break;
                case 8:
                    c14821 = new C22869();
                    break;
                case 9:
                    c14821 = new C5434(((InterfaceC6486) interfaceC9838).mo11945());
                    break;
                case 10:
                    c14821 = new C23539(((InterfaceC22580) interfaceC9838).getLineNumber());
                    break;
            }
            ((C8787) c17504.m39877()).add(c14821);
            c14821.f59438 = c17504;
        }
        for (InterfaceC7156 interfaceC7156 : interfaceC20568.mo6068()) {
            C18845 c18845M6058 = m6058(interfaceC7156.mo16459(), iArr);
            C18845 c18845M6059 = m6058(interfaceC7156.mo16461() + interfaceC7156.mo16459(), iArr);
            for (InterfaceC4474 interfaceC4474 : interfaceC7156.mo16460()) {
                this.f6817.add(new C18174(c18845M6058, c18845M6059, interfaceC4474.mo9475(), m6058(interfaceC4474.mo9474(), iArr)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m6059() {
        boolean z;
        HashSet hashSet = new HashSet();
        ArrayList<C17503> arrayList = this.f6815;
        for (C17503 c17503 : arrayList) {
            AbstractC9476 abstractC9476 = c17503.f52337;
            if (abstractC9476 != null) {
                EnumC3167 enumC3167 = abstractC9476.f25973;
                int i = C20858.f65548[enumC3167.ordinal()];
                if (i == 1 || i == 2) {
                    C17503 c17503M42918 = ((AbstractC4093) abstractC9476).f9021.m42918();
                    AbstractC9476 abstractC9477 = c17503M42918.f52337;
                    if (abstractC9477 == null) {
                        throw new IllegalStateException(String.format("Switch instruction at address/index 0x%x/%d points to the end of the method.", Integer.valueOf(c17503.f52332), Integer.valueOf(c17503.f52335)));
                    }
                    if (abstractC9477.f25973 == EnumC3167.f5839) {
                        int i2 = c17503M42918.f52335 + 1;
                        while (true) {
                            if (i2 >= arrayList.size() - 1) {
                                abstractC9477 = null;
                                break;
                            }
                            AbstractC9476 abstractC9478 = ((C17503) arrayList.get(i2)).f52337;
                            if (abstractC9478.f25973 != EnumC3167.f5839) {
                                abstractC9477 = abstractC9478;
                                break;
                            }
                            i2++;
                        }
                    }
                    if (abstractC9477 != null) {
                        EnumC3167 enumC3168 = abstractC9477.f25973;
                        if (abstractC9477 instanceof AbstractC12811) {
                            if ((enumC3167 == EnumC3167.f6067 && enumC3168 != EnumC3167.f6043) || (enumC3167 == EnumC3167.f5975 && enumC3168 != EnumC3167.f5900)) {
                                throw new IllegalStateException(String.format("Switch instruction at address/index 0x%x/%d refers to the wrong type of payload instruction.", Integer.valueOf(c17503.f52332), Integer.valueOf(c17503.f52335)));
                            }
                            if (!hashSet.add(c17503M42918)) {
                                throw new IllegalStateException("Multiple switch instructions refer to the same payload. This is not currently supported. Please file a bug :)");
                            }
                            ((AbstractC12811) abstractC9477).f36044 = c17503;
                        }
                    }
                    throw new IllegalStateException(String.format("Switch instruction at address/index 0x%x/%d does not refer to a payload instruction.", Integer.valueOf(c17503.f52332), Integer.valueOf(c17503.f52335)));
                }
            }
        }
        do {
            int i3 = 0;
            z = false;
            while (i3 < arrayList.size()) {
                C17503 c17504 = (C17503) arrayList.get(i3);
                AbstractC9476 abstractC9479 = c17504.f52337;
                if (abstractC9479 != null) {
                    int i4 = C20858.f65548[abstractC9479.f25973.ordinal()];
                    if (i4 == 3) {
                        AbstractC4093 abstractC4093 = (AbstractC4093) abstractC9479;
                        C18845 c18845 = abstractC4093.f9021;
                        int i5 = c18845.m42918().f52332 - abstractC4093.m22075().f52332;
                        if (i5 < -128 || i5 > 127) {
                            m6071(c17504.f52335, (i5 < -32768 || i5 > 32767) ? new C6047(EnumC3167.f5980, c18845) : new C4035(EnumC3167.f6012, c18845));
                            z = true;
                        }
                    } else if (i4 != 4) {
                        if (i4 == 5 || i4 == 6) {
                            if (((AbstractC12811) abstractC9479).f36044 == null) {
                                m6070(i3);
                            }
                            i3--;
                            z = true;
                        } else if (i4 != 7) {
                        }
                        if ((c17504.f52332 & 1) != 0) {
                            int i6 = c17504.f52335 - 1;
                            EnumC3167 enumC3169 = ((C17503) arrayList.get(i6)).f52337.f25973;
                            EnumC3167 enumC31610 = EnumC3167.f5839;
                            if (enumC3169 == enumC31610) {
                                m6070(i6);
                                i3--;
                            } else {
                                m6064(c17504.f52335, new C8116(enumC31610));
                                i3++;
                            }
                            z = true;
                        }
                    } else {
                        AbstractC4093 abstractC4094 = (AbstractC4093) abstractC9479;
                        C18845 c18846 = abstractC4094.f9021;
                        int i7 = c18846.m42918().f52332 - abstractC4094.m22075().f52332;
                        if (i7 < -32768 || i7 > 32767) {
                            m6071(c17504.f52335, new C6047(EnumC3167.f5980, c18846));
                            z = true;
                        }
                    }
                }
                i3++;
            }
        } while (z);
        this.f6814 = false;
    }

    public C3422(int i) {
        this.f6815 = C9468.m21991(new C17503(null, 0, 0));
        this.f6817 = new ArrayList();
        this.f6814 = true;
        this.f6816 = i;
    }

    @Override // p067l.InterfaceC20568
    /* JADX INFO: renamed from: ᩻ */
    public final int mo6075() {
        return this.f6816;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m6073(int i) {
        this.f6816 = i;
    }

    @Override // p067l.InterfaceC20568
    /* JADX INFO: renamed from: ᩷ */
    public final List mo6074() {
        if (this.f6814) {
            m6059();
        }
        return new C6105(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6063(int i, AbstractC8135 abstractC8135) {
        if (this.f6814) {
            m6059();
        }
        ((C8787) ((C17503) this.f6815.get(i)).m39877()).add(abstractC8135);
    }

    @Override // p067l.InterfaceC20568
    /* JADX INFO: renamed from: ۜ */
    public final List mo6068() {
        if (this.f6814) {
            m6059();
        }
        return C21562.unmodifiableList(this.f6817);
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m6061() {
        if (this.f6814) {
            m6059();
        }
        return this.f6817;
    }

    @Override // p067l.InterfaceC20568
    /* JADX INFO: renamed from: ۢ */
    public final Iterable mo6069() {
        if (this.f6814) {
            m6059();
        }
        return C10810.m24918(C10810.m24920(this.f6815, new C20187(this)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6067(C24787 c24787, C18845 c18845, C18845 c18846, C18845 c18847) {
        this.f6817.add(new C18174(c18845, c18846, c24787, c18847));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6066(C18845 c18845, C18845 c18846, C18845 c18847) {
        this.f6817.add(new C18174(c18845, c18846, c18847));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6064(int i, AbstractC9476 abstractC9476) {
        ArrayList arrayList = this.f6815;
        if (i >= arrayList.size()) {
            throw new IndexOutOfBoundsException();
        }
        if (i != arrayList.size() - 1) {
            int i2 = ((C17503) arrayList.get(i)).f52332;
            C17503 c17503 = new C17503(abstractC9476, i2, i);
            arrayList.add(i, c17503);
            abstractC9476.f25972 = c17503;
            int iMo6216 = abstractC9476.mo6216() + i2;
            for (int i3 = i + 1; i3 < arrayList.size(); i3++) {
                C17503 c17504 = (C17503) arrayList.get(i3);
                c17504.f52335++;
                c17504.f52332 = iMo6216;
                AbstractC9476 abstractC9477 = c17504.f52337;
                if (abstractC9477 != null) {
                    iMo6216 = abstractC9477.mo6216() + iMo6216;
                }
            }
            this.f6814 = true;
            return;
        }
        m6065(abstractC9476);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6065(AbstractC9476 abstractC9476) {
        ArrayList arrayList = this.f6815;
        C17503 c17503 = (C17503) C20013.m45383(arrayList, 1);
        c17503.f52337 = abstractC9476;
        abstractC9476.f25972 = c17503;
        arrayList.add(new C17503(null, abstractC9476.mo6216() + c17503.f52332, arrayList.size()));
        this.f6814 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m6071(int i, AbstractC9476 abstractC9476) {
        ArrayList arrayList = this.f6815;
        if (i >= arrayList.size() - 1) {
            throw new IndexOutOfBoundsException();
        }
        C17503 c17503 = (C17503) arrayList.get(i);
        abstractC9476.f25972 = c17503;
        c17503.f52337.f25972 = null;
        c17503.f52337 = abstractC9476;
        int iMo6216 = abstractC9476.mo6216() + c17503.f52332;
        for (int i2 = i + 1; i2 < arrayList.size(); i2++) {
            C17503 c17504 = (C17503) arrayList.get(i2);
            c17504.f52332 = iMo6216;
            AbstractC9476 abstractC9477 = c17504.f52337;
            if (abstractC9477 != null) {
                iMo6216 = abstractC9477.mo6216() + iMo6216;
            }
        }
        this.f6814 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m6072(AbstractC9476 abstractC9476) {
        if (abstractC9476.m22075().f52337 == abstractC9476) {
            m6070(abstractC9476.m22075().f52335);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m6070(int i) {
        ArrayList arrayList = this.f6815;
        if (i >= arrayList.size() - 1) {
            throw new IndexOutOfBoundsException();
        }
        C17503 c17503 = (C17503) arrayList.get(i);
        c17503.f52337 = null;
        c17503.m39875((C17503) arrayList.get(i + 1));
        arrayList.remove(i);
        int iMo6216 = c17503.f52332;
        while (i < arrayList.size()) {
            C17503 c17504 = (C17503) arrayList.get(i);
            c17504.f52335 = i;
            c17504.f52332 = iMo6216;
            AbstractC9476 abstractC9476 = c17504.f52337;
            if (abstractC9476 != null) {
                iMo6216 = abstractC9476.mo6216() + iMo6216;
            }
            i++;
        }
        this.f6814 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m6053(int i, int[] iArr) {
        while (true) {
            if (i >= iArr.length) {
                i = iArr.length - 1;
            }
            int i2 = iArr[i];
            if (i2 >= 0) {
                return i2;
            }
            i--;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18845 m6062(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.f6815;
            if (i < arrayList.size()) {
                C17503 c17503 = (C17503) arrayList.get(i);
                c17503.getClass();
                C18845 c18845 = new C18845();
                ((C8787) c17503.m39880()).add(c18845);
                return c18845;
            }
        }
        throw new IndexOutOfBoundsException(String.format("instruction index %d out of bounds", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: ۧ */
    private C18845 m6058(int i, int[] iArr) {
        C17503 c17503 = (C17503) this.f6815.get(m6053(i, iArr));
        c17503.getClass();
        C18845 c18845 = new C18845();
        ((C8787) c17503.m39880()).add(c18845);
        return c18845;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m6056(C17503 c17503, int[] iArr, InterfaceC23920 interfaceC23920) {
        C18845 c18845M6058;
        C14093 c14093;
        C8058 c8058;
        switch (C20858.f65547[interfaceC23920.mo6217().f6090.ordinal()]) {
            case 1:
                InterfaceC17469 interfaceC17469 = (InterfaceC17469) interfaceC23920;
                C12140 c12140 = new C12140(interfaceC17469.mo6217(), m6058(interfaceC17469.mo5147() + c17503.f52332, iArr));
                c17503.f52337 = c12140;
                c12140.f25972 = c17503;
                return;
            case 2:
                C8116 c8116 = new C8116(((InterfaceC4730) interfaceC23920).mo6217());
                c17503.f52337 = c8116;
                c8116.f25972 = c17503;
                return;
            case 3:
                InterfaceC6071 interfaceC6071 = (InterfaceC6071) interfaceC23920;
                C13481 c13481 = new C13481(interfaceC6071.mo6217(), interfaceC6071.mo4189(), interfaceC6071.mo7161());
                c17503.f52337 = c13481;
                c13481.f25972 = c17503;
                return;
            case 4:
                InterfaceC20153 interfaceC20153 = (InterfaceC20153) interfaceC23920;
                C24209 c24209 = new C24209(interfaceC20153.mo4189(), interfaceC20153.mo6217());
                c17503.f52337 = c24209;
                c24209.f25972 = c17503;
                return;
            case 5:
                InterfaceC20824 interfaceC20824 = (InterfaceC20824) interfaceC23920;
                C15491 c15491 = new C15491(interfaceC20824.mo6217(), interfaceC20824.mo4189(), interfaceC20824.mo9978());
                c17503.f52337 = c15491;
                c15491.f25972 = c17503;
                return;
            case 6:
                InterfaceC2717 interfaceC2717 = (InterfaceC2717) interfaceC23920;
                C9457 c9457 = new C9457(interfaceC2717.mo6217(), interfaceC2717.mo4220(), interfaceC2717.getReference());
                c17503.f52337 = c9457;
                c9457.f25972 = c17503;
                return;
            case 7:
                InterfaceC7412 interfaceC7412 = (InterfaceC7412) interfaceC23920;
                C4035 c4035 = new C4035(interfaceC7412.mo6217(), m6058(interfaceC7412.mo5147() + c17503.f52332, iArr));
                c17503.f52337 = c4035;
                c4035.f25972 = c17503;
                return;
            case 8:
                InterfaceC3388 interfaceC3388 = (InterfaceC3388) interfaceC23920;
                C12753 c12753 = new C12753(interfaceC3388.mo6217(), interfaceC3388.mo4189(), interfaceC3388.getReference());
                c17503.f52337 = c12753;
                c12753.f25972 = c17503;
                return;
            case 9:
                InterfaceC10094 interfaceC10094 = (InterfaceC10094) interfaceC23920;
                C18116 c18116 = new C18116(interfaceC10094.mo6217(), interfaceC10094.mo4189(), interfaceC10094.mo7161());
                c17503.f52337 = c18116;
                c18116.f25972 = c17503;
                return;
            case 10:
                InterfaceC16798 interfaceC16798 = (InterfaceC16798) interfaceC23920;
                C19458 c19458 = new C19458(interfaceC16798.mo6217(), interfaceC16798.mo4189(), interfaceC16798.mo7162());
                c17503.f52337 = c19458;
                c19458.f25972 = c17503;
                return;
            case 11:
                InterfaceC22835 interfaceC22835 = (InterfaceC22835) interfaceC23920;
                C18787 c18787 = new C18787(interfaceC22835.mo6217(), interfaceC22835.mo4189(), interfaceC22835.mo7161());
                c17503.f52337 = c18787;
                c18787.f25972 = c17503;
                return;
            case 12:
                InterfaceC23505 interfaceC23505 = (InterfaceC23505) interfaceC23920;
                C16104 c16104 = new C16104(interfaceC23505.mo6217(), interfaceC23505.mo4189(), m6058(interfaceC23505.mo5147() + c17503.f52332, iArr));
                c17503.f52337 = c16104;
                c16104.f25972 = c17503;
                return;
            case 13:
                InterfaceC21494 interfaceC21494 = (InterfaceC21494) interfaceC23920;
                C24822 c24822 = new C24822(interfaceC21494.mo4189(), interfaceC21494.mo9978(), interfaceC21494.mo7161(), interfaceC21494.mo6217());
                c17503.f52337 = c24822;
                c24822.f25972 = c17503;
                return;
            case 14:
                InterfaceC6741 interfaceC6741 = (InterfaceC6741) interfaceC23920;
                C8729 c8729 = new C8729(interfaceC6741.mo6217(), interfaceC6741.mo4189(), interfaceC6741.mo9978(), interfaceC6741.getReference());
                c17503.f52337 = c8729;
                c8729.f25972 = c17503;
                return;
            case 15:
                InterfaceC5400 interfaceC5400 = (InterfaceC5400) interfaceC23920;
                C22141 c22141 = new C22141(interfaceC5400.mo4189(), interfaceC5400.mo9978(), interfaceC5400.mo16292(), interfaceC5400.mo6217());
                c17503.f52337 = c22141;
                c22141.f25972 = c17503;
                return;
            case 16:
                InterfaceC14787 interfaceC14787 = (InterfaceC14787) interfaceC23920;
                C11412 c11412 = new C11412(interfaceC14787.mo4189(), interfaceC14787.mo9978(), interfaceC14787.mo7161(), interfaceC14787.mo6217());
                c17503.f52337 = c11412;
                c11412.f25972 = c17503;
                return;
            case 17:
                InterfaceC14117 interfaceC14117 = (InterfaceC14117) interfaceC23920;
                C10741 c10741 = new C10741(interfaceC14117.mo6217(), interfaceC14117.mo4189(), interfaceC14117.mo9978(), m6058(interfaceC14117.mo5147() + c17503.f52332, iArr));
                c17503.f52337 = c10741;
                c10741.f25972 = c17503;
                return;
            case 18:
                InterfaceC12106 interfaceC12106 = (InterfaceC12106) interfaceC23920;
                C17445 c17445 = new C17445(interfaceC12106.mo6217(), interfaceC12106.mo4189(), interfaceC12106.mo9978());
                c17503.f52337 = c17445;
                c17445.f25972 = c17503;
                return;
            case 19:
                InterfaceC8082 interfaceC8082 = (InterfaceC8082) interfaceC23920;
                C4706 c4706 = new C4706(interfaceC8082.mo4189(), interfaceC8082.mo9978(), interfaceC8082.mo9979(), interfaceC8082.mo6217());
                c17503.f52337 = c4706;
                c4706.f25972 = c17503;
                return;
            case 20:
                InterfaceC13447 interfaceC13447 = (InterfaceC13447) interfaceC23920;
                C6047 c6047 = new C6047(interfaceC13447.mo6217(), m6058(interfaceC13447.mo5147() + c17503.f52332, iArr));
                c17503.f52337 = c6047;
                c6047.f25972 = c17503;
                return;
            case 21:
                InterfaceC24175 interfaceC24175 = (InterfaceC24175) interfaceC23920;
                C20129 c20129 = new C20129(interfaceC24175.mo6217(), interfaceC24175.mo4189(), interfaceC24175.getReference());
                c17503.f52337 = c20129;
                c20129.f25972 = c17503;
                return;
            case 22:
                InterfaceC15457 interfaceC15457 = (InterfaceC15457) interfaceC23920;
                C20800 c20800 = new C20800(interfaceC15457.mo6217(), interfaceC15457.mo4189(), interfaceC15457.mo7161());
                c17503.f52337 = c20800;
                c20800.f25972 = c17503;
                return;
            case 23:
                InterfaceC9423 interfaceC9423 = (InterfaceC9423) interfaceC23920;
                int i = c17503.f52332;
                if (interfaceC9423.mo6217() != EnumC3167.f5895) {
                    C17503 c17504 = (C17503) this.f6815.get(m6053(interfaceC9423.mo5147() + i, iArr));
                    C2751 c2751 = new C2751();
                    c2751.f4635 = c17503;
                    ((C8787) c17504.m39880()).add(c2751);
                    c18845M6058 = c2751;
                } else {
                    c18845M6058 = m6058(interfaceC9423.mo5147() + i, iArr);
                }
                C2693 c2693 = new C2693(interfaceC9423.mo6217(), interfaceC9423.mo4189(), c18845M6058);
                c17503.f52337 = c2693;
                c2693.f25972 = c17503;
                return;
            case 24:
                InterfaceC4215 interfaceC4215 = (InterfaceC4215) interfaceC23920;
                C7388 c7388 = new C7388(interfaceC4215.mo6217(), interfaceC4215.mo4189(), interfaceC4215.mo9978());
                c17503.f52337 = c7388;
                c7388.f25972 = c17503;
                return;
            case 25:
                InterfaceC12933 interfaceC12933 = (InterfaceC12933) interfaceC23920;
                C3364 c3364 = new C3364(interfaceC12933.mo6217(), interfaceC12933.mo5886(), interfaceC12933.mo5885(), interfaceC12933.mo5883(), interfaceC12933.mo5882(), interfaceC12933.mo5884(), interfaceC12933.mo5881(), interfaceC12933.getReference());
                c17503.f52337 = c3364;
                c3364.f25972 = c17503;
                return;
            case 26:
                InterfaceC18296 interfaceC18296 = (InterfaceC18296) interfaceC23920;
                C10070 c10070 = new C10070(interfaceC18296.mo6217(), interfaceC18296.mo5886(), interfaceC18296.mo5885(), interfaceC18296.mo5883(), interfaceC18296.mo5882(), interfaceC18296.mo5884(), interfaceC18296.mo5881(), interfaceC18296.mo23505());
                c17503.f52337 = c10070;
                c10070.f25972 = c17503;
                return;
            case 27:
                InterfaceC19638 interfaceC19638 = (InterfaceC19638) interfaceC23920;
                C16774 c16774 = new C16774(interfaceC19638.mo6217(), interfaceC19638.mo5886(), interfaceC19638.mo5885(), interfaceC19638.mo5883(), interfaceC19638.mo5882(), interfaceC19638.mo5884(), interfaceC19638.mo5881(), interfaceC19638.mo36892());
                c17503.f52337 = c16774;
                c16774.f25972 = c17503;
                return;
            case 28:
                InterfaceC18967 interfaceC18967 = (InterfaceC18967) interfaceC23920;
                C22811 c22811 = new C22811(interfaceC18967.mo6217(), interfaceC18967.mo11756(), interfaceC18967.mo5886(), interfaceC18967.getReference());
                c17503.f52337 = c22811;
                c22811.f25972 = c17503;
                return;
            case 29:
                InterfaceC16284 interfaceC16284 = (InterfaceC16284) interfaceC23920;
                C23481 c23481 = new C23481(interfaceC16284.mo11756(), interfaceC16284.mo5886(), interfaceC16284.mo23505(), interfaceC16284.mo6217());
                c17503.f52337 = c23481;
                c23481.f25972 = c17503;
                return;
            case 30:
                InterfaceC25002 interfaceC25002 = (InterfaceC25002) interfaceC23920;
                C21470 c21470 = new C21470(interfaceC25002.mo11756(), interfaceC25002.mo5886(), interfaceC25002.mo36892(), interfaceC25002.mo6217());
                c17503.f52337 = c21470;
                c21470.f25972 = c17503;
                return;
            case 31:
                InterfaceC8909 interfaceC8909 = (InterfaceC8909) interfaceC23920;
                C6717 c6717 = new C6717(interfaceC8909.mo6217(), interfaceC8909.mo5886(), interfaceC8909.mo5885(), interfaceC8909.mo5883(), interfaceC8909.mo5882(), interfaceC8909.mo5884(), interfaceC8909.mo5881(), interfaceC8909.getReference(), interfaceC8909.mo11754());
                c17503.f52337 = c6717;
                c6717.f25972 = c17503;
                return;
            case 32:
                InterfaceC22321 interfaceC22321 = (InterfaceC22321) interfaceC23920;
                C5376 c5376 = new C5376(interfaceC22321.mo6217(), interfaceC22321.mo11756(), interfaceC22321.mo5886(), interfaceC22321.getReference(), interfaceC22321.mo11754());
                c17503.f52337 = c5376;
                c5376.f25972 = c17503;
                return;
            case 33:
                InterfaceC11592 interfaceC11592 = (InterfaceC11592) interfaceC23920;
                C14763 c14763 = new C14763(interfaceC11592.mo6217(), interfaceC11592.mo4189(), interfaceC11592.mo7162());
                c17503.f52337 = c14763;
                c14763.f25972 = c17503;
                return;
            case 34:
                List listMo10139 = ((InterfaceC10921) interfaceC23920).mo10139();
                if (listMo10139.size() == 0) {
                    c14093 = new C14093(null, 0);
                } else {
                    C17503 c17503M6054 = m6054(c17503);
                    int i2 = c17503M6054 == null ? 0 : c17503M6054.f52332;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listMo10139.iterator();
                    while (it.hasNext()) {
                        arrayList.add(m6058(((InterfaceC19482) it.next()).mo13943() + i2, iArr));
                    }
                    c14093 = new C14093(arrayList, ((InterfaceC19482) listMo10139.get(0)).getKey());
                }
                c17503.f52337 = c14093;
                c14093.f25972 = c17503;
                return;
            case 35:
                List<InterfaceC19482> listMo101310 = ((InterfaceC17625) interfaceC23920).mo10139();
                if (listMo101310.size() == 0) {
                    c8058 = new C8058(null);
                } else {
                    C17503 c17503M6055 = m6054(c17503);
                    int i3 = c17503M6055 != null ? c17503M6055.f52332 : 0;
                    ArrayList arrayList2 = new ArrayList();
                    for (InterfaceC19482 interfaceC19482 : listMo101310) {
                        arrayList2.add(new C10128(interfaceC19482.getKey(), m6058(interfaceC19482.mo13943() + i3, iArr)));
                    }
                    c8058 = new C8058(arrayList2);
                }
                c17503.f52337 = c8058;
                c8058.f25972 = c17503;
                return;
            case 36:
                InterfaceC10765 interfaceC10765 = (InterfaceC10765) interfaceC23920;
                C14151 c14151 = new C14151(interfaceC10765.mo21004(), interfaceC10765.mo21003());
                c17503.f52337 = c14151;
                c14151.f25972 = c17503;
                return;
            default:
                throw new C17034(null, "Instruction format %s not supported", interfaceC23920.mo6217().f6090);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C17503 m6054(C17503 c17503) {
        AbstractC9476 abstractC9476;
        C17503 c17504 = null;
        do {
            for (C18845 c18845 : (C8787) c17503.m39880()) {
                if (c18845 instanceof C2751) {
                    if (c17504 != null) {
                        throw new IllegalStateException("Multiple switch instructions refer to the same payload. This is not currently supported. Please file a bug :)");
                    }
                    c17504 = ((C2751) c18845).f4635;
                }
            }
            int i = c17503.f52335;
            if (i == 0) {
                break;
            }
            c17503 = (C17503) this.f6815.get(i - 1);
            abstractC9476 = c17503.f52337;
            if (abstractC9476 == null) {
                break;
            }
        } while (abstractC9476.f25973 == EnumC3167.f5839);
        return c17504;
    }
}
