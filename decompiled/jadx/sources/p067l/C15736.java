package p067l;

import android.os.Parcelable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܰ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 046D */
/* JADX INFO: loaded from: classes.dex */
public final class C15736 implements InvocationHandler {

    /* JADX INFO: renamed from: ᩸ */
    public final Parcelable.Creator f45577;

    static {
        ApplicationC14266.m56479(109);
    }

    @Override // java.lang.reflect.InvocationHandler
    public native Object invoke(Object obj, Method method, Object[] objArr);

    public C15736(Parcelable.Creator creator) {
        this.f45577 = creator;
    }
}
