package p067l;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵᩺ */
/* JADX INFO: compiled from: 6ALU */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC3025(m5117c = "androidx.core.view.ViewKt$allViews$1", m5118f = "View.kt", m5119l = {409, 411}, m5120m = "invokeSuspend")
public final class C1822 extends AbstractC17106 implements InterfaceC21152 {

    /* JADX INFO: renamed from: ۗ */
    public int f66461;

    /* JADX INFO: renamed from: ۙ */
    public /* synthetic */ Object f66462;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ View f66463;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1822(View view, InterfaceC13575 interfaceC13575) {
        super(interfaceC13575);
        this.f66463 = view;
    }

    @Override // p067l.AbstractC5038
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13575 mo10743(Object obj, InterfaceC13575 interfaceC13575) {
        C1822 c1822 = new C1822(this.f66463, interfaceC13575);
        c1822.f66462 = obj;
        return c1822;
    }

    @Override // p067l.InterfaceC21152
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9100(Object obj, Object obj2) {
        return ((C1822) mo10743(obj, (InterfaceC13575) obj2)).mo10745(C10027.f27775);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r6 == r0) goto L20;
     */
    @Override // p067l.AbstractC5038
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo10745(Object obj) throws Throwable {
        AbstractC8588 abstractC8588;
        EnumC9061 enumC9061 = EnumC9061.COROUTINE_SUSPENDED;
        int i = this.f66461;
        View view = this.f66463;
        if (i == 0) {
            C20086.m45502(obj);
            abstractC8588 = (AbstractC8588) this.f66462;
            this.f66462 = abstractC8588;
            this.f66461 = 1;
            if (abstractC8588.mo19997(view, this) != enumC9061) {
            }
            return enumC9061;
        }
        if (i == 1) {
            abstractC8588 = (AbstractC8588) this.f66462;
            C20086.m45502(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C20086.m45502(obj);
        }
        return C10027.f27775;
        if (view instanceof ViewGroup) {
            this.f66462 = null;
            this.f66461 = 2;
            abstractC8588.getClass();
            Object objMo19996 = abstractC8588.mo19996((Iterator) new C1036(new C1052((ViewGroup) view)), (InterfaceC13575) this);
            if (objMo19996 != enumC9061) {
                objMo19996 = C10027.f27775;
            }
        }
        return C10027.f27775;
    }
}
