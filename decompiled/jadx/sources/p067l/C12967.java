package p067l;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۧܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public final class C12967 implements InterfaceC4249 {

    /* JADX INFO: renamed from: ֫ */
    public final Charset f36471;

    /* JADX INFO: renamed from: ۜ */
    public BufferedWriter f36472;

    /* JADX INFO: renamed from: ۧ */
    public final String f36473;

    /* JADX INFO: renamed from: ܳ */
    public OutputStream f36474;

    /* JADX INFO: renamed from: ܽ */
    public final int f36475;

    /* JADX INFO: renamed from: ܿ */
    public final byte[] f36476;

    /* JADX INFO: renamed from: ᩳ */
    public final C15667 f36477;

    /* JADX INFO: renamed from: ᩻ */
    public int f36478 = 1;

    public C12967(C15667 c15667, int i, Charset charset, byte[] bArr, String str) {
        this.f36477 = c15667;
        this.f36475 = i;
        this.f36471 = charset;
        this.f36476 = bArr;
        this.f36473 = str;
    }

    @Override // p067l.InterfaceC4249
    /* JADX INFO: renamed from: ֫ */
    public final void mo8631(String str) throws IOException {
        m29729();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                this.f36472.write(this.f36473);
            } else {
                this.f36472.write(cCharAt);
            }
        }
    }

    @Override // p067l.InterfaceC4249
    /* JADX INFO: renamed from: ֫ */
    public final void mo8629(char c) throws IOException {
        m29729();
        if (c == '\n') {
            this.f36472.write(this.f36473);
        } else {
            this.f36472.write(c);
        }
    }

    @Override // p067l.InterfaceC4249
    /* JADX INFO: renamed from: ֫ */
    public final void mo8630(int i) throws IOException {
        m29729();
        if (i == 10) {
            this.f36472.write(this.f36473);
        } else {
            this.f36472.write(Character.toChars(i));
        }
    }

    @Override // p067l.InterfaceC4249
    /* JADX INFO: renamed from: ֫ */
    public final void mo8628() throws IOException {
        m29729();
        m29730();
        this.f36477.m35594();
        this.f36478++;
    }

    @Override // p067l.InterfaceC4249
    /* JADX INFO: renamed from: ۧ */
    public final int mo8632() {
        return this.f36478 - 1;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m29731() {
        try {
            m29730();
        } catch (IOException unused) {
        }
        this.f36477.m35593();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m29732() {
        try {
            m29730();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m29729() throws IOException {
        byte[] bArr;
        if (this.f36472 != null) {
            return;
        }
        OutputStream outputStreamM35592 = this.f36477.m35592(this.f36478, this.f36475);
        this.f36474 = outputStreamM35592;
        if (this.f36478 == 1 && (bArr = this.f36476) != null) {
            outputStreamM35592.write(bArr);
        }
        this.f36472 = new BufferedWriter(new OutputStreamWriter(this.f36474, this.f36471));
    }

    /* JADX INFO: renamed from: ܿ */
    private void m29730() throws IOException {
        BufferedWriter bufferedWriter = this.f36472;
        if (bufferedWriter != null) {
            bufferedWriter.close();
            this.f36472 = null;
            this.f36474 = null;
        } else {
            OutputStream outputStream = this.f36474;
            if (outputStream != null) {
                outputStream.close();
                this.f36474 = null;
            }
        }
    }
}
