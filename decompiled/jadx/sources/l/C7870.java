package l;

import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9R8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7870 extends ArrayList {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final byte[] f24408 = new byte[8];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f24409;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f24410;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f24411;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f24412;

    public C7870(String str) {
        this.f24411 = str;
    }

    public C7870(AbstractC15440 abstractC15440) throws IOException {
        this.f24412 = abstractC15440;
        m21153();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21151(AbstractC15440 abstractC15440) {
        if (this.f24412 != null) {
            throw new IllegalStateException();
        }
        this.f24412 = abstractC15440;
        m21149(false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m21158() {
        m21149(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21149(boolean z) {
        C11003.requireNonNull(this.f24412);
        C10130 c10130 = new C10130();
        c10130.m25425(z);
        c10130.m25439(this.f24411);
        c10130.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            C14925 c14925 = (C14925) it.next();
            c10130.writeInt(c14925.f45501);
            c10130.mo13231(c14925.f45504);
            c10130.m25423((CharSequence) c14925.f45502);
            c10130.m25432(c14925.f45505);
            c10130.m25423((CharSequence) c14925.f45503);
        }
        this.f24412.m36502(c10130.m25427());
        this.f24410 = this.f24412.mo23117();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m21153() throws IOException {
        C11003.requireNonNull(this.f24412);
        C12951 c12951M31485 = C12951.m31485(this.f24412.m36506());
        clear();
        this.f24409 = c12951M31485.m31498();
        String strM31506 = c12951M31485.m31506();
        String str = this.f24411;
        if (str == null) {
            this.f24411 = strM31506;
        } else if (!str.equals(strM31506)) {
            throw new IOException();
        }
        int i = c12951M31485.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            C14925 c14925 = new C14925();
            c14925.f45501 = c12951M31485.readInt();
            c14925.f45504 = c12951M31485.m31494();
            c14925.f45502 = c12951M31485.m31504();
            c14925.f45505 = c12951M31485.m31487();
            c14925.f45503 = c12951M31485.m31504();
            add(c14925);
        }
        this.f24410 = this.f24412.mo23117();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m21152() throws IOException {
        long j = this.f24410;
        AbstractC15440 abstractC15440 = this.f24412;
        C11003.requireNonNull(abstractC15440);
        if (j != abstractC15440.mo23117()) {
            System.out.println("File changed: " + this.f24412.mo23554());
            m21153();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21150(MessageDigest messageDigest) {
        byte[] bArr = f24408;
        synchronized (bArr) {
            C15972.m37748(this.f24410, 0, bArr);
            messageDigest.update(bArr);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m21156() {
        return this.f24409;
    }

    /* JADX INFO: renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m21154() {
        AbstractC15440 abstractC15440 = this.f24412;
        C11003.requireNonNull(abstractC15440);
        return abstractC15440;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m21155() {
        if (this.f24411.equals("")) {
            return "[DEFAULT]";
        }
        String str = this.f24411;
        return str.charAt(0) == '-' ? str.substring(1) : str;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m21157() {
        return this.f24411;
    }
}
