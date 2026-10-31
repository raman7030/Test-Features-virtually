.class public final Ll/۟۫֡;
.super Ll/۟۬֡;
.source "I4QP"

# interfaces
.implements Ll/֡ۧۚ;
.implements Ll/֨֫ۚ;


# static fields
.field public static final ۗ:Ll/ۘۗ֡;


# instance fields
.field public final ۙ:I

.field public ᩶:Ll/۠ܽۚ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 47
    sget-object v0, Ll/ۘۗ֡;->ۨ:Ll/ۘۗ֡;

    sput-object v0, Ll/۟۫֡;->ۗ:Ll/ۘۗ֡;

    return-void
.end method

.method public constructor <init>(Ll/֨ۗ֡;ILl/۠ܽۚ;)V
    .locals 1

    .line 56
    invoke-direct {p0, p1}, Ll/۟۬֡;-><init>(Ll/֨ۗ֡;)V

    .line 194
    sget p1, Ll/᩹ۗ֡;->֫:I

    if-lez p2, :cond_0

    const/16 p1, 0xa

    if-ge p2, p1, :cond_0

    .line 57
    iput p2, p0, Ll/۟۫֡;->ۙ:I

    .line 58
    iput-object p3, p0, Ll/۟۫֡;->᩶:Ll/۠ܽۚ;

    return-void

    .line 195
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 197
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 p3, 0x1

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p2, p3, v0

    const-string p2, "Invalid verification error value: %d. Must be between 1 and 9, inclusive"

    .line 196
    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final getReference()Ll/۠ܽۚ;
    .locals 1

    .line 69
    iget-object v0, p0, Ll/۟۫֡;->᩶:Ll/۠ܽۚ;

    return-object v0
.end method

.method public final ֡()I
    .locals 2

    .line 74
    iget-object v0, p0, Ll/۟۫֡;->᩶:Ll/۠ܽۚ;

    .line 58
    instance-of v1, v0, Ll/ܶܽۚ;

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 60
    :cond_0
    instance-of v1, v0, Ll/᩸ܽۚ;

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    .line 62
    :cond_1
    instance-of v1, v0, Ll/ᩴܽۚ;

    if-eqz v1, :cond_2

    const/4 v0, 0x2

    goto :goto_0

    .line 64
    :cond_2
    instance-of v1, v0, Ll/ۚܽۚ;

    if-eqz v1, :cond_3

    const/4 v0, 0x3

    goto :goto_0

    .line 66
    :cond_3
    instance-of v1, v0, Ll/֡ܽۚ;

    if-eqz v1, :cond_4

    const/4 v0, 0x4

    goto :goto_0

    .line 68
    :cond_4
    instance-of v1, v0, Ll/ۘܽۚ;

    if-eqz v1, :cond_5

    const/4 v0, 0x5

    goto :goto_0

    .line 70
    :cond_5
    instance-of v0, v0, Ll/᩵ܽۚ;

    if-eqz v0, :cond_6

    const/4 v0, 0x6

    :goto_0
    return v0

    .line 73
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid reference"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֨()Ljava/lang/String;
    .locals 1

    .line 43
    invoke-virtual {p0}, Ll/۟۬֡;->ۢ()Ll/֨ۗ֡;

    move-result-object v0

    iget-object v0, v0, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ll/᩵ۡۚ;)V
    .locals 1

    .line 69
    iget-object v0, p0, Ll/۟۫֡;->᩶:Ll/۠ܽۚ;

    .line 84
    invoke-virtual {p1, v0}, Ll/᩵ۡۚ;->֫(Ll/۠ܽۚ;)Ll/ۨۢۚ;

    move-result-object p1

    iput-object p1, p0, Ll/۟۫֡;->᩶:Ll/۠ܽۚ;

    return-void
.end method

.method public final ۫()Ll/ۘۗ֡;
    .locals 1

    .line 79
    sget-object v0, Ll/۟۫֡;->ۗ:Ll/ۘۗ֡;

    return-object v0
.end method

.method public final ᩵()I
    .locals 1

    .line 63
    iget v0, p0, Ll/۟۫֡;->ۙ:I

    return v0
.end method
