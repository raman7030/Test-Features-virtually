package l;

import java.util.BitSet;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۡ᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: KATI */
/* JADX INFO: loaded from: classes3.dex */
public final class C9203 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21631 f27884;

    public C9203(C21631 c21631) {
        this.f27884 = c21631;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23637(AbstractC23041 abstractC23041, AbstractC16466 abstractC16466, C23936 c23936, HashSet hashSet, BitSet bitSet) {
        C23936 c23936M52716;
        C8706 c8706;
        C21631 c21631 = this.f27884;
        int i = c21631.f69448;
        if (hashSet.add(new C22336(abstractC23041, 0, abstractC16466))) {
            if (abstractC23041 == null) {
                if (abstractC16466 == null) {
                    c23936.m52719(-2);
                    return;
                } else if (abstractC16466.mo27960()) {
                    c23936.m52719(-1);
                    return;
                }
            }
            if (abstractC23041 instanceof C9412) {
                if (abstractC16466 == null) {
                    c23936.m52719(-2);
                    return;
                }
                if (abstractC16466.mo27960()) {
                    c23936.m52719(-1);
                    return;
                }
                if (abstractC16466 != C21198.f68319) {
                    boolean z = bitSet.get(abstractC23041.f74154);
                    try {
                        bitSet.clear(abstractC23041.f74154);
                        for (int i2 = 0; i2 < abstractC16466.mo21317(); i2++) {
                            m23637((AbstractC23041) c21631.f69449.get(abstractC16466.mo21316(i2)), abstractC16466.mo21315(i2), c23936, hashSet, bitSet);
                        }
                        if (z) {
                            bitSet.set(abstractC23041.f74154);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        if (z) {
                            bitSet.set(abstractC23041.f74154);
                        }
                        throw th;
                    }
                }
            }
            int size = abstractC23041.f74151.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC12938 abstractC12938M51211 = abstractC23041.m51211(i3);
                if (abstractC12938M51211.getClass() == C8706.class) {
                    C8706 c8707 = (C8706) abstractC12938M51211;
                    if (!bitSet.get(c8707.f38806.f74154)) {
                        C8000 c8000M21314 = C8000.m21314(abstractC16466, c8707.f26506.f74153);
                        try {
                            bitSet.set(((C8706) abstractC12938M51211).f38806.f74154);
                            c8706 = c8707;
                            try {
                                m23637(abstractC12938M51211.f38806, c8000M21314, c23936, hashSet, bitSet);
                                bitSet.clear(c8706.f38806.f74154);
                            } catch (Throwable th2) {
                                th = th2;
                                bitSet.clear(c8706.f38806.f74154);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c8706 = c8707;
                        }
                    }
                } else {
                    if ((abstractC12938M51211 instanceof AbstractC7519) || abstractC12938M51211.mo5546()) {
                        m23637(abstractC12938M51211.f38806, abstractC16466, c23936, hashSet, bitSet);
                    } else if (abstractC12938M51211.getClass() == C12233.class) {
                        C23936 c23937 = new C23936(new int[0]);
                        c23937.m52720(1, i);
                        c23936.m52721(c23937);
                    } else {
                        C23936 c23936Mo3365 = abstractC12938M51211.mo3365();
                        if (c23936Mo3365 != null) {
                            if (abstractC12938M51211 instanceof C12730) {
                                C23936 c23938 = new C23936(new int[0]);
                                c23938.m52720(1, i);
                                if (c23938.m52722()) {
                                    c23936M52716 = null;
                                } else if (c23936Mo3365.m52722()) {
                                    c23936Mo3365 = new C23936(c23938);
                                } else {
                                    c23936M52716 = C23936.m52716(c23938, c23936Mo3365);
                                }
                                c23936Mo3365 = c23936M52716;
                            }
                            c23936.m52721(c23936Mo3365);
                        }
                    }
                }
            }
        }
    }
}
