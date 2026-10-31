.class public final Ll/᩹ۢۚ;
.super Ll/᩷۬֡;
.source "G5A1"


# instance fields
.field public final ᩶:Ll/᩻ۡۚ;

.field public final ᩸:Ll/ۜ᩷ۚ;

.field public final ᩹:Ll/۟ۢۚ;


# direct methods
.method public constructor <init>(Ll/᩻ۡۚ;Ll/۟ۢۚ;Ll/ۜ᩷ۚ;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Ll/᩹ۢۚ;->᩶:Ll/᩻ۡۚ;

    .line 51
    iput-object p2, p0, Ll/᩹ۢۚ;->᩹:Ll/۟ۢۚ;

    .line 52
    iput-object p3, p0, Ll/᩹ۢۚ;->᩸:Ll/ۜ᩷ۚ;

    return-void
.end method


# virtual methods
.method public final getAnnotations()Ljava/util/Set;
    .locals 1

    .line 70
    iget-object v0, p0, Ll/᩹ۢۚ;->᩸:Ll/ۜ᩷ۚ;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Ll/᩹ۢۚ;->᩹:Ll/۟ۢۚ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 51
    :cond_0
    iget-object v0, v0, Ll/۟ۢۚ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/᩹ۢۚ;->᩶:Ll/᩻ۡۚ;

    .line 51
    iget-object v0, v0, Ll/᩻ۡۚ;->᩹:Ll/۟ۢۚ;

    iget-object v0, v0, Ll/۟ۢۚ;->᩹:Ljava/lang/String;

    return-object v0
.end method
