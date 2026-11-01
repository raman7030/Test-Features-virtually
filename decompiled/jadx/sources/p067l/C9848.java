package p067l;

import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9R8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9848 extends ArrayList {

    /* JADX INFO: renamed from: ۗ */
    public static final byte[] f27324 = new byte[8];

    /* JADX INFO: renamed from: ۙ */
    public boolean f27325;

    /* JADX INFO: renamed from: ᩶ */
    public long f27326;

    /* JADX INFO: renamed from: ᩸ */
    public String f27327;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC17043 f27328;

    public C9848(String str) {
        this.f27327 = str;
    }

    public C9848(AbstractC17043 abstractC17043) throws IOException {
        this.f27328 = abstractC17043;
        m23118();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23116(AbstractC17043 abstractC17043) {
        if (this.f27328 != null) {
            throw new IllegalStateException();
        }
        this.f27328 = abstractC17043;
        m23114(false);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m23123() {
        m23114(true);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m23114(boolean z) {
        C12826.requireNonNull(this.f27328);
        C11996 c11996 = new C11996();
        c11996.m27445(z);
        c11996.m27459(this.f27327);
        c11996.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            C16553 c16553 = (C16553) it.next();
            c11996.writeInt(c16553.f48616);
            c11996.mo15113(c16553.f48619);
            c11996.m27443((CharSequence) c16553.f48617);
            c11996.m27452(c16553.f48620);
            c11996.m27443((CharSequence) c16553.f48618);
        }
        this.f27328.m38660(c11996.m27447());
        this.f27326 = this.f27328.mo25091();
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m23118() throws IOException {
        C12826.requireNonNull(this.f27328);
        C14677 c14677M33572 = C14677.m33572(this.f27328.m38664());
        clear();
        this.f27325 = c14677M33572.m33585();
        String strM33593 = c14677M33572.m33593();
        String str = this.f27327;
        if (str == null) {
            this.f27327 = strM33593;
        } else if (!str.equals(strM33593)) {
            throw new IOException();
        }
        int i = c14677M33572.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            C16553 c16553 = new C16553();
            c16553.f48616 = c14677M33572.readInt();
            c16553.f48619 = c14677M33572.m33581();
            c16553.f48617 = c14677M33572.m33591();
            c16553.f48620 = c14677M33572.m33574();
            c16553.f48618 = c14677M33572.m33591();
            add(c16553);
        }
        this.f27326 = this.f27328.mo25091();
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m23117() throws IOException {
        long j = this.f27326;
        AbstractC17043 abstractC17043 = this.f27328;
        C12826.requireNonNull(abstractC17043);
        if (j != abstractC17043.mo25091()) {
            System.out.println("File changed: " + this.f27328.mo25505());
            m23118();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23115(MessageDigest messageDigest) {
        byte[] bArr = f27324;
        synchronized (bArr) {
            C17548.m39932(this.f27326, 0, bArr);
            messageDigest.update(bArr);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m23121() {
        return this.f27325;
    }

    /* JADX INFO: renamed from: ܶۧ */
    public final AbstractC17043 m23119() {
        AbstractC17043 abstractC17043 = this.f27328;
        C12826.requireNonNull(abstractC17043);
        return abstractC17043;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m23120() {
        if (this.f27327.equals("")) {
            return "[DEFAULT]";
        }
        String str = this.f27327;
        return str.charAt(0) == '-' ? str.substring(1) : str;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m23122() {
        return this.f27327;
    }
}
