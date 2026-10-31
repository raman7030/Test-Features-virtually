package l;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۚ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R89U */
/* JADX INFO: loaded from: classes3.dex */
public final class C5016 extends AbstractC0076 implements Closeable {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f15790;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f15791;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final EnumSet f15792;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C12216 f15793;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f15794;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f15795;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C18212 f15796;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f15797;

    static {
        EnumC7462 enumC7462 = EnumC7462.STATUS_SUCCESS;
        EnumC7462 enumC7463 = EnumC7462.STATUS_BUFFER_OVERFLOW;
        f15790 = EnumSet.of(enumC7462, enumC7463);
        f15792 = EnumSet.of(enumC7462, enumC7463, EnumC7462.STATUS_END_OF_FILE);
        f15791 = EnumSet.of(enumC7462);
    }

    public C5016(C15346 c15346, C18212 c18212, String str) {
        super(c15346, c18212.m8423().m45083());
        this.f15796 = c18212;
        this.f15793 = ((C20143) m1029(new C22259(c15346.m36379().m52161().m47645(), c15346.m36383(), c18212.m8423().m45084(), EnumC11511.Impersonation, EnumSet.of(EnumC11696.FILE_READ_DATA, EnumC11696.FILE_WRITE_DATA), null, EnumSet.of(EnumC6737.FILE_SHARE_READ, EnumC6737.FILE_SHARE_WRITE), EnumC7983.FILE_OPEN_IF, null, new C16594(c18212.m8420(), str)), EnumSet.of(EnumC7462.STATUS_SUCCESS))).m46402();
        this.f15795 = Math.min(c18212.m8423().m45083().m13031(), c15346.m36379().m52161().m47647());
        this.f15797 = Math.min(c18212.m8423().m45083().m13033(), c15346.m36379().m52161().m47646());
        this.f15794 = Math.min(c18212.m8423().m45083().m13035(), c15346.m36379().m52161().m47648());
    }

    public final byte[] read() {
        C18358 c18358;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        do {
            c18358 = (C18358) m1029(new C16946(m1030(), this.f15793, m1031(), this.f15796.m8423().m45084(), 0L, this.f15797), f15792);
            try {
                byteArrayOutputStream.write(c18358.m42788());
            } catch (IOException e) {
                throw new C10951(e);
            }
        } while (EnumC7462.m19988(((C23670) c18358.mo3028()).m52202()).equals(EnumC7462.STATUS_BUFFER_OVERFLOW));
        return byteArrayOutputStream.toByteArray();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f15796.mo8415(this.f15793);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m14507(byte[] bArr) throws IOException {
        C12381 c12381 = (C12381) m1029(new C13086(m1030(), m1031(), this.f15796.m8423().m45084(), 1163287L, this.f15793, new C20993(0L, bArr.length, bArr), this.f15795), f15790);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        try {
            byteArrayOutputStream.write(c12381.m30106());
            if (EnumC7462.m19988(((C23670) c12381.mo3028()).m52202()).equals(EnumC7462.STATUS_BUFFER_OVERFLOW)) {
                byteArrayOutputStream.write(read());
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new C10951(e);
        }
    }

    public final void write(byte[] bArr) {
    }
}
