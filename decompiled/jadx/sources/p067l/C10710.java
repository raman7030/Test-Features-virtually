package p067l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import bin.p000mt.plus.R;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۡۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C10710 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ ActivityC9368 f29670;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C18280 f29671;

    /* JADX INFO: renamed from: ܳ */
    public C24164 f29672;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ String f29673;

    /* JADX INFO: renamed from: ᩻ */
    public AbstractC17043 f29674;

    /* JADX WARN: Code duplicated, block: B:45:0x0185 A[Catch: all -> 0x0285, TryCatch #4 {all -> 0x0285, blocks: (B:15:0x00a2, B:16:0x00b3, B:18:0x00d4, B:20:0x00f5, B:21:0x00fd, B:23:0x010d, B:24:0x0121, B:25:0x0129, B:27:0x012f, B:30:0x013c, B:32:0x0148, B:34:0x015c, B:36:0x0164, B:38:0x016c, B:40:0x0174, B:42:0x017c, B:45:0x0185, B:47:0x018b), top: B:127:0x00a2, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x018b A[Catch: all -> 0x0285, TRY_LEAVE, TryCatch #4 {all -> 0x0285, blocks: (B:15:0x00a2, B:16:0x00b3, B:18:0x00d4, B:20:0x00f5, B:21:0x00fd, B:23:0x010d, B:24:0x0121, B:25:0x0129, B:27:0x012f, B:30:0x013c, B:32:0x0148, B:34:0x015c, B:36:0x0164, B:38:0x016c, B:40:0x0174, B:42:0x017c, B:45:0x0185, B:47:0x018b), top: B:127:0x00a2, outer: #1 }] */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws Exception {
        AbstractC17043 abstractC17043M38684;
        AbstractC17043 abstractC17043M43058 = C18951.m43058();
        SecureRandom secureRandom = new SecureRandom();
        do {
            long jCurrentTimeMillis = System.currentTimeMillis();
            abstractC17043M38684 = abstractC17043M43058.m38684(String.format("%08x%04x", Integer.valueOf((int) (jCurrentTimeMillis ^ (jCurrentTimeMillis >>> 32))), Integer.valueOf(secureRandom.nextInt() & 65535)));
        } while (abstractC17043M38684.mo25094());
        abstractC17043M38684.m38666();
        String name = abstractC17043M38684.getName();
        C18280 c18280 = this.f29671;
        c18280.f54573 = name;
        this.f29674 = abstractC17043M38684;
        C24164 c24164 = this.f29672;
        C12826.requireNonNull(c24164);
        C24793 c24793 = new C24793(c24164);
        C24164 c24165 = this.f29672;
        C12826.requireNonNull(c24165);
        AbstractC17043 abstractC17043M43057 = C18951.m43057(c18280);
        AbstractC17043 abstractC17043M38685 = abstractC17043M43057.m38684("packageUpload");
        AbstractC17043 abstractC17043M38686 = abstractC17043M43057.m38684("packageLocal");
        AbstractC17043 abstractC17043M38687 = abstractC17043M43057.m38684("temp");
        String str = this.f29673;
        C6751 c6751 = new C6751(C18524.m42109(str, new String[0]), false);
        if (c18280.f54579.f36317 && !c6751.m15426()) {
            throw new C3924(R.string.MT_Protector);
        }
        C19561 c19561 = new C19561(str);
        try {
            C10844 c10844 = new C10844(abstractC17043M38687);
            try {
                C10844 c10845 = new C10844(abstractC17043M38686);
                try {
                    c10844.m24992(0);
                    HashSet hashSet = new HashSet();
                    C5738 entry = c19561.getEntry(C18010.m40987(1));
                    int i = 2;
                    while (true) {
                        hashSet.add(entry.getName());
                        c10844.m24987(entry);
                        C23461.m52179(c19561.m44448(entry), c10844.m24981());
                        int i2 = i + 1;
                        C5738 entry2 = c19561.getEntry(C18010.m40987(i));
                        if (entry2 == null) {
                            break;
                        }
                        i = i2;
                        entry = entry2;
                        try {
                            c10844.close();
                            throw th;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                            throw th;
                        }
                    }
                    C5738 entry3 = c19561.getEntry("AndroidManifest.xml");
                    hashSet.add(entry3.getName());
                    c10844.m24987(entry3);
                    C23461.m52179(c19561.m44448(entry3), c10844.m24981());
                    byte[] bArrM15417 = c6751.m15417();
                    if (bArrM15417 != null) {
                        c10844.m24986("_mt_protector/signature");
                        c10844.write(bArrM15417);
                    }
                    C23470 c23470M52208 = C23470.m52208(c18280.f54579.f36314);
                    if (!c23470M52208.f74761.isEmpty()) {
                        c10844.m24986("_mt_protector/mapping");
                        c10844.write(c23470M52208.toString().getBytes(Charset.defaultCharset()));
                    }
                    for (C5738 c5738 : c19561.m44469()) {
                        if (!c5738.isDirectory()) {
                            String name2 = c5738.getName();
                            if (name2.startsWith("META-INF/")) {
                                String lowerCase = name2.substring(9).toLowerCase(Locale.US);
                                if (!"manifest.mf".equals(lowerCase) && !lowerCase.endsWith(".sf") && !lowerCase.endsWith(".rsa") && !lowerCase.endsWith(".dsa") && !lowerCase.endsWith(".ec") && !lowerCase.startsWith("sig-")) {
                                    if (!hashSet.contains(name2)) {
                                        c10845.m24988(c5738, c19561);
                                    }
                                }
                            } else if (!hashSet.contains(name2)) {
                                c10845.m24988(c5738, c19561);
                            }
                        }
                    }
                    c10845.close();
                    c10844.close();
                    c19561.close();
                    if (c24165.m53444()) {
                        return;
                    }
                    C20689 c20689 = new C20689(abstractC17043M38687.mo25101());
                    c20689.m46753(c24793);
                    OutputStream outputStreamM6039 = C3410.m6039(abstractC17043M38685.mo25506(false), 2);
                    try {
                        InputStream inputStreamMo29987 = abstractC17043M38687.mo29987();
                        try {
                            byte[] bArr = new byte[1048576];
                            do {
                                int iM52171 = C23461.m52171(inputStreamMo29987, bArr, 1048576);
                                if (iM52171 > 0) {
                                    outputStreamM6039.write(bArr, 0, iM52171);
                                    if (iM52171 < 1048576) {
                                        outputStreamM6039.flush();
                                    }
                                    c20689.m46754(iM52171);
                                } else {
                                    if (inputStreamMo29987 != null) {
                                        inputStreamMo29987.close();
                                    }
                                    outputStreamM6039.close();
                                    abstractC17043M38687.mo25503();
                                    String strM49955 = C22148.m49955(abstractC17043M38686, "MD5");
                                    c18280.f54570 = strM49955;
                                    if (strM49955 != null) {
                                        C11996 c11996 = new C11996();
                                        c11996.m27459(c18280.f54573);
                                        c11996.m27459(c18280.f54574);
                                        c11996.m27459(c18280.f54578);
                                        c11996.m27459(c18280.f54576);
                                        c11996.m27459(c18280.f54580);
                                        c11996.m27459(c18280.f54570);
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        c18280.f54577.compress(Bitmap.CompressFormat.PNG, 80, byteArrayOutputStream);
                                        c11996.m27454(byteArrayOutputStream.toByteArray());
                                        c11996.m27451(c18280.f54572);
                                        c11996.m27459(c18280.f54579.m29594());
                                        byte[] bArrM27448 = c11996.m27448();
                                        int length = bArrM27448.length;
                                        for (int i3 = 0; i3 < length; i3++) {
                                            bArrM27448[i3] = (byte) (bArrM27448[i3] ^ (i3 ^ length));
                                        }
                                        abstractC17043M43057.m38684("info").m38661(bArrM27448, 0, bArrM27448.length);
                                        return;
                                    }
                                    throw new Exception("Get md5 fail");
                                }
                            } while (!c24165.m53444());
                            if (inputStreamMo29987 != null) {
                                inputStreamMo29987.close();
                            }
                            outputStreamM6039.close();
                        } catch (Throwable th2) {
                            if (inputStreamMo29987 == null) {
                                throw th2;
                            }
                            try {
                                inputStreamMo29987.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            outputStreamM6039.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                } catch (Throwable th6) {
                    try {
                        c10845.close();
                        throw th6;
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                        throw th6;
                    }
                }
            } catch (Throwable th8) {
                c10844.close();
                throw th8;
            }
        } catch (Throwable th9) {
            try {
                c19561.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public C10710(ActivityC9368 activityC9368, C18280 c18280, String str) {
        this.f29670 = activityC9368;
        this.f29671 = c18280;
        this.f29673 = str;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C24164 c24164 = new C24164(this.f29670);
        c24164.m53440(R.string.MT_Protector);
        c24164.mo51878((Runnable) null);
        c24164.mo51883();
        this.f29672 = c24164;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f29672.m53444()) {
            AbstractC17043 abstractC17043 = this.f29674;
            if (abstractC17043 != null) {
                abstractC17043.mo25503();
                return;
            }
            return;
        }
        boolean zM25160 = ServiceC10905.m25160(this.f29671);
        ActivityC9368 activityC9368 = this.f29670;
        if (zM25160) {
            activityC9368.f25538 = C21562.unmodifiableList(C18951.m43053());
            activityC9368.f25537.notifyItemRangeInserted(0, 1);
            activityC9368.f25537.notifyItemRangeChanged(1, activityC9368.f25537.getItemCount() - 1);
        } else {
            activityC9368.f25538 = C21562.unmodifiableList(C18951.m43053());
            activityC9368.f25537.notifyDataSetChanged();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        AbstractC17043 abstractC17043 = this.f29674;
        if (abstractC17043 != null) {
            abstractC17043.mo25503();
        }
        this.f29670.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f29672.m53442();
    }
}
