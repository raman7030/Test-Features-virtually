package l;

import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB82 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21498 implements Consumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69153;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f69154;

    public /* synthetic */ C21498(int i, Object obj) {
        this.f69153 = i;
        this.f69154 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f69153) {
            case 0:
                StringBuilder sb = (StringBuilder) this.f69154;
                Map.Entry entry = (Map.Entry) obj;
                sb.append((String) entry.getValue());
                sb.append(" -> ");
                sb.append((String) entry.getKey());
                sb.append(":\n");
                break;
            default:
                C5681 c5681 = (C5681) this.f69154;
                c5681.getClass();
                c5681.m15996(((C20864) obj).f67521);
                break;
        }
    }
}
