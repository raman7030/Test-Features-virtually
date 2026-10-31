.class public final Ll/֡ܰᩳ;
.super Ljava/lang/Object;
.source "XAZX"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ᩸:I

.field public final synthetic ᩹:Ll/᩸ܰᩳ;


# direct methods
.method public constructor <init>(Ll/᩸ܰᩳ;)V
    .locals 0

    .line 222
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ܰᩳ;->᩹:Ll/᩸ܰᩳ;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 224
    iget v0, p0, Ll/֡ܰᩳ;->᩸:I

    iget-object v1, p0, Ll/֡ܰᩳ;->᩹:Ll/᩸ܰᩳ;

    invoke-static {v1}, Ll/᩸ܰᩳ;->ۧ(Ll/᩸ܰᩳ;)I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 5

    .line 226
    invoke-virtual {p0}, Ll/֡ܰᩳ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 227
    iget v0, p0, Ll/֡ܰᩳ;->᩸:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/֡ܰᩳ;->᩸:I

    .line 189
    new-instance v1, Ll/֨ܰᩳ;

    iget-object v2, p0, Ll/֡ܰᩳ;->᩹:Ll/᩸ܰᩳ;

    invoke-direct {v1, v2}, Ll/֨ܰᩳ;-><init>(Ll/᩸ܰᩳ;)V

    .line 73
    invoke-virtual {v1, v0}, Ll/֨ܰᩳ;->ܽ(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 74
    :cond_0
    new-instance v0, Ll/᩵ܰᩳ;

    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v2, Ll/ܺۢᩴ;

    invoke-direct {v2}, Ll/ܺۢᩴ;-><init>()V

    iput-object v2, v0, Ll/᩵ܰᩳ;->ۧ:Ll/ܺۢᩴ;

    .line 75
    invoke-virtual {v1}, Ll/֨ܰᩳ;->ܽ()I

    move-result v2

    iput v2, v0, Ll/᩵ܰᩳ;->ܽ:I

    .line 76
    invoke-virtual {v1}, Ll/֨ܰᩳ;->֫()C

    move-result v2

    iput-char v2, v0, Ll/᩵ܰᩳ;->֫:C

    const/4 v2, 0x0

    .line 77
    :goto_0
    invoke-virtual {v1}, Ll/֨ܰᩳ;->ۧ()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v3, v0, Ll/᩵ܰᩳ;->ۧ:Ll/ܺۢᩴ;

    invoke-virtual {v1, v2}, Ll/֨ܰᩳ;->ۧ(I)I

    move-result v4

    invoke-virtual {v3, v4}, Ll/ܺۢᩴ;->add(I)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0

    .line 226
    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
