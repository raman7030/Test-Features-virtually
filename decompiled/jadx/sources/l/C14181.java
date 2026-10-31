package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.EditText;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: QA0A */
/* JADX INFO: loaded from: classes4.dex */
public final class C14181 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23354 f42819;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f42820 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f42821;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f42822;

    public C14181(AbstractActivityC3346 abstractActivityC3346, C23354 c23354, EditText editText) {
        this.f42822 = abstractActivityC3346;
        this.f42819 = c23354;
        this.f42821 = editText;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f42822, R.string.MT_Protector);
        C13136 c13136 = this.f23322;
        C11003.requireNonNull(c13136);
        c13136.m31860(new RunnableC22934(3, c13136));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws Exception {
        try {
            C12066 c12066M29443 = C12066.m29443(-1, this.f42819);
            try {
                m33827(c12066M29443, EnumC11919.SMB2_ONLY);
            } catch (Exception e) {
                try {
                    m33827(c12066M29443, EnumC11919.SMB3_ONLY);
                } catch (Exception e2) {
                    e.addSuppressed(e2);
                    throw e;
                }
            }
        } catch (Exception e3) {
            try {
                m33830();
            } catch (Exception e4) {
                e3.addSuppressed(e4);
                throw e3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33827(C12066 c12066, EnumC11919 enumC11919) throws Exception {
        try {
            C1482.m5138(c12066, m33829(), enumC11919, new C23786(4, c12066));
        } catch (Exception e) {
            C23354 c23354 = this.f42819;
            if (!TextUtils.isEmpty(c23354.f75033) || !TextUtils.isEmpty(c23354.f75032) || !m33828(e, Collections.newSetFromMap(new IdentityHashMap()))) {
                throw e;
            }
            try {
                C1482.m5138(c12066, new C2921("Guest", new char[0], null), enumC11919, new C23786(4, c12066));
                this.f42820 = true;
            } catch (Exception e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private C2921 m33829() {
        C23354 c23354 = this.f42819;
        if (TextUtils.isEmpty(c23354.f75033) && TextUtils.isEmpty(c23354.f75032)) {
            return new C2921("", new char[0], null);
        }
        if (c23354.f75033.equals("guest") && TextUtils.isEmpty(c23354.f75032)) {
            return new C2921("Guest", new char[0], null);
        }
        return new C2921(c23354.f75033, c23354.f75032.toCharArray(), c23354.f75030);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m33828(Throwable th, Set set) {
        if (th == null || !set.add(th)) {
            return false;
        }
        if (th instanceof C1092) {
            long jM3762 = ((C1092) th).m3762();
            if (jM3762 == EnumC7462.STATUS_LOGON_FAILURE.getValue() || jM3762 == EnumC7462.STATUS_ACCESS_DENIED.getValue() || jM3762 == EnumC7462.STATUS_ACCOUNT_DISABLED.getValue() || jM3762 == EnumC7462.STATUS_PASSWORD_EXPIRED.getValue()) {
                return true;
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            if (m33828(th2, set)) {
                return true;
            }
        }
        return m33828(th.getCause(), set);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m33830() throws C19369 {
        C23354 c23354 = this.f42819;
        try {
            InterfaceC18663 interfaceC18663M51762 = C23354.m51762(c23354.f75030, c23354.f75033, c23354.f75032);
            StringBuilder sb = new StringBuilder();
            String str = c23354.f75031;
            int i = c23354.f75034;
            StringBuilder sb2 = new StringBuilder("smb://");
            sb2.append(str);
            if (i != 445) {
                sb2.append(':');
                sb2.append(i);
            }
            sb.append(sb2.toString());
            sb.append("/");
            C12914 c12914 = ((C16750) interfaceC18663M51762).get(sb.toString());
            try {
                InterfaceC5257 interfaceC5257M31361 = c12914.m31361();
                try {
                    if (interfaceC5257M31361.hasNext()) {
                        ((InterfaceC10196) interfaceC5257M31361.next()).getName();
                    }
                    interfaceC5257M31361.close();
                    c12914.close();
                } catch (Throwable th) {
                    try {
                        interfaceC5257M31361.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c12914.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (C22087 e) {
            if (TextUtils.isEmpty(c23354.f75033) && TextUtils.isEmpty(c23354.f75032)) {
                try {
                    InterfaceC18663 interfaceC18663M6359 = C17456.m40825().m6359();
                    StringBuilder sb3 = new StringBuilder();
                    String str2 = c23354.f75031;
                    int i2 = c23354.f75034;
                    StringBuilder sb4 = new StringBuilder("smb://");
                    sb4.append(str2);
                    if (i2 != 445) {
                        sb4.append(':');
                        sb4.append(i2);
                    }
                    sb3.append(sb4.toString());
                    sb3.append("/");
                    C12914 c12915 = ((C16750) interfaceC18663M6359).get(sb3.toString());
                    try {
                        InterfaceC5257 interfaceC5257M31362 = c12915.m31361();
                        try {
                            if (interfaceC5257M31362.hasNext()) {
                                ((InterfaceC10196) interfaceC5257M31362.next()).getName();
                            }
                            interfaceC5257M31362.close();
                            c12915.close();
                            this.f42820 = true;
                            return;
                        } catch (Throwable th5) {
                            try {
                                interfaceC5257M31362.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    } catch (Throwable th7) {
                        try {
                            c12915.close();
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                        throw th7;
                    }
                } catch (Exception unused) {
                    throw e;
                }
            }
            throw e;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f23322.m31868()) {
            return;
        }
        if (this.f42820) {
            this.f42821.setText("guest");
        }
        C21374.m48457(R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f23322.m31868()) {
            return;
        }
        this.f42822.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        if (this.f23322.m31868()) {
            return;
        }
        m20273();
    }
}
