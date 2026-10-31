.class public final Ll/ܺ᩺ۖ;
.super Ll/ܽۨۖ;
.source "D9GX"


# instance fields
.field public ۜ:B

.field public ܳ:Ljava/util/EnumSet;

.field public ܿ:Ljava/util/EnumSet;

.field public ᩻:Ljava/util/EnumSet;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ll/ܽۨۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۖ()Z
    .locals 2

    .line 79
    iget-byte v0, p0, Ll/ܺ᩺ۖ;->ۜ:B

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ()Ljava/util/Set;
    .locals 1

    .line 91
    iget-object v0, p0, Ll/ܺ᩺ۖ;->ܿ:Ljava/util/EnumSet;

    return-object v0
.end method

.method public final ۡ()Z
    .locals 2

    .line 61
    iget-byte v0, p0, Ll/ܺ᩺ۖ;->ۜ:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()Ljava/util/EnumSet;
    .locals 1

    .line 83
    iget-object v0, p0, Ll/ܺ᩺ۖ;->᩻:Ljava/util/EnumSet;

    return-object v0
.end method

.method public final ۧ(Ll/֡֫ۘ;)V
    .locals 3

    const/4 v0, 0x2

    .line 43
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܿ(I)V

    .line 44
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܿ()B

    move-result v0

    iput-byte v0, p0, Ll/ܺ᩺ۖ;->ۜ:B

    .line 45
    invoke-virtual {p1}, Ll/ۤܰۖ;->ܿ()B

    .line 46
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    move-result-wide v0

    const-class v2, Ll/ۢۨۖ;

    invoke-static {v0, v1, v2}, Ll/ܶܰۖ;->֫(JLjava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ᩺ۖ;->᩻:Ljava/util/EnumSet;

    .line 47
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    move-result-wide v0

    const-class v2, Ll/᩷ۨۖ;

    invoke-static {v0, v1, v2}, Ll/ܶܰۖ;->֫(JLjava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ᩺ۖ;->ܿ:Ljava/util/EnumSet;

    .line 48
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۜ()J

    move-result-wide v0

    const-class p1, Ll/ۨ۫ۖ;

    invoke-static {v0, v1, p1}, Ll/ܶܰۖ;->֫(JLjava/lang/Class;)Ljava/util/EnumSet;

    move-result-object p1

    iput-object p1, p0, Ll/ܺ᩺ۖ;->ܳ:Ljava/util/EnumSet;

    return-void
.end method

.method public final ܺ()Z
    .locals 2

    .line 70
    iget-byte v0, p0, Ll/ܺ᩺ۖ;->ۜ:B

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()Ljava/util/EnumSet;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ܺ᩺ۖ;->ܳ:Ljava/util/EnumSet;

    return-object v0
.end method
