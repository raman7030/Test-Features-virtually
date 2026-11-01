package p067l;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۬ᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R7CK */
/* JADX INFO: loaded from: classes4.dex */
public final class C14979 extends AbstractC13599 {

    /* JADX INFO: renamed from: ᩷ۧ */
    public static final /* synthetic */ int f42802 = 0;

    /* JADX INFO: renamed from: ۜۧ */
    public final boolean f42803;

    /* JADX INFO: renamed from: ᩻ۧ */
    public C5592 f42804;

    public C14979(C22161 c22161) {
        super(c22161);
        this.f42803 = C12949.m29678(EnumC4231.CP_INDEX);
    }

    /* JADX INFO: renamed from: ᩹ */
    public final String m34334() {
        C5592 c5592 = this.f42804;
        return c5592 == null ? "N/A" : c5592.m12383();
    }

    /* JADX INFO: renamed from: ۙ */
    public final String m34332() {
        C5592 c5592 = this.f42804;
        if (c5592 == null) {
            return null;
        }
        return c5592.f13540.m15894();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m34335(String str) {
        StringBuilder sb = new StringBuilder(25);
        C5592 c5592 = this.f42804;
        boolean z = this.f42803;
        String str2 = " */";
        if (c5592 == null) {
            sb.append(EnumC16818.f49568.m38127());
            sb.append(' ');
            if (z) {
                sb.append("#?? /* " + m34334() + " */");
            } else {
                sb.append(m34334());
            }
            if (str.length() > 0) {
                sb.append(' ');
                sb.append(str);
            }
        } else {
            sb.append(EnumC8140.m18861(c5592.f13540.m6582(), EnumC21552.MODULE));
            sb.append(EnumC16818.f49568.m38127());
            sb.append(' ');
            if (z) {
                Integer numValueOf = Integer.valueOf(this.f42804.f13540.m7172());
                String strM12383 = this.f42804.m12383();
                if (this.f42804.f13540.m15894() != null) {
                    str2 = "@" + this.f42804.f13540.m15894() + " */";
                }
                sb.append(String.format("#%d /* %s%s%s", numValueOf, strM12383, str2, str.length() > 0 ? " ".concat(str) : ""));
            } else {
                sb.append(this.f42804.m12383());
                if (str.length() > 0) {
                    sb.append(' ');
                    sb.append(str);
                }
                if (this.f42804.f13540.m15894() != null) {
                    sb.append("// @");
                    sb.append(this.f42804.f13540.m15894());
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m34333(DataInputStream dataInputStream) {
        boolean z = this.f32301;
        try {
            int unsignedShort = dataInputStream.readUnsignedShort();
            int i = 7;
            C21016 c21016 = new C21016(this.f38266.m27991(unsignedShort), unsignedShort, dataInputStream.readUnsignedShort(), this.f38266.m27987(dataInputStream.readUnsignedShort(), new C17024(i)));
            try {
                int unsignedShort2 = dataInputStream.readUnsignedShort();
                for (int i2 = 0; i2 < unsignedShort2; i2++) {
                    int unsignedShort3 = dataInputStream.readUnsignedShort();
                    c21016.f65977.add(new C2909(this.f38266.m27991(unsignedShort3), unsignedShort3, dataInputStream.readUnsignedShort(), this.f38266.m27987(dataInputStream.readUnsignedShort(), new C17024(i))));
                }
            } catch (IOException unused) {
                if (z) {
                    this.f38257.m48082().mo34699("Invalid requires table", new Object[0]);
                } else {
                    throw new C6526(this.f38257.m48082(), "Invalid requires table", new Object[0]);
                }
            }
            try {
                int unsignedShort4 = dataInputStream.readUnsignedShort();
                if (unsignedShort4 > 0) {
                    for (int i3 = 0; i3 < unsignedShort4; i3++) {
                        int unsignedShort5 = dataInputStream.readUnsignedShort();
                        String strM27992 = this.f38266.m27992(unsignedShort5);
                        int unsignedShort6 = dataInputStream.readUnsignedShort();
                        int unsignedShort7 = dataInputStream.readUnsignedShort();
                        if (unsignedShort7 > 0) {
                            HashSet hashSet = new HashSet(unsignedShort7);
                            for (int i4 = 0; i4 < unsignedShort7; i4++) {
                                int unsignedShort8 = dataInputStream.readUnsignedShort();
                                EnumC14113 enumC14113 = EnumC14113.CONSTANT_NULL;
                                hashSet.add(new C23697(unsignedShort8, this.f38266.m27991(unsignedShort8)));
                            }
                            c21016.m47366(unsignedShort5, unsignedShort6, strM27992, hashSet);
                        } else {
                            c21016.m47365(unsignedShort5, unsignedShort6, strM27992);
                        }
                    }
                }
            } catch (IOException unused2) {
                if (z) {
                    this.f38257.m48082().mo34699("Invalid exports table", new Object[0]);
                } else {
                    throw new C6526(this.f38257.m48082(), "Invalid exports table", new Object[0]);
                }
            }
            try {
                int unsignedShort9 = dataInputStream.readUnsignedShort();
                if (unsignedShort9 > 0) {
                    for (int i5 = 0; i5 < unsignedShort9; i5++) {
                        int unsignedShort10 = dataInputStream.readUnsignedShort();
                        String strM27993 = this.f38266.m27992(unsignedShort10);
                        int unsignedShort11 = dataInputStream.readUnsignedShort();
                        int unsignedShort12 = dataInputStream.readUnsignedShort();
                        if (unsignedShort12 > 0) {
                            HashSet hashSet2 = new HashSet(unsignedShort12);
                            for (int i6 = 0; i6 < unsignedShort12; i6++) {
                                int unsignedShort13 = dataInputStream.readUnsignedShort();
                                EnumC14113 enumC14114 = EnumC14113.CONSTANT_NULL;
                                hashSet2.add(new C23697(unsignedShort13, this.f38266.m27991(unsignedShort13)));
                            }
                            c21016.m47376(unsignedShort10, unsignedShort11, strM27993, hashSet2);
                        } else {
                            c21016.m47375(unsignedShort10, unsignedShort11, strM27993);
                        }
                    }
                }
            } catch (IOException unused3) {
                if (z) {
                    this.f38257.m48082().mo34699("Invalid opens table", new Object[0]);
                } else {
                    throw new C6526(this.f38257.m48082(), "Invalid opens table", new Object[0]);
                }
            }
            try {
                int unsignedShort14 = dataInputStream.readUnsignedShort();
                if (unsignedShort14 > 0) {
                    for (int i7 = 0; i7 < unsignedShort14; i7++) {
                        int unsignedShort15 = dataInputStream.readUnsignedShort();
                        c21016.f65971.add(new C21686(unsignedShort15, this.f38266.m27982(unsignedShort15)));
                    }
                }
            } catch (IOException unused4) {
                if (z) {
                    this.f38257.m48082().mo34699("Invalid uses table", new Object[0]);
                } else {
                    throw new C6526(this.f38257.m48082(), "Invalid uses table", new Object[0]);
                }
            }
            try {
                int unsignedShort16 = dataInputStream.readUnsignedShort();
                if (unsignedShort16 > 0) {
                    for (int i8 = 0; i8 < unsignedShort16; i8++) {
                        int unsignedShort17 = dataInputStream.readUnsignedShort();
                        String strM27982 = this.f38266.m27982(unsignedShort17);
                        int unsignedShort18 = dataInputStream.readUnsignedShort();
                        HashSet hashSet3 = new HashSet(unsignedShort18);
                        for (int i9 = 0; i9 < unsignedShort18; i9++) {
                            int unsignedShort19 = dataInputStream.readUnsignedShort();
                            EnumC14113 enumC14115 = EnumC14113.CONSTANT_NULL;
                            hashSet3.add(new C23697(unsignedShort19, this.f38266.m27982(unsignedShort19)));
                        }
                        c21016.m47367(unsignedShort17, strM27982, hashSet3);
                    }
                }
            } catch (IOException unused5) {
                if (z) {
                    this.f38257.m48082().mo34699("Invalid provides table", new Object[0]);
                } else {
                    throw new C6526(this.f38257.m48082(), "Invalid provides table", new Object[0]);
                }
            }
            this.f42804 = c21016.m47363();
        } catch (IOException unused6) {
            if (z) {
                this.f38257.m48082().mo34699("Invalid Module attributes table", new Object[0]);
                return;
            }
            throw new C6526(this.f38257.m48082(), "Invalid Module attributes table", new Object[0]);
        }
    }

    @Override // p067l.AbstractC11588, p067l.InterfaceC18983
    /* JADX INFO: renamed from: ۧ */
    public final void mo5334() {
        C5592 c5592 = this.f42804;
        if (c5592 != null) {
            String string = c5592.toString();
            if (string.isEmpty()) {
                return;
            }
            m26676(string);
        }
    }
}
