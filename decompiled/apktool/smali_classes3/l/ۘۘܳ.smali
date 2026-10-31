.class public Ll/ۘۘܳ;
.super Ljava/lang/Object;
.source "D27M"

# interfaces
.implements Ll/ۧۜܳ;


# static fields
.field public static final ֫:Ll/֨᩵;

.field public static final ۧ:Ll/ۘۘܳ;

.field public static final ܽ:Ll/֨᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 27
    new-instance v0, Ll/֨᩵;

    const/16 v1, 0x1f4

    invoke-direct {v0, v1}, Ll/֨᩵;-><init>(I)V

    sput-object v0, Ll/ۘۘܳ;->֫:Ll/֨᩵;

    .line 28
    new-instance v0, Ll/֨᩵;

    invoke-direct {v0, v1}, Ll/֨᩵;-><init>(I)V

    sput-object v0, Ll/ۘۘܳ;->ܽ:Ll/֨᩵;

    .line 29
    new-instance v0, Ll/ۘۘܳ;

    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 29
    sput-object v0, Ll/ۘۘܳ;->ۧ:Ll/ۘۘܳ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ll/᩶ۖܳ;ZLl/ۙ۫ۡ;)Ll/ۨܺ᩷;
    .locals 4

    if-eqz p2, :cond_0

    .line 71
    invoke-static {p0}, Ll/ۘۘܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    iget-object p0, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    return-object p0

    .line 83
    :cond_0
    invoke-static {p0}, Ll/۬۫ۡ;->֫(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_1

    .line 85
    sget-object v1, Ll/֫ۨۡ;->֫:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Ll/᩹۫ۡ;

    invoke-direct {v2, p3}, Ll/᩹۫ۡ;-><init>(Ll/ۙ۫ۡ;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p3

    .line 87
    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x5

    invoke-interface {p3, v2, v3, v1}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    :catch_1
    const/4 v1, 0x1

    .line 90
    invoke-interface {p3, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :goto_0
    if-eqz v0, :cond_1

    .line 95
    invoke-static {p0, v0}, Ll/۬۫ۡ;->֫(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 74
    :cond_1
    invoke-static {v0}, Ll/ۨܺ᩷;->֫(Landroid/graphics/Bitmap;)Ll/ۨܺ᩷;

    move-result-object p3

    if-nez p3, :cond_2

    .line 76
    iget-object p3, p1, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    if-eqz p2, :cond_2

    .line 85
    sget-object p1, Ll/ۘۘܳ;->֫:Ll/֨᩵;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p0, p2}, Ll/֨᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-object p3
.end method

.method public static ֫()V
    .locals 2

    .line 93
    sget-object v0, Ll/ۘۘܳ;->ܽ:Ll/֨᩵;

    const/4 v1, -0x1

    .line 281
    invoke-virtual {v0, v1}, Ll/֨᩵;->֫(I)V

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 1

    .line 64
    invoke-static {p0}, Ll/ۘۘܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    .line 67
    :cond_0
    invoke-static {p0}, Ll/۬۫ۡ;->ܽ(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ۧ(Ljava/lang/String;)Z
    .locals 1

    .line 89
    sget-object v0, Ll/ۘۘܳ;->֫:Ll/֨᩵;

    invoke-virtual {v0, p0}, Ll/֨᩵;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ܽ(Ljava/lang/String;)Z
    .locals 1

    .line 106
    sget-object v0, Ll/ۘۘܳ;->ܽ:Ll/֨᩵;

    invoke-virtual {v0, p0}, Ll/֨᩵;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۖۘܳ;

    if-eqz p0, :cond_0

    .line 107
    iget p0, p0, Ll/ۖۘܳ;->֫:I

    const/4 v0, 0x2

    if-lt p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ܿ(Ljava/lang/String;)V
    .locals 3

    .line 97
    sget-object v0, Ll/ۘۘܳ;->ܽ:Ll/֨᩵;

    invoke-virtual {v0, p0}, Ll/֨᩵;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۘܳ;

    if-nez v1, :cond_0

    .line 99
    new-instance v1, Ll/ۖۘܳ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ۖۘܳ;-><init>(I)V

    .line 100
    invoke-virtual {v0, p0, v1}, Ll/֨᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    :cond_0
    iget p0, v1, Ll/ۖۘܳ;->֫:I

    add-int/lit8 p0, p0, 0x1

    iput p0, v1, Ll/ۖۘܳ;->֫:I

    return-void
.end method

.method public static ᩳ(Ljava/lang/String;)V
    .locals 2

    .line 85
    sget-object v0, Ll/ۘۘܳ;->֫:Ll/֨᩵;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p0, v1}, Ll/֨᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public ֫(Ll/ᩳۜܳ;I)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public ֫(Ll/ܽ᩷ܳ;Ll/ᩳۜܳ;I)Ll/ۨܺ᩷;
    .locals 0

    .line 44
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/ᩳۜܳ;IZ)Ll/ۨܺ᩷;
    .locals 1

    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p0, p1, p2}, Ll/ۘۘܳ;->֫(Ll/ᩳۜܳ;I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :goto_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    if-eqz p3, :cond_2

    .line 54
    invoke-static {p1}, Ll/۬۫ۡ;->ۧ(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-static {p1}, Ll/۬۫ۡ;->֫(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    :goto_1
    invoke-static {p1}, Ll/ۨܺ᩷;->֫(Landroid/graphics/Bitmap;)Ll/ۨܺ᩷;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;
    .locals 0

    .line 33
    invoke-static {p1}, Ll/ۗ۬ܳ;->֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;

    move-result-object p1

    return-object p1
.end method

.method public ۧ(Ll/ᩳۜܳ;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
