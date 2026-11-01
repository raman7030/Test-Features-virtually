package p067l;

import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0719o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: l.᩸ۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VZ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC22717 {

    /* JADX INFO: renamed from: ᩷֫ */
    public static Comparator f71613 = new C4612();

    /* JADX INFO: renamed from: ۙ */
    public final C5361 f71621;

    /* JADX INFO: renamed from: ۚ */
    public final C6032 f71622;

    /* JADX INFO: renamed from: ۜ */
    public final C5006 f71624;

    /* JADX INFO: renamed from: ۟ */
    public final C8043 f71626;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC24728 f71631;

    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC6623[] f71636;

    /* JADX INFO: renamed from: ܺ */
    public final C21770 f71640;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC8635 f71643;

    /* JADX INFO: renamed from: ܿ֫ */
    public final InterfaceC4335 f71644;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final InterfaceC9305 f71646;

    /* JADX INFO: renamed from: ᩵ */
    public final C5676 f71648;

    /* JADX INFO: renamed from: ᩹ */
    public final C16759 f71652;

    /* JADX INFO: renamed from: ᩺ */
    public final C9873 f71653;

    /* JADX INFO: renamed from: ᩻֫ */
    public final C16069 f71655;

    /* JADX INFO: renamed from: ۘ */
    public final HashMap f71620 = new HashMap();

    /* JADX INFO: renamed from: ܽ֫ */
    public int f71642 = 0;

    /* JADX INFO: renamed from: ۜ֫ */
    public int f71625 = 0;

    /* JADX INFO: renamed from: ֫֫ */
    public int f71617 = 0;

    /* JADX INFO: renamed from: ֨ */
    public int f71615 = 0;

    /* JADX INFO: renamed from: ۗ */
    public int f71619 = 0;

    /* JADX INFO: renamed from: ۡ */
    public int f71628 = 0;

    /* JADX INFO: renamed from: ᩷ */
    public int f71650 = 0;

    /* JADX INFO: renamed from: ᩶ */
    public int f71649 = 0;

    /* JADX INFO: renamed from: ۧ֫ */
    public int f71632 = 0;

    /* JADX INFO: renamed from: ۢ */
    public int f71629 = 0;

    /* JADX INFO: renamed from: ܳ֫ */
    public int f71638 = 0;

    /* JADX INFO: renamed from: ֡ */
    public int f71614 = 0;

    /* JADX INFO: renamed from: ܽ */
    public int f71641 = 0;

    /* JADX INFO: renamed from: ܳ */
    public int f71637 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public int f71645 = 0;

    /* JADX INFO: renamed from: ֫ */
    public int f71616 = 0;

    /* JADX INFO: renamed from: ᩴ */
    public int f71647 = 0;

    /* JADX INFO: renamed from: ۖ */
    public int f71618 = 0;

    /* JADX INFO: renamed from: ܶ */
    public int f71639 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public int f71651 = 0;

    /* JADX INFO: renamed from: ۠ */
    public boolean f71627 = false;

    /* JADX INFO: renamed from: ۫ */
    public int f71634 = 0;

    /* JADX INFO: renamed from: ۬ */
    public int f71635 = 0;

    /* JADX INFO: renamed from: ۨ */
    public int f71633 = 0;

    /* JADX INFO: renamed from: ۛ */
    public int f71623 = 0;

    /* JADX INFO: renamed from: ۤ */
    public int f71630 = 0;

    /* JADX INFO: renamed from: ᩻ */
    public Comparator f71654 = new C5953((C20765) this);

    /* JADX INFO: renamed from: ֫ */
    public abstract C20094 mo46906();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo46908(C3270 c3270, Object obj);

    /* JADX INFO: renamed from: ۧ */
    public static void m50861(C17351 c17351, int i, int i2) throws IOException {
        C17351.m39336(c17351, i);
        if (i > 0) {
            C17351.m39336(c17351, i2);
        } else {
            C17351.m39336(c17351, 0);
        }
    }

    public AbstractC22717(C9873 c9873) {
        this.f71653 = c9873;
        C20094 c20094Mo46906 = mo46906();
        this.f71646 = c20094Mo46906.m45512();
        C16069 c16069M45515 = c20094Mo46906.m45515();
        this.f71655 = c16069M45515;
        C8043 c8043M45519 = c20094Mo46906.m45519();
        this.f71626 = c8043M45519;
        C6032 c6032M45514 = c20094Mo46906.m45514();
        this.f71622 = c6032M45514;
        C5361 c5361M45510 = c20094Mo46906.m45510();
        this.f71621 = c5361M45510;
        this.f71640 = c20094Mo46906.m45518();
        C5006 c5006M45516 = c20094Mo46906.m45516();
        this.f71624 = c5006M45516;
        C16759 c16759M45520 = c20094Mo46906.m45520();
        this.f71652 = c16759M45520;
        this.f71644 = c20094Mo46906.m45511();
        this.f71631 = c20094Mo46906.m45509();
        this.f71643 = c20094Mo46906.m45513();
        this.f71648 = c20094Mo46906.m45517();
        this.f71636 = new InterfaceC6623[]{c16069M45515, c8043M45519, c6032M45514, c5361M45510, c5006M45516, c16759M45520};
    }

    /* JADX INFO: renamed from: ۧ */
    public static C17351 m50858(InterfaceC7353 interfaceC7353, int i) {
        return new C17351(interfaceC7353.mo5811(i), i);
    }

    /* JADX INFO: renamed from: ᩳ */
    private int m50866() {
        return (this.f71652.getItemCount() * 8) + (this.f71624.m10639() * 4) + (this.f71640.getItemCount() * 32) + (this.f71621.getItemCount() * 8) + (this.f71622.getItemCount() * 8) + (this.f71626.getItemCount() * 12) + (this.f71655.getItemCount() * 4) + (this.f71646.getItemCount() * 4) + UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m50872() {
        for (InterfaceC6623 interfaceC6623 : this.f71636) {
            if (interfaceC6623.getItemCount() > 65536) {
                System.err.println("Number of section items overflowed: 65535: " + interfaceC6623.getClass().getSimpleName() + "[" + interfaceC6623.getItemCount() + "]");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50870(InterfaceC7353 interfaceC7353) {
        InterfaceC2658 interfaceC2658M48561 = C21435.m48561();
        C21770 c21770 = this.f71640;
        if (this.f71621.getItemCount() <= 65536) {
            if (m50872()) {
                throw new IOException("Number of section items overflowed: 65535");
            }
            C5006 c5006 = this.f71624;
            Iterator it = ((AbstractC7373) c5006.mo10634()).iterator();
            int i = -1;
            while (it.hasNext()) {
                int index = ((InterfaceC6227) ((Map.Entry) it.next()).getKey()).getIndex();
                if (index >= 0 && index < 65536 && index > i) {
                    i = index;
                }
            }
            int itemCount = (i + 1) - c5006.getItemCount();
            if (itemCount > 0) {
                c5006.m10636(itemCount);
            }
            try {
                int iM50866 = m50866();
                C17351 c17351M50858 = m50858(interfaceC7353, 0);
                C17351 c17351M50859 = m50858(interfaceC7353, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                C17351 c17351M508510 = m50858(interfaceC7353, iM50866);
                try {
                    m50851(c17351M50859, c17351M508510);
                    m50854(c17351M50859);
                    m50863(c17351M508510);
                    m50856(c17351M50859);
                    m50869(c17351M50859);
                    m50857(c17351M50859);
                    C17351 c17351M508511 = m50858(interfaceC7353, (c5006.m10639() * 4) + (c21770.getItemCount() * 32) + c17351M50859.getPosition());
                    try {
                        m50868(c17351M508511);
                        c17351M508511.close();
                        m50862(c17351M508510);
                        C17351 c17351M508512 = m50858(interfaceC7353, (c21770.getItemCount() * 32) + c17351M50859.getPosition());
                        try {
                            m50865(c17351M508512);
                            c17351M508512.close();
                            m50867(c17351M508510);
                            m50864(c17351M508510);
                            m50860(c17351M508510);
                            m50847(c17351M508510);
                            m50852(c17351M508510, interfaceC2658M48561.mo4075());
                            m50846(interfaceC7353, c17351M50859, c17351M508510);
                            m50855(c17351M508510);
                            m50848(c17351M50858, iM50866, c17351M508510.getPosition());
                            c17351M50858.close();
                            c17351M50859.close();
                            c17351M508510.close();
                            m50859(interfaceC7353);
                            Adler32 adler32 = new Adler32();
                            byte[] bArr = new byte[4096];
                            InputStream inputStreamMo5812 = interfaceC7353.mo5812(12);
                            for (int i2 = inputStreamMo5812.read(bArr); i2 >= 0; i2 = inputStreamMo5812.read(bArr)) {
                                adler32.update(bArr, 0, i2);
                            }
                            OutputStream outputStreamMo5811 = interfaceC7353.mo5811(8);
                            C17351.m39336(outputStreamMo5811, (int) adler32.getValue());
                            outputStreamMo5811.close();
                            interfaceC7353.close();
                            return;
                        } catch (Throwable th) {
                            c17351M508512.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        c17351M508511.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c17351M50858.close();
                    c17351M50859.close();
                    c17351M508510.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                interfaceC7353.close();
                throw th4;
            }
        }
        throw new IOException(C7050.m16224(R.string.MT_Protector));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50871(AbstractC17043 abstractC17043) {
        if (!abstractC17043.mo25094()) {
            C3329 c3329 = new C3329(abstractC17043);
            try {
                m50870(c3329);
                c3329.close();
            } catch (Throwable th) {
                try {
                    c3329.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            AbstractC17043 abstractC17043M38678 = abstractC17043.m38678(".tmp");
            try {
                C3329 c33210 = new C3329(abstractC17043M38678);
                try {
                    m50870(c33210);
                    c33210.close();
                    abstractC17043M38678.m38656(abstractC17043, (Runnable) null);
                    abstractC17043M38678.mo25503();
                } catch (Throwable th3) {
                    try {
                        c33210.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                abstractC17043M38678.mo25503();
                throw th5;
            }
        }
        C18524.m42113(abstractC17043);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m50859(InterfaceC7353 interfaceC7353) throws IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            byte[] bArr = new byte[4096];
            InputStream inputStreamMo5812 = interfaceC7353.mo5812(32);
            for (int i = inputStreamMo5812.read(bArr); i >= 0; i = inputStreamMo5812.read(bArr)) {
                messageDigest.update(bArr, 0, i);
            }
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest.length != 20) {
                throw new RuntimeException(C5410.m11876(bArrDigest.length, " bytes", new StringBuilder("unexpected digest write: ")));
            }
            OutputStream outputStreamMo5811 = interfaceC7353.mo5811(12);
            outputStreamMo5811.write(bArrDigest);
            outputStreamMo5811.close();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m50851(C17351 c17351, C17351 c17352) throws IOException {
        this.f71642 = c17351.getPosition();
        this.f71632 = c17352.getPosition();
        ArrayList<Map.Entry> arrayList = new ArrayList((AbstractCollection) this.f71646.mo10634());
        Collections.sort(arrayList, f71613);
        int i = 0;
        for (Map.Entry entry : arrayList) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            C17351.m39336(c17351, c17352.getPosition());
            String string = ((CharSequence) entry.getKey()).toString();
            C17351.m39338(c17352, string.length());
            c17352.m39344(string);
            c17352.write(0);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۖ */
    private void m50854(C17351 c17351) throws IOException {
        this.f71625 = c17351.getPosition();
        C16069 c16069 = this.f71655;
        ArrayList<Map.Entry> arrayList = new ArrayList((AbstractCollection) c16069.mo10634());
        Collections.sort(arrayList, f71613);
        int i = 0;
        for (Map.Entry entry : arrayList) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            C17351.m39336(c17351, this.f71646.mo10638(c16069.m36580((CharSequence) entry.getKey())));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۡ */
    private void m50856(C17351 c17351) throws IOException {
        this.f71617 = c17351.getPosition();
        C8043 c8043 = this.f71626;
        ArrayList<Map.Entry> arrayList = new ArrayList((AbstractCollection) c8043.mo10634());
        Collections.sort(arrayList, new C20035());
        int i = 0;
        for (Map.Entry entry : arrayList) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            InterfaceC2873 interfaceC2873 = (InterfaceC2873) entry.getKey();
            C17351.m39336(c17351, this.f71646.mo10638(c8043.m18659(interfaceC2873)));
            C17351.m39336(c17351, this.f71655.mo10638(c8043.m18658(interfaceC2873)));
            C17351.m39336(c17351, this.f71644.mo25451(c8043.m18657(interfaceC2873)));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m50869(C17351 c17351) throws IOException {
        this.f71615 = c17351.getPosition();
        C6032 c6032 = this.f71622;
        ArrayList<Map.Entry> arrayList = new ArrayList((AbstractCollection) c6032.mo10634());
        Collections.sort(arrayList, new C20035());
        int i = 0;
        for (Map.Entry entry : arrayList) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            InterfaceC20309 interfaceC20309 = (InterfaceC20309) entry.getKey();
            C24787 c24787M13548 = c6032.m13548(interfaceC20309);
            C16069 c16069 = this.f71655;
            c17351.m39345(c16069.mo10638(c24787M13548));
            c17351.m39345(c16069.mo10638(c6032.m13549(interfaceC20309)));
            C17351.m39336(c17351, this.f71646.mo10638(c6032.m13550(interfaceC20309)));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ۢ */
    private void m50857(C17351 c17351) throws IOException {
        this.f71619 = c17351.getPosition();
        C5361 c5361 = this.f71621;
        ArrayList<Map.Entry> arrayList = new ArrayList((AbstractCollection) c5361.mo10634());
        Collections.sort(arrayList, new C20035());
        int i = 0;
        for (Map.Entry entry : arrayList) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            InterfaceC7568 interfaceC7568 = (InterfaceC7568) entry.getKey();
            c17351.m39345(this.f71655.mo10638(c5361.m11616(interfaceC7568)));
            c17351.m39345(this.f71626.mo10638(c5361.m11619(interfaceC7568)));
            C17351.m39336(c17351, this.f71646.mo10638(c5361.m11618(interfaceC7568)));
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m50846(InterfaceC7353 interfaceC7353, C17351 c17351, C17351 c17352) throws IOException {
        this.f71628 = c17351.getPosition();
        this.f71629 = c17352.getPosition();
        C21770 c21770 = this.f71640;
        ArrayList arrayList = new ArrayList((AbstractCollection) c21770.mo10634());
        Collections.sort(arrayList, new C20035());
        Iterator it = arrayList.iterator();
        int iM50844 = 0;
        while (it.hasNext()) {
            iM50844 = m50844(c17351, c17352, iM50844, (Map.Entry) it.next());
        }
        if (mo46911()) {
            c17352.m39339();
            this.f71639 = c17352.getPosition();
            ArrayList<Map.Entry> arrayList2 = new ArrayList((AbstractCollection) c21770.mo10634());
            Collections.sort(arrayList2, new C20706());
            C9976 c9976 = new C9976(interfaceC7353, c17352, arrayList2.size());
            try {
                for (Map.Entry entry : arrayList2) {
                    Iterator it2 = c21770.m49135((Comparable) entry.getKey()).iterator();
                    while (it2.hasNext()) {
                        c9976.m23285(c21770.m49125(it2.next()));
                    }
                    Iterator it3 = c21770.m49137((Comparable) entry.getKey()).iterator();
                    while (it3.hasNext()) {
                        c9976.m23285(c21770.m49125(it3.next()));
                    }
                    Iterator<E> it4 = c21770.m49129((Comparable) entry.getKey()).iterator();
                    while (it4.hasNext()) {
                        c9976.m23285(c21770.m49133(it4.next()));
                    }
                    Iterator<E> it5 = c21770.m49120((Comparable) entry.getKey()).iterator();
                    while (it5.hasNext()) {
                        c9976.m23285(c21770.m49133(it5.next()));
                    }
                    c9976.m23286();
                }
            } finally {
                c9976.m23284();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public boolean mo46911() {
        return this.f71627 && this.f71653.f27379 >= 29;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m50844(C17351 c17351, C17351 c17352, int i, Map.Entry entry) throws IOException {
        if (entry == null || ((Integer) entry.getValue()).intValue() != -1) {
            return i;
        }
        Comparable comparable = (Comparable) entry.getKey();
        entry.setValue(0);
        C21770 c21770 = this.f71640;
        int iM50844 = m50844(c17351, c17352, i, c21770.m49105((CharSequence) c21770.m49110(comparable)));
        C4000 c4000M49130 = c21770.m49130(comparable);
        InterfaceC4335 interfaceC4335 = this.f71644;
        Iterator it = interfaceC4335.mo8935(c4000M49130).iterator();
        while (it.hasNext()) {
            iM50844 = m50844(c17351, c17352, iM50844, c21770.m49105((CharSequence) it.next()));
        }
        int i2 = iM50844 + 1;
        entry.setValue(Integer.valueOf(iM50844));
        C24787 c24787M49112 = c21770.m49112(comparable);
        C16069 c16069 = this.f71655;
        C17351.m39336(c17351, c16069.mo10638(c24787M49112));
        C17351.m39336(c17351, c21770.m49104(comparable));
        C17351.m39336(c17351, c16069.mo18431(c21770.m49110(comparable)));
        C17351.m39336(c17351, interfaceC4335.mo25451(c21770.m49130(comparable)));
        C17351.m39336(c17351, this.f71646.mo18431(c21770.m49118(comparable)));
        C17351.m39336(c17351, c21770.m49121(comparable));
        SortedSet sortedSetM49135 = c21770.m49135(comparable);
        SortedSet sortedSetM49137 = c21770.m49137(comparable);
        AbstractC24891 abstractC24891M49129 = c21770.m49129(comparable);
        AbstractC24891 abstractC24891M49120 = c21770.m49120(comparable);
        boolean z = sortedSetM49135.size() > 0 || sortedSetM49137.size() > 0 || abstractC24891M49129.size() > 0 || abstractC24891M49120.size() > 0;
        if (z) {
            C17351.m39336(c17351, c17352.getPosition());
        } else {
            C17351.m39336(c17351, 0);
        }
        C14393 c14393M49126 = c21770.m49126(comparable);
        if (c14393M49126 != null) {
            C17351.m39336(c17351, this.f71648.mo12654(c14393M49126));
        } else {
            C17351.m39336(c17351, 0);
        }
        if (z) {
            this.f71630++;
            C17351.m39338(c17352, sortedSetM49135.size());
            C17351.m39338(c17352, sortedSetM49137.size());
            C17351.m39338(c17352, abstractC24891M49129.size());
            C17351.m39338(c17352, abstractC24891M49120.size());
            m50850(c17352, sortedSetM49135);
            m50850(c17352, sortedSetM49137);
            m50853(c17352, abstractC24891M49129);
            m50853(c17352, abstractC24891M49120);
        }
        return i2;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m50865(C17351 c17351) throws IOException {
        C5676 c5676;
        this.f71650 = c17351.getPosition();
        C21111 c21111 = new C21111();
        ArrayList arrayList = new ArrayList();
        C5006 c5006 = this.f71624;
        int i = -1;
        for (Map.Entry entry : (AbstractC7373) c5006.mo10634()) {
            int index = ((InterfaceC6227) entry.getKey()).getIndex();
            if (index < 0 || index >= 65536 || c21111.mo4793(index)) {
                arrayList.add(entry);
            } else {
                c21111.mo4686(index, entry);
                if (index > i) {
                    i = index;
                }
            }
        }
        Collections.sort(arrayList, this.f71654);
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            c5676 = this.f71648;
            if (i2 > i) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) c21111.get(i2);
            if (entry2 == null && it.hasNext()) {
                entry2 = (Map.Entry) it.next();
            }
            if (entry2 != null) {
                entry2.setValue(Integer.valueOf(i2));
                C17351.m39336(c17351, c5676.mo12654(c5006.m10635((InterfaceC6227) entry2.getKey())));
            } else {
                C17351.m39336(c17351, -1);
            }
            i2++;
        }
        while (it.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it.next();
            i++;
            entry3.setValue(Integer.valueOf(i));
            C17351.m39336(c17351, c5676.mo12654(c5006.m10635((InterfaceC6227) entry3.getKey())));
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m50868(C17351 c17351) throws IOException {
        int iMo10638;
        this.f71649 = c17351.getPosition();
        C16759 c16759 = this.f71652;
        int i = 0;
        for (Map.Entry entry : (AbstractC7373) c16759.mo10634()) {
            int i2 = i + 1;
            entry.setValue(Integer.valueOf(i));
            InterfaceC20980 interfaceC20980 = (InterfaceC20980) entry.getKey();
            c17351.m39345(interfaceC20980.mo5178());
            c17351.m39345(0);
            switch (interfaceC20980.mo5178()) {
                case 0:
                case 1:
                case 2:
                case 3:
                    iMo10638 = this.f71622.mo10638(c16759.m38004(interfaceC20980));
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    iMo10638 = this.f71621.mo10638(c16759.m38005(interfaceC20980));
                    break;
                default:
                    throw new C17034(null, "Invalid method handle type: %d", Integer.valueOf(interfaceC20980.mo5178()));
            }
            c17351.m39345(iMo10638);
            c17351.m39345(0);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m50850(C17351 c17351, SortedSet sortedSet) throws IOException {
        int i = 0;
        for (Object obj : sortedSet) {
            int iM13552 = this.f71622.m13552(obj);
            C21770 c21770 = this.f71640;
            if (!c21770.m49125(obj).isEmpty()) {
                this.f71627 = true;
            }
            C17351.m39338(c17351, iM13552 - i);
            C17351.m39338(c17351, c21770.m49119(obj));
            i = iM13552;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m50853(C17351 c17351, AbstractC24891 abstractC24891) throws IOException {
        int i = 0;
        for (Object obj : abstractC24891) {
            int iM11622 = this.f71621.m11622(obj);
            C21770 c21770 = this.f71640;
            if (!c21770.m49133(obj).isEmpty()) {
                this.f71627 = true;
            }
            C17351.m39338(c17351, iM11622 - i);
            C17351.m39338(c17351, c21770.m49111(obj));
            C17351.m39338(c17351, c21770.m49114(obj));
            i = iM11622;
        }
    }

    /* JADX INFO: renamed from: ܺ */
    private void m50863(C17351 c17351) throws IOException {
        c17351.m39339();
        this.f71638 = c17351.getPosition();
        InterfaceC4335 interfaceC4335 = this.f71644;
        for (Map.Entry entry : (AbstractC7373) interfaceC4335.mo12652()) {
            c17351.m39339();
            entry.setValue(Integer.valueOf(c17351.getPosition()));
            List listMo8935 = interfaceC4335.mo8935(entry.getKey());
            C17351.m39336(c17351, listMo8935.size());
            Iterator it = listMo8935.iterator();
            while (it.hasNext()) {
                c17351.m39345(this.f71655.mo10638((CharSequence) it.next()));
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m50862(C17351 c17351) throws IOException {
        C3270 c3270 = new C3270(this, c17351);
        this.f71614 = c17351.getPosition();
        C5676 c5676 = this.f71648;
        for (Map.Entry entry : (AbstractC7373) c5676.mo12652()) {
            entry.setValue(Integer.valueOf(c17351.getPosition()));
            List listM12655 = c5676.m12655(entry.getKey());
            C17351.m39338(c17351, listM12655.size());
            Iterator it = listM12655.iterator();
            while (it.hasNext()) {
                mo46908(c3270, it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m50867(C17351 c17351) throws IOException {
        C3270 c3270 = new C3270(this, c17351);
        this.f71641 = c17351.getPosition();
        InterfaceC24728 interfaceC24728 = this.f71631;
        for (Map.Entry entry : (AbstractC7373) interfaceC24728.mo12652()) {
            entry.setValue(Integer.valueOf(c17351.getPosition()));
            InterfaceC21909 interfaceC21909 = (InterfaceC21909) entry.getKey();
            c17351.m39342(interfaceC24728.mo54395(interfaceC21909));
            C17351.m39338(c17351, this.f71655.mo10638(interfaceC24728.mo54394(interfaceC21909)));
            AbstractC16192 abstractC16192M36880 = AbstractC16192.m36880(AbstractC12093.m27884(AbstractC16181.f47633), interfaceC24728.mo54397(interfaceC21909));
            C17351.m39338(c17351, abstractC16192M36880.size());
            AbstractC6767 abstractC6767ListIterator = abstractC16192M36880.listIterator(0);
            while (abstractC6767ListIterator.hasNext()) {
                InterfaceC11180 interfaceC11180 = (InterfaceC11180) abstractC6767ListIterator.next();
                C17351.m39338(c17351, this.f71646.mo10638(interfaceC24728.mo54396(interfaceC11180)));
                mo46908(c3270, interfaceC24728.mo54393(interfaceC11180));
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m50864(C17351 c17351) throws IOException {
        c17351.m39339();
        this.f71637 = c17351.getPosition();
        if (this.f71653.f27379 < 17) {
            C17351.m39336(c17351, 0);
        }
        InterfaceC8635 interfaceC8635 = this.f71643;
        for (Map.Entry entry : (AbstractC7373) interfaceC8635.mo12652()) {
            AbstractC16192 abstractC16192M36880 = AbstractC16192.m36880(AbstractC12093.m27884(AbstractC19535.f59481), interfaceC8635.mo20052(entry.getKey()));
            c17351.m39339();
            entry.setValue(Integer.valueOf(c17351.getPosition()));
            C17351.m39336(c17351, abstractC16192M36880.size());
            AbstractC6767 abstractC6767ListIterator = abstractC16192M36880.listIterator(0);
            while (abstractC6767ListIterator.hasNext()) {
                C17351.m39336(c17351, this.f71631.mo12654(abstractC6767ListIterator.next()));
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m50860(C17351 c17351) throws IOException {
        int iMo12654;
        c17351.m39339();
        this.f71645 = c17351.getPosition();
        HashMap map = new HashMap();
        C21770 c21770 = this.f71640;
        AbstractC6767 abstractC6767ListIterator = c21770.m49131().listIterator(0);
        while (abstractC6767ListIterator.hasNext()) {
            for (Object obj : c21770.m49115((Comparable) abstractC6767ListIterator.next())) {
                List listM49102 = c21770.m49102(obj);
                if (listM49102 != null) {
                    Integer num = (Integer) map.get(listM49102);
                    if (num != null) {
                        c21770.m49107(num.intValue(), obj);
                    } else {
                        c17351.m39339();
                        int position = c17351.getPosition();
                        c21770.m49107(position, obj);
                        map.put(listM49102, Integer.valueOf(position));
                        this.f71634++;
                        C17351.m39336(c17351, listM49102.size());
                        for (Object obj2 : listM49102) {
                            InterfaceC8635 interfaceC8635 = this.f71643;
                            if (interfaceC8635.mo20052(obj2).size() > 0) {
                                iMo12654 = interfaceC8635.mo12654(obj2);
                            } else if (this.f71653.f27379 >= 17) {
                                C17351.m39336(c17351, 0);
                            } else {
                                iMo12654 = this.f71637;
                            }
                            C17351.m39336(c17351, iMo12654);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m50847(C17351 c17351) throws IOException {
        InterfaceC8635 interfaceC8635;
        C5361 c5361;
        c17351.m39339();
        this.f71616 = c17351.getPosition();
        HashMap map = new HashMap();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(65536);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        C21770 c21770 = this.f71640;
        AbstractC6767 abstractC6767ListIterator = c21770.m49131().listIterator(0);
        while (abstractC6767ListIterator.hasNext()) {
            Comparable comparable = (Comparable) abstractC6767ListIterator.next();
            Collection collectionM49123 = c21770.m49123(comparable);
            Collection collectionM49115 = c21770.m49115(comparable);
            int size = (collectionM49115.size() * 16) + (collectionM49123.size() * 8);
            if (size > byteBufferAllocate.capacity()) {
                byteBufferAllocate = ByteBuffer.allocate(size);
                byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            }
            byteBufferAllocate.clear();
            Iterator it = collectionM49123.iterator();
            int i = 0;
            while (true) {
                boolean zHasNext = it.hasNext();
                interfaceC8635 = this.f71643;
                if (!zHasNext) {
                    break;
                }
                Object next = it.next();
                C9029 c9029M49117 = c21770.m49117(next);
                if (c9029M49117 != null) {
                    i++;
                    byteBufferAllocate.putInt(this.f71622.m13552(next));
                    byteBufferAllocate.putInt(interfaceC8635.mo12654(c9029M49117));
                }
            }
            Iterator it2 = collectionM49115.iterator();
            int i2 = 0;
            while (true) {
                boolean zHasNext2 = it2.hasNext();
                c5361 = this.f71621;
                if (!zHasNext2) {
                    break;
                }
                Object next2 = it2.next();
                C9029 c9029M49132 = c21770.m49132(next2);
                if (c9029M49132 != null) {
                    i2++;
                    byteBufferAllocate.putInt(c5361.m11622(next2));
                    byteBufferAllocate.putInt(interfaceC8635.mo12654(c9029M49132));
                }
            }
            int i3 = 0;
            for (Object obj : collectionM49115) {
                int iM49136 = c21770.m49136(obj);
                if (iM49136 != 0) {
                    i3++;
                    byteBufferAllocate.putInt(c5361.m11622(obj));
                    byteBufferAllocate.putInt(iM49136);
                }
            }
            C9029 c9029M49127 = c21770.m49127(comparable);
            if (i == 0 && i2 == 0 && i3 == 0) {
                if (c9029M49127 != null) {
                    Integer num = (Integer) map.get(c9029M49127);
                    if (num != null) {
                        c21770.m49106(num.intValue(), comparable);
                    } else {
                        map.put(c9029M49127, Integer.valueOf(c17351.getPosition()));
                    }
                }
            }
            this.f71635++;
            c21770.m49106(c17351.getPosition(), comparable);
            C17351.m39336(c17351, interfaceC8635.mo25451(c9029M49127));
            C17351.m39336(c17351, i);
            C17351.m39336(c17351, i2);
            C17351.m39336(c17351, i3);
            c17351.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:107:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:124:0x0250 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x026a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0203 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:84:0x024d  */
    /* JADX WARN: Code duplicated, block: B:89:0x025a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0267  */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x01bf, please report this as an issue */
    /* JADX INFO: renamed from: ֫ */
    private void m50852(C17351 c17351, C21435 c21435) throws IOException {
        AbstractC6767 abstractC6767;
        List listMo6068;
        Iterable iterableMo6074;
        int position;
        int lineNumber;
        ArrayList arrayList;
        Iterable iterable;
        List list;
        byte[] byteArray;
        C11318 c11318;
        HashMap map;
        int iIntValue;
        InterfaceC16954 interfaceC16954Mo10991;
        C9384 c9384;
        InterfaceC22991 interfaceC22991Mo10989;
        C24787 c24787;
        InterfaceC16954 interfaceC16954Mo10990;
        C9384 c9385;
        ArrayList arrayList2;
        AbstractC6767 abstractC6768;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f71647 = c17351.getPosition();
        C17351 c17352 = new C17351(c21435, 0);
        ArrayList<C7294> arrayList3 = new ArrayList();
        C21770 c21770 = this.f71640;
        AbstractC6767 abstractC6767ListIterator = c21770.m49131().listIterator(0);
        while (abstractC6767ListIterator.hasNext()) {
            Comparable comparable = (Comparable) abstractC6767ListIterator.next();
            Iterator it = C10810.m24919(c21770.m49129(comparable), c21770.m49120(comparable)).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                List listM49116 = c21770.m49116(next);
                Iterable iterableM49109 = c21770.m49109(next);
                Iterable<InterfaceC9838> iterableM49134 = c21770.m49134(next);
                InterfaceC9305 interfaceC9305 = this.f71646;
                if (iterableM49109 == null || !interfaceC9305.mo21549()) {
                    abstractC6767 = abstractC6767ListIterator;
                    listMo6068 = listM49116;
                    iterableMo6074 = iterableM49109;
                } else {
                    Iterator it2 = iterableM49109.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            InterfaceC23920 interfaceC23920 = (InterfaceC23920) it2.next();
                            List list2 = listM49116;
                            Iterable iterable2 = iterableM49109;
                            if (interfaceC23920.mo6217() != EnumC3167.f5911 || interfaceC9305.mo21548((InterfaceC16954) ((InterfaceC12777) interfaceC23920).getReference()) < 65536) {
                                listM49116 = list2;
                                iterableM49109 = iterable2;
                                abstractC6767ListIterator = abstractC6767ListIterator;
                            } else {
                                C3422 c3422M49124 = c21770.m49124(next);
                                List listMo6074 = c3422M49124.mo6074();
                                int i = 0;
                                while (i < listMo6074.size()) {
                                    InterfaceC23920 interfaceC23921 = (InterfaceC23920) listMo6074.get(i);
                                    List list3 = listMo6074;
                                    if (interfaceC23921.mo6217() == EnumC3167.f5911) {
                                        InterfaceC12777 interfaceC12777 = (InterfaceC12777) interfaceC23921;
                                        abstractC6768 = abstractC6767ListIterator;
                                        if (interfaceC9305.mo21548((InterfaceC16954) interfaceC12777.getReference()) >= 65536) {
                                            c3422M49124.m6071(i, new C20129(EnumC3167.f5994, ((InterfaceC4059) interfaceC23921).mo4189(), interfaceC12777.getReference()));
                                        }
                                    } else {
                                        abstractC6768 = abstractC6767ListIterator;
                                    }
                                    i++;
                                    listMo6074 = list3;
                                    abstractC6767ListIterator = abstractC6768;
                                }
                                abstractC6767 = abstractC6767ListIterator;
                                iterableMo6074 = c3422M49124.mo6074();
                                listMo6068 = c3422M49124.mo6068();
                                iterableM49134 = c3422M49124.mo6069();
                            }
                        } else {
                            abstractC6767 = abstractC6767ListIterator;
                            listMo6068 = listM49116;
                            iterableMo6074 = iterableM49109;
                        }
                    }
                }
                Iterable iterableM49113 = c21770.m49113(next);
                int iM24930 = C10810.m24930(iterableM49113);
                Iterator it3 = iterableM49113.iterator();
                int i2 = 0;
                Iterator it4 = it;
                int i3 = -1;
                while (it3.hasNext()) {
                    if (((CharSequence) it3.next()) != null) {
                        i3 = i2;
                    }
                    i2++;
                }
                if (i3 == -1 && (iterableM49134 == null || C10810.m24928(iterableM49134))) {
                    list = listMo6068;
                    iterable = iterableMo6074;
                    arrayList = arrayList3;
                    position = 0;
                } else {
                    position = c17351.getPosition();
                    if (iterableM49134 != null) {
                        Iterator it5 = iterableM49134.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                Iterator it6 = it5;
                                InterfaceC9838 interfaceC9838 = (InterfaceC9838) it5.next();
                                if (interfaceC9838 instanceof InterfaceC22580) {
                                    lineNumber = ((InterfaceC22580) interfaceC9838).getLineNumber();
                                } else {
                                    it5 = it6;
                                }
                            } else {
                                lineNumber = 0;
                            }
                        }
                    } else {
                        lineNumber = 0;
                    }
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    arrayList = arrayList3;
                    iterable = iterableMo6074;
                    list = listMo6068;
                    C17351 c17353 = new C17351(byteArrayOutputStream2, 0, 64);
                    C10647 c10647 = new C10647(interfaceC9305, this.f71655, c17353);
                    C17351.m39338(c17353, lineNumber);
                    C17351.m39338(c17353, iM24930);
                    Iterator it7 = iterableM49113.iterator();
                    int i4 = 0;
                    while (it7.hasNext()) {
                        Iterator it8 = it7;
                        CharSequence charSequence = (CharSequence) it7.next();
                        if (i4 != iM24930) {
                            i4++;
                            C17351.m39338(c17353, interfaceC9305.mo18431(charSequence) + 1);
                            it7 = it8;
                        } else {
                            if (iterableM49134 != null) {
                                c10647.m24471(lineNumber);
                                for (InterfaceC9838 interfaceC9839 : iterableM49134) {
                                    c21770.getClass();
                                    switch (interfaceC9839.mo10470()) {
                                        case 3:
                                            InterfaceC5145 interfaceC5145 = (InterfaceC5145) interfaceC9839;
                                            int iMo16884 = interfaceC5145.mo16884();
                                            int iMo10988 = interfaceC5145.mo10988();
                                            interfaceC16954Mo10991 = interfaceC5145.mo10991();
                                            if (interfaceC16954Mo10991 == null) {
                                                c9384 = null;
                                            } else {
                                                try {
                                                    c9384 = (C9384) interfaceC16954Mo10991;
                                                } catch (ClassCastException unused) {
                                                    throw new IllegalStateException("Only StringReference instances returned by DexBuilder.internStringReference or DexBuilder.internNullableStringReference may be used.");
                                                }
                                            }
                                            interfaceC22991Mo10989 = interfaceC5145.mo10989();
                                            if (interfaceC22991Mo10989 == null) {
                                                c24787 = null;
                                            } else {
                                                try {
                                                    c24787 = (C24787) interfaceC22991Mo10989;
                                                } catch (ClassCastException unused2) {
                                                    throw new IllegalStateException("Only TypeReference instances returned by DexBuilder.internTypeReference or DexBuilder.internNullableTypeReference may be used.");
                                                }
                                            }
                                            interfaceC16954Mo10990 = interfaceC5145.mo10990();
                                            if (interfaceC16954Mo10990 == null) {
                                                c9385 = null;
                                            } else {
                                                try {
                                                    c9385 = (C9384) interfaceC16954Mo10990;
                                                } catch (ClassCastException unused3) {
                                                    throw new IllegalStateException("Only StringReference instances returned by DexBuilder.internStringReference or DexBuilder.internNullableStringReference may be used.");
                                                }
                                            }
                                            c10647.m24473(iMo16884, iMo10988, c9384, c24787, c9385);
                                            break;
                                        case 4:
                                        default:
                                            throw new C17034(null, "Unexpected debug item type: %d", Integer.valueOf(interfaceC9839.mo10470()));
                                        case 5:
                                            InterfaceC16543 interfaceC16543 = (InterfaceC16543) interfaceC9839;
                                            c10647.m24472(interfaceC16543.mo16884(), interfaceC16543.mo25235());
                                            break;
                                        case 6:
                                            InterfaceC21239 interfaceC21239 = (InterfaceC21239) interfaceC9839;
                                            c10647.m24478(interfaceC21239.mo16884(), interfaceC21239.mo14222());
                                            break;
                                        case 7:
                                            c10647.m24477(interfaceC9839.mo16884());
                                            break;
                                        case 8:
                                            c10647.m24475(interfaceC9839.mo16884());
                                            break;
                                        case 9:
                                            InterfaceC6486 interfaceC6486 = (InterfaceC6486) interfaceC9839;
                                            int iMo16885 = interfaceC6486.mo16884();
                                            InterfaceC16954 interfaceC16954Mo11945 = interfaceC6486.mo11945();
                                            if (interfaceC16954Mo11945 != null) {
                                                try {
                                                } catch (ClassCastException unused4) {
                                                    throw new IllegalStateException("Only StringReference instances returned by DexBuilder.internStringReference or DexBuilder.internNullableStringReference may be used.");
                                                }
                                            }
                                            c10647.m24474(iMo16885, interfaceC16954Mo11945 != null ? (C9384) interfaceC16954Mo11945 : null);
                                            break;
                                        case 10:
                                            InterfaceC22580 interfaceC22580 = (InterfaceC22580) interfaceC9839;
                                            c10647.m24476(interfaceC22580.mo16884(), interfaceC22580.getLineNumber());
                                            break;
                                    }
                                }
                            }
                            c17353.write(0);
                            c17353.flush();
                            byteArray = byteArrayOutputStream2.toByteArray();
                            c11318 = new C11318(byteArray);
                            map = this.f71620;
                            iIntValue = ((Integer) C15525.getOrDefault(map, c11318, -1)).intValue();
                            if (iIntValue >= 0) {
                                position = iIntValue;
                            } else {
                                c17351.write(byteArray);
                                map.put(c11318, Integer.valueOf(position));
                                this.f71633++;
                            }
                        }
                    }
                    if (iterableM49134 != null) {
                        c10647.m24471(lineNumber);
                        while (r1.hasNext()) {
                            c21770.getClass();
                            switch (interfaceC9839.mo10470()) {
                                case 3:
                                    InterfaceC5145 interfaceC5146 = (InterfaceC5145) interfaceC9839;
                                    int iMo16886 = interfaceC5146.mo16884();
                                    int iMo10989 = interfaceC5146.mo10988();
                                    interfaceC16954Mo10991 = interfaceC5146.mo10991();
                                    if (interfaceC16954Mo10991 == null) {
                                        c9384 = null;
                                    } else {
                                        c9384 = (C9384) interfaceC16954Mo10991;
                                    }
                                    interfaceC22991Mo10989 = interfaceC5146.mo10989();
                                    if (interfaceC22991Mo10989 == null) {
                                        c24787 = null;
                                    } else {
                                        c24787 = (C24787) interfaceC22991Mo10989;
                                    }
                                    interfaceC16954Mo10990 = interfaceC5146.mo10990();
                                    if (interfaceC16954Mo10990 == null) {
                                        c9385 = null;
                                    } else {
                                        c9385 = (C9384) interfaceC16954Mo10990;
                                    }
                                    c10647.m24473(iMo16886, iMo10989, c9384, c24787, c9385);
                                    break;
                                case 4:
                                default:
                                    throw new C17034(null, "Unexpected debug item type: %d", Integer.valueOf(interfaceC9839.mo10470()));
                                case 5:
                                    InterfaceC16543 interfaceC16544 = (InterfaceC16543) interfaceC9839;
                                    c10647.m24472(interfaceC16544.mo16884(), interfaceC16544.mo25235());
                                    break;
                                case 6:
                                    InterfaceC21239 interfaceC212310 = (InterfaceC21239) interfaceC9839;
                                    c10647.m24478(interfaceC212310.mo16884(), interfaceC212310.mo14222());
                                    break;
                                case 7:
                                    c10647.m24477(interfaceC9839.mo16884());
                                    break;
                                case 8:
                                    c10647.m24475(interfaceC9839.mo16884());
                                    break;
                                case 9:
                                    InterfaceC6486 interfaceC6487 = (InterfaceC6486) interfaceC9839;
                                    int iMo16887 = interfaceC6487.mo16884();
                                    InterfaceC16954 interfaceC16954Mo11946 = interfaceC6487.mo11945();
                                    c10647.m24474(iMo16887, interfaceC16954Mo11946 != null ? (C9384) interfaceC16954Mo11946 : null);
                                    break;
                                case 10:
                                    InterfaceC22580 interfaceC22581 = (InterfaceC22580) interfaceC9839;
                                    c10647.m24476(interfaceC22581.mo16884(), interfaceC22581.getLineNumber());
                                    break;
                            }
                        }
                    }
                    c17353.write(0);
                    c17353.flush();
                    byteArray = byteArrayOutputStream2.toByteArray();
                    c11318 = new C11318(byteArray);
                    map = this.f71620;
                    iIntValue = ((Integer) C15525.getOrDefault(map, c11318, -1)).intValue();
                    if (iIntValue >= 0) {
                        position = iIntValue;
                    } else {
                        c17351.write(byteArray);
                        map.put(c11318, Integer.valueOf(position));
                        this.f71633++;
                    }
                }
                try {
                    int iM50843 = m50843(c17352, byteArrayOutputStream, next, list, iterable, position);
                    if (iM50843 != -1) {
                        C7294 c7294 = new C7294();
                        c7294.f19094 = iM50843;
                        c7294.f19095 = next;
                        arrayList2 = arrayList;
                        arrayList2.add(c7294);
                    } else {
                        arrayList2 = arrayList;
                    }
                    arrayList3 = arrayList2;
                    abstractC6767ListIterator = abstractC6767;
                    it = it4;
                } catch (RuntimeException e) {
                    throw new C17034(e, "Exception occurred while writing code_item for method %s", this.f71621.m11617(next));
                }
            }
        }
        c17351.m39339();
        this.f71618 = c17351.getPosition();
        c17352.close();
        c21435.m48562(c17351);
        c21435.close();
        for (C7294 c7295 : arrayList3) {
            c21770.m49122(this.f71618 + c7295.f19094, c7295.f19095);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m50843(C17351 c17351, ByteArrayOutputStream byteArrayOutputStream, Object obj, List list, Iterable iterable, int i) throws IOException {
        C24787 c24787;
        Iterator it;
        int iMo5886;
        if (iterable == null && i == 0) {
            return -1;
        }
        this.f71623++;
        c17351.m39339();
        int position = c17351.getPosition();
        C21770 c21770 = this.f71640;
        int iM49103 = c21770.m49103(obj);
        c17351.m39345(iM49103);
        boolean zM39032 = EnumC17248.STATIC.m39032(c21770.m49111(obj));
        C5361 c5361 = this.f71621;
        C14748 c14748M11621 = c5361.m11621(obj);
        C8043 c8043 = this.f71626;
        int iM42656 = C18693.m42656(this.f71644.mo8935(c8043.m18657(c14748M11621)), zM39032);
        int i2 = 3;
        if (iM42656 > iM49103) {
            throw new RuntimeException(String.format("ins_size (%dd) > registers_size (%dd): %s", Integer.valueOf(iM42656), Integer.valueOf(iM49103), obj.toString()));
        }
        c17351.m39345(iM42656);
        if (iterable == null) {
            c17351.m39345(0);
            c17351.m39345(0);
            C17351.m39336(c17351, i);
            C17351.m39336(c17351, 0);
            return position;
        }
        ArrayList<InterfaceC7156> arrayListM44518 = C19618.m44518(list);
        Iterator it2 = iterable.iterator();
        int i3 = 0;
        int iMo6216 = 0;
        while (it2.hasNext()) {
            InterfaceC23920 interfaceC23920 = (InterfaceC23920) it2.next();
            iMo6216 = interfaceC23920.mo6216() + iMo6216;
            int i4 = interfaceC23920.mo6217().f6092;
            if (i4 != i2) {
                iMo5886 = i4 != 5 ? 0 : ((InterfaceC8753) interfaceC23920).mo5886();
                it = it2;
            } else {
                InterfaceC7568 interfaceC7568 = (InterfaceC7568) ((InterfaceC12777) interfaceC23920).getReference();
                EnumC3167 enumC3167Mo6217 = interfaceC23920.mo6217();
                it = it2;
                iMo5886 = (enumC3167Mo6217 == EnumC3167.f5818 || enumC3167Mo6217 == EnumC3167.f5874) ? ((InterfaceC8753) interfaceC23920).mo5886() : C18693.m42656(interfaceC7568.mo5852(), enumC3167Mo6217 == EnumC3167.f5826 || enumC3167Mo6217 == EnumC3167.f5907);
            }
            if (iMo5886 > i3) {
                i3 = iMo5886;
            }
            i2 = 3;
            it2 = it;
        }
        if (i3 > 5 && i3 > iM49103) {
            throw new RuntimeException(String.format("outs_size (%dd) > registers_size (%dd): %s", Integer.valueOf(i3), Integer.valueOf(iM49103), obj.toString()));
        }
        c17351.m39345(i3);
        c17351.m39345(arrayListM44518.size());
        C17351.m39336(c17351, i);
        C9873 c9873 = this.f71653;
        InterfaceC9305 interfaceC9305 = this.f71646;
        C16069 c16069 = this.f71655;
        C14669 c14669 = new C14669(c9873, c17351, interfaceC9305, c16069, this.f71622, c5361, c8043, this.f71652, this.f71624);
        C17351.m39336(c17351, iMo6216);
        Iterator it3 = iterable.iterator();
        int iMo6217 = 0;
        while (it3.hasNext()) {
            InterfaceC23920 interfaceC23921 = (InterfaceC23920) it3.next();
            try {
                switch (C2599.f4298[interfaceC23921.mo6217().f6090.ordinal()]) {
                    case 1:
                        c14669.m33557((InterfaceC17469) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 2:
                        c14669.m33537((InterfaceC4730) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 3:
                        c14669.m33539((InterfaceC6071) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 4:
                        c14669.m33562((InterfaceC20153) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 5:
                        c14669.m33563((InterfaceC20824) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 6:
                        c14669.m33534((InterfaceC2717) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 7:
                        c14669.m33541((InterfaceC7412) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 8:
                        c14669.m33535((InterfaceC3388) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 9:
                        c14669.m33545((InterfaceC10094) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 10:
                        c14669.m33556((InterfaceC16798) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 11:
                        c14669.m33566((InterfaceC22835) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 12:
                        c14669.m33567((InterfaceC23505) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 13:
                        c14669.m33564((InterfaceC21494) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 14:
                        c14669.m33540((InterfaceC6741) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 15:
                        c14669.m33538((InterfaceC5400) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 16:
                        c14669.m33553((InterfaceC14787) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 17:
                        c14669.m33552((InterfaceC14117) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 18:
                        c14669.m33549((InterfaceC12106) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 19:
                        c14669.m33542((InterfaceC8082) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 20:
                        c14669.m33551((InterfaceC13447) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 21:
                        c14669.m33568((InterfaceC24175) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 22:
                        c14669.m33554((InterfaceC15457) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 23:
                        c14669.m33544((InterfaceC9423) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 24:
                        c14669.m33536((InterfaceC4215) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 25:
                        c14669.m33550((InterfaceC12933) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 26:
                        c14669.m33559((InterfaceC18296) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 27:
                        c14669.m33561((InterfaceC19638) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 28:
                        c14669.m33560((InterfaceC18967) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 29:
                        c14669.m33555((InterfaceC16284) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 30:
                        c14669.m33569((InterfaceC25002) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 31:
                        c14669.m33543((InterfaceC8909) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 32:
                        c14669.m33565((InterfaceC22321) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 33:
                        c14669.m33548((InterfaceC11592) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 34:
                        c14669.m33546((InterfaceC10765) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 35:
                        c14669.m33547((InterfaceC10921) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    case 36:
                        c14669.m33558((InterfaceC17625) interfaceC23921);
                        continue;
                        iMo6217 += interfaceC23921.mo6216();
                        break;
                    default:
                        throw new C17034(null, "Unsupported instruction format: %s", interfaceC23921.mo6217().f6090);
                }
            } catch (RuntimeException e) {
                throw new C17034(e, "Error while writing instruction at code offset 0x%x", Integer.valueOf(iMo6217));
            }
            throw new C17034(e, "Error while writing instruction at code offset 0x%x", Integer.valueOf(iMo6217));
        }
        if (arrayListM44518.size() > 0) {
            c17351.m39339();
            HashMap map = new HashMap();
            Iterator it4 = arrayListM44518.iterator();
            while (it4.hasNext()) {
                map.put(((InterfaceC7156) it4.next()).mo16460(), 0);
            }
            C17351.m39338(byteArrayOutputStream, map.size());
            for (InterfaceC7156 interfaceC7156 : arrayListM44518) {
                int iMo16459 = interfaceC7156.mo16459();
                int iMo16461 = (interfaceC7156.mo16461() + iMo16459) - iMo16459;
                C17351.m39336(c17351, iMo16459);
                c17351.m39345(iMo16461);
                if (interfaceC7156.mo16460().size() == 0) {
                    throw new C17034(null, "No exception handlers for the try block!", new Object[0]);
                }
                Integer num = (Integer) map.get(interfaceC7156.mo16460());
                if (num.intValue() != 0) {
                    c17351.m39345(num.intValue());
                } else {
                    int size = byteArrayOutputStream.size();
                    Integer numValueOf = Integer.valueOf(size);
                    c17351.m39345(size);
                    map.put(interfaceC7156.mo16460(), numValueOf);
                    int size2 = interfaceC7156.mo16460().size();
                    if (((InterfaceC4474) interfaceC7156.mo16460().get(size2 - 1)).mo9476() == null) {
                        size2 = (size2 * (-1)) + 1;
                    }
                    C17351.m39337(byteArrayOutputStream, size2);
                    for (InterfaceC4474 interfaceC4474 : interfaceC7156.mo16460()) {
                        c21770.getClass();
                        InterfaceC22991 interfaceC22991Mo9475 = interfaceC4474.mo9475();
                        if (interfaceC22991Mo9475 == null) {
                            c24787 = null;
                        } else {
                            try {
                                c24787 = (C24787) interfaceC22991Mo9475;
                            } catch (ClassCastException unused) {
                                throw new IllegalStateException("Only TypeReference instances returned by DexBuilder.internTypeReference or DexBuilder.internNullableTypeReference may be used.");
                            }
                        }
                        int iMo9474 = interfaceC4474.mo9474();
                        if (c24787 != null) {
                            C17351.m39338(byteArrayOutputStream, c16069.mo10638(c24787));
                            C17351.m39338(byteArrayOutputStream, iMo9474);
                        } else {
                            C17351.m39338(byteArrayOutputStream, iMo9474);
                        }
                    }
                }
            }
            if (byteArrayOutputStream.size() > 0) {
                byteArrayOutputStream.writeTo(c17351);
                byteArrayOutputStream.reset();
            }
        }
        return position;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:67:0x0215  */
    /* JADX WARN: Code duplicated, block: B:68:0x021f  */
    /* JADX INFO: renamed from: ۜ */
    private void m50855(C17351 c17351) throws IOException {
        C9873 c9873;
        C21770 c21770;
        int i;
        int i2;
        c17351.m39339();
        this.f71651 = c17351.getPosition();
        InterfaceC9305 interfaceC9305 = this.f71646;
        int i3 = ((AbstractC7373) interfaceC9305.mo10634()).size() > 0 ? 3 : 1;
        C16069 c16069 = this.f71655;
        if (((AbstractC7373) c16069.mo10634()).size() > 0) {
            i3++;
        }
        C8043 c8043 = this.f71626;
        if (((AbstractC7373) c8043.mo10634()).size() > 0) {
            i3++;
        }
        C6032 c6032 = this.f71622;
        if (((AbstractC7373) c6032.mo10634()).size() > 0) {
            i3++;
        }
        C5361 c5361 = this.f71621;
        if (((AbstractC7373) c5361.mo10634()).size() > 0) {
            i3++;
        }
        C5006 c5006 = this.f71624;
        if (c5006.m10639() > 0) {
            i3++;
        }
        C16759 c16759 = this.f71652;
        if (((AbstractC7373) c16759.mo10634()).size() > 0) {
            i3++;
        }
        InterfaceC4335 interfaceC4335 = this.f71644;
        if (((AbstractC7373) interfaceC4335.mo12652()).size() > 0) {
            i3++;
        }
        C5676 c5676 = this.f71648;
        if (((AbstractC7373) c5676.mo12652()).size() > 0) {
            i3++;
        }
        InterfaceC24728 interfaceC24728 = this.f71631;
        if (((AbstractC7373) interfaceC24728.mo12652()).size() > 0) {
            i3++;
        }
        InterfaceC8635 interfaceC8635 = this.f71643;
        int size = ((AbstractC7373) interfaceC8635.mo12652()).size();
        C9873 c9874 = this.f71653;
        if (size <= 0) {
            c9873 = c9874;
            if (c9874.f27379 < 17) {
            }
            if (this.f71634 > 0) {
                i3++;
            }
            if (this.f71635 > 0) {
                i3++;
            }
            if (this.f71633 > 0) {
                i3++;
            }
            if (this.f71623 > 0) {
                i3++;
            }
            c21770 = this.f71640;
            if (((AbstractC7373) c21770.mo10634()).size() > 0) {
                i3++;
            }
            if (this.f71630 > 0) {
                i3++;
            }
            if (mo46911()) {
                i3++;
            }
            C17351.m39336(c17351, i3 + 1);
            m50849(c17351, 0, 1, 0);
            m50849(c17351, 1, ((AbstractC7373) interfaceC9305.mo10634()).size(), this.f71642);
            m50849(c17351, 2, ((AbstractC7373) c16069.mo10634()).size(), this.f71625);
            m50849(c17351, 3, ((AbstractC7373) c8043.mo10634()).size(), this.f71617);
            m50849(c17351, 4, ((AbstractC7373) c6032.mo10634()).size(), this.f71615);
            m50849(c17351, 5, ((AbstractC7373) c5361.mo10634()).size(), this.f71619);
            m50849(c17351, 6, ((AbstractC7373) c21770.mo10634()).size(), this.f71628);
            m50849(c17351, 7, c5006.m10639(), this.f71650);
            m50849(c17351, 8, ((AbstractC7373) c16759.mo10634()).size(), this.f71649);
            m50849(c17351, C0719o.a.f2912r, ((AbstractC7373) interfaceC9305.mo10634()).size(), this.f71632);
            m50849(c17351, C0719o.a.f2895a, ((AbstractC7373) interfaceC4335.mo12652()).size(), this.f71638);
            m50849(c17351, C0719o.a.f2915u, ((AbstractC7373) c5676.mo12652()).size(), this.f71614);
            m50849(c17351, C0719o.a.f2914t, ((AbstractC7373) interfaceC24728.mo12652()).size(), this.f71641);
            int size2 = ((AbstractC7373) interfaceC8635.mo12652()).size();
            if (c9873.f27379 < 17) {
                i = 1;
            } else {
                i = 0;
            }
            m50849(c17351, C0719o.a.f2897c, size2 + i, this.f71637);
            m50849(c17351, C0719o.a.f2896b, this.f71634, this.f71645);
            m50849(c17351, 8198, this.f71635, this.f71616);
            m50849(c17351, C0719o.a.f2913s, this.f71633, this.f71647);
            m50849(c17351, C0719o.a.f2911q, this.f71623, this.f71618);
            m50849(c17351, 8192, this.f71630, this.f71629);
            if (mo46911()) {
                i2 = 1;
                m50849(c17351, 61440, 1, this.f71639);
            } else {
                i2 = 1;
            }
            m50849(c17351, 4096, i2, this.f71651);
        }
        c9873 = c9874;
        i3++;
        if (this.f71634 > 0) {
            i3++;
        }
        if (this.f71635 > 0) {
            i3++;
        }
        if (this.f71633 > 0) {
            i3++;
        }
        if (this.f71623 > 0) {
            i3++;
        }
        c21770 = this.f71640;
        if (((AbstractC7373) c21770.mo10634()).size() > 0) {
            i3++;
        }
        if (this.f71630 > 0) {
            i3++;
        }
        if (mo46911()) {
            i3++;
        }
        C17351.m39336(c17351, i3 + 1);
        m50849(c17351, 0, 1, 0);
        m50849(c17351, 1, ((AbstractC7373) interfaceC9305.mo10634()).size(), this.f71642);
        m50849(c17351, 2, ((AbstractC7373) c16069.mo10634()).size(), this.f71625);
        m50849(c17351, 3, ((AbstractC7373) c8043.mo10634()).size(), this.f71617);
        m50849(c17351, 4, ((AbstractC7373) c6032.mo10634()).size(), this.f71615);
        m50849(c17351, 5, ((AbstractC7373) c5361.mo10634()).size(), this.f71619);
        m50849(c17351, 6, ((AbstractC7373) c21770.mo10634()).size(), this.f71628);
        m50849(c17351, 7, c5006.m10639(), this.f71650);
        m50849(c17351, 8, ((AbstractC7373) c16759.mo10634()).size(), this.f71649);
        m50849(c17351, C0719o.a.f2912r, ((AbstractC7373) interfaceC9305.mo10634()).size(), this.f71632);
        m50849(c17351, C0719o.a.f2895a, ((AbstractC7373) interfaceC4335.mo12652()).size(), this.f71638);
        m50849(c17351, C0719o.a.f2915u, ((AbstractC7373) c5676.mo12652()).size(), this.f71614);
        m50849(c17351, C0719o.a.f2914t, ((AbstractC7373) interfaceC24728.mo12652()).size(), this.f71641);
        int size3 = ((AbstractC7373) interfaceC8635.mo12652()).size();
        if (c9873.f27379 < 17) {
            i = 1;
        } else {
            i = 0;
        }
        m50849(c17351, C0719o.a.f2897c, size3 + i, this.f71637);
        m50849(c17351, C0719o.a.f2896b, this.f71634, this.f71645);
        m50849(c17351, 8198, this.f71635, this.f71616);
        m50849(c17351, C0719o.a.f2913s, this.f71633, this.f71647);
        m50849(c17351, C0719o.a.f2911q, this.f71623, this.f71618);
        m50849(c17351, 8192, this.f71630, this.f71629);
        if (mo46911()) {
            i2 = 1;
            m50849(c17351, 61440, 1, this.f71639);
        } else {
            i2 = 1;
        }
        m50849(c17351, 4096, i2, this.f71651);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50849(C17351 c17351, int i, int i2, int i3) throws IOException {
        if (i2 > 0) {
            c17351.m39345(i);
            c17351.m39345(0);
            C17351.m39336(c17351, i2);
            C17351.m39336(c17351, i3);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m50848(C17351 c17351, int i, int i2) throws IOException {
        byte[] bArrM17265 = C7484.m17265(this.f71653.f27379);
        c17351.write(bArrM17265, 0, bArrM17265.length);
        C17351.m39336(c17351, 0);
        c17351.write(new byte[20], 0, 20);
        C17351.m39336(c17351, i2);
        C17351.m39336(c17351, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        C17351.m39336(c17351, 305419896);
        C17351.m39336(c17351, 0);
        C17351.m39336(c17351, 0);
        C17351.m39336(c17351, this.f71651);
        m50861(c17351, ((AbstractC7373) this.f71646.mo10634()).size(), this.f71642);
        m50861(c17351, ((AbstractC7373) this.f71655.mo10634()).size(), this.f71625);
        m50861(c17351, ((AbstractC7373) this.f71626.mo10634()).size(), this.f71617);
        m50861(c17351, ((AbstractC7373) this.f71622.mo10634()).size(), this.f71615);
        m50861(c17351, ((AbstractC7373) this.f71621.mo10634()).size(), this.f71619);
        m50861(c17351, ((AbstractC7373) this.f71640.mo10634()).size(), this.f71628);
        C17351.m39336(c17351, i2 - i);
        C17351.m39336(c17351, i);
    }
}
