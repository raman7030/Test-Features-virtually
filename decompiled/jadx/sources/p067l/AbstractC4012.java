package p067l;

import java.io.IOException;
import java.util.TimerTask;

/* JADX INFO: renamed from: l.֫ۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V9VI */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4012 extends TimerTask {

    /* JADX INFO: renamed from: ᩸ */
    public final C10738 f8748;

    /* JADX INFO: renamed from: ۧ */
    public abstract String mo7991();

    public AbstractC4012(C10738 c10738) {
        this.f8748 = c10738;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10738 m7986() {
        return this.f8748;
    }

    public String toString() {
        return mo7991();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16416 m7988(C16416 c16416, C20441 c20441) throws IOException {
        try {
            c16416.m37309(c20441);
            return c16416;
        } catch (IOException unused) {
            int iM44919 = c16416.m44919();
            boolean zM44922 = c16416.m44922();
            int iM37306 = c16416.m37306();
            int iM44921 = c16416.m44921();
            c16416.m44910(iM44919 | 512);
            c16416.m44916(iM44921);
            this.f8748.m24698(c16416);
            C16416 c16417 = new C16416(iM44919, iM37306, zM44922);
            c16417.m37309(c20441);
            return c16417;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16416 m7987(C16416 c16416, C13065 c13065, AbstractC23793 abstractC23793) throws IOException {
        try {
            c16416.m37308(c13065, abstractC23793);
            return c16416;
        } catch (IOException unused) {
            int iM44919 = c16416.m44919();
            boolean zM44922 = c16416.m44922();
            int iM37306 = c16416.m37306();
            int iM44921 = c16416.m44921();
            c16416.m44910(iM44919 | 512);
            c16416.m44916(iM44921);
            this.f8748.m24698(c16416);
            C16416 c16417 = new C16416(iM44919, iM37306, zM44922);
            c16417.m37308(c13065, abstractC23793);
            return c16417;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16416 m7990(C16416 c16416, AbstractC23793 abstractC23793, long j) throws IOException {
        try {
            c16416.m37311(abstractC23793, j);
            return c16416;
        } catch (IOException unused) {
            int iM44919 = c16416.m44919();
            boolean zM44922 = c16416.m44922();
            int iM37306 = c16416.m37306();
            int iM44921 = c16416.m44921();
            c16416.m44910(iM44919 | 512);
            c16416.m44916(iM44921);
            this.f8748.m24698(c16416);
            C16416 c16417 = new C16416(iM44919, iM37306, zM44922);
            c16417.m37311(abstractC23793, j);
            return c16417;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16416 m7989(C16416 c16416, AbstractC23793 abstractC23793) throws IOException {
        try {
            c16416.m37310(abstractC23793);
            return c16416;
        } catch (IOException unused) {
            int iM44919 = c16416.m44919();
            boolean zM44922 = c16416.m44922();
            int iM37306 = c16416.m37306();
            int iM44921 = c16416.m44921();
            c16416.m44910(iM44919 | 512);
            c16416.m44916(iM44921);
            this.f8748.m24698(c16416);
            C16416 c16417 = new C16416(iM44919, iM37306, zM44922);
            c16417.m37310(abstractC23793);
            return c16417;
        }
    }
}
