package l;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 6ALU */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC0690(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {409, 411}, m = "invokeSuspend")
public final class C19766 extends AbstractC15506 implements InterfaceC19763 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f63823;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public /* synthetic */ Object f63824;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f63825;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19766(View view, InterfaceC11791 interfaceC11791) {
        super(interfaceC11791);
        this.f63825 = view;
    }

    @Override // l.AbstractC2808
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11791 mo8682(Object obj, InterfaceC11791 interfaceC11791) {
        C19766 c19766 = new C19766(this.f63825, interfaceC11791);
        c19766.f63824 = obj;
        return c19766;
    }

    @Override // l.InterfaceC19763
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6973(Object obj, Object obj2) {
        return ((C19766) mo8682(obj, (InterfaceC11791) obj2)).mo8684(C8058.f24861);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r6 == r0) goto L20;
     */
    @Override // l.AbstractC2808
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8684(Object obj) throws Throwable {
        AbstractC6544 abstractC6544;
        EnumC7041 enumC7041 = EnumC7041.COROUTINE_SUSPENDED;
        int i = this.f63823;
        View view = this.f63825;
        if (i == 0) {
            C18642.m43236(obj);
            abstractC6544 = (AbstractC6544) this.f63824;
            this.f63824 = abstractC6544;
            this.f63823 = 1;
            if (abstractC6544.mo18047(view, this) != enumC7041) {
            }
            return enumC7041;
        }
        if (i == 1) {
            abstractC6544 = (AbstractC6544) this.f63824;
            C18642.m43236(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C18642.m43236(obj);
        }
        return C8058.f24861;
        if (view instanceof ViewGroup) {
            this.f63824 = null;
            this.f63823 = 2;
            abstractC6544.getClass();
            Object objMo18046 = abstractC6544.mo18046((Iterator) new C3911(new C4243((ViewGroup) view)), (InterfaceC11791) this);
            if (objMo18046 != enumC7041) {
                objMo18046 = C8058.f24861;
            }
        }
        return C8058.f24861;
    }
}
