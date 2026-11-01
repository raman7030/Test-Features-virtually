package p067l;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: l.ۙܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58MT */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class C6902 extends AbstractC11185 {

    /* JADX INFO: renamed from: ֫֫ */
    public final C10255 f17961;

    /* JADX INFO: renamed from: ۛ */
    public final C5318 f17962;

    /* JADX INFO: renamed from: ۟ */
    public final C13010 f17963;

    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC16716 f17964;

    /* JADX INFO: renamed from: ۧ֫ */
    public InterfaceC2830 f17965;

    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC12878 f17967;

    /* JADX INFO: renamed from: ᩺ */
    public final C10307 f17969;

    /* JADX INFO: renamed from: ۨ */
    public final long f17966 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܽ֫ */
    public final boolean f17968 = true;

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ۧ */
    public final void mo11868() {
    }

    @Override // p067l.AbstractC11185
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11869() {
    }

    public C6902(C4292 c4292, InterfaceC16716 interfaceC16716, InterfaceC12878 interfaceC12878) {
        this.f17964 = interfaceC16716;
        this.f17967 = interfaceC12878;
        C23718 c23718 = new C23718();
        c23718.m52736(Uri.EMPTY);
        c23718.m52738(c4292.f9539.toString());
        c23718.m52739((List) AbstractC16192.m36873of((Object) c4292));
        c23718.m52737((Object) null);
        C13010 c13010M52735 = c23718.m52735();
        this.f17963 = c13010M52735;
        C3601 c3601 = new C3601();
        c3601.m6697((String) C17592.m40056(c4292.f9538, "text/x-unknown"));
        c3601.m6703(c4292.f9536);
        c3601.m6698(c4292.f9535);
        c3601.m6686(c4292.f9537);
        c3601.m6705(c4292.f9534);
        String str = c4292.f9533;
        c3601.m6701(str != null ? str : null);
        this.f17969 = c3601.m6672();
        C6659 c6659 = new C6659();
        c6659.m15164(c4292.f9539);
        c6659.m15162(1);
        this.f17962 = c6659.m15161();
        this.f17961 = new C10255(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, c13010M52735, null);
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final C13010 mo11862() {
        return this.f17963;
    }

    @Override // p067l.AbstractC11185
    /* JADX INFO: renamed from: ֫ */
    public final void mo11865(InterfaceC2830 interfaceC2830) {
        this.f17965 = interfaceC2830;
        m25803(this.f17961);
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11441 mo11861(C17474 c17474, InterfaceC23016 interfaceC23016, long j) {
        return new C23666(this.f17962, this.f17964, this.f17965, this.f17969, this.f17966, this.f17967, m25806(c17474), this.f17968, null);
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final void mo11866(InterfaceC11441 interfaceC11441) {
        ((C23666) interfaceC11441).f75350.m25038((InterfaceC8854) null);
    }
}
