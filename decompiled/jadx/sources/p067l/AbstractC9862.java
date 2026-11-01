package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۠ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5NV */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9862 extends AbstractRunnableC22643 {
    public AbstractC9862(C21302 c21302, String str) {
        super(c21302);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    public final void m23132(String str, boolean z) {
        String string;
        C21302 c21302 = this.f71446;
        AbstractC17043 abstractC17043M50699 = AbstractRunnableC22643.m50699(c21302, str);
        C24618 c24618 = null;
        c24618 = null;
        c24618 = null;
        c24618 = null;
        c24618 = null;
        String str2 = null;
        if (m50701(abstractC17043M50699)) {
            string = "550 Invalid name or chroot violation\r\n";
        } else if (abstractC17043M50699.mo25087()) {
            string = "451 Can't overwrite a directory\r\n";
        } else if (c21302.f67133 >= 0 && z) {
            string = "555 Append can not be used after a REST command\r\n";
        } else if (c21302.m48176()) {
            c21302.m48173("150 Data socket ready\r\n");
            try {
                C24618 c24618M38671 = abstractC17043M50699.m38671("rw");
                try {
                    if (z) {
                        c24618M38671.seek(c24618M38671.length());
                    } else {
                        long j = c21302.f67133;
                        if (j >= 0) {
                            c24618M38671.seek(j);
                            c21302.f67133 = -1L;
                            c21302.f67128 = -1L;
                        } else {
                            c24618M38671.setLength(0L);
                        }
                    }
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int iM48153 = c21302.m48153(bArr);
                        if (iM48153 == -2) {
                            str2 = "425 Could not connect data socket\r\n";
                            break;
                        }
                        if (iM48153 != -1) {
                            if (iM48153 == 0) {
                                str2 = "426 Couldn't receive data\r\n";
                                break;
                            }
                            try {
                                int i = 0;
                                if (c21302.m48171()) {
                                    c24618M38671.write(bArr, 0, iM48153);
                                } else {
                                    int i2 = 0;
                                    while (i < iM48153) {
                                        if (bArr[i] == 13) {
                                            c24618M38671.write(bArr, i2, i - i2);
                                            i2 = i + 1;
                                        }
                                        i++;
                                    }
                                    if (i2 < iM48153) {
                                        c24618M38671.write(bArr, i2, i - i2);
                                    }
                                }
                            } catch (IOException unused) {
                                str2 = "451 File IO problem\r\n";
                            }
                        } else {
                            break;
                        }
                    }
                } catch (IOException unused2) {
                    str2 = "451 Unable to seek in file to append\r\n";
                }
                String str3 = str2;
                c24618 = c24618M38671;
                string = str3;
            } catch (IOException unused3) {
                StringBuilder sbM11879 = C5410.m11879("451 Couldn't open file \"", str, "\" aka \"");
                sbM11879.append(abstractC17043M50699.mo25505());
                sbM11879.append("\" for writing\r\n");
                string = sbM11879.toString();
            }
        } else {
            string = "425 Couldn't open data socket\r\n";
        }
        if (c24618 != null) {
            try {
                c24618.close();
            } catch (IOException unused4) {
            }
        }
        if (string != null) {
            c21302.m48173(string);
        } else {
            c21302.m48173("226 Transmission complete\r\n");
            C16114.m36689(abstractC17043M50699);
        }
        c21302.m48154();
    }
}
