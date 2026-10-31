.class public final Ll/۠᩻ۧ;
.super Ljava/lang/Object;
.source "38NX"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;


# static fields
.field public static final ۨ:[Ljava/lang/String;

.field public static final ܰ:[F

.field public static final ᩺:Ljava/nio/FloatBuffer;


# instance fields
.field public ۗ:Ll/ܺۚ֫;

.field public final ۙ:[I

.field public final ۛ:[I

.field public final ۤ:[I

.field public final ۫:Ll/ܶ᩻ۧ;

.field public ۬:Ll/۬᩸֫;

.field public final ᩶:[I

.field public ᩸:I

.field public final ᩹:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [F

    .line 98
    fill-array-data v0, :array_0

    sput-object v0, Ll/۠᩻ۧ;->ܰ:[F

    const-string v0, "u_tex"

    const-string v1, "v_tex"

    const-string v2, "y_tex"

    .line 124
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/۠᩻ۧ;->ۨ:[Ljava/lang/String;

    const/16 v0, 0x8

    new-array v0, v0, [F

    .line 142
    fill-array-data v0, :array_1

    .line 143
    invoke-static {v0}, Ll/ۘۚ֫;->֫([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    sput-object v0, Ll/۠᩻ۧ;->᩺:Ljava/nio/FloatBuffer;

    return-void

    nop

    :array_0
    .array-data 4
        0x3f94fdf4    # 1.164f
        0x3f94fdf4    # 1.164f
        0x3f94fdf4    # 1.164f
        0x0
        -0x41a5e354    # -0.213f
        0x40072b02    # 2.112f
        0x3fe58106    # 1.793f
        -0x40f78d50    # -0.533f
        0x0
    .end array-data

    :array_1
    .array-data 4
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method

.method public constructor <init>(Ll/ܶ᩻ۧ;)V
    .locals 4

    .line 163
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 164
    iput-object p1, p0, Ll/۠᩻ۧ;->۫:Ll/ܶ᩻ۧ;

    const/4 p1, 0x3

    new-array v0, p1, [I

    .line 165
    iput-object v0, p0, Ll/۠᩻ۧ;->ۛ:[I

    new-array v0, p1, [I

    .line 166
    iput-object v0, p0, Ll/۠᩻ۧ;->ۤ:[I

    new-array v0, p1, [I

    .line 167
    iput-object v0, p0, Ll/۠᩻ۧ;->ۙ:[I

    new-array v0, p1, [I

    .line 168
    iput-object v0, p0, Ll/۠᩻ۧ;->᩶:[I

    .line 169
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ll/۠᩻ۧ;->᩹:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 172
    iget-object v1, p0, Ll/۠᩻ۧ;->ۙ:[I

    iget-object v2, p0, Ll/۠᩻ۧ;->᩶:[I

    const/4 v3, -0x1

    aput v3, v2, v0

    aput v3, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 4

    .line 209
    iget-object p1, p0, Ll/۠᩻ۧ;->᩹:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬᩸֫;

    if-nez p1, :cond_0

    .line 210
    iget-object v1, p0, Ll/۠᩻ۧ;->۬:Ll/۬᩸֫;

    if-nez v1, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_2

    .line 215
    iget-object v1, p0, Ll/۠᩻ۧ;->۬:Ll/۬᩸֫;

    if-eqz v1, :cond_1

    .line 216
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    throw v0

    .line 218
    :cond_1
    iput-object p1, p0, Ll/۠᩻ۧ;->۬:Ll/۬᩸֫;

    .line 221
    :cond_2
    iget-object p1, p0, Ll/۠᩻ۧ;->۬:Ll/۬᩸֫;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    iget p1, p0, Ll/۠᩻ۧ;->᩸:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    sget-object v3, Ll/۠᩻ۧ;->ܰ:[F

    invoke-static {p1, v1, v2, v3, v2}, Landroid/opengl/GLES20;->glUniformMatrix3fv(IIZ[FI)V

    .line 155
    throw v0
.end method

.method public final onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 0

    const/4 p1, 0x0

    .line 202
    invoke-static {p1, p1, p2, p3}, Landroid/opengl/GLES20;->glViewport(IIII)V

    return-void
.end method

.method public final onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 7

    .line 179
    iget-object p1, p0, Ll/۠᩻ۧ;->ۤ:[I

    :try_start_0
    new-instance p2, Ll/ܺۚ֫;

    const-string v0, "varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n"

    const-string v1, "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n"

    invoke-direct {p2, v0, v1}, Ll/ܺۚ֫;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p2, p0, Ll/۠᩻ۧ;->ۗ:Ll/ܺۚ֫;

    const-string v0, "in_pos"

    .line 180
    invoke-virtual {p2, v0}, Ll/ܺۚ֫;->֫(Ljava/lang/String;)I

    move-result v1

    .line 181
    sget-object v6, Ll/۠᩻ۧ;->᩺:Ljava/nio/FloatBuffer;

    const/4 v2, 0x2

    const/16 v3, 0x1406

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v6}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 188
    iget-object p2, p0, Ll/۠᩻ۧ;->ۗ:Ll/ܺۚ֫;

    const-string v0, "in_tc_y"

    invoke-virtual {p2, v0}, Ll/ܺۚ֫;->֫(Ljava/lang/String;)I

    move-result p2

    const/4 v0, 0x0

    aput p2, p1, v0

    .line 189
    iget-object p2, p0, Ll/۠᩻ۧ;->ۗ:Ll/ܺۚ֫;

    const-string v1, "in_tc_u"

    invoke-virtual {p2, v1}, Ll/ܺۚ֫;->֫(Ljava/lang/String;)I

    move-result p2

    const/4 v1, 0x1

    aput p2, p1, v1

    .line 190
    iget-object p2, p0, Ll/۠᩻ۧ;->ۗ:Ll/ܺۚ֫;

    const-string v1, "in_tc_v"

    invoke-virtual {p2, v1}, Ll/ܺۚ֫;->֫(Ljava/lang/String;)I

    move-result p2

    const/4 v1, 0x2

    aput p2, p1, v1

    .line 191
    iget-object p1, p0, Ll/۠᩻ۧ;->ۗ:Ll/ܺۚ֫;

    const-string p2, "mColorConversion"

    invoke-virtual {p1, p2}, Ll/ܺۚ֫;->ۧ(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/۠᩻ۧ;->᩸:I

    .line 192
    invoke-static {}, Ll/ۘۚ֫;->֫()V

    .line 315
    iget-object p1, p0, Ll/۠᩻ۧ;->ۛ:[I
    :try_end_0
    .catch Ll/ۖۚ֫; {:try_start_0 .. :try_end_0} :catch_1

    const/4 p2, 0x3

    :try_start_1
    invoke-static {p2, p1, v0}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    :goto_0
    if-ge v0, p2, :cond_0

    .line 317
    iget-object v1, p0, Ll/۠᩻ۧ;->ۗ:Ll/ܺۚ֫;

    sget-object v2, Ll/۠᩻ۧ;->ۨ:[Ljava/lang/String;

    aget-object v2, v2, v0

    invoke-virtual {v1, v2}, Ll/ܺۚ֫;->ۧ(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glUniform1i(II)V

    const v1, 0x84c0

    add-int/2addr v1, v0

    .line 318
    invoke-static {v1}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 319
    aget v1, p1, v0

    const/16 v2, 0xde1

    invoke-static {v2, v1}, Ll/ۘۚ֫;->֫(II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 321
    :cond_0
    invoke-static {}, Ll/ۘۚ֫;->֫()V
    :try_end_1
    .catch Ll/ۖۚ֫; {:try_start_1 .. :try_end_1} :catch_0

    .line 194
    :catch_0
    :try_start_2
    invoke-static {}, Ll/ۘۚ֫;->֫()V
    :try_end_2
    .catch Ll/ۖۚ֫; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    return-void
.end method

.method public final ֫(Ll/۬᩸֫;)V
    .locals 1

    .line 303
    iget-object v0, p0, Ll/۠᩻ۧ;->᩹:Ljava/util/concurrent/atomic/AtomicReference;

    .line 304
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬᩸֫;

    if-nez p1, :cond_0

    .line 309
    iget-object p1, p0, Ll/۠᩻ۧ;->۫:Ll/ܶ᩻ۧ;

    invoke-virtual {p1}, Landroid/opengl/GLSurfaceView;->requestRender()V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 81
    throw p1
.end method
