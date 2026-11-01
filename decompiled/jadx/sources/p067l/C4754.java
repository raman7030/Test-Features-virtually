package p067l;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5H1 */
/* JADX INFO: loaded from: classes2.dex */
public class C4754 extends AbstractC18164 {

    /* JADX INFO: renamed from: ۗ */
    public ArrayList f10763;

    /* JADX INFO: renamed from: ۙ */
    public boolean f10764;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f10765;

    /* JADX INFO: renamed from: ᩸ */
    public int f10766;

    /* JADX INFO: renamed from: ᩹ */
    public int f10767;

    @Override // p067l.AbstractC18164
    public final /* bridge */ /* synthetic */ AbstractC18164 setDuration(long j) {
        m56064setDuration(j);
        return this;
    }

    public C4754() {
        this.f10763 = new ArrayList();
        this.f10765 = true;
        this.f10764 = false;
        this.f10766 = 0;
    }

    public C4754(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10763 = new ArrayList();
        this.f10765 = true;
        this.f10764 = false;
        this.f10766 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16665.f49042);
        m10055(C0989.m11086(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m10055(int i) {
        if (i == 0) {
            this.f10765 = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(C20778.m46922(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f10765 = false;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m10054(AbstractC18164 abstractC18164) {
        this.f10763.add(abstractC18164);
        abstractC18164.mParent = this;
        long j = this.mDuration;
        if (j >= 0) {
            abstractC18164.setDuration(j);
        }
        if ((this.f10766 & 1) != 0) {
            abstractC18164.setInterpolator(getInterpolator());
        }
        if ((this.f10766 & 2) != 0) {
            getPropagation();
            abstractC18164.setPropagation(null);
        }
        if ((this.f10766 & 4) != 0) {
            abstractC18164.setPathMotion(getPathMotion());
        }
        if ((this.f10766 & 8) != 0) {
            abstractC18164.setEpicenterCallback(getEpicenterCallback());
        }
    }

    /* JADX INFO: renamed from: setDuration, reason: collision with other method in class */
    public final void m56064setDuration(long j) {
        ArrayList arrayList;
        super.setDuration(j);
        if (this.mDuration < 0 || (arrayList = this.f10763) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC18164) this.f10763.get(i)).setDuration(j);
        }
    }

    @Override // p067l.AbstractC18164
    public final AbstractC18164 setStartDelay(long j) {
        return (C4754) super.setStartDelay(j);
    }

    @Override // p067l.AbstractC18164
    public final C4754 setInterpolator(TimeInterpolator timeInterpolator) {
        this.f10766 |= 1;
        ArrayList arrayList = this.f10763;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC18164) this.f10763.get(i)).setInterpolator(timeInterpolator);
            }
        }
        return (C4754) super.setInterpolator(timeInterpolator);
    }

    @Override // p067l.AbstractC18164
    public final AbstractC18164 addTarget(View view) {
        for (int i = 0; i < this.f10763.size(); i++) {
            ((AbstractC18164) this.f10763.get(i)).addTarget(view);
        }
        return (C4754) super.addTarget(view);
    }

    @Override // p067l.AbstractC18164
    public final AbstractC18164 addTarget(int i) {
        for (int i2 = 0; i2 < this.f10763.size(); i2++) {
            ((AbstractC18164) this.f10763.get(i2)).addTarget(i);
        }
        return (C4754) super.addTarget(i);
    }

    @Override // p067l.AbstractC18164
    public final AbstractC18164 addTarget(String str) {
        for (int i = 0; i < this.f10763.size(); i++) {
            ((AbstractC18164) this.f10763.get(i)).addTarget(str);
        }
        return (C4754) super.addTarget(str);
    }

    @Override // p067l.AbstractC18164
    public final AbstractC18164 addTarget(Class cls) {
        for (int i = 0; i < this.f10763.size(); i++) {
            ((AbstractC18164) this.f10763.get(i)).addTarget(cls);
        }
        return (C4754) super.addTarget(cls);
    }

    @Override // p067l.AbstractC18164
    public final AbstractC18164 addListener(InterfaceC7949 interfaceC7949) {
        return (C4754) super.addListener(interfaceC7949);
    }

    @Override // p067l.AbstractC18164
    public final AbstractC18164 removeTarget(int i) {
        for (int i2 = 0; i2 < this.f10763.size(); i2++) {
            ((AbstractC18164) this.f10763.get(i2)).removeTarget(i);
        }
        return (C4754) super.removeTarget(i);
    }

    @Override // p067l.AbstractC18164
    public final AbstractC18164 removeTarget(View view) {
        for (int i = 0; i < this.f10763.size(); i++) {
            ((AbstractC18164) this.f10763.get(i)).removeTarget(view);
        }
        return (C4754) super.removeTarget(view);
    }

    @Override // p067l.AbstractC18164
    public final AbstractC18164 removeTarget(Class cls) {
        for (int i = 0; i < this.f10763.size(); i++) {
            ((AbstractC18164) this.f10763.get(i)).removeTarget(cls);
        }
        return (C4754) super.removeTarget(cls);
    }

    @Override // p067l.AbstractC18164
    public final AbstractC18164 removeTarget(String str) {
        for (int i = 0; i < this.f10763.size(); i++) {
            ((AbstractC18164) this.f10763.get(i)).removeTarget(str);
        }
        return (C4754) super.removeTarget(str);
    }

    @Override // p067l.AbstractC18164
    public final AbstractC18164 excludeTarget(View view, boolean z) {
        for (int i = 0; i < this.f10763.size(); i++) {
            ((AbstractC18164) this.f10763.get(i)).excludeTarget(view, z);
        }
        return super.excludeTarget(view, z);
    }

    @Override // p067l.AbstractC18164
    public final AbstractC18164 excludeTarget(String str, boolean z) {
        for (int i = 0; i < this.f10763.size(); i++) {
            ((AbstractC18164) this.f10763.get(i)).excludeTarget(str, z);
        }
        return super.excludeTarget(str, z);
    }

    @Override // p067l.AbstractC18164
    public final AbstractC18164 excludeTarget(int i, boolean z) {
        for (int i2 = 0; i2 < this.f10763.size(); i2++) {
            ((AbstractC18164) this.f10763.get(i2)).excludeTarget(i, z);
        }
        return super.excludeTarget(i, z);
    }

    @Override // p067l.AbstractC18164
    public final AbstractC18164 excludeTarget(Class cls, boolean z) {
        for (int i = 0; i < this.f10763.size(); i++) {
            ((AbstractC18164) this.f10763.get(i)).excludeTarget(cls, z);
        }
        return super.excludeTarget(cls, z);
    }

    @Override // p067l.AbstractC18164
    public final AbstractC18164 removeListener(InterfaceC7949 interfaceC7949) {
        return (C4754) super.removeListener(interfaceC7949);
    }

    @Override // p067l.AbstractC18164
    public final void setPathMotion(AbstractC2584 abstractC2584) {
        super.setPathMotion(abstractC2584);
        this.f10766 |= 4;
        if (this.f10763 != null) {
            for (int i = 0; i < this.f10763.size(); i++) {
                ((AbstractC18164) this.f10763.get(i)).setPathMotion(abstractC2584);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m10056(AbstractC18164 abstractC18164) {
        this.f10763.remove(abstractC18164);
        abstractC18164.mParent = null;
    }

    @Override // p067l.AbstractC18164
    public final void createAnimators(ViewGroup viewGroup, C2741 c2741, C2741 c2742, ArrayList arrayList, ArrayList arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f10763.size();
        for (int i = 0; i < size; i++) {
            AbstractC18164 abstractC18164 = (AbstractC18164) this.f10763.get(i);
            if (startDelay > 0 && (this.f10765 || i == 0)) {
                long startDelay2 = abstractC18164.getStartDelay();
                if (startDelay2 > 0) {
                    abstractC18164.setStartDelay(startDelay2 + startDelay);
                } else {
                    abstractC18164.setStartDelay(startDelay);
                }
            }
            abstractC18164.createAnimators(viewGroup, c2741, c2742, arrayList, arrayList2);
        }
    }

    @Override // p067l.AbstractC18164
    public final void runAnimators() {
        if (!this.f10763.isEmpty()) {
            C17493 c17493 = new C17493();
            c17493.f52301 = this;
            Iterator it = this.f10763.iterator();
            while (it.hasNext()) {
                ((AbstractC18164) it.next()).addListener(c17493);
            }
            this.f10767 = this.f10763.size();
            if (!this.f10765) {
                for (int i = 1; i < this.f10763.size(); i++) {
                    ((AbstractC18164) this.f10763.get(i - 1)).addListener(new C11460((AbstractC18164) this.f10763.get(i)));
                }
                AbstractC18164 abstractC18164 = (AbstractC18164) this.f10763.get(0);
                if (abstractC18164 != null) {
                    abstractC18164.runAnimators();
                    return;
                }
                return;
            }
            Iterator it2 = this.f10763.iterator();
            while (it2.hasNext()) {
                ((AbstractC18164) it2.next()).runAnimators();
            }
            return;
        }
        start();
        end();
    }

    @Override // p067l.AbstractC18164
    public final boolean hasAnimators() {
        for (int i = 0; i < this.f10763.size(); i++) {
            if (((AbstractC18164) this.f10763.get(i)).hasAnimators()) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.AbstractC18164
    public final void prepareAnimatorsForSeeking() {
        this.mTotalDuration = 0L;
        C10789 c10789 = new C10789(this);
        for (int i = 0; i < this.f10763.size(); i++) {
            AbstractC18164 abstractC18164 = (AbstractC18164) this.f10763.get(i);
            abstractC18164.addListener(c10789);
            abstractC18164.prepareAnimatorsForSeeking();
            long totalDurationMillis = abstractC18164.getTotalDurationMillis();
            if (this.f10765) {
                this.mTotalDuration = Math.max(this.mTotalDuration, totalDurationMillis);
            } else {
                long j = this.mTotalDuration;
                abstractC18164.mSeekOffsetInParent = j;
                this.mTotalDuration = j + totalDurationMillis;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    @Override // p067l.AbstractC18164
    public final void setCurrentPlayTimeMillis(long j, long j2) {
        boolean z;
        int i;
        long totalDurationMillis = getTotalDurationMillis();
        if (this.mParent != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > totalDurationMillis && j2 > totalDurationMillis) {
                return;
            }
        }
        boolean z2 = j < j2;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if ((i2 >= 0 && j2 < 0) || (j <= totalDurationMillis && j2 > totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(InterfaceC12801.f36027, z2);
        }
        if (this.f10765) {
            for (int i3 = 0; i3 < this.f10763.size(); i3++) {
                ((AbstractC18164) this.f10763.get(i3)).setCurrentPlayTimeMillis(j, j2);
            }
        } else {
            int size = 1;
            while (true) {
                if (size >= this.f10763.size()) {
                    size = this.f10763.size();
                    break;
                } else if (((AbstractC18164) this.f10763.get(size)).mSeekOffsetInParent > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i4 = size - 1;
            if (j >= j2) {
                while (true) {
                    if (i4 < this.f10763.size()) {
                        AbstractC18164 abstractC18164 = (AbstractC18164) this.f10763.get(i4);
                        long j3 = abstractC18164.mSeekOffsetInParent;
                        z = z2;
                        i = i2;
                        long j4 = j - j3;
                        if (j4 < 0) {
                            break;
                        }
                        abstractC18164.setCurrentPlayTimeMillis(j4, j2 - j3);
                        i4++;
                        z2 = z;
                        i2 = i;
                    }
                }
            } else {
                z = z2;
                i = i2;
                while (i4 >= 0) {
                    AbstractC18164 abstractC18165 = (AbstractC18164) this.f10763.get(i4);
                    long j5 = abstractC18165.mSeekOffsetInParent;
                    long j6 = j - j5;
                    abstractC18165.setCurrentPlayTimeMillis(j6, j2 - j5);
                    if (j6 >= 0) {
                        break;
                    } else {
                        i4--;
                    }
                }
            }
            if (this.mParent != null) {
                if ((j > totalDurationMillis || j2 > totalDurationMillis) && (i >= 0 || j2 < 0)) {
                    return;
                }
                if (j > totalDurationMillis) {
                    this.mEnded = true;
                }
                notifyListeners(InterfaceC12801.f36025, z);
            }
        }
        z = z2;
        i = i2;
        if (this.mParent != null) {
            if (j > totalDurationMillis) {
                return;
            } else {
                return;
            }
            if (j > totalDurationMillis) {
                this.mEnded = true;
            }
            notifyListeners(InterfaceC12801.f36025, z);
        }
    }

    @Override // p067l.AbstractC18164
    public final boolean isSeekingSupported() {
        int size = this.f10763.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC18164) this.f10763.get(i)).isSeekingSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // p067l.AbstractC18164
    public final void captureStartValues(C20848 c20848) {
        if (isValidTarget(c20848.f65506)) {
            for (AbstractC18164 abstractC18164 : this.f10763) {
                if (abstractC18164.isValidTarget(c20848.f65506)) {
                    abstractC18164.captureStartValues(c20848);
                    c20848.f65504.add(abstractC18164);
                }
            }
        }
    }

    @Override // p067l.AbstractC18164
    public final void captureEndValues(C20848 c20848) {
        if (isValidTarget(c20848.f65506)) {
            for (AbstractC18164 abstractC18164 : this.f10763) {
                if (abstractC18164.isValidTarget(c20848.f65506)) {
                    abstractC18164.captureEndValues(c20848);
                    c20848.f65504.add(abstractC18164);
                }
            }
        }
    }

    @Override // p067l.AbstractC18164
    public final void capturePropagationValues(C20848 c20848) {
        super.capturePropagationValues(c20848);
        int size = this.f10763.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC18164) this.f10763.get(i)).capturePropagationValues(c20848);
        }
    }

    @Override // p067l.AbstractC18164
    public final void pause(View view) {
        super.pause(view);
        int size = this.f10763.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC18164) this.f10763.get(i)).pause(view);
        }
    }

    @Override // p067l.AbstractC18164
    public final void resume(View view) {
        super.resume(view);
        int size = this.f10763.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC18164) this.f10763.get(i)).resume(view);
        }
    }

    @Override // p067l.AbstractC18164
    public final void cancel() {
        super.cancel();
        int size = this.f10763.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC18164) this.f10763.get(i)).cancel();
        }
    }

    @Override // p067l.AbstractC18164
    public final void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f10763.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC18164) this.f10763.get(i)).forceToEnd(viewGroup);
        }
    }

    @Override // p067l.AbstractC18164
    public final void setCanRemoveViews(boolean z) {
        super.setCanRemoveViews(z);
        int size = this.f10763.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC18164) this.f10763.get(i)).setCanRemoveViews(z);
        }
    }

    @Override // p067l.AbstractC18164
    public final void setPropagation(AbstractC8777 abstractC8777) {
        super.setPropagation(null);
        this.f10766 |= 2;
        int size = this.f10763.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC18164) this.f10763.get(i)).setPropagation(null);
        }
    }

    @Override // p067l.AbstractC18164
    public final void setEpicenterCallback(AbstractC14654 abstractC14654) {
        super.setEpicenterCallback(abstractC14654);
        this.f10766 |= 8;
        int size = this.f10763.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC18164) this.f10763.get(i)).setEpicenterCallback(abstractC14654);
        }
    }

    @Override // p067l.AbstractC18164
    public final String toString(String str) {
        String string = super.toString(str);
        for (int i = 0; i < this.f10763.size(); i++) {
            StringBuilder sbM21133 = C9179.m21133(string, "\n");
            sbM21133.append(((AbstractC18164) this.f10763.get(i)).toString(C17588.m40053(str, EnumC2483.f3919)));
            string = sbM21133.toString();
        }
        return string;
    }

    @Override // p067l.AbstractC18164
    public final AbstractC18164 clone() {
        C4754 c4754 = (C4754) super.clone();
        c4754.f10763 = new ArrayList();
        int size = this.f10763.size();
        for (int i = 0; i < size; i++) {
            AbstractC18164 abstractC18164Clone = ((AbstractC18164) this.f10763.get(i)).clone();
            c4754.f10763.add(abstractC18164Clone);
            abstractC18164Clone.mParent = c4754;
        }
        return c4754;
    }
}
