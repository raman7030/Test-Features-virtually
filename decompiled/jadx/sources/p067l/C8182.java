package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8182 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public String f21593;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ ArrayList f21594;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ boolean f21595;

    /* JADX INFO: renamed from: ܳ */
    public String f21596;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ String f21597;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ AbstractActivityC5549 f21598;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ViewOnClickListenerC9523 f21599;

    public C8182(ViewOnClickListenerC9523 viewOnClickListenerC9523, AbstractActivityC5549 abstractActivityC5549, String str, ArrayList arrayList, boolean z) {
        this.f21599 = viewOnClickListenerC9523;
        this.f21598 = abstractActivityC5549;
        this.f21597 = str;
        this.f21594 = arrayList;
        this.f21595 = z;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f21598, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        ArrayList arrayList;
        C19561 c19561 = new C19561(this.f21597);
        try {
            ArrayList<C5738> arrayListM44453 = c19561.m44453();
            for (C5738 c5738 : arrayListM44453) {
                C18524.m42103(c5738.getName(), c5738.isDirectory());
            }
            Iterator it = arrayListM44453.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = this.f21594;
                if (!zHasNext) {
                    break;
                }
                C5738 c5739 = (C5738) it.next();
                if (!c5739.isDirectory() && c5739.getName().toLowerCase().endsWith(".smali")) {
                    arrayList.add(c5739);
                }
            }
            if (arrayList.size() == 1) {
                String strM52175 = C23461.m52175(c19561.m44448((C5738) arrayList.get(0)), StandardCharsets.UTF_8);
                this.f21596 = strM52175;
                String strM10026 = AbstractC4734.m10026(strM52175);
                if (strM10026 == null) {
                    throw new C3924(this.f21599.getString(R.string.MT_Protector));
                }
                this.f21593 = strM10026.substring(1, strM10026.length() - 1);
            }
            c19561.close();
        } catch (Throwable th) {
            try {
                c19561.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        ArrayList arrayList = this.f21594;
        boolean zIsEmpty = arrayList.isEmpty();
        String str = this.f21597;
        boolean z = this.f21595;
        if (zIsEmpty) {
            C22682.m50799(R.string.MT_Protector);
            if (z) {
                C18524.m42109(str, new String[0]).mo25503();
                return;
            }
            return;
        }
        int size = arrayList.size();
        ViewOnClickListenerC9523 viewOnClickListenerC9523 = this.f21599;
        if (size == 1) {
            viewOnClickListenerC9523.m22166(R.string.MT_Protector, C15993.m36347(this.f21593), C15993.m36343(this.f21593), true, new InterfaceC21152() { // from class: l.ۤܳۢ
                @Override // p067l.InterfaceC21152
                /* JADX INFO: renamed from: ֫ */
                public final Object mo9100(Object obj, Object obj2) {
                    return this.f34115.f21596;
                }
            });
            if (z) {
                C18524.m42109(str, new String[0]).mo25503();
                return;
            }
            return;
        }
        ViewOnClickListenerC9523.m22175(viewOnClickListenerC9523, str, arrayList, z);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f21598.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
