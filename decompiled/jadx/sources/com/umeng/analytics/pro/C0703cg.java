package com.umeng.analytics.pro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.umeng.analytics.pro.cg */
/* JADX INFO: compiled from: M5EM */
/* JADX INFO: loaded from: classes.dex */
public class C0703cg extends AbstractC0705ci {

    /* JADX INFO: renamed from: a */
    public InputStream f2573a;

    /* JADX INFO: renamed from: b */
    public OutputStream f2574b;

    @Override // com.umeng.analytics.pro.AbstractC0705ci
    /* JADX INFO: renamed from: a */
    public boolean mo2438a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.AbstractC0705ci
    /* JADX INFO: renamed from: b */
    public void mo2439b() {
    }

    public C0703cg() {
        this.f2573a = null;
        this.f2574b = null;
    }

    public C0703cg(InputStream inputStream) {
        this.f2574b = null;
        this.f2573a = inputStream;
    }

    public C0703cg(OutputStream outputStream) {
        this.f2573a = null;
        this.f2574b = outputStream;
    }

    public C0703cg(InputStream inputStream, OutputStream outputStream) {
        this.f2573a = inputStream;
        this.f2574b = outputStream;
    }

    @Override // com.umeng.analytics.pro.AbstractC0705ci
    /* JADX INFO: renamed from: c */
    public void mo2441c() {
        InputStream inputStream = this.f2573a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            this.f2573a = null;
        }
        OutputStream outputStream = this.f2574b;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused2) {
            }
            this.f2574b = null;
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC0705ci
    /* JADX INFO: renamed from: a */
    public int mo2437a(byte[] bArr, int i, int i2) throws C0706cj {
        InputStream inputStream = this.f2573a;
        if (inputStream == null) {
            throw new C0706cj(1, "Cannot read from null inputStream");
        }
        try {
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 >= 0) {
                return i3;
            }
            throw new C0706cj(4);
        } catch (IOException e) {
            throw new C0706cj(0, e);
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC0705ci
    /* JADX INFO: renamed from: b */
    public void mo2440b(byte[] bArr, int i, int i2) throws C0706cj {
        OutputStream outputStream = this.f2574b;
        if (outputStream == null) {
            throw new C0706cj(1, "Cannot write to null outputStream");
        }
        try {
            outputStream.write(bArr, i, i2);
        } catch (IOException e) {
            throw new C0706cj(0, e);
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC0705ci
    /* JADX INFO: renamed from: d */
    public void mo2442d() throws C0706cj {
        OutputStream outputStream = this.f2574b;
        if (outputStream == null) {
            throw new C0706cj(1, "Cannot flush null outputStream");
        }
        try {
            outputStream.flush();
        } catch (IOException e) {
            throw new C0706cj(0, e);
        }
    }
}
