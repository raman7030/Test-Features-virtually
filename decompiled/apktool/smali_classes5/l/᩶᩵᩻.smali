.class public final Ll/᩶᩵᩻;
.super Ljava/lang/Object;
.source "R8AK"

# interfaces
.implements Ll/ۘ᩵᩻;


# instance fields
.field public final ֫:Ll/۟ܽۘ;

.field public final ۧ:Ll/ۜ۟ۖ;


# direct methods
.method public constructor <init>(Ll/۟ܽۘ;Ll/ۜ۟ۖ;)V
    .locals 0

    .line 1808
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1809
    iput-object p1, p0, Ll/᩶᩵᩻;->֫:Ll/۟ܽۘ;

    .line 1810
    iput-object p2, p0, Ll/᩶᩵᩻;->ۧ:Ll/ۜ۟ۖ;

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 1815
    iget-object v0, p0, Ll/᩶᩵᩻;->֫:Ll/۟ܽۘ;

    iget-object v1, p0, Ll/᩶᩵᩻;->ۧ:Ll/ۜ۟ۖ;

    invoke-virtual {v0, v1}, Ll/۟ܽۘ;->֫(Ll/ۜ۟ۖ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ()V
    .locals 2

    .line 1821
    :try_start_0
    iget-object v0, p0, Ll/᩶᩵᩻;->ۧ:Ll/ۜ۟ۖ;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/ۜ۟ۖ;->cancel(Z)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
