package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.᩵ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U4WH */
/* JADX INFO: loaded from: classes5.dex */
public final class C19228 extends AbstractC5116 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f60535 = {100, 101, 120, 10, UTF8.S_P3A, 51, 53, 0};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final byte[] f60534 = {100, 101, 120, 10, UTF8.S_P3A, 51, 54, 0};

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final int mo10104(int i) {
        return UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final String mo10106() {
        return "header_item";
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10109(C10720 c10720, C12172 c12172) {
        c10720.m26902(8);
        c10720.m26902(20);
        c10720.m26904();
        c10720.m26904();
        if (c10720.m26904() != 112) {
            throw new RuntimeException("The header size is not the expected value (0x70)");
        }
        int iM26904 = c10720.m26904();
        if (iM26904 == 2018910994) {
            throw new RuntimeException("This dex file is big endian. Only little endian is currently supported.");
        }
        if (iM26904 != 305419896) {
            throw new RuntimeException("The endian tag is not 0x12345678 or 0x78563412");
        }
        if ((c10720.m26904() | c10720.m26904()) != 0) {
            System.err.println("This dex file has a link section, which is not supported. Ignoring.");
        }
        c12172.m29648(EnumC14993.TYPE_MAP_LIST, 1, c10720.m26904());
        c12172.m29648(EnumC14993.TYPE_STRING_ID_ITEM, c10720.m26904(), c10720.m26904());
        c12172.m29648(EnumC14993.TYPE_TYPE_ID_ITEM, c10720.m26904(), c10720.m26904());
        c12172.m29648(EnumC14993.TYPE_PROTO_ID_ITEM, c10720.m26904(), c10720.m26904());
        c12172.m29648(EnumC14993.TYPE_FIELD_ID_ITEM, c10720.m26904(), c10720.m26904());
        c12172.m29648(EnumC14993.TYPE_METHOD_ID_ITEM, c10720.m26904(), c10720.m26904());
        c12172.m29648(EnumC14993.TYPE_CLASS_DEF_ITEM, c10720.m26904(), c10720.m26904());
        c10720.m26904();
        c10720.m26904();
    }

    @Override // l.AbstractC5116
    /* JADX INFO: renamed from: ֫ */
    public final void mo10108(C1547 c1547) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            byte[] bArr = f60535;
            if (i >= 8) {
                C4303.m12898(sb.toString());
                c1547.m5298(bArr, 0, 8);
                c1547.m5302(0);
                c1547.m5298(new byte[20], 0, 20);
                C3454 c3454 = this.f16031;
                int iM10579 = c3454.m10579();
                C21345 c21345 = c3454.f10942;
                C0176 c0176 = c3454.f10940;
                C0176 c0177 = c3454.f10929;
                C0176 c0178 = c3454.f10937;
                C0176 c0179 = c3454.f10931;
                C0176 c01710 = c3454.f10926;
                C0176 c01711 = c3454.f10947;
                Integer.toHexString(iM10579);
                c1547.m5302(c3454.m10579());
                Integer.toHexString(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                c1547.m5302(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                Integer.toHexString(305419896);
                c1547.m5302(305419896);
                c1547.m5302(0);
                c1547.m5302(0);
                Integer.toHexString(c21345.f16030);
                c1547.m5302(c21345.f16030);
                c01711.f30234.size();
                c1547.m5302(c01711.f30234.size());
                Integer.toHexString(c01711.f30236);
                c1547.m5302(c01711.f30236);
                c01710.f30234.size();
                c1547.m5302(c01710.f30234.size());
                Integer.toHexString(c01710.f30236);
                c1547.m5302(c01710.f30236);
                c0179.f30234.size();
                c1547.m5302(c0179.f30234.size());
                Integer.toHexString(c0179.f30236);
                c1547.m5302(c0179.f30236);
                c0178.f30234.size();
                c1547.m5302(c0178.f30234.size());
                Integer.toHexString(c0178.f30236);
                c1547.m5302(c0178.f30236);
                c0177.f30234.size();
                c1547.m5302(c0177.f30234.size());
                Integer.toHexString(c0177.f30236);
                c1547.m5302(c0177.f30236);
                c0176.f30234.size();
                c1547.m5302(c0176.f30234.size());
                Integer.toHexString(c0176.f30236);
                c1547.m5302(c0176.f30236);
                Integer.toHexString(c3454.m10577());
                c1547.m5302(c3454.m10577());
                Integer.toHexString(c3454.m10575());
                c1547.m5302(c3454.m10575());
                return;
            }
            sb.append((char) bArr[i]);
            i++;
        }
    }
}
