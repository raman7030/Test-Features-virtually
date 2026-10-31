.class public final Ll/ܺۛۡ;
.super Ll/ۘۛۡ;
.source "91U1"


# direct methods
.method public constructor <init>(Ll/ۜۗܽ;)V
    .locals 6

    const v0, 0x45dac000    # 7000.0f

    float-to-int v0, v0

    rsub-int v1, v0, 0x2710

    .line 142
    filled-new-array {v0, v1}, [I

    move-result-object v0

    const/4 v1, 0x2

    new-array v2, v1, [Ll/ᩴۛۡ;

    .line 146
    invoke-direct {p0, v2, p1}, Ll/ۘۛۡ;-><init>([Ll/ᩴۛۡ;Ll/ۖۛۡ;)V

    const/4 p1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge p1, v1, :cond_0

    .line 149
    aget v3, v0, p1

    add-int/2addr v2, v3

    .line 151
    iget-object v4, p0, Ll/ۘۛۡ;->ܽ:[Ll/ᩴۛۡ;

    new-instance v5, Ll/ᩴۛۡ;

    invoke-direct {v5, p0, v3}, Ll/ᩴۛۡ;-><init>(Ll/ۘۛۡ;I)V

    aput-object v5, v4, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    const/16 p1, 0x2710

    if-ne v2, p1, :cond_1

    return-void

    .line 154
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
