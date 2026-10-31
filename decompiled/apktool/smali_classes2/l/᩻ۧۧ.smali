.class public final Ll/᩻ۧۧ;
.super Ll/᩺ܽۧ;
.source "68QN"


# instance fields
.field public ֫֫:Z

.field public ۟:Z

.field public final ۧ֫:Ll/᩹᩵֫;

.field public ܰ:Z

.field public final ܳ֫:Ll/᩶᩵֫;

.field public ܽ֫:Ll/ܿۧۧ;

.field public final ܿ֫:Z

.field public ᩳ֫:Ll/ᩳۧۧ;


# direct methods
.method public constructor <init>(Ll/ۘۧۧ;Z)V
    .locals 1

    .line 60
    invoke-direct {p0, p1}, Ll/᩺ܽۧ;-><init>(Ll/ۘۧۧ;)V

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    .line 61
    invoke-interface {p1}, Ll/ۘۧۧ;->ܽ()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Ll/᩻ۧۧ;->ܿ֫:Z

    .line 62
    new-instance p2, Ll/᩶᩵֫;

    invoke-direct {p2}, Ll/᩶᩵֫;-><init>()V

    iput-object p2, p0, Ll/᩻ۧۧ;->ܳ֫:Ll/᩶᩵֫;

    .line 63
    new-instance p2, Ll/᩹᩵֫;

    invoke-direct {p2}, Ll/᩹᩵֫;-><init>()V

    iput-object p2, p0, Ll/᩻ۧۧ;->ۧ֫:Ll/᩹᩵֫;

    .line 64
    invoke-interface {p1}, Ll/ۘۧۧ;->ᩳ()Ll/ۙ᩵֫;

    move-result-object p2

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    .line 67
    invoke-static {p2, p1, p1}, Ll/ܿۧۧ;->֫(Ll/ۙ᩵֫;Ljava/lang/Object;Ljava/lang/Object;)Ll/ܿۧۧ;

    move-result-object p1

    iput-object p1, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    .line 69
    iput-boolean v0, p0, Ll/᩻ۧۧ;->ܰ:Z

    return-void

    .line 71
    :cond_1
    invoke-interface {p1}, Ll/ۘۧۧ;->֫()Ll/ۧ᩵֫;

    move-result-object p1

    invoke-static {p1}, Ll/ܿۧۧ;->֫(Ll/ۧ᩵֫;)Ll/ܿۧۧ;

    move-result-object p1

    iput-object p1, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    return-void
.end method

.method private ֫(J)Z
    .locals 6
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "unpreparedMaskingMediaPeriod"
        }
    .end annotation

    .line 234
    iget-object v0, p0, Ll/᩻ۧۧ;->ᩳ֫:Ll/ᩳۧۧ;

    .line 235
    iget-object v1, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    iget-object v2, v0, Ll/ᩳۧۧ;->᩶:Ll/ܺۧۧ;

    iget-object v2, v2, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ll/ܿۧۧ;->֫(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    return v3

    .line 243
    :cond_0
    iget-object v2, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    .line 1275
    iget-object v4, p0, Ll/᩻ۧۧ;->ۧ֫:Ll/᩹᩵֫;

    invoke-virtual {v2, v1, v4, v3}, Ll/ܿۧۧ;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    .line 243
    iget-wide v1, v4, Ll/᩹᩵֫;->ۧ:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    cmp-long v3, p1, v1

    if-ltz v3, :cond_1

    const-wide/16 p1, 0x1

    sub-long/2addr v1, p1

    const-wide/16 p1, 0x0

    .line 247
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    .line 250
    :cond_1
    invoke-virtual {v0, p1, p2}, Ll/ᩳۧۧ;->ܽ(J)V

    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final bridge synthetic ֫(Ll/ܺۧۧ;Ll/᩸ܿۧ;J)Ll/ۢۧۧ;
    .locals 0

    .line 38
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/᩻ۧۧ;->֫(Ll/ܺۧۧ;Ll/᩸ܿۧ;J)Ll/ᩳۧۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܺۧۧ;Ll/᩸ܿۧ;J)Ll/ᩳۧۧ;
    .locals 1

    .line 108
    new-instance v0, Ll/ᩳۧۧ;

    invoke-direct {v0, p1, p2, p3, p4}, Ll/ᩳۧۧ;-><init>(Ll/ܺۧۧ;Ll/᩸ܿۧ;J)V

    .line 109
    iget-object p2, p0, Ll/᩺ܽۧ;->᩺:Ll/ۘۧۧ;

    invoke-virtual {v0, p2}, Ll/ᩳۧۧ;->֫(Ll/ۘۧۧ;)V

    .line 110
    iget-boolean p2, p0, Ll/᩻ۧۧ;->֫֫:Z

    if-eqz p2, :cond_1

    .line 111
    iget-object p2, p1, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    .line 219
    iget-object p3, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    invoke-static {p3}, Ll/ܿۧۧ;->֫(Ll/ܿۧۧ;)Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_0

    sget-object p3, Ll/ܿۧۧ;->ܿ:Ljava/lang/Object;

    invoke-virtual {p2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 220
    iget-object p2, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    invoke-static {p2}, Ll/ܿۧۧ;->֫(Ll/ܿۧۧ;)Ljava/lang/Object;

    move-result-object p2

    .line 111
    :cond_0
    invoke-virtual {p1, p2}, Ll/ܺۧۧ;->֫(Ljava/lang/Object;)Ll/ܺۧۧ;

    move-result-object p1

    .line 112
    invoke-virtual {v0, p1}, Ll/ᩳۧۧ;->֫(Ll/ܺۧۧ;)V

    return-object v0

    .line 117
    :cond_1
    iput-object v0, p0, Ll/᩻ۧۧ;->ᩳ֫:Ll/ᩳۧۧ;

    .line 118
    iget-boolean p1, p0, Ll/᩻ۧۧ;->۟:Z

    if-nez p1, :cond_2

    const/4 p1, 0x1

    .line 119
    iput-boolean p1, p0, Ll/᩻ۧۧ;->۟:Z

    .line 120
    invoke-virtual {p0}, Ll/᩺ܽۧ;->ۢ()V

    :cond_2
    return-object v0
.end method

.method public final ֫(Ll/ۢۧۧ;)V
    .locals 1

    .line 128
    move-object v0, p1

    check-cast v0, Ll/ᩳۧۧ;

    invoke-virtual {v0}, Ll/ᩳۧۧ;->᩷()V

    .line 129
    iget-object v0, p0, Ll/᩻ۧۧ;->ᩳ֫:Ll/ᩳۧۧ;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 130
    iput-object p1, p0, Ll/᩻ۧۧ;->ᩳ֫:Ll/ᩳۧۧ;

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۧ᩵֫;)V
    .locals 3

    .line 87
    iget-boolean v0, p0, Ll/᩻ۧۧ;->ܰ:Z

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    new-instance v1, Ll/ۤܽۧ;

    iget-object v2, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    iget-object v2, v2, Ll/ܰ֫ۧ;->ۧ:Ll/ۙ᩵֫;

    invoke-direct {v1, v2, p1}, Ll/ۤܽۧ;-><init>(Ll/ۙ᩵֫;Ll/ۧ᩵֫;)V

    .line 89
    invoke-virtual {v0, v1}, Ll/ܿۧۧ;->֫(Ll/ۙ᩵֫;)Ll/ܿۧۧ;

    move-result-object v0

    iput-object v0, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    goto :goto_0

    .line 92
    :cond_0
    invoke-static {p1}, Ll/ܿۧۧ;->֫(Ll/ۧ᩵֫;)Ll/ܿۧۧ;

    move-result-object v0

    iput-object v0, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    .line 94
    :goto_0
    iget-object v0, p0, Ll/᩺ܽۧ;->᩺:Ll/ۘۧۧ;

    invoke-interface {v0, p1}, Ll/ۘۧۧ;->֫(Ll/ۧ᩵֫;)V

    return-void
.end method

.method public final ۡ()V
    .locals 1

    .line 99
    iget-boolean v0, p0, Ll/᩻ۧۧ;->ܿ֫:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 100
    iput-boolean v0, p0, Ll/᩻ۧۧ;->۟:Z

    .line 101
    invoke-virtual {p0}, Ll/᩺ܽۧ;->ۢ()V

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/ۙ᩵֫;)V
    .locals 11

    .line 144
    iget-boolean v0, p0, Ll/᩻ۧۧ;->֫֫:Z

    if-eqz v0, :cond_0

    .line 145
    iget-object v0, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    invoke-virtual {v0, p1}, Ll/ܿۧۧ;->֫(Ll/ۙ᩵֫;)Ll/ܿۧۧ;

    move-result-object v0

    iput-object v0, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    .line 146
    iget-object v0, p0, Ll/᩻ۧۧ;->ᩳ֫:Ll/ᩳۧۧ;

    if-eqz v0, :cond_6

    .line 149
    invoke-virtual {v0}, Ll/ᩳۧۧ;->ᩳ()J

    move-result-wide v0

    .line 148
    invoke-direct {p0, v0, v1}, Ll/᩻ۧۧ;->֫(J)Z

    goto/16 :goto_3

    .line 151
    :cond_0
    invoke-virtual {p1}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 153
    iget-boolean v0, p0, Ll/᩻ۧۧ;->ܰ:Z

    if-eqz v0, :cond_1

    .line 154
    iget-object v0, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    invoke-virtual {v0, p1}, Ll/ܿۧۧ;->֫(Ll/ۙ᩵֫;)Ll/ܿۧۧ;

    move-result-object v0

    goto :goto_0

    .line 155
    :cond_1
    sget-object v0, Ll/᩶᩵֫;->ۚ:Ljava/lang/Object;

    sget-object v1, Ll/ܿۧۧ;->ܿ:Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ll/ܿۧۧ;->֫(Ll/ۙ᩵֫;Ljava/lang/Object;Ljava/lang/Object;)Ll/ܿۧۧ;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    goto/16 :goto_3

    :cond_2
    const/4 v0, 0x0

    .line 172
    iget-object v1, p0, Ll/᩻ۧۧ;->ܳ֫:Ll/᩶᩵֫;

    invoke-virtual {p1, v0, v1}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;)V

    .line 330
    iget-wide v2, v1, Ll/᩶᩵֫;->֫:J

    .line 174
    iget-object v6, v1, Ll/᩶᩵֫;->ᩴ:Ljava/lang/Object;

    .line 175
    iget-object v4, p0, Ll/᩻ۧۧ;->ᩳ֫:Ll/ᩳۧۧ;

    if-eqz v4, :cond_3

    .line 176
    invoke-virtual {v4}, Ll/ᩳۧۧ;->ܳ()J

    move-result-wide v4

    .line 177
    iget-object v7, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    iget-object v8, p0, Ll/᩻ۧۧ;->ᩳ֫:Ll/ᩳۧۧ;

    iget-object v8, v8, Ll/ᩳۧۧ;->᩶:Ll/ܺۧۧ;

    iget-object v8, v8, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget-object v9, p0, Ll/᩻ۧۧ;->ۧ֫:Ll/᩹᩵֫;

    invoke-virtual {v7, v8, v9}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    .line 693
    iget-wide v7, v9, Ll/᩹᩵֫;->ܿ:J

    add-long/2addr v7, v4

    .line 179
    iget-object v4, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    const-wide/16 v9, 0x0

    .line 1097
    invoke-virtual {v4, v0, v1, v9, v10}, Ll/ܿۧۧ;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    .line 330
    iget-wide v0, v1, Ll/᩶᩵֫;->֫:J

    cmp-long v4, v7, v0

    if-eqz v4, :cond_3

    move-wide v4, v7

    goto :goto_1

    :cond_3
    move-wide v4, v2

    .line 185
    :goto_1
    iget-object v2, p0, Ll/᩻ۧۧ;->ۧ֫:Ll/᩹᩵֫;

    const/4 v3, 0x0

    .line 186
    iget-object v1, p0, Ll/᩻ۧۧ;->ܳ֫:Ll/᩶᩵֫;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Ll/ۙ᩵֫;->֫(Ll/᩶᩵֫;Ll/᩹᩵֫;IJ)Landroid/util/Pair;

    move-result-object v0

    .line 188
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 189
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 191
    iget-boolean v0, p0, Ll/᩻ۧۧ;->ܰ:Z

    if-eqz v0, :cond_4

    .line 192
    iget-object v0, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    invoke-virtual {v0, p1}, Ll/ܿۧۧ;->֫(Ll/ۙ᩵֫;)Ll/ܿۧۧ;

    move-result-object v0

    goto :goto_2

    .line 193
    :cond_4
    invoke-static {p1, v6, v1}, Ll/ܿۧۧ;->֫(Ll/ۙ᩵֫;Ljava/lang/Object;Ljava/lang/Object;)Ll/ܿۧۧ;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    .line 194
    iget-object v0, p0, Ll/᩻ۧۧ;->ᩳ֫:Ll/ᩳۧۧ;

    if-eqz v0, :cond_6

    .line 196
    invoke-direct {p0, v2, v3}, Ll/᩻ۧۧ;->֫(J)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 197
    iget-object v0, v0, Ll/ᩳۧۧ;->᩶:Ll/ܺۧۧ;

    iget-object v1, v0, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    .line 219
    iget-object v2, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    invoke-static {v2}, Ll/ܿۧۧ;->֫(Ll/ܿۧۧ;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_5

    sget-object v2, Ll/ܿۧۧ;->ܿ:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 220
    iget-object v1, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    invoke-static {v1}, Ll/ܿۧۧ;->֫(Ll/ܿۧۧ;)Ljava/lang/Object;

    move-result-object v1

    .line 198
    :cond_5
    invoke-virtual {v0, v1}, Ll/ܺۧۧ;->֫(Ljava/lang/Object;)Ll/ܺۧۧ;

    move-result-object v0

    goto :goto_4

    :cond_6
    :goto_3
    const/4 v0, 0x0

    :goto_4
    const/4 v1, 0x1

    .line 202
    iput-boolean v1, p0, Ll/᩻ۧۧ;->ܰ:Z

    .line 203
    iput-boolean v1, p0, Ll/᩻ۧۧ;->֫֫:Z

    .line 204
    iget-object v1, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    invoke-virtual {p0, v1}, Ll/ۢ֫ۧ;->֫(Ll/ۙ᩵֫;)V

    if-eqz v0, :cond_7

    .line 206
    iget-object v1, p0, Ll/᩻ۧۧ;->ᩳ֫:Ll/ᩳۧۧ;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    invoke-virtual {v1, v0}, Ll/ᩳۧۧ;->֫(Ll/ܺۧۧ;)V

    :cond_7
    return-void
.end method

.method public final ܺ()Ll/ۙ᩵֫;
    .locals 1

    .line 77
    iget-object v0, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    return-object v0
.end method

.method public final ܽ(Ll/ܺۧۧ;)Ll/ܺۧۧ;
    .locals 2

    .line 214
    iget-object v0, p1, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    .line 226
    iget-object v1, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    invoke-static {v1}, Ll/ܿۧۧ;->֫(Ll/ܿۧۧ;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/᩻ۧۧ;->ܽ֫:Ll/ܿۧۧ;

    invoke-static {v1}, Ll/ܿۧۧ;->֫(Ll/ܿۧۧ;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 227
    sget-object v0, Ll/ܿۧۧ;->ܿ:Ljava/lang/Object;

    .line 214
    :cond_0
    invoke-virtual {p1, v0}, Ll/ܺۧۧ;->֫(Ljava/lang/Object;)Ll/ܺۧۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ᩷()V
    .locals 1

    const/4 v0, 0x0

    .line 136
    iput-boolean v0, p0, Ll/᩻ۧۧ;->֫֫:Z

    .line 137
    iput-boolean v0, p0, Ll/᩻ۧۧ;->۟:Z

    .line 138
    invoke-super {p0}, Ll/᩸֫ۧ;->᩷()V

    return-void
.end method
