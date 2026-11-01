package p067l;

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
public final class C19117 {

    /* JADX INFO: renamed from: ֫ */
    public static int f57033 = 20000000;

    /* JADX INFO: renamed from: ۧ */
    public static CharSequence f57034;

    /* JADX INFO: renamed from: ܳܶܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f82290;

    static {
        ApplicationC14266.m56479(135);
        f82290 = new short[]{3872, -32164, -32256, -32179, -32190, -32177, -32163, -32163, -32153, -32190, -32190, -32181, -32183, -32177, -32190, -32242, -32163, -32181, -32181, -32187, -32256, -32170, -32189, -32190, -32164, -32181, -32163, -32191, -32165, -32164, -32179, -32181, -32163, -32256, -32177, -32164, -32163, -32179, -32149, -32131, -32130, -32153, -32130, -32149};
    }

    /* JADX INFO: renamed from: ֫ */
    public static native C13083 m43430(AbstractC5526 abstractC5526, boolean z, int i, InterfaceC18588 interfaceC18588, boolean z2);

    /* JADX INFO: renamed from: ֫ */
    public static C13083 m43428() {
        CharSequence charSequence = f57034;
        if (charSequence != null) {
            f57034 = null;
        } else {
            charSequence = "";
        }
        return new C13083("\n", charSequence, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13083 m43431(C6867 c6867, int i, InterfaceC18588 interfaceC18588) {
        return m43430(c6867, false, i, interfaceC18588, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13083 m43429(AbstractC5526 abstractC5526, boolean z, int i, InterfaceC18588 interfaceC18588) {
        return m43430(abstractC5526, z, i, interfaceC18588, false);
    }

    /* JADX WARN: Code duplicated, block: B:144:0x024a A[Catch: all -> 0x02a8, LOOP:5: B:142:0x0244->B:144:0x024a, LOOP_END, TryCatch #8 {all -> 0x02a8, blocks: (B:147:0x0256, B:148:0x0263, B:150:0x0269, B:153:0x0273, B:154:0x0288, B:135:0x0220, B:136:0x0227, B:138:0x022d, B:139:0x0237, B:140:0x023c, B:141:0x023d, B:142:0x0244, B:144:0x024a, B:145:0x0254, B:155:0x0289, B:156:0x0290, B:158:0x0296, B:50:0x00d4, B:51:0x00df, B:54:0x00e7, B:83:0x0173, B:96:0x0195, B:98:0x019d, B:97:0x0199, B:100:0x01a2, B:59:0x00f8, B:61:0x00fe, B:63:0x0105, B:64:0x010b, B:68:0x0137, B:74:0x014a, B:76:0x015b, B:77:0x015f, B:70:0x0141, B:72:0x0146, B:78:0x0167, B:79:0x016c, B:116:0x01c6, B:117:0x01e7, B:118:0x01eb, B:120:0x01f1, B:121:0x01f7, B:125:0x01fd, B:126:0x0204, B:127:0x0205, B:131:0x0214), top: B:184:0x0093, outer: #12, inners: #11, #11, #10 }] */
    @InterfaceC14716
    /* JADX INFO: renamed from: ֫ */
    public static C13083 m43432(InterfaceC19788 interfaceC19788, int i, InterfaceC18588 interfaceC18588) throws IOException {
        int iM37296;
        ExecutorService executorServiceNewFixedThreadPool;
        Iterator it;
        int i2;
        String str;
        CharSequence string;
        InputStream inputStreamMo9098 = interfaceC19788.mo9098();
        try {
            inputStreamMo9098.mark(32768);
            byte[] bArr = new byte[32768];
            int iM52171 = C23461.m52171(inputStreamMo9098, bArr, 32768);
            String str2 = "\n";
            if (iM52171 <= 0) {
                C13083 c13083 = new C13083("\n", "", C16412.f48248);
                inputStreamMo9098.close();
                return c13083;
            }
            int i3 = -1;
            if (iM52171 == 0) {
                iM37296 = C16412.f48248;
            } else {
                iM37296 = i;
                if (iM37296 == -1) {
                    String strM40868 = C17953.m40868(iM52171, bArr);
                    iM37296 = strM40868 == null ? -1 : C16412.m37296(strM40868);
                    if (iM37296 == -1) {
                        iM37296 = C16412.m37299(iM52171, bArr);
                    }
                }
            }
            inputStreamMo9098.reset();
            if (iM37296 == C16412.f48248 || iM37296 == C16412.f48234) {
                if (C13061.m29899(iM52171, bArr)) {
                    C23461.m52183(3L, inputStreamMo9098);
                }
            } else if (iM37296 == C16412.f48243) {
                if (C13061.m29892(iM52171, bArr)) {
                    C23461.m52183(2L, inputStreamMo9098);
                }
            } else if (iM37296 == C16412.f48236) {
                if (C13061.m29896(iM52171, bArr)) {
                    C23461.m52183(2L, inputStreamMo9098);
                }
            } else if (iM37296 == C16412.f48237) {
                if (C13061.m29898(iM52171, bArr)) {
                    C23461.m52183(4L, inputStreamMo9098);
                }
            } else if (iM37296 == C16412.f48247 && C13061.m29900(iM52171, bArr)) {
                C23461.m52183(4L, inputStreamMo9098);
            }
            try {
                C14560 c14560 = new C14560(new InputStreamReader(inputStreamMo9098, C16412.m37298(iM37296)));
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[0] = null;
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                String str3 = "tmp_" + UUID.randomUUID() + "_";
                ArrayList arrayList2 = new ArrayList();
                ExecutorService executorService = C4081.f8990;
                executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C19110.f57020);
                try {
                    try {
                        try {
                            final AtomicInteger atomicInteger = new AtomicInteger();
                            int i4 = f57033;
                            int length = 0;
                            boolean z = false;
                            String str4 = null;
                            while (true) {
                                int i5 = c14560.read();
                                if (i5 == i3) {
                                    String str5 = str4 == null ? str2 : str4;
                                    if (!z) {
                                        C13083 c13084 = new C13083(str5, sb, iM37296);
                                        executorServiceNewFixedThreadPool.shutdownNow();
                                        inputStreamMo9098.close();
                                        return c13084;
                                    }
                                    if (length > 0) {
                                        AbstractC17043 abstractC17043M38684 = C19335.m44065().m38684(str3 + arrayList.size());
                                        m43434(abstractC17043M38684, sb);
                                        arrayList.add(abstractC17043M38684);
                                    }
                                    Iterator it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                        try {
                                            ((Future) it2.next()).get();
                                        } catch (InterruptedException unused) {
                                        } catch (ExecutionException e) {
                                            Throwable cause = e.getCause();
                                            C12826.requireNonNull(cause);
                                            throw cause;
                                        }
                                    }
                                    C13083 c13085 = new C13083(charSequenceArr[0], str5, arrayList, iM37296);
                                    executorServiceNewFixedThreadPool.shutdownNow();
                                    inputStreamMo9098.close();
                                    return c13085;
                                }
                                if (length >= i4) {
                                    char c = (char) i5;
                                    int i6 = C4426.f9939;
                                    str = str2;
                                    if (c < 55296 || c >= 57344) {
                                        if (interfaceC18588.mo3924()) {
                                            throw new CancellationException();
                                        }
                                        while (atomicInteger.get() >= 3) {
                                            SystemClock.sleep(10L);
                                        }
                                        final AbstractC17043 abstractC17043M38685 = C19335.m44065().m38684(str3 + arrayList.size());
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
                                                f57033 = (int) (f57033 * 0.75f);
                                                throw new C18446();
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
                                                C19117.m43434(abstractC17043M38685, charSequence);
                                                atomicInteger.decrementAndGet();
                                                return null;
                                            }
                                        }));
                                        if (!z) {
                                            charSequenceArr[0] = charSequence;
                                            z = true;
                                        }
                                        length = sb.length();
                                        arrayList.add(abstractC17043M38685);
                                    }
                                } else {
                                    str = str2;
                                }
                                if (i5 == 13) {
                                    sb.append('\n');
                                    int i7 = length + 1;
                                    int i8 = c14560.read();
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
                        m43433(arrayList2);
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            ((AbstractC17043) it4.next()).mo25503();
                        }
                        executorServiceNewFixedThreadPool.shutdownNow();
                        inputStreamMo9098.close();
                        return null;
                    } catch (RuntimeException e2) {
                        e = e2;
                        m43433(arrayList2);
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((AbstractC17043) it.next()).mo25503();
                        }
                        throw e;
                    }
                } catch (IOException e3) {
                    e = e3;
                    m43433(arrayList2);
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC17043) it.next()).mo25503();
                    }
                    throw e;
                } catch (Error e4) {
                    e = e4;
                    m43433(arrayList2);
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC17043) it.next()).mo25503();
                    }
                    throw e;
                } catch (Throwable th) {
                    m43433(arrayList2);
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        ((AbstractC17043) it5.next()).mo25503();
                    }
                    throw new IOException(th);
                }
            } catch (Throwable th2) {
                executorServiceNewFixedThreadPool.shutdownNow();
                throw th2;
            }
        } catch (Throwable th3) {
            if (inputStreamMo9098 == null) {
                throw th3;
            }
            try {
                inputStreamMo9098.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43433(ArrayList arrayList) {
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

    /* JADX INFO: renamed from: ֫ */
    public static void m43434(AbstractC17043 abstractC17043, CharSequence charSequence) throws IOException {
        int length = charSequence.length();
        C15230 c15230 = new C15230(new C5173(new C11879(abstractC17043.mo25506(false))));
        try {
            c15230.append(charSequence, 0, length);
            c15230.close();
        } catch (Throwable th) {
            try {
                c15230.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
