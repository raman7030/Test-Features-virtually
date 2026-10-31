package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import bin.mt.plugin.api.ui.dialog.ProgressDialog;
import bin.mt.plugin.api.util.Consumer;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗۖܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2949 implements InterfaceC2343, InterfaceC18862, InterfaceC20976, InterfaceC4644, Consumer, InterfaceC7875 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9362;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f9363;

    public /* synthetic */ C2949(int i, Object obj) {
        this.f9362 = i;
        this.f9363 = obj;
    }

    @Override // bin.mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept */
    public void mo12762accept(Object obj) {
        ((ProgressDialog) this.f9363).lambda$new$0((CharSequence) obj);
    }

    @Override // l.InterfaceC2343
    /* JADX INFO: renamed from: ֫ */
    public void mo6264(int i) {
        ((C9404) this.f9363).mo11538(i);
    }

    @Override // l.InterfaceC20976
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo8983(C9687 c9687) {
        ((C9340) this.f9363).f28346.m39055();
    }

    @Override // l.InterfaceC7875
    /* JADX INFO: renamed from: ֫ */
    public void mo6265(C21282 c21282) {
        ((C21912) this.f9363).f70158.suppressLayout(false);
    }

    @Override // l.InterfaceC4644
    /* JADX INFO: renamed from: ֫ */
    public Bitmap mo5660() {
        InterfaceC11098 interfaceC11098;
        switch (this.f9362) {
            case 3:
                interfaceC11098 = (C7364) this.f9363;
                break;
            default:
                interfaceC11098 = (InterfaceC11098) this.f9363;
                break;
        }
        return C17447.m40789(interfaceC11098);
    }

    @Override // l.InterfaceC18862
    /* JADX INFO: renamed from: ۧ */
    public void mo6267(AbstractC15440 abstractC15440) {
        C16560 c16560 = (C16560) this.f9363;
        try {
            C9028 c9028M23279 = C9028.m23279(abstractC15440.m36506(), EnumC9734.ERROR);
            Iterator it = c9028M23279.mo14959().m47859().iterator();
            while (it.hasNext()) {
                ((C3383) it.next()).m10319("MT管理器");
            }
            for (C8322 c8322 : c9028M23279.mo21936()) {
                for (C20317 c20317 : c8322.mo12850()) {
                    if (c20317.getTypeName().equals("^attr-private")) {
                        c8322.m21918(c20317.mo2870());
                        break;
                    }
                }
            }
            for (C8322 c8323 : c9028M23279.mo21936()) {
                c8323.m21924();
                c8323.m21928();
                Iterator it2 = c8323.mo12850().iterator();
                while (it2.hasNext()) {
                    for (C2678 c2678 : ((C20317) it2.next()).mo2872()) {
                        c2678.m8395(false);
                        Iterator it3 = c2678.mo18746().iterator();
                        while (it3.hasNext()) {
                            ((C18906) it3.next()).m43646(false);
                        }
                    }
                }
            }
            if (c9028M23279.mo14956() != 1) {
                throw new RuntimeException();
            }
            C8322 c8322Mo14957 = c9028M23279.mo14957(0);
            HashSet hashSet = new HashSet();
            for (C20317 c20318 : c8322Mo14957.mo12850()) {
                while (c20318.mo2871() > 1) {
                    c20318.m46626(c20318.mo2871() - 1);
                }
                if (!hashSet.add(c20318.getTypeName())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(c20318.getTypeName());
                    sb.append(2);
                    c20318.m46623(c20318.getTypeName() + (hashSet.add(sb.toString()) ? 2 : 3));
                }
            }
            C9028 c9028M23276 = C9028.m23276(c9028M23279, EnumC9734.ERROR);
            C10130 c10130 = new C10130();
            c9028M23276.m23285();
            c9028M23276.m23283(c10130, (C19277) null);
            abstractC15440.m36524("slim.arsc").m36496(c10130);
            C15528.m36596();
        } catch (Exception e) {
            c16560.m39056().m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
