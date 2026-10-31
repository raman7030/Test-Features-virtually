.class public final Ll/ۢۛۡ;
.super Ll/ۘۛۡ;
.source "91U1"


# direct methods
.method public constructor <init>(ILl/ۖۛۡ;)V
    .locals 5

    .line 163
    new-array v0, p1, [Ll/ᩴۛۡ;

    invoke-direct {p0, v0, p2}, Ll/ۘۛۡ;-><init>([Ll/ᩴۛۡ;Ll/ۖۛۡ;)V

    if-eqz p1, :cond_2

    const/16 p2, 0x2710

    if-ge p1, p2, :cond_2

    .line 167
    div-int v0, p2, p1

    add-int/lit8 v1, p1, -0x1

    mul-int v2, v0, v1

    sub-int/2addr p2, v2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_1

    if-ne v2, v1, :cond_0

    .line 171
    iget-object v3, p0, Ll/ۘۛۡ;->ܽ:[Ll/ᩴۛۡ;

    new-instance v4, Ll/ᩴۛۡ;

    invoke-direct {v4, p0, p2}, Ll/ᩴۛۡ;-><init>(Ll/ۘۛۡ;I)V

    aput-object v4, v3, v2

    goto :goto_1

    .line 173
    :cond_0
    iget-object v3, p0, Ll/ۘۛۡ;->ܽ:[Ll/ᩴۛۡ;

    new-instance v4, Ll/ᩴۛۡ;

    invoke-direct {v4, p0, v0}, Ll/ᩴۛۡ;-><init>(Ll/ۘۛۡ;I)V

    aput-object v4, v3, v2

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void

    .line 165
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "count="

    .line 0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 165
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
