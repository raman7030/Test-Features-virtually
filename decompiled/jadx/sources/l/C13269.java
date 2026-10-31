package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۬ᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R7CK */
/* JADX INFO: loaded from: classes4.dex */
public final class C13269 extends AbstractC11817 {

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39737 = 0;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public final boolean f39738;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public C3392 f39739;

    public C13269(C20826 c20826) {
        super(c20826);
        this.f39738 = C11133.m27616(EnumC1960.CP_INDEX);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m32235() {
        C3392 c3392 = this.f39739;
        return c3392 == null ? "N/A" : c3392.m10344();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m32233() {
        C3392 c3392 = this.f39739;
        if (c3392 == null) {
            return null;
        }
        return c3392.f10733.m14014();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m32236(String str) {
        StringBuilder sb = new StringBuilder(25);
        C3392 c3392 = this.f39739;
        boolean z = this.f39738;
        String str2 = " */";
        if (c3392 == null) {
            sb.append(EnumC15204.f46443.m35967());
            sb.append(' ');
            if (z) {
                sb.append("#?? /* " + m32235() + " */");
            } else {
                sb.append(m32235());
            }
            if (str.length() > 0) {
                sb.append(' ');
                sb.append(str);
            }
        } else {
            sb.append(EnumC6073.m16932(c3392.f10733.m4336(), EnumC20185.MODULE));
            sb.append(EnumC15204.f46443.m35967());
            sb.append(' ');
            if (z) {
                Integer numValueOf = Integer.valueOf(this.f39739.f10733.m4929());
                String strM10344 = this.f39739.m10344();
                if (this.f39739.f10733.m14014() != null) {
                    str2 = "@" + this.f39739.f10733.m14014() + " */";
                }
                sb.append(String.format("#%d /* %s%s%s", numValueOf, strM10344, str2, str.length() > 0 ? " ".concat(str) : ""));
            } else {
                sb.append(this.f39739.m10344());
                if (str.length() > 0) {
                    sb.append(' ');
                    sb.append(str);
                }
                if (this.f39739.f10733.m14014() != null) {
                    sb.append("// @");
                    sb.append(this.f39739.f10733.m14014());
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32234(DataInputStream dataInputStream) {
        boolean z = this.f29352;
        try {
            int unsignedShort = dataInputStream.readUnsignedShort();
            int i = 7;
            C19621 c19621 = new C19621(this.f35264.m25969(unsignedShort), unsignedShort, dataInputStream.readUnsignedShort(), this.f35264.m25965(dataInputStream.readUnsignedShort(), new C15420(i)));
            try {
                int unsignedShort2 = dataInputStream.readUnsignedShort();
                for (int i2 = 0; i2 < unsignedShort2; i2++) {
                    int unsignedShort3 = dataInputStream.readUnsignedShort();
                    c19621.f63356.add(new C0569(this.f35264.m25969(unsignedShort3), unsignedShort3, dataInputStream.readUnsignedShort(), this.f35264.m25965(dataInputStream.readUnsignedShort(), new C15420(i))));
                }
            } catch (IOException unused) {
                if (z) {
                    this.f35255.m45770().mo32596("Invalid requires table", new Object[0]);
                } else {
                    throw new C4375(this.f35255.m45770(), "Invalid requires table", new Object[0]);
                }
            }
            try {
                int unsignedShort4 = dataInputStream.readUnsignedShort();
                if (unsignedShort4 > 0) {
                    for (int i3 = 0; i3 < unsignedShort4; i3++) {
                        int unsignedShort5 = dataInputStream.readUnsignedShort();
                        String strM25970 = this.f35264.m25970(unsignedShort5);
                        int unsignedShort6 = dataInputStream.readUnsignedShort();
                        int unsignedShort7 = dataInputStream.readUnsignedShort();
                        if (unsignedShort7 > 0) {
                            HashSet hashSet = new HashSet(unsignedShort7);
                            for (int i4 = 0; i4 < unsignedShort7; i4++) {
                                int unsignedShort8 = dataInputStream.readUnsignedShort();
                                EnumC12358 enumC12358 = EnumC12358.CONSTANT_NULL;
                                hashSet.add(new C22442(unsignedShort8, this.f35264.m25969(unsignedShort8)));
                            }
                            c19621.m45070(unsignedShort5, unsignedShort6, strM25970, hashSet);
                        } else {
                            c19621.m45069(unsignedShort5, unsignedShort6, strM25970);
                        }
                    }
                }
            } catch (IOException unused2) {
                if (z) {
                    this.f35255.m45770().mo32596("Invalid exports table", new Object[0]);
                } else {
                    throw new C4375(this.f35255.m45770(), "Invalid exports table", new Object[0]);
                }
            }
            try {
                int unsignedShort9 = dataInputStream.readUnsignedShort();
                if (unsignedShort9 > 0) {
                    for (int i5 = 0; i5 < unsignedShort9; i5++) {
                        int unsignedShort10 = dataInputStream.readUnsignedShort();
                        String strM25971 = this.f35264.m25970(unsignedShort10);
                        int unsignedShort11 = dataInputStream.readUnsignedShort();
                        int unsignedShort12 = dataInputStream.readUnsignedShort();
                        if (unsignedShort12 > 0) {
                            HashSet hashSet2 = new HashSet(unsignedShort12);
                            for (int i6 = 0; i6 < unsignedShort12; i6++) {
                                int unsignedShort13 = dataInputStream.readUnsignedShort();
                                EnumC12358 enumC12359 = EnumC12358.CONSTANT_NULL;
                                hashSet2.add(new C22442(unsignedShort13, this.f35264.m25969(unsignedShort13)));
                            }
                            c19621.m45080(unsignedShort10, unsignedShort11, strM25971, hashSet2);
                        } else {
                            c19621.m45079(unsignedShort10, unsignedShort11, strM25971);
                        }
                    }
                }
            } catch (IOException unused3) {
                if (z) {
                    this.f35255.m45770().mo32596("Invalid opens table", new Object[0]);
                } else {
                    throw new C4375(this.f35255.m45770(), "Invalid opens table", new Object[0]);
                }
            }
            try {
                int unsignedShort14 = dataInputStream.readUnsignedShort();
                if (unsignedShort14 > 0) {
                    for (int i7 = 0; i7 < unsignedShort14; i7++) {
                        int unsignedShort15 = dataInputStream.readUnsignedShort();
                        c19621.f63350.add(new C20326(unsignedShort15, this.f35264.m25960(unsignedShort15)));
                    }
                }
            } catch (IOException unused4) {
                if (z) {
                    this.f35255.m45770().mo32596("Invalid uses table", new Object[0]);
                } else {
                    throw new C4375(this.f35255.m45770(), "Invalid uses table", new Object[0]);
                }
            }
            try {
                int unsignedShort16 = dataInputStream.readUnsignedShort();
                if (unsignedShort16 > 0) {
                    for (int i8 = 0; i8 < unsignedShort16; i8++) {
                        int unsignedShort17 = dataInputStream.readUnsignedShort();
                        String strM25960 = this.f35264.m25960(unsignedShort17);
                        int unsignedShort18 = dataInputStream.readUnsignedShort();
                        HashSet hashSet3 = new HashSet(unsignedShort18);
                        for (int i9 = 0; i9 < unsignedShort18; i9++) {
                            int unsignedShort19 = dataInputStream.readUnsignedShort();
                            EnumC12358 enumC123510 = EnumC12358.CONSTANT_NULL;
                            hashSet3.add(new C22442(unsignedShort19, this.f35264.m25960(unsignedShort19)));
                        }
                        c19621.m45071(unsignedShort17, strM25960, hashSet3);
                    }
                }
            } catch (IOException unused5) {
                if (z) {
                    this.f35255.m45770().mo32596("Invalid provides table", new Object[0]);
                } else {
                    throw new C4375(this.f35255.m45770(), "Invalid provides table", new Object[0]);
                }
            }
            this.f39739 = c19621.m45067();
        } catch (IOException unused6) {
            if (z) {
                this.f35255.m45770().mo32596("Invalid Module attributes table", new Object[0]);
                return;
            }
            throw new C4375(this.f35255.m45770(), "Invalid Module attributes table", new Object[0]);
        }
    }

    @Override // l.AbstractC9701, l.InterfaceC17482
    /* JADX INFO: renamed from: ۧ */
    public final void mo3021() {
        C3392 c3392 = this.f39739;
        if (c3392 != null) {
            String string = c3392.toString();
            if (string.isEmpty()) {
                return;
            }
            m24662(string);
        }
    }
}
