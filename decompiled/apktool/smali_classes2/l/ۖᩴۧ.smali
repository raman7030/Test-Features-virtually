.class public final Ll/ۖᩴۧ;
.super Ljava/lang/Object;
.source "Q8RD"

# interfaces
.implements Ll/᩵ۢۧ;


# instance fields
.field public ֫:Ll/۠ᩴ֫;

.field public ۜ:Z

.field public ۧ:Ll/ۢᩴۧ;

.field public ܳ:I

.field public final ܽ:Ll/᩵ۢۧ;

.field public ܿ:[B

.field public final ᩳ:Ll/ᩳ֨֫;

.field public final ᩷:Ll/ۜᩴۧ;

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/᩵ۢۧ;Ll/ۜᩴۧ;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Ll/ۖᩴۧ;->ܽ:Ll/᩵ۢۧ;

    .line 61
    iput-object p2, p0, Ll/ۖᩴۧ;->᩷:Ll/ۜᩴۧ;

    const/4 p1, 0x0

    .line 63
    iput p1, p0, Ll/ۖᩴۧ;->᩻:I

    .line 64
    iput p1, p0, Ll/ۖᩴۧ;->ܳ:I

    .line 65
    sget-object p1, Ll/ۘ֨֫;->ܿ:[B

    iput-object p1, p0, Ll/ۖᩴۧ;->ܿ:[B

    .line 66
    new-instance p1, Ll/ᩳ֨֫;

    invoke-direct {p1}, Ll/ᩳ֨֫;-><init>()V

    iput-object p1, p0, Ll/ۖᩴۧ;->ᩳ:Ll/ᩳ֨֫;

    return-void
.end method

.method private ֫(I)V
    .locals 4

    .line 216
    iget-object v0, p0, Ll/ۖᩴۧ;->ܿ:[B

    array-length v0, v0

    iget v1, p0, Ll/ۖᩴۧ;->ܳ:I

    sub-int/2addr v0, v1

    if-lt v0, p1, :cond_0

    return-void

    .line 219
    :cond_0
    iget v0, p0, Ll/ۖᩴۧ;->᩻:I

    sub-int/2addr v1, v0

    mul-int/lit8 v0, v1, 0x2

    add-int/2addr p1, v1

    .line 223
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 224
    iget-object v0, p0, Ll/ۖᩴۧ;->ܿ:[B

    array-length v2, v0

    if-gt p1, v2, :cond_1

    move-object p1, v0

    goto :goto_0

    :cond_1
    new-array p1, p1, [B

    .line 225
    :goto_0
    iget v2, p0, Ll/ۖᩴۧ;->᩻:I

    const/4 v3, 0x0

    invoke-static {v0, v2, p1, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 226
    iput v3, p0, Ll/ۖᩴۧ;->᩻:I

    .line 227
    iput v1, p0, Ll/ۖᩴۧ;->ܳ:I

    .line 228
    iput-object p1, p0, Ll/ۖᩴۧ;->ܿ:[B

    return-void
.end method

.method public static ֫(Ll/ۖᩴۧ;JILl/۬ۘۧ;)V
    .locals 8

    .line 184
    iget-object v0, p0, Ll/ۖᩴۧ;->֫:Ll/۠ᩴ֫;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 185
    iget-object v0, p4, Ll/۬ۘۧ;->֫:Ll/ܳ۬ܺ;

    iget-wide v1, p4, Ll/۬ۘۧ;->ۧ:J

    .line 186
    invoke-static {v1, v2, v0}, Ll/ۗۘۧ;->֫(JLjava/util/List;)[B

    move-result-object v0

    .line 187
    iget-object v1, p0, Ll/ۖᩴۧ;->ᩳ:Ll/ᩳ֨֫;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    array-length v2, v0

    invoke-virtual {v1, v2, v0}, Ll/ᩳ֨֫;->֫(I[B)V

    .line 188
    iget-object v2, p0, Ll/ۖᩴۧ;->ܽ:Ll/᩵ۢۧ;

    array-length v3, v0

    invoke-interface {v2, v3, v1}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    .line 190
    iget-wide v1, p4, Ll/۬ۘۧ;->ᩳ:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v5, 0x7fffffffffffffffL

    cmp-long p4, v1, v3

    if-nez p4, :cond_1

    .line 191
    iget-object p4, p0, Ll/ۖᩴۧ;->֫:Ll/۠ᩴ֫;

    iget-wide v1, p4, Ll/۠ᩴ֫;->ܳ֫:J

    cmp-long p4, v1, v5

    if-nez p4, :cond_0

    const/4 p4, 0x1

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    invoke-static {p4}, Ll/᩺֡֫;->ۧ(Z)V

    goto :goto_1

    .line 193
    :cond_1
    iget-object p4, p0, Ll/ۖᩴۧ;->֫:Ll/۠ᩴ֫;

    iget-wide v3, p4, Ll/۠ᩴ֫;->ܳ֫:J

    cmp-long p4, v3, v5

    if-nez p4, :cond_2

    add-long/2addr p1, v1

    goto :goto_1

    :cond_2
    add-long p1, v1, v3

    :goto_1
    move-wide v2, p1

    .line 198
    iget-object v1, p0, Ll/ۖᩴۧ;->ܽ:Ll/᩵ۢۧ;

    or-int/lit8 v4, p3, 0x1

    array-length v5, v0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-interface/range {v1 .. v7}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۢᩴ֫;IZ)I
    .locals 0

    .line 168
    invoke-virtual {p0, p1, p2, p3}, Ll/ۖᩴۧ;->ۧ(Ll/ۢᩴ֫;IZ)I

    move-result p1

    return p1
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 82
    iput-boolean v0, p0, Ll/ۖᩴۧ;->ۜ:Z

    return-void
.end method

.method public final ֫(ILl/ᩳ֨֫;)V
    .locals 1

    const/4 v0, 0x0

    .line 176
    invoke-virtual {p0, p2, p1, v0}, Ll/ۖᩴۧ;->֫(Ll/ᩳ֨֫;II)V

    return-void
.end method

.method public final synthetic ֫(J)V
    .locals 0

    return-void
.end method

.method public final ֫(JIIILl/ᩴۢۧ;)V
    .locals 8

    .line 153
    iget-object v0, p0, Ll/ۖᩴۧ;->ۧ:Ll/ۢᩴۧ;

    if-nez v0, :cond_0

    .line 154
    iget-object v1, p0, Ll/ۖᩴۧ;->ܽ:Ll/᩵ۢۧ;

    move-wide v2, p1

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-interface/range {v1 .. v7}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    if-nez p6, :cond_1

    const/4 p6, 0x1

    goto :goto_0

    :cond_1
    const/4 p6, 0x0

    :goto_0
    const-string v1, "DRM on subtitles is not supported"

    .line 157
    invoke-static {v1, p6}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 159
    iget p6, p0, Ll/ۖᩴۧ;->ܳ:I

    sub-int/2addr p6, p5

    sub-int/2addr p6, p4

    .line 161
    :try_start_0
    iget-object v1, p0, Ll/ۖᩴۧ;->ۧ:Ll/ۢᩴۧ;

    iget-object v2, p0, Ll/ۖᩴۧ;->ܿ:[B

    .line 165
    invoke-static {}, Ll/᩷ᩴۧ;->ۧ()Ll/᩷ᩴۧ;

    move-result-object v5

    new-instance v6, Ll/ܺᩴۧ;

    invoke-direct {v6, p0, p1, p2, p3}, Ll/ܺᩴۧ;-><init>(Ll/ۖᩴۧ;JI)V

    move v3, p6

    move v4, p4

    .line 161
    invoke-interface/range {v1 .. v6}, Ll/ۢᩴۧ;->֫([BIILl/᩷ᩴۧ;Ll/᩻ۚ֫;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 168
    iget-boolean p2, p0, Ll/ۖᩴۧ;->ۜ:Z

    if-eqz p2, :cond_3

    const-string p2, "Parsing subtitles failed, ignoring sample."

    .line 170
    invoke-static {p2, p1}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    add-int/2addr p6, p4

    .line 175
    iput p6, p0, Ll/ۖᩴۧ;->᩻:I

    .line 176
    iget p1, p0, Ll/ۖᩴۧ;->ܳ:I

    if-ne p6, p1, :cond_2

    .line 178
    iput v0, p0, Ll/ۖᩴۧ;->᩻:I

    .line 179
    iput v0, p0, Ll/ۖᩴۧ;->ܳ:I

    :cond_2
    return-void

    .line 172
    :cond_3
    throw p1
.end method

.method public final ֫(Ll/۠ᩴ֫;)V
    .locals 6

    .line 89
    iget-object v0, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    iget-object v0, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-static {v0}, Ll/ۢ᩵֫;->ܿ(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/᩺֡֫;->֫(Z)V

    .line 91
    iget-object v1, p0, Ll/ۖᩴۧ;->֫:Ll/۠ᩴ֫;

    invoke-virtual {p1, v1}, Ll/۠ᩴ֫;->equals(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, Ll/ۖᩴۧ;->᩷:Ll/ۜᩴۧ;

    if-nez v1, :cond_2

    .line 92
    iput-object p1, p0, Ll/ۖᩴۧ;->֫:Ll/۠ᩴ֫;

    .line 94
    invoke-interface {v2, p1}, Ll/ۜᩴۧ;->֫(Ll/۠ᩴ֫;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 95
    invoke-interface {v2, p1}, Ll/ۜᩴۧ;->ܽ(Ll/۠ᩴ֫;)Ll/ۢᩴۧ;

    move-result-object v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 96
    :goto_1
    iput-object v1, p0, Ll/ۖᩴۧ;->ۧ:Ll/ۢᩴۧ;

    .line 98
    :cond_2
    iget-object v1, p0, Ll/ۖᩴۧ;->ۧ:Ll/ۢᩴۧ;

    iget-object v3, p0, Ll/ۖᩴۧ;->ܽ:Ll/᩵ۢۧ;

    if-nez v1, :cond_3

    .line 99
    invoke-interface {v3, p1}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    return-void

    .line 103
    :cond_3
    invoke-virtual {p1}, Ll/۠ᩴ֫;->֫()Ll/֨ᩴ֫;

    move-result-object v1

    const-string v4, "application/x-media3-cues"

    .line 104
    invoke-virtual {v1, v4}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    .line 105
    invoke-virtual {v1, v0}, Ll/֨ᩴ֫;->֫(Ljava/lang/String;)V

    const-wide v4, 0x7fffffffffffffffL

    .line 108
    invoke-virtual {v1, v4, v5}, Ll/֨ᩴ֫;->֫(J)V

    .line 109
    invoke-interface {v2, p1}, Ll/ۜᩴۧ;->ۧ(Ll/۠ᩴ֫;)I

    move-result p1

    invoke-virtual {v1, p1}, Ll/֨ᩴ֫;->ܳ(I)V

    .line 110
    invoke-virtual {v1}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    .line 101
    invoke-interface {v3, p1}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;II)V
    .locals 1

    .line 137
    iget-object v0, p0, Ll/ۖᩴۧ;->ۧ:Ll/ۢᩴۧ;

    if-nez v0, :cond_0

    .line 138
    iget-object v0, p0, Ll/ۖᩴۧ;->ܽ:Ll/᩵ۢۧ;

    invoke-interface {v0, p1, p2, p3}, Ll/᩵ۢۧ;->֫(Ll/ᩳ֨֫;II)V

    return-void

    .line 141
    :cond_0
    invoke-direct {p0, p2}, Ll/ۖᩴۧ;->֫(I)V

    .line 142
    iget-object p3, p0, Ll/ۖᩴۧ;->ܿ:[B

    iget v0, p0, Ll/ۖᩴۧ;->ܳ:I

    invoke-virtual {p1, v0, p2, p3}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 143
    iget p1, p0, Ll/ۖᩴۧ;->ܳ:I

    add-int/2addr p1, p2

    iput p1, p0, Ll/ۖᩴۧ;->ܳ:I

    return-void
.end method

.method public final ۧ(Ll/ۢᩴ֫;IZ)I
    .locals 2

    .line 118
    iget-object v0, p0, Ll/ۖᩴۧ;->ۧ:Ll/ۢᩴۧ;

    if-nez v0, :cond_0

    .line 119
    iget-object v0, p0, Ll/ۖᩴۧ;->ܽ:Ll/᩵ۢۧ;

    invoke-interface {v0, p1, p2, p3}, Ll/᩵ۢۧ;->ۧ(Ll/ۢᩴ֫;IZ)I

    move-result p1

    return p1

    .line 121
    :cond_0
    invoke-direct {p0, p2}, Ll/ۖᩴۧ;->֫(I)V

    .line 122
    iget-object v0, p0, Ll/ۖᩴۧ;->ܿ:[B

    iget v1, p0, Ll/ۖᩴۧ;->ܳ:I

    invoke-interface {p1, v0, v1, p2}, Ll/ۢᩴ֫;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_2

    if-eqz p3, :cond_1

    return p2

    .line 127
    :cond_1
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 130
    :cond_2
    iget p2, p0, Ll/ۖᩴۧ;->ܳ:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/ۖᩴۧ;->ܳ:I

    return p1
.end method
