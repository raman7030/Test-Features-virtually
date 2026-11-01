package p067l;

import android.os.Build;
import android.os.SystemClock;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ܶܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: OAIH */
/* JADX INFO: loaded from: classes5.dex */
public class C16988 extends AbstractC21614 {

    /* JADX INFO: renamed from: ܽۧ */
    public static final /* synthetic */ int f50226 = 0;

    /* JADX INFO: renamed from: ۤ֫ */
    public C22534 f50231;

    /* JADX INFO: renamed from: ۧۧ */
    public AbstractC5375 f50232;

    /* JADX INFO: renamed from: ۨ֫ */
    public boolean f50233;

    /* JADX INFO: renamed from: ۫֫ */
    public C16861 f50234;

    /* JADX INFO: renamed from: ܰ֫ */
    public boolean f50236 = C7050.m16218();

    /* JADX INFO: renamed from: ۟֫ */
    public List f50230 = C18426.m41997();

    /* JADX INFO: renamed from: ۛ֫ */
    public AtomicReference f50229 = new AtomicReference();

    /* JADX INFO: renamed from: ᩺֫ */
    public List f50237 = C18426.m41997();

    /* JADX INFO: renamed from: ֫ۧ */
    public C6455 f50227 = new C6455(0);

    /* JADX INFO: renamed from: ۗ֫ */
    public C23352 f50228 = new C23352();

    /* JADX INFO: renamed from: ۬֫ */
    public InterfaceC20887 f50235 = new C3578(this);

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79710;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(this.f50233 ? R.string.MT_Protector : R.string.MT_Protector, m13467("targetPath"));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        mo25203("...");
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws Exception {
        AtomicReference atomicReference;
        String[] strArrM13494 = m13494("ARG_PATHS");
        String strM13492 = m13492("targetPath");
        this.f50233 = m13488("moveMode");
        this.f50232 = (AbstractC5375) m13462();
        C19210.m43749(strM13492, EnumC17868.MODIFY_DIRECTORY);
        C18524.m42109(strM13492, new String[0]).m38666();
        C16861 c16861M38377 = C16861.m38377(strM13492, new C6727(false), this.f50235);
        this.f50234 = c16861M38377;
        if (!this.f50232.f12758.f14155) {
            c16861M38377.m38407();
        }
        this.f50234.m38403(strArrM13494, (AbstractC15599) this.f50232, false, true);
        if (Build.VERSION.SDK_INT >= 30) {
            C10024 c10024 = new C10024();
            Iterator it = this.f50234.m38409().iterator();
            while (it.hasNext()) {
                ((AbstractC3451) it.next()).m6124(c10024, true);
            }
            if (!c10024.m23404()) {
                cancel();
                return C18736.m42768();
            }
        }
        m13472(this.f50233 ? R.string.MT_Protector : R.string.MT_Protector);
        mo25204(this.f50234);
        m48822(true);
        this.f50228.m52010();
        this.f50227.m14742();
        this.f50231 = new C22534(this.f50232, new C10284(this));
        Iterator it2 = this.f50234.m38409().iterator();
        do {
            boolean zHasNext = it2.hasNext();
            atomicReference = this.f50229;
            if (!zHasNext) {
                break;
            }
            m38575((AbstractC3451) it2.next());
            if (mo3924()) {
                break;
            }
        } while (atomicReference.get() == null);
        if (mo3924()) {
            return C18736.m42768();
        }
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
        this.f50231.m50497(new InterfaceC25215() { // from class: l.ۚܿ᩻
            @Override // p067l.InterfaceC25215
            /* JADX INFO: renamed from: ֫ */
            public final void mo5874(C5099 c5099, boolean z) {
                C16988 c16988 = this.f19901;
                AtomicReference atomicReference2 = c16988.f50229;
                if (!z) {
                    Exception exc = (Exception) c5099.f11960.get();
                    if (exc != null) {
                        while (!atomicReference2.compareAndSet(null, exc) && atomicReference2.get() == null) {
                        }
                        return;
                    }
                    return;
                }
                C19056 c19056 = c5099.f11945;
                AbstractC17043 abstractC17043 = c5099.f11948;
                if (c19056 != null) {
                    c19056.m43298(abstractC17043);
                }
                if (c16988.f50236 && abstractC17043.mo29973()) {
                    abstractC17043.mo20486(c5099.f11959);
                }
                C16114.m36688(abstractC17043.mo25505(), true);
                Object obj = c5099.f11942;
                if (obj != null) {
                    c16988.f50237.add((String) obj);
                }
                if (c16988.f50233 && !c16988.mo3924()) {
                    try {
                        c16988.f50232.m11741(c5099.f11946, false);
                    } catch (Exception e) {
                        while (!atomicReference2.compareAndSet(null, e) && atomicReference2.get() == null) {
                        }
                    }
                }
                c16988.f50234.m50045();
                c16988.mo25204(c16988.f50234);
                c16988.mo13474(c16988.f50234.m50042());
            }
        });
        this.f50231.m50500();
        if (mo3924()) {
            return C18736.m42768();
        }
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
        if (this.f50233) {
            Iterator it3 = this.f50234.m38409().iterator();
            while (it3.hasNext()) {
                m38574((AbstractC3451) it3.next());
                if (mo3924()) {
                    return C18736.m42768();
                }
            }
        }
        Iterator it4 = this.f50230.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
            if (mo3924()) {
                return C18736.m42768();
            }
        }
        SystemClock.sleep(100L);
        return C18736.m42767();
    }

    /* JADX INFO: renamed from: ܽ */
    private void m38575(AbstractC3451 abstractC3451) {
        C19056 c19056;
        String str;
        boolean zM6121;
        boolean z;
        AbstractC17043 abstractC17043M38650;
        if (mo3924() || this.f50229.get() != null) {
            return;
        }
        mo25203(abstractC3451.m6139());
        abstractC3451.m6140();
        try {
            boolean zM6129 = abstractC3451.m6129();
            C23352 c23352 = this.f50228;
            if (zM6129) {
                if (!abstractC3451.m6120()) {
                    AbstractC17043 abstractC17043M6133 = abstractC3451.m6133();
                    c23352.m52011(abstractC17043M6133, EnumC17868.MODIFY_FILE);
                    abstractC17043M6133.m38666();
                    C19056 c19056M6142 = abstractC3451.m6142();
                    if (c19056M6142 != null) {
                        c19056M6142.m43298(abstractC17043M6133);
                    }
                    if (this.f50236 && abstractC17043M6133.mo29973()) {
                        this.f50230.add(new RunnableC23556(2, abstractC17043M6133, abstractC3451));
                    }
                }
                abstractC3451.m6132();
                this.f50234.m50045();
                if (abstractC3451.m6134() != null) {
                    this.f50237.add((String) abstractC3451.m6134());
                }
                Iterator it = abstractC3451.mo4359().m4364().iterator();
                while (it.hasNext()) {
                    m38575((AbstractC3451) it.next());
                }
            } else {
                String strM6151 = abstractC3451.m6151();
                C19056 c19056M6143 = abstractC3451.m6142();
                String name = abstractC3451.m6134() != null ? (String) abstractC3451.m6134() : null;
                if (!abstractC3451.m6120()) {
                    abstractC17043M38650 = abstractC3451.m6133();
                    c23352.m52011(abstractC17043M38650, EnumC17868.MODIFY_FILE);
                } else {
                    if (!abstractC3451.m6149()) {
                        AbstractC17043 abstractC17043M6134 = abstractC3451.m6133();
                        c23352.m52011(abstractC17043M6134, EnumC17868.MODIFY_FILE);
                        C19056 c19057 = new C19056();
                        c19057.m43296(abstractC17043M6134);
                        c19056 = c19057;
                        str = name;
                        zM6121 = abstractC3451.m6121();
                        z = true;
                        abstractC17043M38650 = abstractC17043M6134;
                    } else {
                        abstractC17043M38650 = abstractC3451.m6133().m38650(true);
                        c23352.m52011(abstractC17043M38650, EnumC17868.MODIFY_FILE);
                        if (name != null) {
                            name = abstractC17043M38650.getName();
                            abstractC3451.m6148(name);
                        }
                    }
                    this.f50231.m50496(abstractC3451.m6139(), strM6151, abstractC17043M38650, abstractC3451.m6154(), abstractC3451.m6128(), str, c19056, z, zM6121);
                }
                c19056 = c19056M6143;
                str = name;
                z = false;
                zM6121 = false;
                this.f50231.m50496(abstractC3451.m6139(), strM6151, abstractC17043M38650, abstractC3451.m6154(), abstractC3451.m6128(), str, c19056, z, zM6121);
            }
        } finally {
            abstractC3451.m6132();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m38574(AbstractC3451 abstractC3451) {
        if (abstractC3451.m6129()) {
            C2780 c2780Mo4359 = abstractC3451.mo4359();
            if (c2780Mo4359.m4362()) {
                Iterator it = c2780Mo4359.m4364().iterator();
                while (it.hasNext()) {
                    m38574((AbstractC3451) it.next());
                }
            } else {
                m13472(R.string.MT_Protector);
                mo13456(abstractC3451.m6139());
                C12296.m28315(this.f50232, c2780Mo4359);
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (c18736.m42773() && m13478(c18107)) {
            c18107.m41267();
            if (this.f50233) {
                c18107.m41241();
            }
        }
        List list = this.f50237;
        if (list.isEmpty() || !m13461(c18108)) {
            return;
        }
        c18108.m41226((Collection) list);
        c18108.m41241();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C22534 c22534 = this.f50231;
        if (c22534 != null && !c22534.m50498()) {
            this.f50231.m50499();
        }
        this.f50227.m14743();
        C17127.m38756();
        if (this.f50233) {
            C17127.m38755(this.f50232.mo11732());
        }
    }
}
