.class public final Ll/᩻ᩳۚ;
.super Ll/ᩳ۬֡;
.source "B4TI"


# instance fields
.field public final ۙ:I

.field public final ᩶:Ljava/lang/String;

.field public final ᩹:Ll/ۛ۬ܺ;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/util/Collection;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput p1, p0, Ll/᩻ᩳۚ;->ۙ:I

    .line 71
    iput-object p2, p0, Ll/᩻ᩳۚ;->᩶:Ljava/lang/String;

    .line 72
    invoke-static {p3}, Ll/᩷ᩳۚ;->֫(Ljava/util/Collection;)Ll/ۛ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩻ᩳۚ;->᩹:Ll/ۛ۬ܺ;

    return-void
.end method


# virtual methods
.method public final getElements()Ljava/util/Set;
    .locals 1

    .line 112
    iget-object v0, p0, Ll/᩻ᩳۚ;->᩹:Ll/ۛ۬ܺ;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 106
    iget-object v0, p0, Ll/᩻ᩳۚ;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final getVisibility()I
    .locals 1

    .line 100
    iget v0, p0, Ll/᩻ᩳۚ;->ۙ:I

    return v0
.end method
