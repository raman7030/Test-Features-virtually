package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J1YX */
/* JADX INFO: loaded from: classes5.dex */
public class C16398 extends AbstractC23625 {

    /* JADX INFO: renamed from: ۚ֫ */
    public static final /* synthetic */ int f48189 = 0;

    /* JADX INFO: renamed from: ֡֫ */
    public C19561 f48190;

    /* JADX INFO: renamed from: ۘ֫ */
    public ArrayList f48191 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ֫ */
    public long f48192;

    /* JADX INFO: renamed from: ᩵֫ */
    public C23105 f48193;

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79709;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(R.string.MT_Protector, m13453("zipPath"), C7050.m16224(R.string.MT_Protector));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        mo13456("...");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() {
        char c;
        String strM13492 = m13492("zipPath");
        C14677 c14677M33572 = C14677.m33572(m13496(AbstractC0213e.f989m));
        String strM33593 = c14677M33572.m33593();
        int i = c14677M33572.readInt();
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        while (true) {
            boolean z = true;
            c = 1;
            if (i2 >= i) {
                break;
            }
            String strM33594 = c14677M33572.m33593();
            String strM33595 = c14677M33572.m33593();
            byte b = c14677M33572.readByte();
            String strConcat = strM33593.concat(strM33594);
            String strConcat2 = strM33593.concat(strM33595);
            boolean z2 = (b & 1) != 0;
            if ((b & 2) == 0) {
                z = false;
            }
            arrayList.add(new C19752(strConcat, strConcat2, z2, z));
            i2++;
        }
        int i3 = c14677M33572.readInt();
        HashSet hashSet = new HashSet(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            hashSet.add(c14677M33572.m33593());
        }
        C13457 c13457M13469 = m13469();
        boolean zM13488 = m13488("keepApkSigBlock");
        AbstractC17043 abstractC17043M42109 = C18524.m42109(strM13492, new String[0]);
        this.f48190 = new C19561(abstractC17043M42109);
        C23105 c23105M52841 = C23775.m52841(abstractC17043M42109, c13457M13469 != null);
        this.f48193 = c23105M52841;
        C10844 c10844M51527 = c23105M52841.m51527();
        if (c13457M13469 == null && zM13488 && this.f48190.m44460()) {
            c10844M51527.m24990(this.f48190);
        }
        if (this.f48190.m44471()) {
            c10844M51527.m24999();
        }
        Collection<C5738> collectionM44469 = this.f48190.m44469();
        C19081 c19081 = new C19081(this, C23775.m52838(collectionM44469));
        int i5 = 0;
        for (C5738 c5738 : collectionM44469) {
            if (mo3924()) {
                return C18736.m42768();
            }
            if (!hashSet.contains(c5738.getName())) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && !((C19752) it.next()).m44887(c5738)) {
                }
                i5++;
                mo13482(C7050.m16224(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i5 + "/" + collectionM44469.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                mo13456(c5738.getName());
                if (c5738.isDirectory()) {
                    c10844M51527.m24987(c5738);
                } else {
                    C23775.m52845(c5738, this.f48190, c10844M51527, c19081);
                    this.f48192 += c5738.m12774();
                }
            }
        }
        m52469(100);
        mo13474(100);
        c10844M51527.close();
        if (c13457M13469 != null) {
            C11896.m27217(this.f48193, c13457M13469, this);
        }
        if (mo3924()) {
            return C18736.m42768();
        }
        C20272.m45790(abstractC17043M42109);
        C19056 c19056 = new C19056();
        c19056.m43296(abstractC17043M42109);
        this.f48193.m51526(abstractC17043M42109, new RunnableC18012(c == true ? 1 : 0, this, abstractC17043M42109), this.f48190);
        c19056.m43298(abstractC17043M42109);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String strM44886 = ((C19752) it2.next()).m44886();
            if (strM44886 != null) {
                this.f48191.add(strM44886);
            }
        }
        return C18736.m42767();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (c18736.m42773() && m13478(c18107)) {
            c18107.m41267();
            c18107.m41226((Collection) this.f48191);
            c18107.m41241();
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C23105 c23105;
        if (!c18736.m42773() && (c23105 = this.f48193) != null) {
            C2700.m4192(c23105.m51527());
            this.f48193.m51525().mo25503();
        }
        C2700.m4192(this.f48190);
        C17127.m38756();
    }
}
