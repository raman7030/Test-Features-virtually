.class public final Ll/ۖܰ֡;
.super Ll/ۢܰ֡;
.source "950L"

# interfaces
.implements Ll/ۡܽۚ;


# instance fields
.field public final ۙ:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;I)V
    .locals 1

    .line 52
    sget-object v0, Ll/֨ۗ֡;->᩶ܳ:Ll/֨ۗ֡;

    invoke-direct {p0, p1, v0, p2}, Ll/ۢܰ֡;-><init>(Ll/۬ۛ֡;Ll/֨ۗ֡;I)V

    .line 54
    invoke-virtual {p1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object p1

    add-int/lit8 p2, p2, 0x2

    invoke-virtual {p1, p2}, Ll/ۘۨ֡;->ۢ(I)I

    move-result p1

    iput p1, p0, Ll/ۖܰ֡;->ۙ:I

    return-void
.end method


# virtual methods
.method public final ֨()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ۙ()Ljava/util/List;
    .locals 2

    .line 60
    iget-object v0, p0, Ll/ۢܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/ۢܰ֡;->᩹:I

    add-int/lit8 v1, v1, 0x4

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۧ(I)I

    move-result v0

    .line 61
    new-instance v1, Ll/ܺܰ֡;

    invoke-direct {v1, p0, v0}, Ll/ܺܰ֡;-><init>(Ll/ۖܰ֡;I)V

    return-object v1
.end method

.method public final ۚ()I
    .locals 1

    .line 87
    iget v0, p0, Ll/ۖܰ֡;->ۙ:I

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x4

    return v0
.end method
