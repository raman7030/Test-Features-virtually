package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21XP */
/* JADX INFO: loaded from: classes2.dex */
public class C23031 extends AbstractC6138 {

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f74117 = 0;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f74118;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f74119;

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76956;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        m11555(R.string.MT_Protector);
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() throws IOException {
        List<AbstractC15440> list = (List) C22311.stream(m11558("ARG_PATHS")).map(new C16599(1)).collect(C22976.toList());
        C7897 c7897M21184 = C7897.m21184(15);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BufferedInputStream bufferedInputStreamM36518 = ((AbstractC15440) it.next()).m36518();
            try {
                C7897 c7897M21186 = C7897.m21186(C10619.m26650(bufferedInputStreamM36518));
                bufferedInputStreamM36518.close();
                if (c7897M21184.f24463 < c7897M21186.f24463) {
                    c7897M21184 = c7897M21186;
                }
            } catch (Throwable th) {
                try {
                    bufferedInputStreamM36518.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        boolean z = ApplicationC20075.f65008.getBoolean("delete_dex_files_after_merged", false);
        C19357 c19357 = new C19357(c7897M21184);
        for (AbstractC15440 abstractC15440 : list) {
            mo11538(0);
            mo11520(C4925.m14306(R.string.MT_Protector, abstractC15440.getName()));
            InputStream inputStreamMo27926 = abstractC15440.mo27926();
            try {
                C12918 c12918M31380 = C12918.m31380(inputStreamMo27926);
                int iM31408 = c12918M31380.m31408();
                int i = 0;
                for (C7980 c7980 : (AbstractC18605) c12918M31380.mo27438()) {
                    if (mo1526()) {
                        C17222 c17222M40521 = C17222.m40521();
                        inputStreamMo27926.close();
                        return c17222M40521;
                    }
                    mo11538(i / iM31408);
                    c19357.m44606((InterfaceC8566) c7980);
                    i += 100;
                    if (c19357.f68923.getItemCount() > 65536) {
                        throw new C1637(R.string.MT_Protector);
                    }
                    if (c19357.f68924.getItemCount() > 65536) {
                        throw new C1637(R.string.MT_Protector);
                    }
                    if (c19357.f68957.getItemCount() > 65536) {
                        throw new C1637("Merge failed, too many type references in Dex, you can try to merge fewer dex files.");
                    }
                }
                inputStreamMo27926.close();
            } catch (Throwable th3) {
                if (inputStreamMo27926 != null) {
                    try {
                        inputStreamMo27926.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
        m11555(R.string.MT_Protector);
        AbstractC15440 abstractC15440M39866 = C16999.m39866(m11556("outputPath"), new String[0]);
        this.f74119 = abstractC15440M39866;
        if (!z || !abstractC15440M39866.mo23120()) {
            c19357.m48535(this.f74119);
            if (z) {
                m51169(list);
            }
        } else {
            AbstractC15440 abstractC15440M36520 = this.f74119.m36520(".tmp");
            this.f74118 = abstractC15440M36520;
            c19357.m48535(abstractC15440M36520);
            m51169(list);
            this.f74118.m36498(this.f74119, (Runnable) null);
        }
        return C17222.m40520();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51169(List list) {
        boolean z = list.size() > 1;
        if (z) {
            m11536(R.string.MT_Protector);
            mo11538(0);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC15440 abstractC15440 = (AbstractC15440) it.next();
            if (z) {
                mo11520(abstractC15440.getName());
            }
            abstractC15440.mo23552();
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39041();
            c16560.m39053(this.f74119.getName());
            c16560.m39015();
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        AbstractC15440 abstractC15440 = this.f74118;
        if (abstractC15440 != null) {
            abstractC15440.mo23552();
        }
        C15528.m36596();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14327(R.string.MT_Protector);
    }
}
