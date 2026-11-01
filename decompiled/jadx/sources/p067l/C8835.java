package p067l;

import java.util.ArrayList;
import java.util.List;
import net.p069sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.ۜܰܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1YB */
/* JADX INFO: loaded from: classes3.dex */
public final class C8835 implements InterfaceC22530 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ List f23977;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ int f23978;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ AbstractC17043 f23979;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C17551 f23980;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC17043 f23981;

    public C8835(C17551 c17551, ArrayList arrayList, AbstractC17043 abstractC17043, int i, AbstractC17043 abstractC17044) {
        this.f23980 = c17551;
        this.f23977 = arrayList;
        this.f23981 = abstractC17043;
        this.f23978 = i;
        this.f23979 = abstractC17044;
    }

    @Override // p067l.InterfaceC22530
    /* JADX INFO: renamed from: ֫ */
    public final void mo20392(AbstractC17043 abstractC17043) {
        this.f23980.f52458.m40702(abstractC17043);
        List list = this.f23977;
        if (list != null) {
            list.add(new C10847(abstractC17043));
        }
    }

    @Override // p067l.InterfaceC22530
    /* JADX INFO: renamed from: ֫ */
    public final void mo20393(IInArchive iInArchive) {
        C17551 c17551 = this.f23980;
        AbstractC17043 abstractC17043 = this.f23981;
        try {
            int numberOfItems = iInArchive.getNumberOfItems();
            String[] strArr = new String[numberOfItems];
            C11518[] c11518Arr = new C11518[numberOfItems];
            int i = C17551.f52448;
            String strMo25505 = abstractC17043.mo25505();
            boolean z = (C18524.m42130(strMo25505) || C18524.m42120(strMo25505)) ? false : true;
            for (int i2 = 0; i2 < numberOfItems; i2++) {
                C6177 c6177M13991 = C6177.m13991(iInArchive, i2);
                boolean z2 = z && c6177M13991.m14003() != null;
                String strM42103 = C18524.m42103(c6177M13991.m14002(), z2 ? false : c6177M13991.m13996());
                strArr[i2] = strM42103;
                if (z2) {
                    c11518Arr[i2] = new C11518(strM42103, C18524.m42124(strM42103, c6177M13991.m14003()), c6177M13991.m13996());
                }
            }
            c17551.m39960(abstractC17043);
            C17551.m39957(c17551, abstractC17043, this.f23978, iInArchive, this.f23979, strArr, c11518Arr);
        } finally {
            C2700.m4192(iInArchive);
        }
    }

    @Override // p067l.InterfaceC22530
    /* JADX INFO: renamed from: ܽ */
    public final void mo20394() {
        this.f23980.cancel();
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f23980.mo3924();
    }
}
