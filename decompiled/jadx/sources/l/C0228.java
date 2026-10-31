package l;

import android.content.DialogInterface;
import android.util.Pair;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B6V */
/* JADX INFO: loaded from: classes2.dex */
public final class C0228 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f1488;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f1489;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5168 f1491;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f1492;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f1493;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f1494;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f1496;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f1490 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public HashSet f1495 = new HashSet();

    public C0228(C5168 c5168, C16560 c16560, List list, Runnable runnable) {
        this.f1491 = c5168;
        this.f1489 = c16560;
        this.f1488 = list;
        this.f1494 = runnable;
        this.f1496 = c5168.f51870.m36526(C4303.m12893(c5168.m39741()));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C22933 c22933 = new C22933(this.f1489.m39056());
        c22933.mo49542((Runnable) null);
        c22933.m51049(R.string.MT_Protector);
        c22933.m51040("...");
        c22933.mo49547();
        this.f1493 = c22933;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        C5168 c5168;
        AbstractC15440 abstractC15440 = this.f1496;
        if (abstractC15440.mo23119()) {
            abstractC15440.mo23552();
        }
        abstractC15440.m36508();
        List<C10211> list = this.f1488;
        C4488 c4488 = new C4488(list.size());
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c5168 = this.f1491;
            if (!zHasNext) {
                break;
            }
            C10211 c10211 = (C10211) it.next();
            String strM25626 = c10211.m25626();
            String strM25625 = c10211.m25625();
            boolean zM25621 = c10211.m25621();
            C4007 entry = c5168.f16173.getEntry(strM25625.substring(1) + strM25626);
            if (entry == null) {
                entry = zM25621 ? c5168.f16173.getEntry(strM25626) : null;
            }
            if (entry == null) {
                c10211.m25619();
            } else {
                c4488.mo2318(entry.m12080(), Pair.create(c10211, entry));
            }
        }
        C18390.m42816(c4488.keySet(), new C19280(this, c5168, this.f1493, c4488));
        if (this.f1493.m51053()) {
            return;
        }
        for (C10211 c10212 : list) {
            if (c10212.m25627() && c10212.m25622() == null) {
                throw new IOException("Extract file failed: " + c10212.m25626());
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f1493.m51053()) {
            this.f1496.mo23552();
        } else {
            this.f1492 = true;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f1496.mo23552();
        this.f1489.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f1493.m51051();
        C15528.m36596();
        if (!this.f1492) {
            return;
        }
        C5168 c5168 = this.f1491;
        Iterator it = c5168.m39739().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList = this.f1490;
            if (zHasNext) {
                C5977 c5977 = (C5977) it.next();
                if (!this.f1495.contains(c5977.m16770())) {
                    arrayList.add(c5977);
                }
            } else {
                c5168.m39736((List) arrayList);
                try {
                    this.f1494.run();
                    return;
                } catch (Throwable th) {
                    this.f1489.m39056().m10223(th, (DialogInterface.OnDismissListener) null);
                    return;
                }
            }
        }
    }
}
