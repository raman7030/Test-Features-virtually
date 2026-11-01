package p067l;

import bin.p000mt.plus.R;
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
public final class C9330 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC13354 f25395;

    /* JADX INFO: renamed from: ۡ */
    public AbstractC15599 f25397;

    /* JADX INFO: renamed from: ۢ */
    public C17898 f25398;

    /* JADX INFO: renamed from: ۧ */
    public C16861 f25399;

    /* JADX INFO: renamed from: ܽ */
    public C6727 f25401;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f25404;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f25396 = C7050.m16218();

    /* JADX INFO: renamed from: ܿ */
    public final C15364 f25402 = new C15364();

    /* JADX INFO: renamed from: ܳ */
    public final HashSet f25400 = new HashSet();

    /* JADX INFO: renamed from: ᩻ */
    public final ArrayList f25405 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ */
    public final C2742 f25403 = new C2742();

    /* JADX INFO: renamed from: ֫ */
    public final void m21644(AbstractC15599 abstractC15599, String[] strArr, String str, InterfaceC13354 interfaceC13354) {
        this.f25397 = abstractC15599;
        this.f25395 = interfaceC13354;
        ArrayList arrayList = this.f25405;
        arrayList.clear();
        this.f25403.m4279();
        boolean z = strArr.length == 1 && !strArr[0].endsWith("/");
        this.f25404 = z;
        if (z) {
            ((C12447) interfaceC13354).f34795.m52468();
        }
        boolean z2 = (C18524.m42130(str) || C21129.m47753(str) != null || (abstractC15599 instanceof C20661) || (abstractC15599 instanceof C21094)) ? false : true;
        C16861.m38389(strArr, abstractC15599, z2);
        C19210.m43749(str, EnumC17868.MODIFY_DIRECTORY);
        C18524.m42109(str, new String[0]).m38666();
        C14694 c14694 = new C14694(interfaceC13354);
        this.f25401 = new C6727(false);
        C17898 c17898M40700 = C17898.m40700(abstractC15599);
        this.f25398 = c17898M40700;
        C16861 c16861M38378 = C16861.m38378(str, this.f25401, c14694, new C21401(c17898M40700));
        this.f25399 = c16861M38378;
        if ((abstractC15599 instanceof C20661) || (abstractC15599 instanceof C21094)) {
            c16861M38378.m38408();
        } else if (z2) {
            c16861M38378.m38410();
        }
        this.f25399.m38406();
        this.f25399.m38403(strArr, abstractC15599, true, false);
        C8423 c8423 = ((C12447) interfaceC13354).f34795;
        if (c8423.mo3924()) {
            return;
        }
        if (this.f25399.m38404(false)) {
            boolean zMo9723 = abstractC15599.mo9723();
            C15364 c15364 = this.f25402;
            if (!zMo9723) {
                Iterator it = this.f25399.m38409().iterator();
                while (it.hasNext()) {
                    m21631((AbstractC3451) it.next());
                }
                m21634(false);
            } else {
                HashMap map = new HashMap();
                ArrayList<C2780> arrayList2 = new ArrayList();
                LinkedList linkedList = new LinkedList(this.f25399.m38409());
                while (!linkedList.isEmpty()) {
                    AbstractC3451 abstractC3451 = (AbstractC3451) linkedList.removeFirst();
                    if (abstractC3451.m6150()) {
                        arrayList.add(abstractC3451);
                        if (abstractC3451.m6129()) {
                            if (!abstractC3451.mo4359().m4364().isEmpty()) {
                                arrayList2.add(abstractC3451.mo4359());
                            }
                            linkedList.addAll(0, abstractC3451.mo4359().m4364());
                        }
                    } else if (abstractC3451.m6129()) {
                        arrayList2.add(abstractC3451.mo4359());
                        linkedList.addAll(0, abstractC3451.mo4359().m4364());
                    } else {
                        map.put(this.f25397.m35470(abstractC3451.m6151()), abstractC3451.mo4363());
                    }
                }
                for (C2780 c2780 : arrayList2) {
                    m21638(c2780);
                    if (!c2780.m6120()) {
                        c2780.m6133().m38666();
                    }
                    if (c2780.m6134() != null) {
                        this.f25400.add((String) c2780.m6134());
                    }
                    if (((C12447) this.f25395).f34795.mo3924()) {
                    }
                }
                IOException[] iOExceptionArr = {null};
                this.f25397.mo9711(map.keySet(), new C7989(this, map, iOExceptionArr));
                IOException iOException = iOExceptionArr[0];
                if (iOException == null) {
                    if (!((C12447) this.f25395).f34795.mo3924()) {
                        if (this.f25396) {
                            for (C2780 c2781 : arrayList2) {
                                if (!c2781.m6120() && c2781.m6128() > 0) {
                                    AbstractC17043 abstractC17043M6133 = c2781.m6133();
                                    if (abstractC17043M6133.mo29973()) {
                                        c15364.m35004(abstractC17043M6133, c2781.m6128());
                                    }
                                }
                            }
                        }
                        m21634(true);
                    }
                } else {
                    throw iOException;
                }
            }
            c15364.m35003();
            return;
        }
        c8423.cancel();
    }

    /* JADX INFO: renamed from: ֫ */
    public final HashSet m21643() {
        return this.f25400;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m21631(AbstractC3451 abstractC3451) throws IOException {
        if (((C12447) this.f25395).f34795.mo3924()) {
            return;
        }
        m21638(abstractC3451);
        AbstractC17043 abstractC17043M6133 = abstractC3451.m6133();
        if (abstractC3451.m6150()) {
            this.f25405.add(abstractC3451);
            if (abstractC3451.m6129() && !abstractC3451.m6120() && !abstractC3451.mo4359().m4364().isEmpty()) {
                abstractC17043M6133.m38666();
            }
            if (!((C12447) this.f25395).f34795.mo3924() && abstractC3451.m6129()) {
                Iterator it = abstractC3451.mo4359().m4364().iterator();
                while (it.hasNext()) {
                    m21631((AbstractC3451) it.next());
                }
                return;
            }
            return;
        }
        if (!abstractC3451.m6129()) {
            InterfaceC19370 interfaceC19370M35470 = this.f25397.m35470(abstractC3451.m6151());
            if (this.f25404) {
                C20810 c20810Mo30393 = this.f25397.mo30393(interfaceC19370M35470);
                try {
                    if (c20810Mo30393 == null) {
                        ((C12447) this.f25395).f34795.cancel();
                        if (c20810Mo30393 != null) {
                            c20810Mo30393.close();
                            return;
                        }
                        return;
                    }
                    C20689 c20689M46980 = c20810Mo30393.m46980();
                    InterfaceC13354 interfaceC13354 = this.f25395;
                    C12826.requireNonNull(interfaceC13354);
                    c20689M46980.m46753(new C6648(interfaceC13354));
                    if (!m21635(abstractC3451.mo4363(), interfaceC19370M35470)) {
                        if (!((C12447) this.f25395).f34795.mo3924()) {
                            m21630((InputStream) c20810Mo30393, ((C17278) interfaceC19370M35470).getSize(), false);
                        }
                        c20810Mo30393.close();
                        return;
                    } else {
                        abstractC17043M6133 = abstractC3451.m6133();
                        final InterfaceC13354 interfaceC13355 = this.f25395;
                        C12826.requireNonNull(interfaceC13355);
                        abstractC17043M6133.m38673(c20810Mo30393, -1L, new InterfaceC7717() { // from class: l.ۗ۟ܳ
                            @Override // p067l.InterfaceC7717
                            /* JADX INFO: renamed from: ᩷֫ */
                            public final /* synthetic */ void mo4048() {
                                throw null;
                            }

                            @Override // p067l.InterfaceC18588
                            /* JADX INFO: renamed from: ᩻ */
                            public final boolean mo3924() {
                                return ((C12447) interfaceC13355).mo3924();
                            }
                        });
                        c20810Mo30393.close();
                    }
                } catch (Throwable th) {
                    if (c20810Mo30393 != null) {
                        try {
                            c20810Mo30393.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } else {
                InputStream inputStreamMo9707 = this.f25397.mo9707((AbstractActivityC5549) null, interfaceC19370M35470);
                try {
                    if (inputStreamMo9707 == null) {
                        ((C12447) this.f25395).f34795.cancel();
                        if (inputStreamMo9707 != null) {
                            inputStreamMo9707.close();
                            return;
                        }
                        return;
                    }
                    if (!m21635(abstractC3451.mo4363(), interfaceC19370M35470)) {
                        if (!((C12447) this.f25395).f34795.mo3924()) {
                            m21630(inputStreamMo9707, ((C17278) interfaceC19370M35470).getSize(), true);
                            if (!((C12447) this.f25395).f34795.mo3924()) {
                                this.f25399.m50038(abstractC3451.m6154());
                            }
                        }
                        inputStreamMo9707.close();
                        return;
                    }
                    AbstractC17043 abstractC17043M6134 = abstractC3451.m6133();
                    abstractC17043M6134.m38673(inputStreamMo9707, ((C17278) interfaceC19370M35470).getSize(), new C14024(this));
                    inputStreamMo9707.close();
                    this.f25399.m50038(abstractC3451.m6154());
                    abstractC17043M6133 = abstractC17043M6134;
                } catch (Throwable th3) {
                    if (inputStreamMo9707 != null) {
                        try {
                            inputStreamMo9707.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            }
            if (((C12447) this.f25395).f34795.mo3924()) {
                abstractC17043M6133.mo29990();
                return;
            }
            if (abstractC3451.m6145() != null) {
                C19056 c19056 = new C19056();
                c19056.m43294(abstractC3451.m6145());
                c19056.m43298(abstractC17043M6133);
            }
            this.f25403.m4280(abstractC3451.m6139(), abstractC17043M6133.getName());
        } else if (!abstractC3451.m6120()) {
            abstractC17043M6133.m38666();
        }
        if (((C12447) this.f25395).f34795.mo3924()) {
            return;
        }
        if (!abstractC3451.m6129()) {
            C16114.m36688(abstractC3451.m6141(), true);
        }
        if (abstractC3451.m6134() != null) {
            this.f25400.add((String) abstractC3451.m6134());
        }
        if (abstractC3451.m6129()) {
            Iterator it2 = abstractC3451.mo4359().m4364().iterator();
            while (it2.hasNext()) {
                m21631((AbstractC3451) it2.next());
            }
        }
        if (this.f25396 && abstractC3451.m6128() > 0 && abstractC17043M6133.mo29973()) {
            if (abstractC3451.m6129() && abstractC3451.m6120()) {
                return;
            }
            this.f25402.m35004(abstractC17043M6133, abstractC3451.m6128());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public boolean m21635(C7475 c7475, InterfaceC19370 interfaceC19370) {
        if (!((C12447) this.f25395).f34795.mo3924()) {
            if (c7475.m6120()) {
                AbstractC17043 abstractC17043M6133 = c7475.m6133();
                if (!c7475.m6149() && this.f25398.m40704(abstractC17043M6133)) {
                    if (!((C12447) this.f25395).f34795.mo3924()) {
                        this.f25401.getClass();
                        int iMo15379 = this.f25401.mo15379(c7475.m6139(), C23568.m52379(interfaceC19370), C23568.m52378(abstractC17043M6133), abstractC17043M6133.mo31068(), true);
                        if (this.f25401.mo3924()) {
                            ((C12447) this.f25395).f34795.cancel();
                            return false;
                        }
                        if (iMo15379 == 2) {
                            c7475.m6152();
                            c7475.m6126((C19727) null);
                            c7475.m6138(false);
                        }
                    }
                }
                if (!c7475.m6149()) {
                    if (c7475.m6121()) {
                        abstractC17043M6133.mo31069(this.f25395);
                        return true;
                    }
                    abstractC17043M6133.mo25503();
                    return true;
                }
                AbstractC17043 abstractC17043M38650 = abstractC17043M6133.m38650(true);
                c7475.m6137(abstractC17043M38650);
                if (c7475.m6134() != null) {
                    c7475.m6148(abstractC17043M38650.getName());
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m21630(InputStream inputStream, long j, boolean z) {
        int i;
        byte[] bArr = new byte[32768];
        long j2 = 0;
        while (!((C12447) this.f25395).f34795.mo3924() && (i = inputStream.read(bArr)) != -1) {
            j2 += (long) i;
            if (z && j >= 0) {
                ((C12447) this.f25395).f34795.m52469(C20689.m46750(j2, j));
                ((C12447) this.f25395).f34795.mo13474(C20689.m46750(this.f25399.m50043() + j2, this.f25399.m50039()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m21638(AbstractC3451 abstractC3451) {
        this.f25399.m50045();
        InterfaceC13354 interfaceC13354 = this.f25395;
        int iM50044 = this.f25399.m50044();
        int iM50046 = this.f25399.m50046();
        C8423 c8423 = ((C12447) interfaceC13354).f34795;
        if (iM50046 > 1) {
            StringBuilder sb = new StringBuilder();
            int i = C8423.f22578;
            sb.append(C7050.m16224(R.string.MT_Protector));
            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
            sb.append(iM50044);
            sb.append("/");
            sb.append(iM50046);
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            c8423.mo13482(sb.toString());
        } else {
            c8423.m13472(R.string.MT_Protector);
        }
        c8423.mo13456(abstractC3451.m6139());
        if (this.f25404) {
            return;
        }
        ((C12447) this.f25395).f34795.m52469(0);
        InterfaceC13354 interfaceC13355 = this.f25395;
        ((C12447) interfaceC13355).f34795.mo13474(this.f25399.m50042());
    }

    /* JADX INFO: renamed from: ֫ */
    private void m21634(boolean z) throws IOException {
        ArrayList<AbstractC3451> arrayList = this.f25405;
        for (AbstractC3451 abstractC3451 : arrayList) {
            if (z && (!abstractC3451.m6129() || abstractC3451.mo4359().m4364().isEmpty())) {
                m21638(abstractC3451);
            }
            if (!((C12447) this.f25395).f34795.mo3924()) {
                String str = abstractC3451.m6139() + "/";
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        AbstractC17043 abstractC17043M6133 = abstractC3451.m6133();
                        if (abstractC17043M6133.mo25094()) {
                            break;
                        }
                        String strM6147 = abstractC3451.m6147();
                        if (strM6147 == null) {
                            throw new IOException("Archive symbolic link target is missing: " + abstractC3451.m6139());
                        }
                        abstractC17043M6133.mo37342();
                        abstractC17043M6133.mo29995(this.f25403.m4281(abstractC3451.m6139(), strM6147));
                        if (!abstractC3451.m6129()) {
                            C16114.m36688(abstractC3451.m6141(), true);
                        }
                        if (abstractC3451.m6134() == null) {
                            break;
                        }
                        this.f25400.add((String) abstractC3451.m6134());
                        break;
                    }
                    AbstractC3451 abstractC3452 = (AbstractC3451) it.next();
                    if (abstractC3452 != abstractC3451 && abstractC3452.m6139().startsWith(str)) {
                        break;
                    }
                }
            }
        }
    }
}
