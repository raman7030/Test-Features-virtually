.class public final Ll/ᩳ᩷ۚ;
.super Ll/ᩳ۬֡;
.source "I4IS"


# instance fields
.field public ۗ:I

.field public final ۙ:Ll/᩻ۡۚ;

.field public ᩶:I

.field public final ᩹:Ljava/util/Set;


# direct methods
.method public constructor <init>(ILl/᩻ۡۚ;Ll/ۛ۬ܺ;)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 47
    iput v0, p0, Ll/ᩳ᩷ۚ;->᩶:I

    .line 51
    iput p1, p0, Ll/ᩳ᩷ۚ;->ۗ:I

    .line 52
    iput-object p2, p0, Ll/ᩳ᩷ۚ;->ۙ:Ll/᩻ۡۚ;

    .line 53
    iput-object p3, p0, Ll/ᩳ᩷ۚ;->᩹:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final getElements()Ljava/util/Set;
    .locals 1

    .line 70
    iget-object v0, p0, Ll/ᩳ᩷ۚ;->᩹:Ljava/util/Set;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Ll/ᩳ᩷ۚ;->ۙ:Ll/᩻ۡۚ;

    .line 51
    iget-object v0, v0, Ll/᩻ۡۚ;->᩹:Ll/۟ۢۚ;

    iget-object v0, v0, Ll/۟ۢۚ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final getVisibility()I
    .locals 1

    .line 58
    iget v0, p0, Ll/ᩳ᩷ۚ;->ۗ:I

    return v0
.end method
