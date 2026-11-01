package p067l;

import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩹ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: V3XC */
/* JADX INFO: loaded from: classes.dex */
public final class C23292 {

    /* JADX INFO: renamed from: ֫ */
    public final TreeMap f73283 = new TreeMap();

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f73284 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC13399 f73285 = C9375.f25556;

    /* JADX INFO: renamed from: ֫ */
    public final void m51871(C5187 c5187) {
        this.f73283.put(c5187.m48106(), c5187);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m51874(String str) {
        return this.f73283.containsKey(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC21281 m51875(String str) {
        return (AbstractC21281) this.f73283.get(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51873(InterfaceC10825 interfaceC10825) {
        Iterator it = this.f73283.values().iterator();
        while (it.hasNext()) {
            ((AbstractC21281) it.next()).mo11125(interfaceC10825);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51872(C8034 c8034) {
        this.f73285 = c8034;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13399 m51870() {
        return this.f73285;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m51876(String str) {
        if (str == null) {
            return null;
        }
        ConcurrentMapC12768 concurrentMapC12768 = this.f73284;
        String str2 = (String) concurrentMapC12768.get(str);
        if (str2 != null) {
            return str2;
        }
        String str3 = (String) concurrentMapC12768.putIfAbsent(str, str);
        return str3 == null ? str : str3;
    }
}
