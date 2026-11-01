package p067l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import bin.p000mt.plugin.api.p002ui.dialog.ProgressDialog;
import bin.p000mt.plugin.api.util.Consumer;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗۖܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5171 implements InterfaceC4595, InterfaceC20295, InterfaceC22304, InterfaceC6782, Consumer, InterfaceC1233 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f12162;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f12163;

    public /* synthetic */ C5171(int i, Object obj) {
        this.f12162 = i;
        this.f12163 = obj;
    }

    @Override // bin.p000mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept */
    public void mo56319accept(Object obj) {
        ((ProgressDialog) this.f12163).lambda$new$0((CharSequence) obj);
    }

    @Override // p067l.InterfaceC4595
    /* JADX INFO: renamed from: ֫ */
    public void mo8466(int i) {
        ((C11306) this.f12163).mo13474(i);
    }

    @Override // p067l.InterfaceC22304
    /* JADX INFO: renamed from: ֫ */
    public void mo11051(C11575 c11575) {
        ((C11245) this.f12163).f31295.m41281();
    }

    @Override // p067l.InterfaceC1233
    /* JADX INFO: renamed from: ֫ */
    public void mo8467(C1898 c1898) {
        ((C23194) this.f12163).f72872.suppressLayout(false);
    }

    @Override // p067l.InterfaceC6782
    /* JADX INFO: renamed from: ֫ */
    public Bitmap mo7890() {
        InterfaceC12916 interfaceC12916;
        switch (this.f12162) {
            case 3:
                interfaceC12916 = (C9367) this.f12163;
                break;
            default:
                interfaceC12916 = (InterfaceC12916) this.f12163;
                break;
        }
        return C18950.m43047(interfaceC12916);
    }

    @Override // p067l.InterfaceC20295
    /* JADX INFO: renamed from: ۧ */
    public void mo8469(AbstractC17043 abstractC17043) {
        C18107 c18107 = (C18107) this.f12163;
        try {
            C10949 c10949M25223 = C10949.m25223(abstractC17043.m38664(), EnumC11620.ERROR);
            Iterator it = c10949M25223.mo16869().m50189().iterator();
            while (it.hasNext()) {
                ((C5584) it.next()).m12357("MT管理器");
            }
            for (C10278 c10278 : c10949M25223.mo23906()) {
                for (C21678 c21678 : c10278.mo14714()) {
                    if (c21678.getTypeName().equals("^attr-private")) {
                        c10278.m23888(c21678.mo5199());
                        break;
                    }
                }
            }
            for (C10278 c10279 : c10949M25223.mo23906()) {
                c10279.m23894();
                c10279.m23898();
                Iterator it2 = c10279.mo14714().iterator();
                while (it2.hasNext()) {
                    for (C4914 c4914 : ((C21678) it2.next()).mo5201()) {
                        c4914.m10441(false);
                        Iterator it3 = c4914.mo20696().iterator();
                        while (it3.hasNext()) {
                            ((C20337) it3.next()).m45912(false);
                        }
                    }
                }
            }
            if (c10949M25223.mo16866() != 1) {
                throw new RuntimeException();
            }
            C10278 c10278Mo16867 = c10949M25223.mo16867(0);
            HashSet hashSet = new HashSet();
            for (C21678 c21679 : c10278Mo16867.mo14714()) {
                while (c21679.mo5200() > 1) {
                    c21679.m48949(c21679.mo5200() - 1);
                }
                if (!hashSet.add(c21679.getTypeName())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(c21679.getTypeName());
                    sb.append(2);
                    c21679.m48946(c21679.getTypeName() + (hashSet.add(sb.toString()) ? 2 : 3));
                }
            }
            C10949 c10949M25220 = C10949.m25220(c10949M25223, EnumC11620.ERROR);
            C11996 c11996 = new C11996();
            c10949M25220.m25229();
            c10949M25220.m25227(c11996, (C20689) null);
            abstractC17043.m38682("slim.arsc").m38654(c11996);
            C17127.m38756();
        } catch (Exception e) {
            c18107.m41282().m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
