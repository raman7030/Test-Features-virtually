package l;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 842E */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5786 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC19898 f17809;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f17810 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2546 f17811;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC19898 mo15567(AbstractC3957 abstractC3957, C21596 c21596);

    public AbstractC5786(AbstractC3957 abstractC3957, C21596 c21596) {
        this.f17809 = mo15567(abstractC3957, c21596);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16252(EnumC15950 enumC15950, int i, String... strArr) {
        int length = strArr.length;
        AbstractC19898 abstractC19898 = this.f17809;
        if (i >= length) {
            abstractC19898.mo11946(enumC15950 == EnumC15950.FILE ? "-f requires argument <file>" : "-d requires argument <directory>", new Object[0]);
            throw new IllegalArgumentException();
        }
        String str = strArr[i];
        File file = new File(str);
        if (enumC15950 == EnumC15950.DIR && !file.exists()) {
            abstractC19898.mo11946("The output directory \"{0}\" does not exist", str);
            throw new IllegalArgumentException();
        }
        if (this.f17811 == null) {
            this.f17811 = new C2546();
        }
        int i2 = C10020.f30170[enumC15950.ordinal()];
        if (i2 == 1) {
            C2546 c2546 = this.f17811;
            c2546.m8062(new File("."), str);
            abstractC19898.m45763(c2546);
        } else {
            if (i2 != 2) {
                return;
            }
            C2546 c2547 = this.f17811;
            c2547.m8061(file);
            abstractC19898.m45763(c2547);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16251() {
        ArrayList arrayList = this.f17810;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((InterfaceC23712) it.next()) instanceof C18068) {
                return;
            }
        }
        arrayList.add(new C18068());
    }
}
