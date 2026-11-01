package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;

/* JADX INFO: renamed from: l.ܰۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes4.dex */
public final class C15472 extends C24151 {

    /* JADX INFO: renamed from: ۗ */
    public final C23520 f44183;

    /* JADX INFO: renamed from: ۙ */
    public final boolean f44184;

    /* JADX INFO: renamed from: ۬ */
    public static final byte[] f44182 = {ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, 69, 76, 70};

    /* JADX INFO: renamed from: ۫ */
    public static final byte[] f44181 = {KeyFactorySpi.x448_type, 97, 116, 10};

    public C15472(byte[] bArr) {
        C23520 c23520;
        super(bArr, 0);
        if (bArr.length < 52) {
            throw new C16813();
        }
        for (int i = 0; i < 4; i++) {
            if (bArr[i] != f44182[i]) {
                throw new C16813();
            }
        }
        byte b = bArr[4];
        if (b == 1) {
            this.f44184 = false;
        } else {
            if (b != 2) {
                throw new C10109(String.format("Invalid word-size value: %x", Byte.valueOf(bArr[5])));
            }
            this.f44184 = true;
        }
        for (AbstractC5415 abstractC5415 : (AbstractList) m35221()) {
            if (abstractC5415.f12901.mo13857(abstractC5415.f12900 + 4) == 11) {
                Iterator it = new C14132(new C24190(this, abstractC5415)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c23520 = null;
                        break;
                    }
                    AbstractC13462 abstractC13462 = (AbstractC13462) it.next();
                    if (abstractC13462.mo18794().equals("oatdata")) {
                        try {
                            AbstractC5415 abstractC5416 = (AbstractC5415) ((C7427) abstractC13462.f37781.f76682.m35221()).get(abstractC13462.mo18795());
                            long jMo11889 = abstractC5416.mo11889();
                            int iMo11893 = abstractC5416.mo11893();
                            int iMo11892 = abstractC5416.mo11892();
                            long jMo18796 = abstractC13462.mo18796();
                            if (jMo18796 >= jMo11889 && jMo18796 < ((long) iMo11892) + jMo11889) {
                                c23520 = new C23520(this, (int) ((abstractC13462.mo18796() - jMo11889) + ((long) iMo11893)));
                                break;
                            }
                            throw new C10109("symbol address lies outside it's associated section");
                        } catch (IndexOutOfBoundsException unused) {
                            throw new C10109("Section index for symbol is out of bounds");
                        }
                    }
                }
                if (c23520 == null) {
                    throw new C10109("Oat file has no oatdata symbol");
                }
                this.f44183 = c23520;
                if (!c23520.m52303()) {
                    throw new C10109("Invalid oat magic value");
                }
                C9873.m23151(c23520.m52302());
                return;
            }
        }
        throw new C10109("Oat file has no symbol table");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15472 m35216(BufferedInputStream bufferedInputStream) throws IOException {
        if (!bufferedInputStream.markSupported()) {
            throw new IllegalArgumentException("InputStream must support mark");
        }
        bufferedInputStream.mark(4);
        byte[] bArr = new byte[4];
        try {
            try {
                C19824.m45067(bufferedInputStream, bArr, 0, 4);
                bufferedInputStream.reset();
                for (int i = 0; i < 4; i++) {
                    if (bArr[i] != f44182[i]) {
                        throw new C16813();
                    }
                }
                bufferedInputStream.reset();
                return new C15472(C19824.m45068(bufferedInputStream));
            } catch (EOFException unused) {
                throw new C16813();
            }
        } catch (Throwable th) {
            bufferedInputStream.reset();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m35223() {
        return this.f44183.m52302();
    }

    /* JADX INFO: renamed from: ܽ */
    public final List m35222() {
        return new C2732(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻ */
    public List m35221() {
        int iMo13855;
        int iM13856;
        int iM13857;
        if (this.f44184) {
            iMo13855 = m13861(40);
            iM13856 = m13856(58);
            iM13857 = m13856(60);
        } else {
            iMo13855 = mo13855(32);
            iM13856 = m13856(46);
            iM13857 = m13856(48);
        }
        if ((iM13856 * iM13857) + iMo13855 > length()) {
            throw new C10109("The ELF section headers extend past the end of the file");
        }
        return new C7427(this, iM13857, iMo13855, iM13856);
    }
}
