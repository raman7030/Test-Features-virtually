.class public Ll/֫ۢ֨;
.super Landroid/graphics/drawable/Drawable;
.source "P5QW"

# interfaces
.implements Landroid/graphics/drawable/Animatable;
.implements Landroid/widget/MediaController$MediaPlayerControl;


# static fields
.field public static final synthetic ܳ֫:I


# instance fields
.field public ֫֫:I

.field public final ۗ:Z

.field public final ۙ:Ll/ۗۢ֨;

.field public ۛ:J

.field public ۟:I

.field public final ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

.field public final ۧ֫:Landroid/graphics/Rect;

.field public final ۨ:Landroid/graphics/Paint;

.field public final ۫:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field public volatile ۬:Z

.field public ܰ:Ljava/util/concurrent/ScheduledFuture;

.field public ܽ֫:Landroid/content/res/ColorStateList;

.field public ܿ֫:Landroid/graphics/PorterDuff$Mode;

.field public ᩳ֫:Landroid/graphics/PorterDuffColorFilter;

.field public final ᩶:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public final ᩸:Landroid/graphics/Bitmap;

.field public final ᩹:Landroid/graphics/Rect;

.field public final ᩺:Ll/ۤۢ֨;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;Landroid/net/Uri;)V
    .locals 2

    .line 209
    sget v0, Lpl/droidsonroids/gif/GifInfoHandle;->ۧ:I

    const-string v0, "file"

    .line 99
    invoke-virtual {p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    new-instance p1, Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {p2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lpl/droidsonroids/gif/GifInfoHandle;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "r"

    .line 102
    invoke-virtual {p1, p2, v0}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 106
    new-instance p2, Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-direct {p2, p1}, Lpl/droidsonroids/gif/GifInfoHandle;-><init>(Landroid/content/res/AssetFileDescriptor;)V

    move-object p1, p2

    :goto_0
    const/4 p2, 0x1

    const/4 v0, 0x0

    .line 209
    invoke-direct {p0, p1, v0, p2}, Ll/֫ۢ֨;-><init>(Lpl/droidsonroids/gif/GifInfoHandle;Ljava/util/concurrent/ScheduledThreadPoolExecutor;Z)V

    return-void

    .line 104
    :cond_1
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Could not open AssetFileDescriptor for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Landroid/content/res/Resources;I)V
    .locals 3

    .line 96
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->openRawResourceFd(I)Landroid/content/res/AssetFileDescriptor;

    move-result-object v0

    .line 161
    new-instance v1, Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-direct {v1, v0}, Lpl/droidsonroids/gif/GifInfoHandle;-><init>(Landroid/content/res/AssetFileDescriptor;)V

    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v1, v0, v2}, Ll/֫ۢ֨;-><init>(Lpl/droidsonroids/gif/GifInfoHandle;Ljava/util/concurrent/ScheduledThreadPoolExecutor;Z)V

    .line 97
    sget-object v0, Ll/۠ۢ֨;->֫:Ljava/util/List;

    .line 82
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 83
    invoke-virtual {p1, p2, v0, v2}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 84
    iget p2, v0, Landroid/util/TypedValue;->density:I

    if-nez p2, :cond_0

    const/16 p2, 0xa0

    goto :goto_0

    :cond_0
    const v0, 0xffff

    if-eq p2, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 93
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    if-lez p2, :cond_2

    if-lez p1, :cond_2

    int-to-float p1, p1

    int-to-float p2, p2

    div-float/2addr p1, p2

    goto :goto_1

    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 98
    :goto_1
    iget-object p2, p0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {p2}, Lpl/droidsonroids/gif/GifInfoHandle;->ܳ()I

    move-result p2

    int-to-float p2, p2

    mul-float p2, p2, p1

    float-to-int p2, p2

    iput p2, p0, Ll/֫ۢ֨;->۟:I

    .line 99
    iget-object p2, p0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {p2}, Lpl/droidsonroids/gif/GifInfoHandle;->ܺ()I

    move-result p2

    int-to-float p2, p2

    mul-float p2, p2, p1

    float-to-int p1, p2

    iput p1, p0, Ll/֫ۢ֨;->֫֫:I

    return-void
.end method

.method public constructor <init>(Lpl/droidsonroids/gif/GifInfoHandle;Ljava/util/concurrent/ScheduledThreadPoolExecutor;Z)V
    .locals 3

    .line 231
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/4 v0, 0x1

    .line 59
    iput-boolean v0, p0, Ll/֫ۢ֨;->۬:Z

    const-wide/high16 v1, -0x8000000000000000L

    .line 60
    iput-wide v1, p0, Ll/֫ۢ֨;->ۛ:J

    .line 62
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Ll/֫ۢ֨;->᩹:Landroid/graphics/Rect;

    .line 66
    new-instance v1, Landroid/graphics/Paint;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v1, p0, Ll/֫ۢ֨;->ۨ:Landroid/graphics/Paint;

    .line 72
    new-instance v1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v1, p0, Ll/֫ۢ֨;->۫:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 79
    new-instance v1, Ll/ۤۢ֨;

    .line 12
    invoke-direct {v1, p0}, Ll/ۛۢ֨;-><init>(Ll/֫ۢ֨;)V

    .line 79
    iput-object v1, p0, Ll/֫ۢ֨;->᩺:Ll/ۤۢ֨;

    .line 232
    iput-boolean p3, p0, Ll/֫ۢ֨;->ۗ:Z

    if-eqz p2, :cond_0

    goto :goto_0

    .line 233
    :cond_0
    sget p2, Ll/ۢۢ֨;->᩸:I

    .line 17
    invoke-static {}, Ll/᩷ۢ֨;->֫()Ll/ۢۢ֨;

    move-result-object p2

    .line 233
    :goto_0
    iput-object p2, p0, Ll/֫ۢ֨;->᩶:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 234
    iput-object p1, p0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    .line 249
    invoke-virtual {p1}, Lpl/droidsonroids/gif/GifInfoHandle;->ܺ()I

    move-result p2

    invoke-virtual {p1}, Lpl/droidsonroids/gif/GifInfoHandle;->ܳ()I

    move-result p3

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p2, p3, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p2

    iput-object p2, p0, Ll/֫ۢ֨;->᩸:Landroid/graphics/Bitmap;

    .line 253
    invoke-virtual {p1}, Lpl/droidsonroids/gif/GifInfoHandle;->ۘ()Z

    move-result p3

    xor-int/2addr p3, v0

    invoke-virtual {p2, p3}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    .line 254
    new-instance p2, Landroid/graphics/Rect;

    invoke-virtual {p1}, Lpl/droidsonroids/gif/GifInfoHandle;->ܺ()I

    move-result p3

    invoke-virtual {p1}, Lpl/droidsonroids/gif/GifInfoHandle;->ܳ()I

    move-result v0

    const/4 v2, 0x0

    invoke-direct {p2, v2, v2, p3, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object p2, p0, Ll/֫ۢ֨;->ۧ֫:Landroid/graphics/Rect;

    .line 255
    new-instance p2, Ll/ۗۢ֨;

    invoke-direct {p2, p0}, Ll/ۗۢ֨;-><init>(Ll/֫ۢ֨;)V

    iput-object p2, p0, Ll/֫ۢ֨;->ۙ:Ll/ۗۢ֨;

    .line 256
    invoke-virtual {v1}, Ll/ۤۢ֨;->֫()V

    .line 257
    invoke-virtual {p1}, Lpl/droidsonroids/gif/GifInfoHandle;->ܺ()I

    move-result p2

    iput p2, p0, Ll/֫ۢ֨;->֫֫:I

    .line 258
    invoke-virtual {p1}, Lpl/droidsonroids/gif/GifInfoHandle;->ܳ()I

    move-result p1

    iput p1, p0, Ll/֫ۢ֨;->۟:I

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    .line 184
    new-instance v0, Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-direct {v0, p1}, Lpl/droidsonroids/gif/GifInfoHandle;-><init>([B)V

    const/4 p1, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, p1, v1}, Ll/֫ۢ֨;-><init>(Lpl/droidsonroids/gif/GifInfoHandle;Ljava/util/concurrent/ScheduledThreadPoolExecutor;Z)V

    return-void
.end method

.method private ֫(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 2

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 867
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    .line 868
    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    invoke-direct {v0, p1, p2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    return-object v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public final canPause()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final canSeekBackward()Z
    .locals 2

    .line 441
    iget-object v0, p0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->ۢ()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final canSeekForward()Z
    .locals 2

    .line 441
    iget-object v0, p0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->ۢ()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 774
    iget-object v0, p0, Ll/֫ۢ֨;->ᩳ֫:Landroid/graphics/PorterDuffColorFilter;

    iget-object v1, p0, Ll/֫ۢ֨;->ۨ:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Paint;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object v0

    if-nez v0, :cond_0

    .line 775
    iget-object v0, p0, Ll/֫ۢ֨;->ᩳ֫:Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 781
    :goto_0
    iget-object v2, p0, Ll/֫ۢ֨;->ۧ֫:Landroid/graphics/Rect;

    iget-object v3, p0, Ll/֫ۢ֨;->᩹:Landroid/graphics/Rect;

    iget-object v4, p0, Ll/֫ۢ֨;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v4, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    .line 786
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    :cond_1
    return-void
.end method

.method public final getAlpha()I
    .locals 1

    .line 810
    iget-object v0, p0, Ll/֫ۢ֨;->ۨ:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    return v0
.end method

.method public final getAudioSessionId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getBufferPercentage()I
    .locals 1

    const/16 v0, 0x64

    return v0
.end method

.method public final getColorFilter()Landroid/graphics/ColorFilter;
    .locals 1

    .line 848
    iget-object v0, p0, Ll/֫ۢ֨;->ۨ:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object v0

    return-object v0
.end method

.method public final getCurrentPosition()I
    .locals 1

    .line 513
    iget-object v0, p0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->ᩳ()I

    move-result v0

    return v0
.end method

.method public final getDuration()I
    .locals 1

    .line 502
    iget-object v0, p0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->ܿ()I

    move-result v0

    return v0
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 294
    iget v0, p0, Ll/֫ۢ֨;->۟:I

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .line 299
    iget v0, p0, Ll/֫ۢ֨;->֫֫:I

    return v0
.end method

.method public final getOpacity()I
    .locals 2

    .line 321
    iget-object v0, p0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/֫ۢ֨;->ۨ:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    const/16 v1, 0xff

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, -0x2

    return v0
.end method

.method public final invalidateSelf()V
    .locals 6

    .line 288
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 792
    iget-boolean v0, p0, Ll/֫ۢ֨;->ۗ:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/֫ۢ֨;->۬:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Ll/֫ۢ֨;->ۛ:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 793
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    sub-long/2addr v0, v4

    const-wide/16 v4, 0x0

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    .line 794
    iput-wide v2, p0, Ll/֫ۢ֨;->ۛ:J

    .line 795
    iget-object v2, p0, Ll/֫ۢ֨;->᩶:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    iget-object v3, p0, Ll/֫ۢ֨;->᩺:Ll/ۤۢ֨;

    invoke-virtual {v2, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->remove(Ljava/lang/Runnable;)Z

    .line 796
    iget-object v2, p0, Ll/֫ۢ֨;->᩶:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    iget-object v3, p0, Ll/֫ۢ֨;->᩺:Ll/ۤۢ֨;

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v3, v0, v1, v4}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Ll/֫ۢ֨;->ܰ:Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    return-void
.end method

.method public final isPlaying()Z
    .locals 1

    .line 626
    iget-boolean v0, p0, Ll/֫ۢ֨;->۬:Z

    return v0
.end method

.method public final isRunning()Z
    .locals 1

    .line 395
    iget-boolean v0, p0, Ll/֫ۢ֨;->۬:Z

    return v0
.end method

.method public final isStateful()Z
    .locals 1

    .line 896
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/֫ۢ֨;->ܽ֫:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 760
    iget-object v0, p0, Ll/֫ۢ֨;->᩹:Landroid/graphics/Rect;

    invoke-virtual {v0, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final onStateChange([I)Z
    .locals 1

    .line 887
    iget-object p1, p0, Ll/֫ۢ֨;->ܽ֫:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_0

    iget-object v0, p0, Ll/֫ۢ֨;->ܿ֫:Landroid/graphics/PorterDuff$Mode;

    if-eqz v0, :cond_0

    .line 888
    invoke-direct {p0, p1, v0}, Ll/֫ۢ֨;->֫(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p1

    iput-object p1, p0, Ll/֫ۢ֨;->ᩳ֫:Landroid/graphics/PorterDuffColorFilter;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final pause()V
    .locals 0

    .line 489
    invoke-virtual {p0}, Ll/֫ۢ֨;->stop()V

    return-void
.end method

.method public final seekTo(I)V
    .locals 1

    if-ltz p1, :cond_0

    .line 533
    new-instance v0, Ll/۟᩷֨;

    invoke-direct {v0, p0, p0, p1}, Ll/۟᩷֨;-><init>(Ll/֫ۢ֨;Ll/֫ۢ֨;I)V

    iget-object p1, p0, Ll/֫ۢ֨;->᩶:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 531
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Position is not positive"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 304
    iget-object v0, p0, Ll/֫ۢ֨;->ۨ:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 309
    iget-object v0, p0, Ll/֫ۢ֨;->ۨ:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    return-void
.end method

.method public final setDither(Z)V
    .locals 1

    .line 822
    iget-object v0, p0, Ll/֫ۢ֨;->ۨ:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 823
    invoke-virtual {p0}, Ll/֫ۢ֨;->invalidateSelf()V

    return-void
.end method

.method public final setFilterBitmap(Z)V
    .locals 1

    .line 815
    iget-object v0, p0, Ll/֫ۢ֨;->ۨ:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 816
    invoke-virtual {p0}, Ll/֫ۢ֨;->invalidateSelf()V

    return-void
.end method

.method public final setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 873
    iput-object p1, p0, Ll/֫ۢ֨;->ܽ֫:Landroid/content/res/ColorStateList;

    .line 874
    iget-object v0, p0, Ll/֫ۢ֨;->ܿ֫:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p0, p1, v0}, Ll/֫ۢ֨;->֫(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p1

    iput-object p1, p0, Ll/֫ۢ֨;->ᩳ֫:Landroid/graphics/PorterDuffColorFilter;

    .line 875
    invoke-virtual {p0}, Ll/֫ۢ֨;->invalidateSelf()V

    return-void
.end method

.method public final setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 880
    iput-object p1, p0, Ll/֫ۢ֨;->ܿ֫:Landroid/graphics/PorterDuff$Mode;

    .line 881
    iget-object v0, p0, Ll/֫ۢ֨;->ܽ֫:Landroid/content/res/ColorStateList;

    invoke-direct {p0, v0, p1}, Ll/֫ۢ֨;->֫(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p1

    iput-object p1, p0, Ll/֫ۢ֨;->ᩳ֫:Landroid/graphics/PorterDuffColorFilter;

    .line 882
    invoke-virtual {p0}, Ll/֫ۢ֨;->invalidateSelf()V

    return-void
.end method

.method public final setVisible(ZZ)Z
    .locals 2

    .line 915
    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result v0

    .line 916
    iget-boolean v1, p0, Ll/֫ۢ֨;->ۗ:Z

    if-nez v1, :cond_2

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 919
    invoke-virtual {p0}, Ll/֫ۢ֨;->᩷()V

    :cond_0
    if-eqz v0, :cond_2

    .line 922
    invoke-virtual {p0}, Ll/֫ۢ֨;->start()V

    return v0

    :cond_1
    if-eqz v0, :cond_2

    .line 925
    invoke-virtual {p0}, Ll/֫ۢ֨;->stop()V

    :cond_2
    return v0
.end method

.method public final start()V
    .locals 2

    move-object v0, p0

    .line 333
    monitor-enter v0

    .line 334
    :try_start_0
    iget-boolean v1, p0, Ll/֫ۢ֨;->۬:Z

    if-eqz v1, :cond_0

    .line 335
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 337
    iput-boolean v1, p0, Ll/֫ۢ֨;->۬:Z

    .line 338
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 339
    iget-object v0, p0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->֨()J

    move-result-wide v0

    .line 340
    invoke-virtual {p0, v0, v1}, Ll/֫ۢ֨;->֫(J)V

    return-void

    :catchall_0
    move-exception v1

    .line 338
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final stop()V
    .locals 2

    move-object v0, p0

    .line 375
    monitor-enter v0

    .line 376
    :try_start_0
    iget-boolean v1, p0, Ll/֫ۢ֨;->۬:Z

    if-nez v1, :cond_0

    .line 377
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 379
    iput-boolean v1, p0, Ll/֫ۢ֨;->۬:Z

    .line 380
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 387
    iget-object v0, p0, Ll/֫ۢ֨;->ܰ:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    .line 388
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 390
    :cond_1
    iget-object v0, p0, Ll/֫ۢ֨;->ۙ:Ll/ۗۢ֨;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 383
    iget-object v0, p0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->۠()V

    return-void

    :catchall_0
    move-exception v1

    .line 380
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 433
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 434
    iget-object v0, p0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->ܺ()I

    move-result v1

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->ܳ()I

    move-result v2

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->ۢ()I

    move-result v3

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->᩷()I

    move-result v0

    const-string v4, "x"

    const-string v5, ", frames: "

    const-string v6, "GIF: size: "

    .line 0
    invoke-static {v6, v1, v4, v5, v2}, Ll/᩶ᩴᩳ;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 433
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()J
    .locals 4

    .line 701
    iget-object v0, p0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->֫()J

    move-result-wide v0

    iget-object v2, p0, Ll/֫ۢ֨;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final ֫(J)V
    .locals 6

    .line 344
    iget-boolean v0, p0, Ll/֫ۢ֨;->ۗ:Z

    const/4 v1, -0x1

    iget-object v2, p0, Ll/֫ۢ֨;->ۙ:Ll/ۗۢ֨;

    const-wide/16 v3, 0x0

    if-eqz v0, :cond_0

    .line 345
    iput-wide v3, p0, Ll/֫ۢ֨;->ۛ:J

    .line 346
    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    return-void

    .line 387
    :cond_0
    iget-object v0, p0, Ll/֫ۢ֨;->ܰ:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    const/4 v5, 0x0

    .line 388
    invoke-interface {v0, v5}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 390
    :cond_1
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 349
    invoke-static {p1, p2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v1, p0, Ll/֫ۢ֨;->᩶:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    iget-object v2, p0, Ll/֫ۢ֨;->᩺:Ll/ۤۢ֨;

    invoke-virtual {v1, v2, p1, p2, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Ll/֫ۢ֨;->ܰ:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public final ۜ()V
    .locals 2

    const/4 v0, 0x0

    .line 274
    iput-boolean v0, p0, Ll/֫ۢ֨;->۬:Z

    .line 275
    iget-object v0, p0, Ll/֫ۢ֨;->ۙ:Ll/ۗۢ֨;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 276
    iget-object v0, p0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->֡()V

    .line 270
    iget-object v0, p0, Ll/֫ۢ֨;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    return-void
.end method

.method public final ۧ()Landroid/graphics/Bitmap;
    .locals 3

    .line 857
    iget-object v0, p0, Ll/֫ۢ֨;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isMutable()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 858
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->hasAlpha()Z

    move-result v0

    invoke-virtual {v1, v0}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    return-object v1
.end method

.method public final ܳ()I
    .locals 1

    .line 441
    iget-object v0, p0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->ۢ()I

    move-result v0

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 937
    iget-object v0, p0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->ۧ()I

    move-result v0

    return v0
.end method

.method public final ܿ()J
    .locals 2

    .line 711
    iget-object v0, p0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->ۜ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩳ()Ll/ᩳۢ֨;
    .locals 1

    .line 451
    iget-object v0, p0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->᩷()I

    move-result v0

    invoke-static {v0}, Ll/ᩳۢ֨;->֫(I)Ll/ᩳۢ֨;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()V
    .locals 2

    .line 359
    new-instance v0, Ll/ܰ᩷֨;

    invoke-direct {v0, p0, p0}, Ll/ܰ᩷֨;-><init>(Ll/֫ۢ֨;Ll/֫ۢ֨;)V

    iget-object v1, p0, Ll/֫ۢ֨;->᩶:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 961
    iget-object v0, p0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->ۖ()Z

    move-result v0

    return v0
.end method
