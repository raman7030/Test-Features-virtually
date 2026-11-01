package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E1YX */
/* JADX INFO: loaded from: classes4.dex */
public class C12436 extends AbstractC23625 {

    /* JADX INFO: renamed from: ֡֫ */
    public static final /* synthetic */ int f34765 = 0;

    /* JADX INFO: renamed from: ۘ֫ */
    public long f34766;

    /* JADX INFO: renamed from: ᩴ֫ */
    public C23105 f34767;

    /* JADX INFO: renamed from: ᩵֫ */
    public C19561 f34768;

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79723;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(R.string.MT_Protector, m13453("zipPath"));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        mo13456("...");
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() {
        String[] strArrM13494 = m13494("ARG_PATHS");
        String strM13492 = m13492("zipPath");
        C13457 c13457M13469 = m13469();
        boolean zM13488 = m13488("keepApkSigBlock");
        final AbstractC17043 abstractC17043M42109 = C18524.m42109(strM13492, new String[0]);
        C19210.m43750(abstractC17043M42109, EnumC17868.MODIFY_FILE);
        this.f34768 = new C19561(abstractC17043M42109);
        C23105 c23105M52841 = C23775.m52841(abstractC17043M42109, c13457M13469 != null);
        this.f34767 = c23105M52841;
        C10844 c10844M51527 = c23105M52841.m51527();
        if (c13457M13469 == null && zM13488 && this.f34768.m44460()) {
            c10844M51527.m24990(this.f34768);
        }
        if (this.f34768.m44471()) {
            c10844M51527.m24999();
        }
        Collection<C5738> collectionM44469 = this.f34768.m44469();
        C14447 c14447 = new C14447(this, C23775.m52838(collectionM44469));
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (String str : strArrM13494) {
            if (str.endsWith("/")) {
                arrayList.add(str.substring(1));
            } else {
                hashSet.add(str.substring(1));
            }
        }
        int i = 0;
        for (C5738 c5738 : collectionM44469) {
            if (mo3924()) {
                return C18736.m42768();
            }
            if (!hashSet.contains(c5738.getName())) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (c5738.getName().startsWith((String) it.next())) {
                        }
                    } else {
                        i++;
                        mo13482(C7050.m16224(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i + "/" + collectionM44469.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                        mo13456(c5738.getName());
                        if (c5738.isDirectory()) {
                            c10844M51527.m24987(c5738);
                        } else {
                            C23775.m52845(c5738, this.f34768, c10844M51527, c14447);
                            this.f34766 += c5738.m12774();
                        }
                    }
                }
            }
            if (!c5738.isDirectory()) {
                this.f34766 += c5738.m12774();
            }
        }
        m52469(100);
        mo13474(100);
        c10844M51527.close();
        if (c13457M13469 != null) {
            C11896.m27217(this.f34767, c13457M13469, this);
        }
        if (mo3924()) {
            return C18736.m42768();
        }
        C20272.m45790(abstractC17043M42109);
        C19056 c19056 = new C19056();
        c19056.m43296(abstractC17043M42109);
        this.f34767.m51526(abstractC17043M42109, new Runnable() { // from class: l.۬᩹᩻
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = C12436.f34765;
                C12436 c12436 = this.f43167;
                c12436.m13472(R.string.MT_Protector);
                c12436.mo13456(abstractC17043M42109.getName());
            }
        }, this.f34768);
        c19056.m43298(abstractC17043M42109);
        return C18736.m42767();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (c18736.m42773() && m13478(c18107)) {
            c18107.m41241();
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C23105 c23105;
        if (!c18736.m42773() && (c23105 = this.f34767) != null) {
            C2700.m4192(c23105.m51527());
            this.f34767.m51525().mo25503();
        }
        C2700.m4192(this.f34768);
        C17127.m38756();
    }
}
