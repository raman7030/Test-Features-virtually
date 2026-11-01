package p067l;

import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R5YB */
/* JADX INFO: loaded from: classes4.dex */
public final class C16635 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ boolean f48890;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ C13457 f48891;

    /* JADX INFO: renamed from: ۜ */
    public long f48892;

    /* JADX INFO: renamed from: ۡ */
    public C23105 f48893;

    /* JADX INFO: renamed from: ۢ */
    public long f48894;

    /* JADX INFO: renamed from: ܳ */
    public HashSet f48895 = new HashSet();

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ AbstractC22672 f48896;

    /* JADX INFO: renamed from: ᩴ */
    public Collection f48897;

    /* JADX INFO: renamed from: ᩵ */
    public C19561 f48898;

    /* JADX INFO: renamed from: ᩷ */
    public C23298 f48899;

    /* JADX INFO: renamed from: ᩻ */
    public long f48900;

    public C16635(AbstractC22672 abstractC22672, C13457 c13457, boolean z) {
        this.f48896 = abstractC22672;
        this.f48891 = c13457;
        this.f48890 = z;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C23298 c23298 = new C23298(this.f48896.f71508.m41282());
        c23298.m51894(R.string.MT_Protector);
        c23298.m51892("...");
        c23298.mo51878((Runnable) null);
        c23298.m51884();
        this.f48899 = c23298;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        HashSet hashSet;
        C5738 c5738;
        C5738 c5739;
        int i;
        C13457 c13457;
        C10844 c10844;
        int i2;
        AbstractC22672 abstractC22672 = this.f48896;
        AbstractC17043 abstractC17043M42109 = C18524.m42109(abstractC22672.f71509.m28981(), new String[0]);
        C19210.m43750(abstractC17043M42109, EnumC17868.MODIFY_FILE);
        C19561 c19561 = new C19561(abstractC17043M42109);
        this.f48898 = c19561;
        this.f48897 = c19561.m44469();
        C13457 c13458 = this.f48891;
        C23105 c23105M52841 = C23775.m52841(abstractC17043M42109, c13458 != null);
        this.f48893 = c23105M52841;
        C10844 c10844M51527 = c23105M52841.m51527();
        if (c13458 == null && this.f48890 && this.f48898.m44460()) {
            c10844M51527.m24990(this.f48898);
        }
        if (this.f48898.m44471()) {
            c10844M51527.m24999();
        }
        int size = ((ArrayList) abstractC22672.f71506).size();
        this.f48900 = 0L;
        Iterator it = ((ArrayList) abstractC22672.f71506).iterator();
        while (it.hasNext()) {
            this.f48900 = ((C8049) it.next()).m18694().mo25101() + this.f48900;
        }
        this.f48892 = 0L;
        C10844 c10844M51528 = this.f48893.m51527();
        C16922 c16922 = new C16922();
        if (abstractC22672.f71505) {
            c16922.m38499(this.f48898);
        }
        Iterator it2 = ((ArrayList) abstractC22672.f71506).iterator();
        int i3 = 0;
        while (true) {
            boolean zHasNext = it2.hasNext();
            hashSet = this.f48895;
            if (!zHasNext) {
                break;
            }
            C8049 c8049 = (C8049) it2.next();
            if (this.f48899.m53444()) {
                break;
            }
            int i4 = i3 + 1;
            String strM18696 = c8049.m18696();
            AbstractC17043 abstractC17043M18694 = c8049.m18694();
            Iterator it3 = it2;
            Iterator it4 = this.f48897.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    c5738 = null;
                    break;
                }
                c5738 = (C5738) it4.next();
                Iterator it5 = it4;
                if (c5738.getName().equals(strM18696)) {
                    break;
                } else {
                    it4 = it5;
                }
            }
            if (c5738 == null) {
                c10844M51528.m24992(abstractC22672.f71505 ? C22959.m51283(strM18696, c16922) : 8);
                c10844M51528.m25000((String) null);
                c5739 = new C5738(strM18696);
            } else {
                c10844M51528.m24992(c5738.m12748());
                if (c5738.m12789()) {
                    c10844M51528.m25000(abstractC22672.f71509.m28982());
                } else {
                    c10844M51528.m25000((String) null);
                }
                c5739 = c5738;
            }
            C16922 c16923 = c16922;
            C23298 c23298 = this.f48899;
            AbstractC17043 abstractC17043 = abstractC17043M42109;
            StringBuilder sb = new StringBuilder();
            AbstractC22672 abstractC22673 = abstractC22672;
            sb.append(C7050.m16224(R.string.MT_Protector));
            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
            sb.append(i4);
            sb.append("/");
            sb.append(size);
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            c23298.m51890(sb.toString());
            this.f48899.m51892(strM18696);
            InputStream inputStreamMo29987 = abstractC17043M18694.mo29987();
            try {
                long jMo25101 = abstractC17043M18694.mo25101();
                c5739.m12786(jMo25101);
                int i5 = i4;
                c5739.setTime(abstractC17043M18694.mo25091());
                c10844M51528.m24987(c5739);
                byte[] bArr = new byte[4096];
                long j = 0;
                while (true) {
                    int i6 = inputStreamMo29987.read(bArr);
                    if (i6 > 0) {
                        i = i5;
                        c10844M51528.write(bArr, 0, i6);
                        c13457 = c13458;
                        c10844 = c10844M51527;
                        j += (long) i6;
                        this.f48899.m51885(j, c5739.getSize());
                        i2 = size;
                        byte[] bArr2 = bArr;
                        C5738 c57310 = c5739;
                        this.f48899.m51888(this.f48892 + j, this.f48900);
                        if (this.f48899.m53444()) {
                            break;
                        }
                        c13458 = c13457;
                        bArr = bArr2;
                        i5 = i;
                        c10844M51527 = c10844;
                        size = i2;
                        c5739 = c57310;
                    } else {
                        i = i5;
                        c13457 = c13458;
                        c10844 = c10844M51527;
                        i2 = size;
                        c10844M51528.m24997();
                        break;
                    }
                }
                this.f48892 += jMo25101;
                inputStreamMo29987.close();
                hashSet.add(strM18696);
                c13458 = c13457;
                it2 = it3;
                c16922 = c16923;
                abstractC17043M42109 = abstractC17043;
                i3 = i;
                abstractC22672 = abstractC22673;
                c10844M51527 = c10844;
                size = i2;
            } catch (Throwable th) {
                if (inputStreamMo29987 == null) {
                    throw th;
                }
                try {
                    inputStreamMo29987.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        AbstractC22672 abstractC22674 = abstractC22672;
        final AbstractC17043 abstractC17044 = abstractC17043M42109;
        C13457 c13459 = c13458;
        C10844 c10845 = c10844M51527;
        if (this.f48899.m53444()) {
            return;
        }
        C10844 c10844M51529 = this.f48893.m51527();
        C9931 c9931 = new C9931(this, C23775.m52838(this.f48897));
        int i7 = 0;
        for (C5738 c57311 : this.f48897) {
            if (this.f48899.m53444()) {
                break;
            }
            i7++;
            if (hashSet.contains(c57311.getName())) {
                if (!c57311.isDirectory()) {
                    this.f48894 = c57311.m12774() + this.f48894;
                }
            } else {
                this.f48899.m51890(C7050.m16224(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i7 + "/" + this.f48897.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                this.f48899.m51892(c57311.getName());
                if (c57311.isDirectory()) {
                    c10844M51529.m24987(c57311);
                } else {
                    C23775.m52845(c57311, this.f48898, c10844M51529, c9931);
                    this.f48894 = c57311.m12774() + this.f48894;
                }
            }
        }
        if (this.f48899.m53444()) {
            return;
        }
        c10845.close();
        if (c13459 != null) {
            C11896.m27210(abstractC22674.f71508.m41282(), this.f48893, c13459, this.f48899);
        }
        C20272.m45790(abstractC17044);
        C19056 c19056 = new C19056();
        c19056.m43296(abstractC17044);
        this.f48893.m51526(abstractC17044, new Runnable() { // from class: l.֨ۙ᩻
            @Override // java.lang.Runnable
            public final void run() {
                C16635 c16635 = this.f6247;
                c16635.f48899.m51894(R.string.MT_Protector);
                c16635.f48899.m51892(abstractC17044.getName());
            }
        }, this.f48898);
        c19056.m43298(abstractC17044);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        boolean zM53444 = this.f48899.m53444();
        AbstractC22672 abstractC22672 = this.f48896;
        if (!zM53444) {
            abstractC22672.f71508.m41267();
            ArrayList arrayList = new ArrayList(((ArrayList) abstractC22672.f71506).size());
            Iterator it = ((ArrayList) abstractC22672.f71506).iterator();
            while (it.hasNext()) {
                arrayList.add(((C8049) it.next()).m18700());
            }
            abstractC22672.f71508.m41226((Collection) arrayList);
            abstractC22672.f71508.m41241();
            C13954 c13954 = (C13954) abstractC22672;
            Iterator it2 = c13954.f39360.iterator();
            while (it2.hasNext()) {
                ((C8049) it2.next()).m18697();
            }
            c13954.f39358.f35331 = false;
            return;
        }
        C23105 c23105 = this.f48893;
        if (c23105 != null) {
            C2700.m4192(c23105.m51527());
            this.f48893.m51525().mo25503();
        }
        abstractC22672.mo31727();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        C23105 c23105 = this.f48893;
        if (c23105 != null) {
            C2700.m4192(c23105.m51527());
            this.f48893.m51525().mo25503();
        }
        C22682.m50800(exc.toString());
        this.f48896.mo31727();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C2700.m4192(this.f48898);
        this.f48899.m53442();
        C17127.m38756();
    }
}
