.class public abstract Ll/ܶۗ;
.super Ljava/lang/Object;
.source "Z4TG"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 449
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Landroid/os/Handler;)Landroid/os/Handler;
    .locals 1

    if-nez p0, :cond_0

    .line 497
    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    :cond_0
    return-object p0
.end method

.method private synthetic ֫(I)V
    .locals 0

    .line 491
    invoke-virtual {p0, p1}, Ll/ܶۗ;->onFontRetrievalFailed(I)V

    return-void
.end method

.method private synthetic ֫(Landroid/graphics/Typeface;)V
    .locals 0

    .line 480
    invoke-virtual {p0, p1}, Ll/ܶۗ;->onFontRetrieved(Landroid/graphics/Typeface;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܶۗ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܶۗ;->֫(I)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܶۗ;Landroid/graphics/Typeface;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܶۗ;->֫(Landroid/graphics/Typeface;)V

    return-void
.end method


# virtual methods
.method public final callbackFailAsync(ILandroid/os/Handler;)V
    .locals 1

    .line 491
    invoke-static {p2}, Ll/ܶۗ;->֫(Landroid/os/Handler;)Landroid/os/Handler;

    move-result-object p2

    new-instance v0, Ll/۠ۗ;

    invoke-direct {v0, p0, p1}, Ll/۠ۗ;-><init>(Ll/ܶۗ;I)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final callbackSuccessAsync(Landroid/graphics/Typeface;Landroid/os/Handler;)V
    .locals 2

    .line 480
    invoke-static {p2}, Ll/ܶۗ;->֫(Landroid/os/Handler;)Landroid/os/Handler;

    move-result-object p2

    new-instance v0, Ll/᩶ۜۢ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p1}, Ll/᩶ۜۢ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public abstract onFontRetrievalFailed(I)V
.end method

.method public abstract onFontRetrieved(Landroid/graphics/Typeface;)V
.end method
