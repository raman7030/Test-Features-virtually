.class public final Ll/ۤܶۜ;
.super Ljava/lang/Object;
.source "A75O"

# interfaces
.implements Ll/᩸۠֫;


# instance fields
.field public ֫:J

.field public final ۧ:Ll/᩶ۗۜ;

.field public ܳ:Landroid/net/Uri;

.field public ܽ:Ll/۟ܰۜ;

.field public final ܿ:Ll/۫֡ۜ;

.field public ᩳ:J


# direct methods
.method public constructor <init>(Ll/۫֡ۜ;Ll/᩶ۗۜ;)V
    .locals 0

    .line 1081
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1082
    iput-object p1, p0, Ll/ۤܶۜ;->ܿ:Ll/۫֡ۜ;

    .line 1083
    iput-object p2, p0, Ll/ۤܶۜ;->ۧ:Ll/᩶ۗۜ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1149
    iget-object v0, p0, Ll/ۤܶۜ;->ܽ:Ll/۟ܰۜ;

    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    const/4 v0, 0x0

    .line 1150
    iput-object v0, p0, Ll/ۤܶۜ;->ܽ:Ll/۟ܰۜ;

    .line 1151
    iput-object v0, p0, Ll/ۤܶۜ;->ܳ:Landroid/net/Uri;

    const-wide/16 v0, 0x0

    .line 1152
    iput-wide v0, p0, Ll/ۤܶۜ;->ᩳ:J

    .line 1153
    iput-wide v0, p0, Ll/ۤܶۜ;->֫:J

    return-void
.end method

.method public final read([BII)I
    .locals 7

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1119
    :cond_0
    iget-wide v0, p0, Ll/ۤܶۜ;->֫:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    const/4 p1, -0x1

    return p1

    .line 1122
    :cond_1
    iget-object v0, p0, Ll/ۤܶۜ;->ܽ:Ll/۟ܰۜ;

    if-eqz v0, :cond_2

    .line 1126
    iget-object v6, p0, Ll/ۤܶۜ;->ۧ:Ll/᩶ۗۜ;

    invoke-interface {v6}, Ll/᩶ۗۜ;->֫()V

    .line 1127
    iget-wide v1, p0, Ll/ۤܶۜ;->֫:J

    int-to-long v3, p3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int p3, v1

    .line 1128
    iget-wide v1, p0, Ll/ۤܶۜ;->ᩳ:J

    move-object v3, p1

    move v4, p2

    move v5, p3

    invoke-interface/range {v0 .. v5}, Ll/۟ܰۜ;->ۧ(J[BII)V

    .line 1129
    invoke-interface {v6}, Ll/᩶ۗۜ;->֫()V

    .line 1130
    iget-wide p1, p0, Ll/ۤܶۜ;->ᩳ:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Ll/ۤܶۜ;->ᩳ:J

    .line 1131
    iget-wide p1, p0, Ll/ۤܶۜ;->֫:J

    sub-long/2addr p1, v0

    iput-wide p1, p0, Ll/ۤܶۜ;->֫:J

    return p3

    .line 1124
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "MPEG-TS data source is not open"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 8

    .line 1093
    invoke-virtual {p0}, Ll/ۤܶۜ;->close()V

    .line 1094
    iget-object v0, p0, Ll/ۤܶۜ;->ۧ:Ll/᩶ۗۜ;

    invoke-interface {v0}, Ll/᩶ۗۜ;->֫()V

    .line 1095
    iget-object v1, p0, Ll/ۤܶۜ;->ܿ:Ll/۫֡ۜ;

    invoke-virtual {v1}, Ll/۫֡ۜ;->ۡ()Ll/۟ܰۜ;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 1099
    iput-object v1, p0, Ll/ۤܶۜ;->ܽ:Ll/۟ܰۜ;

    .line 1100
    invoke-interface {v1}, Ll/۟ܰۜ;->length()J

    move-result-wide v1

    .line 1101
    iget-wide v3, p1, Ll/ۗ۠֫;->᩻:J

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-ltz v7, :cond_1

    cmp-long v5, v3, v1

    if-gtz v5, :cond_1

    sub-long/2addr v1, v3

    .line 1105
    iget-wide v3, p1, Ll/ۗ۠֫;->ܳ:J

    const-wide/16 v5, -0x1

    cmp-long v7, v3, v5

    if-nez v7, :cond_0

    goto :goto_0

    .line 1107
    :cond_0
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    :goto_0
    iput-wide v1, p0, Ll/ۤܶۜ;->֫:J

    .line 1108
    iget-wide v1, p1, Ll/ۗ۠֫;->᩻:J

    iput-wide v1, p0, Ll/ۤܶۜ;->ᩳ:J

    .line 1109
    iget-object p1, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    iput-object p1, p0, Ll/ۤܶۜ;->ܳ:Landroid/net/Uri;

    .line 1110
    invoke-interface {v0}, Ll/᩶ۗۜ;->֫()V

    .line 1111
    iget-wide v0, p0, Ll/ۤܶۜ;->֫:J

    return-wide v0

    .line 1102
    :cond_1
    new-instance p1, Ljava/io/EOFException;

    const-string v0, "MPEG-TS preview position exceeds source length"

    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1097
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Missing MPEG-TS metadata read handle"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Ljava/util/Map;
    .locals 1

    .line 0
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object v0
.end method

.method public final ֫(Ll/֡ܶ֫;)V
    .locals 0

    return-void
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 1138
    iget-object v0, p0, Ll/ۤܶۜ;->ܳ:Landroid/net/Uri;

    return-object v0
.end method
