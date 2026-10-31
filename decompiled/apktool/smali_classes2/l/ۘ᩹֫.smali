.class public final Ll/ۘ᩹֫;
.super Ljava/lang/Object;
.source "U8DO"


# static fields
.field public static final ۡ:[I

.field public static final ۢ:[I


# instance fields
.field public ֫:I

.field public ۜ:I

.field public ۧ:I

.field public ܳ:Z

.field public ܽ:J

.field public ܿ:I

.field public ᩳ:I

.field public ᩷:J

.field public ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [I

    .line 43
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۘ᩹֫;->ۢ:[I

    const/16 v0, 0x10

    new-array v0, v0, [I

    .line 44
    fill-array-data v0, :array_1

    sput-object v0, Ll/ۘ᩹֫;->ۡ:[I

    return-void

    :array_0
    .array-data 4
        0x3
        0x3
        0x3
        0x3
        0x2
        0x2
        0x3
    .end array-data

    :array_1
    .array-data 4
        0x1
        0x2
        0x3
        0x2
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
    .end array-data
.end method

.method public static ֫(Ll/ᩳ֨֫;)I
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 191
    :cond_0
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    shl-int/lit8 v0, v0, 0x7

    and-int/lit8 v3, v2, 0x7f

    or-int/2addr v0, v3

    add-int/lit8 v1, v1, 0x1

    and-int/lit16 v2, v2, 0x80

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    if-le v1, v2, :cond_0

    :cond_1
    return v0
.end method


# virtual methods
.method public final ֫([B)V
    .locals 2

    .line 62
    iget v0, p0, Ll/ۘ᩹֫;->᩻:I

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, p1, v1

    .line 63
    iget v0, p0, Ll/ۘ᩹֫;->֫:I

    int-to-byte v0, v0

    const/4 v1, 0x1

    aput-byte v0, p1, v1

    .line 64
    iget v0, p0, Ll/ۘ᩹֫;->ۧ:I

    int-to-byte v0, v0

    const/4 v1, 0x2

    aput-byte v0, p1, v1

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 170
    iget-boolean v0, p0, Ll/ۘ᩹֫;->ܳ:Z

    return v0
.end method

.method public final ֫(ILl/ᩳ֨֫;)Z
    .locals 10

    .line 70
    invoke-virtual {p0}, Ll/ۘ᩹֫;->ۧ()V

    .line 72
    invoke-virtual {p2}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v0

    .line 75
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֫()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-ge v1, v3, :cond_0

    return v2

    .line 79
    :cond_0
    invoke-static {p2}, Ll/ۘ᩹֫;->֫(Ll/ᩳ֨֫;)I

    move-result v1

    int-to-long v4, v1

    iput-wide v4, p0, Ll/ۘ᩹֫;->ܽ:J

    .line 80
    invoke-virtual {p2}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    sub-int/2addr v1, v0

    iput v1, p0, Ll/ۘ᩹֫;->ۜ:I

    .line 82
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֨()I

    move-result v1

    const/4 v4, 0x1

    .line 83
    iput v4, p0, Ll/ۘ᩹֫;->ᩳ:I

    const/16 v5, 0xf0

    if-ne v1, v5, :cond_2

    .line 87
    iput v1, p0, Ll/ۘ᩹֫;->᩻:I

    .line 91
    :cond_1
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֨()I

    move-result p1

    const/16 v1, 0xf7

    if-ne p1, v1, :cond_1

    goto/16 :goto_3

    :cond_2
    const/16 v6, 0xff

    if-ne v1, v6, :cond_6

    .line 94
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֨()I

    move-result p1

    .line 95
    invoke-static {p2}, Ll/ۘ᩹֫;->֫(Ll/ᩳ֨֫;)I

    move-result v3

    .line 97
    iput v1, p0, Ll/ۘ᩹֫;->᩻:I

    const/16 v1, 0x2f

    if-eq p1, v1, :cond_5

    const/16 v1, 0x51

    if-eq p1, v1, :cond_3

    .line 116
    invoke-virtual {p2, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    goto/16 :goto_3

    .line 101
    :cond_3
    invoke-virtual {p2}, Ll/ᩳ֨֫;->᩸()I

    move-result p1

    int-to-long v1, p1

    iput-wide v1, p0, Ll/ۘ᩹֫;->᩷:J

    const-wide/16 v5, 0x0

    cmp-long p1, v1, v5

    if-lez p1, :cond_4

    add-int/lit8 v3, v3, -0x3

    .line 109
    invoke-virtual {p2, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    goto/16 :goto_3

    .line 104
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Tempo event data value must be a non-zero positive value. Parsed value: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v0, p0, Ll/ۘ᩹֫;->᩷:J

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۡ᩵֫;->ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    .line 112
    :cond_5
    invoke-virtual {p2, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 113
    invoke-virtual {p0}, Ll/ۘ᩹֫;->ۧ()V

    return v2

    :cond_6
    const/16 v7, 0x80

    if-ge v1, v7, :cond_7

    const/4 v8, 0x1

    goto :goto_0

    :cond_7
    const/4 v8, 0x0

    :goto_0
    if-eqz v8, :cond_9

    const/high16 v9, -0x80000000

    if-eq p1, v9, :cond_8

    .line 128
    iput v1, p0, Ll/ۘ᩹֫;->֫:I

    .line 130
    iput v3, p0, Ll/ۘ᩹֫;->ᩳ:I

    goto :goto_1

    :cond_8
    const-string p1, "Running status in the first event."

    const/4 p2, 0x0

    .line 125
    invoke-static {p1, p2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    :cond_9
    move p1, v1

    :goto_1
    if-lt p1, v7, :cond_c

    if-le p1, v6, :cond_a

    goto :goto_2

    :cond_a
    if-lt p1, v5, :cond_b

    and-int/lit8 v1, p1, 0xf

    .line 203
    sget-object v2, Ll/ۘ᩹֫;->ۡ:[I

    aget v2, v2, v1

    goto :goto_2

    :cond_b
    shr-int/lit8 v1, p1, 0x4

    and-int/lit8 v1, v1, 0x7

    .line 205
    sget-object v2, Ll/ۘ᩹֫;->ۢ:[I

    aget v2, v2, v1

    :cond_c
    :goto_2
    if-nez v8, :cond_d

    .line 135
    iget v1, p0, Ll/ۘ᩹֫;->ᩳ:I

    if-le v2, v1, :cond_d

    .line 136
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֨()I

    move-result v1

    iput v1, p0, Ll/ۘ᩹֫;->֫:I

    .line 137
    iget v1, p0, Ll/ۘ᩹֫;->ᩳ:I

    add-int/2addr v1, v4

    iput v1, p0, Ll/ۘ᩹֫;->ᩳ:I

    .line 141
    :cond_d
    iget v1, p0, Ll/ۘ᩹֫;->ᩳ:I

    if-le v2, v1, :cond_e

    .line 142
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֨()I

    move-result v1

    iput v1, p0, Ll/ۘ᩹֫;->ۧ:I

    .line 143
    iget v1, p0, Ll/ۘ᩹֫;->ᩳ:I

    add-int/2addr v1, v4

    iput v1, p0, Ll/ۘ᩹֫;->ᩳ:I

    .line 146
    :cond_e
    iput p1, p0, Ll/ۘ᩹֫;->᩻:I

    .line 149
    :goto_3
    invoke-virtual {p2}, Ll/ᩳ֨֫;->ᩳ()I

    move-result p1

    sub-int/2addr p1, v0

    iput p1, p0, Ll/ۘ᩹֫;->ܿ:I

    .line 150
    invoke-virtual {p2, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 151
    iput-boolean v4, p0, Ll/ۘ᩹֫;->ܳ:Z

    return v4
.end method

.method public final ۧ()V
    .locals 3

    const/4 v0, 0x0

    .line 174
    iput-boolean v0, p0, Ll/ۘ᩹֫;->ܳ:Z

    const/4 v0, -0x1

    .line 175
    iput v0, p0, Ll/ۘ᩹֫;->ۜ:I

    const/high16 v1, -0x80000000

    .line 176
    iput v1, p0, Ll/ۘ᩹֫;->᩻:I

    .line 177
    iput v1, p0, Ll/ۘ᩹֫;->֫:I

    .line 178
    iput v1, p0, Ll/ۘ᩹֫;->ۧ:I

    const-wide/16 v1, -0x1

    .line 179
    iput-wide v1, p0, Ll/ۘ᩹֫;->ܽ:J

    .line 180
    iput v0, p0, Ll/ۘ᩹֫;->ܿ:I

    .line 181
    iput v0, p0, Ll/ۘ᩹֫;->ᩳ:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 182
    iput-wide v0, p0, Ll/ۘ᩹֫;->᩷:J

    return-void
.end method
