package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.۟ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public class C9633 extends AbstractC8202 {

    /* JADX INFO: renamed from: ܺ֫ */
    public ArrayList f26522 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    private void m22418(BufferedInputStream bufferedInputStream, AbstractC17043 abstractC17043, long j, C20689 c20689) throws IOException {
        int i;
        OutputStream outputStreamMo25506 = abstractC17043.mo25506(false);
        try {
            byte[] bArr = new byte[1024];
            while (j > 0 && (i = bufferedInputStream.read(bArr, 0, (int) Math.min(1024, j))) != -1) {
                c20689.m46754(i);
                outputStreamMo25506.write(bArr, 0, i);
                j -= (long) i;
                if (mo3924()) {
                    break;
                }
            }
            if (outputStreamMo25506 != null) {
                outputStreamMo25506.close();
            }
            if (mo3924()) {
                abstractC17043.mo25503();
            } else {
                this.f26522.add(abstractC17043.getName());
            }
        } catch (Throwable th) {
            if (outputStreamMo25506 != null) {
                try {
                    outputStreamMo25506.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79712;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(R.string.MT_Protector, C11419.m26414(m13492("file")), C7050.m16224(R.string.MT_Protector));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        mo13456("...");
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws IOException {
        AbstractC17043 abstractC17043M13451 = m13451("file");
        C21704 c21704 = (C21704) m13465("arguments");
        String strM13492 = m13492("pattern");
        C19210.m43750(abstractC17043M13451, EnumC17868.MODIFY_DIRECTORY);
        try {
            if (!c21704.m48990()) {
                m22419(abstractC17043M13451, c21704, strM13492);
            } else {
                long jMo25101 = abstractC17043M13451.mo25101();
                C20689 c20689 = new C20689(jMo25101 > 4611686018427387903L ? C14849.FOREVER_NS : jMo25101 * 2);
                c20689.m46753(new C24975(3, this));
                C16318.m37126(new C14327(abstractC17043M13451), new C15667(this, abstractC17043M13451, strM13492), c21704, c20689, new C24868(this));
            }
        } catch (C13657 unused) {
        }
        if (!mo3924() && c21704.f68345) {
            abstractC17043M13451.mo29990();
        }
        return m13481();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:3:0x001a, B:5:0x0020, B:9:0x0038, B:16:0x004b, B:18:0x005c, B:20:0x0062, B:28:0x007e, B:33:0x0090, B:32:0x0087, B:24:0x0075, B:26:0x0079, B:10:0x003b), top: B:44:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:3:0x001a, B:5:0x0020, B:9:0x0038, B:16:0x004b, B:18:0x005c, B:20:0x0062, B:28:0x007e, B:33:0x0090, B:32:0x0087, B:24:0x0075, B:26:0x0079, B:10:0x003b), top: B:44:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x0087 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:3:0x001a, B:5:0x0020, B:9:0x0038, B:16:0x004b, B:18:0x005c, B:20:0x0062, B:28:0x007e, B:33:0x0090, B:32:0x0087, B:24:0x0075, B:26:0x0079, B:10:0x003b), top: B:44:0x001a }] */
    /* JADX INFO: renamed from: ֫ */
    private void m22419(AbstractC17043 abstractC17043, C21704 c21704, String str) throws IOException {
        int i;
        long j;
        long j2;
        int i2;
        int length;
        int i3;
        String strM22421;
        long j3;
        long j4;
        String parent;
        AbstractC17043 abstractC17043M42109;
        long jMo25101 = abstractC17043.mo25101();
        C20689 c20689 = new C20689(jMo25101);
        c20689.m46753(new C24975(3, this));
        BufferedInputStream bufferedInputStreamM38676 = abstractC17043.m38676();
        try {
            if (c21704.f68347 == 0) {
                j = ((long) c21704.f68341) * (1 << (c21704.f68348 * 10));
                i = (int) (jMo25101 / j);
                if (((long) i) * j != jMo25101 || i == 0) {
                    i++;
                }
            } else {
                i = c21704.f68342;
                j = jMo25101 / ((long) i);
                if (j < 1 && j < jMo25101) {
                    j2 = 1;
                }
                i2 = (int) (jMo25101 - (((long) i) * j2));
                length = String.valueOf(i).length();
                i3 = 1;
                while (i3 <= i && !mo3924()) {
                    strM22421 = m22421(i3, length, str);
                    mo13456(strM22421);
                    if (i3 == i) {
                        j4 = C14849.FOREVER_NS;
                    } else {
                        if (i - i3 < i2) {
                            j4 = j2 + 1;
                        } else {
                            j3 = j2;
                        }
                        parent = abstractC17043.getParent();
                        if (parent == null) {
                            abstractC17043M42109 = null;
                        } else {
                            abstractC17043M42109 = C18524.m42109(parent, strM22421);
                        }
                        long j5 = j3;
                        int i4 = i3;
                        m22418(bufferedInputStreamM38676, abstractC17043M42109, j5, c20689);
                        i3 = i4 + 1;
                    }
                    j3 = j4;
                    parent = abstractC17043.getParent();
                    if (parent == null) {
                        abstractC17043M42109 = null;
                    } else {
                        abstractC17043M42109 = C18524.m42109(parent, strM22421);
                    }
                    long j6 = j3;
                    int i5 = i3;
                    m22418(bufferedInputStreamM38676, abstractC17043M42109, j6, c20689);
                    i3 = i5 + 1;
                }
                bufferedInputStreamM38676.close();
            }
            j2 = j;
            i2 = (int) (jMo25101 - (((long) i) * j2));
            length = String.valueOf(i).length();
            i3 = 1;
            while (i3 <= i) {
                strM22421 = m22421(i3, length, str);
                mo13456(strM22421);
                if (i3 == i) {
                    j4 = C14849.FOREVER_NS;
                } else {
                    if (i - i3 < i2) {
                        j4 = j2 + 1;
                    } else {
                        j3 = j2;
                    }
                    parent = abstractC17043.getParent();
                    if (parent == null) {
                        abstractC17043M42109 = null;
                    } else {
                        abstractC17043M42109 = C18524.m42109(parent, strM22421);
                    }
                    long j7 = j3;
                    int i6 = i3;
                    m22418(bufferedInputStreamM38676, abstractC17043M42109, j7, c20689);
                    i3 = i6 + 1;
                }
                j3 = j4;
                parent = abstractC17043.getParent();
                if (parent == null) {
                    abstractC17043M42109 = null;
                } else {
                    abstractC17043M42109 = C18524.m42109(parent, strM22421);
                }
                long j8 = j3;
                int i7 = i3;
                m22418(bufferedInputStreamM38676, abstractC17043M42109, j8, c20689);
                i3 = i7 + 1;
            }
            bufferedInputStreamM38676.close();
        } catch (Throwable th) {
            try {
                bufferedInputStreamM38676.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        ArrayList arrayList = this.f26522;
        if (arrayList.isEmpty() || !m13478(c18107)) {
            return;
        }
        c18107.m41226((Collection) arrayList);
        c18107.m41241();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C17127.m38756();
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m22421(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        while (sb.length() < i2) {
            sb.insert(0, '0');
        }
        return str.replace("{D}", sb.toString());
    }
}
