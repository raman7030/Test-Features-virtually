package l;

import com.alipay.sdk.m.y.l;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۖۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P7DJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C2481 extends AbstractC11817 {

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public int f7908;

    /* JADX INFO: renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public C6193 f7909;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f7910;

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public C7419 f7911;

    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public int f7912;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f7913;

    /* JADX INFO: renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f7914;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f7915;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public boolean f7916;

    /* JADX INFO: renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f7917;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public int f7918;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public C7419 f7919;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public C7419 f7920;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f7921;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public int f7922;

    @Override // l.AbstractC11817
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7967(List... listArr) {
        throw null;
    }

    public C2481(C17503 c17503) {
        super(c17503);
        this.f7915 = new HashMap();
        this.f7913 = new ArrayList(0);
        this.f7914 = new ArrayList(0);
        this.f7916 = true;
        if (c17503.f29335) {
            this.f7918 = 7;
            this.f7922 = 7;
        } else {
            this.f7918 = 7;
            this.f7922 = 7 - m24669();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private int m7960(int i) {
        if (i >= 0) {
            byte[] bArr = this.f7921;
            if (i < bArr.length) {
                return bArr[i];
            }
        }
        throw new IndexOutOfBoundsException(this.f35255.m45769("The index {0} is out of range for the code array of the method.", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private int m7961(int i) {
        if (i >= 0) {
            byte[] bArr = this.f7921;
            if (i < bArr.length) {
                return bArr[i] & 255;
            }
        }
        throw new IndexOutOfBoundsException(this.f35255.m45769("The index {0} is out of range for the code array of the method.", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private int m7958(int i) {
        if (i >= 0) {
            int i2 = i + 1;
            byte[] bArr = this.f7921;
            if (i2 < bArr.length) {
                return (bArr[i] << 8) | (bArr[i2] & 255);
            }
        }
        throw new IndexOutOfBoundsException(this.f35255.m45769("The index {0} is out of range for the code array of the method.", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private int m7963(int i) {
        if (i >= 0) {
            int i2 = i + 1;
            byte[] bArr = this.f7921;
            if (i2 < bArr.length) {
                return ((bArr[i] << 8) | (bArr[i2] & 255)) & 65535;
            }
        }
        throw new IndexOutOfBoundsException(this.f35255.m45769("The index {0} is out of range for the code array of the method.", Integer.valueOf(i)));
    }

    private int getInt(int i) {
        return (m7958(i + 2) & 65535) | (m7958(i) << 16);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C18873 m7968(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f7915;
        C18873 c18873 = (C18873) map.get(numValueOf);
        if (c18873 != null) {
            return c18873;
        }
        C17503 c17503 = (C17503) this.f35257;
        C18873 c18874 = new C18873(c17503);
        c18874.f59496 = (short) 0;
        c18874.f59497 = false;
        c18874.f59499 = (C20826) c17503.f35257;
        c18874.m24647(this);
        c18874.m24664(1);
        map.put(numValueOf, c18874);
        return c18874;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7966(int i, DataInputStream dataInputStream) {
        C13248 c13248;
        boolean z;
        C7419 c7419;
        this.f7912 = dataInputStream.readUnsignedShort();
        this.f7908 = dataInputStream.readUnsignedShort();
        int i2 = dataInputStream.readInt();
        int i3 = 2;
        this.f35255.m45778("CodeAttr:  CodeLength=%d FullLength=%d max_stack=%d max_locals=%d", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.f7912), Integer.valueOf(this.f7908));
        byte[] bArr = new byte[i2];
        this.f7921 = bArr;
        dataInputStream.read(bArr, 0, i2);
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f35255.m45778("CodeAttr:  TrapTable[%d]", Integer.valueOf(unsignedShort));
        this.f7914 = new ArrayList(unsignedShort);
        for (int i4 = 0; i4 < unsignedShort; i4++) {
            ArrayList arrayList = this.f7914;
            C23126 c23126 = new C23126();
            c23126.f74372 = i4;
            c23126.f74371 = dataInputStream.readUnsignedShort();
            c23126.f74369 = dataInputStream.readUnsignedShort();
            c23126.f74370 = dataInputStream.readUnsignedShort();
            c23126.f74368 = dataInputStream.readUnsignedShort();
            arrayList.add(c23126);
        }
        int unsignedShort2 = dataInputStream.readUnsignedShort();
        this.f35255.m45778("CodeAttr: add.attr: %d", Integer.valueOf(unsignedShort2));
        int i5 = 0;
        while (i5 < unsignedShort2) {
            int unsignedShort3 = dataInputStream.readUnsignedShort();
            AbstractC3186 abstractC3186M25953 = this.f35264.m25953(unsignedShort3);
            if (abstractC3186M25953 != null && abstractC3186M25953.f10052 == EnumC12358.CONSTANT_UTF8) {
                String strM25965 = this.f35264.m25965(unsignedShort3, new C6416(7));
                this.f35255.m45778(C20094.m46315("CodeAttr:  attr: ", strM25965), new Object[0]);
                final EnumC4662 enumC4662M13642 = EnumC4662.m13642(strM25965);
                switch (C15885.f49071[enumC4662M13642.ordinal()]) {
                    case 1:
                    case 2:
                        final int i6 = dataInputStream.readInt();
                        final int unsignedShort4 = dataInputStream.readUnsignedShort();
                        this.f7909 = new C6193(enumC4662M13642, this, unsignedShort4);
                        this.f7916 = true;
                        this.f35255.m45762(new Supplier() { // from class: l.ۡۧ֨
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return String.format("CodeAttr:  %s: attrLength=%d num=%d", enumC4662M13642.name(), Integer.valueOf(i6), Integer.valueOf(unsignedShort4));
                            }
                        });
                        int i7 = 0;
                        int i8 = 0;
                        boolean z2 = false;
                        int i9 = 0;
                        while (i7 < unsignedShort4) {
                            int i10 = C15885.f49071[enumC4662M13642.ordinal()];
                            if (i10 == 1) {
                                c13248 = new C13248(this, dataInputStream);
                            } else {
                                if (i10 != i3) {
                                    throw new IllegalStateException("Unexpected value: " + enumC4662M13642);
                                }
                                if (!this.f7916) {
                                    z = false;
                                } else if (i7 == 0 || ((Boolean) this.f7909.f18997.get(i7 - 1)).booleanValue()) {
                                    z = true;
                                } else {
                                    this.f7916 = false;
                                    z = false;
                                }
                                c13248 = new C13248(z, i8, this, dataInputStream);
                            }
                            if (c13248.f39672 == EnumC23006.EARLY_LARVAL) {
                                c13248.f39667 = z2;
                                c13248.f39675 = i9;
                                this.f7909.m17113(c13248, true);
                                i9++;
                                z2 = true;
                            } else {
                                c13248.f39667 = z2;
                                c13248.f39675 = i9;
                                this.f7909.m17113(c13248, false);
                                i7++;
                                z2 = false;
                                i9 = 0;
                            }
                            i8 = c13248.f39673;
                            i3 = 2;
                        }
                        break;
                    case 3:
                        int i11 = dataInputStream.readInt();
                        int unsignedShort5 = dataInputStream.readUnsignedShort();
                        boolean z3 = this.f29346;
                        c7419 = z3 ? new C7419(this, C1233.class, unsignedShort5) : null;
                        AbstractC19898 abstractC19898 = this.f35255;
                        Integer numValueOf = Integer.valueOf(unsignedShort5);
                        Integer numValueOf2 = Integer.valueOf(i11);
                        Object[] objArr = new Object[i3];
                        objArr[0] = numValueOf;
                        objArr[1] = numValueOf2;
                        abstractC19898.m45778("CodeAttr:  LineNumberTable[%d] length=%d", objArr);
                        for (int i12 = 0; i12 < unsignedShort5; i12++) {
                            C17503 c17503 = (C17503) this.f35257;
                            C1233 c1233 = new C1233();
                            c1233.f4407 = dataInputStream.readShort();
                            c1233.f4405 = dataInputStream.readShort();
                            c1233.f29325 = c17503.f29325;
                            c1233.f4406 = C18307.m42645(c17503.f29335 ? 11 : 9, "%", "s %4d:  %7d");
                            if (z3) {
                                c7419.m19942(c1233);
                            }
                        }
                        this.f7911 = c7419;
                        break;
                    case 4:
                        int i13 = dataInputStream.readInt();
                        int unsignedShort6 = dataInputStream.readUnsignedShort();
                        boolean z4 = this.f29350;
                        c7419 = z4 ? new C7419(this, C21695.class, unsignedShort6) : null;
                        AbstractC19898 abstractC19899 = this.f35255;
                        Integer numValueOf3 = Integer.valueOf(unsignedShort6);
                        Integer numValueOf4 = Integer.valueOf(i13);
                        Object[] objArr2 = new Object[i3];
                        objArr2[0] = numValueOf3;
                        objArr2[1] = numValueOf4;
                        abstractC19899.m45778("CodeAttr:  LocalVariableTable[%d] length=%d", objArr2);
                        for (int i14 = 0; i14 < unsignedShort6; i14++) {
                            C21695 c21695 = new C21695(dataInputStream, (C17503) this.f35257, EnumC15204.f46482.m35967());
                            if (z4) {
                                c7419.m19942(c21695);
                            }
                        }
                        this.f7919 = c7419;
                        break;
                    case 5:
                        int i15 = dataInputStream.readInt();
                        int unsignedShort7 = dataInputStream.readUnsignedShort();
                        boolean z5 = this.f29332;
                        c7419 = z5 ? new C7419(this, C22400.class, unsignedShort7) : null;
                        AbstractC19898 abstractC198910 = this.f35255;
                        Integer numValueOf5 = Integer.valueOf(unsignedShort7);
                        Integer numValueOf6 = Integer.valueOf(i15);
                        Object[] objArr3 = new Object[i3];
                        objArr3[0] = numValueOf5;
                        objArr3[1] = numValueOf6;
                        abstractC198910.m45778("CodeAttr:  LocalVariableTypeTable[%d] length=%d", objArr3);
                        for (int i16 = 0; i16 < unsignedShort7; i16++) {
                            C22400 c22400 = new C22400(dataInputStream, (C17503) this.f35257, EnumC15204.f46530.m35967());
                            if (z5) {
                                c7419.m19942(c22400);
                            }
                        }
                        this.f7920 = c7419;
                        break;
                    case 6:
                    case 7:
                        boolean z6 = enumC4662M13642 == EnumC4662.f14816;
                        int i17 = dataInputStream.readInt();
                        short s = dataInputStream.readShort();
                        ArrayList arrayList2 = new ArrayList(s);
                        AbstractC19898 abstractC198911 = this.f35255;
                        String str = z6 ? "Inv" : "V";
                        Integer numValueOf7 = Integer.valueOf(i17);
                        Integer numValueOf8 = Integer.valueOf(s);
                        Object[] objArr4 = new Object[3];
                        objArr4[0] = str;
                        objArr4[1] = numValueOf7;
                        objArr4[i3] = numValueOf8;
                        abstractC198911.m45778("CodeAttr:   Runtime%sisibleTypeAnnotation: attrLength=%d num= %d", objArr4);
                        for (int i18 = 0; i18 < s; i18++) {
                            C7604 c7604 = new C7604((C17503) this.f35257, z6);
                            c7604.mo17803(dataInputStream);
                            arrayList2.add(c7604);
                        }
                        if (z6) {
                            this.f7910 = arrayList2;
                        } else {
                            this.f7917 = arrayList2;
                        }
                        break;
                    default:
                        C21263 c21263 = new C21263(this.f35255, enumC4662M13642);
                        c21263.m48273(unsignedShort3, dataInputStream.readInt(), dataInputStream);
                        this.f7913.add(c21263);
                        break;
                }
            }
            i5++;
            i3 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:189:0x0724  */
    /* JADX WARN: Code duplicated, block: B:225:0x0846  */
    /* JADX WARN: Code duplicated, block: B:226:0x086b  */
    /* JADX WARN: Instruction removed from duplicated block: B:189:0x0724, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:225:0x0846, please report this as an issue */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private int m7965(int i, int i2) {
        int iM7963;
        boolean z;
        int i3;
        String str;
        String str2;
        String str3;
        boolean z2;
        String str4;
        String str5;
        boolean z3;
        int iM7961 = m7961(i);
        EnumC15536 enumC15536M50569 = C22593.m50569(Integer.valueOf(iM7961));
        boolean z4 = this.f29344;
        if (enumC15536M50569 == null) {
            this.f29325.mo1968(m24657(18, "bytecode"));
            StringBuilder sb = new StringBuilder();
            sb.append(z4 ? C23424.m51889(iM7961) : Integer.valueOf(iM7961));
            sb.append(l.b);
            m24662(sb.toString());
            return 1;
        }
        int[] iArr = C15885.f49072;
        switch (iArr[enumC15536M50569.ordinal()]) {
            case 23:
                ArrayList arrayListM7964 = m7964(i, 1);
                if (arrayListM7964.size() != 1) {
                    m7959(enumC15536M50569.m36613(), arrayListM7964, i2);
                    return 1;
                }
                EnumC15536 enumC15536M505610 = C22593.m50569(Integer.valueOf((iM7961 << 8) + m7961(i + 1)));
                if (enumC15536M505610 == null) {
                    this.f29325.mo1968(m24657(18, EnumC15536.f47470.m36618()));
                    m24662(enumC15536M50569.m36616() + l.b);
                    return 1;
                }
                String strM36618 = enumC15536M505610.m36618();
                if (enumC15536M505610 == EnumC15536.f47564) {
                    ArrayList arrayListM7965 = m7964(i, 5);
                    if (arrayListM7965.size() != 5) {
                        m7959(enumC15536M50569.m36613(), arrayListM7965, i2);
                        return 6;
                    }
                    m24654(m24657(18, strM36618));
                    m24666("%d, %d;", Integer.valueOf(m7963(i + 2)), Integer.valueOf(m7963(i + 4)));
                    return 6;
                }
                ArrayList arrayListM7966 = m7964(i, 3);
                if (arrayListM7966.size() != 3) {
                    m7959(enumC15536M50569.m36613(), arrayListM7966, i2);
                    return 4;
                }
                this.f29325.mo1968(m24657(18, strM36618));
                m24666("%d;", Integer.valueOf(m7963(i + 2)));
                return 4;
            case 24:
            case 25:
                ArrayList arrayListM7967 = m7964(i, 1);
                if (arrayListM7967.size() != 1) {
                    m7959(enumC15536M50569.m36613(), arrayListM7967, i2);
                    return 2;
                }
                int iM7962 = m7961(i + 1);
                EnumC15536 enumC15536M505611 = C22593.m50569(Integer.valueOf((iM7961 << 8) + iM7962));
                if (enumC15536M505611 != null) {
                    m24662(enumC15536M505611.m36618() + l.b);
                    return 2;
                }
                this.f29325.mo1968(m24657(18, enumC15536M50569.m36618()));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z4 ? C23424.m51889(iM7962) : Integer.valueOf(iM7962));
                sb2.append(l.b);
                m24662(sb2.toString());
                return 2;
            default:
                if (enumC15536M50569.m36618() == null) {
                    this.f29325.mo1968(m24657(18, "bytecode"));
                    m24662(enumC15536M50569 + l.b);
                    return 1;
                }
                if (!enumC15536M50569.m36617()) {
                    this.f29325.mo1968(m24657(18, "bytecode"));
                    m24662(enumC15536M50569 + l.b);
                    return 1;
                }
                String strM36619 = enumC15536M50569.m36618();
                int i4 = iArr[enumC15536M50569.ordinal()];
                String str6 = "BOGUS;";
                boolean z5 = this.f29343;
                boolean z6 = this.f29326;
                switch (i4) {
                    case 1:
                        int i5 = (i + 4) & (-4);
                        try {
                            int i6 = getInt(i5);
                            int i7 = getInt(i5 + 4);
                            int i8 = getInt(i5 + 8);
                            str2 = "BOGUS;";
                            int i9 = i8 - i7;
                            try {
                                str = strM36619;
                                try {
                                    m24661(this.f29349, m24657(17, strM36619) + " { ");
                                    m24662((!z6 || z5) ? "" : " // " + i7 + " to " + i8);
                                    for (int i10 = 0; i10 <= i9; i10++) {
                                        try {
                                            this.f29325.mo1968(m24663(i2, m24657(9, String.format("%2d: ", Integer.valueOf(i10 + i7)))));
                                            m24662(((C17503) this.f35257).m24668() + (getInt((i10 * 4) + i5 + 12) + i) + l.b);
                                        } catch (IndexOutOfBoundsException e) {
                                            e = e;
                                            str3 = " };";
                                            z2 = false;
                                            if (z2) {
                                                m24662(str + " { ");
                                                m24665(m24663(i2, str2));
                                                m24662(m24663(i2, str3));
                                            } else {
                                                this.f29325.mo1973(str2);
                                                m24662(m24663(i2, str3));
                                            }
                                            this.f35255.m45761(e);
                                            return 1;
                                        }
                                    }
                                    this.f29325.mo1968(m24663(i2, m24657(15 - m24669(), "default: " + ((C17503) this.f35257).m24668() + (i6 + i))));
                                    str3 = " };";
                                    try {
                                        m24662(str3);
                                        return (i9 * 4) + (i5 - i) + 16;
                                    } catch (IndexOutOfBoundsException e2) {
                                        e = e2;
                                        z2 = false;
                                        if (z2) {
                                            m24662(str + " { ");
                                            m24665(m24663(i2, str2));
                                            m24662(m24663(i2, str3));
                                        } else {
                                            this.f29325.mo1973(str2);
                                            m24662(m24663(i2, str3));
                                        }
                                        this.f35255.m45761(e);
                                        return 1;
                                    }
                                } catch (IndexOutOfBoundsException e3) {
                                    e = e3;
                                    str3 = " };";
                                    z2 = true;
                                    if (z2) {
                                        m24662(str + " { ");
                                        m24665(m24663(i2, str2));
                                        m24662(m24663(i2, str3));
                                    } else {
                                        this.f29325.mo1973(str2);
                                        m24662(m24663(i2, str3));
                                    }
                                    this.f35255.m45761(e);
                                    return 1;
                                }
                            } catch (IndexOutOfBoundsException e4) {
                                e = e4;
                                str = strM36619;
                            }
                        } catch (IndexOutOfBoundsException e5) {
                            e = e5;
                            str = strM36619;
                            str2 = "BOGUS;";
                            str3 = " };";
                        }
                        break;
                    case 2:
                        int i11 = (i + 4) & (-4);
                        try {
                            int i12 = getInt(i11);
                            int i13 = getInt(i11 + 4);
                            m24661(this.f29349, m24657(17, strM36619) + " { ");
                            m24662((!z6 || z5) ? "" : " // " + i13);
                            try {
                                C6491[] c6491ArrM7962 = m7962(i11, i13);
                                int iMax = Math.max(9, C22311.stream(c6491ArrM7962).mapToInt(new C9537()).max().orElse(0) + 2);
                                int i14 = 0;
                                while (i14 < i13) {
                                    str4 = str6;
                                    try {
                                        this.f29325.mo1968(m24663(i2, m24657(iMax, String.format("%2d:", c6491ArrM7962[i14].f20042))));
                                        m24662(((C17503) this.f35257).m24668() + (((Integer) c6491ArrM7962[i14].f20043).intValue() + i) + l.b);
                                        i14++;
                                        str6 = str4;
                                    } catch (IndexOutOfBoundsException e6) {
                                        e = e6;
                                        str5 = " };";
                                        z3 = false;
                                        if (z3) {
                                            m24662(strM36619 + " { ");
                                        }
                                        m24665(m24663(i2, str4));
                                        m24662(m24663(i2, str5));
                                        this.f35255.m45761(e);
                                        return 1;
                                    }
                                }
                                str4 = str6;
                                this.f29325.mo1968(m24663(i2, m24657(15 - m24669(), m24657(iMax, "default: ") + ((C17503) this.f35257).m24668() + (i12 + i))));
                                str5 = " };";
                                try {
                                    m24662(str5);
                                    return C20094.m46314(i13, 1, 8, i11 - i);
                                } catch (IndexOutOfBoundsException e7) {
                                    e = e7;
                                    z3 = false;
                                    if (z3) {
                                        m24662(strM36619 + " { ");
                                    }
                                    m24665(m24663(i2, str4));
                                    m24662(m24663(i2, str5));
                                    this.f35255.m45761(e);
                                    return 1;
                                }
                            } catch (IndexOutOfBoundsException e8) {
                                e = e8;
                                str4 = str6;
                            }
                        } catch (IndexOutOfBoundsException e9) {
                            e = e9;
                            str4 = "BOGUS;";
                            str5 = " };";
                            z3 = true;
                        }
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        ArrayList arrayListM7968 = m7964(i, 2);
                        if (arrayListM7968.size() != 2) {
                            m7959(enumC15536M50569.m36613(), arrayListM7968, i2);
                            return 3;
                        }
                        this.f29325.mo1968(m24657(18, strM36619));
                        m24662(((C17503) this.f35257).m24668() + (i + m7958(i + 1)) + l.b);
                        return 3;
                    case 21:
                    case 22:
                        ArrayList arrayListM7969 = m7964(i, 4);
                        if (arrayListM7969.size() != 4) {
                            m7959(enumC15536M50569.m36613(), arrayListM7969, i2);
                            return 5;
                        }
                        this.f29325.mo1968(m24657(18, strM36619));
                        m24662(((C17503) this.f35257).m24668() + (i + getInt(i + 1)) + l.b);
                        return 5;
                    case 23:
                    case 24:
                    case 25:
                    default:
                        m24662(strM36619 + l.b);
                        return 1;
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                        ArrayList arrayListM79610 = m7964(i, 1);
                        if (arrayListM79610.size() != 1) {
                            m7959(enumC15536M50569.m36613(), arrayListM79610, i2);
                            return 2;
                        }
                        this.f29325.mo1968(m24657(18, strM36619));
                        m24662(m7961(i + 1) + l.b);
                        return 2;
                    case 37:
                        ArrayList arrayListM79611 = m7964(i, 2);
                        if (arrayListM79611.size() != 2) {
                            m7959(enumC15536M50569.m36613(), arrayListM79611, i2);
                            return 3;
                        }
                        this.f29325.mo1968(m24657(18, strM36619));
                        m24666("%d, %d;", Integer.valueOf(m7961(i + 1)), Integer.valueOf(m7960(i + 2)));
                        return 3;
                    case 38:
                        ArrayList arrayListM79612 = m7964(i, 1);
                        if (arrayListM79612.size() != 1) {
                            m7959(enumC15536M50569.m36613(), arrayListM79612, i2);
                            return 2;
                        }
                        int iM7964 = m7961(i + 1);
                        EnumC1759 enumC1759M42028 = C17987.m42028(iM7964);
                        if (enumC1759M42028 == null) {
                            this.f29325.mo1968(m24657(18, strM36619));
                            m24662("BOGUS TYPE: " + C23424.m51890(8, iM7964) + l.b);
                            return 2;
                        }
                        this.f29325.mo1968(m24657(18, strM36619));
                        m24662(enumC1759M42028.m5883() + l.b);
                        return 2;
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                        try {
                            new HashMap();
                            EnumC15536 enumC15536 = EnumC15536.f47748;
                            Map map = AbstractC9701.f29324;
                            if (enumC15536M50569 == enumC15536) {
                                z = true;
                                iM7963 = m7961(i + 1);
                                i3 = 2;
                            } else if (enumC15536M50569 == EnumC15536.f47695) {
                                map = AbstractC9701.f29323;
                                iM7963 = m7963(i + 1);
                                z = true;
                                i3 = 5;
                            } else {
                                iM7963 = m7963(i + 1);
                                z = true;
                                i3 = 3;
                            }
                            this.f35264.m25959(z);
                            if (!z6) {
                                m24654(m24657(18, strM36619));
                                m24662(m24645(this.f35264.m25961(iM7963), i2 + 18, "", map) + l.b);
                            } else if (z5) {
                                m24662(String.format("%s #%d;", m24657(17, strM36619), Integer.valueOf(iM7963)));
                            } else {
                                m24661(this.f29349, String.format("%s #%d;", m24657(17, strM36619), Integer.valueOf(iM7963)));
                                m24654(" // ");
                                m24662(m24645(this.f35264.m25961(iM7963), this.f29349 + i2, " // ", map));
                            }
                            this.f35264.m25959(false);
                            return i3;
                        } catch (IndexOutOfBoundsException e10) {
                            if (!z6) {
                                this.f29325.mo1968(m24657(18, strM36619));
                                m24662("BOGUS;");
                            } else if (z5) {
                                m24662(m24657(17, strM36619) + " BOGUS;");
                            } else {
                                m24661(this.f29349, C16014.m37867(m24657(17, strM36619), " BOGUS;"));
                                m24662(" // " + e10.getMessage());
                            }
                            this.f35255.m45761(e10);
                            return 1;
                        }
                    case 43:
                    case 44:
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                        ArrayList arrayListM79613 = m7964(i, 2);
                        if (arrayListM79613.size() != 2) {
                            m7959(enumC15536M50569.m36613(), arrayListM79613, i2);
                            return 3;
                        }
                        int iM7965 = m7963(i + 1);
                        if (!z6) {
                            m24654(m24657(18, strM36619));
                            m24662(this.f35264.m25961(iM7965) + l.b);
                            return 3;
                        }
                        if (z5) {
                            m24662(String.format("%s #%d;", m24657(17, strM36619), Integer.valueOf(iM7965)));
                            return 3;
                        }
                        m24661(this.f29349, String.format("%s #%d;", m24657(17, strM36619), Integer.valueOf(iM7965)));
                        m24662(" // " + this.f35264.m25961(iM7965));
                        return 3;
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        int i15 = enumC15536M50569 == EnumC15536.f47577 ? 3 : 4;
                        ArrayList arrayListM79614 = m7964(i, i15);
                        if (arrayListM79614.size() == i15) {
                            int iM7966 = m7963(i + 1);
                            int iM7967 = m7961(i + 3);
                            if (!z6) {
                                m24654(m24657(18, strM36619));
                                m24666("%s, %d;", this.f35264.m25961(iM7966), Integer.valueOf(iM7967));
                            } else if (z5) {
                                m24662(String.format("%s #%d, %d;", m24657(17, strM36619), Integer.valueOf(iM7966), Integer.valueOf(iM7967)));
                            } else {
                                m24661(this.f29349, String.format("%s #%d, %d;", m24657(17, strM36619), Integer.valueOf(iM7966), Integer.valueOf(iM7967)));
                                m24662(" // " + this.f35264.m25961(iM7966));
                            }
                        } else {
                            m7959(enumC15536M50569.m36613(), arrayListM79614, i2);
                        }
                        return i15 + 1;
                    case 56:
                        ArrayList arrayListM79615 = m7964(i, 2);
                        if (arrayListM79615.size() != 2) {
                            m7959(enumC15536M50569.m36613(), arrayListM79615, i2);
                            return 3;
                        }
                        this.f29325.mo1968(m24657(18, strM36619));
                        m24662(m7958(i + 1) + l.b);
                        return 3;
                    case 57:
                        ArrayList arrayListM79616 = m7964(i, 1);
                        if (arrayListM79616.size() != 1) {
                            m7959(enumC15536M50569.m36613(), arrayListM79616, i2);
                            return 2;
                        }
                        this.f29325.mo1968(m24657(18, strM36619));
                        m24662(m7960(i + 1) + l.b);
                        return 2;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m7959(byte b, ArrayList arrayList, int i) {
        this.f29325.mo1968(m24657(18, EnumC15536.f47470.m36618()));
        StringBuilder sb = new StringBuilder();
        int i2 = C23424.f75225;
        int i3 = 2;
        while (i3 > 0 && (b >> ((i3 - 1) * 4)) == 0) {
            i3--;
        }
        sb.append(C23424.m51890(i3, b));
        sb.append(l.b);
        m24662(sb.toString());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte bByteValue = ((Byte) it.next()).byteValue();
            this.f29325.mo1968(m24652(i, " "));
            this.f29325.mo1968(m24657(18, EnumC15536.f47470.m36618()));
            StringBuilder sb2 = new StringBuilder();
            int i4 = 2;
            while (i4 > 0 && (bByteValue >> ((i4 - 1) * 4)) == 0) {
                i4--;
            }
            sb2.append(C23424.m51890(i4, bByteValue));
            sb2.append(l.b);
            m24662(sb2.toString());
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private ArrayList m7964(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        int length = this.f7921.length;
        for (int i3 = 1; i3 <= i2 && i + i3 < length; i3++) {
            arrayList.add(Byte.valueOf(this.f7921[i3]));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C6491[] m7962(int i, int i2) {
        try {
            C6491[] c6491Arr = new C6491[i2];
            for (int i3 = 1; i3 <= i2; i3++) {
                int i4 = i3 * 8;
                c6491Arr[i3 - 1] = new C6491(Integer.valueOf(getInt(i + i4)), Integer.valueOf(getInt(i + 4 + i4)));
            }
            return c6491Arr;
        } catch (NegativeArraySizeException unused) {
            throw new IndexOutOfBoundsException(this.f35255.m45769("The index {0} is out of range for the code array of the method.", Integer.valueOf(i2)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x019e  */
    @Override // l.AbstractC9701, l.InterfaceC17482
    /* JADX INFO: renamed from: ۧ */
    public final void mo3021() {
        int iM46314;
        C7419 c7419 = this.f7911;
        if (c7419 != null) {
            for (C1233 c1233 : c7419.f22796) {
                m7968(c1233.f4407).f59496 = c1233.f4405;
            }
        }
        C6193 c6193 = this.f7909;
        HashMap map = this.f7915;
        if (c6193 != null && !this.f29347) {
            boolean z = true;
            ArrayList arrayList = null;
            for (int i = 0; i < this.f7909.f22796.size(); i++) {
                C13248 c13248 = (C13248) ((AbstractC9701) this.f7909.f22796.get(i));
                if (((Boolean) this.f7909.f18997.get(i)).booleanValue()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c13248);
                } else {
                    C18873 c18873M7968 = m7968(c13248.f39673);
                    c18873M7968.f59503 = c13248;
                    c18873M7968.f59504 = arrayList;
                    z = false;
                    arrayList = null;
                }
            }
            if (arrayList != null) {
                (z ? (C18873) map.get(Collections.min(map.keySet())) : (C18873) map.get(Collections.max(map.keySet()))).f59504 = arrayList;
            }
        }
        if (!((C17503) this.f35257).f29335) {
            int i2 = 0;
            while (i2 < this.f7921.length) {
                EnumC15536 enumC15536M50569 = C22593.m50569(Integer.valueOf(m7961(i2)));
                if (enumC15536M50569 != null) {
                    switch (C15885.f49072[enumC15536M50569.ordinal()]) {
                        case 1:
                            int i3 = (i2 + 4) & (-4);
                            try {
                                int i4 = getInt(i3);
                                int i5 = getInt(i3 + 8) - getInt(i3 + 4);
                                for (int i6 = 0; i6 <= i5; i6++) {
                                    m7968(getInt((i6 * 4) + i3 + 12) + i2).f59497 = true;
                                }
                                m7968(i4 + i2).f59497 = true;
                                iM46314 = (i3 - i2) + 16 + (i5 * 4);
                            } catch (IndexOutOfBoundsException e) {
                                this.f35255.m45761(e);
                                m7968(i2).f59497 = true;
                                iM46314 = 1;
                            }
                            break;
                        case 2:
                            int i7 = (i2 + 4) & (-4);
                            try {
                                int i8 = getInt(i7);
                                int i9 = i7 + 4;
                                int i10 = getInt(i9);
                                for (int i11 = 1; i11 <= i10; i11++) {
                                    m7968(getInt((i11 * 8) + i9) + i2).f59497 = true;
                                }
                                m7968(i8 + i2).f59497 = true;
                                iM46314 = C20094.m46314(i10, 1, 8, i7 - i2);
                            } catch (IndexOutOfBoundsException e2) {
                                this.f35255.m45761(e2);
                                m7968(i2).f59497 = true;
                                iM46314 = 1;
                            }
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                            try {
                                m7968(m7958(i2 + 1) + i2).f59497 = true;
                                iM46314 = 3;
                            } catch (IndexOutOfBoundsException e3) {
                                this.f35255.m45761(e3);
                                m7968(i2).f59497 = true;
                                iM46314 = 1;
                            }
                            break;
                        case 21:
                        case 22:
                            m7968(getInt(i2 + 1) + i2).f59497 = true;
                            iM46314 = 5;
                            break;
                        case 23:
                        case 24:
                        case 25:
                            enumC15536M50569 = C22593.m50569(Integer.valueOf((enumC15536M50569.m36614().intValue() << 8) + m7961(i2 + 1)));
                            if (enumC15536M50569 != null || (iM46314 = enumC15536M50569.m36619()) == 0) {
                                iM46314 = 1;
                            }
                            break;
                        default:
                            if (enumC15536M50569 != null) {
                                iM46314 = 1;
                            } else {
                                iM46314 = 1;
                            }
                            break;
                    }
                } else {
                    try {
                        m7968(i2).f59497 = true;
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        iM46314 = 1;
                    }
                    iM46314 = 1;
                }
                i2 += iM46314;
            }
        }
        for (C23126 c23126 : this.f7914) {
            C18873 c18873M7969 = m7968(c23126.f74371);
            if (c18873M7969.f59494 == null) {
                c18873M7969.f59494 = new ArrayList(4);
            }
            c18873M7969.f59494.add(c23126);
            C18873 c18873M79610 = m7968(c23126.f74369);
            if (c18873M79610.f59505 == null) {
                c18873M79610.f59505 = new ArrayList(4);
            }
            c18873M79610.f59505.add(c23126);
            C18873 c18873M79611 = m7968(c23126.f74370);
            if (c18873M79611.f59502 == null) {
                c18873M79611.f59502 = new ArrayList(4);
            }
            c18873M79611.f59502.add(c23126);
        }
        C7419 c74110 = this.f7919;
        if (c74110 != null) {
            for (C21695 c21695 : c74110.f22796) {
                C18873 c18873M79612 = m7968(c21695.f47016);
                if (c18873M79612.f59495 == null) {
                    c18873M79612.f59495 = new ArrayList(4);
                }
                c18873M79612.f59495.add(c21695);
                C18873 c18873M79613 = m7968(c21695.f47016 + c21695.f47015);
                if (c18873M79613.f59500 == null) {
                    c18873M79613.f59500 = new ArrayList(4);
                }
                c18873M79613.f59500.add(c21695);
            }
        }
        C7419 c74111 = this.f7920;
        if (c74111 != null) {
            for (C22400 c22400 : c74111.f22796) {
                C18873 c18873M79614 = m7968(c22400.f47016);
                if (c18873M79614.f59498 == null) {
                    c18873M79614.f59498 = new ArrayList(4);
                }
                c18873M79614.f59498.add(c22400);
                C18873 c18873M79615 = m7968(c22400.f47016 + c22400.f47015);
                if (c18873M79615.f59501 == null) {
                    c18873M79615.f59501 = new ArrayList(4);
                }
                c18873M79615.f59501.add(c22400);
            }
        }
        m24664(1);
        m24659("%s %d  %s %d", EnumC15204.f46564.m35967(), Integer.valueOf(this.f7912), EnumC15204.f46601.m35967(), Integer.valueOf(this.f7908));
        m24653(1);
        ((C17503) this.f35257).m40892();
        m24665("{");
        C18873 c18873 = (C18873) map.get(0);
        int i12 = this.f29349;
        int i13 = this.f7918;
        this.f29349 = (i12 - i13) - m24656();
        int iM7965 = 0;
        while (iM7965 < this.f7921.length) {
            int i14 = this.f7922;
            if (c18873 != null) {
                m24664(1);
                c18873.f29349 = this.f29349;
                c18873.m43593(i14);
                m24653(1);
            }
            if (((C17503) this.f35257).f29335) {
                m24664(1);
                m24658(m24657(i13, String.format("%2d:", Integer.valueOf(iM7965))));
            } else {
                m24658(m24657(i13, (c18873 == null || !c18873.f59497) ? " " : ((C17503) this.f35257).m24668() + iM7965 + ":"));
                m24664(1);
            }
            if (c18873 != null && c18873.m43591(i14)) {
                m24654(m24663(i14, ""));
            }
            iM7965 += m7965(iM7965, m24656() + i14);
            c18873 = (C18873) map.get(Integer.valueOf(iM7965));
            if (c18873 != null) {
                c18873.m43592(i14);
                m24653(1);
            }
            m24653(1);
        }
        if (c18873 != null && c18873.f59503 != null && c18873.f59497) {
            C17503 c17503 = (C17503) this.f35257;
            if (c17503.f29335) {
                m24664(1);
                m24658(m24657(0, String.format("%2d:", Integer.valueOf(this.f7921.length))));
                m24653(1);
            } else {
                m24655(m24657(this.f7921.length, String.format("%s%d:", c17503.m24668(), Integer.valueOf(this.f7921.length))), 0);
            }
        }
        List[] listArr = {this.f7917, this.f7910};
        boolean z2 = true;
        for (int i15 = 0; i15 < 2; i15++) {
            List list = listArr[i15];
            if (list != null) {
                if (z2) {
                    this.f29325.mo1973("");
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C6445) it.next()).mo3021();
                    m24667();
                    z2 = false;
                }
            }
        }
        C7419[] c7419Arr = {this.f7911, this.f7919, this.f7920, this.f7909};
        for (int i16 = 0; i16 < 4; i16++) {
            C7419 c74112 = c7419Arr[i16];
            if (c74112 != null && c74112.mo4066()) {
                c74112.f29349 = this.f29349;
                c74112.mo3021();
            }
        }
        m24665(l.d);
    }
}
