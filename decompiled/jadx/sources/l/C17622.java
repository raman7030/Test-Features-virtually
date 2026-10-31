package l;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܿ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB3C */
/* JADX INFO: loaded from: classes.dex */
public final class C17622 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int f53839 = 20000000;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static CharSequence f53840;

    /* JADX INFO: renamed from: ܳܶܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f53841;

    static {
        ApplicationC12518.m30701(135);
        f53841 = new short[]{3872, -32164, -32256, -32179, -32190, -32177, -32163, -32163, -32153, -32190, -32190, -32181, -32183, -32177, -32190, -32242, -32163, -32181, -32181, -32187, -32256, -32170, -32189, -32190, -32164, -32181, -32163, -32191, -32165, -32164, -32179, -32181, -32163, -32256, -32177, -32164, -32163, -32179, -32149, -32131, -32130, -32153, -32130, -32149};
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static native C11273 m41184(AbstractC3322 abstractC3322, boolean z, int i, InterfaceC17066 interfaceC17066, boolean z2);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11273 m41182() {
        CharSequence charSequence = f53840;
        if (charSequence != null) {
            f53840 = null;
        } else {
            charSequence = "";
        }
        return new C11273("\n", charSequence, 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11273 m41185(C4733 c4733, int i, InterfaceC17066 interfaceC17066) {
        return m41184(c4733, false, i, interfaceC17066, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11273 m41183(AbstractC3322 abstractC3322, boolean z, int i, InterfaceC17066 interfaceC17066) {
        return m41184(abstractC3322, z, i, interfaceC17066, false);
    }

    /* JADX WARN: Code duplicated, block: B:144:0x024a A[Catch: all -> 0x02a8, LOOP:5: B:142:0x0244->B:144:0x024a, LOOP_END, TryCatch #8 {all -> 0x02a8, blocks: (B:147:0x0256, B:148:0x0263, B:150:0x0269, B:153:0x0273, B:154:0x0288, B:135:0x0220, B:136:0x0227, B:138:0x022d, B:139:0x0237, B:140:0x023c, B:141:0x023d, B:142:0x0244, B:144:0x024a, B:145:0x0254, B:155:0x0289, B:156:0x0290, B:158:0x0296, B:50:0x00d4, B:51:0x00df, B:54:0x00e7, B:83:0x0173, B:96:0x0195, B:98:0x019d, B:97:0x0199, B:100:0x01a2, B:59:0x00f8, B:61:0x00fe, B:63:0x0105, B:64:0x010b, B:68:0x0137, B:74:0x014a, B:76:0x015b, B:77:0x015f, B:70:0x0141, B:72:0x0146, B:78:0x0167, B:79:0x016c, B:116:0x01c6, B:117:0x01e7, B:118:0x01eb, B:120:0x01f1, B:121:0x01f7, B:125:0x01fd, B:126:0x0204, B:127:0x0205, B:131:0x0214), top: B:184:0x0093, outer: #12, inners: #11, #11, #10 }] */
    @InterfaceC12992
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11273 m41186(InterfaceC18328 interfaceC18328, int i, InterfaceC17066 interfaceC17066) throws IOException {
        int iM35149;
        ExecutorService executorServiceNewFixedThreadPool;
        Iterator it;
        int i2;
        String str;
        CharSequence string;
        InputStream inputStreamMo6972 = interfaceC18328.mo6972();
        try {
            inputStreamMo6972.mark(32768);
            byte[] bArr = new byte[32768];
            int iM49844 = C22194.m49844(inputStreamMo6972, bArr, 32768);
            String str2 = "\n";
            if (iM49844 <= 0) {
                C11273 c11273 = new C11273("\n", "", C14776.f45134);
                inputStreamMo6972.close();
                return c11273;
            }
            int i3 = -1;
            if (iM49844 == 0) {
                iM35149 = C14776.f45134;
            } else {
                iM35149 = i;
                if (iM35149 == -1) {
                    String strM38652 = C16398.m38652(iM49844, bArr);
                    iM35149 = strM38652 == null ? -1 : C14776.m35149(strM38652);
                    if (iM35149 == -1) {
                        iM35149 = C14776.m35152(iM49844, bArr);
                    }
                }
            }
            inputStreamMo6972.reset();
            if (iM35149 == C14776.f45134 || iM35149 == C14776.f45120) {
                if (C11250.m27837(iM49844, bArr)) {
                    C22194.m49856(3L, inputStreamMo6972);
                }
            } else if (iM35149 == C14776.f45129) {
                if (C11250.m27830(iM49844, bArr)) {
                    C22194.m49856(2L, inputStreamMo6972);
                }
            } else if (iM35149 == C14776.f45122) {
                if (C11250.m27834(iM49844, bArr)) {
                    C22194.m49856(2L, inputStreamMo6972);
                }
            } else if (iM35149 == C14776.f45123) {
                if (C11250.m27836(iM49844, bArr)) {
                    C22194.m49856(4L, inputStreamMo6972);
                }
            } else if (iM35149 == C14776.f45133 && C11250.m27838(iM49844, bArr)) {
                C22194.m49856(4L, inputStreamMo6972);
            }
            try {
                C12828 c12828 = new C12828(new InputStreamReader(inputStreamMo6972, C14776.m35151(iM35149)));
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[0] = null;
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                String str3 = "tmp_" + UUID.randomUUID() + "_";
                ArrayList arrayList2 = new ArrayList();
                ExecutorService executorService = C1802.f6211;
                executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C17615.f53826);
                try {
                    try {
                        try {
                            final AtomicInteger atomicInteger = new AtomicInteger();
                            int i4 = f53839;
                            int length = 0;
                            boolean z = false;
                            String str4 = null;
                            while (true) {
                                int i5 = c12828.read();
                                if (i5 == i3) {
                                    String str5 = str4 == null ? str2 : str4;
                                    if (!z) {
                                        C11273 c11274 = new C11273(str5, sb, iM35149);
                                        executorServiceNewFixedThreadPool.shutdownNow();
                                        inputStreamMo6972.close();
                                        return c11274;
                                    }
                                    if (length > 0) {
                                        AbstractC15440 abstractC15440M36526 = C17852.m41819().m36526(str3 + arrayList.size());
                                        m41188(abstractC15440M36526, sb);
                                        arrayList.add(abstractC15440M36526);
                                    }
                                    Iterator it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                        try {
                                            ((Future) it2.next()).get();
                                        } catch (InterruptedException unused) {
                                        } catch (ExecutionException e) {
                                            Throwable cause = e.getCause();
                                            C11003.requireNonNull(cause);
                                            throw cause;
                                        }
                                    }
                                    C11273 c11275 = new C11273(charSequenceArr[0], str5, arrayList, iM35149);
                                    executorServiceNewFixedThreadPool.shutdownNow();
                                    inputStreamMo6972.close();
                                    return c11275;
                                }
                                if (length >= i4) {
                                    char c = (char) i5;
                                    int i6 = C2164.f7153;
                                    str = str2;
                                    if (c < 55296 || c >= 57344) {
                                        if (interfaceC17066.mo1526()) {
                                            throw new CancellationException();
                                        }
                                        while (atomicInteger.get() >= 3) {
                                            SystemClock.sleep(10L);
                                        }
                                        final AbstractC15440 abstractC15440M36527 = C17852.m41819().m36526(str3 + arrayList.size());
                                        int iLastIndexOf = TextUtils.lastIndexOf(sb, '\n') + 1;
                                        if (iLastIndexOf >= sb.length() - 1000) {
                                            i2 = 0;
                                            try {
                                                string = sb.subSequence(0, iLastIndexOf);
                                                sb.delete(0, iLastIndexOf);
                                            } catch (OutOfMemoryError unused2) {
                                                charSequenceArr[i2] = null;
                                                sb.setLength(i2);
                                                sb.trimToSize();
                                                Iterator it3 = arrayList2.iterator();
                                                while (it3.hasNext()) {
                                                    ((Future) it3.next()).get();
                                                }
                                                arrayList2.clear();
                                                System.gc();
                                                f53839 = (int) (f53839 * 0.75f);
                                                throw new C16916();
                                            }
                                        } else {
                                            string = sb.toString();
                                            sb.setLength(0);
                                        }
                                        final CharSequence charSequence = string;
                                        atomicInteger.incrementAndGet();
                                        arrayList2.add(executorServiceNewFixedThreadPool.submit(new Callable() { // from class: l.ܰܶᩳ
                                            @Override // java.util.concurrent.Callable
                                            public final Object call() throws IOException {
                                                C17622.m41188(abstractC15440M36527, charSequence);
                                                atomicInteger.decrementAndGet();
                                                return null;
                                            }
                                        }));
                                        if (!z) {
                                            charSequenceArr[0] = charSequence;
                                            z = true;
                                        }
                                        length = sb.length();
                                        arrayList.add(abstractC15440M36527);
                                    }
                                } else {
                                    str = str2;
                                }
                                if (i5 == 13) {
                                    sb.append('\n');
                                    int i7 = length + 1;
                                    int i8 = c12828.read();
                                    if (str4 == null) {
                                        str4 = i8 == 10 ? "\r\n" : "\r";
                                    }
                                    if (i8 == -1 || i8 == 10) {
                                        length = i7;
                                    } else {
                                        if (i8 == 13) {
                                            sb.append('\n');
                                        } else {
                                            sb.append((char) i8);
                                        }
                                        length += 2;
                                    }
                                } else {
                                    sb.append((char) i5);
                                    length++;
                                }
                                i3 = -1;
                                str2 = str;
                            }
                        } catch (OutOfMemoryError unused3) {
                            i2 = 0;
                        }
                    } catch (CancellationException unused4) {
                        m41187(arrayList2);
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            ((AbstractC15440) it4.next()).mo23552();
                        }
                        executorServiceNewFixedThreadPool.shutdownNow();
                        inputStreamMo6972.close();
                        return null;
                    } catch (RuntimeException e2) {
                        e = e2;
                        m41187(arrayList2);
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((AbstractC15440) it.next()).mo23552();
                        }
                        throw e;
                    }
                } catch (IOException e3) {
                    e = e3;
                    m41187(arrayList2);
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC15440) it.next()).mo23552();
                    }
                    throw e;
                } catch (Error e4) {
                    e = e4;
                    m41187(arrayList2);
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC15440) it.next()).mo23552();
                    }
                    throw e;
                } catch (Throwable th) {
                    m41187(arrayList2);
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        ((AbstractC15440) it5.next()).mo23552();
                    }
                    throw new IOException(th);
                }
            } catch (Throwable th2) {
                executorServiceNewFixedThreadPool.shutdownNow();
                throw th2;
            }
        } catch (Throwable th3) {
            if (inputStreamMo6972 == null) {
                throw th3;
            }
            try {
                inputStreamMo6972.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41187(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Future future = (Future) it.next();
            future.cancel(true);
            try {
                future.get();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41188(AbstractC15440 abstractC15440, CharSequence charSequence) throws IOException {
        int length = charSequence.length();
        C13533 c13533 = new C13533(new C2951(new C10007(abstractC15440.mo23555(false))));
        try {
            c13533.append(charSequence, 0, length);
            c13533.close();
        } catch (Throwable th) {
            try {
                c13533.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
