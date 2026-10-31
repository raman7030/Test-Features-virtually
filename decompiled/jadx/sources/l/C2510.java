package l;

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
public class C2510 extends AbstractC16620 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ArrayList f7972;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f7973;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f7974;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f7975;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f7976;

    @Override // l.AbstractC16620
    public final /* bridge */ /* synthetic */ AbstractC16620 setDuration(long j) {
        m8010setDuration(j);
        return this;
    }

    public C2510() {
        this.f7972 = new ArrayList();
        this.f7974 = true;
        this.f7973 = false;
        this.f7975 = 0;
    }

    public C2510(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7972 = new ArrayList();
        this.f7974 = true;
        this.f7973 = false;
        this.f7975 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15043.f45926);
        m8007(C2958.m9018(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m8007(int i) {
        if (i == 0) {
            this.f7974 = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(C19370.m44628(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f7974 = false;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8006(AbstractC16620 abstractC16620) {
        this.f7972.add(abstractC16620);
        abstractC16620.mParent = this;
        long j = this.mDuration;
        if (j >= 0) {
            abstractC16620.setDuration(j);
        }
        if ((this.f7975 & 1) != 0) {
            abstractC16620.setInterpolator(getInterpolator());
        }
        if ((this.f7975 & 2) != 0) {
            getPropagation();
            abstractC16620.setPropagation(null);
        }
        if ((this.f7975 & 4) != 0) {
            abstractC16620.setPathMotion(getPathMotion());
        }
        if ((this.f7975 & 8) != 0) {
            abstractC16620.setEpicenterCallback(getEpicenterCallback());
        }
    }

    /* JADX INFO: renamed from: setDuration, reason: collision with other method in class */
    public final void m8010setDuration(long j) {
        ArrayList arrayList;
        super.setDuration(j);
        if (this.mDuration < 0 || (arrayList = this.f7972) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC16620) this.f7972.get(i)).setDuration(j);
        }
    }

    @Override // l.AbstractC16620
    public final AbstractC16620 setStartDelay(long j) {
        return (C2510) super.setStartDelay(j);
    }

    @Override // l.AbstractC16620
    public final C2510 setInterpolator(TimeInterpolator timeInterpolator) {
        this.f7975 |= 1;
        ArrayList arrayList = this.f7972;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC16620) this.f7972.get(i)).setInterpolator(timeInterpolator);
            }
        }
        return (C2510) super.setInterpolator(timeInterpolator);
    }

    @Override // l.AbstractC16620
    public final AbstractC16620 addTarget(View view) {
        for (int i = 0; i < this.f7972.size(); i++) {
            ((AbstractC16620) this.f7972.get(i)).addTarget(view);
        }
        return (C2510) super.addTarget(view);
    }

    @Override // l.AbstractC16620
    public final AbstractC16620 addTarget(int i) {
        for (int i2 = 0; i2 < this.f7972.size(); i2++) {
            ((AbstractC16620) this.f7972.get(i2)).addTarget(i);
        }
        return (C2510) super.addTarget(i);
    }

    @Override // l.AbstractC16620
    public final AbstractC16620 addTarget(String str) {
        for (int i = 0; i < this.f7972.size(); i++) {
            ((AbstractC16620) this.f7972.get(i)).addTarget(str);
        }
        return (C2510) super.addTarget(str);
    }

    @Override // l.AbstractC16620
    public final AbstractC16620 addTarget(Class cls) {
        for (int i = 0; i < this.f7972.size(); i++) {
            ((AbstractC16620) this.f7972.get(i)).addTarget(cls);
        }
        return (C2510) super.addTarget(cls);
    }

    @Override // l.AbstractC16620
    public final AbstractC16620 addListener(InterfaceC5872 interfaceC5872) {
        return (C2510) super.addListener(interfaceC5872);
    }

    @Override // l.AbstractC16620
    public final AbstractC16620 removeTarget(int i) {
        for (int i2 = 0; i2 < this.f7972.size(); i2++) {
            ((AbstractC16620) this.f7972.get(i2)).removeTarget(i);
        }
        return (C2510) super.removeTarget(i);
    }

    @Override // l.AbstractC16620
    public final AbstractC16620 removeTarget(View view) {
        for (int i = 0; i < this.f7972.size(); i++) {
            ((AbstractC16620) this.f7972.get(i)).removeTarget(view);
        }
        return (C2510) super.removeTarget(view);
    }

    @Override // l.AbstractC16620
    public final AbstractC16620 removeTarget(Class cls) {
        for (int i = 0; i < this.f7972.size(); i++) {
            ((AbstractC16620) this.f7972.get(i)).removeTarget(cls);
        }
        return (C2510) super.removeTarget(cls);
    }

    @Override // l.AbstractC16620
    public final AbstractC16620 removeTarget(String str) {
        for (int i = 0; i < this.f7972.size(); i++) {
            ((AbstractC16620) this.f7972.get(i)).removeTarget(str);
        }
        return (C2510) super.removeTarget(str);
    }

    @Override // l.AbstractC16620
    public final AbstractC16620 excludeTarget(View view, boolean z) {
        for (int i = 0; i < this.f7972.size(); i++) {
            ((AbstractC16620) this.f7972.get(i)).excludeTarget(view, z);
        }
        return super.excludeTarget(view, z);
    }

    @Override // l.AbstractC16620
    public final AbstractC16620 excludeTarget(String str, boolean z) {
        for (int i = 0; i < this.f7972.size(); i++) {
            ((AbstractC16620) this.f7972.get(i)).excludeTarget(str, z);
        }
        return super.excludeTarget(str, z);
    }

    @Override // l.AbstractC16620
    public final AbstractC16620 excludeTarget(int i, boolean z) {
        for (int i2 = 0; i2 < this.f7972.size(); i2++) {
            ((AbstractC16620) this.f7972.get(i2)).excludeTarget(i, z);
        }
        return super.excludeTarget(i, z);
    }

    @Override // l.AbstractC16620
    public final AbstractC16620 excludeTarget(Class cls, boolean z) {
        for (int i = 0; i < this.f7972.size(); i++) {
            ((AbstractC16620) this.f7972.get(i)).excludeTarget(cls, z);
        }
        return super.excludeTarget(cls, z);
    }

    @Override // l.AbstractC16620
    public final AbstractC16620 removeListener(InterfaceC5872 interfaceC5872) {
        return (C2510) super.removeListener(interfaceC5872);
    }

    @Override // l.AbstractC16620
    public final void setPathMotion(AbstractC0227 abstractC0227) {
        super.setPathMotion(abstractC0227);
        this.f7975 |= 4;
        if (this.f7972 != null) {
            for (int i = 0; i < this.f7972.size(); i++) {
                ((AbstractC16620) this.f7972.get(i)).setPathMotion(abstractC0227);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m8008(AbstractC16620 abstractC16620) {
        this.f7972.remove(abstractC16620);
        abstractC16620.mParent = null;
    }

    @Override // l.AbstractC16620
    public final void createAnimators(ViewGroup viewGroup, C0392 c0392, C0392 c0393, ArrayList arrayList, ArrayList arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f7972.size();
        for (int i = 0; i < size; i++) {
            AbstractC16620 abstractC16620 = (AbstractC16620) this.f7972.get(i);
            if (startDelay > 0 && (this.f7974 || i == 0)) {
                long startDelay2 = abstractC16620.getStartDelay();
                if (startDelay2 > 0) {
                    abstractC16620.setStartDelay(startDelay2 + startDelay);
                } else {
                    abstractC16620.setStartDelay(startDelay);
                }
            }
            abstractC16620.createAnimators(viewGroup, c0392, c0393, arrayList, arrayList2);
        }
    }

    @Override // l.AbstractC16620
    public final void runAnimators() {
        if (!this.f7972.isEmpty()) {
            C15914 c15914 = new C15914();
            c15914.f49155 = this;
            Iterator it = this.f7972.iterator();
            while (it.hasNext()) {
                ((AbstractC16620) it.next()).addListener(c15914);
            }
            this.f7976 = this.f7972.size();
            if (!this.f7974) {
                for (int i = 1; i < this.f7972.size(); i++) {
                    ((AbstractC16620) this.f7972.get(i - 1)).addListener(new C9566((AbstractC16620) this.f7972.get(i)));
                }
                AbstractC16620 abstractC16620 = (AbstractC16620) this.f7972.get(0);
                if (abstractC16620 != null) {
                    abstractC16620.runAnimators();
                    return;
                }
                return;
            }
            Iterator it2 = this.f7972.iterator();
            while (it2.hasNext()) {
                ((AbstractC16620) it2.next()).runAnimators();
            }
            return;
        }
        start();
        end();
    }

    @Override // l.AbstractC16620
    public final boolean hasAnimators() {
        for (int i = 0; i < this.f7972.size(); i++) {
            if (((AbstractC16620) this.f7972.get(i)).hasAnimators()) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC16620
    public final void prepareAnimatorsForSeeking() {
        this.mTotalDuration = 0L;
        C8860 c8860 = new C8860(this);
        for (int i = 0; i < this.f7972.size(); i++) {
            AbstractC16620 abstractC16620 = (AbstractC16620) this.f7972.get(i);
            abstractC16620.addListener(c8860);
            abstractC16620.prepareAnimatorsForSeeking();
            long totalDurationMillis = abstractC16620.getTotalDurationMillis();
            if (this.f7974) {
                this.mTotalDuration = Math.max(this.mTotalDuration, totalDurationMillis);
            } else {
                long j = this.mTotalDuration;
                abstractC16620.mSeekOffsetInParent = j;
                this.mTotalDuration = j + totalDurationMillis;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    @Override // l.AbstractC16620
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
            notifyListeners(InterfaceC10977.f33034, z2);
        }
        if (this.f7974) {
            for (int i3 = 0; i3 < this.f7972.size(); i3++) {
                ((AbstractC16620) this.f7972.get(i3)).setCurrentPlayTimeMillis(j, j2);
            }
        } else {
            int size = 1;
            while (true) {
                if (size >= this.f7972.size()) {
                    size = this.f7972.size();
                    break;
                } else if (((AbstractC16620) this.f7972.get(size)).mSeekOffsetInParent > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i4 = size - 1;
            if (j >= j2) {
                while (true) {
                    if (i4 < this.f7972.size()) {
                        AbstractC16620 abstractC16620 = (AbstractC16620) this.f7972.get(i4);
                        long j3 = abstractC16620.mSeekOffsetInParent;
                        z = z2;
                        i = i2;
                        long j4 = j - j3;
                        if (j4 < 0) {
                            break;
                        }
                        abstractC16620.setCurrentPlayTimeMillis(j4, j2 - j3);
                        i4++;
                        z2 = z;
                        i2 = i;
                    }
                }
            } else {
                z = z2;
                i = i2;
                while (i4 >= 0) {
                    AbstractC16620 abstractC16621 = (AbstractC16620) this.f7972.get(i4);
                    long j5 = abstractC16621.mSeekOffsetInParent;
                    long j6 = j - j5;
                    abstractC16621.setCurrentPlayTimeMillis(j6, j2 - j5);
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
                notifyListeners(InterfaceC10977.f33032, z);
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
            notifyListeners(InterfaceC10977.f33032, z);
        }
    }

    @Override // l.AbstractC16620
    public final boolean isSeekingSupported() {
        int size = this.f7972.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC16620) this.f7972.get(i)).isSeekingSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC16620
    public final void captureStartValues(C19444 c19444) {
        if (isValidTarget(c19444.f62890)) {
            for (AbstractC16620 abstractC16620 : this.f7972) {
                if (abstractC16620.isValidTarget(c19444.f62890)) {
                    abstractC16620.captureStartValues(c19444);
                    c19444.f62888.add(abstractC16620);
                }
            }
        }
    }

    @Override // l.AbstractC16620
    public final void captureEndValues(C19444 c19444) {
        if (isValidTarget(c19444.f62890)) {
            for (AbstractC16620 abstractC16620 : this.f7972) {
                if (abstractC16620.isValidTarget(c19444.f62890)) {
                    abstractC16620.captureEndValues(c19444);
                    c19444.f62888.add(abstractC16620);
                }
            }
        }
    }

    @Override // l.AbstractC16620
    public final void capturePropagationValues(C19444 c19444) {
        super.capturePropagationValues(c19444);
        int size = this.f7972.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC16620) this.f7972.get(i)).capturePropagationValues(c19444);
        }
    }

    @Override // l.AbstractC16620
    public final void pause(View view) {
        super.pause(view);
        int size = this.f7972.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC16620) this.f7972.get(i)).pause(view);
        }
    }

    @Override // l.AbstractC16620
    public final void resume(View view) {
        super.resume(view);
        int size = this.f7972.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC16620) this.f7972.get(i)).resume(view);
        }
    }

    @Override // l.AbstractC16620
    public final void cancel() {
        super.cancel();
        int size = this.f7972.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC16620) this.f7972.get(i)).cancel();
        }
    }

    @Override // l.AbstractC16620
    public final void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f7972.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC16620) this.f7972.get(i)).forceToEnd(viewGroup);
        }
    }

    @Override // l.AbstractC16620
    public final void setCanRemoveViews(boolean z) {
        super.setCanRemoveViews(z);
        int size = this.f7972.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC16620) this.f7972.get(i)).setCanRemoveViews(z);
        }
    }

    @Override // l.AbstractC16620
    public final void setPropagation(AbstractC6743 abstractC6743) {
        super.setPropagation(null);
        this.f7975 |= 2;
        int size = this.f7972.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC16620) this.f7972.get(i)).setPropagation(null);
        }
    }

    @Override // l.AbstractC16620
    public final void setEpicenterCallback(AbstractC12927 abstractC12927) {
        super.setEpicenterCallback(abstractC12927);
        this.f7975 |= 8;
        int size = this.f7972.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC16620) this.f7972.get(i)).setEpicenterCallback(abstractC12927);
        }
    }

    @Override // l.AbstractC16620
    public final String toString(String str) {
        String string = super.toString(str);
        for (int i = 0; i < this.f7972.size(); i++) {
            StringBuilder sbM19190 = C7166.m19190(string, "\n");
            sbM19190.append(((AbstractC16620) this.f7972.get(i)).toString(C16014.m37867(str, EnumC0121.f1143)));
            string = sbM19190.toString();
        }
        return string;
    }

    @Override // l.AbstractC16620
    public final AbstractC16620 clone() {
        C2510 c2510 = (C2510) super.clone();
        c2510.f7972 = new ArrayList();
        int size = this.f7972.size();
        for (int i = 0; i < size; i++) {
            AbstractC16620 abstractC16620Clone = ((AbstractC16620) this.f7972.get(i)).clone();
            c2510.f7972.add(abstractC16620Clone);
            abstractC16620Clone.mParent = c2510;
        }
        return c2510;
    }
}
