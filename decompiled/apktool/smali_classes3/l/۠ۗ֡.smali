.class public final Ll/۠ۗ֡;
.super Ljava/lang/Object;
.source "F5Y4"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:Ljava/util/EnumMap;

.field public final ܿ:[Ll/֨ۗ֡;

.field public final ᩳ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(II)V
    .locals 13

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    new-array v0, v0, [Ll/֨ۗ֡;

    .line 55
    iput-object v0, p0, Ll/۠ۗ֡;->ܿ:[Ll/֨ۗ֡;

    const/16 v0, 0x4f

    const/16 v1, 0x7c

    const/16 v2, 0x83

    const/16 v3, 0x8a

    const/16 v4, 0xaa

    const/16 v5, 0xb7

    const/16 v6, 0xc7

    const/16 v7, 0xe1

    const/16 v8, 0xe6

    const/16 v9, 0xf4

    const/16 v10, 0x13

    const/16 v11, 0x27

    const/16 v12, 0x15

    if-lt p1, v12, :cond_1

    .line 64
    iput p1, p0, Ll/۠ۗ֡;->֫:I

    if-ge p1, v10, :cond_0

    const/4 v11, -0x1

    goto :goto_0

    :cond_0
    packed-switch p1, :pswitch_data_0

    const/16 v11, 0xfe

    goto :goto_0

    :pswitch_0
    const/16 v11, 0xf4

    goto :goto_0

    :pswitch_1
    const/16 v11, 0xe6

    goto :goto_0

    :pswitch_2
    const/16 v11, 0xe1

    goto :goto_0

    :pswitch_3
    const/16 v11, 0xc7

    goto :goto_0

    :pswitch_4
    const/16 v11, 0xb7

    goto :goto_0

    :pswitch_5
    const/16 v11, 0xaa

    goto :goto_0

    :pswitch_6
    const/16 v11, 0x8a

    goto :goto_0

    :pswitch_7
    const/16 v11, 0x83

    goto :goto_0

    :pswitch_8
    const/16 v11, 0x7c

    goto :goto_0

    :pswitch_9
    const/16 v11, 0x4f

    goto :goto_0

    :pswitch_a
    const/16 v11, 0x40

    goto :goto_0

    :pswitch_b
    const/16 v11, 0x2d

    goto :goto_0

    :pswitch_c
    const/4 v11, 0x7

    .line 65
    :goto_0
    :pswitch_d
    iput v11, p0, Ll/۠ۗ֡;->ۧ:I

    goto :goto_2

    :cond_1
    if-ltz p2, :cond_f

    if-ge p2, v11, :cond_f

    if-lt p2, v9, :cond_2

    const/16 v10, 0x23

    goto :goto_1

    :cond_2
    if-lt p2, v8, :cond_3

    const/16 v10, 0x22

    goto :goto_1

    :cond_3
    if-lt p2, v7, :cond_4

    const/16 v10, 0x21

    goto :goto_1

    :cond_4
    if-lt p2, v6, :cond_5

    const/16 v10, 0x20

    goto :goto_1

    :cond_5
    if-lt p2, v5, :cond_6

    const/16 v10, 0x1e

    goto :goto_1

    :cond_6
    if-lt p2, v4, :cond_7

    const/16 v10, 0x1d

    goto :goto_1

    :cond_7
    if-lt p2, v3, :cond_8

    const/16 v10, 0x1c

    goto :goto_1

    :cond_8
    if-lt p2, v2, :cond_9

    const/16 v10, 0x1b

    goto :goto_1

    :cond_9
    if-lt p2, v1, :cond_a

    const/16 v10, 0x1a

    goto :goto_1

    :cond_a
    if-lt p2, v0, :cond_b

    const/16 v10, 0x18

    goto :goto_1

    :cond_b
    const/16 p1, 0x40

    if-lt p2, p1, :cond_c

    const/16 v10, 0x17

    goto :goto_1

    :cond_c
    const/16 p1, 0x2d

    if-lt p2, p1, :cond_d

    const/16 v10, 0x16

    goto :goto_1

    :cond_d
    if-lt p2, v11, :cond_e

    const/16 v10, 0x15

    .line 67
    :cond_e
    :goto_1
    iput v10, p0, Ll/۠ۗ֡;->֫:I

    .line 68
    iput p2, p0, Ll/۠ۗ֡;->ۧ:I

    goto :goto_2

    .line 70
    :cond_f
    iput p1, p0, Ll/۠ۗ֡;->֫:I

    .line 71
    iput p2, p0, Ll/۠ۗ֡;->ۧ:I

    .line 74
    :goto_2
    new-instance p1, Ljava/util/EnumMap;

    const-class p2, Ll/֨ۗ֡;

    invoke-direct {p1, p2}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object p1, p0, Ll/۠ۗ֡;->ܽ:Ljava/util/EnumMap;

    .line 238
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 75
    iput-object p1, p0, Ll/۠ۗ֡;->ᩳ:Ljava/util/HashMap;

    .line 164
    iget p1, p0, Ll/۠ۗ֡;->ۧ:I

    const/4 p2, -0x1

    if-eq p1, p2, :cond_10

    goto :goto_3

    .line 81
    :cond_10
    iget p1, p0, Ll/۠ۗ֡;->֫:I

    .line 84
    :goto_3
    invoke-static {}, Ll/֨ۗ֡;->values()[Ll/֨ۗ֡;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_4
    if-ge v2, v1, :cond_14

    aget-object v3, v0, v2

    .line 164
    iget v4, p0, Ll/۠ۗ֡;->ۧ:I

    if-eq v4, p2, :cond_11

    .line 88
    iget-object v4, v3, Ll/֨ۗ֡;->᩹:Ll/۟ۤܺ;

    goto :goto_5

    .line 90
    :cond_11
    iget-object v4, v3, Ll/֨ۗ֡;->᩸:Ll/۟ۤܺ;

    .line 93
    :goto_5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ll/۟ۤܺ;->֫(Ljava/lang/Integer;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Short;

    if-eqz v4, :cond_13

    .line 95
    iget-object v5, v3, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    iget-boolean v5, v5, Ll/ۘۗ֡;->᩸:Z

    if-nez v5, :cond_12

    .line 96
    iget-object v5, p0, Ll/۠ۗ֡;->ܿ:[Ll/֨ۗ֡;

    invoke-virtual {v4}, Ljava/lang/Short;->shortValue()S

    move-result v6

    aput-object v3, v5, v6

    .line 98
    :cond_12
    iget-object v5, p0, Ll/۠ۗ֡;->ܽ:Ljava/util/EnumMap;

    invoke-virtual {v5, v3, v4}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    iget-object v4, p0, Ll/۠ۗ֡;->ᩳ:Ljava/util/HashMap;

    iget-object v5, v3, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_13
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_14
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_c
        :pswitch_c
        :pswitch_d
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ۧ(I)Ll/۠ۗ֡;
    .locals 2

    .line 106
    new-instance v0, Ll/۠ۗ֡;

    const/4 v1, -0x1

    invoke-direct {v0, p0, v1}, Ll/۠ۗ֡;-><init>(II)V

    return-object v0
.end method

.method public static ܽ(I)V
    .locals 2

    .line 111
    new-instance v0, Ll/۠ۗ֡;

    const/4 v1, -0x1

    invoke-direct {v0, v1, p0}, Ll/۠ۗ֡;-><init>(II)V

    return-void
.end method

.method public static ᩳ(I)Ll/۠ۗ֡;
    .locals 2

    .line 116
    invoke-static {p0}, Ll/᩶ۗ֡;->֫(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 120
    new-instance p0, Ll/۠ۗ֡;

    invoke-direct {p0, v0, v1}, Ll/۠ۗ֡;-><init>(II)V

    return-object p0

    .line 118
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unsupported dex version "

    .line 0
    invoke-static {p0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 118
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ֫(Ll/֨ۗ֡;)Ljava/lang/Short;
    .locals 1

    .line 160
    iget-object v0, p0, Ll/۠ۗ֡;->ܽ:Ljava/util/EnumMap;

    invoke-virtual {v0, p1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Short;

    return-object p1
.end method

.method public final ֫()Ljava/util/Set;
    .locals 1

    .line 155
    iget-object v0, p0, Ll/۠ۗ֡;->ܽ:Ljava/util/EnumMap;

    invoke-virtual {v0}, Ljava/util/EnumMap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)Ll/֨ۗ֡;
    .locals 2

    const/16 v0, 0x100

    if-eq p1, v0, :cond_3

    const/16 v0, 0x200

    if-eq p1, v0, :cond_2

    const/16 v0, 0x300

    if-eq p1, v0, :cond_1

    if-ltz p1, :cond_0

    .line 147
    iget-object v0, p0, Ll/۠ۗ֡;->ܿ:[Ll/֨ۗ֡;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    .line 148
    aget-object p1, v0, p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    .line 145
    :cond_1
    sget-object p1, Ll/֨ۗ֡;->۫֫:Ll/֨ۗ֡;

    return-object p1

    .line 143
    :cond_2
    sget-object p1, Ll/֨ۗ֡;->۟᩻:Ll/֨ۗ֡;

    return-object p1

    .line 141
    :cond_3
    sget-object p1, Ll/֨ۗ֡;->᩶ܳ:Ll/֨ۗ֡;

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)Ll/֨ۗ֡;
    .locals 1

    .line 134
    iget-object v0, p0, Ll/۠ۗ֡;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨ۗ֡;

    return-object p1
.end method
