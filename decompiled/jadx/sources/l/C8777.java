package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import bin.mt.plus.R;
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
public final class C8777 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7365 f26744;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16742 f26745;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f26746;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f26747;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f26748;

    /* JADX WARN: Code duplicated, block: B:45:0x0185 A[Catch: all -> 0x0285, TryCatch #4 {all -> 0x0285, blocks: (B:15:0x00a2, B:16:0x00b3, B:18:0x00d4, B:20:0x00f5, B:21:0x00fd, B:23:0x010d, B:24:0x0121, B:25:0x0129, B:27:0x012f, B:30:0x013c, B:32:0x0148, B:34:0x015c, B:36:0x0164, B:38:0x016c, B:40:0x0174, B:42:0x017c, B:45:0x0185, B:47:0x018b), top: B:127:0x00a2, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x018b A[Catch: all -> 0x0285, TRY_LEAVE, TryCatch #4 {all -> 0x0285, blocks: (B:15:0x00a2, B:16:0x00b3, B:18:0x00d4, B:20:0x00f5, B:21:0x00fd, B:23:0x010d, B:24:0x0121, B:25:0x0129, B:27:0x012f, B:30:0x013c, B:32:0x0148, B:34:0x015c, B:36:0x0164, B:38:0x016c, B:40:0x0174, B:42:0x017c, B:45:0x0185, B:47:0x018b), top: B:127:0x00a2, outer: #1 }] */
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws Exception {
        AbstractC15440 abstractC15440M36526;
        AbstractC15440 abstractC15440M40800 = C17448.m40800();
        SecureRandom secureRandom = new SecureRandom();
        do {
            long jCurrentTimeMillis = System.currentTimeMillis();
            abstractC15440M36526 = abstractC15440M40800.m36526(String.format("%08x%04x", Integer.valueOf((int) (jCurrentTimeMillis ^ (jCurrentTimeMillis >>> 32))), Integer.valueOf(secureRandom.nextInt() & 65535)));
        } while (abstractC15440M36526.mo23120());
        abstractC15440M36526.m36508();
        String name = abstractC15440M36526.getName();
        C16742 c16742 = this.f26745;
        c16742.f51390 = name;
        this.f26748 = abstractC15440M36526;
        C22933 c22933 = this.f26746;
        C11003.requireNonNull(c22933);
        C23595 c23595 = new C23595(c22933);
        C22933 c22934 = this.f26746;
        C11003.requireNonNull(c22934);
        AbstractC15440 abstractC15440M40799 = C17448.m40799(c16742);
        AbstractC15440 abstractC15440M36527 = abstractC15440M40799.m36526("packageUpload");
        AbstractC15440 abstractC15440M36528 = abstractC15440M40799.m36526("packageLocal");
        AbstractC15440 abstractC15440M36529 = abstractC15440M40799.m36526("temp");
        String str = this.f26747;
        C4611 c4611 = new C4611(C16999.m39866(str, new String[0]), false);
        if (c16742.f51396.f33315 && !c4611.m13537()) {
            throw new C1637(R.string.MT_Protector);
        }
        C18090 c18090 = new C18090(str);
        try {
            C8918 c8918 = new C8918(abstractC15440M36529);
            try {
                C8918 c8919 = new C8918(abstractC15440M36528);
                try {
                    c8918.m23018(0);
                    HashSet hashSet = new HashSet();
                    C3545 entry = c18090.getEntry(C16458.m38762(1));
                    int i = 2;
                    while (true) {
                        hashSet.add(entry.getName());
                        c8918.m23013(entry);
                        C22194.m49852(c18090.m42189(entry), c8918.m23007());
                        int i2 = i + 1;
                        C3545 entry2 = c18090.getEntry(C16458.m38762(i));
                        if (entry2 == null) {
                            break;
                        }
                        i = i2;
                        entry = entry2;
                        try {
                            c8918.close();
                            throw th;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                            throw th;
                        }
                    }
                    C3545 entry3 = c18090.getEntry("AndroidManifest.xml");
                    hashSet.add(entry3.getName());
                    c8918.m23013(entry3);
                    C22194.m49852(c18090.m42189(entry3), c8918.m23007());
                    byte[] bArrM13528 = c4611.m13528();
                    if (bArrM13528 != null) {
                        c8918.m23012("_mt_protector/signature");
                        c8918.write(bArrM13528);
                    }
                    C22203 c22203M49881 = C22203.m49881(c16742.f51396.f33312);
                    if (!c22203M49881.f72040.isEmpty()) {
                        c8918.m23012("_mt_protector/mapping");
                        c8918.write(c22203M49881.toString().getBytes(Charset.defaultCharset()));
                    }
                    for (C3545 c3545 : c18090.m42210()) {
                        if (!c3545.isDirectory()) {
                            String name2 = c3545.getName();
                            if (name2.startsWith("META-INF/")) {
                                String lowerCase = name2.substring(9).toLowerCase(Locale.US);
                                if (!"manifest.mf".equals(lowerCase) && !lowerCase.endsWith(".sf") && !lowerCase.endsWith(".rsa") && !lowerCase.endsWith(".dsa") && !lowerCase.endsWith(".ec") && !lowerCase.startsWith("sig-")) {
                                    if (!hashSet.contains(name2)) {
                                        c8919.m23014(c3545, c18090);
                                    }
                                }
                            } else if (!hashSet.contains(name2)) {
                                c8919.m23014(c3545, c18090);
                            }
                        }
                    }
                    c8919.close();
                    c8918.close();
                    c18090.close();
                    if (c22934.m51053()) {
                        return;
                    }
                    C19277 c19277 = new C19277(abstractC15440M36529.mo23127());
                    c19277.m44459(c23595);
                    OutputStream outputStreamM3766 = C1096.m3766(abstractC15440M36527.mo23555(false), 2);
                    try {
                        InputStream inputStreamMo27926 = abstractC15440M36529.mo27926();
                        try {
                            byte[] bArr = new byte[1048576];
                            do {
                                int iM49844 = C22194.m49844(inputStreamMo27926, bArr, 1048576);
                                if (iM49844 > 0) {
                                    outputStreamM3766.write(bArr, 0, iM49844);
                                    if (iM49844 < 1048576) {
                                        outputStreamM3766.flush();
                                    }
                                    c19277.m44460(iM49844);
                                } else {
                                    if (inputStreamMo27926 != null) {
                                        inputStreamMo27926.close();
                                    }
                                    outputStreamM3766.close();
                                    abstractC15440M36529.mo23552();
                                    String strM47627 = C20812.m47627(abstractC15440M36528, "MD5");
                                    c16742.f51387 = strM47627;
                                    if (strM47627 != null) {
                                        C10130 c10130 = new C10130();
                                        c10130.m25439(c16742.f51390);
                                        c10130.m25439(c16742.f51391);
                                        c10130.m25439(c16742.f51395);
                                        c10130.m25439(c16742.f51393);
                                        c10130.m25439(c16742.f51397);
                                        c10130.m25439(c16742.f51387);
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        c16742.f51394.compress(Bitmap.CompressFormat.PNG, 80, byteArrayOutputStream);
                                        c10130.m25434(byteArrayOutputStream.toByteArray());
                                        c10130.m25431(c16742.f51389);
                                        c10130.m25439(c16742.f51396.m27532());
                                        byte[] bArrM25428 = c10130.m25428();
                                        int length = bArrM25428.length;
                                        for (int i3 = 0; i3 < length; i3++) {
                                            bArrM25428[i3] = (byte) (bArrM25428[i3] ^ (i3 ^ length));
                                        }
                                        abstractC15440M40799.m36526("info").m36503(bArrM25428, 0, bArrM25428.length);
                                        return;
                                    }
                                    throw new Exception("Get md5 fail");
                                }
                            } while (!c22934.m51053());
                            if (inputStreamMo27926 != null) {
                                inputStreamMo27926.close();
                            }
                            outputStreamM3766.close();
                        } catch (Throwable th2) {
                            if (inputStreamMo27926 == null) {
                                throw th2;
                            }
                            try {
                                inputStreamMo27926.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            outputStreamM3766.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                } catch (Throwable th6) {
                    try {
                        c8919.close();
                        throw th6;
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                        throw th6;
                    }
                }
            } catch (Throwable th8) {
                c8918.close();
                throw th8;
            }
        } catch (Throwable th9) {
            try {
                c18090.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public C8777(ActivityC7365 activityC7365, C16742 c16742, String str) {
        this.f26744 = activityC7365;
        this.f26745 = c16742;
        this.f26747 = str;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C22933 c22933 = new C22933(this.f26744);
        c22933.m51049(R.string.MT_Protector);
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        this.f26746 = c22933;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f26746.m51053()) {
            AbstractC15440 abstractC15440 = this.f26748;
            if (abstractC15440 != null) {
                abstractC15440.mo23552();
                return;
            }
            return;
        }
        boolean zM23216 = ServiceC8982.m23216(this.f26745);
        ActivityC7365 activityC7365 = this.f26744;
        if (zM23216) {
            activityC7365.f22625 = C20195.unmodifiableList(C17448.m40795());
            activityC7365.f22624.notifyItemRangeInserted(0, 1);
            activityC7365.f22624.notifyItemRangeChanged(1, activityC7365.f22624.getItemCount() - 1);
        } else {
            activityC7365.f22625 = C20195.unmodifiableList(C17448.m40795());
            activityC7365.f22624.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractC15440 abstractC15440 = this.f26748;
        if (abstractC15440 != null) {
            abstractC15440.mo23552();
        }
        this.f26744.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f26746.m51051();
    }
}
