.class public final Ll/ܿ۟ۜ;
.super Ljava/lang/Object;
.source "R790"


# instance fields
.field public final ֫:Ll/۟ܰۜ;

.field public final ۧ:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Ll/۟ܰۜ;)V
    .locals 1

    .line 1141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1139
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ܿ۟ۜ;->ۧ:Ljava/util/HashSet;

    .line 1142
    iput-object p1, p0, Ll/ܿ۟ۜ;->֫:Ll/۟ܰۜ;

    return-void
.end method

.method public static ֫(Ll/ܿ۟ۜ;)J
    .locals 2

    .line 1146
    iget-object p0, p0, Ll/ܿ۟ۜ;->֫:Ll/۟ܰۜ;

    invoke-interface {p0}, Ll/۟ܰۜ;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public static ֫(Ll/ܿ۟ۜ;JI)[B
    .locals 9

    if-ltz p3, :cond_3

    .line 1161
    iget-object v0, p0, Ll/ܿ۟ۜ;->ۧ:Ljava/util/HashSet;

    if-nez p3, :cond_0

    goto :goto_1

    :cond_0
    const-wide/32 v1, 0x8000

    .line 1164
    div-long v3, p1, v1

    int-to-long v5, p3

    add-long/2addr v5, p1

    const-wide/16 v7, 0x1

    sub-long/2addr v5, v7

    .line 1165
    div-long/2addr v5, v1

    :goto_0
    cmp-long v1, v3, v5

    if-gtz v1, :cond_2

    .line 1167
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1168
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v1

    const/16 v2, 0x100

    if-gt v1, v2, :cond_1

    add-long/2addr v3, v7

    goto :goto_0

    .line 1169
    :cond_1
    new-instance p0, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 1169
    throw p0

    .line 1155
    :cond_2
    :goto_1
    new-array v6, p3, [B

    .line 1156
    iget-object v0, p0, Ll/ܿ۟ۜ;->֫:Ll/۟ܰۜ;

    const/4 v4, 0x0

    move-wide v1, p1

    move-object v3, v6

    move v5, p3

    invoke-interface/range {v0 .. v5}, Ll/۟ܰۜ;->ۧ(J[BII)V

    return-object v6

    .line 0
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1152
    new-instance p0, Ll/᩵۟ۜ;

    .line 1424
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 1152
    throw p0
.end method
