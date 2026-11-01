package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C5052 extends AbstractC11934 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C14439 f11831;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ ArrayList f11832;

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo5539() {
        return false;
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ܽ */
    public final void mo5540(AbstractC5462 abstractC5462) {
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo5541() {
        return false;
    }

    public C5052(C14439 c14439, ArrayList arrayList) {
        this.f11831 = c14439;
        this.f11832 = arrayList;
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ۧ */
    public final int mo5538(AbstractC5462 abstractC5462) {
        return AbstractC11934.m27276(this.f11831.m33051() ? 3 : 0, 0);
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5537(C14849 c14849, AbstractC5462 abstractC5462, AbstractC5462 abstractC5463) {
        int bindingAdapterPosition = abstractC5462.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC5463.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || bindingAdapterPosition2 == -1) {
            return false;
        }
        ArrayList arrayList = this.f11832;
        C8123.m18819(bindingAdapterPosition, bindingAdapterPosition2, arrayList);
        this.f11831.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C18402.m41899(arrayList);
        return true;
    }
}
