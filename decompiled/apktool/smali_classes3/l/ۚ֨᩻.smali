.class public final Ll/ۚ֨᩻;
.super Ll/ܰܺܳ;
.source "Z9PC"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public ۗ:J

.field public final ۙ:Ll/ܶ᩵ܿ;

.field public ۛ:Ll/᩺֨᩻;

.field public ۤ:Ll/֡֨᩻;

.field public ۨ:Ll/ۨۚ᩻;

.field public final ۫:J

.field public final ۬:J

.field public final ܰ:Ljava/lang/String;

.field public ᩶:Ljava/util/List;

.field public final ᩹:I

.field public final ᩺:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILl/ۨۚ᩻;)V
    .locals 2

    .line 78
    invoke-direct {p0}, Ll/ܰܺܳ;-><init>()V

    const/4 v0, 0x0

    .line 79
    iput-object v0, p0, Ll/ۚ֨᩻;->ۙ:Ll/ܶ᩵ܿ;

    const-wide/16 v0, 0x0

    .line 80
    iput-wide v0, p0, Ll/ۚ֨᩻;->۫:J

    .line 81
    iput-wide v0, p0, Ll/ۚ֨᩻;->۬:J

    .line 82
    iput-object p1, p0, Ll/ۚ֨᩻;->᩺:Ljava/lang/String;

    .line 83
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Ll/ۚ֨᩻;->ܰ:Ljava/lang/String;

    .line 84
    iput p3, p0, Ll/ۚ֨᩻;->᩹:I

    .line 85
    iput-object p4, p0, Ll/ۚ֨᩻;->ۨ:Ll/ۨۚ᩻;

    return-void
.end method

.method public constructor <init>(Ll/ܶ᩵ܿ;JJ)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ll/ܰܺܳ;-><init>()V

    .line 45
    iput-object p1, p0, Ll/ۚ֨᩻;->ۙ:Ll/ܶ᩵ܿ;

    .line 46
    iput-wide p2, p0, Ll/ۚ֨᩻;->۫:J

    .line 47
    iput-wide p4, p0, Ll/ۚ֨᩻;->۬:J

    const/4 p1, 0x0

    .line 48
    iput-object p1, p0, Ll/ۚ֨᩻;->᩺:Ljava/lang/String;

    .line 49
    iput-object p1, p0, Ll/ۚ֨᩻;->ܰ:Ljava/lang/String;

    const/4 p2, 0x0

    .line 50
    iput p2, p0, Ll/ۚ֨᩻;->᩹:I

    .line 51
    iput-object p1, p0, Ll/ۚ֨᩻;->ۨ:Ll/ۨۚ᩻;

    return-void
.end method

.method public static ֫(ILjava/lang/String;Ljava/lang/String;)Ll/ۚ֨᩻;
    .locals 2

    .line 59
    new-instance v0, Ll/ۚ֨᩻;

    const/4 v1, 0x0

    .line 72
    invoke-direct {v0, p1, p2, p0, v1}, Ll/ۚ֨᩻;-><init>(Ljava/lang/String;Ljava/lang/String;ILl/ۨۚ᩻;)V

    return-object v0
.end method

.method public static ֫(Ll/۬ۜܽ;)Ll/ۚ֨᩻;
    .locals 10

    .line 120
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u0001MT_REMOTE_PAYLOAD_SOURCE_V1"

    .line 121
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 122
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result p0

    invoke-static {p0, v0, v1}, Ll/ۚ֨᩻;->֫(ILjava/lang/String;Ljava/lang/String;)Ll/ۚ֨᩻;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v1, "\u0001MT_REMOTE_PAYLOAD_SOURCE_V2"

    .line 124
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 125
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v0

    .line 126
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    .line 127
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    .line 128
    new-instance v9, Ll/ۨۚ᩻;

    .line 130
    invoke-virtual {p0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v4

    invoke-virtual {p0}, Ll/۬ۜܽ;->֡()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Ll/۬ۜܽ;->֡()Ljava/lang/String;

    move-result-object v7

    .line 131
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v8

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Ll/ۨۚ᩻;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    new-instance p0, Ll/ۚ֨᩻;

    invoke-direct {p0, v0, v1, v2, v9}, Ll/ۚ֨᩻;-><init>(Ljava/lang/String;Ljava/lang/String;ILl/ۨۚ᩻;)V

    return-object p0

    .line 134
    :cond_1
    new-instance v1, Ll/ۚ֨᩻;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {v0, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    invoke-virtual {p0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v5

    invoke-virtual {p0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v7

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, Ll/ۚ֨᩻;-><init>(Ll/ܶ᩵ܿ;JJ)V

    return-object v1
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 306
    iget-object v0, p0, Ll/ۚ֨᩻;->ۤ:Ll/֡֨᩻;

    if-eqz v0, :cond_0

    .line 307
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    const/4 v0, 0x0

    .line 308
    iput-object v0, p0, Ll/ۚ֨᩻;->ۤ:Ll/֡֨᩻;

    :cond_0
    return-void
.end method

.method public final ֡()Z
    .locals 1

    .line 265
    iget-object v0, p0, Ll/ۚ֨᩻;->᩺:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)Ljava/io/InputStream;
    .locals 0

    .line 180
    iget-object p1, p0, Ll/ۚ֨᩻;->ۤ:Ll/֡֨᩻;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 181
    invoke-virtual {p0, p1}, Ll/ۚ֨᩻;->֫(Z)V

    .line 183
    :cond_0
    check-cast p2, Ll/᩵֨᩻;

    .line 184
    iget-object p1, p0, Ll/ۚ֨᩻;->ۤ:Ll/֡֨᩻;

    invoke-virtual {p2}, Ll/᩵֨᩻;->ᩳ()Ll/ܰۚ᩻;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/֡֨᩻;->֫(Ll/ܰۚ᩻;)Ll/ᩳۨۡ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Z)Ljava/util/ArrayList;
    .locals 2

    .line 215
    iget-object p2, p0, Ll/ۚ֨᩻;->᩶:Ljava/util/List;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    .line 216
    invoke-virtual {p0, p2}, Ll/ۚ֨᩻;->֫(Z)V

    .line 218
    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    iget-object v0, p0, Ll/ۚ֨᩻;->᩶:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    const-string v0, "/"

    .line 219
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 220
    iget-object p1, p0, Ll/ۚ֨᩻;->᩶:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰۚ᩻;

    .line 221
    new-instance v1, Ll/᩵֨᩻;

    invoke-direct {v1, v0}, Ll/᩵֨᩻;-><init>(Ll/ܰۚ᩻;)V

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object p2
.end method

.method public final ֫(Ll/᩺֨᩻;)Ll/֡֨᩻;
    .locals 8

    .line 235
    invoke-virtual {p0}, Ll/ۚ֨᩻;->֡()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 236
    iget v0, p0, Ll/ۚ֨᩻;->᩹:I

    iget-object v1, p0, Ll/ۚ֨᩻;->ۨ:Ll/ۨۚ᩻;

    iget-object v2, p0, Ll/ۚ֨᩻;->᩺:Ljava/lang/String;

    iget-object v3, p0, Ll/ۚ֨᩻;->ܰ:Ljava/lang/String;

    invoke-static {v2, v3, v0, v1, p1}, Ll/ۨ֨᩻;->֫(Ljava/lang/String;Ljava/lang/String;ILl/ۨۚ᩻;Ll/᩺֨᩻;)Ll/ۨ֨᩻;

    move-result-object p1

    return-object p1

    .line 239
    :cond_0
    new-instance p1, Ll/ᩴ֨᩻;

    iget-wide v0, p0, Ll/ۚ֨᩻;->۬:J

    const-string v2, "r"

    .line 61
    iget-object v3, p0, Ll/ۚ֨᩻;->ۙ:Ll/ܶ᩵ܿ;

    invoke-virtual {v3, v2}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object v2

    const-wide/16 v3, 0x0

    .line 63
    iget-wide v5, p0, Ll/ۚ֨᩻;->۫:J

    cmp-long v7, v5, v3

    if-lez v7, :cond_1

    .line 64
    :try_start_0
    invoke-virtual {v2, v5, v6, v0, v1}, Ll/᩻ۖܽ;->ܽ(JJ)Ll/᩻ۖܽ;

    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 67
    invoke-virtual {v2}, Ll/᩻ۖܽ;->close()V

    .line 68
    throw p1

    .line 57
    :cond_1
    :goto_0
    invoke-direct {p1, v2}, Ll/ᩴ֨᩻;-><init>(Ll/۠ۖܽ;)V

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)Ll/ᩳۜܳ;
    .locals 3

    .line 190
    iget-object v0, p0, Ll/ۚ֨᩻;->᩶:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 191
    invoke-virtual {p0, v0}, Ll/ۚ֨᩻;->֫(Z)V

    :cond_0
    const/4 v0, 0x1

    .line 193
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 194
    iget-object v0, p0, Ll/ۚ֨᩻;->᩶:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰۚ᩻;

    .line 195
    invoke-virtual {v1}, Ll/ܰۚ᩻;->ۧ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 196
    new-instance p1, Ll/᩵֨᩻;

    invoke-direct {p1, v1}, Ll/᩵֨᩻;-><init>(Ll/ܰۚ᩻;)V

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ljava/security/MessageDigest;)V
    .locals 2

    const-string v0, "payload"

    .line 204
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 205
    invoke-virtual {p0}, Ll/ۚ֨᩻;->ۘ()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 206
    invoke-virtual {p0}, Ll/ۚ֨᩻;->֡()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 207
    iget-object v0, p0, Ll/ۚ֨᩻;->ܰ:Ljava/lang/String;

    invoke-static {p1, v0}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    return-void

    .line 209
    :cond_0
    iget-wide v0, p0, Ll/ۚ֨᩻;->ۗ:J

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 4

    .line 95
    invoke-virtual {p0}, Ll/ۚ֨᩻;->֡()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 97
    iget-object v0, p0, Ll/ۚ֨᩻;->ۨ:Ll/ۨۚ᩻;

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 99
    :cond_0
    invoke-virtual {v0}, Ll/ۨۚ᩻;->ᩳ()Ljava/lang/String;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_2

    const-string v3, "\u0001MT_REMOTE_PAYLOAD_SOURCE_V1"

    goto :goto_2

    :cond_2
    const-string v3, "\u0001MT_REMOTE_PAYLOAD_SOURCE_V2"

    .line 101
    :goto_2
    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 103
    iget-object v3, p0, Ll/ۚ֨᩻;->᩺:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 104
    iget-object v3, p0, Ll/ۚ֨᩻;->ܰ:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 105
    iget v3, p0, Ll/ۚ֨᩻;->᩹:I

    invoke-virtual {p1, v3}, Ll/ۤۜܽ;->writeInt(I)V

    if-eqz v2, :cond_3

    .line 107
    invoke-virtual {v0}, Ll/ۨۚ᩻;->ܽ()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    .line 108
    invoke-virtual {v0}, Ll/ۨۚ᩻;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->ۧ(Ljava/lang/String;)V

    .line 109
    invoke-virtual {v0}, Ll/ۨۚ᩻;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ۧ(Ljava/lang/String;)V

    .line 110
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    :cond_3
    return-void

    .line 113
    :cond_4
    iget-object v0, p0, Ll/ۚ֨᩻;->ۙ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 114
    iget-wide v0, p0, Ll/ۚ֨᩻;->۫:J

    invoke-virtual {p1, v0, v1}, Ll/ۤۜܽ;->ۧ(J)V

    .line 115
    iget-wide v0, p0, Ll/ۚ֨᩻;->۬:J

    invoke-virtual {p1, v0, v1}, Ll/ۤۜܽ;->ۧ(J)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 173
    :try_start_0
    iget-object p1, p0, Ll/ۚ֨᩻;->ۛ:Ll/᩺֨᩻;

    const/4 v1, 0x0

    .line 174
    iput-object v1, p0, Ll/ۚ֨᩻;->ۛ:Ll/᩺֨᩻;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    monitor-exit v0

    .line 139
    invoke-virtual {p0, p1}, Ll/ۚ֨᩻;->ۧ(Ll/᩺֨᩻;)V

    return-void

    :catchall_0
    move-exception p1

    .line 175
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۖ()Ljava/lang/String;
    .locals 4

    .line 275
    invoke-virtual {p0}, Ll/ۚ֨᩻;->֡()Z

    move-result v0

    const-string v1, "\n"

    if-eqz v0, :cond_0

    .line 276
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "remote\nurlLength="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۚ֨᩻;->᩺:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 278
    :cond_0
    iget-object v0, p0, Ll/ۚ֨᩻;->ۙ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    sget v2, Ll/᩹֨᩻;->᩹:I

    .line 178
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "pathLength="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\noffset="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Ll/ۚ֨᩻;->۫:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "\nlength="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Ll/ۚ֨᩻;->۬:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۘ()Ljava/lang/String;
    .locals 1

    .line 270
    invoke-virtual {p0}, Ll/ۚ֨᩻;->֡()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۚ֨᩻;->᩺:Ljava/lang/String;

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ۚ֨᩻;->ۙ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۜ()Ll/ܶ᩵ܿ;
    .locals 1

    .line 244
    iget-object v0, p0, Ll/ۚ֨᩻;->ۙ:Ll/ܶ᩵ܿ;

    return-object v0
.end method

.method public final declared-synchronized ۧ(Z)Ll/᩺֨᩻;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 163
    :try_start_0
    invoke-virtual {p0}, Ll/ۚ֨᩻;->֡()Z

    move-result v1

    if-eqz v1, :cond_1

    if-nez p1, :cond_0

    iget-object p1, p0, Ll/ۚ֨᩻;->᩶:Ljava/util/List;

    if-eqz p1, :cond_0

    goto :goto_0

    .line 166
    :cond_0
    new-instance p1, Ll/᩺֨᩻;

    invoke-direct {p1}, Ll/᩺֨᩻;-><init>()V

    iput-object p1, p0, Ll/ۚ֨᩻;->ۛ:Ll/᩺֨᩻;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    monitor-exit v0

    return-object p1

    .line 164
    :cond_1
    :goto_0
    monitor-exit v0

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۧ(Ll/᩺֨᩻;)V
    .locals 2

    .line 145
    iget-object v0, p0, Ll/ۚ֨᩻;->ۤ:Ll/֡֨᩻;

    if-eqz v0, :cond_0

    .line 146
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    const/4 v0, 0x0

    .line 147
    iput-object v0, p0, Ll/ۚ֨᩻;->ۤ:Ll/֡֨᩻;

    .line 149
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۚ֨᩻;->֫(Ll/᩺֨᩻;)Ll/֡֨᩻;

    move-result-object p1

    iput-object p1, p0, Ll/ۚ֨᩻;->ۤ:Ll/֡֨᩻;

    .line 150
    invoke-interface {p1}, Ll/֡֨᩻;->᩶ۧ()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۚ֨᩻;->᩶:Ljava/util/List;

    .line 151
    iget-object p1, p0, Ll/ۚ֨᩻;->ۤ:Ll/֡֨᩻;

    instance-of v0, p1, Ll/ۨ֨᩻;

    if-eqz v0, :cond_1

    check-cast p1, Ll/ۨ֨᩻;

    .line 152
    invoke-virtual {p1}, Ll/ۨ֨᩻;->֫()Ll/ۨۚ᩻;

    move-result-object p1

    iput-object p1, p0, Ll/ۚ֨᩻;->ۨ:Ll/ۨۚ᩻;

    return-void

    .line 153
    :cond_1
    iget-object p1, p0, Ll/ۚ֨᩻;->ۙ:Ll/ܶ᩵ܿ;

    if-eqz p1, :cond_2

    .line 154
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۚ֨᩻;->ۗ:J

    :cond_2
    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    const-string v0, "payload"

    return-object v0
.end method

.method public final ᩴ()Z
    .locals 1

    .line 260
    iget-object v0, p0, Ll/ۚ֨᩻;->ۙ:Ll/ܶ᩵ܿ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩵()Z
    .locals 5

    .line 256
    iget-object v0, p0, Ll/ۚ֨᩻;->ۙ:Ll/ܶ᩵ܿ;

    if-eqz v0, :cond_0

    iget-wide v1, p0, Ll/ۚ֨᩻;->ۗ:J

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v3

    cmp-long v0, v1, v3

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
