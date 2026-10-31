.class public final Ll/۫᩵֨;
.super Ljava/lang/Object;
.source "R450"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ۗ:Ljava/util/function/Predicate;

.field public final synthetic ۙ:Ll/֨᩵֨;

.field public final synthetic ᩶:Ll/ۤ᩵֨;

.field public ᩸:Ll/ܳ᩵֨;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ۤ᩵֨;Ll/ۤܶ۠;Ljava/util/function/Predicate;Ll/֨᩵֨;)V
    .locals 0

    .line 630
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫᩵֨;->᩶:Ll/ۤ᩵֨;

    iput-object p3, p0, Ll/۫᩵֨;->ۗ:Ljava/util/function/Predicate;

    iput-object p4, p0, Ll/۫᩵֨;->ۙ:Ll/֨᩵֨;

    .line 631
    invoke-virtual {p1, p2, p3}, Ll/ۤ᩵֨;->ۧ(Ll/ۤܶ۠;Ljava/util/function/Predicate;)Ll/ܳ᩵֨;

    move-result-object p1

    iput-object p1, p0, Ll/۫᩵֨;->᩸:Ll/ܳ᩵֨;

    .line 632
    iget-object p1, p1, Ll/ܳ᩵֨;->ܽ:Ll/ۤ᩵֨;

    if-eqz p1, :cond_0

    .line 633
    iget p1, p1, Ll/ۤ᩵֨;->᩻:I

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    iput p1, p0, Ll/۫᩵֨;->᩹:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 4

    .line 636
    iget-object v0, p0, Ll/۫᩵֨;->᩸:Ll/ܳ᩵֨;

    iget-object v1, v0, Ll/ܳ᩵֨;->ܽ:Ll/ۤ᩵֨;

    if-eqz v1, :cond_0

    iget v2, p0, Ll/۫᩵֨;->᩹:I

    iget v3, v1, Ll/ۤ᩵֨;->᩻:I

    if-eq v2, v3, :cond_0

    iget-object v0, v0, Ll/ܳ᩵֨;->ܿ:Ll/ۛ֡֨;

    .line 638
    invoke-virtual {v1, v0}, Ll/ۤ᩵֨;->ۧ(Ll/ۛ֡֨;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 652
    iget-object v0, p0, Ll/۫᩵֨;->᩸:Ll/ܳ᩵֨;

    .line 653
    iget-object v1, p0, Ll/۫᩵֨;->ۗ:Ljava/util/function/Predicate;

    invoke-virtual {v0, v1}, Ll/ܳ᩵֨;->֫(Ljava/util/function/Predicate;)Ll/ܳ᩵֨;

    move-result-object v0

    iput-object v0, p0, Ll/۫᩵֨;->᩸:Ll/ܳ᩵֨;

    .line 641
    :cond_0
    iget-object v0, p0, Ll/۫᩵֨;->᩸:Ll/ܳ᩵֨;

    iget-object v0, v0, Ll/ܳ᩵֨;->ܽ:Ll/ۤ᩵֨;

    if-eqz v0, :cond_2

    iget-object v1, p0, Ll/۫᩵֨;->ۙ:Ll/֨᩵֨;

    sget-object v2, Ll/֨᩵֨;->᩶:Ll/֨᩵֨;

    if-eq v1, v2, :cond_1

    iget-object v1, p0, Ll/۫᩵֨;->᩶:Ll/ۤ᩵֨;

    if-ne v0, v1, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 646
    invoke-virtual {p0}, Ll/۫᩵֨;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 652
    iget-object v0, p0, Ll/۫᩵֨;->᩸:Ll/ܳ᩵֨;

    .line 653
    iget-object v1, p0, Ll/۫᩵֨;->ۗ:Ljava/util/function/Predicate;

    invoke-virtual {v0, v1}, Ll/ܳ᩵֨;->֫(Ljava/util/function/Predicate;)Ll/ܳ᩵֨;

    move-result-object v1

    iput-object v1, p0, Ll/۫᩵֨;->᩸:Ll/ܳ᩵֨;

    .line 654
    iget-object v0, v0, Ll/ܳ᩵֨;->ܿ:Ll/ۛ֡֨;

    return-object v0

    .line 647
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 1

    .line 657
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
