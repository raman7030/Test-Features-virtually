package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9QS */
/* JADX INFO: loaded from: classes3.dex */
public class C6598 extends AbstractC23625 {

    /* JADX INFO: renamed from: ֨֫ */
    public boolean f17025;

    /* JADX INFO: renamed from: ۘ֫ */
    public volatile C23914 f17026;

    /* JADX INFO: renamed from: ۠֫ */
    public volatile boolean f17028;

    /* JADX INFO: renamed from: ܶ֫ */
    public boolean f17029;

    /* JADX INFO: renamed from: ᩵֫ */
    public C16861 f17031;

    /* JADX INFO: renamed from: ۚ֫ */
    public final HashSet f17027 = new HashSet();

    /* JADX INFO: renamed from: ֡֫ */
    public C6727 f17024 = new C6727(false);

    /* JADX INFO: renamed from: ᩴ֫ */
    public final InterfaceC20887 f17030 = new C23362(this);

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() {
        C23914 c23914;
        C23914 c23915;
        String[] strArrM13494 = m13494("ARG_PATHS");
        String strM13492 = m13492("targetPath");
        C7150 c7150 = (C7150) m13462();
        this.f17025 = c7150.m16433();
        boolean z = strArrM13494.length == 1;
        this.f17029 = z;
        if (z) {
            m52468();
        }
        C19210.m43749(strM13492, EnumC17868.MODIFY_DIRECTORY);
        C18524.m42109(strM13492, new String[0]).m38666();
        this.f17031 = C16861.m38378(strM13492, this.f17024, this.f17030, new C21401(C17898.m40700(c7150)));
        if (this.f17025) {
            c23914 = new C23914();
            this.f17026 = c23914;
            if (this.f17028 || mo3924()) {
                c23914.m52984();
            }
        } else {
            c23914 = null;
        }
        try {
            if (this.f17025) {
                c7150.m16439(c23914);
            }
            this.f17031.m38403(strArrM13494, (AbstractC15599) c7150, true, false);
            if (this.f17026 == c23914) {
                this.f17026 = null;
            }
            if (!this.f17031.m38404(false)) {
                cancel();
                return C18736.m42768();
            }
            if (this.f17025) {
                c23915 = new C23914();
                this.f17026 = c23915;
                if (this.f17028 || mo3924()) {
                    c23915.m52984();
                }
            } else {
                c23915 = null;
            }
            try {
                InterfaceC2455 interfaceC2455M16434 = this.f17025 ? c7150.m16434(c23915) : c7150.m16434((C23914) null);
                try {
                    Iterator it = this.f17031.m38409().iterator();
                    while (it.hasNext()) {
                        m15082((AbstractC3451) it.next(), interfaceC2455M16434);
                    }
                    interfaceC2455M16434.close();
                    if (this.f17026 == c23915) {
                        this.f17026 = null;
                    }
                    return m13481();
                } catch (Throwable th) {
                    try {
                        interfaceC2455M16434.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (this.f17026 == c23915) {
                    this.f17026 = null;
                }
                throw th3;
            }
        } catch (Throwable th4) {
            if (this.f17026 == c23914) {
                this.f17026 = null;
            }
            throw th4;
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79706;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(this.f17025 ? R.string.MT_Protector : R.string.MT_Protector, m13467("targetPath"));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        mo13456("...");
    }

    @Override // p067l.AbstractC5996
    public final void cancel() {
        super.cancel();
        this.f17028 = true;
        C23914 c23914 = this.f17026;
        if (c23914 != null) {
            c23914.m52984();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m15082(AbstractC3451 abstractC3451, InterfaceC2455 interfaceC2455) throws IOException {
        if (mo3924()) {
            return;
        }
        if (abstractC3451.m6129()) {
            throw new IOException("Unsupported payload directory entry: " + abstractC3451.m6151());
        }
        this.f17031.m50045();
        int i = this.f17025 ? R.string.MT_Protector : R.string.MT_Protector;
        if (this.f17031.m50046() > 1) {
            mo13482(C7050.m16224(i) + MotionUtils.EASING_TYPE_FORMAT_START + this.f17031.m50044() + "/" + this.f17031.m50046() + MotionUtils.EASING_TYPE_FORMAT_END);
        } else {
            m13472(i);
        }
        mo13456(abstractC3451.m6139());
        if (this.f17029) {
            mo13474(0);
        } else {
            m52469(0);
            mo13474(this.f17031.m50042());
        }
        AbstractC17043 abstractC17043M6133 = abstractC3451.m6133();
        if (abstractC3451.m6120()) {
            if (abstractC3451.m6149()) {
                abstractC17043M6133 = abstractC17043M6133.m38650(true);
                abstractC3451.m6137(abstractC17043M6133);
                if (abstractC3451.m6134() != null) {
                    abstractC3451.m6148(abstractC17043M6133.getName());
                }
            } else if (abstractC3451.m6121()) {
                abstractC17043M6133.mo31069(this);
            } else {
                abstractC17043M6133.mo25503();
            }
        }
        String strM6151 = abstractC3451.m6151();
        if (strM6151.startsWith("/")) {
            strM6151 = strM6151.substring(1);
        }
        C15314 c15314Mo3449 = interfaceC2455.mo3449(strM6151);
        try {
            C24618 c24618M38671 = abstractC17043M6133.m38671("rw");
            try {
                interfaceC2455.mo3447(c15314Mo3449, c24618M38671, new C21351(this, c15314Mo3449));
                c24618M38671.close();
                if (mo3924()) {
                    abstractC17043M6133.mo29990();
                    return;
                }
                C19056 c19056M6142 = abstractC3451.m6142();
                if (c19056M6142 != null) {
                    c19056M6142.m43298(abstractC17043M6133);
                }
                this.f17031.m50038(abstractC3451.m6154());
                C16114.m36688(abstractC3451.m6141(), true);
                if (abstractC3451.m6134() != null) {
                    this.f17027.add((String) abstractC3451.m6134());
                }
            } catch (Throwable th) {
                try {
                    c24618M38671.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | RuntimeException e) {
            abstractC17043M6133.mo29990();
            throw e;
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final C18736 mo5458(Exception exc) {
        if (mo3924()) {
            return C18736.m42768();
        }
        return C18736.m42764(exc);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (c18736.m42773() && m13478(c18107)) {
            c18107.m41267();
        }
        HashSet hashSet = this.f17027;
        if (hashSet.isEmpty() || !m13461(c18108)) {
            return;
        }
        c18108.m41226((Collection) hashSet);
        c18108.m41241();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C17127.m38756();
    }
}
