package l;

import com.alipay.sdk.m.y.l;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4YV */
/* JADX INFO: loaded from: classes5.dex */
public final class C18105 extends AbstractC16882 implements InterfaceC8708, InterfaceC19292 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f56358;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC5180 f56359;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f56360;

    public final String toString() {
        StringBuilder sbM32307 = C13325.m32307(128, "BackStackEntry{");
        sbM32307.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f56360 >= 0) {
            sbM32307.append(" #");
            sbM32307.append(this.f56360);
        }
        if (this.f51814 != null) {
            sbM32307.append(" ");
            sbM32307.append(this.f51814);
        }
        sbM32307.append(l.d);
        return sbM32307.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42226(String str, PrintWriter printWriter, boolean z) {
        String str2;
        ArrayList arrayList = this.f51805;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f51814);
            printWriter.print(" mIndex=");
            printWriter.print(this.f56360);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f56358);
            if (this.f51813 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f51813));
            }
            if (this.f51815 != 0 || this.f51803 != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f51815));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f51803));
            }
            if (this.f51804 != 0 || this.f51808 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f51804));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f51808));
            }
            if (this.f51810 != 0 || this.f51807 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f51810));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f51807);
            }
            if (this.f51809 != 0 || this.f51811 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f51809));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f51811);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C11239 c11239 = (C11239) arrayList.get(i);
            switch (c11239.f33695) {
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
                    str2 = "cmd=" + c11239.f33695;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c11239.f33700);
            if (z) {
                if (c11239.f33699 != 0 || c11239.f33701 != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c11239.f33699));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c11239.f33701));
                }
                if (c11239.f33696 != 0 || c11239.f33702 != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c11239.f33696));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c11239.f33702));
                }
            }
        }
    }

    public C18105(AbstractC5180 abstractC5180) {
        abstractC5180.m14889();
        if (abstractC5180.m14893() != null) {
            abstractC5180.m14893().m14435().getClassLoader();
        }
        this.f51805 = new ArrayList();
        this.f51806 = true;
        this.f51801 = false;
        this.f56360 = -1;
        this.f56359 = abstractC5180;
    }

    @Override // l.InterfaceC8708
    public final int getId() {
        return this.f56360;
    }

    @Override // l.AbstractC16882
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC16882 mo39690(ComponentCallbacksC9205 componentCallbacksC9205) {
        AbstractC5180 abstractC5180 = componentCallbacksC9205.mFragmentManager;
        if (abstractC5180 != null && abstractC5180 != this.f56359) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC9205.toString() + " is already attached to a FragmentManager.");
        }
        m39683(new C11239(componentCallbacksC9205, 3));
        return this;
    }

    @Override // l.AbstractC16882
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16882 mo39676(AbstractC14346 abstractC14346) {
        AbstractC5180 abstractC5180 = abstractC14346.mFragmentManager;
        if (abstractC5180 != null && abstractC5180 != this.f56359) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + abstractC14346.toString() + " is already attached to a FragmentManager.");
        }
        m39683(new C11239(abstractC14346, 4));
        return this;
    }

    @Override // l.AbstractC16882
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC16882 mo39687(AbstractC14346 abstractC14346) {
        AbstractC5180 abstractC5180 = abstractC14346.mFragmentManager;
        if (abstractC5180 != null && abstractC5180 != this.f56359) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + abstractC14346.toString() + " is already attached to a FragmentManager.");
        }
        m39683(new C11239(abstractC14346, 5));
        return this;
    }

    @Override // l.AbstractC16882
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC16882 mo39686(ComponentCallbacksC9205 componentCallbacksC9205) {
        AbstractC5180 abstractC5180 = componentCallbacksC9205.mFragmentManager;
        if (abstractC5180 != null && abstractC5180 != this.f56359) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC9205.toString() + " is already attached to a FragmentManager.");
        }
        m39683(new C11239(componentCallbacksC9205, 6));
        return this;
    }

    @Override // l.AbstractC16882
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16882 mo39674(AbstractC7739 abstractC7739) {
        AbstractC5180 abstractC5180 = abstractC7739.mFragmentManager;
        if (abstractC5180 != null && abstractC5180 != this.f56359) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + abstractC7739.toString() + " is already attached to a FragmentManager.");
        }
        m39683(new C11239(abstractC7739, 8));
        return this;
    }

    @Override // l.AbstractC16882
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16882 mo39675(ComponentCallbacksC9205 componentCallbacksC9205, EnumC13728 enumC13728) {
        AbstractC5180 abstractC5180 = componentCallbacksC9205.mFragmentManager;
        AbstractC5180 abstractC5181 = this.f56359;
        if (abstractC5180 != abstractC5181) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + abstractC5181);
        }
        if (enumC13728 == EnumC13728.INITIALIZED && componentCallbacksC9205.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC13728 + " after the Fragment has been created");
        }
        if (enumC13728 != EnumC13728.DESTROYED) {
            C11239 c11239 = new C11239();
            c11239.f33695 = 10;
            c11239.f33700 = componentCallbacksC9205;
            c11239.f33698 = false;
            c11239.f33703 = componentCallbacksC9205.mMaxState;
            c11239.f33697 = enumC13728;
            m39683(c11239);
            return this;
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC13728 + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42225(int i) {
        ArrayList arrayList = this.f51805;
        if (this.f51800) {
            if (AbstractC5180.m14853(2)) {
                toString();
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C11239 c11239 = (C11239) arrayList.get(i2);
                ComponentCallbacksC9205 componentCallbacksC9205 = c11239.f33700;
                if (componentCallbacksC9205 != null) {
                    componentCallbacksC9205.mBackStackNesting += i;
                    if (AbstractC5180.m14853(2)) {
                        C11003.toString(c11239.f33700);
                        int i3 = c11239.f33700.mBackStackNesting;
                    }
                }
            }
        }
    }

    @Override // l.AbstractC16882
    /* JADX INFO: renamed from: ֫ */
    public final void mo39680(int i, ComponentCallbacksC9205 componentCallbacksC9205, String str, int i2) {
        String str2 = componentCallbacksC9205.mPreviousWho;
        if (str2 != null) {
            C23232.m51538(componentCallbacksC9205, str2);
        }
        Class<?> cls = componentCallbacksC9205.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = componentCallbacksC9205.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(componentCallbacksC9205);
                sb.append(": was ");
                throw new IllegalStateException(C23202.m51498(sb, componentCallbacksC9205.mTag, " now ", str));
            }
            componentCallbacksC9205.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + componentCallbacksC9205 + " with tag " + str + " to container view with no id");
            }
            int i3 = componentCallbacksC9205.mFragmentId;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + componentCallbacksC9205 + ": was " + componentCallbacksC9205.mFragmentId + " now " + i);
            }
            componentCallbacksC9205.mFragmentId = i;
            componentCallbacksC9205.mContainerId = i;
        }
        m39683(new C11239(componentCallbacksC9205, i2));
        componentCallbacksC9205.mFragmentManager = this.f56359;
    }

    @Override // l.AbstractC16882
    /* JADX INFO: renamed from: ۧ */
    public final int mo39685() {
        return m42224(false);
    }

    @Override // l.AbstractC16882
    /* JADX INFO: renamed from: ܽ */
    public final int mo39689() {
        return m42224(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m42224(boolean z) {
        if (this.f56358) {
            throw new IllegalStateException("commit already called");
        }
        if (AbstractC5180.m14853(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new C0654());
            m42226(EnumC0121.f1143, printWriter, true);
            printWriter.close();
        }
        this.f56358 = true;
        boolean z2 = this.f51800;
        AbstractC5180 abstractC5180 = this.f56359;
        if (z2) {
            this.f56360 = abstractC5180.m14860();
        } else {
            this.f56360 = -1;
        }
        abstractC5180.m14877((InterfaceC19292) this, z);
        return this.f56360;
    }

    @Override // l.InterfaceC19292
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1499(ArrayList arrayList, ArrayList arrayList2) {
        if (AbstractC5180.m14853(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f51800) {
            return true;
        }
        AbstractC5180 abstractC5180 = this.f56359;
        if (abstractC5180.f16212 == null) {
            abstractC5180.f16212 = new ArrayList();
        }
        abstractC5180.f16212.add(this);
        return true;
    }

    @Override // l.AbstractC16882
    /* JADX INFO: renamed from: ᩳ */
    public final void mo39692() {
        if (this.f51800) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f51806 = false;
        this.f56359.m14876(this, false);
    }
}
