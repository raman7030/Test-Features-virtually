package l;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۧܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public final class C11151 implements InterfaceC1978 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Charset f33471;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public BufferedWriter f33472;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f33473;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public OutputStream f33474;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f33475;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f33476;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13992 f33477;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f33478 = 1;

    public C11151(C13992 c13992, int i, Charset charset, byte[] bArr, String str) {
        this.f33477 = c13992;
        this.f33475 = i;
        this.f33471 = charset;
        this.f33476 = bArr;
        this.f33473 = str;
    }

    @Override // l.InterfaceC1978
    /* JADX INFO: renamed from: ֫ */
    public final void mo6489(String str) throws IOException {
        m27667();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                this.f33472.write(this.f33473);
            } else {
                this.f33472.write(cCharAt);
            }
        }
    }

    @Override // l.InterfaceC1978
    /* JADX INFO: renamed from: ֫ */
    public final void mo6487(char c) throws IOException {
        m27667();
        if (c == '\n') {
            this.f33472.write(this.f33473);
        } else {
            this.f33472.write(c);
        }
    }

    @Override // l.InterfaceC1978
    /* JADX INFO: renamed from: ֫ */
    public final void mo6488(int i) throws IOException {
        m27667();
        if (i == 10) {
            this.f33472.write(this.f33473);
        } else {
            this.f33472.write(Character.toChars(i));
        }
    }

    @Override // l.InterfaceC1978
    /* JADX INFO: renamed from: ֫ */
    public final void mo6486() throws IOException {
        m27667();
        m27668();
        this.f33477.m33474();
        this.f33478++;
    }

    @Override // l.InterfaceC1978
    /* JADX INFO: renamed from: ۧ */
    public final int mo6490() {
        return this.f33478 - 1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m27669() {
        try {
            m27668();
        } catch (IOException unused) {
        }
        this.f33477.m33473();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m27670() {
        try {
            m27668();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m27667() throws IOException {
        byte[] bArr;
        if (this.f33472 != null) {
            return;
        }
        OutputStream outputStreamM33472 = this.f33477.m33472(this.f33478, this.f33475);
        this.f33474 = outputStreamM33472;
        if (this.f33478 == 1 && (bArr = this.f33476) != null) {
            outputStreamM33472.write(bArr);
        }
        this.f33472 = new BufferedWriter(new OutputStreamWriter(this.f33474, this.f33471));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m27668() throws IOException {
        BufferedWriter bufferedWriter = this.f33472;
        if (bufferedWriter != null) {
            bufferedWriter.close();
            this.f33472 = null;
            this.f33474 = null;
        } else {
            OutputStream outputStream = this.f33474;
            if (outputStream != null) {
                outputStream.close();
                this.f33474 = null;
            }
        }
    }
}
