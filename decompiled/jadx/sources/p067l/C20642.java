package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.᩵ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U4WH */
/* JADX INFO: loaded from: classes5.dex */
public final class C20642 extends AbstractC7230 {

    /* JADX INFO: renamed from: ۙ */
    public static final byte[] f63766 = {100, 101, 120, 10, UTF8.S_P3A, 51, 53, 0};

    /* JADX INFO: renamed from: ۗ */
    public static final byte[] f63765 = {100, 101, 120, 10, UTF8.S_P3A, 51, 54, 0};

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final int mo12140(int i) {
        return UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final String mo12142() {
        return "header_item";
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12145(C12556 c12556, C13936 c13936) {
        c12556.m28942(8);
        c12556.m28942(20);
        c12556.m28944();
        c12556.m28944();
        if (c12556.m28944() != 112) {
            throw new RuntimeException("The header size is not the expected value (0x70)");
        }
        int iM28944 = c12556.m28944();
        if (iM28944 == 2018910994) {
            throw new RuntimeException("This dex file is big endian. Only little endian is currently supported.");
        }
        if (iM28944 != 305419896) {
            throw new RuntimeException("The endian tag is not 0x12345678 or 0x78563412");
        }
        if ((c12556.m28944() | c12556.m28944()) != 0) {
            System.err.println("This dex file has a link section, which is not supported. Ignoring.");
        }
        c13936.m31710(EnumC16617.TYPE_MAP_LIST, 1, c12556.m28944());
        c13936.m31710(EnumC16617.TYPE_STRING_ID_ITEM, c12556.m28944(), c12556.m28944());
        c13936.m31710(EnumC16617.TYPE_TYPE_ID_ITEM, c12556.m28944(), c12556.m28944());
        c13936.m31710(EnumC16617.TYPE_PROTO_ID_ITEM, c12556.m28944(), c12556.m28944());
        c13936.m31710(EnumC16617.TYPE_FIELD_ID_ITEM, c12556.m28944(), c12556.m28944());
        c13936.m31710(EnumC16617.TYPE_METHOD_ID_ITEM, c12556.m28944(), c12556.m28944());
        c13936.m31710(EnumC16617.TYPE_CLASS_DEF_ITEM, c12556.m28944(), c12556.m28944());
        c12556.m28944();
        c12556.m28944();
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12144(C3838 c3838) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            byte[] bArr = f63766;
            if (i >= 8) {
                C6458.m14762(sb.toString());
                c3838.m7527(bArr, 0, 8);
                c3838.m7531(0);
                c3838.m7527(new byte[20], 0, 20);
                C5651 c5651 = this.f18865;
                int iM12587 = c5651.m12587();
                C22654 c22654 = c5651.f13743;
                C2535 c2535 = c5651.f13741;
                C2535 c2536 = c5651.f13730;
                C2535 c2537 = c5651.f13738;
                C2535 c2538 = c5651.f13732;
                C2535 c2539 = c5651.f13727;
                C2535 c25310 = c5651.f13748;
                Integer.toHexString(iM12587);
                c3838.m7531(c5651.m12587());
                Integer.toHexString(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                c3838.m7531(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                Integer.toHexString(305419896);
                c3838.m7531(305419896);
                c3838.m7531(0);
                c3838.m7531(0);
                Integer.toHexString(c22654.f18864);
                c3838.m7531(c22654.f18864);
                c25310.f33192.size();
                c3838.m7531(c25310.f33192.size());
                Integer.toHexString(c25310.f33194);
                c3838.m7531(c25310.f33194);
                c2539.f33192.size();
                c3838.m7531(c2539.f33192.size());
                Integer.toHexString(c2539.f33194);
                c3838.m7531(c2539.f33194);
                c2538.f33192.size();
                c3838.m7531(c2538.f33192.size());
                Integer.toHexString(c2538.f33194);
                c3838.m7531(c2538.f33194);
                c2537.f33192.size();
                c3838.m7531(c2537.f33192.size());
                Integer.toHexString(c2537.f33194);
                c3838.m7531(c2537.f33194);
                c2536.f33192.size();
                c3838.m7531(c2536.f33192.size());
                Integer.toHexString(c2536.f33194);
                c3838.m7531(c2536.f33194);
                c2535.f33192.size();
                c3838.m7531(c2535.f33192.size());
                Integer.toHexString(c2535.f33194);
                c3838.m7531(c2535.f33194);
                Integer.toHexString(c5651.m12585());
                c3838.m7531(c5651.m12585());
                Integer.toHexString(c5651.m12583());
                c3838.m7531(c5651.m12583());
                return;
            }
            sb.append((char) bArr[i]);
            i++;
        }
    }
}
