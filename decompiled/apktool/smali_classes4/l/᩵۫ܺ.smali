.class public final Ll/᩵۫ܺ;
.super Ljava/lang/Object;
.source "I5ZF"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ᩶:I

.field public ᩸:I

.field public final synthetic ᩹:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(ILjava/util/Iterator;)V
    .locals 0

    .line 960
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/᩵۫ܺ;->᩶:I

    iput-object p2, p0, Ll/᩵۫ܺ;->᩹:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 965
    iget v0, p0, Ll/᩵۫ܺ;->᩸:I

    iget v1, p0, Ll/᩵۫ܺ;->᩶:I

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Ll/᩵۫ܺ;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 971
    invoke-virtual {p0}, Ll/᩵۫ܺ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 974
    iget v0, p0, Ll/᩵۫ܺ;->᩸:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩵۫ܺ;->᩸:I

    .line 975
    iget-object v0, p0, Ll/᩵۫ܺ;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 972
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 1

    .line 980
    iget-object v0, p0, Ll/᩵۫ܺ;->᩹:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    return-void
.end method
