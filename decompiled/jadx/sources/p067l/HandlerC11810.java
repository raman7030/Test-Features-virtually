package p067l;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21WX */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC11810 extends Handler {
    public /* synthetic */ HandlerC11810(int i) {
        this();
    }

    public HandlerC11810() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z;
        ArrayList arrayList = (ArrayList) C13151.f36948.get();
        ArrayList arrayList2 = (ArrayList) C13151.f36947.get();
        int i = message.what;
        if (i == 0) {
            ArrayList arrayList3 = (ArrayList) C13151.f36946.get();
            boolean z2 = arrayList.size() <= 0 && arrayList2.size() <= 0;
            while (arrayList3.size() > 0) {
                ArrayList arrayList4 = (ArrayList) arrayList3.clone();
                arrayList3.clear();
                int size = arrayList4.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C13151 c13151 = (C13151) arrayList4.get(i2);
                    if (c13151.f36953 == 0) {
                        c13151.m30111();
                    } else {
                        arrayList2.add(c13151);
                    }
                }
            }
            z = z2;
        } else if (i != 1) {
            return;
        } else {
            z = true;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        ArrayList arrayList5 = (ArrayList) C13151.f36941.get();
        ArrayList arrayList6 = (ArrayList) C13151.f36944.get();
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C13151 c13152 = (C13151) arrayList2.get(i3);
            if (C13151.m30101(c13152, jCurrentAnimationTimeMillis)) {
                arrayList5.add(c13152);
            }
        }
        int size3 = arrayList5.size();
        if (size3 > 0) {
            for (int i4 = 0; i4 < size3; i4++) {
                C13151 c13153 = (C13151) arrayList5.get(i4);
                c13153.m30111();
                c13153.f36965 = true;
                arrayList2.remove(c13153);
            }
            arrayList5.clear();
        }
        int size4 = arrayList.size();
        int i5 = 0;
        while (i5 < size4) {
            C13151 c13154 = (C13151) arrayList.get(i5);
            if (c13154.m30120(jCurrentAnimationTimeMillis)) {
                arrayList6.add(c13154);
            }
            if (arrayList.size() == size4) {
                i5++;
            } else {
                size4--;
                arrayList6.remove(c13154);
            }
        }
        if (arrayList6.size() > 0) {
            for (int i6 = 0; i6 < arrayList6.size(); i6++) {
                ((C13151) arrayList6.get(i6)).m30103();
            }
            arrayList6.clear();
        }
        if (z) {
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                return;
            }
            sendEmptyMessageDelayed(1, Math.max(0L, C13151.f36943 - (AnimationUtils.currentAnimationTimeMillis() - jCurrentAnimationTimeMillis)));
        }
    }
}
