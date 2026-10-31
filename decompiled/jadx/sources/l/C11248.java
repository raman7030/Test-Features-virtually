package l;

import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: renamed from: l.ۧ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes3.dex */
public final class C11248 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f33718;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Stack f33719 = new Stack();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Stack f33717 = new Stack();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2727 f33716 = new C2727();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m27825(C2075 c2075) {
        this.f33718++;
        Stack stack = this.f33717;
        stack.push(c2075);
        this.f33719.clear();
        if (stack.size() > 100) {
            stack.remove(0);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m27824() {
        Iterator it = this.f33719.iterator();
        while (it.hasNext()) {
            if (((C2075) it.next()).f6926.startsWith("//SEARCH//")) {
                it.remove();
            }
        }
        Iterator it2 = this.f33717.iterator();
        while (it2.hasNext()) {
            if (((C2075) it2.next()).f6926.startsWith("//SEARCH//")) {
                it2.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m27823() {
        return !this.f33719.isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27821() {
        return !this.f33717.isEmpty();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2075 m27822(C2075 c2075) {
        this.f33718++;
        this.f33717.push(c2075);
        return (C2075) this.f33719.pop();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2075 m27818(C2075 c2075) {
        this.f33718++;
        this.f33719.push(c2075);
        return (C2075) this.f33717.pop();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27819(C10130 c10130) {
        Stack<C2075> stack = this.f33719;
        c10130.mo13231(stack.size());
        for (C2075 c2075 : stack) {
            c10130.m25439(c2075.f6926);
            c10130.writeInt(c2075.f6927);
            c10130.m25425(c2075.f6924);
            c10130.m25439(c2075.f6925);
        }
        Stack<C2075> stack2 = this.f33717;
        c10130.mo13231(stack2.size());
        for (C2075 c2076 : stack2) {
            c10130.m25439(c2076.f6926);
            c10130.writeInt(c2076.f6927);
            c10130.m25425(c2076.f6924);
            c10130.m25439(c2076.f6925);
        }
        C2727 c2727 = this.f33716;
        c10130.mo13231(c2727.size());
        for (Map.Entry entry : c2727.entrySet()) {
            c10130.m25439((String) entry.getKey());
            c10130.writeInt(((Integer) entry.getValue()).intValue());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27820(C12951 c12951) {
        Stack stack = this.f33719;
        stack.clear();
        Stack stack2 = this.f33717;
        stack2.clear();
        C2727 c2727 = this.f33716;
        c2727.clear();
        int iM31494 = c12951.m31494();
        for (int i = 0; i < iM31494; i++) {
            stack.add(new C2075(c12951));
        }
        int iM31495 = c12951.m31494();
        for (int i2 = 0; i2 < iM31495; i2++) {
            stack2.add(new C2075(c12951));
        }
        int iM31496 = c12951.m31494();
        for (int i3 = 0; i3 < iM31496; i3++) {
            c2727.put(c12951.m31506(), Integer.valueOf(c12951.readInt()));
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m27826() {
        return this.f33718;
    }
}
