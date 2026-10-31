.class public final Ll/ۗᩳܺ;
.super Ll/ۙᩳܺ;
.source "1BCG"


# instance fields
.field public final ܳ:Ll/ᩳܿܺ;


# direct methods
.method public constructor <init>(Ll/᩹ᩳܺ;Ll/۫ܺܺ;ILl/۬ᩳܺ;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۙᩳܺ;-><init>(Ll/᩹ᩳܺ;Ll/۫ܺܺ;ILl/۠ᩳܺ;)V

    .line 47
    new-instance p1, Ll/ᩳܿܺ;

    invoke-virtual {p0}, Ll/ۙᩳܺ;->ۧ()I

    move-result p2

    .line 32
    invoke-direct {p1, p2}, Ll/ܿᩴܺ;-><init>(I)V

    .line 47
    iput-object p1, p0, Ll/ۗᩳܺ;->ܳ:Ll/ᩳܿܺ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final ֫(IILl/᩶ܺܺ;Ll/ܰᩳܺ;)Ll/ۛᩳܺ;
    .locals 2

    .line 90
    new-instance v0, Ll/ܽܿܺ;

    .line 91
    invoke-virtual {p0}, Ll/ۙᩳܺ;->ܽ()Ll/۫ܺܺ;

    move-result-object v1

    invoke-direct {v0, v1, p2, p3, p4}, Ll/ܽܿܺ;-><init>(Ll/۫ܺܺ;ILl/᩶ܺܺ;Ll/ܰᩳܺ;)V

    .line 93
    iget-object p2, p0, Ll/ۗᩳܺ;->ܳ:Ll/ᩳܿܺ;

    invoke-virtual {p2, p1, v0}, Ll/ܿᩴܺ;->֫(ILl/ܽܿܺ;)V

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    const-string v0, "method"

    return-object v0
.end method

.method public final ᩻()Ll/ᩳܿܺ;
    .locals 1

    .line 56
    invoke-virtual {p0}, Ll/ۙᩳܺ;->ܳ()V

    .line 57
    iget-object v0, p0, Ll/ۗᩳܺ;->ܳ:Ll/ᩳܿܺ;

    return-object v0
.end method
