.class public final Ll/۫ᩳᩳ;
.super Ljava/lang/Object;
.source "8B7K"


# direct methods
.method public static ֫(Ljava/lang/Object;Ll/֫ܿᩳ;Ll/֫ܿᩳ;)[B
    .locals 4

    .line 503
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 504
    const-class v1, Ll/᩺ᩳᩳ;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 505
    check-cast p0, Ll/᩺ᩳᩳ;

    invoke-virtual {p0}, Ll/᩺ᩳᩳ;->֫()Ljava/nio/ByteBuffer;

    move-result-object p0

    .line 506
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    new-array p1, p1, [B

    .line 507
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    return-object p1

    :cond_0
    if-eqz p1, :cond_7

    .line 511
    sget-object v1, Ll/֫ܿᩳ;->᩹:Ll/֫ܿᩳ;

    if-ne p1, v1, :cond_1

    goto/16 :goto_2

    .line 515
    :cond_1
    sget-object v1, Ll/ۙᩳᩳ;->ۧ:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_1

    .line 581
    :pswitch_1
    check-cast p0, Ljava/util/Collection;

    invoke-static {p0, p2}, Ll/ۤᩳᩳ;->֫(Ljava/util/Collection;Ll/֫ܿᩳ;)[B

    move-result-object p0

    return-object p0

    .line 579
    :pswitch_2
    check-cast p0, Ljava/util/Collection;

    invoke-static {p0, p2}, Ll/ۤᩳᩳ;->ۧ(Ljava/util/Collection;Ll/֫ܿᩳ;)[B

    move-result-object p0

    return-object p0

    .line 556
    :pswitch_3
    instance-of p2, p0, Ljava/lang/String;

    if-eqz p2, :cond_6

    .line 557
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ll/ۤᩳᩳ;->֫(Ljava/lang/String;)[B

    move-result-object p0

    return-object p0

    .line 550
    :pswitch_4
    instance-of p2, p0, Ljava/lang/String;

    if-eqz p2, :cond_6

    .line 552
    invoke-static {p1}, Ll/ܽܿᩳ;->֫(Ll/֫ܿᩳ;)I

    move-result p1

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    new-array p2, v2, [[B

    aput-object p0, p2, v3

    .line 551
    invoke-static {v3, v3, p1, p2}, Ll/ۤᩳᩳ;->֫(IZI[[B)[B

    move-result-object p0

    return-object p0

    .line 544
    :pswitch_5
    instance-of p2, p0, Ljava/lang/Boolean;

    if-eqz p2, :cond_6

    .line 545
    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-static {p0}, Ll/ۤᩳᩳ;->֫(Z)[B

    move-result-object p0

    return-object p0

    .line 535
    :pswitch_6
    instance-of p2, p0, Ljava/lang/Integer;

    if-eqz p2, :cond_2

    .line 536
    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-static {p0}, Ll/ۤᩳᩳ;->֫(I)[B

    move-result-object p0

    return-object p0

    .line 537
    :cond_2
    instance-of p2, p0, Ljava/lang/Long;

    if-eqz p2, :cond_3

    .line 538
    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    invoke-static {p0, p1}, Ll/ۤᩳᩳ;->֫(J)[B

    move-result-object p0

    return-object p0

    .line 539
    :cond_3
    instance-of p2, p0, Ljava/math/BigInteger;

    if-eqz p2, :cond_6

    .line 540
    check-cast p0, Ljava/math/BigInteger;

    invoke-static {p0}, Ll/ۤᩳᩳ;->֫(Ljava/math/BigInteger;)[B

    move-result-object p0

    return-object p0

    .line 519
    :pswitch_7
    instance-of p2, p0, Ljava/nio/ByteBuffer;

    if-eqz p2, :cond_4

    .line 520
    check-cast p0, Ljava/nio/ByteBuffer;

    .line 521
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result p2

    new-array p2, p2, [B

    .line 522
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 523
    :cond_4
    instance-of p2, p0, [B

    if-eqz p2, :cond_5

    .line 524
    move-object p2, p0

    check-cast p2, [B

    goto :goto_0

    :cond_5
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_6

    .line 530
    invoke-static {p1}, Ll/ܽܿᩳ;->֫(Ll/֫ܿᩳ;)I

    move-result p0

    new-array p1, v2, [[B

    aput-object p2, p1, v3

    .line 527
    invoke-static {v3, v3, p0, p1}, Ll/ۤᩳᩳ;->֫(IZI[[B)[B

    move-result-object p0

    return-object p0

    .line 562
    :pswitch_8
    invoke-static {v0}, Ll/ᩳܿᩳ;->֫(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p2

    check-cast p2, Ll/᩸ᩳᩳ;

    if-eqz p2, :cond_6

    .line 564
    invoke-interface {p2}, Ll/᩸ᩳᩳ;->type()Ll/֫ܿᩳ;

    move-result-object p2

    sget-object v1, Ll/֫ܿᩳ;->ۨ:Ll/֫ܿᩳ;

    if-ne p2, v1, :cond_6

    .line 565
    invoke-static {p0}, Ll/ۤᩳᩳ;->ۧ(Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0

    .line 571
    :pswitch_9
    invoke-static {v0}, Ll/ᩳܿᩳ;->֫(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p2

    check-cast p2, Ll/᩸ᩳᩳ;

    if-eqz p2, :cond_6

    .line 573
    invoke-interface {p2}, Ll/᩸ᩳᩳ;->type()Ll/֫ܿᩳ;

    move-result-object p2

    sget-object v1, Ll/֫ܿᩳ;->ۗ:Ll/֫ܿᩳ;

    if-ne p2, v1, :cond_6

    .line 574
    invoke-static {p0}, Ll/ۤᩳᩳ;->֫(Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0

    .line 586
    :cond_6
    :goto_1
    new-instance p0, Ll/ۛᩳᩳ;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported conversion: "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 587
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " to ASN.1 "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 26
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 587
    throw p0

    .line 512
    :cond_7
    :goto_2
    invoke-static {p0}, Ll/ۤᩳᩳ;->ܽ(Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
