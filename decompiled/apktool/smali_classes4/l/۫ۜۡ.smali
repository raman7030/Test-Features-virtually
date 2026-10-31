.class public final Ll/۫ۜۡ;
.super Ll/۬ۗܿ;
.source "08W3"


# instance fields
.field public final synthetic ֫֫:I

.field public final synthetic ۟:Ll/ۨۜۡ;


# direct methods
.method public constructor <init>(Ll/ۨۜۡ;Ll/ۗܺ᩷;I)V
    .locals 0

    .line 79
    iput-object p1, p0, Ll/۫ۜۡ;->۟:Ll/ۨۜۡ;

    iput p3, p0, Ll/۫ۜۡ;->֫֫:I

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 2

    .line 84
    :try_start_0
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-gtz v0, :cond_0

    .line 89
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 92
    :cond_0
    iget v1, p0, Ll/۫ۜۡ;->֫֫:I

    if-le v0, v1, :cond_1

    const v0, 0x7f120794

    .line 93
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 97
    :cond_1
    new-instance v1, Ll/۬ۜۡ;

    invoke-direct {v1, p0, v0}, Ll/۬ۜۡ;-><init>(Ll/۫ۜۡ;I)V

    .line 128
    invoke-virtual {v1}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
