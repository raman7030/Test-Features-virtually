package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9OM */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4610 implements InterfaceC11138 {
    @Override // 
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public abstract AbstractC4610 mo56039clone();

    public abstract AbstractC4610 internalMergeFrom(AbstractC5951 abstractC5951);

    @Override // p067l.InterfaceC11138
    public abstract AbstractC4610 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283);

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC4610 mo56045mergeFrom(byte[] bArr, int i, int i2) throws C4293 {
        try {
            AbstractC9303 abstractC9303M21516 = AbstractC9303.m21516(false, i, i2, bArr);
            mo56044mergeFrom(abstractC9303M21516);
            abstractC9303M21516.mo21522(0);
            return this;
        } catch (C4293 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m9735("byte array"), e2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC4610 mo56046mergeFrom(byte[] bArr, int i, int i2, C19283 c19283) throws C4293 {
        try {
            AbstractC9303 abstractC9303M21516 = AbstractC9303.m21516(false, i, i2, bArr);
            mergeFrom(abstractC9303M21516, c19283);
            abstractC9303M21516.mo21522(0);
            return this;
        } catch (C4293 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m9735("byte array"), e2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC4610 mo56044mergeFrom(AbstractC9303 abstractC9303) {
        return mergeFrom(abstractC9303, C19283.m43977());
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC4610 mo56042mergeFrom(AbstractC7962 abstractC7962) throws C4293 {
        try {
            AbstractC9303 abstractC9303Mo18428 = abstractC7962.mo18428();
            mo56044mergeFrom(abstractC9303Mo18428);
            abstractC9303Mo18428.mo21522(0);
            return this;
        } catch (C4293 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m9735("ByteString"), e2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC4610 mo56043mergeFrom(AbstractC7962 abstractC7962, C19283 c19283) throws C4293 {
        try {
            AbstractC9303 abstractC9303Mo18428 = abstractC7962.mo18428();
            mergeFrom(abstractC9303Mo18428, c19283);
            abstractC9303Mo18428.mo21522(0);
            return this;
        } catch (C4293 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m9735("ByteString"), e2);
        }
    }

    @Override // p067l.InterfaceC11138
    public AbstractC4610 mergeFrom(byte[] bArr) {
        return mo56045mergeFrom(bArr, 0, bArr.length);
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC4610 mo56047mergeFrom(byte[] bArr, C19283 c19283) {
        return mo56046mergeFrom(bArr, 0, bArr.length, c19283);
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC4610 mo56040mergeFrom(InputStream inputStream) {
        AbstractC9303 abstractC9303M21515 = AbstractC9303.m21515(inputStream);
        mo56044mergeFrom(abstractC9303M21515);
        abstractC9303M21515.mo21522(0);
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC4610 mo56041mergeFrom(InputStream inputStream, C19283 c19283) {
        AbstractC9303 abstractC9303M21515 = AbstractC9303.m21515(inputStream);
        mergeFrom(abstractC9303M21515, c19283);
        abstractC9303M21515.mo21522(0);
        return this;
    }

    public boolean mergeDelimitedFrom(InputStream inputStream, C19283 c19283) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        mo56041mergeFrom((InputStream) new C17349(inputStream, AbstractC9303.m21513(inputStream, i)), c19283);
        return true;
    }

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, C19283.m43977());
    }

    @Override // p067l.InterfaceC11138
    public AbstractC4610 mergeFrom(InterfaceC10467 interfaceC10467) {
        if (!getDefaultInstanceForType().getClass().isInstance(interfaceC10467)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return internalMergeFrom((AbstractC5951) interfaceC10467);
    }

    /* JADX INFO: renamed from: ֫ */
    private String m9735(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m9739(Iterable iterable, List list) {
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 >= size) {
                        list.remove(size2);
                    } else {
                        throw new NullPointerException(str);
                    }
                }
            } else {
                list.add(obj);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19204 m9736(InterfaceC10467 interfaceC10467) {
        return new C19204();
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static void m9737(Iterable iterable, Collection collection) {
        m9738(iterable, (List) collection);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9738(Iterable iterable, List list) {
        byte[] bArr = C15671.f44805;
        iterable.getClass();
        if (iterable instanceof InterfaceC6305) {
            List listMo10518 = ((InterfaceC6305) iterable).mo10518();
            InterfaceC6305 interfaceC6305 = (InterfaceC6305) list;
            int size = list.size();
            for (Object obj : listMo10518) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC6305.size() - size) + " is null.";
                    int size2 = interfaceC6305.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            interfaceC6305.remove(size2);
                        } else {
                            throw new NullPointerException(str);
                        }
                    }
                } else if (obj instanceof AbstractC7962) {
                    interfaceC6305.mo10516((AbstractC7962) obj);
                } else {
                    interfaceC6305.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC11809) {
            list.addAll((Collection) iterable);
        } else {
            m9739(iterable, list);
        }
    }
}
