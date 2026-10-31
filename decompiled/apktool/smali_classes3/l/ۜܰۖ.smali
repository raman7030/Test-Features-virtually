.class public final Ll/ۜܰۖ;
.super Ll/᩻ܰۖ;
.source "89HI"


# instance fields
.field public ܳ:[B

.field public ܿ:Z

.field public ᩳ:[B


# direct methods
.method public constructor <init>(Ljava/util/AbstractSet;Ljava/lang/String;Ljava/lang/String;Ll/᩵ܰۖ;Z)V
    .locals 1

    .line 41
    invoke-direct {p0, p1, p4}, Ll/᩻ܰۖ;-><init>(Ljava/util/Set;Ll/᩵ܰۖ;)V

    const-string p1, "Cp850"

    .line 42
    sget-object p4, Ll/ܺܰۖ;->֫:[B

    if-eqz p2, :cond_0

    sget-object v0, Ll/ܽܰۖ;->֫:Ljava/nio/charset/Charset;

    .line 57
    invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, p4

    .line 42
    :goto_0
    iput-object p2, p0, Ll/ۜܰۖ;->ᩳ:[B

    if-eqz p3, :cond_1

    .line 43
    sget-object p2, Ll/ܽܰۖ;->֫:Ljava/nio/charset/Charset;

    .line 57
    invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p4

    .line 43
    :cond_1
    iput-object p4, p0, Ll/ۜܰۖ;->ܳ:[B

    .line 44
    iput-boolean p5, p0, Ll/ۜܰۖ;->ܿ:Z

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 6

    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NtlmNegotiate{\n  domain=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    sget-object v1, Ll/ܽܰۖ;->֫:Ljava/nio/charset/Charset;

    const-string v1, ""

    const-string v2, "Cp850"

    .line 61
    iget-object v3, p0, Ll/ۜܰۖ;->ᩳ:[B

    if-eqz v3, :cond_0

    new-instance v4, Ljava/lang/String;

    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v5

    invoke-direct {v4, v3, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    goto :goto_0

    :cond_0
    move-object v4, v1

    .line 93
    :goto_0
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\'\',\n  workstation=\'"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    iget-object v3, p0, Ll/ۜܰۖ;->ܳ:[B

    if-eqz v3, :cond_1

    new-instance v1, Ljava/lang/String;

    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-direct {v1, v3, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 94
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\',\n  negotiateFlags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩻ܰۖ;->֫:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n  version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩻ܰۖ;->ۧ:Ll/᩵ܰۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\n}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/۫ܰۖ;)V
    .locals 8

    const-string v0, "NTLMSSP\u0000"

    .line 48
    sget-object v1, Ll/۠ܰۖ;->ܿ:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(Ljava/lang/String;Ljava/nio/charset/Charset;)V

    const-wide/16 v0, 0x1

    .line 49
    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(J)V

    .line 53
    iget-object v0, p0, Ll/᩻ܰۖ;->֫:Ljava/util/Set;

    invoke-static {v0}, Ll/ܶܰۖ;->֫(Ljava/util/Collection;)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(J)V

    .line 56
    iget-boolean v0, p0, Ll/ۜܰۖ;->ܿ:Z

    if-nez v0, :cond_0

    const/16 v1, 0x28

    goto :goto_0

    :cond_0
    const/16 v1, 0x20

    .line 60
    :goto_0
    iget-object v2, p0, Ll/᩻ܰۖ;->֫:Ljava/util/Set;

    sget-object v3, Ll/᩷ܰۖ;->۟:Ll/᩷ܰۖ;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, p0, Ll/ۜܰۖ;->ᩳ:[B

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_1

    .line 62
    invoke-static {p1, v3, v1}, Ll/ܺܰۖ;->֫(Ll/۫ܰۖ;[BI)I

    move-result v1

    goto :goto_1

    .line 64
    :cond_1
    invoke-virtual {p1, v6}, Ll/ۤܰۖ;->ۧ(I)V

    .line 65
    invoke-virtual {p1, v6}, Ll/ۤܰۖ;->ۧ(I)V

    .line 66
    invoke-virtual {p1, v4, v5}, Ll/ۤܰۖ;->ۧ(J)V

    .line 69
    :goto_1
    iget-object v2, p0, Ll/᩻ܰۖ;->֫:Ljava/util/Set;

    sget-object v7, Ll/᩷ܰۖ;->֫֫:Ll/᩷ܰۖ;

    invoke-interface {v2, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    iget-object v7, p0, Ll/ۜܰۖ;->ܳ:[B

    if-eqz v2, :cond_2

    .line 71
    invoke-static {p1, v7, v1}, Ll/ܺܰۖ;->֫(Ll/۫ܰۖ;[BI)I

    goto :goto_2

    .line 73
    :cond_2
    invoke-virtual {p1, v6}, Ll/ۤܰۖ;->ۧ(I)V

    .line 74
    invoke-virtual {p1, v6}, Ll/ۤܰۖ;->ۧ(I)V

    .line 75
    invoke-virtual {p1, v4, v5}, Ll/ۤܰۖ;->ۧ(J)V

    :goto_2
    if-nez v0, :cond_3

    .line 80
    iget-object v1, p0, Ll/᩻ܰۖ;->֫:Ljava/util/Set;

    sget-object v2, Ll/᩷ܰۖ;->ܳ֫:Ll/᩷ܰۖ;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 81
    iget-object v0, p0, Ll/᩻ܰۖ;->ۧ:Ll/᩵ܰۖ;

    invoke-virtual {v0, p1}, Ll/᩵ܰۖ;->ۧ(Ll/۫ܰۖ;)V

    goto :goto_3

    :cond_3
    if-nez v0, :cond_4

    .line 83
    invoke-virtual {p1, v4, v5}, Ll/ۤܰۖ;->ܽ(J)V

    .line 318
    :cond_4
    :goto_3
    array-length v0, v3

    invoke-virtual {p1, v0, v3}, Ll/ۤܰۖ;->֫(I[B)V

    array-length v0, v7

    invoke-virtual {p1, v0, v7}, Ll/ۤܰۖ;->֫(I[B)V

    return-void
.end method
