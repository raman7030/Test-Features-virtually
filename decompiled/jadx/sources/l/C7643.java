package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.۟ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public class C7643 extends AbstractC6138 {

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f23608 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20439(BufferedInputStream bufferedInputStream, AbstractC15440 abstractC15440, long j, C19277 c19277) throws IOException {
        int i;
        OutputStream outputStreamMo23555 = abstractC15440.mo23555(false);
        try {
            byte[] bArr = new byte[1024];
            while (j > 0 && (i = bufferedInputStream.read(bArr, 0, (int) Math.min(1024, j))) != -1) {
                c19277.m44460(i);
                outputStreamMo23555.write(bArr, 0, i);
                j -= (long) i;
                if (mo1526()) {
                    break;
                }
            }
            if (outputStreamMo23555 != null) {
                outputStreamMo23555.close();
            }
            if (mo1526()) {
                abstractC15440.mo23552();
            } else {
                this.f23608.add(abstractC15440.getName());
            }
        } catch (Throwable th) {
            if (outputStreamMo23555 != null) {
                try {
                    outputStreamMo23555.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76960;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector, C9523.m24404(m11556("file")), C4925.m14327(R.string.MT_Protector));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        mo11520("...");
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() throws IOException {
        AbstractC15440 abstractC15440M11515 = m11515("file");
        C20344 c20344 = (C20344) m11529("arguments");
        String strM11556 = m11556("pattern");
        C17721.m41504(abstractC15440M11515, EnumC16309.MODIFY_DIRECTORY);
        try {
            if (!c20344.m46667()) {
                m20440(abstractC15440M11515, c20344, strM11556);
            } else {
                long jMo23127 = abstractC15440M11515.mo23127();
                C19277 c19277 = new C19277(jMo23127 > 4611686018427387903L ? C13132.FOREVER_NS : jMo23127 * 2);
                c19277.m44459(new C23786(3, this));
                C14677.m34979(new C12582(abstractC15440M11515), new C13992(this, abstractC15440M11515, strM11556), c20344, c19277, new C23674(this));
            }
        } catch (C11877 unused) {
        }
        if (!mo1526() && c20344.f65669) {
            abstractC15440M11515.mo27929();
        }
        return m11545();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:3:0x001a, B:5:0x0020, B:9:0x0038, B:16:0x004b, B:18:0x005c, B:20:0x0062, B:28:0x007e, B:33:0x0090, B:32:0x0087, B:24:0x0075, B:26:0x0079, B:10:0x003b), top: B:44:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:3:0x001a, B:5:0x0020, B:9:0x0038, B:16:0x004b, B:18:0x005c, B:20:0x0062, B:28:0x007e, B:33:0x0090, B:32:0x0087, B:24:0x0075, B:26:0x0079, B:10:0x003b), top: B:44:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x0087 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:3:0x001a, B:5:0x0020, B:9:0x0038, B:16:0x004b, B:18:0x005c, B:20:0x0062, B:28:0x007e, B:33:0x0090, B:32:0x0087, B:24:0x0075, B:26:0x0079, B:10:0x003b), top: B:44:0x001a }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20440(AbstractC15440 abstractC15440, C20344 c20344, String str) throws IOException {
        int i;
        long j;
        long j2;
        int i2;
        int length;
        int i3;
        String strM20442;
        long j3;
        long j4;
        String parent;
        AbstractC15440 abstractC15440M39866;
        long jMo23127 = abstractC15440.mo23127();
        C19277 c19277 = new C19277(jMo23127);
        c19277.m44459(new C23786(3, this));
        BufferedInputStream bufferedInputStreamM36518 = abstractC15440.m36518();
        try {
            if (c20344.f65671 == 0) {
                j = ((long) c20344.f65665) * (1 << (c20344.f65672 * 10));
                i = (int) (jMo23127 / j);
                if (((long) i) * j != jMo23127 || i == 0) {
                    i++;
                }
            } else {
                i = c20344.f65666;
                j = jMo23127 / ((long) i);
                if (j < 1 && j < jMo23127) {
                    j2 = 1;
                }
                i2 = (int) (jMo23127 - (((long) i) * j2));
                length = String.valueOf(i).length();
                i3 = 1;
                while (i3 <= i && !mo1526()) {
                    strM20442 = m20442(i3, length, str);
                    mo11520(strM20442);
                    if (i3 == i) {
                        j4 = C13132.FOREVER_NS;
                    } else {
                        if (i - i3 < i2) {
                            j4 = j2 + 1;
                        } else {
                            j3 = j2;
                        }
                        parent = abstractC15440.getParent();
                        if (parent == null) {
                            abstractC15440M39866 = null;
                        } else {
                            abstractC15440M39866 = C16999.m39866(parent, strM20442);
                        }
                        long j5 = j3;
                        int i4 = i3;
                        m20439(bufferedInputStreamM36518, abstractC15440M39866, j5, c19277);
                        i3 = i4 + 1;
                    }
                    j3 = j4;
                    parent = abstractC15440.getParent();
                    if (parent == null) {
                        abstractC15440M39866 = null;
                    } else {
                        abstractC15440M39866 = C16999.m39866(parent, strM20442);
                    }
                    long j6 = j3;
                    int i5 = i3;
                    m20439(bufferedInputStreamM36518, abstractC15440M39866, j6, c19277);
                    i3 = i5 + 1;
                }
                bufferedInputStreamM36518.close();
            }
            j2 = j;
            i2 = (int) (jMo23127 - (((long) i) * j2));
            length = String.valueOf(i).length();
            i3 = 1;
            while (i3 <= i) {
                strM20442 = m20442(i3, length, str);
                mo11520(strM20442);
                if (i3 == i) {
                    j4 = C13132.FOREVER_NS;
                } else {
                    if (i - i3 < i2) {
                        j4 = j2 + 1;
                    } else {
                        j3 = j2;
                    }
                    parent = abstractC15440.getParent();
                    if (parent == null) {
                        abstractC15440M39866 = null;
                    } else {
                        abstractC15440M39866 = C16999.m39866(parent, strM20442);
                    }
                    long j7 = j3;
                    int i6 = i3;
                    m20439(bufferedInputStreamM36518, abstractC15440M39866, j7, c19277);
                    i3 = i6 + 1;
                }
                j3 = j4;
                parent = abstractC15440.getParent();
                if (parent == null) {
                    abstractC15440M39866 = null;
                } else {
                    abstractC15440M39866 = C16999.m39866(parent, strM20442);
                }
                long j8 = j3;
                int i7 = i3;
                m20439(bufferedInputStreamM36518, abstractC15440M39866, j8, c19277);
                i3 = i7 + 1;
            }
            bufferedInputStreamM36518.close();
        } catch (Throwable th) {
            try {
                bufferedInputStreamM36518.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        ArrayList arrayList = this.f23608;
        if (arrayList.isEmpty() || !m11542(c16560)) {
            return;
        }
        c16560.m39000((Collection) arrayList);
        c16560.m39015();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m20442(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        while (sb.length() < i2) {
            sb.insert(0, '0');
        }
        return str.replace("{D}", sb.toString());
    }
}
