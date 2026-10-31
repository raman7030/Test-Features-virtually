package l;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21WX */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC9935 extends Handler {
    public /* synthetic */ HandlerC9935(int i) {
        this();
    }

    public HandlerC9935() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z;
        ArrayList arrayList = (ArrayList) C11346.f33950.get();
        ArrayList arrayList2 = (ArrayList) C11346.f33949.get();
        int i = message.what;
        if (i == 0) {
            ArrayList arrayList3 = (ArrayList) C11346.f33948.get();
            boolean z2 = arrayList.size() <= 0 && arrayList2.size() <= 0;
            while (arrayList3.size() > 0) {
                ArrayList arrayList4 = (ArrayList) arrayList3.clone();
                arrayList3.clear();
                int size = arrayList4.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C11346 c11346 = (C11346) arrayList4.get(i2);
                    if (c11346.f33955 == 0) {
                        c11346.m28066();
                    } else {
                        arrayList2.add(c11346);
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
        ArrayList arrayList5 = (ArrayList) C11346.f33943.get();
        ArrayList arrayList6 = (ArrayList) C11346.f33946.get();
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C11346 c11347 = (C11346) arrayList2.get(i3);
            if (C11346.m28056(c11347, jCurrentAnimationTimeMillis)) {
                arrayList5.add(c11347);
            }
        }
        int size3 = arrayList5.size();
        if (size3 > 0) {
            for (int i4 = 0; i4 < size3; i4++) {
                C11346 c11348 = (C11346) arrayList5.get(i4);
                c11348.m28066();
                c11348.f33967 = true;
                arrayList2.remove(c11348);
            }
            arrayList5.clear();
        }
        int size4 = arrayList.size();
        int i5 = 0;
        while (i5 < size4) {
            C11346 c11349 = (C11346) arrayList.get(i5);
            if (c11349.m28075(jCurrentAnimationTimeMillis)) {
                arrayList6.add(c11349);
            }
            if (arrayList.size() == size4) {
                i5++;
            } else {
                size4--;
                arrayList6.remove(c11349);
            }
        }
        if (arrayList6.size() > 0) {
            for (int i6 = 0; i6 < arrayList6.size(); i6++) {
                ((C11346) arrayList6.get(i6)).m28058();
            }
            arrayList6.clear();
        }
        if (z) {
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                return;
            }
            sendEmptyMessageDelayed(1, Math.max(0L, C11346.f33945 - (AnimationUtils.currentAnimationTimeMillis() - jCurrentAnimationTimeMillis)));
        }
    }
}
