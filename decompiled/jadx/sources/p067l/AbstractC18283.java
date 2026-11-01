package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0698cb;

/* JADX INFO: renamed from: l.ܽܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: YBDT */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18283 extends AbstractC16941 {

    /* JADX INFO: renamed from: ۙ */
    public final C24318 f54582;

    /* JADX INFO: renamed from: ᩶ */
    public C24318 f54583;

    public AbstractC18283(C14260 c14260, C21637 c21637) {
        super(c14260, c21637);
        String string = m38522().m48854().getString();
        if (m41620()) {
            this.f54582 = C24318.m53648(string);
        } else {
            this.f54582 = C24318.m53649(string);
        }
        this.f54583 = null;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C24318 m41622() {
        return this.f54582;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24318 m41621(boolean z) {
        C24318 c24318 = this.f54582;
        if (z) {
            return c24318;
        }
        if (this.f54583 == null) {
            this.f54583 = c24318.m53652(m38521().m32771());
        }
        return this.f54583;
    }

    @Override // p067l.AbstractC16941, p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final int mo4595(AbstractC15405 abstractC15405) {
        int iMo4595 = super.mo4595(abstractC15405);
        return iMo4595 != 0 ? iMo4595 : this.f54582.compareTo(((AbstractC18283) abstractC15405).f54582);
    }

    @Override // p067l.InterfaceC3830
    public final C9566 getType() {
        return this.f54582.m53655();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֡ */
    public final boolean m41620() {
        C14260 c14260M38521 = m38521();
        if (c14260M38521.equals(C14260.f40622)) {
            String string = m38522().getName().getString();
            string.getClass();
            if (string.equals("invoke") || string.equals("invokeExact")) {
                return true;
            }
        } else if (c14260M38521.equals(C14260.f40610)) {
            String string2 = m38522().getName().getString();
            string2.getClass();
            byte b = -1;
            switch (string2.hashCode()) {
                case -1946504908:
                    if (string2.equals("getAndBitwiseOrRelease")) {
                        b = 0;
                    }
                    break;
                case -1686727776:
                    if (string2.equals("getAndBitwiseAndRelease")) {
                        b = 1;
                    }
                    break;
                case -1671098288:
                    if (string2.equals("compareAndSet")) {
                        b = 2;
                    }
                    break;
                case -1292078254:
                    if (string2.equals("compareAndExchangeRelease")) {
                        b = 3;
                    }
                    break;
                case -1117944904:
                    if (string2.equals("weakCompareAndSet")) {
                        b = 4;
                    }
                    break;
                case -1103072857:
                    if (string2.equals("getAndAddRelease")) {
                        b = 5;
                    }
                    break;
                case -1032914329:
                    if (string2.equals("getAndBitwiseAnd")) {
                        b = 6;
                    }
                    break;
                case -1032892181:
                    if (string2.equals("getAndBitwiseXor")) {
                        b = 7;
                    }
                    break;
                case -794517348:
                    if (string2.equals("getAndBitwiseXorRelease")) {
                        b = 8;
                    }
                    break;
                case -567150350:
                    if (string2.equals("weakCompareAndSetPlain")) {
                        b = 9;
                    }
                    break;
                case -240822786:
                    if (string2.equals("weakCompareAndSetAcquire")) {
                        b = 10;
                    }
                    break;
                case -230706875:
                    if (string2.equals("setRelease")) {
                        b = 11;
                    }
                    break;
                case -127361888:
                    if (string2.equals("getAcquire")) {
                        b = 12;
                    }
                    break;
                case -37641530:
                    if (string2.equals("getAndSetRelease")) {
                        b = C0698cb.f2569k;
                    }
                    break;
                case 102230:
                    if (string2.equals("get")) {
                        b = C0698cb.f2570l;
                    }
                    break;
                case 113762:
                    if (string2.equals("set")) {
                        b = 15;
                    }
                    break;
                case 93645315:
                    if (string2.equals("getAndBitwiseOrAcquire")) {
                        b = 16;
                    }
                    break;
                case 101293086:
                    if (string2.equals("setVolatile")) {
                        b = 17;
                    }
                    break;
                case 189872914:
                    if (string2.equals("getVolatile")) {
                        b = 18;
                    }
                    break;
                case 282707520:
                    if (string2.equals("getAndAdd")) {
                        b = 19;
                    }
                    break;
                case 282724865:
                    if (string2.equals("getAndSet")) {
                        b = 20;
                    }
                    break;
                case 353422447:
                    if (string2.equals("getAndBitwiseAndAcquire")) {
                        b = 21;
                    }
                    break;
                case 470702883:
                    if (string2.equals("setOpaque")) {
                        b = 22;
                    }
                    break;
                case 685319959:
                    if (string2.equals("getOpaque")) {
                        b = 23;
                    }
                    break;
                case 748071969:
                    if (string2.equals("compareAndExchangeAcquire")) {
                        b = 24;
                    }
                    break;
                case 937077366:
                    if (string2.equals("getAndAddAcquire")) {
                        b = 25;
                    }
                    break;
                case 1245632875:
                    if (string2.equals("getAndBitwiseXorAcquire")) {
                        b = 26;
                    }
                    break;
                case 1352153939:
                    if (string2.equals("getAndBitwiseOr")) {
                        b = 27;
                    }
                    break;
                case 1483964149:
                    if (string2.equals("compareAndExchange")) {
                        b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                    }
                    break;
                case 2002508693:
                    if (string2.equals("getAndSetAcquire")) {
                        b = 29;
                    }
                    break;
                case 2013994287:
                    if (string2.equals("weakCompareAndSetRelease")) {
                        b = 30;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                    return true;
            }
        }
        return false;
    }
}
