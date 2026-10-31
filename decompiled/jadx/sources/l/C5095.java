package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: PAHH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5095 implements Consumer {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ((Thread) obj).interrupt();
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }
}
