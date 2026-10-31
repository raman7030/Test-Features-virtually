.class public final Ll/ۡ᩶۠;
.super Ljava/lang/Object;
.source "07KX"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ᩶:I

.field public ᩸:I

.field public final synthetic ᩹:Ll/ܺ᩶۠;


# direct methods
.method public constructor <init>(Ll/ܺ᩶۠;I)V
    .locals 0

    .line 465
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡ᩶۠;->᩹:Ll/ܺ᩶۠;

    iput p2, p0, Ll/ۡ᩶۠;->᩶:I

    const/4 p1, 0x0

    .line 466
    iput p1, p0, Ll/ۡ᩶۠;->᩸:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 470
    iget v0, p0, Ll/ۡ᩶۠;->᩸:I

    iget v1, p0, Ll/ۡ᩶۠;->᩶:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 475
    invoke-virtual {p0}, Ll/ۡ᩶۠;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 478
    iget v0, p0, Ll/ۡ᩶۠;->᩸:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۡ᩶۠;->᩸:I

    iget-object v1, p0, Ll/ۡ᩶۠;->᩹:Ll/ܺ᩶۠;

    invoke-virtual {v1, v0}, Ll/ܺ᩶۠;->getName(I)Ll/᩷۠ᩴ;

    move-result-object v0

    return-object v0

    .line 476
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
