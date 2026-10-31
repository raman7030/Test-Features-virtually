package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9R5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3637 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0814 f11489;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f11490;

    public C3637(ActivityC0814 activityC0814, boolean z) {
        this.f11489 = activityC0814;
        this.f11490 = z;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f11489, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        C20317 c20317M21929;
        C10130 c10130 = new C10130();
        C9028 c9028M23276 = C9028.m23276(new C23326(ActivityC0814.f2970.m36526("arsc")), EnumC9734.ERROR);
        ActivityC0814 activityC0814 = this.f11489;
        for (C7870<C14925> c7870 : activityC0814.f2973.values()) {
            c7870.m21152();
            if (c7870.m21156()) {
                C13309 c13309 = new C13309();
                Iterator it = c9028M23276.mo21936().iterator();
                while (it.hasNext()) {
                    for (C20317 c20317 : ((C8322) it.next()).mo12850()) {
                        String typeName = c20317.getTypeName();
                        if (typeName.equals("string") || typeName.equals("array") || typeName.equals("plurals")) {
                            for (C2678 c2678 : c20317.mo2872()) {
                                if (c2678.mo18743().m49025().equals(c7870.m21157())) {
                                    for (C18906 c18906 : c2678.mo18746()) {
                                        c13309.m32289(c18906.mo47884(), c18906);
                                    }
                                }
                            }
                        }
                    }
                }
                for (C14925 c14925 : c7870) {
                    C18906 c18907 = (C18906) c13309.m32284(c14925.f45501, (Integer) null);
                    C11003.requireNonNull(c18907);
                    C4794 value = c18907.getValue(c14925.f45504);
                    String str = c14925.f45505;
                    if (str != null) {
                        C21982 c21982M49462 = C21982.m49462(str);
                        value.m13996(c21982M49462.m49464(), c21982M49462.m49463());
                    } else if (!value.mo5008().getValue().equals(c14925.f45502)) {
                        C21982 c21982M49463 = C21982.m49462(c14925.f45502);
                        value.m13996(c21982M49463.m49464(), c21982M49463.m49463());
                    }
                }
            }
        }
        if (!activityC0814.f2976.isChecked()) {
            c9028M23276.m23284();
        } else {
            Collection<C7870> collectionValues = activityC0814.f2973.values();
            C8322 c8322M23286 = c9028M23276.m23286();
            if (c8322M23286 == null) {
                int i = 23;
                while (true) {
                    if (i < 38) {
                        try {
                            c8322M23286 = c9028M23276.m23281(i, "bin.mt.plus.TranslationData");
                            break;
                        } catch (RuntimeException unused) {
                            i++;
                        }
                    } else {
                        throw new RuntimeException("This should not happen");
                    }
                }
            }
            C20317 c20318 = null;
            C20317 c20319 = null;
            for (C20317 c203110 : c8322M23286.mo12850()) {
                if (c203110.getTypeName().equals(am.av)) {
                    c20318 = c203110;
                } else if (c203110.getTypeName().equals("b")) {
                    c20319 = c203110;
                }
            }
            if (c20318 != null) {
                c8322M23286.m21918(c20318.mo2870());
            }
            if (c20319 != null) {
                c8322M23286.m21918(c20319.mo2870());
            }
            Iterator it2 = c8322M23286.mo12850().iterator();
            do {
                if (!it2.hasNext()) {
                    c20317M21929 = null;
                    break;
                }
                c20317M21929 = (C20317) it2.next();
            } while (!c20317M21929.getTypeName().equals(am.aF));
            if (c20317M21929 == null) {
                c20317M21929 = c8322M23286.m21929();
            }
            c20317M21929.m46620();
            boolean z = false;
            boolean z2 = false;
            for (C7870<C14925> c7871 : collectionValues) {
                ArrayList arrayList = new ArrayList();
                for (C14925 c14926 : c7871) {
                    if (c14926.f45505 != null) {
                        arrayList.add(c14926);
                    }
                }
                if (!arrayList.isEmpty()) {
                    c20317M21929.m46624(arrayList.size());
                    try {
                        C2678 c2678M46617 = c20317M21929.m46617(c7871.m21157());
                        int i2 = 0;
                        while (i2 < arrayList.size()) {
                            C14925 c14927 = (C14925) arrayList.get(i2);
                            c20317M21929.m46611(i2, "_", z);
                            C18906 c18906M8392 = c2678M46617.m8392(i2);
                            c18906M8392.m43647(true);
                            c18906M8392.m43638(c14927.f45501);
                            C21982 c21982M49464 = C21982.m49462(c14927.f45502);
                            C21982 c21982M49465 = C21982.m49462(c14927.f45505);
                            c18906M8392.m43640(c21982M49464.m49464(), c21982M49464.m49463(), -1).m13997(c14927.f45504);
                            c18906M8392.m43640(c21982M49465.m49464(), c21982M49465.m49463(), -1).m13997(c14927.f45504);
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
                c9028M23276.m23284();
            }
        }
        c9028M23276.m23285();
        c9028M23276.m23283(c10130, (C19277) null);
        AbstractC15440 abstractC15440 = activityC0814.f2972;
        abstractC15440.getClass();
        abstractC15440.m36497(new C16146(0, c10130));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        boolean z = this.f11490;
        ActivityC0814 activityC0814 = this.f11489;
        if (z) {
            activityC0814.finish();
            return;
        }
        activityC0814.f2979 = activityC0814.m3064();
        activityC0814.f2977 = false;
        C21374.m48457(R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f11489.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
