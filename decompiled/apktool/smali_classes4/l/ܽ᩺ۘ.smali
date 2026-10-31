.class public final Ll/ܽ᩺ۘ;
.super Ll/۬ۨۘ;
.source "S8YW"


# instance fields
.field public final ֫:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 42
    invoke-direct {p0}, Ll/۬ۨۘ;-><init>()V

    const/4 v0, 0x1

    .line 43
    iput-boolean v0, p0, Ll/ܽ᩺ۘ;->֫:Z

    .line 98
    invoke-static {}, Ll/ᩳ᩺ۘ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 99
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "`pl.droidsonroids.gif:android-gif-drawable:*` dependency is missing, please add to your project explicitly if you wish to use GIF media-decoder"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫()Ll/ܽ᩺ۘ;
    .locals 1

    .line 37
    new-instance v0, Ll/ܽ᩺ۘ;

    invoke-direct {v0}, Ll/ܽ᩺ۘ;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final ֫(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;
    .locals 6

    .line 87
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v1, 0x2000

    new-array v2, v1, [B

    :goto_0
    const/4 v3, 0x0

    .line 91
    invoke-virtual {p1, v2, v3, v1}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_0

    .line 92
    invoke-virtual {v0, v2, v3, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 94
    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 82
    :try_start_1
    new-instance v0, Ll/֫ۢ֨;

    invoke-direct {v0, p1}, Ll/֫ۢ֨;-><init>([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 67
    iget-boolean p1, p0, Ll/ܽ᩺ۘ;->֫:Z

    if-nez p1, :cond_1

    .line 489
    invoke-virtual {v0}, Ll/֫ۢ֨;->stop()V

    :cond_1
    return-object v0

    :catch_0
    move-exception p1

    .line 64
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Exception creating GifDrawable"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    .line 57
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot read GIF input-stream"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
