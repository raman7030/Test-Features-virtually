.class public final Ll/֫᩸۠;
.super Ll/۟ܶ۠;
.source "O3Z6"


# instance fields
.field public ᩳ:Ljava/util/BitSet;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 255
    invoke-direct {p0}, Ll/۟ܶ۠;-><init>()V

    .line 256
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0, p1}, Ljava/util/BitSet;-><init>(I)V

    iput-object v0, p0, Ll/֫᩸۠;->ᩳ:Ljava/util/BitSet;

    return-void
.end method


# virtual methods
.method public final ۧ(I)I
    .locals 3

    .line 264
    iget-object v0, p0, Ll/۟ܶ۠;->ܽ:[I

    .line 251
    invoke-super {p0, p1}, Ll/۟ܶ۠;->֫(I)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 264
    aget v0, v0, v1

    const/4 v1, 0x0

    :goto_0
    if-ge v0, p1, :cond_1

    .line 267
    iget-object v2, p0, Ll/֫᩸۠;->ᩳ:Ljava/util/BitSet;

    invoke-virtual {v2, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 75
    div-int/lit8 v1, v1, 0x8

    mul-int/lit8 v1, v1, 0x8

    add-int/lit8 v1, v1, 0x8

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    return v1
.end method

.method public final ܽ(I)V
    .locals 1

    .line 260
    iget-object v0, p0, Ll/֫᩸۠;->ᩳ:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->set(I)V

    return-void
.end method
