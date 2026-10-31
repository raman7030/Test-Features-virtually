.class public final Ll/ᩴܰۘ;
.super Ll/᩷ܽᩴ;
.source "QUZ"


# instance fields
.field public final ۙ:Ll/֨ۧᩴ;


# direct methods
.method public constructor <init>(Ll/֨ۧᩴ;II)V
    .locals 0

    .line 200
    invoke-direct {p0, p2, p3}, Ll/᩷ܽᩴ;-><init>(II)V

    .line 201
    iput-object p1, p0, Ll/ᩴܰۘ;->ۙ:Ll/֨ۧᩴ;

    return-void
.end method

.method public constructor <init>(Ll/᩵ܰۘ;)V
    .locals 1

    const/4 v0, 0x0

    .line 195
    invoke-direct {p0, v0}, Ll/᩷ܽᩴ;-><init>(I)V

    .line 196
    iput-object p1, p0, Ll/ᩴܰۘ;->ۙ:Ll/֨ۧᩴ;

    return-void
.end method


# virtual methods
.method public final ֫(I)C
    .locals 1

    .line 211
    iget-object v0, p0, Ll/ᩴܰۘ;->ۙ:Ll/֨ۧᩴ;

    invoke-interface {v0, p1}, Ll/֨ۧᩴ;->getChar(I)C

    move-result p1

    return p1
.end method

.method public final ֫(II)Ll/ܽܽᩴ;
    .locals 2

    .line 216
    new-instance v0, Ll/ᩴܰۘ;

    iget-object v1, p0, Ll/ᩴܰۘ;->ۙ:Ll/֨ۧᩴ;

    invoke-direct {v0, v1, p1, p2}, Ll/ᩴܰۘ;-><init>(Ll/֨ۧᩴ;II)V

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 206
    iget-object v0, p0, Ll/ᩴܰۘ;->ۙ:Ll/֨ۧᩴ;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
