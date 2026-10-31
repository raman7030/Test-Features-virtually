.class public Ll/ܿۚۘ;
.super Ll/ۤ᩵ۚ;
.source "G4EY"


# instance fields
.field public ֫:S

.field public ۜ:Ljava/util/Set;

.field public ۧ:I

.field public ܳ:[B

.field public ܽ:S

.field public ܿ:B

.field public ᩳ:B

.field public ᩻:Ll/ۜۚۘ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    .line 53
    iput-byte v0, p0, Ll/ܿۚۘ;->ᩳ:B

    const/4 v0, 0x0

    .line 54
    iput-byte v0, p0, Ll/ܿۚۘ;->ܿ:B

    const/4 v1, 0x4

    new-array v1, v1, [B

    .line 57
    fill-array-data v1, :array_0

    iput-object v1, p0, Ll/ܿۚۘ;->ܳ:[B

    const/16 v1, 0x10

    .line 58
    iput-short v1, p0, Ll/ܿۚۘ;->ܽ:S

    .line 59
    iput-short v0, p0, Ll/ܿۚۘ;->֫:S

    .line 60
    iput v0, p0, Ll/ܿۚۘ;->ۧ:I

    return-void

    :array_0
    .array-data 1
        0x10t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 87
    iget-short v0, p0, Ll/ܿۚۘ;->֫:S

    return v0
.end method

.method public final ֫(Ljava/util/EnumSet;)V
    .locals 0

    .line 107
    iput-object p1, p0, Ll/ܿۚۘ;->ۜ:Ljava/util/Set;

    return-void
.end method

.method public ֫(Ll/ۖۚۘ;)V
    .locals 2

    .line 71
    iget-object v0, p0, Ll/ܿۚۘ;->᩻:Ll/ۜۚۘ;

    if-eqz v0, :cond_1

    .line 75
    iget-object v0, p0, Ll/ܿۚۘ;->ۜ:Ljava/util/Set;

    if-eqz v0, :cond_0

    .line 63
    iget-byte v0, p0, Ll/ܿۚۘ;->ᩳ:B

    .line 134
    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->֫(I)V

    .line 67
    iget-byte v0, p0, Ll/ܿۚۘ;->ܿ:B

    .line 135
    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->֫(I)V

    .line 71
    iget-object v0, p0, Ll/ܿۚۘ;->᩻:Ll/ۜۚۘ;

    .line 136
    invoke-virtual {v0}, Ll/ۜۚۘ;->getValue()J

    move-result-wide v0

    long-to-int v1, v0

    int-to-byte v0, v1

    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->֫(I)V

    .line 75
    iget-object v0, p0, Ll/ܿۚۘ;->ۜ:Ljava/util/Set;

    .line 137
    invoke-static {v0}, Ll/ܶܰۖ;->֫(Ljava/util/Collection;)J

    move-result-wide v0

    long-to-int v1, v0

    int-to-byte v0, v1

    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->֫(I)V

    .line 79
    iget-object v0, p0, Ll/ܿۚۘ;->ܳ:[B

    .line 138
    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->֫([B)V

    .line 83
    iget-short v0, p0, Ll/ܿۚۘ;->ܽ:S

    .line 139
    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->ܽ(I)V

    const/4 v0, 0x0

    .line 140
    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->ܽ(I)V

    .line 91
    iget v0, p0, Ll/ܿۚۘ;->ۧ:I

    .line 141
    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->ۧ(I)V

    return-void

    .line 132
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid PFC flag(s): "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    iget-object v1, p0, Ll/ܿۚۘ;->ۜ:Ljava/util/Set;

    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 129
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid PDU type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    iget-object v1, p0, Ll/ܿۚۘ;->᩻:Ll/ۜۚۘ;

    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۜۚۘ;)V
    .locals 0

    .line 103
    iput-object p1, p0, Ll/ܿۚۘ;->᩻:Ll/ۜۚۘ;

    return-void
.end method

.method public ֫(Ll/ܺۚۘ;)V
    .locals 6

    .line 146
    invoke-virtual {p1}, Ll/ܺۚۘ;->֫()B

    move-result v0

    .line 95
    iput-byte v0, p0, Ll/ܿۚۘ;->ᩳ:B

    .line 147
    invoke-virtual {p1}, Ll/ܺۚۘ;->֫()B

    move-result v0

    .line 99
    iput-byte v0, p0, Ll/ܿۚۘ;->ܿ:B

    const/4 v1, 0x5

    .line 63
    iget-byte v2, p0, Ll/ܿۚۘ;->ᩳ:B

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v2, :cond_3

    if-nez v0, :cond_3

    .line 153
    invoke-virtual {p1}, Ll/ܺۚۘ;->֫()B

    move-result v0

    int-to-long v0, v0

    .line 154
    const-class v2, Ll/ۜۚۘ;

    const/4 v5, 0x0

    invoke-static {v0, v1, v2, v5}, Ll/ܶܰۖ;->֫(JLjava/lang/Class;Ll/۟۫ۖ;)Ll/᩸ܰۖ;

    move-result-object v0

    check-cast v0, Ll/ۜۚۘ;

    if-eqz v0, :cond_2

    .line 103
    iput-object v0, p0, Ll/ܿۚۘ;->᩻:Ll/ۜۚۘ;

    .line 160
    invoke-virtual {p1}, Ll/ܺۚۘ;->֫()B

    move-result v0

    int-to-long v0, v0

    const-class v2, Ll/᩷ۚۘ;

    invoke-static {v0, v1, v2}, Ll/ܶܰۖ;->֫(JLjava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    .line 107
    iput-object v0, p0, Ll/ܿۚۘ;->ۜ:Ljava/util/Set;

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 164
    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫([B)V

    .line 166
    aget-byte v1, v0, v4

    const/16 v2, 0x10

    if-ne v1, v2, :cond_1

    .line 170
    aget-byte v1, v0, v3

    if-nez v1, :cond_0

    .line 111
    iput-object v0, p0, Ll/ܿۚۘ;->ܳ:[B

    .line 175
    invoke-virtual {p1}, Ll/ܺۚۘ;->ᩳ()S

    move-result v0

    .line 115
    iput-short v0, p0, Ll/ܿۚۘ;->ܽ:S

    .line 176
    invoke-virtual {p1}, Ll/ܺۚۘ;->ᩳ()S

    move-result v0

    .line 119
    iput-short v0, p0, Ll/ܿۚۘ;->֫:S

    .line 177
    invoke-virtual {p1}, Ll/ܺۚۘ;->ܽ()I

    move-result p1

    .line 123
    iput p1, p0, Ll/ܿۚۘ;->ۧ:I

    return-void

    .line 171
    :cond_0
    new-instance p1, Ljava/io/IOException;

    aget-byte v0, v0, v3

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    aput-object v0, v1, v4

    const-string v0, "Floating-Point representation mismatch: %d"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 167
    :cond_1
    new-instance p1, Ljava/io/IOException;

    aget-byte v0, v0, v4

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    aput-object v0, v1, v4

    const-string v0, "Integer and Character representation mismatch: %d"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 156
    :cond_2
    new-instance p1, Ljava/io/IOException;

    new-array v1, v3, [Ljava/lang/Object;

    aput-object v0, v1, v4

    const-string v0, "PDU type invalid: %d"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 150
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 63
    iget-byte v0, p0, Ll/ܿۚۘ;->ᩳ:B

    .line 150
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    .line 67
    iget-byte v1, p0, Ll/ܿۚۘ;->ܿ:B

    .line 150
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v4

    aput-object v1, v2, v3

    const-string v0, "Version mismatch: %d.%d != 5.0"

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(S)V
    .locals 0

    .line 115
    iput-short p1, p0, Ll/ܿۚۘ;->ܽ:S

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 83
    iget-short v0, p0, Ll/ܿۚۘ;->ܽ:S

    return v0
.end method

.method public final ۧ(I)V
    .locals 0

    .line 123
    iput p1, p0, Ll/ܿۚۘ;->ۧ:I

    return-void
.end method

.method public final ܽ()Ll/ۜۚۘ;
    .locals 1

    .line 71
    iget-object v0, p0, Ll/ܿۚۘ;->᩻:Ll/ۜۚۘ;

    return-object v0
.end method

.method public final ᩳ()Ljava/util/Set;
    .locals 1

    .line 75
    iget-object v0, p0, Ll/ܿۚۘ;->ۜ:Ljava/util/Set;

    return-object v0
.end method
