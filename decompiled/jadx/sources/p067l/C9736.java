package p067l;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U8HK */
/* JADX INFO: loaded from: classes3.dex */
public final class C9736 implements InterfaceC24901 {

    /* JADX INFO: renamed from: ֫ */
    public final C14191 f26891;

    /* JADX INFO: renamed from: ۧ */
    public final ContextWrapper f26892;

    /* JADX INFO: renamed from: ܽ */
    public int f26893 = 0;

    public C9736(ContextWrapper contextWrapper) {
        this.f26892 = contextWrapper;
        this.f26891 = new C14191(contextWrapper);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22760() {
        this.f26893 = 2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    @Override // p067l.InterfaceC24901
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4114[] mo22762(Handler handler, InterfaceC18027 interfaceC18027, InterfaceC7448 interfaceC7448, InterfaceC10966 interfaceC10966, InterfaceC12005 interfaceC12005) {
        char c;
        char c2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList = new ArrayList();
        int i8 = this.f26893;
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        ContextWrapper contextWrapper = this.f26892;
        C13137 c13137 = new C13137(contextWrapper);
        C14191 c14191 = this.f26891;
        c13137.m30058(c14191);
        c13137.m30060();
        c13137.m30057(handler);
        c13137.m30059(interfaceC18027);
        c13137.m30061();
        arrayList.add(c13137.m30056());
        if (i8 == 0) {
            c = 0;
        } else {
            int size = arrayList.size();
            if (i8 == 2) {
                size--;
            }
            int i9 = size;
            c = 0;
            try {
                try {
                    c2 = 2;
                    try {
                        i = i9 + 1;
                        try {
                            arrayList.add(i9, (InterfaceC4114) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, InterfaceC18027.class, cls).newInstance(5000L, handler, interfaceC18027, 50));
                            C21334.m48349("Loaded LibvpxVideoRenderer.");
                        } catch (ClassNotFoundException unused) {
                            i9 = i;
                            i = i9;
                        }
                    } catch (ClassNotFoundException unused2) {
                    }
                } catch (ClassNotFoundException unused3) {
                    c2 = 2;
                }
                try {
                    try {
                        Class<?> cls3 = Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer");
                        Class<?>[] clsArr = new Class[4];
                        clsArr[0] = cls2;
                        clsArr[1] = Handler.class;
                        clsArr[c2] = InterfaceC18027.class;
                        clsArr[3] = cls;
                        Constructor<?> constructor = cls3.getConstructor(clsArr);
                        Object[] objArr = new Object[4];
                        objArr[0] = 5000L;
                        objArr[1] = handler;
                        objArr[c2] = interfaceC18027;
                        objArr[3] = 50;
                        InterfaceC4114 interfaceC4114 = (InterfaceC4114) constructor.newInstance(objArr);
                        i2 = i + 1;
                        try {
                            arrayList.add(i, interfaceC4114);
                            C21334.m48349("Loaded Libgav1VideoRenderer.");
                        } catch (ClassNotFoundException unused4) {
                            i = i2;
                            i2 = i;
                        }
                    } catch (Exception e) {
                        throw new IllegalStateException("Error instantiating AV1 extension", e);
                    }
                } catch (ClassNotFoundException unused5) {
                }
                try {
                    Class[] clsArr2 = new Class[4];
                    clsArr2[0] = cls2;
                    clsArr2[1] = Handler.class;
                    clsArr2[c2] = InterfaceC18027.class;
                    clsArr2[3] = cls;
                    Constructor constructor2 = C14410.class.getConstructor(clsArr2);
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = 5000L;
                    objArr2[1] = handler;
                    objArr2[c2] = interfaceC18027;
                    objArr2[3] = 50;
                    arrayList.add(i2, (InterfaceC4114) constructor2.newInstance(objArr2));
                    C21334.m48349("Loaded FfmpegVideoRenderer.");
                } catch (ClassNotFoundException unused6) {
                } catch (Exception e2) {
                    throw new IllegalStateException("Error instantiating FFmpeg extension", e2);
                }
            } catch (Exception e3) {
                throw new IllegalStateException("Error instantiating VP9 extension", e3);
            }
        }
        C10072 c10072M49950 = new C22143(contextWrapper).m49950();
        int i10 = this.f26893;
        arrayList.add(new C6719(contextWrapper, c14191, handler, interfaceC7448, c10072M49950));
        if (i10 != 0) {
            int size2 = arrayList.size();
            if (i10 == 2) {
                size2--;
            }
            try {
                try {
                    Class[] clsArr3 = new Class[4];
                    clsArr3[c] = Context.class;
                    clsArr3[1] = Handler.class;
                    clsArr3[2] = InterfaceC7448.class;
                    clsArr3[3] = InterfaceC6777.class;
                    Constructor constructor3 = C16441.class.getConstructor(clsArr3);
                    Object[] objArr3 = new Object[4];
                    objArr3[c] = contextWrapper;
                    objArr3[1] = handler;
                    objArr3[2] = interfaceC7448;
                    objArr3[3] = c10072M49950;
                    InterfaceC4114 interfaceC4115 = (InterfaceC4114) constructor3.newInstance(objArr3);
                    i3 = size2 + 1;
                    try {
                        arrayList.add(size2, interfaceC4115);
                        C21334.m48349("Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused7) {
                        size2 = i3;
                        i3 = size2;
                    }
                } catch (ClassNotFoundException unused8) {
                }
                try {
                    try {
                        Class<?> cls4 = Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer");
                        Class<?>[] clsArr4 = new Class[3];
                        clsArr4[c] = Handler.class;
                        clsArr4[1] = InterfaceC7448.class;
                        clsArr4[2] = InterfaceC6777.class;
                        Constructor<?> constructor4 = cls4.getConstructor(clsArr4);
                        Object[] objArr4 = new Object[3];
                        objArr4[c] = handler;
                        objArr4[1] = interfaceC7448;
                        objArr4[2] = c10072M49950;
                        InterfaceC4114 interfaceC4116 = (InterfaceC4114) constructor4.newInstance(objArr4);
                        i4 = i3 + 1;
                        try {
                            arrayList.add(i3, interfaceC4116);
                            C21334.m48349("Loaded LibopusAudioRenderer.");
                        } catch (ClassNotFoundException unused9) {
                            i3 = i4;
                            i4 = i3;
                        }
                    } catch (ClassNotFoundException unused10) {
                    }
                    try {
                        try {
                            Class<?> cls5 = Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer");
                            Class<?>[] clsArr5 = new Class[3];
                            clsArr5[c] = Handler.class;
                            clsArr5[1] = InterfaceC7448.class;
                            clsArr5[2] = InterfaceC6777.class;
                            Constructor<?> constructor5 = cls5.getConstructor(clsArr5);
                            Object[] objArr5 = new Object[3];
                            objArr5[c] = handler;
                            objArr5[1] = interfaceC7448;
                            objArr5[2] = c10072M49950;
                            InterfaceC4114 interfaceC4117 = (InterfaceC4114) constructor5.newInstance(objArr5);
                            i5 = i4 + 1;
                            try {
                                arrayList.add(i4, interfaceC4117);
                                C21334.m48349("Loaded LibflacAudioRenderer.");
                            } catch (ClassNotFoundException unused11) {
                                i4 = i5;
                                i5 = i4;
                            }
                        } catch (Exception e4) {
                            throw new IllegalStateException("Error instantiating FLAC extension", e4);
                        }
                    } catch (ClassNotFoundException unused12) {
                    }
                    try {
                        try {
                            Class[] clsArr6 = new Class[3];
                            clsArr6[c] = Handler.class;
                            clsArr6[1] = InterfaceC7448.class;
                            clsArr6[2] = InterfaceC6777.class;
                            Constructor constructor6 = C8375.class.getConstructor(clsArr6);
                            Object[] objArr6 = new Object[3];
                            objArr6[c] = handler;
                            objArr6[1] = interfaceC7448;
                            objArr6[2] = c10072M49950;
                            InterfaceC4114 interfaceC4118 = (InterfaceC4114) constructor6.newInstance(objArr6);
                            i6 = i5 + 1;
                            try {
                                arrayList.add(i5, interfaceC4118);
                                C21334.m48349("Loaded FfmpegAudioRenderer.");
                            } catch (ClassNotFoundException unused13) {
                                i5 = i6;
                                i6 = i5;
                            }
                        } catch (Exception e5) {
                            throw new IllegalStateException("Error instantiating FFmpeg extension", e5);
                        }
                    } catch (ClassNotFoundException unused14) {
                    }
                    try {
                        try {
                            Class<?> cls6 = Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer");
                            Class<?>[] clsArr7 = new Class[4];
                            clsArr7[c] = Context.class;
                            clsArr7[1] = Handler.class;
                            clsArr7[2] = InterfaceC7448.class;
                            clsArr7[3] = InterfaceC6777.class;
                            Constructor<?> constructor7 = cls6.getConstructor(clsArr7);
                            Object[] objArr7 = new Object[4];
                            objArr7[c] = contextWrapper;
                            objArr7[1] = handler;
                            objArr7[2] = interfaceC7448;
                            objArr7[3] = c10072M49950;
                            InterfaceC4114 interfaceC4119 = (InterfaceC4114) constructor7.newInstance(objArr7);
                            i7 = i6 + 1;
                            try {
                                arrayList.add(i6, interfaceC4119);
                                C21334.m48349("Loaded LibiamfAudioRenderer.");
                            } catch (ClassNotFoundException unused15) {
                                i6 = i7;
                                i7 = i6;
                            }
                        } catch (Exception e6) {
                            throw new IllegalStateException("Error instantiating IAMF extension", e6);
                        }
                    } catch (ClassNotFoundException unused16) {
                    }
                    try {
                        Class<?> cls7 = Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer");
                        Class<?>[] clsArr8 = new Class[3];
                        clsArr8[c] = Handler.class;
                        clsArr8[1] = InterfaceC7448.class;
                        clsArr8[2] = InterfaceC6777.class;
                        Constructor<?> constructor8 = cls7.getConstructor(clsArr8);
                        Object[] objArr8 = new Object[3];
                        objArr8[c] = handler;
                        objArr8[1] = interfaceC7448;
                        objArr8[2] = c10072M49950;
                        arrayList.add(i7, (InterfaceC4114) constructor8.newInstance(objArr8));
                        C21334.m48349("Loaded MpeghAudioRenderer.");
                    } catch (ClassNotFoundException unused17) {
                    } catch (Exception e7) {
                        throw new IllegalStateException("Error instantiating MPEG-H extension", e7);
                    }
                } catch (Exception e8) {
                    throw new IllegalStateException("Error instantiating Opus extension", e8);
                }
            } catch (Exception e9) {
                throw new IllegalStateException("Error instantiating MIDI extension", e9);
            }
        }
        arrayList.add(new C17670(interfaceC10966, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new C7981(interfaceC12005, looper));
        arrayList.add(new C7981(interfaceC12005, looper));
        arrayList.add(new C11323());
        arrayList.add(new C20898(new C24920(contextWrapper)));
        return (InterfaceC4114[]) arrayList.toArray(new InterfaceC4114[0]);
    }

    @Override // p067l.InterfaceC24901
    /* JADX INFO: renamed from: ֫ */
    public final void mo22761(InterfaceC4114 interfaceC4114) {
        interfaceC4114.getClass();
    }
}
