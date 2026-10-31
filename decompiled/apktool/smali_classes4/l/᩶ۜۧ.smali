.class public final Ll/᩶ۜۧ;
.super Landroid/opengl/GLSurfaceView;
.source "M8S0"


# static fields
.field public static final synthetic ܰ:I


# instance fields
.field public final ۗ:Landroid/hardware/Sensor;

.field public final ۙ:Ll/ۖۜۧ;

.field public ۛ:Landroid/graphics/SurfaceTexture;

.field public ۤ:Landroid/view/Surface;

.field public ۨ:Z

.field public final ۫:Landroid/hardware/SensorManager;

.field public final ۬:Ll/ܶۜۧ;

.field public final ᩶:Landroid/os/Handler;

.field public ᩸:Z

.field public ᩹:Z

.field public final ᩺:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 94
    invoke-direct {p0, p1, v0}, Ll/᩶ۜۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 98
    invoke-direct {p0, p1, p2}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 99
    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p2, p0, Ll/᩶ۜۧ;->᩺:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 100
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Ll/᩶ۜۧ;->᩶:Landroid/os/Handler;

    const-string p2, "sensor"

    .line 104
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    check-cast p2, Landroid/hardware/SensorManager;

    iput-object p2, p0, Ll/᩶ۜۧ;->۫:Landroid/hardware/SensorManager;

    const/16 v0, 0xf

    .line 110
    invoke-virtual {p2, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    if-nez v0, :cond_0

    const/16 v0, 0xb

    .line 112
    invoke-virtual {p2, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    .line 114
    :cond_0
    iput-object v0, p0, Ll/᩶ۜۧ;->ۗ:Landroid/hardware/Sensor;

    .line 116
    new-instance p2, Ll/ܶۜۧ;

    invoke-direct {p2}, Ll/ܶۜۧ;-><init>()V

    iput-object p2, p0, Ll/᩶ۜۧ;->۬:Ll/ܶۜۧ;

    .line 117
    new-instance v0, Ll/᩸ۜۧ;

    invoke-direct {v0, p0, p2}, Ll/᩸ۜۧ;-><init>(Ll/᩶ۜۧ;Ll/ܶۜۧ;)V

    .line 119
    new-instance p2, Ll/ۗۜۧ;

    invoke-direct {p2, p1, v0}, Ll/ۗۜۧ;-><init>(Landroid/content/Context;Ll/ۙۜۧ;)V

    const-string v1, "window"

    .line 120
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    .line 122
    new-instance v1, Ll/ۖۜۧ;

    const/4 v2, 0x2

    new-array v3, v2, [Ll/ܺۜۧ;

    const/4 v4, 0x0

    aput-object p2, v3, v4

    const/4 v4, 0x1

    aput-object v0, v3, v4

    invoke-direct {v1, p1, v3}, Ll/ۖۜۧ;-><init>(Landroid/view/Display;[Ll/ܺۜۧ;)V

    iput-object v1, p0, Ll/᩶ۜۧ;->ۙ:Ll/ۖۜۧ;

    .line 123
    iput-boolean v4, p0, Ll/᩶ۜۧ;->ۨ:Z

    .line 125
    invoke-virtual {p0, v2}, Landroid/opengl/GLSurfaceView;->setEGLContextClientVersion(I)V

    .line 126
    invoke-virtual {p0, v0}, Landroid/opengl/GLSurfaceView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    .line 127
    invoke-virtual {p0, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public static ֫(Ll/᩶ۜۧ;)V
    .locals 3

    .line 205
    iget-object v0, p0, Ll/᩶ۜۧ;->ۤ:Landroid/view/Surface;

    if-eqz v0, :cond_0

    .line 207
    iget-object v1, p0, Ll/᩶ۜۧ;->᩺:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ۜۧ;

    .line 208
    invoke-interface {v2}, Ll/᩹ۜۧ;->ۧ()V

    goto :goto_0

    .line 211
    :cond_0
    iget-object v1, p0, Ll/᩶ۜۧ;->ۛ:Landroid/graphics/SurfaceTexture;

    if-eqz v1, :cond_1

    .line 250
    invoke-virtual {v1}, Landroid/graphics/SurfaceTexture;->release()V

    :cond_1
    if-eqz v0, :cond_2

    .line 253
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    :cond_2
    const/4 v0, 0x0

    .line 212
    iput-object v0, p0, Ll/᩶ۜۧ;->ۛ:Landroid/graphics/SurfaceTexture;

    .line 213
    iput-object v0, p0, Ll/᩶ۜۧ;->ۤ:Landroid/view/Surface;

    return-void
.end method

.method public static ֫(Ll/᩶ۜۧ;Landroid/graphics/SurfaceTexture;)V
    .locals 3

    .line 235
    iget-object v0, p0, Ll/᩶ۜۧ;->ۛ:Landroid/graphics/SurfaceTexture;

    .line 236
    iget-object v1, p0, Ll/᩶ۜۧ;->ۤ:Landroid/view/Surface;

    .line 237
    new-instance v2, Landroid/view/Surface;

    invoke-direct {v2, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 238
    iput-object p1, p0, Ll/᩶ۜۧ;->ۛ:Landroid/graphics/SurfaceTexture;

    .line 239
    iput-object v2, p0, Ll/᩶ۜۧ;->ۤ:Landroid/view/Surface;

    .line 240
    iget-object p0, p0, Ll/᩶ۜۧ;->᩺:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹ۜۧ;

    .line 241
    invoke-interface {p1, v2}, Ll/᩹ۜۧ;->֫(Landroid/view/Surface;)V

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    .line 250
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    :cond_1
    if-eqz v1, :cond_2

    .line 253
    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    :cond_2
    return-void
.end method

.method public static ۧ(Ll/᩶ۜۧ;Landroid/graphics/SurfaceTexture;)V
    .locals 3

    .line 233
    iget-object v0, p0, Ll/᩶ۜۧ;->᩶:Landroid/os/Handler;

    new-instance v1, Ll/ܳ֨ۡ;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0, p1}, Ll/ܳ֨ۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private ᩳ()V
    .locals 5

    .line 218
    iget-boolean v0, p0, Ll/᩶ۜۧ;->ۨ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/᩶ۜۧ;->᩹:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 219
    :goto_0
    iget-object v2, p0, Ll/᩶ۜۧ;->ۗ:Landroid/hardware/Sensor;

    if-eqz v2, :cond_3

    iget-boolean v3, p0, Ll/᩶ۜۧ;->᩸:Z

    if-ne v0, v3, :cond_1

    goto :goto_2

    .line 222
    :cond_1
    iget-object v3, p0, Ll/᩶ۜۧ;->ۙ:Ll/ۖۜۧ;

    iget-object v4, p0, Ll/᩶ۜۧ;->۫:Landroid/hardware/SensorManager;

    if-eqz v0, :cond_2

    .line 223
    invoke-virtual {v4, v3, v2, v1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    goto :goto_1

    .line 226
    :cond_2
    invoke-virtual {v4, v3}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 228
    :goto_1
    iput-boolean v0, p0, Ll/᩶ۜۧ;->᩸:Z

    :cond_3
    :goto_2
    return-void
.end method


# virtual methods
.method public final onDetachedFromWindow()V
    .locals 2

    .line 200
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onDetachedFromWindow()V

    .line 203
    new-instance v0, Ll/ᩴ᩷ܳ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/ᩴ᩷ܳ;-><init>(ILjava/lang/Object;)V

    iget-object v1, p0, Ll/᩶ۜۧ;->᩶:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onPause()V
    .locals 1

    const/4 v0, 0x0

    .line 192
    iput-boolean v0, p0, Ll/᩶ۜۧ;->᩹:Z

    .line 193
    invoke-direct {p0}, Ll/᩶ۜۧ;->ᩳ()V

    .line 194
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onPause()V

    return-void
.end method

.method public final onResume()V
    .locals 1

    .line 185
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onResume()V

    const/4 v0, 0x1

    .line 186
    iput-boolean v0, p0, Ll/᩶ۜۧ;->᩹:Z

    .line 187
    invoke-direct {p0}, Ll/᩶ۜۧ;->ᩳ()V

    return-void
.end method

.method public final ֫()Ll/᩷ۜۧ;
    .locals 1

    .line 164
    iget-object v0, p0, Ll/᩶ۜۧ;->۬:Ll/ܶۜۧ;

    return-object v0
.end method

.method public final ֫(Ll/᩹ۜۧ;)V
    .locals 1

    .line 136
    iget-object v0, p0, Ll/᩶ۜۧ;->᩺:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ()Ll/᩹᩻ۧ;
    .locals 1

    .line 159
    iget-object v0, p0, Ll/᩶ۜۧ;->۬:Ll/ܶۜۧ;

    return-object v0
.end method

.method public final ۧ(Ll/᩹ۜۧ;)V
    .locals 1

    .line 145
    iget-object v0, p0, Ll/᩶ۜۧ;->᩺:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܽ()Landroid/view/Surface;
    .locals 1

    .line 154
    iget-object v0, p0, Ll/᩶ۜۧ;->ۤ:Landroid/view/Surface;

    return-object v0
.end method
