package p067l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.EditText;
import bin.p000mt.plus.R;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: QA0A */
/* JADX INFO: loaded from: classes4.dex */
public final class C15846 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C24564 f45906;

    /* JADX INFO: renamed from: ܳ */
    public boolean f45907 = false;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ EditText f45908;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractActivityC5549 f45909;

    public C15846(AbstractActivityC5549 abstractActivityC5549, C24564 c24564, EditText editText) {
        this.f45909 = abstractActivityC5549;
        this.f45906 = c24564;
        this.f45908 = editText;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f45909, R.string.MT_Protector);
        C14853 c14853 = this.f26234;
        C12826.requireNonNull(c14853);
        c14853.m33952(new RunnableC24165(3, c14853));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws Exception {
        try {
            C13836 c13836M31505 = C13836.m31505(-1, this.f45906);
            try {
                m35959(c13836M31505, EnumC13697.SMB2_ONLY);
            } catch (Exception e) {
                try {
                    m35959(c13836M31505, EnumC13697.SMB3_ONLY);
                } catch (Exception e2) {
                    e.addSuppressed(e2);
                    throw e;
                }
            }
        } catch (Exception e3) {
            try {
                m35962();
            } catch (Exception e4) {
                e3.addSuppressed(e4);
                throw e3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m35959(C13836 c13836, EnumC13697 enumC13697) throws Exception {
        try {
            C3777.m7380(c13836, m35961(), enumC13697, new C24975(4, c13836));
        } catch (Exception e) {
            C24564 c24564 = this.f45906;
            if (!TextUtils.isEmpty(c24564.f77779) || !TextUtils.isEmpty(c24564.f77778) || !m35960(e, Collections.newSetFromMap(new IdentityHashMap()))) {
                throw e;
            }
            try {
                C3777.m7380(c13836, new C5144("Guest", new char[0], null), enumC13697, new C24975(4, c13836));
                this.f45907 = true;
            } catch (Exception e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private C5144 m35961() {
        C24564 c24564 = this.f45906;
        if (TextUtils.isEmpty(c24564.f77779) && TextUtils.isEmpty(c24564.f77778)) {
            return new C5144("", new char[0], null);
        }
        if (c24564.f77779.equals("guest") && TextUtils.isEmpty(c24564.f77778)) {
            return new C5144("Guest", new char[0], null);
        }
        return new C5144(c24564.f77779, c24564.f77778.toCharArray(), c24564.f77776);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m35960(Throwable th, Set set) {
        if (th == null || !set.add(th)) {
            return false;
        }
        if (th instanceof C3406) {
            long jM6034 = ((C3406) th).m6034();
            if (jM6034 == EnumC9460.STATUS_LOGON_FAILURE.getValue() || jM6034 == EnumC9460.STATUS_ACCESS_DENIED.getValue() || jM6034 == EnumC9460.STATUS_ACCOUNT_DISABLED.getValue() || jM6034 == EnumC9460.STATUS_PASSWORD_EXPIRED.getValue()) {
                return true;
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            if (m35960(th2, set)) {
                return true;
            }
        }
        return m35960(th.getCause(), set);
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m35962() throws C20777 {
        C24564 c24564 = this.f45906;
        try {
            InterfaceC20106 interfaceC20106M54160 = C24564.m54160(c24564.f77776, c24564.f77779, c24564.f77778);
            StringBuilder sb = new StringBuilder();
            String str = c24564.f77777;
            int i = c24564.f77780;
            StringBuilder sb2 = new StringBuilder("smb://");
            sb2.append(str);
            if (i != 445) {
                sb2.append(':');
                sb2.append(i);
            }
            sb.append(sb2.toString());
            sb.append("/");
            C14642 c14642 = ((C18288) interfaceC20106M54160).get(sb.toString());
            try {
                InterfaceC7365 interfaceC7365M33447 = c14642.m33447();
                try {
                    if (interfaceC7365M33447.hasNext()) {
                        ((InterfaceC12059) interfaceC7365M33447.next()).getName();
                    }
                    interfaceC7365M33447.close();
                    c14642.close();
                } catch (Throwable th) {
                    try {
                        interfaceC7365M33447.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c14642.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (C23360 e) {
            if (TextUtils.isEmpty(c24564.f77779) && TextUtils.isEmpty(c24564.f77778)) {
                try {
                    InterfaceC20106 interfaceC20106M8532 = C18959.m43083().m8532();
                    StringBuilder sb3 = new StringBuilder();
                    String str2 = c24564.f77777;
                    int i2 = c24564.f77780;
                    StringBuilder sb4 = new StringBuilder("smb://");
                    sb4.append(str2);
                    if (i2 != 445) {
                        sb4.append(':');
                        sb4.append(i2);
                    }
                    sb3.append(sb4.toString());
                    sb3.append("/");
                    C14642 c14643 = ((C18288) interfaceC20106M8532).get(sb3.toString());
                    try {
                        InterfaceC7365 interfaceC7365M33448 = c14643.m33447();
                        try {
                            if (interfaceC7365M33448.hasNext()) {
                                ((InterfaceC12059) interfaceC7365M33448.next()).getName();
                            }
                            interfaceC7365M33448.close();
                            c14643.close();
                            this.f45907 = true;
                            return;
                        } catch (Throwable th5) {
                            try {
                                interfaceC7365M33448.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    } catch (Throwable th7) {
                        try {
                            c14643.close();
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

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f26234.m33960()) {
            return;
        }
        if (this.f45907) {
            this.f45908.setText("guest");
        }
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f26234.m33960()) {
            return;
        }
        this.f45909.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        if (this.f26234.m33960()) {
            return;
        }
        m22249();
    }
}
