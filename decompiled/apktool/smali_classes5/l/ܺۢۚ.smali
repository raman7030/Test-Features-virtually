.class public final Ll/ܺۢۚ;
.super Ll/ܺ۬֡;
.source "M4MG"

# interfaces
.implements Ll/ۘ֫ۚ;


# instance fields
.field public final ۗ:Ll/ܰ᩷ۚ;

.field public ۙ:Ljava/util/Set;

.field public final ᩶:Ll/ᩴۢۚ;

.field public final ᩸:I

.field public final ᩹:Ll/ۜ᩷ۚ;


# direct methods
.method public constructor <init>(Ll/ᩴۢۚ;ILl/ܰ᩷ۚ;Ll/ۜ᩷ۚ;Ljava/util/Set;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Ll/ܺۢۚ;->᩶:Ll/ᩴۢۚ;

    .line 61
    iput p2, p0, Ll/ܺۢۚ;->᩸:I

    .line 62
    iput-object p3, p0, Ll/ܺۢۚ;->ۗ:Ll/ܰ᩷ۚ;

    .line 63
    iput-object p4, p0, Ll/ܺۢۚ;->᩹:Ll/ۜ᩷ۚ;

    .line 64
    iput-object p5, p0, Ll/ܺۢۚ;->ۙ:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final getAnnotations()Ljava/util/Set;
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ܺۢۚ;->᩹:Ll/ۜ᩷ۚ;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Ll/ܺۢۚ;->᩶:Ll/ᩴۢۚ;

    iget-object v0, v0, Ll/ᩴۢۚ;->ۙ:Ll/۟ۢۚ;

    .line 51
    iget-object v0, v0, Ll/۟ۢۚ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ܺۢۚ;->᩶:Ll/ᩴۢۚ;

    iget-object v0, v0, Ll/ᩴۢۚ;->᩹:Ll/᩻ۡۚ;

    .line 51
    iget-object v0, v0, Ll/᩻ۡۚ;->᩹:Ll/۟ۢۚ;

    iget-object v0, v0, Ll/۟ۢۚ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final ۚ֫()Ll/ۤܽۚ;
    .locals 1

    .line 75
    iget-object v0, p0, Ll/ܺۢۚ;->ۗ:Ll/ܰ᩷ۚ;

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ܺۢۚ;->᩶:Ll/ᩴۢۚ;

    iget-object v0, v0, Ll/ᩴۢۚ;->᩸:Ll/᩻ۡۚ;

    .line 51
    iget-object v0, v0, Ll/᩻ۡۚ;->᩹:Ll/۟ۢۚ;

    iget-object v0, v0, Ll/۟ۢۚ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 69
    iget v0, p0, Ll/ܺۢۚ;->᩸:I

    return v0
.end method

.method public final ᩵()Ljava/util/Set;
    .locals 1

    .line 105
    iget-object v0, p0, Ll/ܺۢۚ;->ۙ:Ljava/util/Set;

    return-object v0
.end method
