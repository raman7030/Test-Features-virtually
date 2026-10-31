.class public final Ll/ᩳۙ᩵;
.super Ljava/lang/Object;
.source "NAWS"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ᩶:Ll/ܿۙ᩵;

.field public ᩸:Ljava/lang/Object;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ܿۙ᩵;)V
    .locals 0

    .line 637
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    iput-object p1, p0, Ll/ᩳۙ᩵;->᩶:Ll/ܿۙ᩵;

    const/4 p1, -0x2

    .line 639
    iput p1, p0, Ll/ᩳۙ᩵;->᩹:I

    return-void
.end method

.method private final ֫()V
    .locals 3

    .line 642
    iget v0, p0, Ll/ᩳۙ᩵;->᩹:I

    const/4 v1, -0x2

    iget-object v2, p0, Ll/ᩳۙ᩵;->᩶:Ll/ܿۙ᩵;

    if-ne v0, v1, :cond_0

    invoke-static {v2}, Ll/ܿۙ᩵;->֫(Ll/ܿۙ᩵;)Ll/֫᩹᩵;

    move-result-object v0

    check-cast v0, Ll/ܺۙ᩵;

    iget-object v0, v0, Ll/ܺۙ᩵;->᩸:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {v2}, Ll/ܿۙ᩵;->ۧ(Ll/ܿۙ᩵;)Ll/ܺ᩹᩵;

    move-result-object v0

    iget-object v1, p0, Ll/ᩳۙ᩵;->᩸:Ljava/lang/Object;

    invoke-static {v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ll/ܺ᩹᩵;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Ll/ᩳۙ᩵;->᩸:Ljava/lang/Object;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    .line 643
    :goto_1
    iput v0, p0, Ll/ᩳۙ᩵;->᩹:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 659
    iget v0, p0, Ll/ᩳۙ᩵;->᩹:I

    if-gez v0, :cond_0

    .line 660
    invoke-direct {p0}, Ll/ᩳۙ᩵;->֫()V

    .line 661
    :cond_0
    iget v0, p0, Ll/ᩳۙ᩵;->᩹:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 647
    iget v0, p0, Ll/ᩳۙ᩵;->᩹:I

    if-gez v0, :cond_0

    .line 648
    invoke-direct {p0}, Ll/ᩳۙ᩵;->֫()V

    .line 650
    :cond_0
    iget v0, p0, Ll/ᩳۙ᩵;->᩹:I

    if-eqz v0, :cond_1

    .line 652
    iget-object v0, p0, Ll/ᩳۙ᩵;->᩸:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence"

    invoke-static {v0, v1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, -0x1

    .line 654
    iput v1, p0, Ll/ᩳۙ᩵;->᩹:I

    return-object v0

    .line 651
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    .line 0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
