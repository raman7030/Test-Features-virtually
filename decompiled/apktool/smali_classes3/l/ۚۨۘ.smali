.class public final Ll/ۚۨۘ;
.super Ll/۬ۨۘ;
.source "X8XX"


# instance fields
.field public final ֫:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ll/۬ۨۘ;-><init>()V

    .line 42
    iput-object p1, p0, Ll/ۚۨۘ;->֫:Landroid/content/res/Resources;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 52
    :try_start_0
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v1, p0, Ll/ۚۨۘ;->֫:Landroid/content/res/Resources;

    invoke-direct {v0, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    return-object v0

    :catchall_0
    move-exception p1

    .line 54
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Exception decoding input-stream"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
