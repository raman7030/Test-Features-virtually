package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܳ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7CN */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14539 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f44540 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f44541 = 1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f44542;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f44543;

    public AbstractC14539(DataInputStream dataInputStream) throws IOException {
        byte[] bArr = new byte[dataInputStream.available()];
        dataInputStream.read(bArr);
        this.f44543 = new String(bArr, StandardCharsets.UTF_8);
        dataInputStream.close();
    }
}
