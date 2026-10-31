.class public final Ll/᩸᩷ܿ;
.super Ll/۬ᩴܺ;
.source "S978"


# static fields
.field public static final ۜ:Ll/᩸᩷ܿ;

.field public static final ۢ:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final ᩷:Ll/᩶۫᩷;

.field public static final ᩻:Ll/ۧۤᩴ;


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 22
    new-instance v0, Ll/᩶۫᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/᩸᩷ܿ;->᩷:Ll/᩶۫᩷;

    .line 159
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Ll/ܶ᩷ܿ;

    .line 233
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 159
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Ll/᩸᩷ܿ;->ۢ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 160
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    sput-object v0, Ll/᩸᩷ܿ;->᩻:Ll/ۧۤᩴ;

    const/4 v6, 0x0

    const/4 v1, 0x0

    const v2, 0x161616

    const v3, 0x161616

    const v4, 0x161616

    const v5, 0x161616

    .line 224
    invoke-static/range {v1 .. v6}, Ll/᩸᩷ܿ;->֫(Ljava/lang/String;IIIII)Ll/᩸᩷ܿ;

    move-result-object v0

    sput-object v0, Ll/᩸᩷ܿ;->ۜ:Ll/᩸᩷ܿ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIIII)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Ll/᩸᩷ܿ;->ܽ:I

    iput p3, p0, Ll/᩸᩷ܿ;->ۧ:I

    iput p4, p0, Ll/᩸᩷ܿ;->ܳ:I

    iput p5, p0, Ll/᩸᩷ܿ;->ܿ:I

    iput p6, p0, Ll/᩸᩷ܿ;->ᩳ:I

    iput-object p1, p0, Ll/᩸᩷ܿ;->֫:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/String;IIIII)Ll/᩸᩷ܿ;
    .locals 10

    and-int/lit8 v0, p5, 0x40

    if-nez v0, :cond_4

    if-eqz p0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 174
    sget-object v1, Ll/᩸᩷ܿ;->ۢ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩷ܿ;

    .line 175
    sget-object v7, Ll/᩸᩷ܿ;->᩻:Ll/ۧۤᩴ;

    if-eqz v0, :cond_2

    .line 177
    invoke-virtual {v7, v0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩸᩷ܿ;

    .line 178
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    if-eqz v2, :cond_1

    return-object v2

    .line 182
    :cond_1
    new-instance v0, Ll/ܶ᩷ܿ;

    .line 233
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    .line 184
    :cond_2
    new-instance v0, Ll/ܶ᩷ܿ;

    .line 233
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 185
    invoke-virtual {v7, v0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸᩷ܿ;

    if-eqz v1, :cond_3

    return-object v1

    :cond_3
    :goto_0
    move-object v8, v0

    .line 190
    new-instance v9, Ll/᩸᩷ܿ;

    const/4 v1, 0x0

    move-object v0, v9

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Ll/᩸᩷ܿ;-><init>(Ljava/lang/String;IIIII)V

    .line 191
    invoke-virtual {v7, v8, v9}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v9

    .line 172
    :cond_4
    :goto_1
    new-instance v7, Ll/᩸᩷ܿ;

    move-object v0, v7

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Ll/᩸᩷ܿ;-><init>(Ljava/lang/String;IIIII)V

    return-object v7
.end method

.method public static ֫(Ll/۬ۜܽ;)Ll/᩸᩷ܿ;
    .locals 7

    .line 138
    invoke-virtual {p0}, Ll/۬ۜܽ;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    .line 139
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    .line 140
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v4

    const/16 v1, 0xf1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v1, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    goto :goto_1

    :cond_0
    const/16 v1, 0xf2

    if-ne v0, v1, :cond_1

    .line 146
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    .line 147
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    goto :goto_0

    :cond_1
    const/16 v1, 0xf3

    if-ne v0, v1, :cond_2

    .line 149
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    .line 150
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    .line 151
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v3

    :goto_0
    move v5, v1

    move-object v1, v3

    move v3, v0

    .line 155
    :goto_1
    invoke-virtual {p0}, Ll/۬ۜܽ;->readByte()B

    move-result p0

    and-int/lit16 v6, p0, 0xff

    .line 156
    invoke-static/range {v1 .. v6}, Ll/᩸᩷ܿ;->֫(Ljava/lang/String;IIIII)Ll/᩸᩷ܿ;

    move-result-object p0

    return-object p0

    .line 153
    :cond_2
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 207
    const-class v1, Ll/᩸᩷ܿ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 209
    :cond_0
    check-cast p1, Ll/᩸᩷ܿ;

    .line 210
    iget v1, p0, Ll/᩸᩷ܿ;->ᩳ:I

    iget v2, p1, Ll/᩸᩷ܿ;->ᩳ:I

    if-ne v1, v2, :cond_1

    iget v1, p0, Ll/᩸᩷ܿ;->ܽ:I

    iget v2, p1, Ll/᩸᩷ܿ;->ܽ:I

    if-ne v1, v2, :cond_1

    iget v1, p0, Ll/᩸᩷ܿ;->ۧ:I

    iget v2, p1, Ll/᩸᩷ܿ;->ۧ:I

    if-ne v1, v2, :cond_1

    iget v1, p0, Ll/᩸᩷ܿ;->ܳ:I

    iget v2, p1, Ll/᩸᩷ܿ;->ܳ:I

    if-ne v1, v2, :cond_1

    iget v1, p0, Ll/᩸᩷ܿ;->ܿ:I

    iget v2, p1, Ll/᩸᩷ܿ;->ܿ:I

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Ll/᩸᩷ܿ;->֫:Ljava/lang/String;

    iget-object p1, p1, Ll/᩸᩷ܿ;->֫:Ljava/lang/String;

    invoke-static {v1, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 216
    iget v0, p0, Ll/᩸᩷ܿ;->ܽ:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/᩸᩷ܿ;->ۧ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 217
    iget v1, p0, Ll/᩸᩷ܿ;->ܳ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 218
    iget v1, p0, Ll/᩸᩷ܿ;->ܿ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 219
    iget v1, p0, Ll/᩸᩷ܿ;->ᩳ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 220
    iget-object v1, p0, Ll/᩸᩷ܿ;->֫:Ljava/lang/String;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 198
    iget v0, p0, Ll/᩸᩷ܿ;->ܽ:I

    .line 199
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Ll/᩸᩷ܿ;->ۧ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Ll/᩸᩷ܿ;->ܳ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Ll/᩸᩷ܿ;->ܿ:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget v4, p0, Ll/᩸᩷ܿ;->ᩳ:I

    invoke-static {v4}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x6

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    const/4 v0, 0x1

    aput-object v1, v5, v0

    const/4 v0, 0x2

    aput-object v2, v5, v0

    const/4 v0, 0x3

    aput-object v3, v5, v0

    const/4 v0, 0x4

    aput-object v4, v5, v0

    const/4 v0, 0x5

    iget-object v1, p0, Ll/᩸᩷ܿ;->֫:Ljava/lang/String;

    aput-object v1, v5, v0

    const-string v0, "StyleItem{dayColor=#%08X, dayBgColor=#%08X, nightColor=#%08X, nightBgColor=#%08X, flags=%s, colorParserMark=%s}"

    .line 198
    invoke-static {v0, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Ll/᩸᩷ܿ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(I)Ll/᩸᩷ܿ;
    .locals 7

    .line 55
    iget v0, p0, Ll/᩸᩷ܿ;->ᩳ:I

    if-ne p1, v0, :cond_0

    return-object p0

    .line 58
    :cond_0
    iget v5, p0, Ll/᩸᩷ܿ;->ܿ:I

    iget-object v1, p0, Ll/᩸᩷ܿ;->֫:Ljava/lang/String;

    iget v2, p0, Ll/᩸᩷ܿ;->ܽ:I

    iget v3, p0, Ll/᩸᩷ܿ;->ۧ:I

    iget v4, p0, Ll/᩸᩷ܿ;->ܳ:I

    move v6, p1

    invoke-static/range {v1 .. v6}, Ll/᩸᩷ܿ;->֫(Ljava/lang/String;IIIII)Ll/᩸᩷ܿ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)Ll/᩸᩷ܿ;
    .locals 7

    .line 62
    iget-object v0, p0, Ll/᩸᩷ܿ;->֫:Ljava/lang/String;

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 65
    :cond_0
    iget v5, p0, Ll/᩸᩷ܿ;->ܿ:I

    iget v6, p0, Ll/᩸᩷ܿ;->ᩳ:I

    iget v2, p0, Ll/᩸᩷ܿ;->ܽ:I

    iget v3, p0, Ll/᩸᩷ܿ;->ۧ:I

    iget v4, p0, Ll/᩸᩷ܿ;->ܳ:I

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Ll/᩸᩷ܿ;->֫(Ljava/lang/String;IIIII)Ll/᩸᩷ܿ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩸᩷ܿ;)Ll/᩸᩷ܿ;
    .locals 10

    if-eq p0, p1, :cond_9

    .line 76
    sget-object v0, Ll/᩸᩷ܿ;->ۜ:Ll/᩸᩷ܿ;

    if-ne v0, p1, :cond_0

    goto/16 :goto_6

    :cond_0
    if-eq p0, v0, :cond_8

    .line 79
    iget v0, p1, Ll/᩸᩷ܿ;->ᩳ:I

    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_1

    goto :goto_5

    .line 83
    :cond_1
    iget v1, p1, Ll/᩸᩷ܿ;->ܽ:I

    const v2, 0x161616

    const/4 v3, 0x1

    if-ne v1, v2, :cond_2

    .line 84
    iget v4, p0, Ll/᩸᩷ܿ;->ܽ:I

    if-eq v1, v4, :cond_2

    const/4 v1, 0x1

    move v5, v4

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    move v5, v1

    const/4 v1, 0x0

    .line 88
    :goto_0
    iget v4, p1, Ll/᩸᩷ܿ;->ۧ:I

    if-ne v4, v2, :cond_3

    .line 89
    iget v6, p0, Ll/᩸᩷ܿ;->ۧ:I

    if-eq v4, v6, :cond_3

    const/4 v1, 0x1

    goto :goto_1

    :cond_3
    move v6, v4

    .line 93
    :goto_1
    iget v4, p1, Ll/᩸᩷ܿ;->ܳ:I

    if-ne v4, v2, :cond_4

    .line 94
    iget v7, p0, Ll/᩸᩷ܿ;->ܳ:I

    if-eq v4, v7, :cond_4

    const/4 v1, 0x1

    goto :goto_2

    :cond_4
    move v7, v4

    .line 98
    :goto_2
    iget v4, p1, Ll/᩸᩷ܿ;->ܿ:I

    if-ne v4, v2, :cond_5

    .line 99
    iget v2, p0, Ll/᩸᩷ܿ;->ܿ:I

    if-eq v4, v2, :cond_5

    const/4 v1, 0x1

    move v8, v2

    goto :goto_3

    :cond_5
    move v8, v4

    .line 103
    :goto_3
    iget-object v2, p1, Ll/᩸᩷ܿ;->֫:Ljava/lang/String;

    if-nez v2, :cond_6

    .line 104
    iget-object v4, p0, Ll/᩸᩷ܿ;->֫:Ljava/lang/String;

    if-eqz v4, :cond_6

    goto :goto_4

    :cond_6
    move v3, v1

    move-object v4, v2

    .line 108
    :goto_4
    iget v1, p0, Ll/᩸᩷ܿ;->ᩳ:I

    or-int v9, v1, v0

    if-nez v3, :cond_7

    if-ne v9, v0, :cond_7

    return-object p1

    .line 112
    :cond_7
    invoke-static/range {v4 .. v9}, Ll/᩸᩷ܿ;->֫(Ljava/lang/String;IIIII)Ll/᩸᩷ܿ;

    move-result-object p1

    :cond_8
    :goto_5
    return-object p1

    :cond_9
    :goto_6
    return-object p0
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 6

    const/4 v0, 0x1

    .line 116
    iget v1, p0, Ll/᩸᩷ܿ;->ܿ:I

    iget v2, p0, Ll/᩸᩷ܿ;->ۧ:I

    if-nez v2, :cond_1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    .line 117
    :goto_1
    iget-object v4, p0, Ll/᩸᩷ܿ;->֫:Ljava/lang/String;

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_3

    const/16 v5, 0xf3

    .line 119
    invoke-virtual {p1, v5}, Ll/ۤۜܽ;->writeByte(I)V

    goto :goto_3

    :cond_3
    if-eqz v3, :cond_4

    const/16 v5, 0xf2

    .line 121
    invoke-virtual {p1, v5}, Ll/ۤۜܽ;->writeByte(I)V

    goto :goto_3

    :cond_4
    const/16 v5, 0xf1

    .line 123
    invoke-virtual {p1, v5}, Ll/ۤۜܽ;->writeByte(I)V

    .line 125
    :goto_3
    iget v5, p0, Ll/᩸᩷ܿ;->ܽ:I

    invoke-virtual {p1, v5}, Ll/ۤۜܽ;->writeInt(I)V

    .line 126
    iget v5, p0, Ll/᩸᩷ܿ;->ܳ:I

    invoke-virtual {p1, v5}, Ll/ۤۜܽ;->writeInt(I)V

    if-nez v3, :cond_5

    if-eqz v0, :cond_6

    .line 128
    :cond_5
    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 129
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    :cond_6
    if-eqz v0, :cond_7

    .line 132
    invoke-virtual {p1, v4}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 134
    :cond_7
    iget v0, p0, Ll/᩸᩷ܿ;->ᩳ:I

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeByte(I)V

    return-void
.end method

.method public final ۖ()I
    .locals 1

    .line 31
    invoke-static {}, Ll/᩹֡᩷;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Ll/᩸᩷ܿ;->ܳ:I

    return v0

    :cond_0
    iget v0, p0, Ll/᩸᩷ܿ;->ܽ:I

    return v0
.end method

.method public final ۘ()Z
    .locals 1

    .line 47
    iget v0, p0, Ll/᩸᩷ܿ;->ᩳ:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ()I
    .locals 1

    .line 35
    invoke-static {}, Ll/᩹֡᩷;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Ll/᩸᩷ܿ;->ܿ:I

    return v0

    :cond_0
    iget v0, p0, Ll/᩸᩷ܿ;->ۧ:I

    return v0
.end method

.method public final ܳ()Ll/᩸᩷ܿ;
    .locals 1

    .line 72
    iget v0, p0, Ll/᩸᩷ܿ;->ᩳ:I

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p0, v0}, Ll/᩸᩷ܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 20
    iget v0, p0, Ll/᩸᩷ܿ;->ۧ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 20
    iget v0, p0, Ll/᩸᩷ܿ;->ܽ:I

    return v0
.end method

.method public final ᩴ()I
    .locals 1

    .line 20
    iget v0, p0, Ll/᩸᩷ܿ;->ܿ:I

    return v0
.end method

.method public final ᩵()I
    .locals 1

    .line 20
    iget v0, p0, Ll/᩸᩷ܿ;->ܳ:I

    return v0
.end method

.method public final ᩻()I
    .locals 1

    .line 20
    iget v0, p0, Ll/᩸᩷ܿ;->ᩳ:I

    return v0
.end method
