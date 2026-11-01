package p067l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17319 extends AbstractC20003 implements InterfaceC5921, InterfaceC10615 {

    /* JADX INFO: renamed from: ᩷ */
    public List f51671 = new ArrayList();

    /* JADX INFO: renamed from: ۡ */
    public HashSet f51668 = null;

    /* JADX INFO: renamed from: ۢ */
    public String f51669 = null;

    /* JADX INFO: renamed from: ۖ */
    public HashSet f51667 = null;

    /* JADX INFO: renamed from: ܺ */
    public HashSet f51670 = null;

    @Override // p067l.InterfaceC10615
    /* JADX INFO: renamed from: ֫ */
    public final Set mo9655() {
        return null;
    }

    @Override // p067l.InterfaceC10615
    /* JADX INFO: renamed from: ۧ */
    public final void mo9659(HashSet hashSet) {
    }

    @Override // p067l.InterfaceC5921
    public final List getChildren() {
        return this.f51671;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo9276(C7262 c7262) {
        this.f51671.add(c7262);
    }

    @Override // p067l.InterfaceC10615
    /* JADX INFO: renamed from: ֫ */
    public final void mo9657(HashSet hashSet) {
        this.f51668 = hashSet;
    }

    @Override // p067l.InterfaceC10615
    /* JADX INFO: renamed from: ᩳ */
    public final Set mo9663() {
        return this.f51668;
    }

    @Override // p067l.InterfaceC10615
    /* JADX INFO: renamed from: ֫ */
    public final void mo9656(String str) {
        this.f51669 = str;
    }

    @Override // p067l.InterfaceC10615
    /* JADX INFO: renamed from: ۧ */
    public final String mo9658() {
        return this.f51669;
    }

    @Override // p067l.InterfaceC10615
    /* JADX INFO: renamed from: ᩳ */
    public final void mo9664(HashSet hashSet) {
        this.f51667 = hashSet;
    }

    @Override // p067l.InterfaceC10615
    /* JADX INFO: renamed from: ܿ */
    public final Set mo9662() {
        return this.f51667;
    }

    @Override // p067l.InterfaceC10615
    /* JADX INFO: renamed from: ܽ */
    public final void mo9661(HashSet hashSet) {
        this.f51670 = hashSet;
    }

    @Override // p067l.InterfaceC10615
    /* JADX INFO: renamed from: ܳ */
    public final Set mo9660() {
        return this.f51670;
    }
}
