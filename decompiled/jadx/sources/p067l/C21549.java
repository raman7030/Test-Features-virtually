package p067l;

import android.os.Looper;
import android.util.SparseArray;
import com.alipay.sdk.p010m.p033l.C0164d;
import com.alipay.sdk.p010m.p050t0.C0215b;
import java.io.IOException;
import java.util.List;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.᩶۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G8QA */
/* JADX INFO: loaded from: classes5.dex */
public final class C21549 implements InterfaceC20879 {

    /* JADX INFO: renamed from: ۗ */
    public C23345 f67958;

    /* JADX INFO: renamed from: ۙ */
    public boolean f67959;

    /* JADX INFO: renamed from: ۛ */
    public final C21727 f67960;

    /* JADX INFO: renamed from: ۤ */
    public InterfaceC3621 f67961;

    /* JADX INFO: renamed from: ۫ */
    public final C23738 f67962;

    /* JADX INFO: renamed from: ۬ */
    public final C23560 f67963;

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC20664 f67964;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC17980 f67965;

    /* JADX INFO: renamed from: ᩹ */
    public final SparseArray f67966;

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4862(C21057 c21057) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ᩳ */
    public final void mo4871() {
    }

    public C21549(InterfaceC17980 interfaceC17980) {
        interfaceC17980.getClass();
        this.f67965 = interfaceC17980;
        String str = C5792.f14228;
        Looper looperMyLooper = Looper.myLooper();
        this.f67958 = new C23345(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, interfaceC17980, new C9417());
        C23738 c23738 = new C23738();
        this.f67962 = c23738;
        this.f67960 = new C21727();
        this.f67963 = new C23560(c23738);
        this.f67966 = new SparseArray();
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ֫ */
    public final void mo47180(C13502 c13502) {
        this.f67958.m51994(c13502);
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ֫ */
    public final void mo47177(InterfaceC3621 interfaceC3621, Looper looper) {
        C23877.m52960(this.f67961 == null || this.f67963.f75033.isEmpty());
        interfaceC3621.getClass();
        this.f67961 = interfaceC3621;
        this.f67964 = this.f67965.mo35964(looper, null);
        this.f67958 = this.f67958.m51991(looper, new C18576(this, interfaceC3621));
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ֫ */
    public final void mo47166() {
        InterfaceC20664 interfaceC20664 = this.f67964;
        C23877.m52958(interfaceC20664);
        interfaceC20664.mo19707(new RunnableC22041(1, this));
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ֫ */
    public final void mo47175(List list, C17474 c17474) {
        InterfaceC3621 interfaceC3621 = this.f67961;
        interfaceC3621.getClass();
        this.f67963.m52357(list, c17474, interfaceC3621);
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ܽ */
    public final void mo47188() {
        if (this.f67959) {
            return;
        }
        C2772 c2772M48738 = m48738();
        this.f67959 = true;
        m48737(c2772M48738, -1, new C21459(c2772M48738));
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ֫ */
    public final void mo47167(int i, int i2, boolean z) {
        C2772 c2772M48734 = m48734();
        m48737(c2772M48734, 1033, new C24420(c2772M48734, i, i2, z));
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ۧ */
    public final void mo47186(C5713 c5713) {
        m48737(m48734(), 1007, new C7241());
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ۧ */
    public final void mo47184(String str, long j, long j2) {
        C2772 c2772M48734 = m48734();
        m48737(c2772M48734, 1008, new C17588(c2772M48734, str, j2, j));
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ֫ */
    public final void mo47179(C10307 c10307, C15100 c15100) {
        m48737(m48734(), 1009, new C22934());
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ֫ */
    public final void mo47169(long j) {
        m48737(m48734(), C0164d.f561a, new C17073());
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ֫ */
    public final void mo47170(long j, int i, long j2) {
        m48737(m48734(), 1011, new C9417());
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ۧ */
    public final void mo47183(String str) {
        m48737(m48734(), 1012, new ASN1BMPString$$ExternalSyntheticOutline0());
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ֫ */
    public final void mo47172(Exception exc) {
        C2772 c2772M48734 = m48734();
        m48737(c2772M48734, 1014, new C5633(c2772M48734, exc, 2));
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ܽ */
    public final void mo47189(Exception exc) {
        m48737(m48734(), 1029, new C9179());
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ֫ */
    public final void mo47176(C3424 c3424) {
        C2772 c2772M48734 = m48734();
        m48737(c2772M48734, 1031, new C5410(c2772M48734, c3424, 6));
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ۧ */
    public final void mo47185(C3424 c3424) {
        C2772 c2772M48734 = m48734();
        m48737(c2772M48734, 1032, new C20780(c2772M48734, c3424, 5));
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ܽ */
    public final void mo47190(C5713 c5713) {
        C2772 c2772M48734 = m48734();
        m48737(c2772M48734, 1015, new C21466(c2772M48734, c5713));
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ֫ */
    public final void mo47174(String str, long j, long j2) {
        m48737(m48734(), 1016, new C10965());
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ۧ */
    public final void mo47187(C10307 c10307, C15100 c15100) {
        m48737(m48734(), 1017, new C20865());
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ֫ */
    public final void mo47173(String str) {
        C2772 c2772M48734 = m48734();
        m48737(c2772M48734, 1019, new C20458(c2772M48734, str));
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ֫ */
    public final void mo47171(long j, Object obj) {
        C2772 c2772M48734 = m48734();
        m48737(c2772M48734, 26, new C4444(c2772M48734, obj, j));
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ۧ */
    public final void mo47182(Exception exc) {
        m48737(m48734(), 1030, new C20175());
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4848(int i, int i2) {
        m48737(m48734(), 24, new C14110());
    }

    @Override // p067l.InterfaceC16803
    /* JADX INFO: renamed from: ֫ */
    public final void mo23098(int i, C17474 c17474, C12782 c12782, C8758 c8758, int i2) {
        C2772 c2772M48735 = m48735(i, c17474);
        m48737(c2772M48735, 1000, new C20013(c2772M48735, c12782, c8758, i2));
    }

    @Override // p067l.InterfaceC16803
    /* JADX INFO: renamed from: ۧ */
    public final void mo23102(int i, C17474 c17474, C12782 c12782, C8758 c8758) {
        C2772 c2772M48735 = m48735(i, c17474);
        m48737(c2772M48735, 1001, new C14403(c2772M48735, c12782, c8758));
    }

    @Override // p067l.InterfaceC16803
    /* JADX INFO: renamed from: ֫ */
    public final void mo23097(int i, C17474 c17474, C12782 c12782, C8758 c8758) {
        m48737(m48735(i, c17474), C0215b.f1000c, new C10927());
    }

    @Override // p067l.InterfaceC16803
    /* JADX INFO: renamed from: ֫ */
    public final void mo23099(int i, C17474 c17474, C12782 c12782, C8758 c8758, IOException iOException, boolean z) {
        C2772 c2772M48735 = m48735(i, c17474);
        m48737(c2772M48735, C0215b.f1001d, new C21764(c2772M48735, c12782, c8758, iOException, z));
    }

    @Override // p067l.InterfaceC16803
    /* JADX INFO: renamed from: ֫ */
    public final void mo23096(int i, C17474 c17474, C8758 c8758) {
        m48737(m48735(i, c17474), 1005, new C18241());
    }

    @Override // p067l.InterfaceC16803
    /* JADX INFO: renamed from: ۧ */
    public final void mo23101(int i, C17474 c17474, final C8758 c8758) {
        final C2772 c2772M48735 = m48735(i, c17474);
        m48737(c2772M48735, 1004, new InterfaceC9934() { // from class: l.ܶ۬֫
            @Override // p067l.InterfaceC9934
            public final void invoke(Object obj) {
                ((InterfaceC3443) obj).mo6104(c2772M48735, c8758);
            }
        });
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4854(AbstractC6974 abstractC6974, int i) {
        InterfaceC3621 interfaceC3621 = this.f67961;
        interfaceC3621.getClass();
        this.f67963.m52360(interfaceC3621);
        C2772 c2772M48738 = m48738();
        m48737(c2772M48738, 0, new C21459(c2772M48738, i));
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4856(C13010 c13010, int i) {
        m48737(m48738(), 1, new C25053());
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4858(C15690 c15690) {
        C2772 c2772M48738 = m48738();
        m48737(c2772M48738, 2, new C20780(c2772M48738, c15690, 4));
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ᩳ */
    public final void mo4873(boolean z) {
        m48737(m48738(), 3, new C9199());
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4861(C20386 c20386) {
        C2772 c2772M48738 = m48738();
        m48737(c2772M48738, 13, new C19158(c2772M48738, c20386));
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ۧ */
    public final void mo4866(int i, boolean z) {
        C2772 c2772M48738 = m48738();
        m48737(c2772M48738, -1, new C10878(c2772M48738, z, i));
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ܽ */
    public final void mo4869(int i) {
        C2772 c2772M48738 = m48738();
        m48737(c2772M48738, 4, new C19158(c2772M48738, i));
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4850(int i, boolean z) {
        C2772 c2772M48738 = m48738();
        m48737(c2772M48738, 5, new C15033(c2772M48738, z, i));
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ۧ */
    public final void mo4865(int i) {
        C2772 c2772M48738 = m48738();
        m48737(c2772M48738, 6, new C20013(c2772M48738, i));
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ۧ */
    public final void mo4868(boolean z) {
        m48737(m48738(), 7, new C21740());
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ᩳ */
    public final void mo4872(int i) {
        m48737(m48738(), 8, new C10050());
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ܽ */
    public final void mo4870(boolean z) {
        m48737(m48738(), 9, new C6988());
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4849(final int i, final C7645 c7645, final C7645 c7646) {
        if (i == 1) {
            this.f67959 = false;
        }
        InterfaceC3621 interfaceC3621 = this.f67961;
        interfaceC3621.getClass();
        this.f67963.m52358(interfaceC3621);
        final C2772 c2772M48738 = m48738();
        m48737(c2772M48738, 11, new InterfaceC9934(c2772M48738, i, c7645, c7646) { // from class: l.۠۬֫

            /* JADX INFO: renamed from: ᩸ */
            public final /* synthetic */ int f28101;

            {
                this.f28101 = i;
            }

            @Override // p067l.InterfaceC9934
            public final void invoke(Object obj) {
                InterfaceC3443 interfaceC3443 = (InterfaceC3443) obj;
                interfaceC3443.getClass();
                interfaceC3443.mo6102(this.f28101);
            }
        });
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4852(C4963 c4963) {
        C2772 c2772M48738 = m48738();
        m48737(c2772M48738, 12, new C5410(c2772M48738, c4963, 5));
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4860(C19044 c19044) {
        m48737(m48738(), 14, new C14536());
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4863(C25079 c25079) {
        C2772 c2772M48738 = m48738();
        m48737(c2772M48738, 28, new C5633(c2772M48738, c25079, 1));
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4851(List list) {
        C2772 c2772M48738 = m48738();
        m48737(c2772M48738, 27, new C19368(c2772M48738, list));
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4853(C6443 c6443) {
        C2772 c2772M48738 = m48738();
        m48737(c2772M48738, 27, new C6406(c2772M48738, c6443));
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4864(boolean z) {
        C2772 c2772M48734 = m48734();
        m48737(c2772M48734, 23, new C6316(c2772M48734, z));
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4847(int i) {
        m48737(m48734(), 21, new C1514());
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4855(C8454 c8454) {
        C2772 c2772M48734 = m48734();
        m48737(c2772M48734, 25, new C24868(c2772M48734, c8454));
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4857(C13680 c13680) {
        m48737(m48738(), 19, new C7470());
    }

    @Override // p067l.InterfaceC22695
    /* JADX INFO: renamed from: ֫ */
    public final void mo23094(int i, C17474 c17474, int i2) {
        m48737(m48735(i, c17474), 1022, new C19965());
    }

    @Override // p067l.InterfaceC22695
    /* JADX INFO: renamed from: ֫ */
    public final void mo23093(int i, C17474 c17474) {
        C2772 c2772M48735 = m48735(i, c17474);
        m48737(c2772M48735, 1023, new C24420(c2772M48735));
    }

    @Override // p067l.InterfaceC22695
    /* JADX INFO: renamed from: ֫ */
    public final void mo23095(int i, C17474 c17474, Exception exc) {
        C2772 c2772M48735 = m48735(i, c17474);
        m48737(c2772M48735, 1024, new C15033(c2772M48735, exc));
    }

    @Override // p067l.InterfaceC22695
    /* JADX INFO: renamed from: ۧ */
    public final void mo23100(int i, C17474 c17474) {
        C2772 c2772M48735 = m48735(i, c17474);
        m48737(c2772M48735, 1025, new C10878(c2772M48735));
    }

    @Override // p067l.InterfaceC22695
    /* JADX INFO: renamed from: ܽ */
    public final void mo23103(int i, C17474 c17474) {
        C2772 c2772M48735 = m48735(i, c17474);
        m48737(c2772M48735, 1027, new C12832(c2772M48735));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48737(C2772 c2772, int i, InterfaceC9934 interfaceC9934) {
        this.f67966.put(i, c2772);
        this.f67958.m51997(i, interfaceC9934);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C2772 m48738() {
        return m48731(this.f67963.m52356());
    }

    @RequiresNonNull({"player"})
    /* JADX INFO: renamed from: ֫ */
    public final C2772 m48736(AbstractC6974 abstractC6974, int i, C17474 c17474) {
        C17474 c17475 = abstractC6974.m15990() ? null : c17474;
        long jMo35966 = this.f67965.mo35966();
        boolean z = abstractC6974.equals(this.f67961.mo6808()) && i == this.f67961.mo6811();
        long jM13013 = 0;
        if (c17475 == null || !c17475.m39842()) {
            if (z) {
                jM13013 = this.f67961.mo6826();
            } else if (!abstractC6974.m15990()) {
                jM13013 = C5792.m13013(abstractC6974.mo15983(i, this.f67960, 0L).f68425);
            }
        } else if (z && this.f67961.mo6838() == c17475.f52248 && this.f67961.mo6809() == c17475.f52249) {
            jM13013 = this.f67961.getCurrentPosition();
        }
        return new C2772(jMo35966, abstractC6974, i, c17475, jM13013, this.f67961.mo6808(), this.f67961.mo6811(), this.f67963.m52356(), this.f67961.getCurrentPosition(), this.f67961.mo6814());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m48732(C21549 c21549) {
        C2772 c2772M48738 = c21549.m48738();
        c21549.m48737(c2772M48738, 1028, new C17520(c2772M48738));
        c21549.f67958.m51996();
    }

    /* JADX INFO: renamed from: ֫ */
    private C2772 m48731(C17474 c17474) {
        this.f67961.getClass();
        AbstractC6974 abstractC6974M52355 = c17474 == null ? null : this.f67963.m52355(c17474);
        if (c17474 == null || abstractC6974M52355 == null) {
            int iMo6811 = this.f67961.mo6811();
            AbstractC6974 abstractC6974Mo6808 = this.f67961.mo6808();
            if (iMo6811 >= abstractC6974Mo6808.mo15987()) {
                abstractC6974Mo6808 = AbstractC6974.f18145;
            }
            return m48736(abstractC6974Mo6808, iMo6811, (C17474) null);
        }
        return m48736(abstractC6974M52355, abstractC6974M52355.mo15985(c17474.f52252, this.f67962).f75532, c17474);
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ֫ */
    public final void mo47168(int i, long j) {
        m48737(m48731(this.f67963.m52361()), 1021, new C21545());
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ֫ */
    public final void mo47178(C5713 c5713) {
        C2772 c2772M48731 = m48731(this.f67963.m52361());
        m48737(c2772M48731, 1020, new C8347(c2772M48731, c5713));
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ۧ */
    public final void mo47181(int i, long j) {
        m48737(m48731(this.f67963.m52361()), 1018, new C24104());
    }

    @Override // p067l.InterfaceC20879
    /* JADX INFO: renamed from: ᩳ */
    public final void mo47191(C5713 c5713) {
        m48737(m48731(this.f67963.m52361()), 1013, new C19925());
    }

    /* JADX INFO: renamed from: ܿ */
    private C2772 m48734() {
        return m48731(this.f67963.m52362());
    }

    @Override // p067l.InterfaceC5581
    /* JADX INFO: renamed from: ۧ */
    public final void mo12350(final long j, final int i, final long j2) {
        final C2772 c2772M48731 = m48731(this.f67963.m52359());
        m48737(c2772M48731, 1006, new InterfaceC9934(i, j, j2) { // from class: l.᩸۬֫

            /* JADX INFO: renamed from: ᩶ */
            public final /* synthetic */ long f72045;

            /* JADX INFO: renamed from: ᩹ */
            public final /* synthetic */ int f72047;

            @Override // p067l.InterfaceC9934
            public final void invoke(Object obj) {
                ((InterfaceC3443) obj).mo6103(this.f72046, this.f72047, this.f72045);
            }
        });
    }

    /* JADX INFO: renamed from: ᩳ */
    private C2772 m48735(int i, C17474 c17474) {
        this.f67961.getClass();
        if (c17474 != null) {
            if (this.f67963.m52355(c17474) != null) {
                return m48731(c17474);
            }
            return m48736(AbstractC6974.f18145, i, c17474);
        }
        AbstractC6974 abstractC6974Mo6808 = this.f67961.mo6808();
        if (i >= abstractC6974Mo6808.mo15987()) {
            abstractC6974Mo6808 = AbstractC6974.f18145;
        }
        return m48736(abstractC6974Mo6808, i, (C17474) null);
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4859(C17702 c17702) {
        C2772 c2772M48738;
        C17474 c17474;
        if ((c17702 instanceof C19735) && (c17474 = ((C19735) c17702).f60028) != null) {
            c2772M48738 = m48731(c17474);
        } else {
            c2772M48738 = m48738();
        }
        m48737(c2772M48738, 10, new C21288(c2772M48738, c17702));
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ۧ */
    public final void mo4867(C17702 c17702) {
        C2772 c2772M48738;
        C17474 c17474;
        if ((c17702 instanceof C19735) && (c17474 = ((C19735) c17702).f60028) != null) {
            c2772M48738 = m48731(c17474);
        } else {
            c2772M48738 = m48738();
        }
        m48737(c2772M48738, 10, new C6316(c2772M48738, c17702));
    }
}
