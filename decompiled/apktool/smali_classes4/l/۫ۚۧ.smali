.class public final Ll/۫ۚۧ;
.super Ljava/lang/Object;
.source "I8KM"

# interfaces
.implements Ll/֨᩷ۧ;


# instance fields
.field public final ֫:Ll/ܺۢۧ;

.field public final ۧ:Ll/ᩳ֨֫;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Ll/ᩳ֨֫;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object v0, p0, Ll/۫ۚۧ;->ۧ:Ll/ᩳ֨֫;

    .line 45
    new-instance v0, Ll/ܺۢۧ;

    const/4 v1, -0x1

    const-string v2, "image/webp"

    invoke-direct {v0, v1, v1, v2}, Ll/ܺۢۧ;-><init>(IILjava/lang/String;)V

    iput-object v0, p0, Ll/۫ۚۧ;->֫:Ll/ܺۢۧ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 1

    .line 72
    iget-object v0, p0, Ll/۫ۚۧ;->֫:Ll/ܺۢۧ;

    invoke-virtual {v0, p1, p2}, Ll/ܺۢۧ;->֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I

    move-result p1

    return p1
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(JJ)V
    .locals 1

    .line 77
    iget-object v0, p0, Ll/۫ۚۧ;->֫:Ll/ܺۢۧ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ܺۢۧ;->֫(JJ)V

    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 1

    .line 66
    iget-object v0, p0, Ll/۫ۚۧ;->֫:Ll/ܺۢۧ;

    invoke-virtual {v0, p1}, Ll/ܺۢۧ;->֫(Ll/᩸᩷ۧ;)V

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 8

    .line 51
    iget-object v0, p0, Ll/۫ۚۧ;->ۧ:Ll/ᩳ֨֫;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 52
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    check-cast p1, Ll/ܺ᩷ۧ;

    const/4 v3, 0x0

    .line 157
    invoke-virtual {p1, v3, v3, v1, v2}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 53
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v4

    const-wide/32 v6, 0x52494646

    cmp-long v2, v4, v6

    if-eqz v2, :cond_0

    goto :goto_0

    .line 178
    :cond_0
    invoke-virtual {p1, v1, v3}, Ll/ܺ᩷ۧ;->ۧ(IZ)Z

    .line 58
    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 60
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    .line 157
    invoke-virtual {p1, v3, v3, v1, v2}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 61
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v0

    const-wide/32 v4, 0x57454250

    cmp-long p1, v0, v4

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    return v3
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 89
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/֨᩷ۧ;
    .locals 0

    return-object p0
.end method
