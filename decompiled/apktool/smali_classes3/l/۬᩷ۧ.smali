.class public final Ll/۬᩷ۧ;
.super Ljava/lang/Object;
.source "W8PF"


# direct methods
.method public static ֫(Ll/ᩳ֨֫;)Ll/ۤ᩷ۧ;
    .locals 11

    const/4 v0, 0x1

    .line 194
    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 195
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩸()I

    move-result v0

    .line 197
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    int-to-long v1, v1

    int-to-long v3, v0

    add-long/2addr v1, v3

    .line 198
    div-int/lit8 v0, v0, 0x12

    .line 199
    new-array v3, v0, [J

    .line 200
    new-array v4, v0, [J

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_1

    .line 204
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩴ()J

    move-result-wide v6

    const-wide/16 v8, -0x1

    cmp-long v10, v6, v8

    if-nez v10, :cond_0

    .line 206
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v3

    .line 207
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v4

    goto :goto_1

    .line 210
    :cond_0
    aput-wide v6, v3, v5

    .line 211
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩴ()J

    move-result-wide v6

    aput-wide v6, v4, v5

    const/4 v6, 0x2

    .line 212
    invoke-virtual {p0, v6}, Ll/ᩳ֨֫;->ܳ(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 215
    :cond_1
    :goto_1
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v0

    int-to-long v5, v0

    sub-long/2addr v1, v5

    long-to-int v0, v1

    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 216
    new-instance p0, Ll/ۤ᩷ۧ;

    invoke-direct {p0, v3, v4}, Ll/ۤ᩷ۧ;-><init>([J[J)V

    return-object p0
.end method
