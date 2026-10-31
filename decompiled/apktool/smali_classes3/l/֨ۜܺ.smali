.class public final Ll/֨ۜܺ;
.super Ll/ܺۜܺ;
.source "73Q2"


# instance fields
.field public final ᩹:Ll/᩸ܺܺ;


# direct methods
.method public constructor <init>(Ll/᩸ܺܺ;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ll/ܺۜܺ;-><init>()V

    .line 47
    iput-object p1, p0, Ll/֨ۜܺ;->᩹:Ll/᩸ܺܺ;

    return-void
.end method

.method private ۧ(Ll/֫ۜܺ;)I
    .locals 3

    .line 102
    iget-object v0, p0, Ll/֨ۜܺ;->᩹:Ll/᩸ܺܺ;

    invoke-virtual {v0}, Ll/᩸ܺܺ;->ܺ()Ll/ܰۡܺ;

    move-result-object v1

    .line 103
    invoke-virtual {v0}, Ll/᩸ܺܺ;->ᩴ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 104
    invoke-virtual {p1}, Ll/֫ۜܺ;->ܳ()Ll/ۜۜܺ;

    move-result-object p1

    .line 105
    check-cast v1, Ll/ۡܺܺ;

    invoke-virtual {p1, v1}, Ll/ۜۜܺ;->֫(Ll/ۡܺܺ;)I

    move-result p1

    return p1

    .line 106
    :cond_0
    invoke-virtual {v0}, Ll/᩸ܺܺ;->֡()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 107
    instance-of v0, v1, Ll/ۘܺܺ;

    if-eqz v0, :cond_1

    .line 108
    check-cast v1, Ll/ۘܺܺ;

    invoke-virtual {v1}, Ll/ۘܺܺ;->ۚ()Ll/᩹ܺܺ;

    move-result-object v1

    .line 110
    :cond_1
    invoke-virtual {p1}, Ll/֫ۜܺ;->ܺ()Ll/᩸ۜܺ;

    move-result-object p1

    .line 111
    check-cast v1, Ll/ܽܺܺ;

    invoke-virtual {p1, v1}, Ll/᩸ۜܺ;->֫(Ll/ܽܺܺ;)I

    move-result p1

    return p1

    .line 113
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unhandled invocation type"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()Ll/ۘۜܺ;
    .locals 1

    .line 55
    sget-object v0, Ll/ۘۜܺ;->ۜ֫:Ll/ۘۜܺ;

    return-object v0
.end method

.method public final ֫(Ll/֫ۜܺ;)V
    .locals 1

    .line 71
    invoke-virtual {p1}, Ll/֫ۜܺ;->ۡ()Ll/۠ۜܺ;

    move-result-object p1

    .line 72
    iget-object v0, p0, Ll/֨ۜܺ;->᩹:Ll/᩸ܺܺ;

    invoke-virtual {p1, v0}, Ll/۠ۜܺ;->ۧ(Ll/᩸ܺܺ;)V

    return-void
.end method

.method public final ֫(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V
    .locals 8

    .line 80
    invoke-direct {p0, p1}, Ll/֨ۜܺ;->ۧ(Ll/֫ۜܺ;)I

    move-result v0

    .line 81
    iget-object v1, p0, Ll/֨ۜܺ;->᩹:Ll/᩸ܺܺ;

    invoke-virtual {v1}, Ll/᩸ܺܺ;->֫ۧ()I

    move-result v2

    .line 82
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->֫()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    .line 83
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ܺۜܺ;->᩷()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x20

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ll/᩸ܺܺ;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v4, v3}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 84
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, " // "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Ll/᩸ܺܺ;->֫(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 85
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "type:     "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x2

    invoke-virtual {p2, v6, v3}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 86
    invoke-static {v4}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v3

    const-string v7, "reserved: "

    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v6, v3}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 87
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ll/᩸ܺܺ;->ܺ()Ll/ܰۡܺ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 88
    invoke-virtual {v1}, Ll/᩸ܺܺ;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 89
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "fieldId:  "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v6, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    goto :goto_0

    .line 91
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "methodId: "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v6, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 93
    :goto_0
    invoke-static {v4}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v6, v0}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 95
    :cond_1
    invoke-virtual {p2, v2}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 96
    invoke-virtual {p2, v4}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 97
    invoke-direct {p0, p1}, Ll/֨ۜܺ;->ۧ(Ll/֫ۜܺ;)I

    move-result p1

    invoke-virtual {p2, p1}, Ll/ᩳᩴܺ;->ܳ(I)V

    .line 98
    invoke-virtual {p2, v4}, Ll/ᩳᩴܺ;->ܳ(I)V

    return-void
.end method

.method public final ۧ()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method
