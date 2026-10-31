package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.CharacterCodingException;

/* JADX INFO: renamed from: l.۬ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WS */
/* JADX INFO: loaded from: classes4.dex */
public final class C12862 implements InterfaceC9294 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f38625;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ByteArrayOutputStream f38626;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15327[] f38627;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17095 f38628;

    public C12862(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream, C15327[] c15327Arr, C17095 c17095) {
        this.f38625 = bArr;
        this.f38626 = byteArrayOutputStream;
        this.f38627 = c15327Arr;
        this.f38628 = c17095;
    }

    @Override // l.InterfaceC9294
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(C14937 c14937, BufferedOutputStream bufferedOutputStream) throws C3059, IOException {
        long j = c14937.f45532;
        byte[] bArr = this.f38625;
        long j2 = 9007199254740991L - j;
        long length = bArr.length;
        if (j2 < length) {
            throw C6240.m17179("Appended bytes exceed the supported final file size.", j2, length);
        }
        try {
            InputStream inputStreamM35392 = c14937.m35392();
            try {
                this.f38627[0] = C21679.m48947(inputStreamM35392, new C2985(this, bufferedOutputStream), c14937.f45532, this.f38628, bArr);
                if (inputStreamM35392 != null) {
                    inputStreamM35392.close();
                }
            } catch (Throwable th) {
                if (inputStreamM35392 != null) {
                    try {
                        inputStreamM35392.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (CharacterCodingException unused) {
            throw C3059.m9365("FILE_TEXT_DECODE_FAILED", "The original file is not valid complete text in the selected encoding.", "warning", (JSONArray) null, JSON.object());
        } catch (C1217 e) {
            throw e.f4371;
        }
    }

    @Override // l.InterfaceC9294
    /* JADX INFO: renamed from: ֫ */
    public final void mo7074() throws C3059 {
        C21679.m48948();
    }
}
