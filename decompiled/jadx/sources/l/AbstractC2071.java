package l;

/* JADX INFO: renamed from: l.֫᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2071 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo6811();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo6812(C16887 c16887) {
        int iMo6811 = mo6811();
        c16887.f51838.m35348(iMo6811);
        if (c16887.f51840) {
            System.out.print(" frame_type=" + iMo6811);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m6810(AbstractC4308[] abstractC4308Arr, AbstractC4308[] abstractC4308Arr2, C6319 c6319) {
        int length = abstractC4308Arr.length - abstractC4308Arr2.length;
        if (length > 4 || length < -4) {
            return Integer.MAX_VALUE;
        }
        int length2 = length > 0 ? abstractC4308Arr2.length : abstractC4308Arr.length;
        for (int i = 0; i < length2; i++) {
            AbstractC4308 abstractC4308 = abstractC4308Arr[i];
            AbstractC4308 abstractC4309 = abstractC4308Arr2[i];
            boolean zM17550 = true;
            if (abstractC4308 == null) {
                if (abstractC4309 != null) {
                    zM17550 = false;
                }
            } else if (abstractC4309 == null) {
                zM17550 = false;
            } else {
                EnumC9454 enumC9454Mo3258 = abstractC4308.mo3258();
                EnumC9454 enumC9454 = EnumC9454.INT;
                if ((!enumC9454Mo3258.m24297(enumC9454) && !abstractC4308.m12913(EnumC9454.BOOLEAN)) || (!abstractC4309.mo3258().m24297(enumC9454) && !abstractC4309.m12913(EnumC9454.BOOLEAN))) {
                    EnumC9454 enumC9455 = EnumC9454.UNINITIALIZED_THIS;
                    if (abstractC4308.m12913(enumC9455)) {
                        zM17550 = abstractC4309.m12913(enumC9455);
                    } else {
                        EnumC9454 enumC9456 = EnumC9454.UNINITIALIZED_OBJECT;
                        if (abstractC4308.m12913(enumC9456)) {
                            if (!abstractC4309.m12913(enumC9456) || ((C16535) abstractC4308).f50813 != ((C16535) abstractC4309).f50813) {
                                zM17550 = false;
                            }
                        } else if (abstractC4309.m12913(enumC9455) || abstractC4309.m12913(enumC9456)) {
                            zM17550 = false;
                        } else {
                            zM17550 = c6319.m17550(abstractC4308, abstractC4309);
                        }
                    }
                }
            }
            if (!zM17550) {
                return Integer.MAX_VALUE;
            }
        }
        return length;
    }
}
