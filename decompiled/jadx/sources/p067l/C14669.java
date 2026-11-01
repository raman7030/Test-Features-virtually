package p067l;

import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5VL */
/* JADX INFO: loaded from: classes3.dex */
public final class C14669 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC22047 f41865;

    /* JADX INFO: renamed from: ۜ */
    public final Comparator f41866 = new C5282();

    /* JADX INFO: renamed from: ۢ */
    public final C17351 f41867;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC21376 f41868;

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC15339 f41869;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC13999 f41870;

    /* JADX INFO: renamed from: ܿ */
    public final C9873 f41871;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC11988 f41872;

    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC13053 f41873;

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC9305 f41874;

    public C14669(C9873 c9873, C17351 c17351, InterfaceC9305 interfaceC9305, C16069 c16069, C6032 c6032, C5361 c5361, C8043 c8043, C16759 c16759, C5006 c5006) {
        this.f41871 = c9873;
        this.f41867 = c17351;
        this.f41874 = interfaceC9305;
        this.f41873 = c16069;
        this.f41868 = c6032;
        this.f41872 = c5361;
        this.f41869 = c8043;
        this.f41870 = c16759;
        this.f41865 = c5006;
    }

    /* JADX INFO: renamed from: ֫ */
    private short m33533(EnumC3167 enumC3167) {
        C9873 c9873 = this.f41871;
        Short shM23153 = c9873.m23153(enumC3167);
        if (shM23153 == null) {
            throw new C17034(null, "Instruction %s is invalid for api %d", enumC3167.f6089, Integer.valueOf(c9873.f27379));
        }
        return shM23153.shortValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33557(InterfaceC17469 interfaceC17469) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC17469.mo6217()));
            c17351.write(interfaceC17469.mo5147());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33537(InterfaceC4730 interfaceC4730) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC4730.mo6217()));
            c17351.write(0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33539(InterfaceC6071 interfaceC6071) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC6071.mo6217()));
            c17351.write((interfaceC6071.mo7161() << 4) | interfaceC6071.mo4189());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33562(InterfaceC20153 interfaceC20153) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC20153.mo6217()));
            c17351.write(interfaceC20153.mo4189());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33563(InterfaceC20824 interfaceC20824) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC20824.mo6217()));
            c17351.write((interfaceC20824.mo9978() << 4) | interfaceC20824.mo4189());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33534(InterfaceC2717 interfaceC2717) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC2717.mo6217()));
            c17351.write(interfaceC2717.mo4220());
            c17351.m39345(m33532(interfaceC2717.mo5880(), interfaceC2717.getReference()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33541(InterfaceC7412 interfaceC7412) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC7412.mo6217()));
            c17351.write(0);
            c17351.writeShort(interfaceC7412.mo5147());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33535(InterfaceC3388 interfaceC3388) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC3388.mo6217()));
            c17351.write(interfaceC3388.mo4189());
            c17351.m39345(m33532(interfaceC3388.mo5880(), interfaceC3388.getReference()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33545(InterfaceC10094 interfaceC10094) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC10094.mo6217()));
            c17351.write(interfaceC10094.mo4189());
            c17351.writeShort(interfaceC10094.mo7160());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33556(InterfaceC16798 interfaceC16798) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC16798.mo6217()));
            c17351.write(interfaceC16798.mo4189());
            c17351.writeShort(interfaceC16798.mo7160());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33566(InterfaceC22835 interfaceC22835) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC22835.mo6217()));
            c17351.write(interfaceC22835.mo4189());
            c17351.writeShort(interfaceC22835.mo7161());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33567(InterfaceC23505 interfaceC23505) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC23505.mo6217()));
            c17351.write(interfaceC23505.mo4189());
            c17351.writeShort(interfaceC23505.mo5147());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33564(InterfaceC21494 interfaceC21494) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC21494.mo6217()));
            c17351.write(interfaceC21494.mo4189());
            c17351.write(interfaceC21494.mo9978());
            c17351.write(interfaceC21494.mo7161());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33540(InterfaceC6741 interfaceC6741) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC6741.mo6217()));
            c17351.write(interfaceC6741.mo4189() | (interfaceC6741.mo9978() << 4));
            c17351.m39345(m33532(interfaceC6741.mo5880(), interfaceC6741.getReference()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33538(InterfaceC5400 interfaceC5400) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC5400.mo6217()));
            c17351.write(interfaceC5400.mo4189() | (interfaceC5400.mo9978() << 4));
            c17351.m39345(interfaceC5400.mo16292());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33553(InterfaceC14787 interfaceC14787) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC14787.mo6217()));
            c17351.write(interfaceC14787.mo4189() | (interfaceC14787.mo9978() << 4));
            c17351.writeShort(interfaceC14787.mo7161());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33552(InterfaceC14117 interfaceC14117) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC14117.mo6217()));
            c17351.write(interfaceC14117.mo4189() | (interfaceC14117.mo9978() << 4));
            c17351.writeShort(interfaceC14117.mo5147());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33549(InterfaceC12106 interfaceC12106) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC12106.mo6217()));
            c17351.write(interfaceC12106.mo4189());
            c17351.m39345(interfaceC12106.mo9978());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33542(InterfaceC8082 interfaceC8082) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC8082.mo6217()));
            c17351.write(interfaceC8082.mo4189());
            c17351.write(interfaceC8082.mo9978());
            c17351.write(interfaceC8082.mo9979());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33551(InterfaceC13447 interfaceC13447) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC13447.mo6217()));
            c17351.write(0);
            C17351.m39336(c17351, interfaceC13447.mo5147());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33568(InterfaceC24175 interfaceC24175) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC24175.mo6217()));
            c17351.write(interfaceC24175.mo4189());
            C17351.m39336(c17351, m33532(interfaceC24175.mo5880(), interfaceC24175.getReference()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33554(InterfaceC15457 interfaceC15457) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC15457.mo6217()));
            c17351.write(interfaceC15457.mo4189());
            C17351.m39336(c17351, interfaceC15457.mo7161());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33544(InterfaceC9423 interfaceC9423) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC9423.mo6217()));
            c17351.write(interfaceC9423.mo4189());
            C17351.m39336(c17351, interfaceC9423.mo5147());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33536(InterfaceC4215 interfaceC4215) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC4215.mo6217()));
            c17351.write(0);
            c17351.m39345(interfaceC4215.mo4189());
            c17351.m39345(interfaceC4215.mo9978());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33550(InterfaceC12933 interfaceC12933) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC12933.mo6217()));
            c17351.write(interfaceC12933.mo5881() | (interfaceC12933.mo5886() << 4));
            c17351.m39345(m33532(interfaceC12933.mo5880(), interfaceC12933.getReference()));
            c17351.write(interfaceC12933.mo5885() | (interfaceC12933.mo5883() << 4));
            c17351.write((interfaceC12933.mo5884() << 4) | interfaceC12933.mo5882());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33559(InterfaceC18296 interfaceC18296) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC18296.mo6217()));
            c17351.write(interfaceC18296.mo5881() | (interfaceC18296.mo5886() << 4));
            c17351.m39345(interfaceC18296.mo23505());
            c17351.write(interfaceC18296.mo5885() | (interfaceC18296.mo5883() << 4));
            c17351.write((interfaceC18296.mo5884() << 4) | interfaceC18296.mo5882());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33561(InterfaceC19638 interfaceC19638) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC19638.mo6217()));
            c17351.write(interfaceC19638.mo5881() | (interfaceC19638.mo5886() << 4));
            c17351.m39345(interfaceC19638.mo36892());
            c17351.write(interfaceC19638.mo5885() | (interfaceC19638.mo5883() << 4));
            c17351.write((interfaceC19638.mo5884() << 4) | interfaceC19638.mo5882());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33560(InterfaceC18967 interfaceC18967) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC18967.mo6217()));
            c17351.write(interfaceC18967.mo5886());
            c17351.m39345(m33532(interfaceC18967.mo5880(), interfaceC18967.getReference()));
            c17351.m39345(interfaceC18967.mo11756());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33555(InterfaceC16284 interfaceC16284) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC16284.mo6217()));
            c17351.write(interfaceC16284.mo5886());
            c17351.m39345(interfaceC16284.mo23505());
            c17351.m39345(interfaceC16284.mo11756());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33569(InterfaceC25002 interfaceC25002) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC25002.mo6217()));
            c17351.write(interfaceC25002.mo5886());
            c17351.m39345(interfaceC25002.mo36892());
            c17351.m39345(interfaceC25002.mo11756());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33543(InterfaceC8909 interfaceC8909) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC8909.mo6217()));
            c17351.write(interfaceC8909.mo5881() | (interfaceC8909.mo5886() << 4));
            c17351.m39345(m33532(interfaceC8909.mo5880(), interfaceC8909.getReference()));
            c17351.write(interfaceC8909.mo5885() | (interfaceC8909.mo5883() << 4));
            c17351.write(interfaceC8909.mo5882() | (interfaceC8909.mo5884() << 4));
            c17351.m39345(m33532(interfaceC8909.mo11755(), interfaceC8909.mo11754()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33565(InterfaceC22321 interfaceC22321) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC22321.mo6217()));
            c17351.write(interfaceC22321.mo5886());
            c17351.m39345(m33532(interfaceC22321.mo5880(), interfaceC22321.getReference()));
            c17351.m39345(interfaceC22321.mo11756());
            c17351.m39345(m33532(interfaceC22321.mo11755(), interfaceC22321.mo11754()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33548(InterfaceC11592 interfaceC11592) {
        C17351 c17351 = this.f41867;
        try {
            c17351.write(m33533(interfaceC11592.mo6217()));
            c17351.write(interfaceC11592.mo4189());
            long jMo7162 = interfaceC11592.mo7162();
            C17351.m39336(c17351, (int) jMo7162);
            C17351.m39336(c17351, (int) (jMo7162 >> 32));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33546(InterfaceC10765 interfaceC10765) {
        C17351 c17351 = this.f41867;
        try {
            c17351.m39345((int) m33533(interfaceC10765.mo6217()));
            c17351.m39345(interfaceC10765.mo21004());
            List listMo21003 = interfaceC10765.mo21003();
            C17351.m39336(c17351, listMo21003.size());
            int iMo21004 = interfaceC10765.mo21004();
            if (iMo21004 == 1) {
                Iterator it = listMo21003.iterator();
                while (it.hasNext()) {
                    c17351.write(((Number) it.next()).byteValue());
                }
            } else if (iMo21004 == 2) {
                Iterator it2 = listMo21003.iterator();
                while (it2.hasNext()) {
                    c17351.writeShort(((Number) it2.next()).shortValue());
                }
            } else if (iMo21004 == 4) {
                Iterator it3 = listMo21003.iterator();
                while (it3.hasNext()) {
                    C17351.m39336(c17351, ((Number) it3.next()).intValue());
                }
            } else if (iMo21004 == 8) {
                Iterator it4 = listMo21003.iterator();
                while (it4.hasNext()) {
                    long jLongValue = ((Number) it4.next()).longValue();
                    C17351.m39336(c17351, (int) jLongValue);
                    C17351.m39336(c17351, (int) (jLongValue >> 32));
                }
            }
            if ((c17351.getPosition() & 1) != 0) {
                c17351.write(0);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33558(InterfaceC17625 interfaceC17625) {
        C17351 c17351 = this.f41867;
        try {
            c17351.m39342(0);
            c17351.m39342(m33533(interfaceC17625.mo6217()) >> 8);
            AbstractC16192 abstractC16192M36880 = AbstractC16192.m36880(AbstractC12093.m27884(this.f41866), interfaceC17625.mo10139());
            c17351.m39345(abstractC16192M36880.size());
            AbstractC6767 abstractC6767ListIterator = abstractC16192M36880.listIterator(0);
            while (abstractC6767ListIterator.hasNext()) {
                C17351.m39336(c17351, ((InterfaceC19482) abstractC6767ListIterator.next()).getKey());
            }
            AbstractC6767 abstractC6767ListIterator2 = abstractC16192M36880.listIterator(0);
            while (abstractC6767ListIterator2.hasNext()) {
                C17351.m39336(c17351, ((InterfaceC19482) abstractC6767ListIterator2.next()).mo13943());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33547(InterfaceC10921 interfaceC10921) {
        C17351 c17351 = this.f41867;
        try {
            c17351.m39342(0);
            c17351.m39342(m33533(interfaceC10921.mo6217()) >> 8);
            List listMo10139 = interfaceC10921.mo10139();
            c17351.m39345(listMo10139.size());
            if (listMo10139.size() == 0) {
                C17351.m39336(c17351, 0);
                return;
            }
            C17351.m39336(c17351, ((InterfaceC19482) listMo10139.get(0)).getKey());
            Iterator it = listMo10139.iterator();
            while (it.hasNext()) {
                C17351.m39336(c17351, ((InterfaceC19482) it.next()).mo13943());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m33532(int i, InterfaceC10250 interfaceC10250) {
        switch (i) {
            case 0:
                return this.f41874.mo21548((InterfaceC16954) interfaceC10250);
            case 1:
                return ((C16069) this.f41873).m36579((InterfaceC22991) interfaceC10250);
            case 2:
                return ((C6032) this.f41868).mo10638((InterfaceC20309) interfaceC10250);
            case 3:
                return ((C5361) this.f41872).mo10638((InterfaceC7568) interfaceC10250);
            case 4:
                return ((C8043) this.f41869).mo10638((InterfaceC2873) interfaceC10250);
            case 5:
                return ((C5006) this.f41865).mo10638((InterfaceC6227) interfaceC10250);
            case 6:
                return ((C16759) this.f41870).mo10638((InterfaceC20980) interfaceC10250);
            default:
                throw new C17034(null, "Unknown reference type: %d", Integer.valueOf(i));
        }
    }
}
