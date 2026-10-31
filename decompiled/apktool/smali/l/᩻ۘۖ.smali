.class public final Ll/᩻ۘۖ;
.super Ll/ܿۘۖ;
.source "29P0"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 26
    :try_start_0
    const-class v0, Ll/۫ۘۖ;

    const-string v1, "\u1a78"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 27
    invoke-static {v0}, Ll/᩸֨ۖ;->ۧ(Ljava/lang/reflect/Field;)J

    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    sput-wide v0, Ll/᩻ۘۖ;->ۧ:J

    return-void

    .line 29
    :catchall_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unable to lookup extension field offset"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ll/ܿۘۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/util/Map$Entry;)I
    .locals 0

    .line 287
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ۖۖ;

    .line 288
    invoke-virtual {p1}, Ll/֡ۖۖ;->getNumber()I

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/Object;Ll/ۧۚۖ;Ljava/lang/Object;Ll/ᩳۘۖ;Ll/᩵ۘۖ;Ljava/lang/Object;Ll/ܿ֨ۖ;)Ljava/lang/Object;
    .locals 4

    .line 73
    check-cast p3, Ll/۟ۖۖ;

    .line 74
    iget-object v0, p3, Ll/۟ۖۖ;->ۧ:Ll/֡ۖۖ;

    iget-object p3, p3, Ll/۟ۖۖ;->֫:Ll/᩻֡ۖ;

    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v1

    .line 76
    invoke-virtual {v0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 78
    sget-object p3, Ll/ܳۘۖ;->֫:[I

    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳۧ()Ll/۟֨ۖ;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p4

    aget p3, p3, p4

    packed-switch p3, :pswitch_data_0

    .line 190
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Type cannot be packed: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 191
    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳۧ()Ll/۟֨ۖ;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 172
    :pswitch_0
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 173
    invoke-interface {p2, p3}, Ll/ۧۚۖ;->ܿ(Ljava/util/List;)V

    .line 174
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 175
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    .line 177
    invoke-virtual {v0}, Ll/֡ۖۖ;->ۚ()Ll/ۢۖۖ;

    move-result-object v2

    invoke-virtual {v2, p4}, Ll/ۢۖۖ;->֫(I)Ll/ۖۖۖ;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 179
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 182
    :cond_0
    invoke-static {p1, v1, p4, p6, p7}, Ll/ۡۚۖ;->֫(Ljava/lang/Object;IILjava/lang/Object;Ll/ܿ֨ۖ;)Ljava/lang/Object;

    move-result-object p6

    goto :goto_0

    .line 165
    :pswitch_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 166
    invoke-interface {p2, p1}, Ll/ۧۚۖ;->ۧ(Ljava/util/List;)V

    goto/16 :goto_1

    .line 158
    :pswitch_2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 159
    invoke-interface {p2, p1}, Ll/ۧۚۖ;->᩷(Ljava/util/List;)V

    goto :goto_1

    .line 151
    :pswitch_3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 152
    invoke-interface {p2, p1}, Ll/ۧۚۖ;->ۡ(Ljava/util/List;)V

    goto :goto_1

    .line 144
    :pswitch_4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 145
    invoke-interface {p2, p1}, Ll/ۧۚۖ;->֫(Ljava/util/List;)V

    goto :goto_1

    .line 137
    :pswitch_5
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 138
    invoke-interface {p2, p1}, Ll/ۧۚۖ;->ۢ(Ljava/util/List;)V

    goto :goto_1

    .line 130
    :pswitch_6
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 131
    invoke-interface {p2, p1}, Ll/ۧۚۖ;->ܳ(Ljava/util/List;)V

    goto :goto_1

    .line 123
    :pswitch_7
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 124
    invoke-interface {p2, p1}, Ll/ۧۚۖ;->ۖ(Ljava/util/List;)V

    goto :goto_1

    .line 116
    :pswitch_8
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 117
    invoke-interface {p2, p1}, Ll/ۧۚۖ;->ۜ(Ljava/util/List;)V

    goto :goto_1

    .line 109
    :pswitch_9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 110
    invoke-interface {p2, p1}, Ll/ۧۚۖ;->ܺ(Ljava/util/List;)V

    goto :goto_1

    .line 102
    :pswitch_a
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 103
    invoke-interface {p2, p1}, Ll/ۧۚۖ;->ܽ(Ljava/util/List;)V

    goto :goto_1

    .line 95
    :pswitch_b
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 96
    invoke-interface {p2, p1}, Ll/ۧۚۖ;->ᩳ(Ljava/util/List;)V

    goto :goto_1

    .line 88
    :pswitch_c
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 89
    invoke-interface {p2, p1}, Ll/ۧۚۖ;->ᩴ(Ljava/util/List;)V

    goto :goto_1

    .line 81
    :pswitch_d
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 82
    invoke-interface {p2, p1}, Ll/ۧۚۖ;->֡(Ljava/util/List;)V

    :goto_1
    move-object p2, p1

    .line 193
    :cond_1
    invoke-virtual {p5, v0, p2}, Ll/᩵ۘۖ;->֫(Ll/ᩴۘۖ;Ljava/lang/Object;)V

    return-object p6

    .line 197
    :cond_2
    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳۧ()Ll/۟֨ۖ;

    move-result-object v2

    sget-object v3, Ll/۟֨ۖ;->۫:Ll/۟֨ۖ;

    if-ne v2, v3, :cond_3

    .line 198
    invoke-interface {p2}, Ll/ۧۚۖ;->᩷()I

    move-result p2

    .line 199
    invoke-virtual {v0}, Ll/֡ۖۖ;->ۚ()Ll/ۢۖۖ;

    move-result-object p3

    invoke-virtual {p3, p2}, Ll/ۢۖۖ;->֫(I)Ll/ۖۖۖ;

    move-result-object p3

    if-nez p3, :cond_4

    .line 201
    invoke-static {p1, v1, p2, p6, p7}, Ll/ۡۚۖ;->֫(Ljava/lang/Object;IILjava/lang/Object;Ll/ܿ֨ۖ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 206
    :cond_3
    sget-object p1, Ll/ܳۘۖ;->֫:[I

    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳۧ()Ll/۟֨ۖ;

    move-result-object p7

    invoke-virtual {p7}, Ljava/lang/Enum;->ordinal()I

    move-result p7

    aget p1, p1, p7

    packed-switch p1, :pswitch_data_1

    const/4 p3, 0x0

    goto/16 :goto_2

    .line 258
    :pswitch_e
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-interface {p2, p1, p4}, Ll/ۧۚۖ;->ۧ(Ljava/lang/Class;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p3

    goto/16 :goto_2

    .line 254
    :pswitch_f
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-interface {p2, p1, p4}, Ll/ۧۚۖ;->֫(Ljava/lang/Class;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p3

    goto/16 :goto_2

    .line 251
    :pswitch_10
    invoke-interface {p2}, Ll/ۧۚۖ;->ۖ()Ljava/lang/String;

    move-result-object p3

    goto/16 :goto_2

    .line 232
    :pswitch_11
    invoke-interface {p2}, Ll/ۧۚۖ;->ۜ()Ll/ۛۜۖ;

    move-result-object p3

    goto/16 :goto_2

    .line 262
    :pswitch_12
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Shouldn\'t reach here."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 247
    :pswitch_13
    invoke-interface {p2}, Ll/ۧۚۖ;->ܺ()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    goto/16 :goto_2

    .line 244
    :pswitch_14
    invoke-interface {p2}, Ll/ۧۚۖ;->᩻()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    goto :goto_2

    .line 241
    :pswitch_15
    invoke-interface {p2}, Ll/ۧۚۖ;->ܽ()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    goto :goto_2

    .line 238
    :pswitch_16
    invoke-interface {p2}, Ll/ۧۚۖ;->֡()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    goto :goto_2

    .line 235
    :pswitch_17
    invoke-interface {p2}, Ll/ۧۚۖ;->ᩳ()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    goto :goto_2

    .line 229
    :pswitch_18
    invoke-interface {p2}, Ll/ۧۚۖ;->ۧ()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    goto :goto_2

    .line 226
    :pswitch_19
    invoke-interface {p2}, Ll/ۧۚۖ;->ۡ()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    goto :goto_2

    .line 223
    :pswitch_1a
    invoke-interface {p2}, Ll/ۧۚۖ;->֫()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    goto :goto_2

    .line 220
    :pswitch_1b
    invoke-interface {p2}, Ll/ۧۚۖ;->᩷()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    goto :goto_2

    .line 217
    :pswitch_1c
    invoke-interface {p2}, Ll/ۧۚۖ;->ۢ()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    goto :goto_2

    .line 214
    :pswitch_1d
    invoke-interface {p2}, Ll/ۧۚۖ;->ۚ()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    goto :goto_2

    .line 211
    :pswitch_1e
    invoke-interface {p2}, Ll/ۧۚۖ;->readFloat()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    goto :goto_2

    .line 208
    :pswitch_1f
    invoke-interface {p2}, Ll/ۧۚۖ;->readDouble()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p3

    .line 265
    :cond_4
    :goto_2
    invoke-virtual {v0}, Ll/֡ۖۖ;->۟֫()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 266
    invoke-virtual {p5, v0, p3}, Ll/᩵ۘۖ;->֫(Ll/֡ۖۖ;Ljava/lang/Object;)V

    return-object p6

    .line 268
    :cond_5
    sget-object p1, Ll/ܳۘۖ;->֫:[I

    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳۧ()Ll/۟֨ۖ;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    const/16 p2, 0x11

    if-eq p1, p2, :cond_6

    const/16 p2, 0x12

    if-eq p1, p2, :cond_6

    goto :goto_3

    .line 271
    :cond_6
    invoke-virtual {p5, v0}, Ll/᩵ۘۖ;->֫(Ll/ᩴۘۖ;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 371
    check-cast p1, Ll/ۡ֡ۖ;

    invoke-interface {p1}, Ll/ۡ֡ۖ;->toBuilder()Ll/ۢ֡ۖ;

    move-result-object p1

    check-cast p3, Ll/ۡ֡ۖ;

    invoke-interface {p1, p3}, Ll/ۢ֡ۖ;->mergeFrom(Ll/ۡ֡ۖ;)Ll/ۢ֡ۖ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۢ֡ۖ;->buildPartial()Ll/ۡ֡ۖ;

    move-result-object p3

    .line 279
    :cond_7
    :goto_3
    invoke-virtual {p5, v0, p3}, Ll/᩵ۘۖ;->֫(Ll/ᩴۘۖ;Ljava/lang/Object;)V

    return-object p6

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch
.end method

.method public final ֫(Ll/ᩳۘۖ;Ll/ۡ֡ۖ;I)Ljava/lang/Object;
    .locals 0

    .line 477
    check-cast p1, Ll/֫ۘۖ;

    check-cast p2, Ll/᩻֡ۖ;

    .line 478
    invoke-interface {p2}, Ll/ۘ֡ۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object p2

    invoke-virtual {p1, p2, p3}, Ll/֫ۘۖ;->֫(Ll/ᩳۖۖ;I)Ll/۟ۖۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/Object;)Ll/᩵ۘۖ;
    .locals 2

    .line 40
    sget-wide v0, Ll/᩻ۘۖ;->ۧ:J

    invoke-static {v0, v1, p1}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ۘۖ;

    return-object p1
.end method

.method public final ֫(Ll/ۛۜۖ;Ljava/lang/Object;Ll/ᩳۘۖ;Ll/᩵ۘۖ;)V
    .locals 2

    .line 508
    check-cast p2, Ll/۟ۖۖ;

    .line 509
    iget-object v0, p2, Ll/۟ۖۖ;->֫:Ll/᩻֡ۖ;

    invoke-interface {v0}, Ll/᩻֡ۖ;->newBuilderForType()Ll/ܳ֡ۖ;

    move-result-object v1

    invoke-interface {v1}, Ll/ܳ֡ۖ;->buildPartial()Ll/᩻֡ۖ;

    .line 511
    sget-object v1, Ll/ᩳۘۖ;->ۧ:Ll/ᩳۘۖ;

    .line 520
    iget-object p2, p2, Ll/۟ۖۖ;->ۧ:Ll/֡ۖۖ;

    new-instance v1, Ll/ۡ᩵ۖ;

    invoke-direct {v1, v0, p3, p1}, Ll/ۡ᩵ۖ;-><init>(Ll/᩻֡ۖ;Ll/ᩳۘۖ;Ll/ۛۜۖ;)V

    invoke-virtual {p4, p2, v1}, Ll/᩵ۘۖ;->֫(Ll/ᩴۘۖ;Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/ۜ۠ۖ;Ljava/util/Map$Entry;)V
    .locals 3

    .line 293
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ۖۖ;

    .line 294
    invoke-virtual {v0}, Ll/֡ۖۖ;->۟֫()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 295
    sget-object v1, Ll/ܳۘۖ;->֫:[I

    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳۧ()Ll/۟֨ۖ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_3

    .line 410
    :pswitch_0
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 409
    sget v1, Ll/ۡۚۖ;->֫:I

    if-eqz p2, :cond_2

    .line 274
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 275
    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_2

    .line 534
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ll/᩻᩷ۖ;->ۧ(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 406
    :pswitch_1
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    sget v1, Ll/ۡۚۖ;->֫:I

    if-eqz p2, :cond_2

    .line 297
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 298
    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    :goto_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_2

    .line 549
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ll/᩻᩷ۖ;->֫(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 403
    :pswitch_2
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 402
    sget v1, Ll/ۡۚۖ;->֫:I

    if-eqz p2, :cond_2

    .line 260
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 261
    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1, v0, p2}, Ll/᩻᩷ۖ;->ۧ(ILjava/util/List;)V

    return-void

    .line 354
    :pswitch_3
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 353
    sget v1, Ll/ۡۚۖ;->֫:I

    if-eqz p2, :cond_2

    .line 267
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 268
    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1, v0, p2}, Ll/᩻᩷ۖ;->֫(ILjava/util/List;)V

    return-void

    .line 393
    :pswitch_4
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 394
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 395
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖۖۖ;

    .line 396
    invoke-virtual {v2}, Ll/ۖۖۖ;->getNumber()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 398
    :cond_0
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result p2

    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result v0

    invoke-static {p2, v1, p1, v0}, Ll/ۡۚۖ;->᩻(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    return-void

    .line 386
    :pswitch_5
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v1

    .line 387
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 389
    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result v0

    .line 385
    invoke-static {v1, p2, p1, v0}, Ll/ۡۚۖ;->ܺ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    return-void

    .line 379
    :pswitch_6
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v1

    .line 380
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 382
    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result v0

    .line 378
    invoke-static {v1, p2, p1, v0}, Ll/ۡۚۖ;->ۡ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    return-void

    .line 372
    :pswitch_7
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v1

    .line 373
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 375
    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result v0

    .line 371
    invoke-static {v1, p2, p1, v0}, Ll/ۡۚۖ;->ۢ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    return-void

    .line 365
    :pswitch_8
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v1

    .line 366
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 368
    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result v0

    .line 364
    invoke-static {v1, p2, p1, v0}, Ll/ۡۚۖ;->᩷(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    return-void

    .line 358
    :pswitch_9
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v1

    .line 359
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 361
    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result v0

    .line 357
    invoke-static {v1, p2, p1, v0}, Ll/ۡۚۖ;->ۖ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    return-void

    .line 347
    :pswitch_a
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v1

    .line 348
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 350
    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result v0

    .line 346
    invoke-static {v1, p2, p1, v0}, Ll/ۡۚۖ;->֫(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    return-void

    .line 340
    :pswitch_b
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v1

    .line 341
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 343
    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result v0

    .line 339
    invoke-static {v1, p2, p1, v0}, Ll/ۡۚۖ;->ᩳ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    return-void

    .line 333
    :pswitch_c
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v1

    .line 334
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 336
    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result v0

    .line 332
    invoke-static {v1, p2, p1, v0}, Ll/ۡۚۖ;->ܿ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    return-void

    .line 326
    :pswitch_d
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v1

    .line 327
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 329
    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result v0

    .line 325
    invoke-static {v1, p2, p1, v0}, Ll/ۡۚۖ;->᩻(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    return-void

    .line 319
    :pswitch_e
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v1

    .line 320
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 322
    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result v0

    .line 318
    invoke-static {v1, p2, p1, v0}, Ll/ۡۚۖ;->ۘ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    return-void

    .line 312
    :pswitch_f
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v1

    .line 313
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 315
    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result v0

    .line 311
    invoke-static {v1, p2, p1, v0}, Ll/ۡۚۖ;->ۜ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    return-void

    .line 305
    :pswitch_10
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v1

    .line 306
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 308
    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result v0

    .line 304
    invoke-static {v1, p2, p1, v0}, Ll/ۡۚۖ;->ܳ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    return-void

    .line 298
    :pswitch_11
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v1

    .line 299
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 301
    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳܽ()Z

    move-result v0

    .line 297
    invoke-static {v1, p2, p1, v0}, Ll/ۡۚۖ;->ۧ(ILjava/util/List;Ll/ۜ۠ۖ;Z)V

    return-void

    .line 414
    :cond_1
    sget-object v1, Ll/ܳۘۖ;->֫:[I

    invoke-virtual {v0}, Ll/֡ۖۖ;->ᩳۧ()Ll/۟֨ۖ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_1

    goto/16 :goto_3

    .line 468
    :pswitch_12
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1, v0, p2}, Ll/᩻᩷ۖ;->ۧ(ILjava/lang/Object;)V

    return-void

    .line 465
    :pswitch_13
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1, v0, p2}, Ll/᩻᩷ۖ;->֫(ILjava/lang/Object;)V

    return-void

    .line 462
    :pswitch_14
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1, v0, p2}, Ll/᩻᩷ۖ;->֫(ILjava/lang/String;)V

    return-void

    .line 440
    :pswitch_15
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۛۜۖ;

    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1, v0, p2}, Ll/᩻᩷ۖ;->֫(ILl/ۛۜۖ;)V

    return-void

    .line 459
    :pswitch_16
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۖۖۖ;

    invoke-virtual {p2}, Ll/ۖۖۖ;->getNumber()I

    move-result p2

    .line 458
    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1, v0, p2}, Ll/᩻᩷ۖ;->ܽ(II)V

    return-void

    .line 455
    :pswitch_17
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1, v0, v1, v2}, Ll/᩻᩷ۖ;->ᩳ(IJ)V

    return-void

    .line 452
    :pswitch_18
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1, v0, p2}, Ll/᩻᩷ۖ;->ܿ(II)V

    return-void

    .line 449
    :pswitch_19
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1, v0, v1, v2}, Ll/᩻᩷ۖ;->ܽ(IJ)V

    return-void

    .line 446
    :pswitch_1a
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1, v0, p2}, Ll/᩻᩷ۖ;->ᩳ(II)V

    return-void

    .line 443
    :pswitch_1b
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1, v0, p2}, Ll/᩻᩷ۖ;->ܳ(II)V

    return-void

    .line 437
    :pswitch_1c
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1, v0, p2}, Ll/᩻᩷ۖ;->֫(IZ)V

    return-void

    .line 434
    :pswitch_1d
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1, v0, p2}, Ll/᩻᩷ۖ;->ۧ(II)V

    return-void

    .line 431
    :pswitch_1e
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1, v0, v1, v2}, Ll/᩻᩷ۖ;->֫(IJ)V

    return-void

    .line 428
    :pswitch_1f
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1, v0, p2}, Ll/᩻᩷ۖ;->ܽ(II)V

    return-void

    .line 425
    :pswitch_20
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1, v0, v1, v2}, Ll/᩻᩷ۖ;->ܿ(IJ)V

    return-void

    .line 422
    :pswitch_21
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1, v0, v1, v2}, Ll/᩻᩷ۖ;->ۧ(IJ)V

    return-void

    .line 419
    :pswitch_22
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1, p2, v0}, Ll/᩻᩷ۖ;->֫(FI)V

    return-void

    .line 416
    :pswitch_23
    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    check-cast p1, Ll/᩻᩷ۖ;

    invoke-virtual {p1, v0, v1, v2}, Ll/᩻᩷ۖ;->֫(ID)V

    :cond_2
    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch
.end method

.method public final ֫(Ll/ۧۚۖ;Ljava/lang/Object;Ll/ᩳۘۖ;Ll/᩵ۘۖ;)V
    .locals 2

    .line 488
    check-cast p2, Ll/۟ۖۖ;

    .line 490
    sget-object v0, Ll/ᩳۘۖ;->ۧ:Ll/ᩳۘۖ;

    .line 495
    iget-object v0, p2, Ll/۟ۖۖ;->ۧ:Ll/֡ۖۖ;

    new-instance v1, Ll/ۡ᩵ۖ;

    iget-object p2, p2, Ll/۟ۖۖ;->֫:Ll/᩻֡ۖ;

    .line 497
    invoke-interface {p1}, Ll/ۧۚۖ;->ۜ()Ll/ۛۜۖ;

    move-result-object p1

    invoke-direct {v1, p2, p3, p1}, Ll/ۡ᩵ۖ;-><init>(Ll/᩻֡ۖ;Ll/ᩳۘۖ;Ll/ۛۜۖ;)V

    .line 495
    invoke-virtual {p4, v0, v1}, Ll/᩵ۘۖ;->֫(Ll/ᩴۘۖ;Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/ۡ֡ۖ;)Z
    .locals 0

    .line 35
    instance-of p1, p1, Ll/۫ۘۖ;

    return p1
.end method

.method public final ۧ(Ljava/lang/Object;)Ll/᩵ۘۖ;
    .locals 3

    .line 50
    invoke-virtual {p0, p1}, Ll/᩻ۘۖ;->֫(Ljava/lang/Object;)Ll/᩵ۘۖ;

    move-result-object v0

    .line 51
    invoke-virtual {v0}, Ll/᩵ۘۖ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 52
    invoke-virtual {v0}, Ll/᩵ۘۖ;->clone()Ll/᩵ۘۖ;

    move-result-object v0

    .line 45
    sget-wide v1, Ll/᩻ۘۖ;->ۧ:J

    invoke-static {v1, v2, p1, v0}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method public final ܽ(Ljava/lang/Object;)V
    .locals 0

    .line 60
    invoke-virtual {p0, p1}, Ll/᩻ۘۖ;->֫(Ljava/lang/Object;)Ll/᩵ۘۖ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩵ۘۖ;->᩷()V

    return-void
.end method
