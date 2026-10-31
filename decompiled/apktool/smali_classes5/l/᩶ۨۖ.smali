.class public final Ll/᩶ۨۖ;
.super Ll/ܽۨۖ;
.source "F9GX"


# instance fields
.field public ܳ:Ll/۫ۛۖ;

.field public ܿ:Ljava/util/EnumSet;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ll/ܽۨۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۜ()Ljava/util/EnumSet;
    .locals 1

    .line 87
    iget-object v0, p0, Ll/᩶ۨۖ;->ܿ:Ljava/util/EnumSet;

    return-object v0
.end method

.method public final ۧ(Ll/֡֫ۘ;)V
    .locals 4

    .line 47
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    .line 48
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܿ()B

    .line 49
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܿ()B

    .line 50
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    move-result-wide v0

    const-class v2, Ll/֨ۛۖ;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Ll/ܶܰۖ;->֫(JLjava/lang/Class;Ll/۟۫ۖ;)Ll/᩸ܰۖ;

    move-result-object v0

    check-cast v0, Ll/֨ۛۖ;

    .line 51
    invoke-static {p1}, Ll/ܰ۫ۖ;->֫(Ll/ۤܰۖ;)Ll/᩺۫ۖ;

    .line 52
    invoke-static {p1}, Ll/ܰ۫ۖ;->֫(Ll/ۤܰۖ;)Ll/᩺۫ۖ;

    .line 53
    invoke-static {p1}, Ll/ܰ۫ۖ;->֫(Ll/ۤܰۖ;)Ll/᩺۫ۖ;

    .line 54
    invoke-static {p1}, Ll/ܰ۫ۖ;->֫(Ll/ۤܰۖ;)Ll/᩺۫ۖ;

    const/16 v0, 0x8

    .line 55
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܽ(I)[B

    .line 56
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܽ(I)[B

    .line 57
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    move-result-wide v1

    const-class v3, Ll/֫ۤۖ;

    invoke-static {v1, v2, v3}, Ll/ܶܰۖ;->֫(JLjava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v1

    iput-object v1, p0, Ll/᩶ۨۖ;->ܿ:Ljava/util/EnumSet;

    const/4 v1, 0x4

    .line 58
    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->ܿ(I)V

    .line 47
    new-instance v1, Ll/۫ۛۖ;

    new-array v2, v0, [B

    .line 293
    invoke-virtual {p1, v0, v2}, Ll/ۤܰۖ;->ۧ(I[B)V

    new-array v3, v0, [B

    invoke-virtual {p1, v0, v3}, Ll/ۤܰۖ;->ۧ(I[B)V

    .line 47
    invoke-direct {v1, v2, v3}, Ll/۫ۛۖ;-><init>([B[B)V

    .line 59
    iput-object v1, p0, Ll/᩶ۨۖ;->ܳ:Ll/۫ۛۖ;

    .line 62
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    .line 63
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    return-void
.end method

.method public final ᩷()Ll/۫ۛۖ;
    .locals 1

    .line 91
    iget-object v0, p0, Ll/᩶ۨۖ;->ܳ:Ll/۫ۛۖ;

    return-object v0
.end method
