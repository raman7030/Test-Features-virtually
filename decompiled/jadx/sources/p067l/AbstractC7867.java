package p067l;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 842E */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7867 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC21279 f20655;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f20656 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public C4788 f20657;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC21279 mo17478(AbstractC6129 abstractC6129, C22893 c22893);

    public AbstractC7867(AbstractC6129 abstractC6129, C22893 c22893) {
        this.f20655 = mo17478(abstractC6129, c22893);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18172(EnumC17527 enumC17527, int i, String... strArr) {
        int length = strArr.length;
        AbstractC21279 abstractC21279 = this.f20655;
        if (i >= length) {
            abstractC21279.mo13866(enumC17527 == EnumC17527.FILE ? "-f requires argument <file>" : "-d requires argument <directory>", new Object[0]);
            throw new IllegalArgumentException();
        }
        String str = strArr[i];
        File file = new File(str);
        if (enumC17527 == EnumC17527.DIR && !file.exists()) {
            abstractC21279.mo13866("The output directory \"{0}\" does not exist", str);
            throw new IllegalArgumentException();
        }
        if (this.f20657 == null) {
            this.f20657 = new C4788();
        }
        int i2 = C11891.f33129[enumC17527.ordinal()];
        if (i2 == 1) {
            C4788 c4788 = this.f20657;
            c4788.m10093(new File("."), str);
            abstractC21279.m48075(c4788);
        } else {
            if (i2 != 2) {
                return;
            }
            C4788 c4789 = this.f20657;
            c4789.m10092(file);
            abstractC21279.m48075(c4789);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18171() {
        ArrayList arrayList = this.f20656;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((InterfaceC24904) it.next()) instanceof C19540) {
                return;
            }
        }
        arrayList.add(new C19540());
    }
}
