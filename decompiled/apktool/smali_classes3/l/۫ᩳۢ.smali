.class public final Ll/۫ᩳۢ;
.super Ljava/lang/Object;
.source "F4KD"


# instance fields
.field public ֫:I

.field public final ۧ:I

.field public ܳ:Ljava/lang/String;

.field public ܽ:I

.field public ܿ:I

.field public final ᩳ:[C


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    iput-object v0, p0, Ll/۫ᩳۢ;->ᩳ:[C

    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iput p1, p0, Ll/۫ᩳۢ;->ۧ:I

    const/4 p1, 0x0

    .line 14
    iput p1, p0, Ll/۫ᩳۢ;->ܽ:I

    return-void
.end method

.method private ۧ()Z
    .locals 7

    .line 18
    :cond_0
    iget v0, p0, Ll/۫ᩳۢ;->ܽ:I

    iget v1, p0, Ll/۫ᩳۢ;->ۧ:I

    if-ge v0, v1, :cond_4

    add-int/lit8 v2, v0, 0x1

    .line 19
    iput v2, p0, Ll/۫ᩳۢ;->ܽ:I

    iget-object v3, p0, Ll/۫ᩳۢ;->ᩳ:[C

    aget-char v4, v3, v0

    const/16 v5, 0xd

    const/16 v6, 0xa

    if-eq v4, v6, :cond_1

    if-ne v4, v5, :cond_0

    :cond_1
    if-ge v2, v1, :cond_3

    .line 22
    aget-char v1, v3, v2

    if-eq v1, v6, :cond_2

    if-ne v1, v5, :cond_3

    :cond_2
    add-int/lit8 v0, v0, 0x2

    .line 24
    iput v0, p0, Ll/۫ᩳۢ;->ܽ:I

    :cond_3
    const/4 v0, 0x1

    return v0

    :cond_4
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final ֫()Z
    .locals 13

    .line 33
    :cond_0
    :goto_0
    iget v0, p0, Ll/۫ᩳۢ;->ܽ:I

    const/4 v1, 0x0

    iget v2, p0, Ll/۫ᩳۢ;->ۧ:I

    if-ge v0, v2, :cond_14

    add-int/lit8 v3, v0, 0x1

    .line 34
    iput v3, p0, Ll/۫ᩳۢ;->ܽ:I

    iget-object v4, p0, Ll/۫ᩳۢ;->ᩳ:[C

    aget-char v5, v4, v0

    const/16 v6, 0x55

    const/16 v7, 0x75

    const/16 v8, 0x5c

    const/16 v9, 0x22

    const/16 v10, 0x27

    if-eq v5, v9, :cond_7

    const/16 v9, 0x23

    if-eq v5, v9, :cond_6

    if-eq v5, v10, :cond_1

    goto :goto_0

    :cond_1
    if-ge v3, v2, :cond_0

    add-int/lit8 v1, v0, 0x2

    .line 57
    iput v1, p0, Ll/۫ᩳۢ;->ܽ:I

    aget-char v3, v4, v3

    if-ne v3, v8, :cond_4

    if-ne v1, v2, :cond_2

    goto :goto_0

    :cond_2
    add-int/lit8 v3, v0, 0x3

    .line 61
    iput v3, p0, Ll/۫ᩳۢ;->ܽ:I

    aget-char v1, v4, v1

    if-eq v1, v7, :cond_3

    if-ne v1, v6, :cond_4

    :cond_3
    add-int/lit8 v0, v0, 0x7

    .line 63
    iput v0, p0, Ll/۫ᩳۢ;->ܽ:I

    if-le v0, v2, :cond_4

    .line 65
    iput v2, p0, Ll/۫ᩳۢ;->ܽ:I

    .line 68
    :cond_4
    iget v0, p0, Ll/۫ᩳۢ;->ܽ:I

    if-ne v0, v2, :cond_5

    goto :goto_0

    :cond_5
    add-int/lit8 v1, v0, 0x1

    .line 70
    iput v1, p0, Ll/۫ᩳۢ;->ܽ:I

    aget-char v0, v4, v0

    if-eq v0, v10, :cond_0

    .line 72
    invoke-virtual {p0}, Ll/۫ᩳۢ;->֫()Z

    goto :goto_0

    .line 37
    :cond_6
    invoke-direct {p0}, Ll/۫ᩳۢ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    .line 45
    :cond_7
    iput v3, p0, Ll/۫ᩳۢ;->ܿ:I

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    :goto_1
    iget v1, p0, Ll/۫ᩳۢ;->ܽ:I

    const/4 v3, 0x0

    if-ge v1, v2, :cond_13

    add-int/lit8 v5, v1, 0x1

    .line 79
    iput v5, p0, Ll/۫ᩳۢ;->ܽ:I

    aget-char v11, v4, v1

    const/16 v12, 0xa

    if-eq v11, v12, :cond_13

    if-eq v11, v9, :cond_12

    if-eq v11, v8, :cond_8

    .line 139
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_8
    if-ne v5, v2, :cond_9

    goto/16 :goto_2

    :cond_9
    add-int/lit8 v1, v1, 0x2

    .line 92
    iput v1, p0, Ll/۫ᩳۢ;->ܽ:I

    aget-char v5, v4, v5

    if-eq v5, v9, :cond_11

    if-eq v5, v10, :cond_11

    if-eq v5, v6, :cond_f

    if-eq v5, v8, :cond_11

    const/16 v11, 0x62

    if-eq v5, v11, :cond_e

    const/16 v11, 0x66

    if-eq v5, v11, :cond_d

    const/16 v11, 0x6e

    if-eq v5, v11, :cond_c

    const/16 v11, 0x72

    if-eq v5, v11, :cond_b

    const/16 v11, 0x74

    if-eq v5, v11, :cond_a

    if-eq v5, v7, :cond_f

    .line 133
    invoke-direct {p0}, Ll/۫ᩳۢ;->ۧ()Z

    goto :goto_2

    :cond_a
    const/16 v1, 0x9

    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_b
    const/16 v1, 0xd

    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 98
    :cond_c
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_d
    const/16 v1, 0xc

    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_e
    const/16 v1, 0x8

    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_f
    sub-int v5, v2, v1

    const/4 v11, 0x4

    if-ge v5, v11, :cond_10

    .line 117
    iput v2, p0, Ll/۫ᩳۢ;->ܽ:I

    goto :goto_2

    .line 121
    :cond_10
    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, v4, v1, v11}, Ljava/lang/String;-><init>([CII)V

    .line 122
    iget v1, p0, Ll/۫ᩳۢ;->ܽ:I

    add-int/2addr v1, v11

    iput v1, p0, Ll/۫ᩳۢ;->ܽ:I

    const/16 v1, 0x10

    .line 124
    :try_start_0
    invoke-static {v5, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    int-to-char v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 127
    :catch_0
    invoke-direct {p0}, Ll/۫ᩳۢ;->ۧ()Z

    goto :goto_2

    .line 112
    :cond_11
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_1

    .line 85
    :cond_12
    iput v1, p0, Ll/۫ᩳۢ;->֫:I

    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 46
    :cond_13
    :goto_2
    iput-object v3, p0, Ll/۫ᩳۢ;->ܳ:Ljava/lang/String;

    if-eqz v3, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_14
    return v1
.end method
