package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۧۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z202 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10738 extends AbstractC16891 implements InterfaceC19944 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final HashMap f32352 = new HashMap();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f32353;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6993 f32354;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String f32355;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f32356;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C19247 f32357;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C16415 f32358;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f32359;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f32360;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23926 f32361;

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۗ */
    public final String mo6007() {
        return "zip";
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۧ֫ */
    public final boolean mo6015() {
        return true;
    }

    static {
        C13654.m32812("zip");
        C9214.m23656("zip", "local", new C22068(0));
        C9214.m23656("zip", "zip", new C19952());
        C9214.m23656("local", "zip", new C4429());
    }

    public C10738(int i, String str) throws IOException {
        super(i, "/");
        this.f32358 = new C16415("zip", null);
        this.f32361 = new C23926(this);
        this.f32359 = new C22773(this);
        this.f32354 = new C6993(this);
        this.f32360 = new C1565(this);
        C19247 c19247 = new C19247(str);
        this.f32357 = c19247;
        String str2 = (String) f32352.get(str);
        if (str2 != null && !str2.isEmpty()) {
            c19247.m44387(Charset.forName(str2));
        }
        this.f32355 = c19247.m44380().getName();
        m39745(str);
        try {
            mo14824(false);
        } catch (IOException e) {
            if (!(e instanceof FileNotFoundException)) {
                C19401 c19401 = new C19401(C4925.m14327(R.string.MT_Protector));
                c19401.initCause((Throwable) e);
                throw c19401;
            }
            throw e;
        }
    }

    public C10738(C12951 c12951) {
        super(c12951);
        this.f32358 = new C16415("zip", null);
        this.f32361 = new C23926(this);
        this.f32359 = new C22773(this);
        this.f32354 = new C6993(this);
        this.f32360 = new C1565(this);
        C19247 c19247M44378 = C19247.m44378(c12951);
        this.f32357 = c19247M44378;
        this.f32355 = c19247M44378.m44380().getName();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final void mo6004(C10130 c10130) {
        super.mo6004(c10130);
        this.f32357.mo7643(c10130);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۙ */
    public final String mo6009() {
        return this.f32355 + super.mo6009();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC13921 mo6020() {
        return this.f32357;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩶ */
    public final C19247 mo6020() {
        return this.f32357;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۤ */
    public final List mo6012() {
        C19247 c19247 = this.f32357;
        if (c19247.m44393() == null) {
            mo14824(false);
        }
        ArrayList arrayListMo7637 = c19247.mo7637(m39741(), true);
        arrayListMo7637.add(0, C15688.f48358);
        return arrayListMo7637;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC1661 mo15172() {
        return new C23934(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ܺ */
    public final AbstractC1661 mo15169() {
        return new C6358(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۘ */
    public final AbstractC1661 mo6008() {
        return new C7001(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26935(C2450 c2450, ArrayList arrayList) {
        if (c2450.m7923()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        if (C13858.m33214(c2450)) {
            arrayList2.add(new C13858());
            arrayList2.add(new C13153());
        }
        C14173 c14173 = this.f51866;
        if (c14173 != null) {
            if (c14173.m33824("arsc")) {
                arrayList2.add(new C15584());
            } else if (this.f51866.m33824("dex")) {
                arrayList2.add(new C19114());
            } else if (this.f51866.m33824("folder")) {
                arrayList2.add(new C9942());
            } else if (this.f51866.m33824("zip") || this.f51866.m33823()) {
                arrayList2.add(new C15730());
            } else if (this.f51866.m33824("apk")) {
                arrayList2.add(new C19114());
                arrayList2.add(new C15730(R.string.MT_Protector, R.drawable.MT_Protector));
                arrayList2.add(new C15584());
                arrayList2.add(new C9236());
            } else {
                arrayList2.add(new C16436());
            }
            if (!this.f51866.m33824("folder")) {
                C14173 c14174 = this.f51866;
                if (c14174.f42801 == c14174.f42803) {
                    arrayList2.add(new C7119());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        int iM39730 = AbstractC16891.m39730();
        if (arrayList2.size() % 2 != 0 && !C2326.m7584().mo1456(c2450)) {
            arrayList.set(iM39730, (AbstractC1661) arrayList2.remove(0));
        }
        arrayList.addAll(arrayList2);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC10834 mo14827() {
        return C13350.m32325();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ܳ */
    public final C12244 mo6017() {
        C19247 c19247 = this.f32357;
        return new C12244(this.f32355, c19247.m44391(), c19247.m44394() ? C19883.f64197 : C19883.f64233);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo6011() {
        return this.f32357.m44385();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo6016() {
        return this.f32357.m44392();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final void mo6006(C16560 c16560, C16560 c16561) {
        c16561.m39053(this.f32355);
        c16561.m39033(this.f32357.m44380().m36511(), true);
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6014(String str) {
        C3545 entry = this.f32357.getEntry(str.substring(1));
        return (entry == null || entry.isDirectory()) ? false : true;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ܽ */
    public final void mo6018(C16560 c16560) {
        if (this.f32356) {
            return;
        }
        List<C5977> listM39739 = m39739();
        if (listM39739.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C5977 c5977 : listM39739) {
            if (c5977.m16773()) {
                arrayList.add(c5977);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        c16560.m39056().m127();
        m26931(c16560, arrayList, arrayList.size() == 1 ? C4925.m14306(R.string.MT_Protector, ((C5977) arrayList.get(0)).m16774()) : C4925.m14327(R.string.MT_Protector) + "\n" + C9679.m24609(arrayList, "\n"), this.f32357.m44384());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m26931(final C16560 c16560, final ArrayList arrayList, String str, final String str2) {
        this.f32356 = true;
        C19258 c19258BuildDialog = c16560.m39056().buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44424(str);
        c19258BuildDialog.m44428(false);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۗۙ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C10738.m26928(this.f9542, c16560, arrayList, str2);
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, new DialogInterfaceOnClickListenerC7388(2, this, arrayList));
        if (this.f32357.m44394()) {
            c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
            this.f32353 = dialogInterfaceC0206M44438;
            C10025.m25199(c16560, dialogInterfaceC0206M44438, str2);
            return;
        }
        this.f32353 = c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26928(C10738 c10738, C16560 c16560, ArrayList arrayList, String str) {
        c10738.f32353 = null;
        if (c16560.m39044() != c10738) {
            return;
        }
        new C12190(c10738, c16560, c10738, arrayList, c10738.f32357.m44394(), str, c16560, arrayList, str).m48406();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26926(C10738 c10738, ArrayList arrayList) {
        c10738.f32353 = null;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C5977) it.next()).m16771();
        }
        c10738.f32356 = false;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC15440 mo6013(InterfaceC17889 interfaceC17889) {
        AbstractC15440 abstractC15440M36526 = this.f51870.m36526(C4303.m12893(m39741()) + "/" + interfaceC17889.getName());
        abstractC15440M36526.mo23545();
        return abstractC15440M36526;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ֫ */
    public final void mo6005(C16560 c16560, List list, Runnable runnable) {
        new C11485(this, c16560, list, runnable).m20274();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ܰ */
    public final void mo15167() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f32353;
        if (dialogInterfaceC0206 == null || !dialogInterfaceC0206.m1442()) {
            return;
        }
        this.f32353.dismiss();
        this.f32353 = null;
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ᩺ */
    public final void mo6021() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f32353;
        if (dialogInterfaceC0206 == null || !dialogInterfaceC0206.m1442()) {
            return;
        }
        this.f32353.dismiss();
        this.f32353 = null;
    }

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final String m26937() {
        return this.f32357.m44391();
    }

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final byte[] m26940() {
        return this.f32357.m44388();
    }

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final boolean m26939() {
        return this.f32357.m44395();
    }

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final boolean m26936() {
        return this.f32357.m44394();
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final String m26938() {
        return this.f32357.m44390();
    }

    @Override // l.AbstractC16891
    /* JADX INFO: renamed from: ۛ */
    public final List mo6010() {
        return Arrays.asList(AbstractC16891.f51864, this.f32361, this.f32359, this.f32354, AbstractC16891.f51865, AbstractC16891.f51860, new C7970(), AbstractC16891.f51857, this.f32360, m39743(), AbstractC16891.m39729(), AbstractC16891.m39725(R.string.MT_Protector, true));
    }

    @Override // l.InterfaceC19944
    /* JADX INFO: renamed from: ֫ */
    public final void mo13540(C16415 c16415) {
        this.f32358 = c16415;
    }

    @Override // l.InterfaceC19944
    /* JADX INFO: renamed from: ֫ */
    public final C16415 mo13539() {
        return this.f32358;
    }

    @Override // l.InterfaceC19944
    /* JADX INFO: renamed from: ֫ */
    public final void mo13541(final C16560 c16560, View view, final C16415 c16415, final InterfaceC17827 interfaceC17827) {
        C21282 c21282 = new C21282(view.getContext(), view, 0);
        C3060 c3060M48304 = c21282.m48304();
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        C12937.m31442(c3060M48304, R.string.MT_Protector);
        c21282.m48306();
        c21282.m48302(new InterfaceC14930() { // from class: l.۬ۙ᩻
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C10738.m26930(this.f38705, interfaceC17827, c16560, c16415, menuItem);
                return true;
            }
        });
        C19871.m45698(c21282).m42637();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26930(C10738 c10738, InterfaceC17827 interfaceC17827, C16560 c16560, C16415 c16415, MenuItem menuItem) {
        interfaceC17827.mo5458();
        if (menuItem.getItemId() == R.string.MT_Protector) {
            new C14298(c16560, c10738).m34118(c16415.f50492, new RunnableC16251(2, interfaceC17827));
            return;
        }
        new C13600(c10738, c16560, C16999.m39866(c10738.f32357.m44391(), new String[0]), (List) C5378.stream(c16415.f50492).map(new C20528(3)).collect(C22976.toList()), new RunnableC16251(2, interfaceC17827), c16560).m38204();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26927(C10738 c10738, C16560 c16560) {
        new C13600(c10738, c16560, C16999.m39866(c10738.f32357.m44391(), new String[0]), null, null, c16560).m38204();
    }
}
