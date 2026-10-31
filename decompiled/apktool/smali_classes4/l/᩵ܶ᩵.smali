.class public final Ll/᩵ܶ᩵;
.super Ljava/lang/Object;
.source "I5ZF"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ᩸:I

.field public final ᩹:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;)V
    .locals 1

    const-string v0, "iterator"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ܶ᩵;->᩹:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 40
    iget-object v0, p0, Ll/᩵ܶ᩵;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 41
    new-instance v0, Ll/ۘܶ᩵;

    iget v1, p0, Ll/᩵ܶ᩵;->᩸:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/᩵ܶ᩵;->᩸:I

    if-ltz v1, :cond_0

    iget-object v2, p0, Ll/᩵ܶ᩵;->᩹:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll/ۘܶ᩵;-><init>(ILjava/lang/Object;)V

    return-object v0

    .line 483
    :cond_0
    new-instance v0, Ljava/lang/ArithmeticException;

    const-string v1, "Index overflow has happened."

    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

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
