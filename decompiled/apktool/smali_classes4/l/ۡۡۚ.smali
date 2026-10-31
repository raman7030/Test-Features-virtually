.class public final Ll/ۡۡۚ;
.super Ll/ۜ۬֡;
.source "C5XG"


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ll/᩸ܽۚ;


# direct methods
.method public constructor <init>(Ll/᩻ۡۚ;I)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 676
    iput-object p1, p0, Ll/ۡۡۚ;->᩹:Ll/᩸ܽۚ;

    iput p2, p0, Ll/ۡۡۚ;->᩸:I

    return-void
.end method


# virtual methods
.method public final ۟()I
    .locals 1

    .line 691
    iget v0, p0, Ll/ۡۡۚ;->᩸:I

    return v0
.end method

.method public final ۫ۧ()Ll/᩸ܽۚ;
    .locals 1

    .line 680
    iget-object v0, p0, Ll/ۡۡۚ;->᩹:Ll/᩸ܽۚ;

    return-object v0
.end method

.method public final ܽۧ()Ljava/lang/String;
    .locals 1

    .line 686
    iget-object v0, p0, Ll/ۡۡۚ;->᩹:Ll/᩸ܽۚ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
