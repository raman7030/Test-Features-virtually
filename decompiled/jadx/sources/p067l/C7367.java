package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p035m.C0168b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes.dex */
public final class C7367 extends AbstractC18422 implements InterfaceC21323 {

    /* JADX INFO: renamed from: ֨ۙܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f81994;

    /* JADX INFO: renamed from: ܰ */
    public static final /* synthetic */ int f19289 = 0;

    /* JADX INFO: renamed from: ۗ */
    public final C19378 f19290;

    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11994 f19291;

    /* JADX INFO: renamed from: ۛ */
    public final AbstractC11994 f19292;

    /* JADX INFO: renamed from: ۤ */
    public C17969 f19293;

    /* JADX INFO: renamed from: ۨ */
    public final AbstractC5375 f19294;

    /* JADX INFO: renamed from: ۫ */
    public DialogInterfaceC2564 f19295;

    /* JADX INFO: renamed from: ۬ */
    public final int f19296;

    /* JADX INFO: renamed from: ᩶ */
    public final C9015 f19297;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC11994 f19298;

    /* JADX INFO: renamed from: ᩹ */
    public final C25108 f19299;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f19300;

    /* JADX INFO: renamed from: ֫ */
    public static native Object m17054(C21089 c21089, Object obj);

    @Override // p067l.InterfaceC21323
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo15432(C18107 c18107, View view, C17969 c17969, InterfaceC19311 interfaceC19311) {
        C23334.m51955(this, c18107, c17969, interfaceC19311);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۗ */
    public final String mo8204() {
        return C0168b.f616k;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo8208() {
        return false;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8211(String str) {
        return false;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ֫ */
    public final boolean mo8212() {
        return true;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۨ */
    public final int mo17069() {
        return R.string.MT_Protector;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo8213() {
        return true;
    }

    static {
        ApplicationC14266.m56479(65);
        f81994 = new short[]{2443, 24793, 24722, 24727, 24706, 24727};
        C15345.m34927(C0168b.f616k);
        C11126.m25655("local", C0168b.f616k, new C15432());
        C11126.m25655("zip", C0168b.f616k, new C9398());
        C11126.m25655("tar", C0168b.f616k, new C4014());
        C11126.m25655("archive", C0168b.f616k, new C12732());
        C11126.m25655("compress", C0168b.f616k, new C18095());
        C11126.m25655("payload", C0168b.f616k, new C19437());
        C11126.m25655(C0168b.f616k, "local", new C18766());
        C11126.m25655(C0168b.f616k, C0168b.f616k, new C23342(1));
        C11126.m25655(C0168b.f616k, "zip", new C14762());
    }

    public C7367(int i, AbstractC5769 abstractC5769) {
        super(i, "/");
        this.f19293 = new C17969(C0168b.f616k, null);
        this.f19299 = new C25108(this);
        this.f19297 = new C9015(this);
        this.f19298 = new C11391(this);
        this.f19291 = new C10720(this);
        this.f19292 = new C17424(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f19296 = abstractC5769.f14161;
        AbstractC5375 abstractC5375Mo8539 = abstractC5769.mo8539(m41987());
        this.f19294 = abstractC5375Mo8539;
        abstractC5375Mo8539.f12756 = false;
        this.f19290 = new C19378(abstractC5375Mo8539);
        mo37385(abstractC5375Mo8539.mo11743());
    }

    public C7367(C14677 c14677) {
        super(c14677);
        this.f19293 = new C17969(C0168b.f616k, null);
        this.f19299 = new C25108(this);
        this.f19297 = new C9015(this);
        this.f19298 = new C11391(this);
        this.f19291 = new C10720(this);
        this.f19292 = new C17424(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f19296 = c14677.readInt();
        AbstractC5375 abstractC5375M11720 = AbstractC5375.m11720(c14677);
        this.f19294 = abstractC5375M11720;
        abstractC5375M11720.f12756 = false;
        this.f19290 = new C19378(abstractC5375M11720);
    }

    public C7367(int i, String str, int i2, AbstractC5375 abstractC5375) {
        super(i, str);
        this.f19293 = new C17969(C0168b.f616k, null);
        this.f19299 = new C25108(this);
        this.f19297 = new C9015(this);
        this.f19298 = new C11391(this);
        this.f19291 = new C10720(this);
        this.f19292 = new C17424(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f19296 = i2;
        this.f19294 = abstractC5375;
        abstractC5375.f12756 = false;
        this.f19290 = new C19378(abstractC5375);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8201(C11996 c11996) {
        super.mo8201(c11996);
        c11996.writeInt(this.f19296);
        this.f19294.mo9714(c11996);
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public final int m17071() {
        return this.f19296;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo17063(String str, boolean z) {
        AbstractC5769 abstractC5769M33131 = C14486.m33131(this.f19296);
        if (abstractC5769M33131 != null) {
            C10987.m25348(str, new C19033(abstractC5769M33131, z));
        }
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final AbstractC5769 m17074() {
        return C14486.m33131(this.f19296);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۙ */
    public final String mo8206() {
        return this.f19294.f12758.mo8544() + super.mo8206();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7367 m17055(C7367 c7367, C18107 c18107, int i) {
        C7367 c7368 = new C7367(i, c7367.m41982(), c7367.f19296, (AbstractC5375) C13589.m30905(c7367.f19294.m35469(), false));
        c18107.m41229(c7368);
        return c7368;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫֫ */
    public final boolean mo17066() {
        this.f19294.getClass();
        return true;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo17073(String str) {
        return str == null || str.equals(this.f19294.mo11732());
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC5375 mo8217() {
        return this.f19294;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC15599 mo8217() {
        return this.f19294;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩺ */
    public final void mo8218() {
        this.f19294.mo11751();
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f19295;
        if (dialogInterfaceC2564 == null || !dialogInterfaceC2564.m3855()) {
            return;
        }
        this.f19295.dismiss();
        this.f19295 = null;
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public final void m17076() {
        this.f19294.getClass();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۤ */
    public final List mo8209() {
        String strM41982 = m41982();
        boolean z = strM41982.length() > 1;
        ArrayList arrayListMo9708 = this.f19294.mo9708(strM41982, ApplicationC21448.f67650.getBoolean("show_hidden_file", true));
        if (z) {
            arrayListMo9708.add(0, C17278.f51496);
        }
        return arrayListMo9708;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC3947 mo17068(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        C24365 c24365 = new C24365(android.R.string.cut, R.drawable.MT_Protector);
        if (c18107M9967.m41261("local")) {
            C13637 c13637 = new C13637(R.string.MT_Protector, R.drawable.MT_Protector);
            c13637.m7834();
            c13637.mo7833(c24365);
            return c13637;
        }
        if (c18107M9967.m41261(C0168b.f616k)) {
            C4169 c4169 = new C4169(C0168b.f616k);
            c4169.mo7833(c24365);
            return c4169;
        }
        C6590 c6590 = new C6590();
        c6590.mo7833(c24365);
        return c6590;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֡ */
    public final AbstractC3947 mo17062() {
        return new C10001();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܺ */
    public final AbstractC3947 mo17072() {
        return new C2907(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC3947 mo17075() {
        return new C3498();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۘ */
    public final AbstractC3947 mo8205() {
        return new DialogInterfaceOnDismissListenerC24956();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۢ */
    public final AbstractC3947 mo17067() {
        return new C10955(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo17065(InterfaceC19370 interfaceC19370) {
        mo17063(interfaceC19370.getPath(), interfaceC19370.isDirectory());
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC12665 mo16735() {
        return this.f19290;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܳ */
    public final C14005 mo8214() {
        String strM41982 = m41982();
        AbstractC5375 abstractC5375 = this.f19294;
        String name = abstractC5375.f12758.getName();
        if (!abstractC5375.f12758.f14163) {
            strM41982 = abstractC5375.f12758.mo8543() + strM41982;
        }
        return new C14005(name, strM41982, abstractC5375.f12758.getIcon());
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo17064(C18107 c18107, String str, boolean z) {
        if (str.contains("/")) {
            C22682.m50793(R.string.MT_Protector);
        } else {
            new C16083(this, c18107, C11419.m26403(m41982(), str), z, str).m22250();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8203(C18107 c18107, C18107 c18108) {
        c18107.m41224(C0168b.f616k);
        AbstractC5769 abstractC5769M33131 = C14486.m33131(this.f19296);
        if (abstractC5769M33131 == null) {
            C22682.m50799(R.string.MT_Protector);
            return;
        }
        if (!C7654.m17690(c18108.m41270(), abstractC5769M33131)) {
            C11245 c11245M41242 = c18107.m41242();
            try {
                c11245M41242.m26083();
                C13746 c13746M26103 = c11245M41242.m26103();
                boolean z = false;
                for (int i = 0; i < c13746M26103.size(); i++) {
                    if (C7654.m17690((AbstractC18422) c13746M26103.get(i), abstractC5769M33131)) {
                        c11245M41242.m26069(c18108, i, false);
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    c18108.m41236(new C8188(this, c18108), new RunnableC20435(0, c18107));
                    return;
                }
            } finally {
                c11245M41242.m26092();
            }
        }
        c18107.m41244();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܽ */
    public final void mo8215(C18107 c18107) {
        if (this.f19300) {
            return;
        }
        List<C8049> listM41980 = m41980();
        if (listM41980.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C8049 c8049 : listM41980) {
            if (c8049.m18699()) {
                arrayList.add(c8049);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        c18107.m41282().m125();
        m17058(c18107, arrayList, arrayList.size() == 1 ? C7050.m16203(R.string.MT_Protector, ((C8049) arrayList.get(0)).m18700()) : C7050.m16224(R.string.MT_Protector) + "\n" + C11567.m26623(arrayList, "\n"), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m17058(final C18107 c18107, final ArrayList arrayList, String str, boolean z) {
        this.f19300 = true;
        View viewM12252 = c18107.m41282().m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(str);
        final RadioButton radioButton = (RadioButton) viewM12252.findViewById(R.id.MT_Protector);
        RadioButton radioButton2 = (RadioButton) viewM12252.findViewById(R.id.MT_Protector);
        final RadioButton radioButton3 = (RadioButton) viewM12252.findViewById(R.id.radioButton3);
        final RadioButton radioButton4 = (RadioButton) viewM12252.findViewById(R.id.radioButton4);
        if (z) {
            radioButton4.setVisibility(0);
        }
        radioButton.setChecked(true);
        ViewOnClickListenerC17443 viewOnClickListenerC17443 = new ViewOnClickListenerC17443(radioButton, radioButton2, radioButton3, radioButton4, 1);
        radioButton.setOnClickListener(viewOnClickListenerC17443);
        radioButton2.setOnClickListener(viewOnClickListenerC17443);
        radioButton3.setOnClickListener(viewOnClickListenerC17443);
        radioButton4.setOnClickListener(viewOnClickListenerC17443);
        C20671 c20671BuildDialog = c18107.m41282().buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46722(false);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩺ۢ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C7367.m17056(this.f76610, c18107, radioButton, arrayList, radioButton3, radioButton4);
            }
        });
        this.f19295 = c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17056(C7367 c7367, C18107 c18107, RadioButton radioButton, ArrayList arrayList, RadioButton radioButton2, RadioButton radioButton3) {
        AbstractC17043 abstractC17043M18694 = null;
        c7367.f19295 = null;
        if (c18107.m41270() != c7367) {
            return;
        }
        if (radioButton.isChecked()) {
            new C22120(c7367, c18107, (C22103) c18107.m41282().getLifecycle(), arrayList, c7367.f19294).m22250();
            return;
        }
        if (radioButton2.isChecked()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C8049) it.next()).m18697();
            }
        } else if (radioButton3.isChecked()) {
            Iterator it2 = arrayList.iterator();
            long jM18698 = 0;
            while (it2.hasNext()) {
                C8049 c8049 = (C8049) it2.next();
                c8049.m18697();
                if (abstractC17043M18694 == null || c8049.m18698() > jM18698) {
                    abstractC17043M18694 = c8049.m18694();
                    jM18698 = c8049.m18698();
                }
            }
            if (abstractC17043M18694 != null) {
                C18107 c18107M41252 = c18107.m41252();
                c18107M41252.m41268();
                c18107M41252.m41279(abstractC17043M18694.getName());
                c18107M41252.m41259(abstractC17043M18694.m38669(), true);
            }
        }
        c7367.f19300 = false;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܰ */
    public final void mo17070() {
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f19295;
        if (dialogInterfaceC2564 == null || !dialogInterfaceC2564.m3855()) {
            return;
        }
        this.f19295.dismiss();
        this.f19295 = null;
    }

    @Override // p067l.InterfaceC21323
    /* JADX INFO: renamed from: ֫ */
    public final void mo15431(C17969 c17969) {
        this.f19293 = c17969;
    }

    @Override // p067l.InterfaceC21323
    /* JADX INFO: renamed from: ֫ */
    public final C17969 mo15430() {
        return this.f19293;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۛ */
    public final List mo8207() {
        return Arrays.asList(AbstractC18422.f55044, this.f19299, this.f19297, AbstractC18422.f55045, AbstractC18422.f55040, AbstractC18422.f55038, this.f19292, this.f19298, this.f19291, m41984(), AbstractC18422.m41970(), AbstractC18422.m41966(R.string.MT_Protector, false));
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public static boolean m17059() {
        return ApplicationC21448.f67650.getBoolean("show_hidden_file", true);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC17043 mo8210(InterfaceC19370 interfaceC19370) {
        AbstractC17043 abstractC17043M38684 = this.f55050.m38684(C6458.m14757(m41982())).m38684(interfaceC19370.getName());
        abstractC17043M38684.mo25496();
        return abstractC17043M38684;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8202(C18107 c18107, List list, Runnable runnable) {
        new C20779(this, c18107, (C22103) c18107.m41282().getLifecycle(), list, runnable).m22250();
    }
}
