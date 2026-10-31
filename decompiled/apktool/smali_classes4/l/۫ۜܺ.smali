.class public final Ll/۫ۜܺ;
.super Ll/ܺۜܺ;
.source "P4QJ"


# instance fields
.field public final ۙ:Ll/۬ܺܺ;

.field public final ᩶:Ll/᩺ܺܺ;

.field public ᩹:Ll/ᩳ᩷ܺ;


# direct methods
.method public constructor <init>(Ll/᩺ܺܺ;)V
    .locals 7

    .line 52
    invoke-direct {p0}, Ll/ܺۜܺ;-><init>()V

    if-eqz p1, :cond_4

    .line 57
    iput-object p1, p0, Ll/۫ۜܺ;->᩶:Ll/᩺ܺܺ;

    .line 72
    invoke-virtual {p1}, Ll/᩺ܺܺ;->ۘ()Ll/ܰܺܺ;

    move-result-object v0

    .line 73
    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v1

    .line 74
    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 v3, v1, 0x1

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 76
    invoke-virtual {p1}, Ll/᩺ܺܺ;->ᩳ()Ll/۟ܺܺ;

    move-result-object v3

    .line 92
    invoke-virtual {v3}, Ll/۟ܺܺ;->֡()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v5, 0x5b

    if-ne v3, v5, :cond_0

    const/16 v3, 0x4c

    .line 76
    :cond_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    .line 79
    invoke-virtual {v0, v3}, Ll/ܿᩴܺ;->getType(I)Ll/۟ܺܺ;

    move-result-object v6

    .line 92
    invoke-virtual {v6}, Ll/۟ܺܺ;->֡()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-ne v6, v5, :cond_1

    const/16 v6, 0x4c

    .line 79
    :cond_1
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 82
    :cond_2
    new-instance v0, Ll/۬ܺܺ;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/۬ܺܺ;-><init>(Ljava/lang/String;)V

    .line 58
    iput-object v0, p0, Ll/۫ۜܺ;->ۙ:Ll/۬ܺܺ;

    .line 60
    invoke-virtual {p1}, Ll/᩺ܺܺ;->ۘ()Ll/ܰܺܺ;

    move-result-object p1

    .line 61
    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v0

    if-nez v0, :cond_3

    const/4 p1, 0x0

    goto :goto_1

    .line 62
    :cond_3
    new-instance v0, Ll/ᩳ᩷ܺ;

    invoke-direct {v0, p1}, Ll/ᩳ᩷ܺ;-><init>(Ll/ۧۖܺ;)V

    move-object p1, v0

    :goto_1
    iput-object p1, p0, Ll/۫ۜܺ;->᩹:Ll/ᩳ᩷ܺ;

    return-void

    .line 54
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "prototype == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()Ll/ۘۜܺ;
    .locals 1

    .line 106
    sget-object v0, Ll/ۘۜܺ;->ۢ֫:Ll/ۘۜܺ;

    return-object v0
.end method

.method public final ֫(Ll/֫ۜܺ;)V
    .locals 3

    .line 122
    invoke-virtual {p1}, Ll/֫ۜܺ;->ᩴ()Ll/֫᩷ܺ;

    move-result-object v0

    .line 123
    invoke-virtual {p1}, Ll/֫ۜܺ;->᩵()Ll/ܽ᩷ܺ;

    move-result-object v1

    .line 124
    invoke-virtual {p1}, Ll/֫ۜܺ;->֡()Ll/ۙۜܺ;

    move-result-object p1

    .line 126
    iget-object v2, p0, Ll/۫ۜܺ;->᩶:Ll/᩺ܺܺ;

    invoke-virtual {v2}, Ll/᩺ܺܺ;->ᩳ()Ll/۟ܺܺ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ܽ᩷ܺ;->ۧ(Ll/۟ܺܺ;)V

    .line 127
    iget-object v1, p0, Ll/۫ۜܺ;->ۙ:Ll/۬ܺܺ;

    invoke-virtual {v0, v1}, Ll/֫᩷ܺ;->ۧ(Ll/۬ܺܺ;)V

    .line 129
    iget-object v0, p0, Ll/۫ۜܺ;->᩹:Ll/ᩳ᩷ܺ;

    if-eqz v0, :cond_0

    .line 130
    invoke-virtual {p1, v0}, Ll/ۙۜܺ;->ۧ(Ll/ۗۜܺ;)Ll/ۗۜܺ;

    move-result-object p1

    check-cast p1, Ll/ᩳ᩷ܺ;

    iput-object p1, p0, Ll/۫ۜܺ;->᩹:Ll/ᩳ᩷ܺ;

    :cond_0
    return-void
.end method

.method public final ֫(Ll/֫ۜܺ;Ll/ᩳᩴܺ;)V
    .locals 10

    .line 139
    invoke-virtual {p1}, Ll/֫ۜܺ;->ᩴ()Ll/֫᩷ܺ;

    move-result-object v0

    iget-object v1, p0, Ll/۫ۜܺ;->ۙ:Ll/۬ܺܺ;

    invoke-virtual {v0, v1}, Ll/֫᩷ܺ;->֫(Ll/۬ܺܺ;)I

    move-result v0

    .line 140
    invoke-virtual {p1}, Ll/֫ۜܺ;->᩵()Ll/ܽ᩷ܺ;

    move-result-object p1

    iget-object v2, p0, Ll/۫ۜܺ;->᩶:Ll/᩺ܺܺ;

    invoke-virtual {v2}, Ll/᩺ܺܺ;->ᩳ()Ll/۟ܺܺ;

    move-result-object v3

    invoke-virtual {p1, v3}, Ll/ܽ᩷ܺ;->֫(Ll/۟ܺܺ;)I

    move-result p1

    .line 141
    iget-object v3, p0, Ll/۫ۜܺ;->᩹:Ll/ᩳ᩷ܺ;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {v3}, Ll/ۗۜܺ;->ܿ()I

    move-result v3

    .line 143
    :goto_0
    invoke-virtual {p2}, Ll/ᩳᩴܺ;->֫()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 144
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    invoke-virtual {v2}, Ll/᩺ܺܺ;->ᩳ()Ll/۟ܺܺ;

    move-result-object v6

    invoke-virtual {v6}, Ll/۟ܺܺ;->֫()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " proto("

    .line 146
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    invoke-virtual {v2}, Ll/᩺ܺܺ;->ۘ()Ll/ܰܺܺ;

    move-result-object v6

    .line 149
    invoke-virtual {v6}, Ll/ܿᩴܺ;->size()I

    move-result v7

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_2

    if-eqz v8, :cond_1

    const-string v9, ", "

    .line 153
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    :cond_1
    invoke-virtual {v6, v8}, Ll/ܿᩴܺ;->getType(I)Ll/۟ܺܺ;

    move-result-object v9

    invoke-virtual {v9}, Ll/۟ܺܺ;->֫()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    const-string v6, ")"

    .line 158
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ܺۜܺ;->᩷()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0x20

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v4, v5}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 160
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "  shorty_idx:      "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " // "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    invoke-virtual {v1}, Ll/۬ܺܺ;->ۚ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x4

    .line 160
    invoke-virtual {p2, v4, v1}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 162
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "  return_type_idx: "

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    invoke-virtual {v2}, Ll/᩺ܺܺ;->ᩳ()Ll/۟ܺܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/۟ܺܺ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 162
    invoke-virtual {p2, v4, v1}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 164
    invoke-static {v3}, Ll/ܳᩴܺ;->ᩳ(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "  parameters_off:  "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v4, v1}, Ll/ᩳᩴܺ;->֫(ILjava/lang/String;)V

    .line 167
    :cond_3
    invoke-virtual {p2, v0}, Ll/ᩳᩴܺ;->ܿ(I)V

    .line 168
    invoke-virtual {p2, p1}, Ll/ᩳᩴܺ;->ܿ(I)V

    .line 169
    invoke-virtual {p2, v3}, Ll/ᩳᩴܺ;->ܿ(I)V

    return-void
.end method

.method public final ۧ()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method
