package p067l;

import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩸ۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB82 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C22800 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f71850;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f71851;

    public /* synthetic */ C22800(int i, Object obj) {
        this.f71850 = i;
        this.f71851 = obj;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f71850) {
            case 0:
                StringBuilder sb = (StringBuilder) this.f71851;
                Map.Entry entry = (Map.Entry) obj;
                sb.append((String) entry.getValue());
                sb.append(" -> ");
                sb.append((String) entry.getKey());
                sb.append(":\n");
                break;
            default:
                C7768 c7768 = (C7768) this.f71851;
                c7768.getClass();
                c7768.m17931(((C22198) obj).f70207);
                break;
        }
    }
}
