package p067l;

import android.content.DialogInterface;
import bin.p000mt.plugin.api.translation.BatchTranslationEngine;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56B1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20163 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractC3398 f62412;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ DialogInterfaceOnDismissListenerC7422 f62413;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ List f62414;

    public C20163(DialogInterfaceOnDismissListenerC7422 dialogInterfaceOnDismissListenerC7422, AbstractC3398 abstractC3398, List list) {
        this.f62413 = dialogInterfaceOnDismissListenerC7422;
        this.f62412 = abstractC3398;
        this.f62414 = list;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22242(this.f62413.f19433);
        this.f26234.m33952((Runnable) null);
        this.f62412.mo6010();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        char c;
        char c2;
        AbstractC3398 abstractC3398 = this.f62412;
        abstractC3398.mo6007();
        boolean zMo6015 = abstractC3398.mo6015();
        DialogInterfaceOnDismissListenerC7422 dialogInterfaceOnDismissListenerC7422 = this.f62413;
        int i = 0;
        boolean z = (zMo6015 && dialogInterfaceOnDismissListenerC7422.f19429.isChecked()) ? false : true;
        C10748 c10748M24760 = C10748.m24760();
        ArrayList arrayList = new ArrayList();
        for (C10674 c10674 : this.f62414) {
            if (c10674.f29534 != null && (z || c10674.f29536 == null)) {
                arrayList.add(c10674);
            }
        }
        int i2 = 100;
        if (abstractC3398.mo6008()) {
            BatchTranslationEngine.BatchingStrategy batchingStrategyMo6014 = abstractC3398.mo6014();
            int i3 = 0;
            while (i3 < arrayList.size() && !this.f26234.m33960()) {
                ArrayList arrayList2 = new ArrayList();
                batchingStrategyMo6014.reset();
                while (true) {
                    if (i3 < arrayList.size()) {
                        C10674 c10675 = (C10674) arrayList.get(i3);
                        String str = c10675.f29534;
                        c = 1;
                        if (!batchingStrategyMo6014.tryAdd(abstractC3398.mo6002(str, c10675.f29536))) {
                            if (arrayList2.isEmpty()) {
                                if (c10748M24760.m24761()) {
                                    C14853 c14853 = this.f26234;
                                    c2 = 2;
                                    AbstractActivityC14026 abstractActivityC14026 = dialogInterfaceOnDismissListenerC7422.f19433;
                                    Integer numValueOf = Integer.valueOf(i3 + 1);
                                    Integer numValueOf2 = Integer.valueOf(arrayList.size());
                                    String strM20011 = C8597.m20011(i2, str);
                                    Object[] objArr = new Object[3];
                                    objArr[i] = numValueOf;
                                    objArr[1] = numValueOf2;
                                    objArr[2] = strM20011;
                                    c14853.m33953(abstractActivityC14026.getString(R.string.MT_Protector, objArr));
                                } else {
                                    c2 = 2;
                                }
                                String strMo6009 = abstractC3398.mo6009(str, c10675.f29536);
                                if (!this.f26234.m33960()) {
                                    if (strMo6009 != null) {
                                        c10675.m24562(strMo6009);
                                    }
                                    i3++;
                                    break;
                                }
                                break;
                            }
                        } else {
                            arrayList2.add(c10675);
                            i3++;
                            i2 = 100;
                        }
                    } else {
                        c = 1;
                    }
                    c2 = 2;
                    break;
                }
                if (!arrayList2.isEmpty()) {
                    if (c10748M24760.m24761()) {
                        C14853 c14854 = this.f26234;
                        AbstractActivityC14026 abstractActivityC14027 = dialogInterfaceOnDismissListenerC7422.f19433;
                        Integer numValueOf3 = Integer.valueOf(i3);
                        Integer numValueOf4 = Integer.valueOf(arrayList.size());
                        String strM20012 = C8597.m20011(100, ((C10674) arrayList2.get(i)).f29534);
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = numValueOf3;
                        objArr2[c] = numValueOf4;
                        objArr2[c2] = strM20012;
                        c14854.m33953(abstractActivityC14027.getString(R.string.MT_Protector, objArr2));
                    }
                    String[] strArr = new String[arrayList2.size()];
                    String[] strArr2 = new String[arrayList2.size()];
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        C10674 c10676 = (C10674) arrayList2.get(i4);
                        strArr[i4] = c10676.f29534;
                        strArr2[i4] = c10676.f29536;
                    }
                    String[] strArrMo6006 = abstractC3398.mo6006(strArr, strArr2);
                    if (this.f26234.m33960()) {
                        break;
                    }
                    for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                        if (strArrMo6006[i5] != null) {
                            ((C10674) arrayList2.get(i5)).m24562(strArrMo6006[i5]);
                        }
                    }
                }
                i = 0;
                i2 = 100;
                batchingStrategyMo6014 = batchingStrategyMo6014;
            }
        } else {
            for (int i6 = 0; i6 < arrayList.size() && !this.f26234.m33960(); i6++) {
                C10674 c10677 = (C10674) arrayList.get(i6);
                if (c10748M24760.m24761()) {
                    this.f26234.m33953(dialogInterfaceOnDismissListenerC7422.f19433.getString(R.string.MT_Protector, Integer.valueOf(i6 + 1), Integer.valueOf(arrayList.size()), C8597.m20011(100, c10677.f29534)));
                }
                String strMo60010 = abstractC3398.mo6009(c10677.f29534, c10677.f29536);
                if (this.f26234.m33960()) {
                    break;
                }
                if (strMo60010 != null) {
                    c10677.m24562(strMo60010);
                }
            }
        }
        abstractC3398.mo6011();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f26234.m33960()) {
            C22682.m50793(R.string.MT_Protector);
        } else {
            C22682.m50793(R.string.MT_Protector);
        }
        this.f62413.f19433.m31859();
        this.f62412.mo6003();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        boolean zM33960 = this.f26234.m33960();
        DialogInterfaceOnDismissListenerC7422 dialogInterfaceOnDismissListenerC7422 = this.f62413;
        if (zM33960) {
            C22682.m50793(R.string.MT_Protector);
        } else if (!this.f62412.mo6005(exc)) {
            dialogInterfaceOnDismissListenerC7422.f19433.m12259(exc, (DialogInterface.OnDismissListener) null);
        }
        dialogInterfaceOnDismissListenerC7422.f19433.m31859();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f62413.f19433.m31854();
        this.f26234.m33949();
    }
}
