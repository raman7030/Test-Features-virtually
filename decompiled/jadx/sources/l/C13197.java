package l;

import android.content.ContextWrapper;
import android.content.Intent;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۬ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB7O */
/* JADX INFO: loaded from: classes4.dex */
public class C13197 extends AbstractC3316 {

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39460 = 0;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f39461;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f39464;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f39465;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public AtomicInteger f39463 = new AtomicInteger();

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f39462 = C16293.f50119.m36527();

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76965;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector, m11517("saveAsPath"), C4925.m14327(R.string.MT_Protector));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        m11555(R.string.MT_Protector);
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() {
        AbstractC15440 abstractC15440 = this.f39462;
        AbstractC15440 abstractC15440M11515 = m11515("saveAsPath");
        AbstractC15440 abstractC15440M11516 = m11515("inputPath1");
        AbstractC15440 abstractC15440M11517 = m11515("inputPath2");
        AbstractC15440 abstractC15440M36527 = C16293.f50111.m36527();
        this.f39465 = abstractC15440M36527;
        C8918 c8918 = new C8918(abstractC15440M36527);
        try {
            c8918.m23018(0);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c8918.m23007());
            mo11520(C4925.m14306(R.string.MT_Protector, abstractC15440M11516.getName()));
            AbstractC15440 abstractC15440M30658 = C12492.m30658(abstractC15440M11516);
            for (C4634 c4634 : C12395.m30550(abstractC15440M30658, abstractC15440)) {
                c8918.m23012("a/" + c4634.m13579());
                c4634.m13580(bufferedOutputStream);
                bufferedOutputStream.flush();
                if (mo1526()) {
                    break;
                }
            }
            abstractC15440.mo23552();
            if (abstractC15440M30658 != abstractC15440M11516) {
                abstractC15440M30658.mo27929();
            }
            if (mo1526()) {
                C17222 c17222M40521 = C17222.m40521();
                c8918.close();
                return c17222M40521;
            }
            System.gc();
            mo11520(C4925.m14306(R.string.MT_Protector, abstractC15440M11517.getName()));
            AbstractC15440 abstractC15440M30659 = C12492.m30658(abstractC15440M11517);
            for (C4634 c4635 : C12395.m30550(abstractC15440M30659, abstractC15440)) {
                c8918.m23012("b/" + c4635.m13579());
                c4635.m13580(bufferedOutputStream);
                bufferedOutputStream.flush();
                if (mo1526()) {
                    break;
                }
            }
            abstractC15440.mo23552();
            if (abstractC15440M30659 != abstractC15440M11517) {
                abstractC15440M30659.mo27929();
            }
            if (mo1526()) {
                C17222 c17222M40522 = C17222.m40521();
                c8918.close();
                return c17222M40522;
            }
            c8918.close();
            m11555(R.string.MT_Protector);
            HashMap map = new HashMap();
            this.f39461 = C16293.f50111.m36526(abstractC15440M11515.getName());
            C18090 c18090 = new C18090(this.f39465);
            try {
                C8918 c8919 = new C8918(this.f39461);
                try {
                    for (C3545 c3545 : c18090.m42210()) {
                        String name = c3545.getName();
                        if (name.startsWith("a/")) {
                            ((C4731) C13843.computeIfAbsent(map, name.substring(2), new C3320())).f15016 = c3545;
                        } else if (name.startsWith("b/")) {
                            ((C4731) C13843.computeIfAbsent(map, name.substring(2), new C3320())).f15017 = c3545;
                        }
                    }
                    C21434 c21434 = new C21434();
                    c21434.m48549("type", "arsc");
                    c21434.m48549("file1", abstractC15440M11516.mo23554());
                    c21434.m48549("file2", abstractC15440M11517.mo23554());
                    c21434.m48549("versionCode", (Object) 26101061);
                    c8919.m23012("info.json");
                    c8919.write(c21434.mo14987().getBytes(Charset.defaultCharset()));
                    for (Map.Entry entry : map.entrySet()) {
                        if (mo1526()) {
                            C17222 c17222M40523 = C17222.m40521();
                            c8919.close();
                            c18090.close();
                            return c17222M40523;
                        }
                        String str = (String) entry.getKey();
                        C4731 c4731 = (C4731) entry.getValue();
                        C3545 c3546 = c4731.f15016;
                        AtomicInteger atomicInteger = this.f39463;
                        if (c3546 != null && c4731.f15017 == null) {
                            c8919.m23012("a/" + str);
                            c8919.m23011(c18090.m42189(c4731.f15016));
                            atomicInteger.incrementAndGet();
                        } else if (c3546 == null && c4731.f15017 != null) {
                            c8919.m23012("b/" + str);
                            c8919.m23011(c18090.m42189(c4731.f15017));
                            atomicInteger.incrementAndGet();
                        } else if (!Arrays.equals(c18090.m42193(c3546, (C19277) null), c18090.m42193(c4731.f15017, (C19277) null))) {
                            c8919.m23012("a/" + str);
                            c8919.m23011(c18090.m42189(c4731.f15016));
                            c8919.m23012("b/" + str);
                            c8919.m23011(c18090.m42189(c4731.f15017));
                            atomicInteger.incrementAndGet();
                        }
                        try {
                            c18090.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                    c8919.close();
                    c18090.close();
                    return C17222.m40520();
                } catch (Throwable th2) {
                    try {
                        c8919.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                c18090.close();
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                c8918.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        this.f39464 = true;
        m32020(main, c17222);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32020(ContextWrapper contextWrapper, C17222 c17222) {
        if (c17222.m40526()) {
            if (this.f39463.get() == 0) {
                this.f39461.mo23552();
                C21374.m48463(R.string.MT_Protector);
            } else {
                Intent intent = new Intent(contextWrapper, (Class<?>) ActivityC22006.class);
                intent.setData(this.f39461.m36522());
                intent.putExtra("savedAsPath", m11556("saveAsPath"));
                contextWrapper.startActivity(intent);
            }
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        AbstractC15440 abstractC15440;
        if (!this.f39464) {
            m32020(C4925.m14335(), c17222);
        }
        if (!c17222.m40526() && (abstractC15440 = this.f39461) != null) {
            abstractC15440.mo23552();
        }
        AbstractC15440 abstractC15441 = this.f39465;
        if (abstractC15441 != null) {
            abstractC15441.mo23552();
        }
        this.f39462.mo23552();
        C15528.m36596();
    }
}
