package l;

import java.io.IOException;
import java.util.TimerTask;

/* JADX INFO: renamed from: l.֫ۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V9VI */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1729 extends TimerTask {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8806 f5971;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract String mo5781();

    public AbstractC1729(C8806 c8806) {
        this.f5971 = c8806;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8806 m5776() {
        return this.f5971;
    }

    public String toString() {
        return mo5781();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14780 m5778(C14780 c14780, C19015 c19015) throws IOException {
        try {
            c14780.m35162(c19015);
            return c14780;
        } catch (IOException unused) {
            int iM42658 = c14780.m42658();
            boolean zM42661 = c14780.m42661();
            int iM35159 = c14780.m35159();
            int iM42660 = c14780.m42660();
            c14780.m42649(iM42658 | 512);
            c14780.m42655(iM42660);
            this.f5971.m22728(c14780);
            C14780 c14781 = new C14780(iM42658, iM35159, zM42661);
            c14781.m35162(c19015);
            return c14781;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14780 m5777(C14780 c14780, C11254 c11254, AbstractC22542 abstractC22542) throws IOException {
        try {
            c14780.m35161(c11254, abstractC22542);
            return c14780;
        } catch (IOException unused) {
            int iM42658 = c14780.m42658();
            boolean zM42661 = c14780.m42661();
            int iM35159 = c14780.m35159();
            int iM42660 = c14780.m42660();
            c14780.m42649(iM42658 | 512);
            c14780.m42655(iM42660);
            this.f5971.m22728(c14780);
            C14780 c14781 = new C14780(iM42658, iM35159, zM42661);
            c14781.m35161(c11254, abstractC22542);
            return c14781;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14780 m5780(C14780 c14780, AbstractC22542 abstractC22542, long j) throws IOException {
        try {
            c14780.m35164(abstractC22542, j);
            return c14780;
        } catch (IOException unused) {
            int iM42658 = c14780.m42658();
            boolean zM42661 = c14780.m42661();
            int iM35159 = c14780.m35159();
            int iM42660 = c14780.m42660();
            c14780.m42649(iM42658 | 512);
            c14780.m42655(iM42660);
            this.f5971.m22728(c14780);
            C14780 c14781 = new C14780(iM42658, iM35159, zM42661);
            c14781.m35164(abstractC22542, j);
            return c14781;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14780 m5779(C14780 c14780, AbstractC22542 abstractC22542) throws IOException {
        try {
            c14780.m35163(abstractC22542);
            return c14780;
        } catch (IOException unused) {
            int iM42658 = c14780.m42658();
            boolean zM42661 = c14780.m42661();
            int iM35159 = c14780.m35159();
            int iM42660 = c14780.m42660();
            c14780.m42649(iM42658 | 512);
            c14780.m42655(iM42660);
            this.f5971.m22728(c14780);
            C14780 c14781 = new C14780(iM42658, iM35159, zM42661);
            c14781.m35163(abstractC22542);
            return c14781;
        }
    }
}
