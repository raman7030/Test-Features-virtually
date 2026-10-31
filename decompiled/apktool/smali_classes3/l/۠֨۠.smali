.class public final Ll/۠֨۠;
.super Ljava/lang/Object;
.source "W3YK"


# static fields
.field public static final ܽ:[I


# instance fields
.field public ֫:[I

.field public ۧ:Ll/֨֨۠;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    .line 93
    sput-object v0, Ll/۠֨۠;->ܽ:[I

    return-void
.end method

.method public constructor <init>(Ll/۠֨۠;)V
    .locals 2

    .line 104
    invoke-virtual {p1}, Ll/۠֨۠;->֫()Ll/۠֨۠;

    move-result-object v0

    iget-object v0, v0, Ll/۠֨۠;->֫:[I

    iget-object p1, p1, Ll/۠֨۠;->֫:[I

    const/4 v1, 0x0

    invoke-static {p1, v1}, Ll/֨֨۠;->֫([IZ)Ll/֨֨۠;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Ll/۠֨۠;-><init>([ILl/֨֨۠;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    .line 108
    sget-object v0, Ll/۠֨۠;->ܽ:[I

    invoke-static {v0, p1}, Ll/֨֨۠;->֫([IZ)Ll/֨֨۠;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Ll/۠֨۠;-><init>([ILl/֨֨۠;)V

    return-void
.end method

.method public constructor <init>([ILl/֨֨۠;)V
    .locals 1

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    iput-object p1, p0, Ll/۠֨۠;->֫:[I

    .line 115
    iput-object p2, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    .line 116
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    if-eqz p2, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    return-void

    .line 121
    :cond_0
    sget-object p2, Ll/۠֨۠;->ܽ:[I

    if-eq p1, p2, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ll/۫ۙ;->֫(Z)V

    return-void

    :cond_2
    const/4 p1, 0x0

    .line 118
    iput-object p1, p0, Ll/۠֨۠;->֫:[I

    return-void
.end method

.method public static bridge synthetic ᩳ()[I
    .locals 1

    .line 0
    sget-object v0, Ll/۠֨۠;->ܽ:[I

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 337
    iget-object v0, p0, Ll/۠֨۠;->֫:[I

    if-eqz v0, :cond_2

    array-length v1, v0

    if-lez v1, :cond_2

    .line 338
    array-length v0, v0

    mul-int/lit8 v0, v0, 0x20

    new-array v0, v0, [C

    const/4 v1, 0x0

    .line 339
    :goto_0
    iget-object v2, p0, Ll/۠֨۠;->֫:[I

    array-length v2, v2

    mul-int/lit8 v2, v2, 0x20

    if-ge v1, v2, :cond_1

    .line 340
    invoke-virtual {p0, v1}, Ll/۠֨۠;->ᩳ(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x31

    goto :goto_1

    :cond_0
    const/16 v2, 0x30

    :goto_1
    aput-char v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 342
    :cond_1
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    return-object v1

    :cond_2
    const-string v0, "[]"

    return-object v0
.end method

.method public final ֫()Ll/۠֨۠;
    .locals 6

    .line 164
    iget-object v0, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    sget-object v1, Ll/֨֨۠;->ۙ:Ll/֨֨۠;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 165
    new-instance v0, Ll/۠֨۠;

    .line 100
    invoke-direct {v0, v2}, Ll/۠֨۠;-><init>(Z)V

    .line 173
    iget-object v1, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    sget-object v3, Ll/֨֨۠;->᩹:Ll/֨֨۠;

    if-eq v1, v3, :cond_1

    .line 174
    iget-object v1, p0, Ll/۠֨۠;->֫:[I

    goto :goto_1

    .line 176
    :cond_1
    iget-object v1, p0, Ll/۠֨۠;->֫:[I

    array-length v4, v1

    new-array v4, v4, [I

    .line 177
    array-length v5, v1

    invoke-static {v1, v2, v4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, v4

    .line 166
    :goto_1
    iput-object v1, v0, Ll/۠֨۠;->֫:[I

    .line 167
    iput-object v3, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 4

    .line 220
    iget-object v0, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    sget-object v1, Ll/֨֨۠;->ۙ:Ll/֨֨۠;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    if-ltz p1, :cond_1

    const/4 v2, 0x1

    .line 221
    :cond_1
    invoke-static {v2}, Ll/۫ۙ;->֫(Z)V

    ushr-int/lit8 v0, p1, 0x5

    add-int/lit8 v1, v0, 0x1

    .line 222
    invoke-virtual {p0, v1}, Ll/۠֨۠;->ܳ(I)V

    .line 223
    iget-object v1, p0, Ll/۠֨۠;->֫:[I

    aget v2, v1, v0

    and-int/lit8 p1, p1, 0x1f

    shl-int p1, v3, p1

    not-int p1, p1

    and-int/2addr p1, v2

    aput p1, v1, v0

    .line 225
    sget-object p1, Ll/֨֨۠;->᩹:Ll/֨֨۠;

    iput-object p1, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    return-void
.end method

.method public final ֫(II)V
    .locals 5

    .line 197
    iget-object v0, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    sget-object v1, Ll/֨֨۠;->ۙ:Ll/֨֨۠;

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    ushr-int/lit8 v0, p2, 0x5

    add-int/2addr v0, v2

    .line 198
    invoke-virtual {p0, v0}, Ll/۠֨۠;->ܳ(I)V

    :goto_1
    if-ge p1, p2, :cond_1

    .line 200
    iget-object v0, p0, Ll/۠֨۠;->֫:[I

    ushr-int/lit8 v1, p1, 0x5

    aget v3, v0, v1

    and-int/lit8 v4, p1, 0x1f

    shl-int v4, v2, v4

    or-int/2addr v3, v4

    aput v3, v0, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 203
    :cond_1
    sget-object p1, Ll/֨֨۠;->᩹:Ll/֨֨۠;

    iput-object p1, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    return-void
.end method

.method public final ֫(Ll/۠֨۠;)V
    .locals 2

    .line 240
    iget-object v0, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    sget-object v1, Ll/֨֨۠;->ۙ:Ll/֨֨۠;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 241
    invoke-virtual {p0, p1}, Ll/۠֨۠;->ᩳ(Ll/۠֨۠;)V

    .line 242
    sget-object p1, Ll/֨֨۠;->᩹:Ll/֨֨۠;

    iput-object p1, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    return-void
.end method

.method public final ۧ(I)V
    .locals 3

    .line 209
    iget-object v0, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    sget-object v1, Ll/֨֨۠;->ۙ:Ll/֨֨۠;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 210
    new-instance v0, Ll/۠֨۠;

    .line 100
    invoke-direct {v0, v2}, Ll/۠֨۠;-><init>(Z)V

    .line 211
    iget-object v1, p0, Ll/۠֨۠;->֫:[I

    array-length v1, v1

    invoke-virtual {v0, v1}, Ll/۠֨۠;->ܳ(I)V

    .line 212
    invoke-virtual {v0, v2, p1}, Ll/۠֨۠;->֫(II)V

    .line 213
    invoke-virtual {p0, v0}, Ll/۠֨۠;->ᩳ(Ll/۠֨۠;)V

    .line 214
    sget-object p1, Ll/֨֨۠;->᩹:Ll/֨֨۠;

    iput-object p1, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    return-void
.end method

.method public final ۧ(Ll/۠֨۠;)V
    .locals 0

    .line 156
    invoke-virtual {p1}, Ll/۠֨۠;->֫()Ll/۠֨۠;

    move-result-object p1

    iget-object p1, p1, Ll/۠֨۠;->֫:[I

    iput-object p1, p0, Ll/۠֨۠;->֫:[I

    .line 157
    sget-object p1, Ll/֨֨۠;->᩹:Ll/֨֨۠;

    iput-object p1, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    return-void
.end method

.method public final ۧ()Z
    .locals 2

    .line 152
    iget-object v0, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    sget-object v1, Ll/֨֨۠;->ۙ:Ll/֨֨۠;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ(I)V
    .locals 2

    .line 127
    iget-object v0, p0, Ll/۠֨۠;->֫:[I

    array-length v1, v0

    if-ge v1, p1, :cond_0

    .line 128
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    iput-object p1, p0, Ll/۠֨۠;->֫:[I

    :cond_0
    return-void
.end method

.method public final ܳ(Ll/۠֨۠;)V
    .locals 4

    .line 282
    iget-object v0, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    sget-object v1, Ll/֨֨۠;->ۙ:Ll/֨֨۠;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 283
    iget-object v0, p1, Ll/۠֨۠;->֫:[I

    array-length v0, v0

    invoke-virtual {p0, v0}, Ll/۠֨۠;->ܳ(I)V

    .line 284
    :goto_1
    iget-object v0, p1, Ll/۠֨۠;->֫:[I

    array-length v1, v0

    if-ge v2, v1, :cond_1

    .line 285
    iget-object v1, p0, Ll/۠֨۠;->֫:[I

    aget v3, v1, v2

    aget v0, v0, v2

    xor-int/2addr v0, v3

    aput v0, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 287
    :cond_1
    sget-object p1, Ll/֨֨۠;->᩹:Ll/֨֨۠;

    iput-object p1, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    return-void
.end method

.method public final ܽ()V
    .locals 1

    const/4 v0, 0x0

    .line 147
    iput-object v0, p0, Ll/۠֨۠;->֫:[I

    .line 148
    sget-object v0, Ll/֨֨۠;->ۙ:Ll/֨֨۠;

    iput-object v0, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    return-void
.end method

.method public final ܽ(I)V
    .locals 4

    .line 185
    iget-object v0, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    sget-object v1, Ll/֨֨۠;->ۙ:Ll/֨֨۠;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    if-ltz p1, :cond_1

    const/4 v2, 0x1

    .line 186
    :cond_1
    invoke-static {v2}, Ll/۫ۙ;->֫(Z)V

    ushr-int/lit8 v0, p1, 0x5

    add-int/lit8 v1, v0, 0x1

    .line 187
    invoke-virtual {p0, v1}, Ll/۠֨۠;->ܳ(I)V

    .line 188
    iget-object v1, p0, Ll/۠֨۠;->֫:[I

    aget v2, v1, v0

    and-int/lit8 p1, p1, 0x1f

    shl-int p1, v3, p1

    or-int/2addr p1, v2

    aput p1, v1, v0

    .line 190
    sget-object p1, Ll/֨֨۠;->᩹:Ll/֨֨۠;

    iput-object p1, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    return-void
.end method

.method public final ܽ(Ll/۠֨۠;)V
    .locals 4

    .line 269
    iget-object v0, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    sget-object v1, Ll/֨֨۠;->ۙ:Ll/֨֨۠;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 270
    :goto_1
    iget-object v0, p0, Ll/۠֨۠;->֫:[I

    array-length v1, v0

    if-ge v2, v1, :cond_2

    .line 271
    iget-object v1, p1, Ll/۠֨۠;->֫:[I

    array-length v3, v1

    if-ge v2, v3, :cond_1

    .line 272
    aget v3, v0, v2

    aget v1, v1, v2

    not-int v1, v1

    and-int/2addr v1, v3

    aput v1, v0, v2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 275
    :cond_2
    sget-object p1, Ll/֨֨۠;->᩹:Ll/֨֨۠;

    iput-object p1, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    return-void
.end method

.method public final ܿ(I)I
    .locals 5

    .line 315
    iget-object v0, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    sget-object v1, Ll/֨֨۠;->ۙ:Ll/֨֨۠;

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    ushr-int/lit8 v0, p1, 0x5

    .line 317
    iget-object v1, p0, Ll/۠֨۠;->֫:[I

    array-length v3, v1

    const/4 v4, -0x1

    if-lt v0, v3, :cond_1

    return v4

    .line 320
    :cond_1
    aget v1, v1, v0

    and-int/lit8 p1, p1, 0x1f

    shl-int p1, v2, p1

    sub-int/2addr p1, v2

    not-int p1, p1

    and-int/2addr p1, v1

    :goto_1
    if-eqz p1, :cond_7

    shl-int/lit8 v0, v0, 0x5

    if-nez p1, :cond_2

    const/16 p1, 0x20

    goto :goto_3

    :cond_2
    const v1, 0xffff

    and-int/2addr v1, p1

    if-nez v1, :cond_3

    ushr-int/lit8 p1, p1, 0x10

    const/16 v1, 0x11

    goto :goto_2

    :cond_3
    const/4 v1, 0x1

    :goto_2
    and-int/lit16 v3, p1, 0xff

    if-nez v3, :cond_4

    add-int/lit8 v1, v1, 0x8

    ushr-int/lit8 p1, p1, 0x8

    :cond_4
    and-int/lit8 v3, p1, 0xf

    if-nez v3, :cond_5

    add-int/lit8 v1, v1, 0x4

    ushr-int/lit8 p1, p1, 0x4

    :cond_5
    and-int/lit8 v3, p1, 0x3

    if-nez v3, :cond_6

    add-int/lit8 v1, v1, 0x2

    ushr-int/lit8 p1, p1, 0x2

    :cond_6
    and-int/2addr p1, v2

    sub-int p1, v1, p1

    :goto_3
    add-int/2addr v0, p1

    return v0

    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 326
    iget-object p1, p0, Ll/۠֨۠;->֫:[I

    array-length v1, p1

    if-lt v0, v1, :cond_8

    return v4

    .line 329
    :cond_8
    aget p1, p1, v0

    goto :goto_1
.end method

.method public final ܿ(Ll/۠֨۠;)V
    .locals 4

    .line 257
    iget-object v0, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    sget-object v1, Ll/֨֨۠;->ۙ:Ll/֨֨۠;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 258
    iget-object v0, p1, Ll/۠֨۠;->֫:[I

    array-length v0, v0

    invoke-virtual {p0, v0}, Ll/۠֨۠;->ܳ(I)V

    .line 259
    :goto_1
    iget-object v0, p1, Ll/۠֨۠;->֫:[I

    array-length v1, v0

    if-ge v2, v1, :cond_1

    .line 260
    iget-object v1, p0, Ll/۠֨۠;->֫:[I

    aget v3, v1, v2

    aget v0, v0, v2

    or-int/2addr v0, v3

    aput v0, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 262
    :cond_1
    sget-object p1, Ll/֨֨۠;->᩹:Ll/֨֨۠;

    iput-object p1, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    return-void
.end method

.method public final ᩳ(Ll/۠֨۠;)V
    .locals 4

    .line 247
    iget-object v0, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    sget-object v1, Ll/֨֨۠;->ۙ:Ll/֨֨۠;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 248
    iget-object v0, p1, Ll/۠֨۠;->֫:[I

    array-length v0, v0

    invoke-virtual {p0, v0}, Ll/۠֨۠;->ܳ(I)V

    .line 249
    :goto_1
    iget-object v0, p1, Ll/۠֨۠;->֫:[I

    array-length v1, v0

    if-ge v2, v1, :cond_1

    .line 250
    iget-object v1, p0, Ll/۠֨۠;->֫:[I

    aget v3, v1, v2

    aget v0, v0, v2

    and-int/2addr v0, v3

    aput v0, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final ᩳ(I)Z
    .locals 4

    .line 231
    iget-object v0, p0, Ll/۠֨۠;->ۧ:Ll/֨֨۠;

    sget-object v1, Ll/֨֨۠;->ۙ:Ll/֨֨۠;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    if-ltz p1, :cond_1

    .line 232
    iget-object v0, p0, Ll/۠֨۠;->֫:[I

    array-length v1, v0

    shl-int/lit8 v1, v1, 0x5

    if-ge p1, v1, :cond_1

    ushr-int/lit8 v1, p1, 0x5

    aget v0, v0, v1

    and-int/lit8 p1, p1, 0x1f

    shl-int p1, v3, p1

    and-int/2addr p1, v0

    if-eqz p1, :cond_1

    return v3

    :cond_1
    return v2
.end method
