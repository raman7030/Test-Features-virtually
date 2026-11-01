package p067l;

/* JADX INFO: renamed from: l.֫᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4337 {
    /* JADX INFO: renamed from: ֫ */
    public abstract int mo8937();

    /* JADX INFO: renamed from: ֫ */
    public void mo8938(C18418 c18418) {
        int iMo8937 = mo8937();
        c18418.f55019.m37500(iMo8937);
        if (c18418.f55021) {
            System.out.print(" frame_type=" + iMo8937);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX INFO: renamed from: ֫ */
    public static int m8936(AbstractC6462[] abstractC6462Arr, AbstractC6462[] abstractC6462Arr2, C8374 c8374) {
        int length = abstractC6462Arr.length - abstractC6462Arr2.length;
        if (length > 4 || length < -4) {
            return Integer.MAX_VALUE;
        }
        int length2 = length > 0 ? abstractC6462Arr2.length : abstractC6462Arr.length;
        for (int i = 0; i < length2; i++) {
            AbstractC6462 abstractC6462 = abstractC6462Arr[i];
            AbstractC6462 abstractC6463 = abstractC6462Arr2[i];
            boolean zM19490 = true;
            if (abstractC6462 == null) {
                if (abstractC6463 != null) {
                    zM19490 = false;
                }
            } else if (abstractC6463 == null) {
                zM19490 = false;
            } else {
                EnumC11353 enumC11353Mo5577 = abstractC6462.mo5577();
                EnumC11353 enumC11353 = EnumC11353.INT;
                if ((!enumC11353Mo5577.m26307(enumC11353) && !abstractC6462.m14777(EnumC11353.BOOLEAN)) || (!abstractC6463.mo5577().m26307(enumC11353) && !abstractC6463.m14777(EnumC11353.BOOLEAN))) {
                    EnumC11353 enumC11354 = EnumC11353.UNINITIALIZED_THIS;
                    if (abstractC6462.m14777(enumC11354)) {
                        zM19490 = abstractC6463.m14777(enumC11354);
                    } else {
                        EnumC11353 enumC11355 = EnumC11353.UNINITIALIZED_OBJECT;
                        if (abstractC6462.m14777(enumC11355)) {
                            if (!abstractC6463.m14777(enumC11355) || ((C18083) abstractC6462).f53992 != ((C18083) abstractC6463).f53992) {
                                zM19490 = false;
                            }
                        } else if (abstractC6463.m14777(enumC11354) || abstractC6463.m14777(enumC11355)) {
                            zM19490 = false;
                        } else {
                            zM19490 = c8374.m19490(abstractC6462, abstractC6463);
                        }
                    }
                }
            }
            if (!zM19490) {
                return Integer.MAX_VALUE;
            }
        }
        return length;
    }
}
