package p067l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bin.p000mt.plus.R;
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
public final class C12574 extends AbstractC18422 implements InterfaceC21323 {

    /* JADX INFO: renamed from: ۨ */
    public static final HashMap f35327 = new HashMap();

    /* JADX INFO: renamed from: ۗ */
    public DialogInterfaceC2564 f35328;

    /* JADX INFO: renamed from: ۙ */
    public final C9015 f35329;

    /* JADX INFO: renamed from: ۛ */
    public final String f35330;

    /* JADX INFO: renamed from: ۤ */
    public boolean f35331;

    /* JADX INFO: renamed from: ۫ */
    public final C20661 f35332;

    /* JADX INFO: renamed from: ۬ */
    public C17969 f35333;

    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC11994 f35334;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC11994 f35335;

    /* JADX INFO: renamed from: ᩹ */
    public final C25108 f35336;

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۗ */
    public final String mo8204() {
        return "zip";
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ֫ */
    public final boolean mo8212() {
        return true;
    }

    static {
        C15345.m34927("zip");
        C11126.m25655("zip", "local", new C23342(0));
        C11126.m25655("zip", "zip", new C21331());
        C11126.m25655("local", "zip", new C6578());
    }

    public C12574(int i, String str) throws IOException {
        super(i, "/");
        this.f35333 = new C17969("zip", null);
        this.f35336 = new C25108(this);
        this.f35334 = new C24012(this);
        this.f35329 = new C9015(this);
        this.f35335 = new C3856(this);
        C20661 c20661 = new C20661(str);
        this.f35332 = c20661;
        String str2 = (String) f35327.get(str);
        if (str2 != null && !str2.isEmpty()) {
            c20661.m46681(Charset.forName(str2));
        }
        this.f35330 = c20661.m46674().getName();
        m41986(str);
        try {
            mo16732(false);
        } catch (IOException e) {
            if (!(e instanceof FileNotFoundException)) {
                C20807 c20807 = new C20807(C7050.m16224(R.string.MT_Protector));
                c20807.initCause((Throwable) e);
                throw c20807;
            }
            throw e;
        }
    }

    public C12574(C14677 c14677) {
        super(c14677);
        this.f35333 = new C17969("zip", null);
        this.f35336 = new C25108(this);
        this.f35334 = new C24012(this);
        this.f35329 = new C9015(this);
        this.f35335 = new C3856(this);
        C20661 c20661M46672 = C20661.m46672(c14677);
        this.f35332 = c20661M46672;
        this.f35330 = c20661M46672.m46674().getName();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8201(C11996 c11996) {
        super.mo8201(c11996);
        this.f35332.mo9714(c11996);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۙ */
    public final String mo8206() {
        return this.f35330 + super.mo8206();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC15599 mo8217() {
        return this.f35332;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩶ */
    public final C20661 mo8217() {
        return this.f35332;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۤ */
    public final List mo8209() {
        C20661 c20661 = this.f35332;
        if (c20661.m46687() == null) {
            mo16732(false);
        }
        ArrayList arrayListMo9708 = c20661.mo9708(m41982(), true);
        arrayListMo9708.add(0, C17278.f51496);
        return arrayListMo9708;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC3947 mo17075() {
        return new C25116(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܺ */
    public final AbstractC3947 mo17072() {
        return new C8412(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۘ */
    public final AbstractC3947 mo8205() {
        return new C9023(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo28979(C4697 c4697, ArrayList arrayList) {
        if (c4697.m9971()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        if (C15539.m35333(c4697)) {
            arrayList2.add(new C15539());
            arrayList2.add(new C14869());
        }
        C15838 c15838 = this.f55046;
        if (c15838 != null) {
            if (c15838.m35956("arsc")) {
                arrayList2.add(new C17179());
            } else if (this.f55046.m35956("dex")) {
                arrayList2.add(new C20534());
            } else if (this.f55046.m35956("folder")) {
                arrayList2.add(new C11817());
            } else if (this.f55046.m35956("zip") || this.f55046.m35955()) {
                arrayList2.add(new C17318());
            } else if (this.f55046.m35956("apk")) {
                arrayList2.add(new C20534());
                arrayList2.add(new C17318(R.string.MT_Protector, R.drawable.MT_Protector));
                arrayList2.add(new C17179());
                arrayList2.add(new C11146());
            } else {
                arrayList2.add(new C17989());
            }
            if (!this.f55046.m35956("folder")) {
                C15838 c15839 = this.f55046;
                if (c15839.f45888 == c15839.f45890) {
                    arrayList2.add(new C9134());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        int iM41971 = AbstractC18422.m41971();
        if (arrayList2.size() % 2 != 0 && !C4579.m9654().mo3869(c4697)) {
            arrayList.set(iM41971, (AbstractC3947) arrayList2.remove(0));
        }
        arrayList.addAll(arrayList2);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC12665 mo16735() {
        return C15057.m34426();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܳ */
    public final C14005 mo8214() {
        C20661 c20661 = this.f35332;
        return new C14005(this.f35330, c20661.m46685(), c20661.m46688() ? C21265.f66833 : C21265.f66869);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo8208() {
        return this.f35332.m46679();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo8213() {
        return this.f35332.m46686();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8203(C18107 c18107, C18107 c18108) {
        c18108.m41279(this.f35330);
        c18108.m41259(this.f35332.m46674().m38669(), true);
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8211(String str) {
        C5738 entry = this.f35332.getEntry(str.substring(1));
        return (entry == null || entry.isDirectory()) ? false : true;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܽ */
    public final void mo8215(C18107 c18107) {
        if (this.f35331) {
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
        m28975(c18107, arrayList, arrayList.size() == 1 ? C7050.m16203(R.string.MT_Protector, ((C8049) arrayList.get(0)).m18700()) : C7050.m16224(R.string.MT_Protector) + "\n" + C11567.m26623(arrayList, "\n"), this.f35332.m46678());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m28975(final C18107 c18107, final ArrayList arrayList, String str, final String str2) {
        this.f35331 = true;
        C20671 c20671BuildDialog = c18107.m41282().buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46718(str);
        c20671BuildDialog.m46722(false);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۗۙ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C12574.m28972(this.f12345, c18107, arrayList, str2);
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC9390(2, this, arrayList));
        if (this.f35332.m46688()) {
            c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
            this.f35328 = dialogInterfaceC2564M46732;
            C11896.m27216(c18107, dialogInterfaceC2564M46732, str2);
            return;
        }
        this.f35328 = c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28972(C12574 c12574, C18107 c18107, ArrayList arrayList, String str) {
        c12574.f35328 = null;
        if (c18107.m41270() != c12574) {
            return;
        }
        new C13954(c12574, c18107, c12574, arrayList, c12574.f35332.m46688(), str, c18107, arrayList, str).m50742();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m28970(C12574 c12574, ArrayList arrayList) {
        c12574.f35328 = null;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C8049) it.next()).m18697();
        }
        c12574.f35331 = false;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC17043 mo8210(InterfaceC19370 interfaceC19370) {
        AbstractC17043 abstractC17043M38684 = this.f55050.m38684(C6458.m14757(m41982()) + "/" + interfaceC19370.getName());
        abstractC17043M38684.mo25496();
        return abstractC17043M38684;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ֫ */
    public final void mo8202(C18107 c18107, List list, Runnable runnable) {
        new C13284(this, c18107, list, runnable).m22250();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ܰ */
    public final void mo17070() {
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f35328;
        if (dialogInterfaceC2564 == null || !dialogInterfaceC2564.m3855()) {
            return;
        }
        this.f35328.dismiss();
        this.f35328 = null;
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ᩺ */
    public final void mo8218() {
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f35328;
        if (dialogInterfaceC2564 == null || !dialogInterfaceC2564.m3855()) {
            return;
        }
        this.f35328.dismiss();
        this.f35328 = null;
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public final String m28981() {
        return this.f35332.m46685();
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public final byte[] m28984() {
        return this.f35332.m46682();
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public final boolean m28983() {
        return this.f35332.m46689();
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final boolean m28980() {
        return this.f35332.m46688();
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final String m28982() {
        return this.f35332.m46684();
    }

    @Override // p067l.AbstractC18422
    /* JADX INFO: renamed from: ۛ */
    public final List mo8207() {
        return Arrays.asList(AbstractC18422.f55044, this.f35336, this.f35334, this.f35329, AbstractC18422.f55045, AbstractC18422.f55040, new C9943(), AbstractC18422.f55038, this.f35335, m41984(), AbstractC18422.m41970(), AbstractC18422.m41966(R.string.MT_Protector, true));
    }

    @Override // p067l.InterfaceC21323
    /* JADX INFO: renamed from: ֫ */
    public final void mo15431(C17969 c17969) {
        this.f35333 = c17969;
    }

    @Override // p067l.InterfaceC21323
    /* JADX INFO: renamed from: ֫ */
    public final C17969 mo15430() {
        return this.f35333;
    }

    @Override // p067l.InterfaceC21323
    /* JADX INFO: renamed from: ֫ */
    public final void mo15432(final C18107 c18107, View view, final C17969 c17969, final InterfaceC19311 interfaceC19311) {
        C1898 c1898 = new C1898(view.getContext(), view, 0);
        C0994 c0994M50638 = c1898.m50638();
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
        C1484.m33529(c0994M50638, R.string.MT_Protector);
        c1898.m50640();
        c1898.m50636(new InterfaceC1583() { // from class: l.۬ۙ᩻
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C12574.m28974(this.f41748, interfaceC19311, c18107, c17969, menuItem);
                return true;
            }
        });
        C1828.m48009(c1898).m44897();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28974(C12574 c12574, InterfaceC19311 interfaceC19311, C18107 c18107, C17969 c17969, MenuItem menuItem) {
        interfaceC19311.mo7688();
        if (menuItem.getItemId() == R.string.MT_Protector) {
            new C15957(c18107, c12574).m36251(c17969.f53664, new RunnableC17814(2, interfaceC19311));
            return;
        }
        new C15294(c12574, c18107, C18524.m42109(c12574.f35332.m46685(), new String[0]), (List) C7480.stream(c17969.f53664).map(new C21878(3)).collect(C24205.toList()), new RunnableC17814(2, interfaceC19311), c18107).m40416();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28971(C12574 c12574, C18107 c18107) {
        new C15294(c12574, c18107, C18524.m42109(c12574.f35332.m46685(), new String[0]), null, null, c18107).m40416();
    }
}
