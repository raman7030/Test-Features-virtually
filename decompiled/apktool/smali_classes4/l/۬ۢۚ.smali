.class public final Ll/۬ۢۚ;
.super Ll/ۘ۬֡;
.source "V5O2"

# interfaces
.implements Ll/ۨۢۚ;


# instance fields
.field public final ۙ:Ll/۟ۢۚ;

.field public final ᩶:Ll/᩻ۡۚ;

.field public ᩸:I

.field public final ᩹:Ll/֫ۡۚ;


# direct methods
.method public constructor <init>(Ll/۟ۢۚ;Ll/֫ۡۚ;Ll/᩻ۡۚ;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 50
    iput v0, p0, Ll/۬ۢۚ;->᩸:I

    .line 54
    iput-object p1, p0, Ll/۬ۢۚ;->ۙ:Ll/۟ۢۚ;

    .line 55
    iput-object p2, p0, Ll/۬ۢۚ;->᩹:Ll/֫ۡۚ;

    .line 56
    iput-object p3, p0, Ll/۬ۢۚ;->᩶:Ll/᩻ۡۚ;

    return-void
.end method


# virtual methods
.method public final ۘ()Ljava/util/List;
    .locals 1

    .line 62
    iget-object v0, p0, Ll/۬ۢۚ;->᩹:Ll/֫ۡۚ;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/۬ۢۚ;->᩶:Ll/᩻ۡۚ;

    .line 51
    iget-object v0, v0, Ll/᩻ۡۚ;->᩹:Ll/۟ۢۚ;

    iget-object v0, v0, Ll/۟ۢۚ;->᩹:Ljava/lang/String;

    return-object v0
.end method
