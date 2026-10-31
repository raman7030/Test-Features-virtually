package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15731 extends AbstractC18555 implements InterfaceC3738, InterfaceC8677 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f48531 = new ArrayList();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public HashSet f48528 = null;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f48529 = null;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HashSet f48527 = null;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public HashSet f48530 = null;

    @Override // l.InterfaceC8677
    /* JADX INFO: renamed from: ֫ */
    public final Set mo7585() {
        return null;
    }

    @Override // l.InterfaceC8677
    /* JADX INFO: renamed from: ۧ */
    public final void mo7589(HashSet hashSet) {
    }

    @Override // l.InterfaceC3738
    public final List getChildren() {
        return this.f48531;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo7197(C5149 c5149) {
        this.f48531.add(c5149);
    }

    @Override // l.InterfaceC8677
    /* JADX INFO: renamed from: ֫ */
    public final void mo7587(HashSet hashSet) {
        this.f48528 = hashSet;
    }

    @Override // l.InterfaceC8677
    /* JADX INFO: renamed from: ᩳ */
    public final Set mo7593() {
        return this.f48528;
    }

    @Override // l.InterfaceC8677
    /* JADX INFO: renamed from: ֫ */
    public final void mo7586(String str) {
        this.f48529 = str;
    }

    @Override // l.InterfaceC8677
    /* JADX INFO: renamed from: ۧ */
    public final String mo7588() {
        return this.f48529;
    }

    @Override // l.InterfaceC8677
    /* JADX INFO: renamed from: ᩳ */
    public final void mo7594(HashSet hashSet) {
        this.f48527 = hashSet;
    }

    @Override // l.InterfaceC8677
    /* JADX INFO: renamed from: ܿ */
    public final Set mo7592() {
        return this.f48527;
    }

    @Override // l.InterfaceC8677
    /* JADX INFO: renamed from: ܽ */
    public final void mo7591(HashSet hashSet) {
        this.f48530 = hashSet;
    }

    @Override // l.InterfaceC8677
    /* JADX INFO: renamed from: ܳ */
    public final Set mo7590() {
        return this.f48530;
    }
}
