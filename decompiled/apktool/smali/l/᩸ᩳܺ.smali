.class public final Ll/᩸ᩳܺ;
.super Ljava/lang/Object;
.source "CBF0"

# interfaces
.implements Ll/ۧۖܺ;


# instance fields
.field public final ᩶:I

.field public final ᩸:Ll/ۧᩴܺ;

.field public final ᩹:Ll/ۤܺܺ;


# direct methods
.method public constructor <init>(Ll/ۧᩴܺ;IILl/ۤܺܺ;)V
    .locals 1

    .line 672
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p3, :cond_1

    mul-int/lit8 v0, p3, 0x2

    add-int/2addr v0, p2

    .line 677
    invoke-virtual {p1, p2, v0}, Ll/ۧᩴܺ;->֫(II)Ll/ۧᩴܺ;

    move-result-object p1

    .line 678
    iput-object p1, p0, Ll/᩸ᩳܺ;->᩸:Ll/ۧᩴܺ;

    .line 679
    iput p3, p0, Ll/᩸ᩳܺ;->᩶:I

    .line 680
    iput-object p4, p0, Ll/᩸ᩳܺ;->᩹:Ll/ۤܺܺ;

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p3, :cond_0

    mul-int/lit8 v0, p2, 0x2

    .line 684
    invoke-virtual {p1, v0}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result v0

    .line 687
    :try_start_0
    invoke-virtual {p4, v0}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v0

    check-cast v0, Ll/۫ܺܺ;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 690
    new-instance p2, Ljava/lang/RuntimeException;

    const-string p3, "bogus class cpi"

    invoke-direct {p2, p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_0
    return-void

    .line 674
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "size < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final getType(I)Ll/۟ܺܺ;
    .locals 1

    mul-int/lit8 p1, p1, 0x2

    .line 728
    iget-object v0, p0, Ll/᩸ᩳܺ;->᩸:Ll/ۧᩴܺ;

    invoke-virtual {v0, p1}, Ll/ۧᩴܺ;->ܳ(I)I

    move-result p1

    .line 729
    iget-object v0, p0, Ll/᩸ᩳܺ;->᩹:Ll/ۤܺܺ;

    invoke-virtual {v0, p1}, Ll/ۤܺܺ;->get(I)Ll/ܰۡܺ;

    move-result-object p1

    check-cast p1, Ll/۫ܺܺ;

    invoke-virtual {p1}, Ll/۫ܺܺ;->ܺ()Ll/۟ܺܺ;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 711
    iget v0, p0, Ll/᩸ᩳܺ;->᩶:I

    return v0
.end method

.method public final ֫(Ll/۟ܺܺ;)Ll/ۧۖܺ;
    .locals 1

    .line 737
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "unsupported"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
