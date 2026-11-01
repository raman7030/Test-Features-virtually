package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۤ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBIH */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11811 extends AbstractC13152 {

    /* JADX INFO: renamed from: ۙ */
    public Object f32967;

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ܳ */
    public AbstractC13152 mo12956() {
        return this;
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ܽ */
    public final void mo27068(String str) {
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ᩳ */
    public int mo12957() {
        return 0;
    }

    /* JADX INFO: renamed from: ۤ */
    private void m27059() {
        Object obj = this.f32967;
        if (obj instanceof C17173) {
            return;
        }
        C17173 c17173 = new C17173();
        this.f32967 = c17173;
        if (obj != null) {
            c17173.put(mo5244(), (String) obj);
        }
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ֫ */
    public AbstractC13152 mo22866(String str, String str2) {
        if (!(this.f32967 instanceof C17173) && str.equals("#doctype")) {
            this.f32967 = str2;
            return this;
        }
        m27059();
        super.mo22866(str, str2);
        return this;
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ۧ */
    public String mo27065(String str) {
        if (this.f32967 instanceof C17173) {
            return super.mo27065(str);
        }
        return mo5244().equals(str) ? (String) this.f32967 : "";
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo27071() {
        return this.f32967 instanceof C17173;
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ֫ */
    public final C17173 mo27062() {
        m27059();
        return (C17173) this.f32967;
    }

    /* JADX INFO: renamed from: ۗ */
    public String m27063() {
        return m27070();
    }

    /* JADX INFO: renamed from: ᩶ */
    public final String m27070() {
        return mo27065(mo5244());
    }

    /* JADX INFO: renamed from: ۫ */
    public String m27066() {
        return m27070();
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ᩳ */
    public boolean mo27069(String str) {
        m27059();
        return super.mo27069(str);
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ֫ */
    public String mo27060(String str) {
        m27059();
        return super.mo27060(str);
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ܽ */
    public String mo27067() {
        return m30138() ? this.f36967.mo27067() : "";
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ۜ */
    public final List mo27064() {
        return AbstractC13152.f36966;
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC13152 mo27061(AbstractC13152 abstractC13152) {
        AbstractC11811 abstractC11811 = (AbstractC11811) super.mo27061(abstractC13152);
        Object obj = this.f32967;
        if (obj instanceof C17173) {
            abstractC11811.f32967 = ((C17173) obj).clone();
        }
        return abstractC11811;
    }
}
