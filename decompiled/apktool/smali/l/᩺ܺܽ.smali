.class public final Ll/᩺ܺܽ;
.super Ljava/lang/Object;
.source "S5VI"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ᩶:Ll/ܰܺܽ;

.field public final ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ܰܺܽ;)V
    .locals 6

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ܺܽ;->᩶:Ll/ܰܺܽ;

    .line 104
    iget-wide v0, p1, Ll/ۤܺܽ;->᩸:J

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    cmp-long v5, v0, v2

    if-nez v5, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-wide v2, p1, Ll/ۤܺܽ;->۬:J

    div-long/2addr v2, v0

    long-to-int p1, v2

    .line 35
    :goto_0
    iput p1, p0, Ll/᩺ܺܽ;->᩸:I

    .line 36
    iput v4, p0, Ll/᩺ܺܽ;->᩹:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 40
    iget v0, p0, Ll/᩺ܺܽ;->᩹:I

    iget v1, p0, Ll/᩺ܺܽ;->᩸:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 45
    iget v0, p0, Ll/᩺ܺܽ;->᩹:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/᩺ܺܽ;->᩹:I

    iget-object v1, p0, Ll/᩺ܺܽ;->᩶:Ll/ܰܺܽ;

    invoke-virtual {v1, v0}, Ll/ܰܺܽ;->֫(I)Ll/ۨܺܽ;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 1

    .line 50
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
