.class public abstract Ll/᩵ۜܺ;
.super Ll/ۡۜܺ;
.source "XBCF"


# instance fields
.field public final ᩶:Ll/ܶܺܺ;


# direct methods
.method public constructor <init>(Ll/ܶܺܺ;)V
    .locals 1

    .line 41
    invoke-virtual {p1}, Ll/ܶܺܺ;->ܳ()Ll/۫ܺܺ;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۡۜܺ;-><init>(Ll/۫ܺܺ;)V

    .line 43
    iput-object p1, p0, Ll/᩵ۜܺ;->᩶:Ll/ܶܺܺ;

    return-void
.end method


# virtual methods
.method public ֫(Ll/֫ۜܺ;)V
    .locals 1

    .line 59
    invoke-super {p0, p1}, Ll/ۡۜܺ;->֫(Ll/֫ۜܺ;)V

    .line 61
    invoke-virtual {p1}, Ll/֫ۜܺ;->ᩴ()Ll/֫᩷ܺ;

    move-result-object p1

    .line 115
    iget-object v0, p0, Ll/᩵ۜܺ;->᩶:Ll/ܶܺܺ;

    .line 62
    invoke-virtual {v0}, Ll/ܶܺܺ;->ܺ()Ll/᩶ܺܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶ܺܺ;->getName()Ll/۬ܺܺ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/֫᩷ܺ;->ۧ(Ll/۬ܺܺ;)V

    return-void
.end method

.method public final ֫(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V
    .locals 7

    .line 70
    invoke-virtual {p1}, Ll/֫ۜܺ;->᩵()Ll/ܽ᩷ܺ;

    move-result-object v0

    .line 71
    invoke-virtual {p1}, Ll/֫ۜܺ;->ᩴ()Ll/֫᩷ܺ;

    move-result-object v1

    .line 72
    iget-object v2, p0, Ll/᩵ۜܺ;->᩶:Ll/ܶܺܺ;

    invoke-virtual {v2}, Ll/ܶܺܺ;->ܺ()Ll/᩶ܺܺ;

    move-result-object v3

    .line 73
    invoke-virtual {p0}, Ll/ۡۜܺ;->ܳ()Ll/۫ܺܺ;

    move-result-object v4

    invoke-virtual {v0, v4}, Ll/ܽ᩷ܺ;->֫(Ll/۫ܺܺ;)I

    move-result v0

    .line 74
    invoke-virtual {v3}, Ll/᩶ܺܺ;->getName()Ll/۬ܺܺ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/֫᩷ܺ;->֫(Ll/۬ܺܺ;)I

    move-result v1

    .line 75
    invoke-virtual {p0, p1}, Ll/᩵ۜܺ;->ۧ(Ll/֫ۜܺ;)I

    move-result p1

    .line 77
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->֫()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 78
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ܺۜܺ;->᩷()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x20

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ll/ܶܺܺ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p2, v3, v2}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 79
    invoke-static {v0}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v2

    const-string v4, "  class_idx: "

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x2

    invoke-virtual {p2, v4, v2}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 80
    invoke-virtual {p0}, Ll/᩵ۜܺ;->ۡ()Ljava/lang/String;

    move-result-object v2

    const-string v5, ":"

    invoke-virtual {v2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 81
    invoke-static {p1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v5

    new-array v6, v4, [Ljava/lang/Object;

    aput-object v2, v6, v3

    const/4 v2, 0x1

    aput-object v5, v6, v2

    const-string v2, "  %-10s %s"

    .line 80
    invoke-static {v2, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v4, v2}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 82
    invoke-static {v1}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "  name_idx:  "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {p2, v3, v2}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 85
    :cond_0
    invoke-virtual {p2, v0}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 86
    invoke-virtual {p2, p1}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 87
    invoke-virtual {p2, v1}, Ll/ᩳᩴܺ;->ܿ(I)V

    return-void
.end method

.method public abstract ۡ()Ljava/lang/String;
.end method

.method public final ۢ()Ll/ܶܺܺ;
    .locals 1

    .line 115
    iget-object v0, p0, Ll/᩵ۜܺ;->᩶:Ll/ܶܺܺ;

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public abstract ۧ(Ll/֫ۜܺ;)I
.end method
