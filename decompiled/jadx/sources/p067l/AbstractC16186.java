package p067l;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܳ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7CN */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16186 {

    /* JADX INFO: renamed from: ֫ */
    public int f47646 = 0;

    /* JADX INFO: renamed from: ۧ */
    public int f47647 = 1;

    /* JADX INFO: renamed from: ܽ */
    public long f47648;

    /* JADX INFO: renamed from: ᩳ */
    public final String f47649;

    public AbstractC16186(DataInputStream dataInputStream) throws IOException {
        byte[] bArr = new byte[dataInputStream.available()];
        dataInputStream.read(bArr);
        this.f47649 = new String(bArr, StandardCharsets.UTF_8);
        dataInputStream.close();
    }
}
