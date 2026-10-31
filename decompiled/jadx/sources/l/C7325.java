package l;

import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.۟۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18AW */
/* JADX INFO: loaded from: classes2.dex */
public final class C7325 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC11559 f22504;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public AbstractC13921 f22506;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C16340 f22507;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15249 f22508;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C4586 f22510;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f22513;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f22505 = C4925.m14321();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13674 f22511 = new C13674();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashSet f22509 = new HashSet();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f22514 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C0393 f22512 = new C0393();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19676(AbstractC13921 abstractC13921, String[] strArr, String str, InterfaceC11559 interfaceC11559) {
        this.f22506 = abstractC13921;
        this.f22504 = interfaceC11559;
        ArrayList arrayList = this.f22514;
        arrayList.clear();
        this.f22512.m1887();
        boolean z = strArr.length == 1 && !strArr[0].endsWith("/");
        this.f22513 = z;
        if (z) {
            ((C10604) interfaceC11559).f31824.m50128();
        }
        boolean z2 = (C16999.m39887(str) || C19739.m45449(str) != null || (abstractC13921 instanceof C19247) || (abstractC13921 instanceof C19702)) ? false : true;
        C15249.m36228(strArr, abstractC13921, z2);
        C17721.m41503(str, EnumC16309.MODIFY_DIRECTORY);
        C16999.m39866(str, new String[0]).m36508();
        C12969 c12969 = new C12969(interfaceC11559);
        this.f22510 = new C4586(false);
        C16340 c16340M38484 = C16340.m38484(abstractC13921);
        this.f22507 = c16340M38484;
        C15249 c15249M36217 = C15249.m36217(str, this.f22510, c12969, new C20026(c16340M38484));
        this.f22508 = c15249M36217;
        if ((abstractC13921 instanceof C19247) || (abstractC13921 instanceof C19702)) {
            c15249M36217.m36247();
        } else if (z2) {
            c15249M36217.m36249();
        }
        this.f22508.m36245();
        this.f22508.m36242(strArr, abstractC13921, true, false);
        C6370 c6370 = ((C10604) interfaceC11559).f31824;
        if (c6370.mo1526()) {
            return;
        }
        if (this.f22508.m36243(false)) {
            boolean zMo7652 = abstractC13921.mo7652();
            C13674 c13674 = this.f22511;
            if (!zMo7652) {
                Iterator it = this.f22508.m36248().iterator();
                while (it.hasNext()) {
                    m19663((AbstractC1139) it.next());
                }
                m19666(false);
            } else {
                HashMap map = new HashMap();
                ArrayList<C0433> arrayList2 = new ArrayList();
                LinkedList linkedList = new LinkedList(this.f22508.m36248());
                while (!linkedList.isEmpty()) {
                    AbstractC1139 abstractC1139 = (AbstractC1139) linkedList.removeFirst();
                    if (abstractC1139.m3909()) {
                        arrayList.add(abstractC1139);
                        if (abstractC1139.m3888()) {
                            if (!abstractC1139.mo1983().m1988().isEmpty()) {
                                arrayList2.add(abstractC1139.mo1983());
                            }
                            linkedList.addAll(0, abstractC1139.mo1983().m1988());
                        }
                    } else if (abstractC1139.m3888()) {
                        arrayList2.add(abstractC1139.mo1983());
                        linkedList.addAll(0, abstractC1139.mo1983().m1988());
                    } else {
                        map.put(this.f22506.m33351(abstractC1139.m3910()), abstractC1139.mo1987());
                    }
                }
                for (C0433 c0433 : arrayList2) {
                    m19670(c0433);
                    if (!c0433.m3879()) {
                        c0433.m3892().m36508();
                    }
                    if (c0433.m3893() != null) {
                        this.f22509.add((String) c0433.m3893());
                    }
                    if (((C10604) this.f22504).f31824.mo1526()) {
                    }
                }
                IOException[] iOExceptionArr = {null};
                this.f22506.mo7640(map.keySet(), new C5914(this, map, iOExceptionArr));
                IOException iOException = iOExceptionArr[0];
                if (iOException == null) {
                    if (!((C10604) this.f22504).f31824.mo1526()) {
                        if (this.f22505) {
                            for (C0433 c0434 : arrayList2) {
                                if (!c0434.m3879() && c0434.m3887() > 0) {
                                    AbstractC15440 abstractC15440M3892 = c0434.m3892();
                                    if (abstractC15440M3892.mo27912()) {
                                        c13674.m32889(abstractC15440M3892, c0434.m3887());
                                    }
                                }
                            }
                        }
                        m19666(true);
                    }
                } else {
                    throw iOException;
                }
            }
            c13674.m32888();
            return;
        }
        c6370.cancel();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashSet m19675() {
        return this.f22509;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19663(AbstractC1139 abstractC1139) throws IOException {
        if (((C10604) this.f22504).f31824.mo1526()) {
            return;
        }
        m19670(abstractC1139);
        AbstractC15440 abstractC15440M3892 = abstractC1139.m3892();
        if (abstractC1139.m3909()) {
            this.f22514.add(abstractC1139);
            if (abstractC1139.m3888() && !abstractC1139.m3879() && !abstractC1139.mo1983().m1988().isEmpty()) {
                abstractC15440M3892.m36508();
            }
            if (!((C10604) this.f22504).f31824.mo1526() && abstractC1139.m3888()) {
                Iterator it = abstractC1139.mo1983().m1988().iterator();
                while (it.hasNext()) {
                    m19663((AbstractC1139) it.next());
                }
                return;
            }
            return;
        }
        if (!abstractC1139.m3888()) {
            InterfaceC17889 interfaceC17889M33351 = this.f22506.m33351(abstractC1139.m3910());
            if (this.f22513) {
                C19404 c19404Mo28347 = this.f22506.mo28347(interfaceC17889M33351);
                try {
                    if (c19404Mo28347 == null) {
                        ((C10604) this.f22504).f31824.cancel();
                        if (c19404Mo28347 != null) {
                            c19404Mo28347.close();
                            return;
                        }
                        return;
                    }
                    C19277 c19277M44686 = c19404Mo28347.m44686();
                    InterfaceC11559 interfaceC11559 = this.f22504;
                    C11003.requireNonNull(interfaceC11559);
                    c19277M44686.m44459(new C4503(interfaceC11559));
                    if (!m19667(abstractC1139.mo1987(), interfaceC17889M33351)) {
                        if (!((C10604) this.f22504).f31824.mo1526()) {
                            m19662((InputStream) c19404Mo28347, ((C15688) interfaceC17889M33351).getSize(), false);
                        }
                        c19404Mo28347.close();
                        return;
                    } else {
                        abstractC15440M3892 = abstractC1139.m3892();
                        final InterfaceC11559 interfaceC115510 = this.f22504;
                        C11003.requireNonNull(interfaceC115510);
                        abstractC15440M3892.m36515(c19404Mo28347, -1L, new InterfaceC5627() { // from class: l.ۗ۟ܳ
                            @Override // l.InterfaceC5627
                            /* JADX INFO: renamed from: ᩷֫ */
                            public final /* synthetic */ void mo1648() {
                                throw null;
                            }

                            @Override // l.InterfaceC17066
                            /* JADX INFO: renamed from: ᩻ */
                            public final boolean mo1526() {
                                return ((C10604) interfaceC115510).mo1526();
                            }
                        });
                        c19404Mo28347.close();
                    }
                } catch (Throwable th) {
                    if (c19404Mo28347 != null) {
                        try {
                            c19404Mo28347.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } else {
                InputStream inputStreamMo7636 = this.f22506.mo7636((AbstractActivityC3346) null, interfaceC17889M33351);
                try {
                    if (inputStreamMo7636 == null) {
                        ((C10604) this.f22504).f31824.cancel();
                        if (inputStreamMo7636 != null) {
                            inputStreamMo7636.close();
                            return;
                        }
                        return;
                    }
                    if (!m19667(abstractC1139.mo1987(), interfaceC17889M33351)) {
                        if (!((C10604) this.f22504).f31824.mo1526()) {
                            m19662(inputStreamMo7636, ((C15688) interfaceC17889M33351).getSize(), true);
                            if (!((C10604) this.f22504).f31824.mo1526()) {
                                this.f22508.m47708(abstractC1139.m3913());
                            }
                        }
                        inputStreamMo7636.close();
                        return;
                    }
                    AbstractC15440 abstractC15440M3893 = abstractC1139.m3892();
                    abstractC15440M3893.m36515(inputStreamMo7636, ((C15688) interfaceC17889M33351).getSize(), new C12264(this));
                    inputStreamMo7636.close();
                    this.f22508.m47708(abstractC1139.m3913());
                    abstractC15440M3892 = abstractC15440M3893;
                } catch (Throwable th3) {
                    if (inputStreamMo7636 != null) {
                        try {
                            inputStreamMo7636.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            }
            if (((C10604) this.f22504).f31824.mo1526()) {
                abstractC15440M3892.mo27929();
                return;
            }
            if (abstractC1139.m3904() != null) {
                C17558 c17558 = new C17558();
                c17558.m41048(abstractC1139.m3904());
                c17558.m41052(abstractC15440M3892);
            }
            this.f22512.m1888(abstractC1139.m3898(), abstractC15440M3892.getName());
        } else if (!abstractC1139.m3879()) {
            abstractC15440M3892.m36508();
        }
        if (((C10604) this.f22504).f31824.mo1526()) {
            return;
        }
        if (!abstractC1139.m3888()) {
            C14463.m34554(abstractC1139.m3900(), true);
        }
        if (abstractC1139.m3893() != null) {
            this.f22509.add((String) abstractC1139.m3893());
        }
        if (abstractC1139.m3888()) {
            Iterator it2 = abstractC1139.mo1983().m1988().iterator();
            while (it2.hasNext()) {
                m19663((AbstractC1139) it2.next());
            }
        }
        if (this.f22505 && abstractC1139.m3887() > 0 && abstractC15440M3892.mo27912()) {
            if (abstractC1139.m3888() && abstractC1139.m3879()) {
                return;
            }
            this.f22511.m32889(abstractC15440M3892, abstractC1139.m3887());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m19667(C5373 c5373, InterfaceC17889 interfaceC17889) {
        if (!((C10604) this.f22504).f31824.mo1526()) {
            if (c5373.m3879()) {
                AbstractC15440 abstractC15440M3892 = c5373.m3892();
                if (!c5373.m3908() && this.f22507.m38488(abstractC15440M3892)) {
                    if (!((C10604) this.f22504).f31824.mo1526()) {
                        this.f22510.getClass();
                        int iMo13490 = this.f22510.mo13490(c5373.m3898(), C22306.m50049(interfaceC17889), C22306.m50048(abstractC15440M3892), abstractC15440M3892.mo29016(), true);
                        if (this.f22510.mo1526()) {
                            ((C10604) this.f22504).f31824.cancel();
                            return false;
                        }
                        if (iMo13490 == 2) {
                            c5373.m3911();
                            c5373.m3885((C18264) null);
                            c5373.m3897(false);
                        }
                    }
                }
                if (!c5373.m3908()) {
                    if (c5373.m3880()) {
                        abstractC15440M3892.mo29017(this.f22504);
                        return true;
                    }
                    abstractC15440M3892.mo23552();
                    return true;
                }
                AbstractC15440 abstractC15440M36492 = abstractC15440M3892.m36492(true);
                c5373.m3896(abstractC15440M36492);
                if (c5373.m3893() != null) {
                    c5373.m3907(abstractC15440M36492.getName());
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m19662(InputStream inputStream, long j, boolean z) {
        int i;
        byte[] bArr = new byte[32768];
        long j2 = 0;
        while (!((C10604) this.f22504).f31824.mo1526() && (i = inputStream.read(bArr)) != -1) {
            j2 += (long) i;
            if (z && j >= 0) {
                ((C10604) this.f22504).f31824.m50129(C19277.m44456(j2, j));
                ((C10604) this.f22504).f31824.mo11538(C19277.m44456(this.f22508.m47713() + j2, this.f22508.m47709()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m19670(AbstractC1139 abstractC1139) {
        this.f22508.m47715();
        InterfaceC11559 interfaceC11559 = this.f22504;
        int iM47714 = this.f22508.m47714();
        int iM47716 = this.f22508.m47716();
        C6370 c6370 = ((C10604) interfaceC11559).f31824;
        if (iM47716 > 1) {
            StringBuilder sb = new StringBuilder();
            int i = C6370.f19705;
            sb.append(C4925.m14327(R.string.MT_Protector));
            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
            sb.append(iM47714);
            sb.append("/");
            sb.append(iM47716);
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            c6370.mo11546(sb.toString());
        } else {
            c6370.m11536(R.string.MT_Protector);
        }
        c6370.mo11520(abstractC1139.m3898());
        if (this.f22513) {
            return;
        }
        ((C10604) this.f22504).f31824.m50129(0);
        InterfaceC11559 interfaceC115510 = this.f22504;
        ((C10604) interfaceC115510).f31824.mo11538(this.f22508.m47712());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19666(boolean z) throws IOException {
        ArrayList<AbstractC1139> arrayList = this.f22514;
        for (AbstractC1139 abstractC1139 : arrayList) {
            if (z && (!abstractC1139.m3888() || abstractC1139.mo1983().m1988().isEmpty())) {
                m19670(abstractC1139);
            }
            if (!((C10604) this.f22504).f31824.mo1526()) {
                String str = abstractC1139.m3898() + "/";
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        AbstractC15440 abstractC15440M3892 = abstractC1139.m3892();
                        if (abstractC15440M3892.mo23120()) {
                            break;
                        }
                        String strM3906 = abstractC1139.m3906();
                        if (strM3906 == null) {
                            throw new IOException("Archive symbolic link target is missing: " + abstractC1139.m3898());
                        }
                        abstractC15440M3892.mo35195();
                        abstractC15440M3892.mo27934(this.f22512.m1889(abstractC1139.m3898(), strM3906));
                        if (!abstractC1139.m3888()) {
                            C14463.m34554(abstractC1139.m3900(), true);
                        }
                        if (abstractC1139.m3893() == null) {
                            break;
                        }
                        this.f22509.add((String) abstractC1139.m3893());
                        break;
                    }
                    AbstractC1139 abstractC11310 = (AbstractC1139) it.next();
                    if (abstractC11310 != abstractC1139 && abstractC11310.m3898().startsWith(str)) {
                        break;
                    }
                }
            }
        }
    }
}
