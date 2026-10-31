package l;

import java.io.Closeable;
import java.io.IOException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨ۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1038 implements Consumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3787;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3788;

    public /* synthetic */ C1038(int i, Object obj) {
        this.f3787 = i;
        this.f3788 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f3787) {
            case 0:
                C12327.m29905((C12327) this.f3788, (InterfaceC17889) obj);
                break;
            default:
                C18837 c18837 = (C18837) this.f3788;
                try {
                    ((Closeable) obj).close();
                } catch (IOException e) {
                    c18837.m43511(e);
                }
                break;
        }
    }
}
