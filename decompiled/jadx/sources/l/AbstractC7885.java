package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۠ۖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5NV */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7885 extends AbstractRunnableC21333 {
    public AbstractC7885(C19922 c19922, String str) {
        super(c19922);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21167(String str, boolean z) {
        String string;
        C19922 c19922 = this.f68752;
        AbstractC15440 abstractC15440M48364 = AbstractRunnableC21333.m48364(c19922, str);
        C23411 c23411 = null;
        c23411 = null;
        c23411 = null;
        c23411 = null;
        c23411 = null;
        String str2 = null;
        if (m48366(abstractC15440M48364)) {
            string = "550 Invalid name or chroot violation\r\n";
        } else if (abstractC15440M48364.mo23113()) {
            string = "451 Can't overwrite a directory\r\n";
        } else if (c19922.f64496 >= 0 && z) {
            string = "555 Append can not be used after a REST command\r\n";
        } else if (c19922.m45863()) {
            c19922.m45860("150 Data socket ready\r\n");
            try {
                C23411 c23411M36513 = abstractC15440M48364.m36513("rw");
                try {
                    if (z) {
                        c23411M36513.seek(c23411M36513.length());
                    } else {
                        long j = c19922.f64496;
                        if (j >= 0) {
                            c23411M36513.seek(j);
                            c19922.f64496 = -1L;
                            c19922.f64491 = -1L;
                        } else {
                            c23411M36513.setLength(0L);
                        }
                    }
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int iM45840 = c19922.m45840(bArr);
                        if (iM45840 == -2) {
                            str2 = "425 Could not connect data socket\r\n";
                            break;
                        }
                        if (iM45840 != -1) {
                            if (iM45840 == 0) {
                                str2 = "426 Couldn't receive data\r\n";
                                break;
                            }
                            try {
                                int i = 0;
                                if (c19922.m45858()) {
                                    c23411M36513.write(bArr, 0, iM45840);
                                } else {
                                    int i2 = 0;
                                    while (i < iM45840) {
                                        if (bArr[i] == 13) {
                                            c23411M36513.write(bArr, i2, i - i2);
                                            i2 = i + 1;
                                        }
                                        i++;
                                    }
                                    if (i2 < iM45840) {
                                        c23411M36513.write(bArr, i2, i - i2);
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
                c23411 = c23411M36513;
                string = str3;
            } catch (IOException unused3) {
                StringBuilder sbM9834 = C3200.m9834("451 Couldn't open file \"", str, "\" aka \"");
                sbM9834.append(abstractC15440M48364.mo23554());
                sbM9834.append("\" for writing\r\n");
                string = sbM9834.toString();
            }
        } else {
            string = "425 Couldn't open data socket\r\n";
        }
        if (c23411 != null) {
            try {
                c23411.close();
            } catch (IOException unused4) {
            }
        }
        if (string != null) {
            c19922.m45860(string);
        } else {
            c19922.m45860("226 Transmission complete\r\n");
            C14463.m34555(abstractC15440M48364);
        }
        c19922.m45841();
    }
}
