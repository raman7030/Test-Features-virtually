.class public final Ll/᩵ܰ֡;
.super Ll/ۢܰ֡;
.source "951O"

# interfaces
.implements Ll/ܺܽۚ;


# instance fields
.field public final ۙ:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;I)V
    .locals 1

    .line 51
    sget-object v0, Ll/֨ۗ֡;->۟᩻:Ll/֨ۗ֡;

    invoke-direct {p0, p1, v0, p2}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    .line 53
    invoke-virtual {p1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object p1

    add-int/lit8 p2, p2, 0x2

    invoke-virtual {p1, p2}, Ll/ۘۨ֡;->ۢ(I)I

    move-result p1

    iput p1, p0, Ll/᩵ܰ֡;->ۙ:I

    return-void
.end method


# virtual methods
.method public final ֨()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ۙ()Ljava/util/List;
    .locals 1

    .line 59
    new-instance v0, Ll/ᩴܰ֡;

    invoke-direct {v0, p0}, Ll/ᩴܰ֡;-><init>(Ll/᩵ܰ֡;)V

    return-object v0
.end method

.method public final ۚ()I
    .locals 1

    .line 85
    iget v0, p0, Ll/᩵ܰ֡;->ۙ:I

    mul-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0x2

    return v0
.end method
