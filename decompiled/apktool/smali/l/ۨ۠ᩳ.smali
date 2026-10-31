.class public final Ll/ۨ۠ᩳ;
.super Ll/۟ܶۡ;
.source "3B3L"


# instance fields
.field public final synthetic ۜ:Lbin/mt/plugin/api/util/ResultCallback;

.field public final synthetic ܳ:Ll/᩹ܶᩳ;

.field public final synthetic ᩻:Ll/ܽ֨ᩳ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x5d

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    return-void
.end method

.method public constructor <init>(Ll/᩹ܶᩳ;Ll/ܽ֨ᩳ;Lbin/mt/plugin/api/util/ResultCallback;)V
    .locals 0

    .line 2058
    iput-object p1, p0, Ll/ۨ۠ᩳ;->ܳ:Ll/᩹ܶᩳ;

    iput-object p2, p0, Ll/ۨ۠ᩳ;->᩻:Ll/ܽ֨ᩳ;

    iput-object p3, p0, Ll/ۨ۠ᩳ;->ۜ:Lbin/mt/plugin/api/util/ResultCallback;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public native ֫()V
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 2085
    iget-object v0, p0, Ll/ۨ۠ᩳ;->ܳ:Ll/᩹ܶᩳ;

    iget-object v1, p0, Ll/ۨ۠ᩳ;->᩻:Ll/ܽ֨ᩳ;

    invoke-static {v0, p1, v1}, Ll/᩹ܶᩳ;->֫(Ll/᩹ܶᩳ;Ljava/lang/Exception;Ll/ܽ֨ᩳ;)V

    .line 2086
    iget-object v0, p0, Ll/ۨ۠ᩳ;->ۜ:Lbin/mt/plugin/api/util/ResultCallback;

    if-eqz v0, :cond_0

    .line 2087
    invoke-static {p1}, Ll/ᩳ᩸ۡ;->֫(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/util/ResultCallback;->onFailure(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 2062
    iget-object v0, p0, Ll/ۨ۠ᩳ;->ܳ:Ll/᩹ܶᩳ;

    invoke-static {v0}, Ll/᩹ܶᩳ;->ܶ(Ll/᩹ܶᩳ;)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f1201da

    goto :goto_0

    :cond_0
    const v0, 0x7f1208d2

    :goto_0
    iget-object v1, p0, Ll/ۨ۠ᩳ;->᩻:Ll/ܽ֨ᩳ;

    invoke-virtual {p0, v1, v0}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public native ܿ()V
.end method

.method public final ᩳ()V
    .locals 0

    .line 2093
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
