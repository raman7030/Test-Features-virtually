package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S50A */
/* JADX INFO: loaded from: classes5.dex */
public final class C21608 extends C21138 {

    /* JADX INFO: renamed from: ۧ */
    public String f68100;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C20689 f68101;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ InterfaceC17583 f68102;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C6365 f68103;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C12220 f68104;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21608(C6365 c6365, C6365 c6366, C12220 c12220, InterfaceC17583 interfaceC17583, C20689 c20689) {
        super(c6365);
        this.f68103 = c6366;
        this.f68104 = c12220;
        this.f68102 = interfaceC17583;
        this.f68101 = c20689;
    }

    @Override // p067l.C21138
    /* JADX INFO: renamed from: ֫ */
    public final C18434 mo14574(String str, String str2, String[] strArr, int i) {
        C6365 c6365 = this.f68103;
        ArrayList arrayList = c6365.f16485;
        if (arrayList.size() >= 1000) {
            String str3 = this.f68100;
            int iLastIndexOf = str.lastIndexOf(47);
            if (iLastIndexOf != str.lastIndexOf(47)) {
                this.f68104.m6276(c6365, this.f68102, this.f68101);
                arrayList.clear();
                break;
            }
            for (int i2 = 0; i2 < iLastIndexOf; i2++) {
                if (str.charAt(i2) != str3.charAt(i2)) {
                    this.f68104.m6276(c6365, this.f68102, this.f68101);
                    arrayList.clear();
                    break;
                }
            }
        }
        this.f68100 = str;
        return super.mo14574(str, str2, strArr, i);
    }

    @Override // p067l.C21138
    /* JADX INFO: renamed from: ֫ */
    public final void mo47760() {
        C6365 c6365 = this.f68103;
        ArrayList arrayList = c6365.f16485;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f68104.m6276(c6365, this.f68102, this.f68101);
        arrayList.clear();
    }
}
