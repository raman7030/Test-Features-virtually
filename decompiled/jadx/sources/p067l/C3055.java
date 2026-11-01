package p067l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.֡᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07T7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3055 {

    /* JADX INFO: renamed from: ֫ */
    public Map f5489;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC6409 f5490;

    /* JADX INFO: renamed from: ܽ */
    public final C22700 f5491;

    /* JADX INFO: renamed from: ܿ */
    public final C22700 f5492;

    /* JADX INFO: renamed from: ᩳ */
    public long f5493;

    public C3055(C22700 c22700, C22700 c22701) {
        this.f5491 = c22700;
        this.f5492 = c22701;
        this.f5489 = m5160() ? new C0977() : null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5159(C22700 c22700, C3055 c3055) {
        C15525.putIfAbsent(this.f5489, c22700, c3055);
        if (this.f5489.size() == 20) {
            this.f5489 = new HashMap(this.f5489);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m5160() {
        C22700 c22700 = this.f5492;
        int length = c22700.length();
        return length == 0 || c22700.charAt(length - 1) == '/';
    }
}
