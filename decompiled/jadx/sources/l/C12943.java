package l;

import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5VL */
/* JADX INFO: loaded from: classes3.dex */
public final class C12943 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20706 f38821;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Comparator f38822 = new C3066();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C15765 f38823;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20000 f38824;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13648 f38825;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12238 f38826;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7897 f38827;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10122 f38828;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC11242 f38829;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC7299 f38830;

    public C12943(C7897 c7897, C15765 c15765, InterfaceC7299 interfaceC7299, C14416 c14416, C3855 c3855, C3149 c3149, C5971 c5971, C15142 c15142, C2775 c2775) {
        this.f38827 = c7897;
        this.f38823 = c15765;
        this.f38830 = interfaceC7299;
        this.f38829 = c14416;
        this.f38824 = c3855;
        this.f38828 = c3149;
        this.f38825 = c5971;
        this.f38826 = c15142;
        this.f38821 = c2775;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private short m31446(EnumC0841 enumC0841) {
        C7897 c7897 = this.f38827;
        Short shM21187 = c7897.m21187(enumC0841);
        if (shM21187 == null) {
            throw new C15431(null, "Instruction %s is invalid for api %d", enumC0841.f3315, Integer.valueOf(c7897.f24463));
        }
        return shM21187.shortValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31470(InterfaceC15889 interfaceC15889) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC15889.mo3975()));
            c15765.write(interfaceC15889.mo2818());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31450(InterfaceC2485 interfaceC2485) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC2485.mo3975()));
            c15765.write(0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31452(InterfaceC3896 interfaceC3896) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC3896.mo3975()));
            c15765.write((interfaceC3896.mo4919() << 4) | interfaceC3896.mo1790());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31475(InterfaceC18713 interfaceC18713) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC18713.mo3975()));
            c15765.write(interfaceC18713.mo1790());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31476(InterfaceC19419 interfaceC19419) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC19419.mo3975()));
            c15765.write((interfaceC19419.mo7930() << 4) | interfaceC19419.mo1790());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31447(InterfaceC0367 interfaceC0367) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC0367.mo3975()));
            c15765.write(interfaceC0367.mo1819());
            c15765.m37175(m31445(interfaceC0367.mo3609(), interfaceC0367.getReference()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31454(InterfaceC5307 interfaceC5307) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC5307.mo3975()));
            c15765.write(0);
            c15765.writeShort(interfaceC5307.mo2818());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31448(InterfaceC1073 interfaceC1073) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC1073.mo3975()));
            c15765.write(interfaceC1073.mo1790());
            c15765.m37175(m31445(interfaceC1073.mo3609(), interfaceC1073.getReference()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31458(InterfaceC8129 interfaceC8129) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC8129.mo3975()));
            c15765.write(interfaceC8129.mo1790());
            c15765.writeShort(interfaceC8129.mo4918());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31469(InterfaceC15183 interfaceC15183) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC15183.mo3975()));
            c15765.write(interfaceC15183.mo1790());
            c15765.writeShort(interfaceC15183.mo4918());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31479(InterfaceC21535 interfaceC21535) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC21535.mo3975()));
            c15765.write(interfaceC21535.mo1790());
            c15765.writeShort(interfaceC21535.mo4919());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31480(InterfaceC22240 interfaceC22240) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC22240.mo3975()));
            c15765.write(interfaceC22240.mo1790());
            c15765.writeShort(interfaceC22240.mo2818());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31477(InterfaceC20124 interfaceC20124) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC20124.mo3975()));
            c15765.write(interfaceC20124.mo1790());
            c15765.write(interfaceC20124.mo7930());
            c15765.write(interfaceC20124.mo4919());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31453(InterfaceC4601 interfaceC4601) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC4601.mo3975()));
            c15765.write(interfaceC4601.mo1790() | (interfaceC4601.mo7930() << 4));
            c15765.m37175(m31445(interfaceC4601.mo3609(), interfaceC4601.getReference()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31451(InterfaceC3190 interfaceC3190) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC3190.mo3975()));
            c15765.write(interfaceC3190.mo1790() | (interfaceC3190.mo7930() << 4));
            c15765.m37175(interfaceC3190.mo14389());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31466(InterfaceC13067 interfaceC13067) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC13067.mo3975()));
            c15765.write(interfaceC13067.mo1790() | (interfaceC13067.mo7930() << 4));
            c15765.writeShort(interfaceC13067.mo4919());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31465(InterfaceC12362 interfaceC12362) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC12362.mo3975()));
            c15765.write(interfaceC12362.mo1790() | (interfaceC12362.mo7930() << 4));
            c15765.writeShort(interfaceC12362.mo2818());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31462(InterfaceC10246 interfaceC10246) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC10246.mo3975()));
            c15765.write(interfaceC10246.mo1790());
            c15765.m37175(interfaceC10246.mo7930());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31455(InterfaceC6012 interfaceC6012) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC6012.mo3975()));
            c15765.write(interfaceC6012.mo1790());
            c15765.write(interfaceC6012.mo7930());
            c15765.write(interfaceC6012.mo7931());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31464(InterfaceC11657 interfaceC11657) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC11657.mo3975()));
            c15765.write(0);
            C15765.m37166(c15765, interfaceC11657.mo2818());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31481(InterfaceC22945 interfaceC22945) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC22945.mo3975()));
            c15765.write(interfaceC22945.mo1790());
            C15765.m37166(c15765, m31445(interfaceC22945.mo3609(), interfaceC22945.getReference()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31467(InterfaceC13772 interfaceC13772) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC13772.mo3975()));
            c15765.write(interfaceC13772.mo1790());
            C15765.m37166(c15765, interfaceC13772.mo4919());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31457(InterfaceC7423 interfaceC7423) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC7423.mo3975()));
            c15765.write(interfaceC7423.mo1790());
            C15765.m37166(c15765, interfaceC7423.mo2818());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31449(InterfaceC1943 interfaceC1943) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC1943.mo3975()));
            c15765.write(0);
            c15765.m37175(interfaceC1943.mo1790());
            c15765.m37175(interfaceC1943.mo7930());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31463(InterfaceC11116 interfaceC11116) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC11116.mo3975()));
            c15765.write(interfaceC11116.mo3610() | (interfaceC11116.mo3615() << 4));
            c15765.m37175(m31445(interfaceC11116.mo3609(), interfaceC11116.getReference()));
            c15765.write(interfaceC11116.mo3614() | (interfaceC11116.mo3612() << 4));
            c15765.write((interfaceC11116.mo3613() << 4) | interfaceC11116.mo3611());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31472(InterfaceC16759 interfaceC16759) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC16759.mo3975()));
            c15765.write(interfaceC16759.mo3610() | (interfaceC16759.mo3615() << 4));
            c15765.m37175(interfaceC16759.mo21537());
            c15765.write(interfaceC16759.mo3614() | (interfaceC16759.mo3612() << 4));
            c15765.write((interfaceC16759.mo3613() << 4) | interfaceC16759.mo3611());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31474(InterfaceC18171 interfaceC18171) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC18171.mo3975()));
            c15765.write(interfaceC18171.mo3610() | (interfaceC18171.mo3615() << 4));
            c15765.m37175(interfaceC18171.mo34743());
            c15765.write(interfaceC18171.mo3614() | (interfaceC18171.mo3612() << 4));
            c15765.write((interfaceC18171.mo3613() << 4) | interfaceC18171.mo3611());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31473(InterfaceC17465 interfaceC17465) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC17465.mo3975()));
            c15765.write(interfaceC17465.mo3615());
            c15765.m37175(m31445(interfaceC17465.mo3609(), interfaceC17465.getReference()));
            c15765.m37175(interfaceC17465.mo9712());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31468(InterfaceC14642 interfaceC14642) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC14642.mo3975()));
            c15765.write(interfaceC14642.mo3615());
            c15765.m37175(interfaceC14642.mo21537());
            c15765.m37175(interfaceC14642.mo9712());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31482(InterfaceC23815 interfaceC23815) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC23815.mo3975()));
            c15765.write(interfaceC23815.mo3615());
            c15765.m37175(interfaceC23815.mo34743());
            c15765.m37175(interfaceC23815.mo9712());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31456(InterfaceC6882 interfaceC6882) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC6882.mo3975()));
            c15765.write(interfaceC6882.mo3610() | (interfaceC6882.mo3615() << 4));
            c15765.m37175(m31445(interfaceC6882.mo3609(), interfaceC6882.getReference()));
            c15765.write(interfaceC6882.mo3614() | (interfaceC6882.mo3612() << 4));
            c15765.write(interfaceC6882.mo3611() | (interfaceC6882.mo3613() << 4));
            c15765.m37175(m31445(interfaceC6882.mo9711(), interfaceC6882.mo9710()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31478(InterfaceC20994 interfaceC20994) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC20994.mo3975()));
            c15765.write(interfaceC20994.mo3615());
            c15765.m37175(m31445(interfaceC20994.mo3609(), interfaceC20994.getReference()));
            c15765.m37175(interfaceC20994.mo9712());
            c15765.m37175(m31445(interfaceC20994.mo9711(), interfaceC20994.mo9710()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31461(InterfaceC9705 interfaceC9705) {
        C15765 c15765 = this.f38823;
        try {
            c15765.write(m31446(interfaceC9705.mo3975()));
            c15765.write(interfaceC9705.mo1790());
            long jMo4920 = interfaceC9705.mo4920();
            C15765.m37166(c15765, (int) jMo4920);
            C15765.m37166(c15765, (int) (jMo4920 >> 32));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31459(InterfaceC8835 interfaceC8835) {
        C15765 c15765 = this.f38823;
        try {
            c15765.m37175((int) m31446(interfaceC8835.mo3975()));
            c15765.m37175(interfaceC8835.mo19046());
            List listMo19045 = interfaceC8835.mo19045();
            C15765.m37166(c15765, listMo19045.size());
            int iMo19046 = interfaceC8835.mo19046();
            if (iMo19046 == 1) {
                Iterator it = listMo19045.iterator();
                while (it.hasNext()) {
                    c15765.write(((Number) it.next()).byteValue());
                }
            } else if (iMo19046 == 2) {
                Iterator it2 = listMo19045.iterator();
                while (it2.hasNext()) {
                    c15765.writeShort(((Number) it2.next()).shortValue());
                }
            } else if (iMo19046 == 4) {
                Iterator it3 = listMo19045.iterator();
                while (it3.hasNext()) {
                    C15765.m37166(c15765, ((Number) it3.next()).intValue());
                }
            } else if (iMo19046 == 8) {
                Iterator it4 = listMo19045.iterator();
                while (it4.hasNext()) {
                    long jLongValue = ((Number) it4.next()).longValue();
                    C15765.m37166(c15765, (int) jLongValue);
                    C15765.m37166(c15765, (int) (jLongValue >> 32));
                }
            }
            if ((c15765.getPosition() & 1) != 0) {
                c15765.write(0);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31471(InterfaceC16053 interfaceC16053) {
        C15765 c15765 = this.f38823;
        try {
            c15765.m37172(0);
            c15765.m37172(m31446(interfaceC16053.mo3975()) >> 8);
            AbstractC14545 abstractC14545M34731 = AbstractC14545.m34731(AbstractC10232.m25862(this.f38822), interfaceC16053.mo8107());
            c15765.m37175(abstractC14545M34731.size());
            AbstractC4628 abstractC4628ListIterator = abstractC14545M34731.listIterator(0);
            while (abstractC4628ListIterator.hasNext()) {
                C15765.m37166(c15765, ((InterfaceC18007) abstractC4628ListIterator.next()).getKey());
            }
            AbstractC4628 abstractC4628ListIterator2 = abstractC14545M34731.listIterator(0);
            while (abstractC4628ListIterator2.hasNext()) {
                C15765.m37166(c15765, ((InterfaceC18007) abstractC4628ListIterator2.next()).mo12019());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31460(InterfaceC8999 interfaceC8999) {
        C15765 c15765 = this.f38823;
        try {
            c15765.m37172(0);
            c15765.m37172(m31446(interfaceC8999.mo3975()) >> 8);
            List listMo8107 = interfaceC8999.mo8107();
            c15765.m37175(listMo8107.size());
            if (listMo8107.size() == 0) {
                C15765.m37166(c15765, 0);
                return;
            }
            C15765.m37166(c15765, ((InterfaceC18007) listMo8107.get(0)).getKey());
            Iterator it = listMo8107.iterator();
            while (it.hasNext()) {
                C15765.m37166(c15765, ((InterfaceC18007) it.next()).mo12019());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m31445(int i, InterfaceC8293 interfaceC8293) {
        switch (i) {
            case 0:
                return this.f38830.mo19580((InterfaceC15347) interfaceC8293);
            case 1:
                return ((C14416) this.f38829).m34446((InterfaceC21699) interfaceC8293);
            case 2:
                return ((C3855) this.f38824).mo8575((InterfaceC18877) interfaceC8293);
            case 3:
                return ((C3149) this.f38828).mo8575((InterfaceC5471) interfaceC8293);
            case 4:
                return ((C5971) this.f38825).mo8575((InterfaceC0531) interfaceC8293);
            case 5:
                return ((C2775) this.f38821).mo8575((InterfaceC4060) interfaceC8293);
            case 6:
                return ((C15142) this.f38826).mo8575((InterfaceC19583) interfaceC8293);
            default:
                throw new C15431(null, "Unknown reference type: %d", Integer.valueOf(i));
        }
    }
}
