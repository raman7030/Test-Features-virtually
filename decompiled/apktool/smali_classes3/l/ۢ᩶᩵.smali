.class public final Ll/ۢ᩶᩵;
.super Ljava/lang/Object;
.source "LC51"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(ILjava/lang/Object;)V
    .locals 2

    if-eqz p1, :cond_1a

    .line 336
    instance-of v0, p1, Ll/ܽ۠᩵;

    if-eqz v0, :cond_18

    .line 258
    instance-of v0, p1, Ll/۟᩹᩵;

    if-eqz v0, :cond_0

    .line 259
    move-object v0, p1

    check-cast v0, Ll/۟᩹᩵;

    invoke-interface {v0}, Ll/۟᩹᩵;->ܳ()I

    move-result v0

    goto/16 :goto_0

    .line 261
    :cond_0
    instance-of v0, p1, Ll/֫᩹᩵;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto/16 :goto_0

    .line 264
    :cond_1
    instance-of v0, p1, Ll/ܺ᩹᩵;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto/16 :goto_0

    .line 267
    :cond_2
    instance-of v0, p1, Ll/᩵᩹᩵;

    if-eqz v0, :cond_3

    const/4 v0, 0x2

    goto/16 :goto_0

    .line 270
    :cond_3
    instance-of v0, p1, Ll/֡᩹᩵;

    if-eqz v0, :cond_4

    const/4 v0, 0x3

    goto/16 :goto_0

    .line 273
    :cond_4
    instance-of v0, p1, Ll/ۚ᩹᩵;

    if-eqz v0, :cond_5

    const/4 v0, 0x4

    goto/16 :goto_0

    .line 276
    :cond_5
    instance-of v0, p1, Ll/֨᩹᩵;

    if-eqz v0, :cond_6

    const/4 v0, 0x5

    goto/16 :goto_0

    .line 279
    :cond_6
    instance-of v0, p1, Ll/۠᩹᩵;

    if-eqz v0, :cond_7

    const/4 v0, 0x6

    goto/16 :goto_0

    .line 282
    :cond_7
    instance-of v0, p1, Ll/ܶ᩹᩵;

    if-eqz v0, :cond_8

    const/4 v0, 0x7

    goto/16 :goto_0

    .line 285
    :cond_8
    instance-of v0, p1, Ll/᩸᩹᩵;

    if-eqz v0, :cond_9

    const/16 v0, 0x8

    goto/16 :goto_0

    .line 288
    :cond_9
    instance-of v0, p1, Ll/᩹᩹᩵;

    if-eqz v0, :cond_a

    const/16 v0, 0x9

    goto/16 :goto_0

    .line 291
    :cond_a
    instance-of v0, p1, Ll/ۧ᩹᩵;

    if-eqz v0, :cond_b

    const/16 v0, 0xa

    goto :goto_0

    .line 294
    :cond_b
    instance-of v0, p1, Ll/ܽ᩹᩵;

    if-eqz v0, :cond_c

    const/16 v0, 0xb

    goto :goto_0

    .line 297
    :cond_c
    instance-of v0, p1, Ll/ᩳ᩹᩵;

    if-eqz v0, :cond_d

    const/16 v0, 0xc

    goto :goto_0

    .line 300
    :cond_d
    instance-of v0, p1, Ll/ܿ᩹᩵;

    if-eqz v0, :cond_e

    const/16 v0, 0xd

    goto :goto_0

    .line 303
    :cond_e
    instance-of v0, p1, Ll/ܳ᩹᩵;

    if-eqz v0, :cond_f

    const/16 v0, 0xe

    goto :goto_0

    .line 306
    :cond_f
    instance-of v0, p1, Ll/᩻᩹᩵;

    if-eqz v0, :cond_10

    const/16 v0, 0xf

    goto :goto_0

    .line 309
    :cond_10
    instance-of v0, p1, Ll/ۜ᩹᩵;

    if-eqz v0, :cond_11

    const/16 v0, 0x10

    goto :goto_0

    .line 312
    :cond_11
    instance-of v0, p1, Ll/᩷᩹᩵;

    if-eqz v0, :cond_12

    const/16 v0, 0x11

    goto :goto_0

    .line 315
    :cond_12
    instance-of v0, p1, Ll/ۢ᩹᩵;

    if-eqz v0, :cond_13

    const/16 v0, 0x12

    goto :goto_0

    .line 318
    :cond_13
    instance-of v0, p1, Ll/ۡ᩹᩵;

    if-eqz v0, :cond_14

    const/16 v0, 0x13

    goto :goto_0

    .line 321
    :cond_14
    instance-of v0, p1, Ll/ۖ᩹᩵;

    if-eqz v0, :cond_15

    const/16 v0, 0x14

    goto :goto_0

    .line 324
    :cond_15
    instance-of v0, p1, Ll/ۘ᩹᩵;

    if-eqz v0, :cond_16

    const/16 v0, 0x15

    goto :goto_0

    .line 327
    :cond_16
    instance-of v0, p1, Ll/ᩴ᩹᩵;

    if-eqz v0, :cond_17

    const/16 v0, 0x16

    goto :goto_0

    :cond_17
    const/4 v0, -0x1

    :goto_0
    if-ne v0, p0, :cond_18

    goto :goto_2

    .line 342
    :cond_18
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "kotlin.jvm.functions.Function"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    if-nez p1, :cond_19

    const-string p1, "null"

    goto :goto_1

    .line 21
    :cond_19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    :goto_1
    const-string v0, " cannot be cast to "

    .line 0
    invoke-static {p1, v0, p0}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 26
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1, p0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 17
    const-class p0, Ll/ۢ᩶᩵;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    .line 30
    throw p1

    :cond_1a
    :goto_2
    return-void
.end method
