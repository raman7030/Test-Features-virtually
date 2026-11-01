package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.CharacterCodingException;

/* JADX INFO: renamed from: l.۬ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WS */
/* JADX INFO: loaded from: classes4.dex */
public final class C14592 implements InterfaceC11201 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ byte[] f41669;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ ByteArrayOutputStream f41670;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C16935[] f41671;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C18615 f41672;

    public C14592(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream, C16935[] c16935Arr, C18615 c18615) {
        this.f41669 = bArr;
        this.f41670 = byteArrayOutputStream;
        this.f41671 = c16935Arr;
        this.f41672 = c18615;
    }

    @Override // p067l.InterfaceC11201
    /* JADX INFO: renamed from: ֫ */
    public final void mo9172(C16564 c16564, BufferedOutputStream bufferedOutputStream) throws C5276, IOException {
        long j = c16564.f48647;
        byte[] bArr = this.f41669;
        long j2 = 9007199254740991L - j;
        long length = bArr.length;
        if (j2 < length) {
            throw C8299.m19117("Appended bytes exceed the supported final file size.", j2, length);
        }
        try {
            InputStream inputStreamM37544 = c16564.m37544();
            try {
                this.f41671[0] = C22972.m51296(inputStreamM37544, new C5205(this, bufferedOutputStream), c16564.f48647, this.f41672, bArr);
                if (inputStreamM37544 != null) {
                    inputStreamM37544.close();
                }
            } catch (Throwable th) {
                if (inputStreamM37544 != null) {
                    try {
                        inputStreamM37544.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (CharacterCodingException unused) {
            throw C5276.m11407("FILE_TEXT_DECODE_FAILED", "The original file is not valid complete text in the selected encoding.", "warning", (JSONArray) null, JSON.object());
        } catch (C3525 e) {
            throw e.f7141;
        }
    }

    @Override // p067l.InterfaceC11201
    /* JADX INFO: renamed from: ֫ */
    public final void mo9169() throws C5276 {
        C22972.m51297();
    }
}
