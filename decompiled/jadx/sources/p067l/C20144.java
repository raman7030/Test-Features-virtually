package p067l;

import com.umeng.analytics.pro.C0719o;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20144 extends C16789 implements InterfaceC16847 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f62362i;

    /* JADX INFO: renamed from: j */
    public long f62363j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20144(C2708[] c2708Arr, int i, int i2, int i3, long j, int i4) {
        super(c2708Arr, i, i2, i3);
        this.f62362i = i4;
        this.f62363j = j;
    }

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        switch (this.f62362i) {
            case 0:
                return C0719o.a.f2906l;
            default:
                return C0719o.a.f2905k;
        }
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ Comparator getComparator() {
        switch (this.f62362i) {
            case 0:
                break;
        }
        return C4779.$default$getComparator(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f62362i) {
            case 0:
                break;
        }
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        switch (this.f62362i) {
            case 0:
                break;
        }
        return C4779.$default$hasCharacteristics(this, i);
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC16847 trySplit() {
        switch (this.f62362i) {
            case 0:
                int i = this.f49477f;
                int i2 = this.f49478g;
                int i3 = (i + i2) >>> 1;
                if (i3 <= i) {
                    return null;
                }
                C2708[] c2708Arr = this.f49472a;
                this.f49478g = i3;
                long j = this.f62363j >>> 1;
                this.f62363j = j;
                return new C20144(c2708Arr, this.f49479h, i3, i2, j, 0);
            default:
                int i4 = this.f49477f;
                int i5 = this.f49478g;
                int i6 = (i4 + i5) >>> 1;
                if (i6 <= i4) {
                    return null;
                }
                C2708[] c2708Arr2 = this.f49472a;
                this.f49478g = i6;
                long j2 = this.f62363j >>> 1;
                this.f62363j = j2;
                return new C20144(c2708Arr2, this.f49479h, i6, i5, j2, 1);
        }
    }

    @Override // p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f62362i) {
            case 0:
                consumer.getClass();
                while (true) {
                    C2708 c2708M38035a = m38035a();
                    if (c2708M38035a != null) {
                        consumer.accept(c2708M38035a.f4545b);
                    }
                    break;
                }
                break;
            default:
                consumer.getClass();
                while (true) {
                    C2708 c2708M38035a2 = m38035a();
                    if (c2708M38035a2 != null) {
                        consumer.accept(c2708M38035a2.f4546c);
                    }
                    break;
                }
                break;
        }
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.f62362i) {
            case 0:
                consumer.getClass();
                C2708 c2708M38035a = m38035a();
                if (c2708M38035a == null) {
                    return false;
                }
                consumer.accept(c2708M38035a.f4545b);
                return true;
            default:
                consumer.getClass();
                C2708 c2708M38035a2 = m38035a();
                if (c2708M38035a2 == null) {
                    return false;
                }
                consumer.accept(c2708M38035a2.f4546c);
                return true;
        }
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        switch (this.f62362i) {
            case 0:
                break;
        }
        return this.f62363j;
    }
}
