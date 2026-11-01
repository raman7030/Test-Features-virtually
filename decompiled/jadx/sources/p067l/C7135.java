package p067l;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۚ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R89U */
/* JADX INFO: loaded from: classes3.dex */
public final class C7135 extends AbstractC2440 implements Closeable {

    /* JADX INFO: renamed from: ۨ */
    public static final EnumSet f18622;

    /* JADX INFO: renamed from: ܰ */
    public static final EnumSet f18623;

    /* JADX INFO: renamed from: ᩺ */
    public static final EnumSet f18624;

    /* JADX INFO: renamed from: ۗ */
    public final C13978 f18625;

    /* JADX INFO: renamed from: ۛ */
    public final int f18626;

    /* JADX INFO: renamed from: ۤ */
    public final int f18627;

    /* JADX INFO: renamed from: ۫ */
    public final C19677 f18628;

    /* JADX INFO: renamed from: ۬ */
    public final int f18629;

    static {
        EnumC9460 enumC9460 = EnumC9460.STATUS_SUCCESS;
        EnumC9460 enumC9461 = EnumC9460.STATUS_BUFFER_OVERFLOW;
        f18622 = EnumSet.of(enumC9460, enumC9461);
        f18624 = EnumSet.of(enumC9460, enumC9461, EnumC9460.STATUS_END_OF_FILE);
        f18623 = EnumSet.of(enumC9460);
    }

    public C7135(C16953 c16953, C19677 c19677, String str) {
        super(c16953, c19677.m10469().m47379());
        this.f18628 = c19677;
        this.f18625 = ((C21512) m3425(new C23523(c16953.m38537().m54564().m49973(), c16953.m38541(), c19677.m10469().m47380(), EnumC13308.Impersonation, EnumSet.of(EnumC13484.FILE_READ_DATA, EnumC13484.FILE_WRITE_DATA), null, EnumSet.of(EnumC8771.FILE_SHARE_READ, EnumC8771.FILE_SHARE_WRITE), EnumC9955.FILE_OPEN_IF, null, new C18139(c19677.m10466(), str)), EnumSet.of(EnumC9460.STATUS_SUCCESS))).m48718();
        this.f18627 = Math.min(c19677.m10469().m47379().m14895(), c16953.m38537().m54564().m49975());
        this.f18629 = Math.min(c19677.m10469().m47379().m14897(), c16953.m38537().m54564().m49974());
        this.f18626 = Math.min(c19677.m10469().m47379().m14899(), c16953.m38537().m54564().m49976());
    }

    public final byte[] read() {
        C19816 c19816;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        do {
            c19816 = (C19816) m3425(new C18474(m3426(), this.f18625, m3427(), this.f18628.m10469().m47380(), 0L, this.f18629), f18624);
            try {
                byteArrayOutputStream.write(c19816.m45060());
            } catch (IOException e) {
                throw new C12776(e);
            }
        } while (EnumC9460.m21963(((C24864) c19816.mo5341()).m54605()).equals(EnumC9460.STATUS_BUFFER_OVERFLOW));
        return byteArrayOutputStream.toByteArray();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f18628.mo10461(this.f18625);
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte[] m16411(byte[] bArr) throws IOException {
        C14135 c14135 = (C14135) m3425(new C14805(m3426(), m3427(), this.f18628.m10469().m47380(), 1163287L, this.f18625, new C22320(0L, bArr.length, bArr), this.f18627), f18622);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        try {
            byteArrayOutputStream.write(c14135.m32170());
            if (EnumC9460.m21963(((C24864) c14135.mo5341()).m54605()).equals(EnumC9460.STATUS_BUFFER_OVERFLOW)) {
                byteArrayOutputStream.write(read());
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new C12776(e);
        }
    }

    public final void write(byte[] bArr) {
    }
}
