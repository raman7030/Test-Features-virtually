package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4IA */
/* JADX INFO: loaded from: classes2.dex */
public final class C23701 extends AbstractC10818 implements InterfaceC14313 {

    /* JADX INFO: renamed from: ۗ */
    public final C5596 f75425;

    /* JADX INFO: renamed from: ۙ */
    public final String f75426;

    /* JADX INFO: renamed from: ۬ */
    public final String f75427;

    /* JADX INFO: renamed from: ᩶ */
    public final C6937 f75428;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC16192 f75429;

    /* JADX INFO: renamed from: ᩹ */
    public final int f75430;

    public C23701(String str, C6937 c6937, String str2, C5596 c5596, ArrayList arrayList) {
        int i;
        this.f75427 = str;
        this.f75428 = C6937.m15899(c6937);
        this.f75426 = str2;
        this.f75425 = C5596.m12402(c5596);
        this.f75429 = C25022.m54941(arrayList);
        if (str != null && str.startsWith("call_site_")) {
            try {
                i = Integer.parseInt(str.substring(10));
            } catch (NumberFormatException unused) {
                i = -1;
            }
        } else {
            i = -1;
        }
        this.f75430 = i;
    }

    @Override // p067l.InterfaceC6227
    public final String getName() {
        return this.f75427;
    }

    @Override // p067l.InterfaceC6227
    public final int getIndex() {
        return this.f75430;
    }

    @Override // p067l.InterfaceC6227
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC20980 mo14105() {
        return this.f75428;
    }

    @Override // p067l.InterfaceC6227
    /* JADX INFO: renamed from: ܺ */
    public final String mo14104() {
        return this.f75426;
    }

    @Override // p067l.InterfaceC6227
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC2873 mo14103() {
        return this.f75425;
    }

    @Override // p067l.InterfaceC6227
    /* JADX INFO: renamed from: ۢ */
    public final List mo14102() {
        return this.f75429;
    }
}
