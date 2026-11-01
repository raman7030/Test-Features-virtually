package p067l;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۬֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N9ZJ */
/* JADX INFO: loaded from: classes.dex */
public class C14506 extends AbstractC5375 implements InterfaceC18509 {

    /* JADX INFO: renamed from: ֫֫ */
    public static final /* synthetic */ int f41405 = 0;

    /* JADX INFO: renamed from: ۛ */
    public final Object f41406;

    /* JADX INFO: renamed from: ۟ */
    public InterfaceC1454 f41407;

    /* JADX INFO: renamed from: ۤ */
    public volatile C21213 f41408;

    /* JADX INFO: renamed from: ۨ */
    public final C10483 f41409;

    /* JADX INFO: renamed from: ۫ */
    public volatile C13836 f41410;

    /* JADX INFO: renamed from: ۬ */
    public final C5967 f41411;

    /* JADX INFO: renamed from: ܰ */
    public int f41412;

    /* JADX INFO: renamed from: ᩺ */
    public C23065 f41413;

    static {
        ApplicationC14266.m56479(IShizukuService.Stub.TRANSACTION_dispatchPackageChanged);
    }

    /* JADX INFO: renamed from: ᩺ */
    private native void m33161();

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo11731() {
        return true;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۧ */
    public final void mo11739(C11996 c11996) {
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo11750() {
        return false;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo11752() {
        return false;
    }

    public C14506(int i, AbstractC5769 abstractC5769) {
        super(i, abstractC5769);
        this.f41406 = new Object();
        this.f41409 = new C10483();
        this.f41407 = new C2435();
        this.f41411 = new C5967(new C16517(this), true);
        this.f41410 = C13836.m31505(i, abstractC5769);
        this.f41408 = new C21213(this.f41410);
        m33161();
    }

    public C14506(int i, AbstractC5769 abstractC5769, C14677 c14677) {
        this(i, abstractC5769);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ֫ */
    public final void mo11729(AbstractC5769 abstractC5769) {
        super.mo11729(abstractC5769);
        C13836 c13836M31505 = C13836.m31505(this.f12757, abstractC5769);
        if (this.f41410.equals(c13836M31505)) {
            return;
        }
        C3777.m7384(m33154(c13836M31505, false).f73017);
        this.f41411.m13377();
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۘ */
    public final String mo11732() {
        return this.f41410.f39094;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۖ */
    public final String mo11730() {
        return this.f41410.f39094;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ܽ */
    public final void mo11744(long j, String str) {
        m33157().mo9293(j, str);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ܶ */
    public final String mo11743() {
        return TextUtils.isEmpty(this.f41410.f39096) ? "/" : AbstractC18422.m41972(this.f41410.f39096);
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9717(boolean z) {
        C23224 c23224M33154;
        this.f41411.m13377();
        if (z) {
            synchronized (this.f41406) {
                c23224M33154 = m33154(this.f41410, true);
            }
            try {
                C3777.m7384(c23224M33154.f73017);
            } finally {
                m33155(c23224M33154);
            }
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC3678 mo11742(String str) {
        return m33157().mo9292(str);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo11725(long j, String str) {
        return m33157().mo9291(j, str);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo11726(String str, long j, long j2) {
        return m33157().mo9286(str, j, j2);
    }

    @Override // p067l.InterfaceC18509
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo16103(String str, long j, long j2, C11805 c11805) throws IOException {
        InterfaceC4448 interfaceC4448M33157 = m33157();
        if (interfaceC4448M33157 instanceof InterfaceC18509) {
            return ((InterfaceC18509) interfaceC4448M33157).mo16103(str, j, j2, c11805);
        }
        return interfaceC4448M33157.mo9286(str, j, j2);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۧ */
    public final OutputStream mo11737(long j, String str) {
        return m33157().mo9287(j, str);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ܽ */
    public final void mo11745(String str, boolean z) {
        m33157().mo9290(str, z);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ֫ */
    public final void mo11728(String str, String str2) {
        m33157().mo9289(str, str2);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ܿ */
    public final void mo11746(String str) {
        m33157().mo9294(str);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo11735(String str) {
        return this.f41411.m13381(str);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo11747(String str) {
        C5967 c5967 = this.f41411;
        c5967.getClass();
        return c5967.m13376(C11419.m26416(str), C11419.m26414(str)) != null;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩻ */
    public final String mo11753(String str) {
        return this.f41411.m13380(str);
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19370 mo9709(String str) {
        String strM26416 = C11419.m26416(str);
        C5650 c5650 = (C5650) this.f41411.m13376(strM26416, C11419.m26414(str));
        if (c5650 != null) {
            return new C15037(c5650, strM26416);
        }
        return null;
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo9708(String str, boolean z) {
        String strM41972 = AbstractC18422.m41972(str);
        Collection<C5650> collectionValues = this.f41411.m13382(strM41972).values();
        ArrayList arrayList = new ArrayList(collectionValues.size() + 1);
        for (C5650 c5650 : collectionValues) {
            if (z || !c5650.f13718) {
                arrayList.add(new C15037(c5650, strM41972));
            }
        }
        return arrayList;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۢ */
    public final void mo11736(String str) {
        this.f41411.m13378(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ */
    public InterfaceC4448 m33157() throws IOException {
        C21213 c21213;
        EnumC17187 enumC17187M24193;
        while (true) {
            synchronized (this.f41406) {
                while (this.f41412 > 0) {
                    try {
                        try {
                            this.f41406.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new IOException("Interrupted while waiting for SMB connection refresh to finish", e);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c21213 = this.f41408;
                enumC17187M24193 = this.f41409.m24193();
            }
            if (enumC17187M24193 == EnumC17187.UNKNOWN) {
                C11154 c11154M24192 = this.f41409.m24192(new C3106(c21213), new C9812(this, c21213));
                if (c11154M24192.m25713()) {
                    continue;
                } else {
                    enumC17187M24193 = c11154M24192.m25714();
                }
            }
            if (m33159(c21213)) {
                C6460 c6460 = new C6460(c21213, enumC17187M24193);
                if (c6460.f16698 == EnumC17187.SMB1_ONLY) {
                    return m33153(c6460.f16697);
                }
                try {
                    return new C6991(c6460.f16697.f66698, m33152(c6460.f16697, c6460.f16698), new C22554(this, c6460.f16697, c6460.f16698));
                } catch (C5119 unused) {
                    continue;
                } catch (IOException e2) {
                    if (m33159(c6460.f16697)) {
                        throw e2;
                    }
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C23224 m33154(C13836 c13836, boolean z) {
        C23224 c23224;
        synchronized (this.f41406) {
            C13836 c13837 = this.f41410;
            this.f41408.f66697 = true;
            this.f41410 = c13836;
            if (z) {
                this.f41412++;
            }
            this.f41408 = new C21213(c13836);
            this.f41409.m24194();
            this.f41406.notifyAll();
            c23224 = new C23224(c13837, z);
        }
        return c23224;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩸ */
    public final void mo11751() {
        C23224 c23224M33154;
        synchronized (this.f41406) {
            c23224M33154 = m33154(this.f41410, false);
        }
        final C13836 c13836 = c23224M33154.f73017;
        C4081.f8988.execute(new Runnable() { // from class: l.ۚ֡᩻
            @Override // java.lang.Runnable
            public final void run() {
                int i = C14506.f41405;
                C3777.m7384(c13836);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33155(C23224 c23224) {
        if (c23224.f73016) {
            synchronized (this.f41406) {
                int i = this.f41412;
                if (i > 0) {
                    this.f41412 = i - 1;
                }
                this.f41406.notifyAll();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public C12356 m33152(C21213 c21213, EnumC17187 enumC17187) throws IOException {
        EnumC13697 enumC13697;
        synchronized (this.f41406) {
            if (m33159(c21213)) {
                while (!c21213.f66697 && c21213 == this.f41408) {
                    if (this.f41412 != 0) {
                        try {
                            this.f41406.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new IOException("Interrupted while waiting for SMB connection refresh to finish", e);
                        }
                    }
                }
                throw new C5119();
            }
            throw new C5119();
        }
        try {
            C13836 c13836 = c21213.f66698;
            int i = C3777.f8087;
            if (enumC17187 == EnumC17187.SMB2_ONLY) {
                enumC13697 = EnumC13697.SMB2_ONLY;
            } else if (enumC17187 == EnumC17187.SMB3_ONLY) {
                enumC13697 = EnumC13697.SMB3_ONLY;
            } else {
                throw new IllegalArgumentException("Unsupported SMBJ protocol state: " + enumC17187);
            }
            C12356 c12356M7375 = C3777.m7375(c13836, enumC13697, c21213.f66699, c21213.f66696);
            if (c21213.f66699 && !c12356M7375.m28446()) {
                c21213.f66699 = false;
            }
            if (c21213.f66696 && !c12356M7375.m28445()) {
                c21213.f66696 = false;
            }
            synchronized (this.f41406) {
                if (!m33159(c21213)) {
                    C3777.m7378(c12356M7375);
                    throw new C5119();
                }
                if (c12356M7375.m28445() && !c21213.f66696) {
                    c21213.f66696 = true;
                }
            }
            return c12356M7375;
        } catch (IOException e2) {
            synchronized (this.f41406) {
                if (!m33159(c21213)) {
                    throw new C5119();
                }
                if (c21213.f66696) {
                    c21213.f66696 = false;
                }
                throw e2;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C23065 m33153(C21213 c21213) {
        C23065 c23065;
        synchronized (this.f41406) {
            C23065 c23066 = this.f41413;
            if (c23066 == null || !c23066.m51455().equals(c21213.f66698)) {
                C13836 c13836 = c21213.f66698;
                InterfaceC20106 interfaceC20106M54160 = C24564.m54160(c13836.f39093, c13836.f39095, c13836.f39098);
                C13836 c13837 = c21213.f66698;
                String str = c13837.f39094;
                int i = c13837.f39097;
                StringBuilder sb = new StringBuilder("smb://");
                sb.append(str);
                if (i != 445) {
                    sb.append(':');
                    sb.append(i);
                }
                this.f41413 = new C23065(c21213.f66698, interfaceC20106M54160, sb.toString());
            }
            c23065 = this.f41413;
        }
        return c23065;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public boolean m33159(C21213 c21213) {
        return !c21213.f66697 && c21213 == this.f41408;
    }
}
