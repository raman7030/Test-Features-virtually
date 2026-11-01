package p067l;

import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: renamed from: l.ۧ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes3.dex */
public final class C13059 {

    /* JADX INFO: renamed from: ܽ */
    public int f36718;

    /* JADX INFO: renamed from: ᩳ */
    public final Stack f36719 = new Stack();

    /* JADX INFO: renamed from: ۧ */
    public final Stack f36717 = new Stack();

    /* JADX INFO: renamed from: ֫ */
    public final C0977 f36716 = new C0977();

    /* JADX INFO: renamed from: ܽ */
    public final void m29887(C4341 c4341) {
        this.f36718++;
        Stack stack = this.f36717;
        stack.push(c4341);
        this.f36719.clear();
        if (stack.size() > 100) {
            stack.remove(0);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m29886() {
        Iterator it = this.f36719.iterator();
        while (it.hasNext()) {
            if (((C4341) it.next()).f9710.startsWith("//SEARCH//")) {
                it.remove();
            }
        }
        Iterator it2 = this.f36717.iterator();
        while (it2.hasNext()) {
            if (((C4341) it2.next()).f9710.startsWith("//SEARCH//")) {
                it2.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m29885() {
        return !this.f36719.isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m29883() {
        return !this.f36717.isEmpty();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4341 m29884(C4341 c4341) {
        this.f36718++;
        this.f36717.push(c4341);
        return (C4341) this.f36719.pop();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4341 m29880(C4341 c4341) {
        this.f36718++;
        this.f36719.push(c4341);
        return (C4341) this.f36717.pop();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29881(C11996 c11996) {
        Stack<C4341> stack = this.f36719;
        c11996.mo15113(stack.size());
        for (C4341 c4341 : stack) {
            c11996.m27459(c4341.f9710);
            c11996.writeInt(c4341.f9711);
            c11996.m27445(c4341.f9708);
            c11996.m27459(c4341.f9709);
        }
        Stack<C4341> stack2 = this.f36717;
        c11996.mo15113(stack2.size());
        for (C4341 c4342 : stack2) {
            c11996.m27459(c4342.f9710);
            c11996.writeInt(c4342.f9711);
            c11996.m27445(c4342.f9708);
            c11996.m27459(c4342.f9709);
        }
        C0977 c0977 = this.f36716;
        c11996.mo15113(c0977.size());
        for (Map.Entry entry : c0977.entrySet()) {
            c11996.m27459((String) entry.getKey());
            c11996.writeInt(((Integer) entry.getValue()).intValue());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29882(C14677 c14677) {
        Stack stack = this.f36719;
        stack.clear();
        Stack stack2 = this.f36717;
        stack2.clear();
        C0977 c0977 = this.f36716;
        c0977.clear();
        int iM33581 = c14677.m33581();
        for (int i = 0; i < iM33581; i++) {
            stack.add(new C4341(c14677));
        }
        int iM33582 = c14677.m33581();
        for (int i2 = 0; i2 < iM33582; i2++) {
            stack2.add(new C4341(c14677));
        }
        int iM33583 = c14677.m33581();
        for (int i3 = 0; i3 < iM33583; i3++) {
            c0977.put(c14677.m33593(), Integer.valueOf(c14677.readInt()));
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m29888() {
        return this.f36718;
    }
}
