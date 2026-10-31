.class public final Ll/֡֡ۚ;
.super Ljava/lang/Object;
.source "O1HV"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public ۗ:I

.field public ۙ:Ll/ۗ֡ۚ;

.field public ۤ:Ll/᩵֡ۚ;

.field public ۫:Z

.field public ۬:I

.field public final ᩶:Ljava/lang/ThreadLocal;

.field public ᩸:Ljava/nio/charset/Charset;

.field public ᩹:Ll/ۙ֡ۚ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 428
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 416
    sget-object v0, Ll/ۗ֡ۚ;->۬:Ll/ۗ֡ۚ;

    iput-object v0, p0, Ll/֡֡ۚ;->ۙ:Ll/ۗ֡ۚ;

    .line 417
    sget-object v0, Ll/ᩳ֡ۚ;->֫:Ljava/nio/charset/Charset;

    iput-object v0, p0, Ll/֡֡ۚ;->᩸:Ljava/nio/charset/Charset;

    .line 418
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Ll/֡֡ۚ;->᩶:Ljava/lang/ThreadLocal;

    const/4 v0, 0x1

    .line 421
    iput-boolean v0, p0, Ll/֡֡ۚ;->۫:Z

    .line 423
    iput v0, p0, Ll/֡֡ۚ;->ۗ:I

    const/16 v0, 0x1e

    .line 425
    iput v0, p0, Ll/֡֡ۚ;->۬:I

    .line 426
    sget-object v0, Ll/᩵֡ۚ;->᩹:Ll/᩵֡ۚ;

    iput-object v0, p0, Ll/֡֡ۚ;->ۤ:Ll/᩵֡ۚ;

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 410
    invoke-virtual {p0}, Ll/֡֡ۚ;->clone()Ll/֡֡ۚ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/֡֡ۚ;
    .locals 2

    .line 608
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡֡ۚ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 612
    iget-object v1, p0, Ll/֡֡ۚ;->᩸:Ljava/nio/charset/Charset;

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    .line 471
    iput-object v1, v0, Ll/֡֡ۚ;->᩸:Ljava/nio/charset/Charset;

    .line 613
    iget-object v1, p0, Ll/֡֡ۚ;->ۙ:Ll/ۗ֡ۚ;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۗ֡ۚ;->valueOf(Ljava/lang/String;)Ll/ۗ֡ۚ;

    move-result-object v1

    iput-object v1, v0, Ll/֡֡ۚ;->ۙ:Ll/ۗ֡ۚ;

    return-object v0

    :catch_0
    move-exception v0

    .line 610
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final ֫()Ljava/nio/charset/CharsetEncoder;
    .locals 1

    .line 494
    iget-object v0, p0, Ll/֡֡ۚ;->᩶:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/charset/CharsetEncoder;

    if-eqz v0, :cond_0

    return-object v0

    .line 495
    :cond_0
    invoke-virtual {p0}, Ll/֡֡ۚ;->ܳ()Ljava/nio/charset/CharsetEncoder;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗ֡ۚ;)V
    .locals 0

    .line 449
    iput-object p1, p0, Ll/֡֡ۚ;->ۙ:Ll/ۗ֡ۚ;

    return-void
.end method

.method public final ֫(Ll/᩵֡ۚ;)V
    .locals 0

    .line 513
    iput-object p1, p0, Ll/֡֡ۚ;->ۤ:Ll/᩵֡ۚ;

    return-void
.end method

.method public final ۜ()V
    .locals 1

    const/4 v0, 0x0

    .line 532
    iput-boolean v0, p0, Ll/֡֡ۚ;->۫:Z

    return-void
.end method

.method public final ۜ()Z
    .locals 1

    .line 523
    iget-boolean v0, p0, Ll/֡֡ۚ;->۫:Z

    return v0
.end method

.method public final ܳ()Ljava/nio/charset/CharsetEncoder;
    .locals 2

    .line 487
    iget-object v0, p0, Ll/֡֡ۚ;->᩸:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object v0

    .line 488
    iget-object v1, p0, Ll/֡֡ۚ;->᩶:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 489
    invoke-virtual {v0}, Ljava/nio/charset/CharsetEncoder;->charset()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۙ֡ۚ;->֫(Ljava/lang/String;)Ll/ۙ֡ۚ;

    move-result-object v1

    iput-object v1, p0, Ll/֡֡ۚ;->᩹:Ll/ۙ֡ۚ;

    return-object v0
.end method

.method public final ܽ()Ll/ۗ֡ۚ;
    .locals 1

    .line 439
    iget-object v0, p0, Ll/֡֡ۚ;->ۙ:Ll/ۗ֡ۚ;

    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    .line 589
    iget v0, p0, Ll/֡֡ۚ;->۬:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 560
    iget v0, p0, Ll/֡֡ۚ;->ۗ:I

    return v0
.end method

.method public final ᩷()Ll/᩵֡ۚ;
    .locals 1

    .line 503
    iget-object v0, p0, Ll/֡֡ۚ;->ۤ:Ll/᩵֡ۚ;

    return-object v0
.end method
