.class public final Ll/۬᩵֨;
.super Ljava/lang/Object;
.source "R450"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ۗ:Ljava/util/function/Predicate;

.field public final synthetic ۙ:Ll/֨᩵֨;

.field public ᩶:I

.field public ᩸:Ll/ܳ᩵֨;

.field public ᩹:Ll/ۤ᩵֨;


# direct methods
.method public constructor <init>(Ll/ۤ᩵֨;Ll/֨᩵֨;Ljava/util/function/Predicate;)V
    .locals 0

    .line 573
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/۬᩵֨;->ۙ:Ll/֨᩵֨;

    iput-object p3, p0, Ll/۬᩵֨;->ۗ:Ljava/util/function/Predicate;

    .line 574
    iput-object p1, p0, Ll/۬᩵֨;->᩹:Ll/ۤ᩵֨;

    .line 575
    iget-object p2, p1, Ll/ۤ᩵֨;->ܽ:Ll/ܳ᩵֨;

    iput-object p2, p0, Ll/۬᩵֨;->᩸:Ll/ܳ᩵֨;

    .line 576
    iget p1, p1, Ll/ۤ᩵֨;->᩻:I

    iput p1, p0, Ll/۬᩵֨;->᩶:I

    .line 578
    invoke-direct {p0}, Ll/۬᩵֨;->֫()V

    return-void
.end method

.method private ֫()V
    .locals 3

    .line 620
    :goto_0
    iget-object v0, p0, Ll/۬᩵֨;->᩸:Ll/ܳ᩵֨;

    iget-object v1, p0, Ll/۬᩵֨;->ۗ:Ljava/util/function/Predicate;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    iget-object v0, v0, Ll/ܳ᩵֨;->ܿ:Ll/ۛ֡֨;

    invoke-interface {v1, v0}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 621
    iget-object v0, p0, Ll/۬᩵֨;->᩸:Ll/ܳ᩵֨;

    iget-object v0, v0, Ll/ܳ᩵֨;->֫:Ll/ܳ᩵֨;

    iput-object v0, p0, Ll/۬᩵֨;->᩸:Ll/ܳ᩵֨;

    goto :goto_0

    .line 609
    :cond_0
    iget-object v0, p0, Ll/۬᩵֨;->ۙ:Ll/֨᩵֨;

    sget-object v2, Ll/֨᩵֨;->᩶:Ll/֨᩵֨;

    if-ne v0, v2, :cond_2

    .line 610
    :cond_1
    iget-object v0, p0, Ll/۬᩵֨;->᩸:Ll/ܳ᩵֨;

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/۬᩵֨;->᩹:Ll/ۤ᩵֨;

    iget-object v0, v0, Ll/ۤ᩵֨;->ܳ:Ll/ۤ᩵֨;

    if-eqz v0, :cond_2

    .line 611
    iput-object v0, p0, Ll/۬᩵֨;->᩹:Ll/ۤ᩵֨;

    .line 612
    iget-object v2, v0, Ll/ۤ᩵֨;->ܽ:Ll/ܳ᩵֨;

    iput-object v2, p0, Ll/۬᩵֨;->᩸:Ll/ܳ᩵֨;

    .line 613
    iget v0, v0, Ll/ۤ᩵֨;->᩻:I

    iput v0, p0, Ll/۬᩵֨;->᩶:I

    .line 620
    :goto_1
    iget-object v0, p0, Ll/۬᩵֨;->᩸:Ll/ܳ᩵֨;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    iget-object v0, v0, Ll/ܳ᩵֨;->ܿ:Ll/ۛ֡֨;

    invoke-interface {v1, v0}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 621
    iget-object v0, p0, Ll/۬᩵֨;->᩸:Ll/ܳ᩵֨;

    iget-object v0, v0, Ll/ܳ᩵֨;->֫:Ll/ܳ᩵֨;

    iput-object v0, p0, Ll/۬᩵֨;->᩸:Ll/ܳ᩵֨;

    goto :goto_1

    :cond_2
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 582
    iget v0, p0, Ll/۬᩵֨;->᩶:I

    iget-object v1, p0, Ll/۬᩵֨;->᩹:Ll/ۤ᩵֨;

    iget v1, v1, Ll/ۤ᩵֨;->᩻:I

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Ll/۬᩵֨;->᩸:Ll/ܳ᩵֨;

    if-eqz v0, :cond_1

    iget-object v1, v0, Ll/ܳ᩵֨;->ܽ:Ll/ۤ᩵֨;

    iget-object v0, v0, Ll/ܳ᩵֨;->ܿ:Ll/ۛ֡֨;

    .line 584
    invoke-virtual {v1, v0}, Ll/ۤ᩵֨;->ۧ(Ll/ۛ֡֨;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 599
    iget-object v0, p0, Ll/۬᩵֨;->᩸:Ll/ܳ᩵֨;

    if-eqz v0, :cond_0

    .line 601
    iget-object v0, v0, Ll/ܳ᩵֨;->֫:Ll/ܳ᩵֨;

    iput-object v0, p0, Ll/۬᩵֨;->᩸:Ll/ܳ᩵֨;

    .line 603
    :cond_0
    invoke-direct {p0}, Ll/۬᩵֨;->֫()V

    .line 586
    iget-object v0, p0, Ll/۬᩵֨;->᩹:Ll/ۤ᩵֨;

    iget v0, v0, Ll/ۤ᩵֨;->᩻:I

    iput v0, p0, Ll/۬᩵֨;->᩶:I

    .line 588
    :cond_1
    iget-object v0, p0, Ll/۬᩵֨;->᩸:Ll/ܳ᩵֨;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 592
    invoke-virtual {p0}, Ll/۬᩵֨;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 599
    iget-object v0, p0, Ll/۬᩵֨;->᩸:Ll/ܳ᩵֨;

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Ll/ܳ᩵֨;->ܿ:Ll/ۛ֡֨;

    :goto_0
    if-eqz v0, :cond_1

    .line 601
    iget-object v0, v0, Ll/ܳ᩵֨;->֫:Ll/ܳ᩵֨;

    iput-object v0, p0, Ll/۬᩵֨;->᩸:Ll/ܳ᩵֨;

    .line 603
    :cond_1
    invoke-direct {p0}, Ll/۬᩵֨;->֫()V

    return-object v1

    .line 593
    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
