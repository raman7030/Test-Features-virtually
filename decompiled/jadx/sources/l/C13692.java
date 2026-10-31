package l;

import android.content.res.AssetManager;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.github.luben.zstd.RecyclingBufferPool;
import com.github.luben.zstd.ZstdInputStreamNoFinalizer;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import org.bouncycastle.i18n.ErrorBundle;

/* JADX INFO: renamed from: l.ܰ۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6WA */
/* JADX INFO: loaded from: classes3.dex */
public final class C13692 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f40848;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f40849;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f40852;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f40854;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f40856;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f40860;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f40861;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f40862;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f40863;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f40864;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f40865;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f40869;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f40873;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f40875;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f40878;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f40879;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f40850 = new ArrayList();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int[] f40868 = new int[2];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f40872 = new int[2];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f40870 = new int[2];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float[][] f40867 = {new float[16], new float[16]};

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float[][] f40871 = {new float[16], new float[16]};

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final float[] f40858 = new float[16];

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final float[] f40859 = new float[16];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float[] f40866 = new float[16];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float[] f40876 = new float[16];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float[] f40877 = new float[4];

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int[] f40874 = new int[1];

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int[] f40853 = new int[1];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f40851 = new int[1];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f40855 = new int[1];

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f40857 = Float.POSITIVE_INFINITY;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f40880 = Float.NEGATIVE_INFINITY;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32941(AssetManager assetManager, int i, boolean z) throws IOException {
        float[] fArr = this.f40877;
        fArr[0] = ((i >> 16) & 255) / 255.0f;
        fArr[1] = ((i >> 8) & 255) / 255.0f;
        fArr[2] = (i & 255) / 255.0f;
        fArr[3] = z ? 0.15f : 0.0f;
        this.f40860 = m32937("attribute vec3 aPosition,aNormal,aColor; uniform mat4 uMvp,uModel,uLight0,uLight1;varying vec3 vNormal,vColor; varying vec4 vLight0,vLight1;void main(){vec4 p=vec4(aPosition/256.0,1.0);gl_Position=uMvp*p;vNormal=mat3(uModel)*aNormal;vColor=aColor;vLight0=uLight0*p;vLight1=uLight1*p;}", "precision mediump float; varying vec3 vNormal,vColor; varying vec4 vLight0,vLight1;uniform sampler2D uShadow0,uShadow1;uniform bool uHasShadows;uniform vec4 uTheme;float visibility(sampler2D tex,vec4 p){if(!uHasShadows)return 1.0;vec3 q=p.xyz/p.w*0.5+0.5;if(q.x<0.0||q.x>1.0||q.y<0.0||q.y>1.0||q.z>1.0)return 1.0;float s=0.0;for(int x=-1;x<=1;x++){for(int y=-1;y<=1;y++){vec2 d=texture2D(tex,q.xy+vec2(float(x),float(y))/512.0).rg;s+=step(q.z-0.0007,d.x+d.y/255.0);}}return 0.3+0.7*s/9.0;}void main(){vec3 n=normalize(vNormal);if(!gl_FrontFacing)n=-n;float a=max(0.0,dot(n,normalize(vec3(-4.0,7.0,9.0))));float b=max(0.0,dot(n,normalize(vec3(1.0,4.0,-7.0))));float light=0.70+0.60*a*visibility(uShadow0,vLight0)+0.50*b*visibility(uShadow1,vLight1);vec3 color=pow(pow(mix(vColor,uTheme.rgb,uTheme.a),vec3(2.2))*light,vec3(1.0/2.2));gl_FragColor=vec4(color,1.0);}");
        this.f40862 = m32937("attribute vec3 aPosition;uniform mat4 uMvp;void main(){gl_Position=uMvp*vec4(aPosition/256.0,1.0);}", "precision mediump float;void main(){vec2 d=fract(gl_FragCoord.z*vec2(1.0,255.0));d.x-=d.y/255.0;gl_FragColor=vec4(d,0.0,1.0);}");
        int iM32937 = m32937("attribute vec2 aPosition;varying vec2 vUv;void main(){vUv=aPosition*0.5+0.5;gl_Position=vec4(aPosition,0.0,1.0);}", "precision mediump float;varying vec2 vUv;uniform sampler2D uImage;void main(){gl_FragColor=texture2D(uImage,vUv);}");
        this.f40869 = iM32937;
        this.f40854 = GLES20.glGetUniformLocation(iM32937, "uImage");
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}).position(0);
        int[] iArr = this.f40855;
        GLES20.glGenBuffers(1, iArr, 0);
        GLES20.glBindBuffer(34962, iArr[0]);
        GLES20.glBufferData(34962, 32, floatBufferAsFloatBuffer, 35044);
        GLES20.glGenTextures(1, this.f40874, 0);
        GLES20.glGenFramebuffers(1, this.f40853, 0);
        GLES20.glGenRenderbuffers(1, this.f40851, 0);
        this.f40861 = GLES20.glGetUniformLocation(this.f40860, "uMvp");
        this.f40864 = GLES20.glGetUniformLocation(this.f40860, "uModel");
        this.f40852 = GLES20.glGetUniformLocation(this.f40860, "uLight0");
        this.f40865 = GLES20.glGetUniformLocation(this.f40860, "uLight1");
        this.f40856 = GLES20.glGetUniformLocation(this.f40860, "uShadow0");
        this.f40863 = GLES20.glGetUniformLocation(this.f40860, "uShadow1");
        this.f40878 = GLES20.glGetUniformLocation(this.f40862, "uMvp");
        this.f40875 = GLES20.glGetUniformLocation(this.f40860, "uHasShadows");
        this.f40879 = GLES20.glGetUniformLocation(this.f40860, "uTheme");
        m32938(assetManager, "folder", true);
        m32938(assetManager, ErrorBundle.DETAIL_ENTRY, false);
        m32938(assetManager, "variant", false);
        if (this.f40880 <= this.f40857) {
            throw new IllegalStateException("Empty logo bounds");
        }
        Matrix.setLookAtM(this.f40866, 0, 0.0f, 0.0f, 13.5f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr2 = new float[16];
        float[] fArr3 = new float[16];
        Matrix.orthoM(fArr3, 0, -4.0f, 4.0f, -4.0f, 4.0f, 1.0f, 24.0f);
        Matrix.setLookAtM(fArr2, 0, -4.0f, 7.0f, 9.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[][] fArr4 = this.f40867;
        Matrix.multiplyMM(fArr4[0], 0, fArr3, 0, fArr2, 0);
        Matrix.setLookAtM(fArr2, 0, 1.0f, 4.0f, -7.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(fArr4[1], 0, fArr3, 0, fArr2, 0);
        int[] iArr2 = this.f40868;
        GLES20.glGenTextures(2, iArr2, 0);
        int[] iArr3 = this.f40872;
        GLES20.glGenFramebuffers(2, iArr3, 0);
        int[] iArr4 = this.f40870;
        GLES20.glGenRenderbuffers(2, iArr4, 0);
        boolean z2 = true;
        for (int i2 = 0; i2 < 2; i2++) {
            GLES20.glBindTexture(3553, iArr2[i2]);
            GLES20.glTexImage2D(3553, 0, 6408, 512, 512, 0, 6408, 5121, null);
            GLES20.glTexParameteri(3553, 10241, 9728);
            GLES20.glTexParameteri(3553, 10240, 9728);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glBindRenderbuffer(36161, iArr4[i2]);
            GLES20.glRenderbufferStorage(36161, 33189, 512, 512);
            GLES20.glBindFramebuffer(36160, iArr3[i2]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[i2], 0);
            GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, iArr4[i2]);
            z2 &= GLES20.glCheckFramebufferStatus(36160) == 36053;
        }
        GLES20.glBindFramebuffer(36160, 0);
        this.f40849 = z2;
        GLES20.glUseProgram(this.f40860);
        GLES20.glUniform1i(this.f40875, this.f40849 ? 1 : 0);
        GLES20.glUniform1i(this.f40856, 0);
        GLES20.glUniform1i(this.f40863, 1);
        GLES20.glUseProgram(this.f40869);
        GLES20.glUniform1i(this.f40854, 0);
        GLES20.glEnable(2929);
        GLES20.glDepthFunc(515);
        GLES20.glDisable(2884);
        GLES20.glDisable(3042);
        GLES20.glDisable(3024);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32938(AssetManager assetManager, String str, boolean z) throws IOException {
        InputStream inputStreamOpen = assetManager.open(str.concat(".bin"));
        try {
            ZstdInputStreamNoFinalizer zstdInputStreamNoFinalizer = new ZstdInputStreamNoFinalizer(inputStreamOpen, RecyclingBufferPool.INSTANCE);
            try {
                ArrayList<C11577> arrayListM28464 = C11577.m28464(new C12951(zstdInputStreamNoFinalizer));
                zstdInputStreamNoFinalizer.close();
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                for (C11577 c11577 : arrayListM28464) {
                    int[] iArr = new int[2];
                    GLES20.glGenBuffers(2, iArr, 0);
                    int i = iArr[0];
                    int i2 = iArr[1];
                    int i3 = c11577.f34516;
                    ByteBuffer byteBuffer = c11577.f34517;
                    ByteBuffer byteBuffer2 = c11577.f34519;
                    this.f40850.add(new int[]{i, i2, i3, z ? 1 : 0});
                    GLES20.glBindBuffer(34962, iArr[0]);
                    GLES20.glBufferData(34962, byteBuffer2.capacity(), byteBuffer2, 35044);
                    GLES20.glBindBuffer(34963, iArr[1]);
                    GLES20.glBufferData(34963, byteBuffer.capacity(), byteBuffer, 35044);
                    this.f40857 = Math.min(this.f40857, c11577.f34520);
                    this.f40880 = Math.max(this.f40880, c11577.f34518);
                }
            } catch (Throwable th) {
                try {
                    zstdInputStreamNoFinalizer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32940(int i, int i2, float f, float[] fArr) {
        float[][] fArr2;
        int i3;
        int i4;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        int i5 = i * 2;
        int i6 = i2 * 2;
        int i7 = this.f40848;
        int[] iArr = this.f40853;
        int[] iArr2 = this.f40874;
        if (i7 != i5 || this.f40873 != i6) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr2[0]);
            GLES20.glTexImage2D(3553, 0, 6408, i5, i6, 0, 6408, 5121, null);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            int[] iArr3 = this.f40851;
            GLES20.glBindRenderbuffer(36161, iArr3[0]);
            GLES20.glRenderbufferStorage(36161, 33189, i5, i6);
            GLES20.glBindFramebuffer(36160, iArr[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr2[0], 0);
            GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, iArr3[0]);
            if (GLES20.glCheckFramebufferStatus(36160) != 36053) {
                throw new IllegalStateException("Incomplete logo antialias framebuffer");
            }
            this.f40848 = i5;
            this.f40873 = i6;
        }
        int i8 = 0;
        while (true) {
            fArr2 = this.f40871;
            if (i8 >= 2) {
                break;
            }
            Matrix.multiplyMM(fArr2[i8], 0, this.f40867[i8], 0, fArr, 0);
            i8++;
        }
        if (this.f40849) {
            GLES20.glUseProgram(this.f40862);
            GLES20.glDisableVertexAttribArray(1);
            GLES20.glDisableVertexAttribArray(2);
            i3 = 0;
            GLES20.glViewport(0, 0, 512, 512);
            GLES20.glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
            int i9 = 0;
            while (true) {
                i4 = 16640;
                if (i9 >= 2) {
                    break;
                }
                GLES20.glBindFramebuffer(36160, this.f40872[i9]);
                GLES20.glClear(16640);
                GLES20.glUniformMatrix4fv(this.f40878, 1, false, fArr2[i9], 0);
                m32939(false);
                i9++;
            }
        } else {
            i3 = 0;
            i4 = 16640;
        }
        GLES20.glBindFramebuffer(36160, iArr[i3]);
        GLES20.glViewport(i3, i3, i5, i6);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(i4);
        float f2 = this.f40880;
        float f3 = this.f40857;
        float f4 = (f2 - f3) / ((f * 2.0f) * 0.9515277f);
        float f5 = (i5 * f4) / i6;
        float f6 = (f2 + f3) / 2.0f;
        Matrix.orthoM(this.f40859, 0, -f5, f5, f6 - f4, f6 + f4, 0.1f, 30.0f);
        Matrix.multiplyMM(this.f40858, 0, this.f40866, 0, fArr, 0);
        Matrix.multiplyMM(this.f40876, 0, this.f40859, 0, this.f40858, 0);
        GLES20.glUseProgram(this.f40860);
        GLES20.glUniformMatrix4fv(this.f40861, 1, false, this.f40876, 0);
        GLES20.glUniformMatrix4fv(this.f40864, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(this.f40852, 1, false, fArr2[0], 0);
        GLES20.glUniformMatrix4fv(this.f40865, 1, false, fArr2[1], 0);
        for (int i10 = 0; i10 < 2; i10++) {
            GLES20.glActiveTexture(i10 + 33984);
            GLES20.glBindTexture(3553, this.f40868[i10]);
        }
        m32939(true);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glDisable(2929);
        GLES20.glUseProgram(this.f40869);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr2[0]);
        GLES20.glBindBuffer(34962, this.f40855[0]);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glDisableVertexAttribArray(1);
        GLES20.glDisableVertexAttribArray(2);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 0, 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glEnable(2929);
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            throw new IllegalStateException(C19370.m44628(iGlGetError, "Logo GL error: "));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32939(boolean z) {
        GLES20.glEnableVertexAttribArray(0);
        if (z) {
            GLES20.glEnableVertexAttribArray(1);
            GLES20.glEnableVertexAttribArray(2);
        }
        for (int[] iArr : this.f40850) {
            GLES20.glBindBuffer(34962, iArr[0]);
            GLES20.glBindBuffer(34963, iArr[1]);
            GLES20.glVertexAttribPointer(0, 3, 5122, false, 12, 0);
            if (z) {
                GLES20.glVertexAttribPointer(1, 3, 5120, true, 12, 6);
                GLES20.glVertexAttribPointer(2, 3, 5121, true, 12, 9);
                int i = this.f40879;
                float[] fArr = this.f40877;
                GLES20.glUniform4f(i, fArr[0], fArr[1], fArr[2], iArr[3] == 1 ? fArr[3] : 0.0f);
            }
            GLES20.glDrawElements(4, iArr[2], 5123, 0);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32936(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException(strGlGetShaderInfoLog);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32937(String str, String str2) {
        int iM32936 = m32936(35633, str);
        int iM32937 = m32936(35632, str2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iM32936);
        GLES20.glAttachShader(iGlCreateProgram, iM32937);
        GLES20.glBindAttribLocation(iGlCreateProgram, 0, "aPosition");
        GLES20.glBindAttribLocation(iGlCreateProgram, 1, "aNormal");
        GLES20.glBindAttribLocation(iGlCreateProgram, 2, "aColor");
        GLES20.glLinkProgram(iGlCreateProgram);
        GLES20.glDeleteShader(iM32936);
        GLES20.glDeleteShader(iM32937);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateProgram;
        }
        throw new IllegalStateException(GLES20.glGetProgramInfoLog(iGlCreateProgram));
    }
}
