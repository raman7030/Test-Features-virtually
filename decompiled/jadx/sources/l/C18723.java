package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.translation.BatchTranslationEngine;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56B1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18723 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC1083 f59188;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnDismissListenerC5317 f59189;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f59190;

    public C18723(DialogInterfaceOnDismissListenerC5317 dialogInterfaceOnDismissListenerC5317, AbstractC1083 abstractC1083, List list) {
        this.f59189 = dialogInterfaceOnDismissListenerC5317;
        this.f59188 = abstractC1083;
        this.f59190 = list;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f59189.f16596);
        this.f23322.m31860((Runnable) null);
        this.f59188.mo3739();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        char c;
        char c2;
        AbstractC1083 abstractC1083 = this.f59188;
        abstractC1083.mo3736();
        boolean zMo3744 = abstractC1083.mo3744();
        DialogInterfaceOnDismissListenerC5317 dialogInterfaceOnDismissListenerC5317 = this.f59189;
        int i = 0;
        boolean z = (zMo3744 && dialogInterfaceOnDismissListenerC5317.f16592.isChecked()) ? false : true;
        C8817 c8817M22790 = C8817.m22790();
        ArrayList arrayList = new ArrayList();
        for (C8739 c8739 : this.f59190) {
            if (c8739.f26609 != null && (z || c8739.f26611 == null)) {
                arrayList.add(c8739);
            }
        }
        int i2 = 100;
        if (abstractC1083.mo3737()) {
            BatchTranslationEngine.BatchingStrategy batchingStrategyMo3743 = abstractC1083.mo3743();
            int i3 = 0;
            while (i3 < arrayList.size() && !this.f23322.m31868()) {
                ArrayList arrayList2 = new ArrayList();
                batchingStrategyMo3743.reset();
                while (true) {
                    if (i3 < arrayList.size()) {
                        C8739 c87310 = (C8739) arrayList.get(i3);
                        String str = c87310.f26609;
                        c = 1;
                        if (!batchingStrategyMo3743.tryAdd(abstractC1083.mo3731(str, c87310.f26611))) {
                            if (arrayList2.isEmpty()) {
                                if (c8817M22790.m22791()) {
                                    C13136 c13136 = this.f23322;
                                    c2 = 2;
                                    AbstractActivityC12266 abstractActivityC12266 = dialogInterfaceOnDismissListenerC5317.f16596;
                                    Integer numValueOf = Integer.valueOf(i3 + 1);
                                    Integer numValueOf2 = Integer.valueOf(arrayList.size());
                                    String strM18061 = C6554.m18061(i2, str);
                                    Object[] objArr = new Object[3];
                                    objArr[i] = numValueOf;
                                    objArr[1] = numValueOf2;
                                    objArr[2] = strM18061;
                                    c13136.m31861(abstractActivityC12266.getString(R.string.MT_Protector, objArr));
                                } else {
                                    c2 = 2;
                                }
                                String strMo3738 = abstractC1083.mo3738(str, c87310.f26611);
                                if (!this.f23322.m31868()) {
                                    if (strMo3738 != null) {
                                        c87310.m22593(strMo3738);
                                    }
                                    i3++;
                                    break;
                                }
                                break;
                            }
                        } else {
                            arrayList2.add(c87310);
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
                    if (c8817M22790.m22791()) {
                        C13136 c13137 = this.f23322;
                        AbstractActivityC12266 abstractActivityC12267 = dialogInterfaceOnDismissListenerC5317.f16596;
                        Integer numValueOf3 = Integer.valueOf(i3);
                        Integer numValueOf4 = Integer.valueOf(arrayList.size());
                        String strM18062 = C6554.m18061(100, ((C8739) arrayList2.get(i)).f26609);
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = numValueOf3;
                        objArr2[c] = numValueOf4;
                        objArr2[c2] = strM18062;
                        c13137.m31861(abstractActivityC12267.getString(R.string.MT_Protector, objArr2));
                    }
                    String[] strArr = new String[arrayList2.size()];
                    String[] strArr2 = new String[arrayList2.size()];
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        C8739 c87311 = (C8739) arrayList2.get(i4);
                        strArr[i4] = c87311.f26609;
                        strArr2[i4] = c87311.f26611;
                    }
                    String[] strArrMo3735 = abstractC1083.mo3735(strArr, strArr2);
                    if (this.f23322.m31868()) {
                        break;
                    }
                    for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                        if (strArrMo3735[i5] != null) {
                            ((C8739) arrayList2.get(i5)).m22593(strArrMo3735[i5]);
                        }
                    }
                }
                i = 0;
                i2 = 100;
                batchingStrategyMo3743 = batchingStrategyMo3743;
            }
        } else {
            for (int i6 = 0; i6 < arrayList.size() && !this.f23322.m31868(); i6++) {
                C8739 c87312 = (C8739) arrayList.get(i6);
                if (c8817M22790.m22791()) {
                    this.f23322.m31861(dialogInterfaceOnDismissListenerC5317.f16596.getString(R.string.MT_Protector, Integer.valueOf(i6 + 1), Integer.valueOf(arrayList.size()), C6554.m18061(100, c87312.f26609)));
                }
                String strMo3739 = abstractC1083.mo3738(c87312.f26609, c87312.f26611);
                if (this.f23322.m31868()) {
                    break;
                }
                if (strMo3739 != null) {
                    c87312.m22593(strMo3739);
                }
            }
        }
        abstractC1083.mo3740();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f23322.m31868()) {
            C21374.m48457(R.string.MT_Protector);
        } else {
            C21374.m48457(R.string.MT_Protector);
        }
        this.f59189.f16596.m29797();
        this.f59188.mo3732();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        boolean zM31868 = this.f23322.m31868();
        DialogInterfaceOnDismissListenerC5317 dialogInterfaceOnDismissListenerC5317 = this.f59189;
        if (zM31868) {
            C21374.m48457(R.string.MT_Protector);
        } else if (!this.f59188.mo3734(exc)) {
            dialogInterfaceOnDismissListenerC5317.f16596.m10223(exc, (DialogInterface.OnDismissListener) null);
        }
        dialogInterfaceOnDismissListenerC5317.f16596.m29797();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f59189.f16596.m29792();
        this.f23322.m31857();
    }
}
