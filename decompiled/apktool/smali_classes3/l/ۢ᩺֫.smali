.class public final Ll/ۢ᩺֫;
.super Ljava/lang/Object;
.source "37NB"

# interfaces
.implements Ll/֨᩷ۧ;


# static fields
.field public static final ۢ:Ljava/util/regex/Pattern;

.field public static final ᩷:Ljava/util/regex/Pattern;


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۜ:Ll/ۢ֨֫;

.field public ۧ:Ll/᩸᩷ۧ;

.field public ܳ:I

.field public final ܽ:Z

.field public final ܿ:Ll/ᩳ֨֫;

.field public ᩳ:[B

.field public final ᩻:Ll/ۜᩴۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "LOCAL:([^,]+)"

    .line 55
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۢ᩺֫;->᩷:Ljava/util/regex/Pattern;

    const-string v0, "MPEGTS:(-?\\d+)"

    .line 56
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۢ᩺֫;->ۢ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ۢ֨֫;Ll/ۜᩴۧ;Z)V
    .locals 0

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    iput-object p1, p0, Ll/ۢ᩺֫;->֫:Ljava/lang/String;

    .line 90
    iput-object p2, p0, Ll/ۢ᩺֫;->ۜ:Ll/ۢ֨֫;

    .line 91
    new-instance p1, Ll/ᩳ֨֫;

    invoke-direct {p1}, Ll/ᩳ֨֫;-><init>()V

    iput-object p1, p0, Ll/ۢ᩺֫;->ܿ:Ll/ᩳ֨֫;

    const/16 p1, 0x400

    new-array p1, p1, [B

    .line 92
    iput-object p1, p0, Ll/ۢ᩺֫;->ᩳ:[B

    .line 93
    iput-object p3, p0, Ll/ۢ᩺֫;->᩻:Ll/ۜᩴۧ;

    .line 94
    iput-boolean p4, p0, Ll/ۢ᩺֫;->ܽ:Z

    return-void
.end method

.method private ֫(J)Ll/᩵ۢۧ;
    .locals 3
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "output"
        }
    .end annotation

    .line 225
    iget-object v0, p0, Ll/ۢ᩺֫;->ۧ:Ll/᩸᩷ۧ;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v0

    .line 226
    new-instance v1, Ll/֨ᩴ֫;

    invoke-direct {v1}, Ll/֨ᩴ֫;-><init>()V

    const-string v2, "text/vtt"

    .line 228
    invoke-virtual {v1, v2}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۢ᩺֫;->֫:Ljava/lang/String;

    .line 229
    invoke-virtual {v1, v2}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    .line 230
    invoke-virtual {v1, p1, p2}, Ll/֨ᩴ֫;->֫(J)V

    .line 231
    invoke-virtual {v1}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    .line 226
    invoke-interface {v0, p1}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 232
    iget-object p1, p0, Ll/ۢ᩺֫;->ۧ:Ll/᩸᩷ۧ;

    invoke-interface {p1}, Ll/᩸᩷ۧ;->ܳ()V

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 17

    move-object/from16 v0, p0

    .line 141
    iget-object v1, v0, Ll/ۢ᩺֫;->ۧ:Ll/᩸᩷ۧ;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v1

    long-to-int v2, v1

    .line 145
    iget v1, v0, Ll/ۢ᩺֫;->ܳ:I

    iget-object v3, v0, Ll/ۢ᩺֫;->ᩳ:[B

    array-length v4, v3

    const/4 v5, -0x1

    if-ne v1, v4, :cond_1

    if-eq v2, v5, :cond_0

    move v1, v2

    goto :goto_0

    .line 149
    :cond_0
    array-length v1, v3

    :goto_0
    mul-int/lit8 v1, v1, 0x3

    div-int/lit8 v1, v1, 0x2

    .line 147
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    iput-object v1, v0, Ll/ۢ᩺֫;->ᩳ:[B

    .line 153
    :cond_1
    iget-object v1, v0, Ll/ۢ᩺֫;->ᩳ:[B

    iget v3, v0, Ll/ۢ᩺֫;->ܳ:I

    array-length v4, v1

    sub-int/2addr v4, v3

    move-object/from16 v6, p1

    invoke-interface {v6, v1, v3, v4}, Ll/ۢᩴ֫;->read([BII)I

    move-result v1

    if-eq v1, v5, :cond_3

    .line 155
    iget v3, v0, Ll/ۢ᩺֫;->ܳ:I

    add-int/2addr v3, v1

    iput v3, v0, Ll/ۢ᩺֫;->ܳ:I

    if-eq v2, v5, :cond_2

    if-eq v3, v2, :cond_3

    :cond_2
    const/4 v1, 0x0

    return v1

    .line 168
    :cond_3
    new-instance v1, Ll/ᩳ֨֫;

    iget-object v2, v0, Ll/ۢ᩺֫;->ᩳ:[B

    invoke-direct {v1, v2}, Ll/ᩳ֨֫;-><init>([B)V

    .line 171
    invoke-static {v1}, Ll/۟᩵ۧ;->ܽ(Ll/ᩳ֨֫;)V

    .line 588
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v2

    const-wide/16 v3, 0x0

    move-wide v6, v3

    move-wide v8, v6

    .line 179
    :goto_1
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    const/4 v11, 0x1

    if-nez v10, :cond_7

    const-string v10, "X-TIMESTAMP-MAP"

    .line 181
    invoke-virtual {v2, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_6

    .line 182
    sget-object v6, Ll/ۢ᩺֫;->᩷:Ljava/util/regex/Pattern;

    invoke-virtual {v6, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    .line 183
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->find()Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_5

    .line 187
    sget-object v7, Ll/ۢ᩺֫;->ۢ:Ljava/util/regex/Pattern;

    invoke-virtual {v7, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    .line 188
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->find()Z

    move-result v9

    if-eqz v9, :cond_4

    .line 194
    invoke-virtual {v6, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    invoke-static {v2}, Ll/۟᩵ۧ;->ۧ(Ljava/lang/String;)J

    move-result-wide v8

    .line 197
    invoke-virtual {v7, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v10

    .line 274
    sget-object v2, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1955
    sget-object v16, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v12, 0xf4240

    const-wide/32 v14, 0x15f90

    invoke-static/range {v10 .. v16}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v6

    goto :goto_2

    :cond_4
    const-string v1, "X-TIMESTAMP-MAP doesn\'t contain media timestamp: "

    .line 189
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v8}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    :cond_5
    const-string v1, "X-TIMESTAMP-MAP doesn\'t contain local timestamp: "

    .line 184
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v8}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v1

    throw v1

    .line 588
    :cond_6
    :goto_2
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ll/ᩳ֨֫;->ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    .line 202
    :cond_7
    invoke-static {v1}, Ll/۟᩵ۧ;->֫(Ll/ᩳ֨֫;)Ljava/util/regex/Matcher;

    move-result-object v1

    if-nez v1, :cond_8

    .line 205
    invoke-direct {v0, v3, v4}, Ll/ۢ᩺֫;->֫(J)Ll/᩵ۢۧ;

    return v5

    .line 210
    :cond_8
    invoke-virtual {v1, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    invoke-static {v1}, Ll/۟᩵ۧ;->ۧ(Ljava/lang/String;)J

    move-result-wide v1

    add-long/2addr v6, v1

    sub-long v10, v6, v8

    .line 298
    sget-object v3, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1955
    sget-object v16, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v12, 0x15f90

    const-wide/32 v14, 0xf4240

    invoke-static/range {v10 .. v16}, Ll/ۘ֨֫;->֫(JJJLjava/math/RoundingMode;)J

    move-result-wide v3

    const-wide v6, 0x200000000L

    .line 285
    rem-long/2addr v3, v6

    .line 212
    iget-object v6, v0, Ll/ۢ᩺֫;->ۜ:Ll/ۢ֨֫;

    invoke-virtual {v6, v3, v4}, Ll/ۢ֨֫;->ۧ(J)J

    move-result-wide v8

    sub-long v1, v8, v1

    .line 216
    invoke-direct {v0, v1, v2}, Ll/ۢ᩺֫;->֫(J)Ll/᩵ۢۧ;

    move-result-object v7

    .line 218
    iget-object v1, v0, Ll/ۢ᩺֫;->ᩳ:[B

    iget v2, v0, Ll/ۢ᩺֫;->ܳ:I

    iget-object v3, v0, Ll/ۢ᩺֫;->ܿ:Ll/ᩳ֨֫;

    invoke-virtual {v3, v2, v1}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 219
    iget v1, v0, Ll/ۢ᩺֫;->ܳ:I

    invoke-interface {v7, v1, v3}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 220
    iget v11, v0, Ll/ۢ᩺֫;->ܳ:I

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v10, 0x1

    invoke-interface/range {v7 .. v13}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    return v5
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(JJ)V
    .locals 0

    .line 130
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 3

    .line 121
    iget-boolean v0, p0, Ll/ۢ᩺֫;->ܽ:Z

    if-eqz v0, :cond_0

    .line 122
    new-instance v0, Ll/ۡᩴۧ;

    iget-object v1, p0, Ll/ۢ᩺֫;->᩻:Ll/ۜᩴۧ;

    invoke-direct {v0, p1, v1}, Ll/ۡᩴۧ;-><init>(Ll/᩸᩷ۧ;Ll/ۜᩴۧ;)V

    move-object p1, v0

    .line 123
    :cond_0
    iput-object p1, p0, Ll/ۢ᩺֫;->ۧ:Ll/᩸᩷ۧ;

    .line 124
    new-instance v0, Ll/᩷ۢۧ;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Ll/᩷ۢۧ;-><init>(J)V

    invoke-interface {p1, v0}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 5

    .line 102
    iget-object v0, p0, Ll/ۢ᩺֫;->ᩳ:[B

    check-cast p1, Ll/ܺ᩷ۧ;

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-virtual {p1, v1, v1, v2, v0}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 104
    iget-object v0, p0, Ll/ۢ᩺֫;->ᩳ:[B

    iget-object v3, p0, Ll/ۢ᩺֫;->ܿ:Ll/ᩳ֨֫;

    invoke-virtual {v3, v2, v0}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 105
    invoke-static {v3}, Ll/۟᩵ۧ;->ۧ(Ll/ᩳ֨֫;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 109
    :cond_0
    iget-object v0, p0, Ll/ۢ᩺֫;->ᩳ:[B

    const/4 v4, 0x3

    invoke-virtual {p1, v1, v2, v4, v0}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 114
    iget-object p1, p0, Ll/ۢ᩺֫;->ᩳ:[B

    const/16 v0, 0x9

    invoke-virtual {v3, v0, p1}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 115
    invoke-static {v3}, Ll/۟᩵ۧ;->ۧ(Ll/ᩳ֨֫;)Z

    move-result p1

    return p1
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 89
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/֨᩷ۧ;
    .locals 0

    return-object p0
.end method
