.class public final Ll/ۜۧۘ;
.super Ljava/lang/Object;
.source "P9GY"


# instance fields
.field public ֫:Ll/֡ۨۖ;

.field public ۜ:Ll/᩷ۧۘ;

.field public ۡ:Ll/֡ܽۘ;

.field public ۢ:[B

.field public ۧ:Ljava/util/EnumSet;

.field public ܳ:Ljava/util/Set;

.field public final ܽ:Ljava/util/UUID;

.field public ܿ:I

.field public final ᩳ:Z

.field public ᩷:Ll/ۚۨۖ;

.field public ᩻:[B


# direct methods
.method public constructor <init>(Ljava/util/UUID;Ljava/lang/String;ILl/ۙ֫ۘ;)V
    .locals 1

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Ll/ۜۧۘ;->ܽ:Ljava/util/UUID;

    const/4 p1, 0x0

    new-array v0, p1, [B

    .line 72
    iput-object v0, p0, Ll/ۜۧۘ;->᩻:[B

    .line 73
    invoke-virtual {p4}, Ll/ۙ֫ۘ;->֫()Ljava/util/EnumSet;

    move-result-object p4

    invoke-static {p4}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object p4

    iput-object p4, p0, Ll/ۜۧۘ;->ۧ:Ljava/util/EnumSet;

    const/4 p4, 0x1

    .line 74
    iput p4, p0, Ll/ۜۧۘ;->ܿ:I

    .line 75
    iput-boolean p1, p0, Ll/ۜۧۘ;->ᩳ:Z

    .line 76
    new-instance p1, Ll/֡ܽۘ;

    invoke-direct {p1, p2, p3}, Ll/֡ܽۘ;-><init>(Ljava/lang/String;I)V

    iput-object p1, p0, Ll/ۜۧۘ;->ۡ:Ll/֡ܽۘ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 222
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ConnectionContext{\n  serverGuid="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۜۧۘ;->ۡ:Ll/֡ܽۘ;

    invoke-virtual {v1}, Ll/֡ܽۘ;->ᩳ()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n  serverName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۜۧۘ;->ۡ:Ll/֡ܽۘ;

    .line 223
    invoke-virtual {v1}, Ll/֡ܽۘ;->ܿ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\',\n  negotiatedProtocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۜۧۘ;->ۜ:Ll/᩷ۧۘ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n  clientGuid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۜۧۘ;->ܽ:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n  clientCapabilities="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۜۧۘ;->ۧ:Ljava/util/EnumSet;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n  serverCapabilities="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۜۧۘ;->ۡ:Ll/֡ܽۘ;

    .line 227
    invoke-virtual {v1}, Ll/֡ܽۘ;->֫()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n  clientSecurityMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۜۧۘ;->ܿ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",\n  serverSecurityMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۜۧۘ;->ۡ:Ll/֡ܽۘ;

    .line 229
    invoke-virtual {v1}, Ll/֡ܽۘ;->ܽ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",\n  server=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۜۧۘ;->ۡ:Ll/֡ܽۘ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\'\n}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/֡ۧۘ;)V
    .locals 8

    .line 81
    invoke-virtual {p1}, Ll/֡ۧۘ;->ܽ()Ll/᩺ۨۖ;

    move-result-object v0

    .line 82
    invoke-virtual {p1}, Ll/֡ۧۘ;->ܳ()Ll/֡ܽۘ;

    move-result-object v1

    iput-object v1, p0, Ll/ۜۧۘ;->ۡ:Ll/֡ܽۘ;

    .line 83
    new-instance v1, Ll/᩷ۧۘ;

    invoke-virtual {v0}, Ll/᩺ۨۖ;->᩷()Ll/᩹ۛۖ;

    move-result-object v3

    invoke-virtual {v0}, Ll/᩺ۨۖ;->ۡ()I

    move-result v4

    invoke-virtual {v0}, Ll/᩺ۨۖ;->ۢ()I

    move-result v5

    invoke-virtual {v0}, Ll/᩺ۨۖ;->ܺ()I

    move-result v6

    .line 193
    sget-object v2, Ll/ۛۛۖ;->۬:Ll/ۛۛۖ;

    .line 128
    iget-object v7, p0, Ll/ۜۧۘ;->ۡ:Ll/֡ܽۘ;

    invoke-virtual {v7}, Ll/֡ܽۘ;->֫()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    move-object v2, v1

    .line 83
    invoke-direct/range {v2 .. v7}, Ll/᩷ۧۘ;-><init>(Ll/᩹ۛۖ;IIIZ)V

    iput-object v1, p0, Ll/ۜۧۘ;->ۜ:Ll/᩷ۧۘ;

    .line 84
    invoke-virtual {p1}, Ll/֡ۧۘ;->֫()Ll/֡ۨۖ;

    move-result-object v1

    iput-object v1, p0, Ll/ۜۧۘ;->֫:Ll/֡ۨۖ;

    .line 85
    invoke-virtual {p1}, Ll/֡ۧۘ;->ۧ()Ljava/util/Set;

    move-result-object v1

    iput-object v1, p0, Ll/ۜۧۘ;->ܳ:Ljava/util/Set;

    .line 86
    invoke-virtual {p1}, Ll/֡ۧۘ;->ᩳ()Ll/ۚۨۖ;

    move-result-object v1

    iput-object v1, p0, Ll/ۜۧۘ;->᩷:Ll/ۚۨۖ;

    .line 87
    invoke-virtual {p1}, Ll/֡ۧۘ;->ܿ()[B

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ll/֡ۧۘ;->ܿ()[B

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [B

    :goto_0
    iput-object p1, p0, Ll/ۜۧۘ;->ۢ:[B

    .line 88
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-virtual {v0}, Ll/᩺ۨۖ;->᩵()Ll/᩺۫ۖ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩺۫ۖ;->ۧ()J

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 169
    iget-boolean v0, p0, Ll/ۜۧۘ;->ᩳ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۜۧۘ;->ۜ:Ll/᩷ۧۘ;

    invoke-virtual {v0}, Ll/᩷ۧۘ;->֫()Ll/᩹ۛۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩹ۛۖ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ۜۧۘ;->ۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ()[B
    .locals 1

    .line 247
    iget-object v0, p0, Ll/ۜۧۘ;->ۢ:[B

    return-object v0
.end method

.method public final ۡ()Z
    .locals 2

    .line 156
    iget-object v0, p0, Ll/ۜۧۘ;->ۜ:Ll/᩷ۧۘ;

    invoke-virtual {v0}, Ll/᩷ۧۘ;->֫()Ll/᩹ۛۖ;

    move-result-object v0

    .line 157
    sget-object v1, Ll/᩹ۛۖ;->ۤ:Ll/᩹ۛۖ;

    if-ne v0, v1, :cond_0

    .line 158
    iget-object v0, p0, Ll/ۜۧۘ;->֫:Ll/֡ۨۖ;

    if-eqz v0, :cond_1

    goto :goto_0

    .line 160
    :cond_0
    sget-object v0, Ll/ۛۛۖ;->ۗ:Ll/ۛۛۖ;

    iget-object v1, p0, Ll/ۜۧۘ;->ۧ:Ljava/util/EnumSet;

    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 128
    iget-object v1, p0, Ll/ۜۧۘ;->ۡ:Ll/֡ܽۘ;

    invoke-virtual {v1}, Ll/֡ܽۘ;->֫()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()Z
    .locals 1

    .line 96
    iget-object v0, p0, Ll/ۜۧۘ;->ۡ:Ll/֡ܽۘ;

    invoke-virtual {v0}, Ll/֡ܽۘ;->ܽ()I

    move-result v0

    and-int/lit8 v0, v0, 0x2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()Ll/֡ۨۖ;
    .locals 1

    .line 152
    iget-object v0, p0, Ll/ۜۧۘ;->֫:Ll/֡ۨۖ;

    return-object v0
.end method

.method public final ܳ()Ll/᩷ۧۘ;
    .locals 1

    .line 112
    iget-object v0, p0, Ll/ۜۧۘ;->ۜ:Ll/᩷ۧۘ;

    return-object v0
.end method

.method public final ܺ()Z
    .locals 2

    .line 193
    sget-object v0, Ll/ۛۛۖ;->۬:Ll/ۛۛۖ;

    .line 128
    iget-object v1, p0, Ll/ۜۧۘ;->ۡ:Ll/֡ܽۘ;

    invoke-virtual {v1}, Ll/֡ܽۘ;->֫()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ܽ()Ljava/util/EnumSet;
    .locals 1

    .line 132
    iget-object v0, p0, Ll/ۜۧۘ;->ۧ:Ljava/util/EnumSet;

    return-object v0
.end method

.method public final ܿ()[B
    .locals 2

    .line 116
    iget-object v0, p0, Ll/ۜۧۘ;->᩻:[B

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/util/UUID;
    .locals 1

    .line 92
    iget-object v0, p0, Ll/ۜۧۘ;->ܽ:Ljava/util/UUID;

    return-object v0
.end method

.method public final ᩷()Ll/֡ܽۘ;
    .locals 1

    .line 235
    iget-object v0, p0, Ll/ۜۧۘ;->ۡ:Ll/֡ܽۘ;

    return-object v0
.end method

.method public final ᩻()Ll/ۚۨۖ;
    .locals 1

    .line 243
    iget-object v0, p0, Ll/ۜۧۘ;->᩷:Ll/ۚۨۖ;

    return-object v0
.end method
