.class public Ll/֫ۖܽ;
.super Ll/ۧۖܽ;
.source "YAJX"


# instance fields
.field public ֫:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 16
    invoke-direct {p0}, Ll/ۧۖܽ;-><init>()V

    const-wide/16 v0, -0x1

    .line 14
    iput-wide v0, p0, Ll/֫ۖܽ;->֫:J

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 p1, 0x1

    .line 13
    invoke-direct {p0, p1}, Landroid/graphics/Paint;-><init>(I)V

    const-wide/16 v0, -0x1

    .line 14
    iput-wide v0, p0, Ll/֫ۖܽ;->֫:J

    return-void
.end method

.method public constructor <init>(Ll/֫ۖܽ;)V
    .locals 2

    .line 17
    invoke-direct {p0, p1}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    const-wide/16 v0, -0x1

    .line 14
    iput-wide v0, p0, Ll/֫ۖܽ;->֫:J

    return-void
.end method


# virtual methods
.method public declared-synchronized getNativeInstance()J
    .locals 6
    .annotation build Ll/ۙᩳ;
    .end annotation

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 30
    :try_start_0
    iget-wide v1, p0, Ll/֫ۖܽ;->֫:J

    const-wide/16 v3, -0x1

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    .line 32
    invoke-super {p0}, Ll/ۧۖܽ;->getNativeInstance()J

    move-result-wide v1

    iput-wide v1, p0, Ll/֫ۖܽ;->֫:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    :cond_0
    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final reset()V
    .locals 2

    .line 39
    invoke-super {p0}, Landroid/graphics/Paint;->reset()V

    const-wide/16 v0, -0x1

    .line 40
    iput-wide v0, p0, Ll/֫ۖܽ;->֫:J

    return-void
.end method

.method public final set(Landroid/graphics/Paint;)V
    .locals 2

    .line 45
    invoke-super {p0, p1}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    const-wide/16 v0, -0x1

    .line 46
    iput-wide v0, p0, Ll/֫ۖܽ;->֫:J

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
    .locals 2

    .line 58
    invoke-super {p0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    move-result-object p1

    const-wide/16 v0, -0x1

    .line 59
    iput-wide v0, p0, Ll/֫ۖܽ;->֫:J

    return-object p1
.end method

.method public final setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;
    .locals 2

    .line 51
    invoke-super {p0, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    move-result-object p1

    const-wide/16 v0, -0x1

    .line 52
    iput-wide v0, p0, Ll/֫ۖܽ;->֫:J

    return-object p1
.end method

.method public final setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
    .locals 2

    .line 65
    invoke-super {p0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    move-result-object p1

    const-wide/16 v0, -0x1

    .line 66
    iput-wide v0, p0, Ll/֫ۖܽ;->֫:J

    return-object p1
.end method
