package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C6117 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f18738;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f18739;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f18740;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f18741;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f18742;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f18743;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7528 f18744;

    public C6117(ViewOnClickListenerC7528 viewOnClickListenerC7528, AbstractActivityC3346 abstractActivityC3346, String str, ArrayList arrayList, boolean z) {
        this.f18744 = viewOnClickListenerC7528;
        this.f18743 = abstractActivityC3346;
        this.f18742 = str;
        this.f18739 = arrayList;
        this.f18740 = z;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f18743, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        ArrayList arrayList;
        C18090 c18090 = new C18090(this.f18742);
        try {
            ArrayList<C3545> arrayListM42194 = c18090.m42194();
            for (C3545 c3545 : arrayListM42194) {
                C16999.m39860(c3545.getName(), c3545.isDirectory());
            }
            Iterator it = arrayListM42194.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = this.f18739;
                if (!zHasNext) {
                    break;
                }
                C3545 c3546 = (C3545) it.next();
                if (!c3546.isDirectory() && c3546.getName().toLowerCase().endsWith(".smali")) {
                    arrayList.add(c3546);
                }
            }
            if (arrayList.size() == 1) {
                String strM49848 = C22194.m49848(c18090.m42189((C3545) arrayList.get(0)), StandardCharsets.UTF_8);
                this.f18741 = strM49848;
                String strM7978 = AbstractC2489.m7978(strM49848);
                if (strM7978 == null) {
                    throw new C1637(this.f18744.getString(R.string.MT_Protector));
                }
                this.f18738 = strM7978.substring(1, strM7978.length() - 1);
            }
            c18090.close();
        } catch (Throwable th) {
            try {
                c18090.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        ArrayList arrayList = this.f18739;
        boolean zIsEmpty = arrayList.isEmpty();
        String str = this.f18742;
        boolean z = this.f18740;
        if (zIsEmpty) {
            C21374.m48463(R.string.MT_Protector);
            if (z) {
                C16999.m39866(str, new String[0]).mo23552();
                return;
            }
            return;
        }
        int size = arrayList.size();
        ViewOnClickListenerC7528 viewOnClickListenerC7528 = this.f18744;
        if (size == 1) {
            viewOnClickListenerC7528.m20190(R.string.MT_Protector, C14336.m34214(this.f18738), C14336.m34210(this.f18738), true, new InterfaceC19763() { // from class: l.ۤܳۢ
                @Override // l.InterfaceC19763
                /* JADX INFO: renamed from: ֫ */
                public final Object mo6973(Object obj, Object obj2) {
                    return this.f31153.f18741;
                }
            });
            if (z) {
                C16999.m39866(str, new String[0]).mo23552();
                return;
            }
            return;
        }
        ViewOnClickListenerC7528.m20199(viewOnClickListenerC7528, str, arrayList, z);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f18743.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
