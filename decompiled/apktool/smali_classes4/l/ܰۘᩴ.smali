.class public final Ll/ܰۘᩴ;
.super Ll/ۗۚᩴ;
.source "J1MI"


# instance fields
.field public final ۙ:Ll/֫ۚᩴ;


# direct methods
.method public constructor <init>(Ll/֫ۚᩴ;II)V
    .locals 0

    .line 199
    invoke-direct {p0, p2, p3}, Ll/ۗۚᩴ;-><init>(II)V

    .line 200
    iput-object p1, p0, Ll/ܰۘᩴ;->ۙ:Ll/֫ۚᩴ;

    return-void
.end method

.method public constructor <init>(Ll/ᩳᩴᩴ;)V
    .locals 1

    const/4 v0, 0x0

    .line 194
    invoke-direct {p0, v0}, Ll/ۗۚᩴ;-><init>(I)V

    .line 195
    iput-object p1, p0, Ll/ܰۘᩴ;->ۙ:Ll/֫ۚᩴ;

    return-void
.end method


# virtual methods
.method public final ֫(I)Ljava/lang/Object;
    .locals 1

    .line 210
    iget-object v0, p0, Ll/ܰۘᩴ;->ۙ:Ll/֫ۚᩴ;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(II)Ll/۠ۚᩴ;
    .locals 2

    .line 215
    new-instance v0, Ll/ܰۘᩴ;

    iget-object v1, p0, Ll/ܰۘᩴ;->ۙ:Ll/֫ۚᩴ;

    invoke-direct {v0, v1, p1, p2}, Ll/ܰۘᩴ;-><init>(Ll/֫ۚᩴ;II)V

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 205
    iget-object v0, p0, Ll/ܰۘᩴ;->ۙ:Ll/֫ۚᩴ;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
