.class public final Ll/۠ᩳᩳ;
.super Ljava/lang/Object;
.source "MB8H"


# direct methods
.method public static ֫(Ll/֫ܿᩳ;Ll/ܿܿᩳ;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4

    .line 576
    const-class v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 577
    invoke-virtual {p1}, Ll/ܿܿᩳ;->ܽ()Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0

    .line 578
    :cond_0
    const-class v0, [B

    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 579
    invoke-virtual {p1}, Ll/ܿܿᩳ;->ܽ()Ljava/nio/ByteBuffer;

    move-result-object p0

    .line 580
    invoke-virtual {p0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result p1

    if-nez p1, :cond_1

    .line 581
    sget-object p0, Ll/ۚ᩺ۘ;->֫:[B

    return-object p0

    .line 583
    :cond_1
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    new-array p1, p1, [B

    .line 584
    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    return-object p1

    .line 586
    :cond_2
    const-class v0, Ll/᩺ᩳᩳ;

    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 587
    new-instance p0, Ll/᩺ᩳᩳ;

    invoke-virtual {p1}, Ll/ܿܿᩳ;->ۧ()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/᩺ᩳᩳ;-><init>(Ljava/nio/ByteBuffer;)V

    return-object p0

    .line 589
    :cond_3
    invoke-virtual {p1}, Ll/ܿܿᩳ;->ܽ()Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 590
    sget-object v1, Ll/֡ᩳᩳ;->֫:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_b

    const/4 v3, 0x2

    if-eq v1, v3, :cond_a

    const-class p1, Ljava/lang/String;

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_2

    .line 614
    :pswitch_0
    sget-object p1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 615
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result p0

    if-ne p0, v2, :cond_5

    .line 621
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result p0

    if-nez p0, :cond_4

    const/4 v2, 0x0

    .line 626
    :cond_4
    new-instance p0, Ljava/lang/Boolean;

    invoke-direct {p0, v2}, Ljava/lang/Boolean;-><init>(Z)V

    return-object p0

    .line 616
    :cond_5
    new-instance p0, Ll/᩹ᩳᩳ;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Incorrect encoded size of boolean value: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 618
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 26
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 618
    throw p0

    .line 607
    :pswitch_1
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 608
    new-instance p0, Ljava/lang/String;

    .line 30
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    new-array p1, p1, [B

    .line 31
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 608
    invoke-direct {p0, p1}, Ljava/lang/String;-><init>([B)V

    return-object p0

    .line 601
    :pswitch_2
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 602
    invoke-static {v0}, Ll/ܶᩳᩳ;->ᩳ(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 592
    :pswitch_3
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    const-class p1, Ljava/lang/Integer;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_1

    .line 594
    :cond_6
    sget-object p1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    const-class p1, Ljava/lang/Long;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_0

    .line 596
    :cond_7
    const-class p1, Ljava/math/BigInteger;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 597
    invoke-static {v0}, Ll/ܶᩳᩳ;->֫(Ljava/nio/ByteBuffer;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    .line 595
    :cond_8
    :goto_0
    invoke-static {v0}, Ll/ܶᩳᩳ;->ܽ(Ljava/nio/ByteBuffer;)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    .line 593
    :cond_9
    :goto_1
    invoke-static {v0}, Ll/ܶᩳᩳ;->ۧ(Ljava/nio/ByteBuffer;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    .line 631
    :cond_a
    invoke-static {p2}, Ll/ᩳܿᩳ;->֫(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Ll/᩸ᩳᩳ;

    if-eqz v0, :cond_c

    .line 633
    invoke-interface {v0}, Ll/᩸ᩳᩳ;->type()Ll/֫ܿᩳ;

    move-result-object v0

    sget-object v1, Ll/֫ܿᩳ;->ۨ:Ll/֫ܿᩳ;

    if-ne v0, v1, :cond_c

    .line 634
    invoke-static {p1, p2}, Ll/ܶᩳᩳ;->ۧ(Ll/ܿܿᩳ;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 640
    :cond_b
    invoke-static {p2}, Ll/ᩳܿᩳ;->֫(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Ll/᩸ᩳᩳ;

    if-eqz v0, :cond_c

    .line 642
    invoke-interface {v0}, Ll/᩸ᩳᩳ;->type()Ll/֫ܿᩳ;

    move-result-object v0

    sget-object v1, Ll/֫ܿᩳ;->ۗ:Ll/֫ܿᩳ;

    if-ne v0, v1, :cond_c

    .line 643
    invoke-static {p1, p2}, Ll/ܶᩳᩳ;->֫(Ll/ܿܿᩳ;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 651
    :cond_c
    :goto_2
    new-instance p1, Ll/᩹ᩳᩳ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported conversion: ASN.1 "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " to "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 652
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 26
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 652
    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
