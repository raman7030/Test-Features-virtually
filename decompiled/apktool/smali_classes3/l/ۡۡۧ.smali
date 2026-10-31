.class public final Ll/ۡۡۧ;
.super Ljava/lang/Object;
.source "J8PP"

# interfaces
.implements Ll/֨᩷ۧ;


# instance fields
.field public final ֫:Ll/ܺۢۧ;

.field public final ۧ:Ll/ᩳ֨֫;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Ll/ᩳ֨֫;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object v0, p0, Ll/ۡۡۧ;->ۧ:Ll/ᩳ֨֫;

    .line 44
    new-instance v0, Ll/ܺۢۧ;

    const/4 v1, -0x1

    const-string v2, "image/heif"

    invoke-direct {v0, v1, v1, v2}, Ll/ܺۢۧ;-><init>(IILjava/lang/String;)V

    iput-object v0, p0, Ll/ۡۡۧ;->֫:Ll/ܺۢۧ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 1

    .line 62
    iget-object v0, p0, Ll/ۡۡۧ;->֫:Ll/ܺۢۧ;

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

    .line 67
    iget-object v0, p0, Ll/ۡۡۧ;->֫:Ll/ܺۢۧ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ܺۢۧ;->֫(JJ)V

    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ۡۡۧ;->֫:Ll/ܺۢۧ;

    invoke-virtual {v0, p1}, Ll/ܺۢۧ;->֫(Ll/᩸᩷ۧ;)V

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 8

    .line 49
    check-cast p1, Ll/ܺ᩷ۧ;

    const/4 v0, 0x4

    const/4 v1, 0x0

    .line 178
    invoke-virtual {p1, v0, v1}, Ll/ܺ᩷ۧ;->ۧ(IZ)Z

    .line 77
    iget-object v2, p0, Ll/ۡۡۧ;->ۧ:Ll/ᩳ֨֫;

    invoke-virtual {v2, v0}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 78
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    .line 157
    invoke-virtual {p1, v1, v1, v0, v3}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 79
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v3

    const v5, 0x66747970

    int-to-long v5, v5

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    .line 77
    invoke-virtual {v2, v0}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 78
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    .line 157
    invoke-virtual {p1, v1, v1, v0, v3}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 79
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܶ()J

    move-result-wide v2

    const p1, 0x68656963

    int-to-long v4, p1

    cmp-long p1, v2, v4

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
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
