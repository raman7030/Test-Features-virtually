package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9OM */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2359 implements InterfaceC9228 {
    @Override // 
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public abstract AbstractC2359 mo7670clone();

    public abstract AbstractC2359 internalMergeFrom(AbstractC3770 abstractC3770);

    @Override // l.InterfaceC9228
    public abstract AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798);

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC2359 mo7676mergeFrom(byte[] bArr, int i, int i2) throws C2025 {
        try {
            AbstractC7297 abstractC7297M19548 = AbstractC7297.m19548(false, i, i2, bArr);
            mo7675mergeFrom(abstractC7297M19548);
            abstractC7297M19548.mo19554(0);
            return this;
        } catch (C2025 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m7664("byte array"), e2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC2359 mo7677mergeFrom(byte[] bArr, int i, int i2, C17798 c17798) throws C2025 {
        try {
            AbstractC7297 abstractC7297M19548 = AbstractC7297.m19548(false, i, i2, bArr);
            mergeFrom(abstractC7297M19548, c17798);
            abstractC7297M19548.mo19554(0);
            return this;
        } catch (C2025 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m7664("byte array"), e2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC2359 mo7675mergeFrom(AbstractC7297 abstractC7297) {
        return mergeFrom(abstractC7297, C17798.m41731());
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC2359 mo7673mergeFrom(AbstractC5886 abstractC5886) throws C2025 {
        try {
            AbstractC7297 abstractC7297Mo16502 = abstractC5886.mo16502();
            mo7675mergeFrom(abstractC7297Mo16502);
            abstractC7297Mo16502.mo19554(0);
            return this;
        } catch (C2025 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m7664("ByteString"), e2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC2359 mo7674mergeFrom(AbstractC5886 abstractC5886, C17798 c17798) throws C2025 {
        try {
            AbstractC7297 abstractC7297Mo16502 = abstractC5886.mo16502();
            mergeFrom(abstractC7297Mo16502, c17798);
            abstractC7297Mo16502.mo19554(0);
            return this;
        } catch (C2025 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m7664("ByteString"), e2);
        }
    }

    @Override // l.InterfaceC9228
    public AbstractC2359 mergeFrom(byte[] bArr) {
        return mo7676mergeFrom(bArr, 0, bArr.length);
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC2359 mo7678mergeFrom(byte[] bArr, C17798 c17798) {
        return mo7677mergeFrom(bArr, 0, bArr.length, c17798);
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC2359 mo7671mergeFrom(InputStream inputStream) {
        AbstractC7297 abstractC7297M19547 = AbstractC7297.m19547(inputStream);
        mo7675mergeFrom(abstractC7297M19547);
        abstractC7297M19547.mo19554(0);
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: mergeFrom */
    public AbstractC2359 mo7672mergeFrom(InputStream inputStream, C17798 c17798) {
        AbstractC7297 abstractC7297M19547 = AbstractC7297.m19547(inputStream);
        mergeFrom(abstractC7297M19547, c17798);
        abstractC7297M19547.mo19554(0);
        return this;
    }

    public boolean mergeDelimitedFrom(InputStream inputStream, C17798 c17798) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        mo7672mergeFrom((InputStream) new C15763(inputStream, AbstractC7297.m19545(inputStream, i)), c17798);
        return true;
    }

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, C17798.m41731());
    }

    @Override // l.InterfaceC9228
    public AbstractC2359 mergeFrom(InterfaceC8522 interfaceC8522) {
        if (!getDefaultInstanceForType().getClass().isInstance(interfaceC8522)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return internalMergeFrom((AbstractC3770) interfaceC8522);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m7664(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m7668(Iterable iterable, List list) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17715 m7665(InterfaceC8522 interfaceC8522) {
        return new C17715();
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7666(Iterable iterable, Collection collection) {
        m7667(iterable, (List) collection);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7667(Iterable iterable, List list) {
        byte[] bArr = C13997.f41722;
        iterable.getClass();
        if (iterable instanceof InterfaceC4142) {
            List listMo8471 = ((InterfaceC4142) iterable).mo8471();
            InterfaceC4142 interfaceC4142 = (InterfaceC4142) list;
            int size = list.size();
            for (Object obj : listMo8471) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC4142.size() - size) + " is null.";
                    int size2 = interfaceC4142.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            interfaceC4142.remove(size2);
                        } else {
                            throw new NullPointerException(str);
                        }
                    }
                } else if (obj instanceof AbstractC5886) {
                    interfaceC4142.mo8469((AbstractC5886) obj);
                } else {
                    interfaceC4142.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC9934) {
            list.addAll((Collection) iterable);
        } else {
            m7668(iterable, list);
        }
    }
}
