package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4YV */
/* JADX INFO: loaded from: classes5.dex */
public final class C19575 extends AbstractC18413 implements InterfaceC10644, InterfaceC20703 {

    /* JADX INFO: renamed from: ֡ */
    public boolean f59571;

    /* JADX INFO: renamed from: ֨ */
    public final AbstractC7291 f59572;

    /* JADX INFO: renamed from: ۚ */
    public int f59573;

    public final String toString() {
        StringBuilder sbM34407 = C15033.m34407(128, "BackStackEntry{");
        sbM34407.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f59573 >= 0) {
            sbM34407.append(" #");
            sbM34407.append(this.f59573);
        }
        if (this.f54995 != null) {
            sbM34407.append(" ");
            sbM34407.append(this.f54995);
        }
        sbM34407.append(C0249l.f1198d);
        return sbM34407.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44485(String str, PrintWriter printWriter, boolean z) {
        String str2;
        ArrayList arrayList = this.f54986;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f54995);
            printWriter.print(" mIndex=");
            printWriter.print(this.f59573);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f59571);
            if (this.f54994 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f54994));
            }
            if (this.f54996 != 0 || this.f54984 != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f54996));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f54984));
            }
            if (this.f54985 != 0 || this.f54989 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f54985));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f54989));
            }
            if (this.f54991 != 0 || this.f54988 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f54991));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f54988);
            }
            if (this.f54990 != 0 || this.f54992 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f54990));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f54992);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C13050 c13050 = (C13050) arrayList.get(i);
            switch (c13050.f36695) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c13050.f36695;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c13050.f36700);
            if (z) {
                if (c13050.f36699 != 0 || c13050.f36701 != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c13050.f36699));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c13050.f36701));
                }
                if (c13050.f36696 != 0 || c13050.f36702 != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c13050.f36696));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c13050.f36702));
                }
            }
        }
    }

    public C19575(AbstractC7291 abstractC7291) {
        abstractC7291.m16799();
        if (abstractC7291.m16803() != null) {
            abstractC7291.m16803().m16339().getClassLoader();
        }
        this.f54986 = new ArrayList();
        this.f54987 = true;
        this.f54982 = false;
        this.f59573 = -1;
        this.f59572 = abstractC7291;
    }

    @Override // p067l.InterfaceC10644
    public final int getId() {
        return this.f59573;
    }

    @Override // p067l.AbstractC18413
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC18413 mo41931(ComponentCallbacksC11117 componentCallbacksC11117) {
        AbstractC7291 abstractC7291 = componentCallbacksC11117.mFragmentManager;
        if (abstractC7291 != null && abstractC7291 != this.f59572) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC11117.toString() + " is already attached to a FragmentManager.");
        }
        m41924(new C13050(componentCallbacksC11117, 3));
        return this;
    }

    @Override // p067l.AbstractC18413
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC18413 mo41917(AbstractC16003 abstractC16003) {
        AbstractC7291 abstractC7291 = abstractC16003.mFragmentManager;
        if (abstractC7291 != null && abstractC7291 != this.f59572) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + abstractC16003.toString() + " is already attached to a FragmentManager.");
        }
        m41924(new C13050(abstractC16003, 4));
        return this;
    }

    @Override // p067l.AbstractC18413
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC18413 mo41928(AbstractC16003 abstractC16003) {
        AbstractC7291 abstractC7291 = abstractC16003.mFragmentManager;
        if (abstractC7291 != null && abstractC7291 != this.f59572) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + abstractC16003.toString() + " is already attached to a FragmentManager.");
        }
        m41924(new C13050(abstractC16003, 5));
        return this;
    }

    @Override // p067l.AbstractC18413
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC18413 mo41927(ComponentCallbacksC11117 componentCallbacksC11117) {
        AbstractC7291 abstractC7291 = componentCallbacksC11117.mFragmentManager;
        if (abstractC7291 != null && abstractC7291 != this.f59572) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC11117.toString() + " is already attached to a FragmentManager.");
        }
        m41924(new C13050(componentCallbacksC11117, 6));
        return this;
    }

    @Override // p067l.AbstractC18413
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC18413 mo41915(AbstractC9724 abstractC9724) {
        AbstractC7291 abstractC7291 = abstractC9724.mFragmentManager;
        if (abstractC7291 != null && abstractC7291 != this.f59572) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + abstractC9724.toString() + " is already attached to a FragmentManager.");
        }
        m41924(new C13050(abstractC9724, 8));
        return this;
    }

    @Override // p067l.AbstractC18413
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC18413 mo41916(ComponentCallbacksC11117 componentCallbacksC11117, EnumC15415 enumC15415) {
        AbstractC7291 abstractC7291 = componentCallbacksC11117.mFragmentManager;
        AbstractC7291 abstractC7292 = this.f59572;
        if (abstractC7291 != abstractC7292) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + abstractC7292);
        }
        if (enumC15415 == EnumC15415.INITIALIZED && componentCallbacksC11117.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC15415 + " after the Fragment has been created");
        }
        if (enumC15415 != EnumC15415.DESTROYED) {
            C13050 c13050 = new C13050();
            c13050.f36695 = 10;
            c13050.f36700 = componentCallbacksC11117;
            c13050.f36698 = false;
            c13050.f36703 = componentCallbacksC11117.mMaxState;
            c13050.f36697 = enumC15415;
            m41924(c13050);
            return this;
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC15415 + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44484(int i) {
        ArrayList arrayList = this.f54986;
        if (this.f54981) {
            if (AbstractC7291.m16763(2)) {
                toString();
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C13050 c13050 = (C13050) arrayList.get(i2);
                ComponentCallbacksC11117 componentCallbacksC11117 = c13050.f36700;
                if (componentCallbacksC11117 != null) {
                    componentCallbacksC11117.mBackStackNesting += i;
                    if (AbstractC7291.m16763(2)) {
                        C12826.toString(c13050.f36700);
                        int i3 = c13050.f36700.mBackStackNesting;
                    }
                }
            }
        }
    }

    @Override // p067l.AbstractC18413
    /* JADX INFO: renamed from: ֫ */
    public final void mo41921(int i, ComponentCallbacksC11117 componentCallbacksC11117, String str, int i2) {
        String str2 = componentCallbacksC11117.mPreviousWho;
        if (str2 != null) {
            C24448.m53935(componentCallbacksC11117, str2);
        }
        Class<?> cls = componentCallbacksC11117.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = componentCallbacksC11117.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(componentCallbacksC11117);
                sb.append(": was ");
                throw new IllegalStateException(C24420.m53894(sb, componentCallbacksC11117.mTag, " now ", str));
            }
            componentCallbacksC11117.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + componentCallbacksC11117 + " with tag " + str + " to container view with no id");
            }
            int i3 = componentCallbacksC11117.mFragmentId;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + componentCallbacksC11117 + ": was " + componentCallbacksC11117.mFragmentId + " now " + i);
            }
            componentCallbacksC11117.mFragmentId = i;
            componentCallbacksC11117.mContainerId = i;
        }
        m41924(new C13050(componentCallbacksC11117, i2));
        componentCallbacksC11117.mFragmentManager = this.f59572;
    }

    @Override // p067l.AbstractC18413
    /* JADX INFO: renamed from: ۧ */
    public final int mo41926() {
        return m44483(false);
    }

    @Override // p067l.AbstractC18413
    /* JADX INFO: renamed from: ܽ */
    public final int mo41930() {
        return m44483(true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m44483(boolean z) {
        if (this.f59571) {
            throw new IllegalStateException("commit already called");
        }
        if (AbstractC7291.m16763(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new C2990());
            m44485(EnumC2483.f3919, printWriter, true);
            printWriter.close();
        }
        this.f59571 = true;
        boolean z2 = this.f54981;
        AbstractC7291 abstractC7291 = this.f59572;
        if (z2) {
            this.f59573 = abstractC7291.m16770();
        } else {
            this.f59573 = -1;
        }
        abstractC7291.m16787((InterfaceC20703) this, z);
        return this.f59573;
    }

    @Override // p067l.InterfaceC20703
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3897(ArrayList arrayList, ArrayList arrayList2) {
        if (AbstractC7291.m16763(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f54981) {
            return true;
        }
        AbstractC7291 abstractC7291 = this.f59572;
        if (abstractC7291.f19053 == null) {
            abstractC7291.f19053 = new ArrayList();
        }
        abstractC7291.f19053.add(this);
        return true;
    }

    @Override // p067l.AbstractC18413
    /* JADX INFO: renamed from: ᩳ */
    public final void mo41933() {
        if (this.f54981) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f54987 = false;
        this.f59572.m16786(this, false);
    }
}
