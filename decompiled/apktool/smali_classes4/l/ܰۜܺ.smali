.class public final Ll/ܰۜܺ;
.super Ll/ۗۜܺ;
.source "S4UL"


# instance fields
.field public final ۗ:Ll/۬ܺܺ;


# direct methods
.method public constructor <init>(Ll/۬ܺܺ;)V
    .locals 2

    .line 52
    invoke-virtual {p1}, Ll/۬ܺܺ;->ᩴ()I

    move-result v0

    .line 55
    invoke-static {v0}, Ll/֨ۧܺ;->ۧ(I)I

    move-result v0

    .line 56
    invoke-virtual {p1}, Ll/۬ܺܺ;->֡()I

    move-result v1

    add-int/2addr v1, v0

    const/4 v0, 0x1

    add-int/2addr v1, v0

    .line 40
    invoke-direct {p0, v0, v1}, Ll/ۗۜܺ;-><init>(II)V

    .line 42
    iput-object p1, p0, Ll/ܰۜܺ;->ۗ:Ll/۬ܺܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗۜܺ;)I
    .locals 1

    .line 107
    check-cast p1, Ll/ܰۜܺ;

    .line 109
    iget-object v0, p0, Ll/ܰۜܺ;->ۗ:Ll/۬ܺܺ;

    iget-object p1, p1, Ll/ܰۜܺ;->ۗ:Ll/۬ܺܺ;

    invoke-virtual {v0, p1}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result p1

    return p1
.end method

.method public final ֫()Ll/ۘۜܺ;
    .locals 1

    .line 64
    sget-object v0, Ll/ۘۜܺ;->ۡ֫:Ll/ۘۜܺ;

    return-object v0
.end method

.method public final ֫(Ll/֫ۜܺ;)V
    .locals 0

    return-void
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ܰۜܺ;->ۗ:Ll/۬ܺܺ;

    invoke-virtual {v0}, Ll/۬ܺܺ;->ۚ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V
    .locals 5

    .line 80
    iget-object p1, p0, Ll/ܰۜܺ;->ۗ:Ll/۬ܺܺ;

    invoke-virtual {p1}, Ll/۬ܺܺ;->ܺ()Ll/ۧᩴܺ;

    move-result-object v0

    .line 81
    invoke-virtual {p1}, Ll/۬ܺܺ;->ᩴ()I

    move-result v1

    .line 83
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->֫()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 84
    invoke-static {v1}, Ll/֨ۧܺ;->ۧ(I)I

    move-result v2

    .line 85
    invoke-static {v1}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "utf16_size: "

    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 84
    invoke-virtual {p2, v2, v3}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 86
    invoke-virtual {v0}, Ll/ۧᩴܺ;->֫()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p1}, Ll/۬ܺܺ;->ۚ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v2, p1}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 89
    :cond_0
    invoke-virtual {p2, v1}, Ll/ᩳᩴܺ;->ۜ(I)I

    .line 90
    invoke-virtual {p2, v0}, Ll/ᩳᩴܺ;->֫(Ll/ۧᩴܺ;)V

    const/4 p1, 0x0

    .line 91
    invoke-virtual {p2, p1}, Ll/ᩳᩴܺ;->ᩳ(I)V

    return-void
.end method
