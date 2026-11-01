package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0655am;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9R5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5825 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC3142 f14294;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ boolean f14295;

    public C5825(ActivityC3142 activityC3142, boolean z) {
        this.f14294 = activityC3142;
        this.f14295 = z;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f14294, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        C21678 c21678M23899;
        C11996 c11996 = new C11996();
        C10949 c10949M25220 = C10949.m25220(new C24538(ActivityC3142.f5741.m38684("arsc")), EnumC11620.ERROR);
        ActivityC3142 activityC3142 = this.f14294;
        for (C9848<C16553> c9848 : activityC3142.f5744.values()) {
            c9848.m23117();
            if (c9848.m23121()) {
                C1502 c1502 = new C1502();
                Iterator it = c10949M25220.mo23906().iterator();
                while (it.hasNext()) {
                    for (C21678 c21678 : ((C10278) it.next()).mo14714()) {
                        String typeName = c21678.getTypeName();
                        if (typeName.equals("string") || typeName.equals("array") || typeName.equals("plurals")) {
                            for (C4914 c4914 : c21678.mo5201()) {
                                if (c4914.mo20693().m51374().equals(c9848.m23122())) {
                                    for (C20337 c20337 : c4914.mo20696()) {
                                        c1502.m34390(c20337.mo50214(), c20337);
                                    }
                                }
                            }
                        }
                    }
                }
                for (C16553 c16553 : c9848) {
                    C20337 c20338 = (C20337) c1502.m34385(c16553.f48616, (Integer) null);
                    C12826.requireNonNull(c20338);
                    C6925 value = c20338.getValue(c16553.f48619);
                    String str = c16553.f48620;
                    if (str != null) {
                        C23260 c23260M51799 = C23260.m51799(str);
                        value.m15876(c23260M51799.m51801(), c23260M51799.m51800());
                    } else if (!value.mo7251().getValue().equals(c16553.f48617)) {
                        C23260 c23260M517910 = C23260.m51799(c16553.f48617);
                        value.m15876(c23260M517910.m51801(), c23260M517910.m51800());
                    }
                }
            }
        }
        if (!activityC3142.f5747.isChecked()) {
            c10949M25220.m25228();
        } else {
            Collection<C9848> collectionValues = activityC3142.f5744.values();
            C10278 c10278M25230 = c10949M25220.m25230();
            if (c10278M25230 == null) {
                int i = 23;
                while (true) {
                    if (i < 38) {
                        try {
                            c10278M25230 = c10949M25220.m25225(i, "bin.mt.plus.TranslationData");
                            break;
                        } catch (RuntimeException unused) {
                            i++;
                        }
                    } else {
                        throw new RuntimeException("This should not happen");
                    }
                }
            }
            C21678 c21679 = null;
            C21678 c216710 = null;
            for (C21678 c216711 : c10278M25230.mo14714()) {
                if (c216711.getTypeName().equals(C0655am.f2320av)) {
                    c21679 = c216711;
                } else if (c216711.getTypeName().equals("b")) {
                    c216710 = c216711;
                }
            }
            if (c21679 != null) {
                c10278M25230.m23888(c21679.mo5199());
            }
            if (c216710 != null) {
                c10278M25230.m23888(c216710.mo5199());
            }
            Iterator it2 = c10278M25230.mo14714().iterator();
            do {
                if (!it2.hasNext()) {
                    c21678M23899 = null;
                    break;
                }
                c21678M23899 = (C21678) it2.next();
            } while (!c21678M23899.getTypeName().equals(C0655am.f2278aF));
            if (c21678M23899 == null) {
                c21678M23899 = c10278M25230.m23899();
            }
            c21678M23899.m48943();
            boolean z = false;
            boolean z2 = false;
            for (C9848<C16553> c9849 : collectionValues) {
                ArrayList arrayList = new ArrayList();
                for (C16553 c16554 : c9849) {
                    if (c16554.f48620 != null) {
                        arrayList.add(c16554);
                    }
                }
                if (!arrayList.isEmpty()) {
                    c21678M23899.m48947(arrayList.size());
                    try {
                        C4914 c4914M48940 = c21678M23899.m48940(c9849.m23122());
                        int i2 = 0;
                        while (i2 < arrayList.size()) {
                            C16553 c16555 = (C16553) arrayList.get(i2);
                            c21678M23899.m48934(i2, "_", z);
                            C20337 c20337M10438 = c4914M48940.m10438(i2);
                            c20337M10438.m45913(true);
                            c20337M10438.m45904(c16555.f48616);
                            C23260 c23260M517911 = C23260.m51799(c16555.f48617);
                            C23260 c23260M517912 = C23260.m51799(c16555.f48620);
                            c20337M10438.m45906(c23260M517911.m51801(), c23260M517911.m51800(), -1).m15877(c16555.f48619);
                            c20337M10438.m45906(c23260M517912.m51801(), c23260M517912.m51800(), -1).m15877(c16555.f48619);
                            i2++;
                            z = false;
                        }
                        z2 = true;
                    } catch (Exception e) {
                        throw new IOException(e);
                    }
                }
                z = false;
            }
            if (!z2) {
                c10949M25220.m25228();
            }
        }
        c10949M25220.m25229();
        c10949M25220.m25227(c11996, (C20689) null);
        AbstractC17043 abstractC17043 = activityC3142.f5743;
        abstractC17043.getClass();
        abstractC17043.m38655(new C17714(0, c11996));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        boolean z = this.f14295;
        ActivityC3142 activityC3142 = this.f14294;
        if (z) {
            activityC3142.finish();
            return;
        }
        activityC3142.f5750 = activityC3142.m5377();
        activityC3142.f5748 = false;
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f14294.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
