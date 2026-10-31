.class public final Ll/۠֨ۖ;
.super Ll/ܶ֨ۖ;
.source "59PE"


# virtual methods
.method public final ֫(J)B
    .locals 1

    .line 688
    iget-object v0, p0, Ll/ܶ֨ۖ;->֫:Lsun/misc/Unsafe;

    invoke-virtual {v0, p1, p2}, Lsun/misc/Unsafe;->getByte(J)B

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/reflect/Field;)Ljava/lang/Object;
    .locals 3

    .line 595
    iget-object v0, p0, Ll/ܶ֨ۖ;->֫:Lsun/misc/Unsafe;

    invoke-virtual {v0, p1}, Lsun/misc/Unsafe;->staticFieldBase(Ljava/lang/reflect/Field;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Ll/ܶ֨ۖ;->֫:Lsun/misc/Unsafe;

    invoke-virtual {v1, p1}, Lsun/misc/Unsafe;->staticFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v1

    invoke-virtual {p0, v1, v2, v0}, Ll/ܶ֨ۖ;->᩻(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(J[BJJ)V
    .locals 10

    move-object v0, p0

    .line 718
    iget-object v1, v0, Ll/ܶ֨ۖ;->֫:Lsun/misc/Unsafe;

    sget-wide v2, Ll/᩸֨ۖ;->ۧ:J

    add-long v6, v2, p4

    const/4 v2, 0x0

    move-wide v3, p1

    move-object v5, p3

    move-wide/from16 v8, p6

    invoke-virtual/range {v1 .. v9}, Lsun/misc/Unsafe;->copyMemory(Ljava/lang/Object;JLjava/lang/Object;JJ)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;JB)V
    .locals 1

    .line 629
    iget-object v0, p0, Ll/ܶ֨ۖ;->֫:Lsun/misc/Unsafe;

    invoke-virtual {v0, p1, p2, p3, p4}, Lsun/misc/Unsafe;->putByte(Ljava/lang/Object;JB)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;JD)V
    .locals 6

    .line 659
    iget-object v0, p0, Ll/ܶ֨ۖ;->֫:Lsun/misc/Unsafe;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putDouble(Ljava/lang/Object;JD)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;JF)V
    .locals 1

    .line 649
    iget-object v0, p0, Ll/ܶ֨ۖ;->֫:Lsun/misc/Unsafe;

    invoke-virtual {v0, p1, p2, p3, p4}, Lsun/misc/Unsafe;->putFloat(Ljava/lang/Object;JF)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;JZ)V
    .locals 1

    .line 639
    iget-object v0, p0, Ll/ܶ֨ۖ;->֫:Lsun/misc/Unsafe;

    invoke-virtual {v0, p1, p2, p3, p4}, Lsun/misc/Unsafe;->putBoolean(Ljava/lang/Object;JZ)V

    return-void
.end method

.method public final ֫()Z
    .locals 10

    .line 600
    const-class v0, Ljava/lang/Object;

    invoke-super {p0}, Ll/ܶ֨ۖ;->֫()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    .line 605
    :cond_0
    :try_start_0
    iget-object v1, p0, Ll/ܶ֨ۖ;->֫:Lsun/misc/Unsafe;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v3, "getByte"

    .line 606
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const/4 v5, 0x2

    new-array v6, v5, [Ljava/lang/Class;

    aput-object v0, v6, v2

    const/4 v7, 0x1

    aput-object v4, v6, v7

    invoke-virtual {v1, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "putByte"

    const/4 v6, 0x3

    new-array v8, v6, [Ljava/lang/Class;

    aput-object v0, v8, v2

    aput-object v4, v8, v7

    .line 607
    sget-object v9, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    aput-object v9, v8, v5

    invoke-virtual {v1, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "getBoolean"

    new-array v8, v5, [Ljava/lang/Class;

    aput-object v0, v8, v2

    aput-object v4, v8, v7

    .line 608
    invoke-virtual {v1, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "putBoolean"

    new-array v8, v6, [Ljava/lang/Class;

    aput-object v0, v8, v2

    aput-object v4, v8, v7

    .line 609
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v9, v8, v5

    invoke-virtual {v1, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "getFloat"

    new-array v8, v5, [Ljava/lang/Class;

    aput-object v0, v8, v2

    aput-object v4, v8, v7

    .line 610
    invoke-virtual {v1, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "putFloat"

    new-array v8, v6, [Ljava/lang/Class;

    aput-object v0, v8, v2

    aput-object v4, v8, v7

    .line 611
    sget-object v9, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    aput-object v9, v8, v5

    invoke-virtual {v1, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "getDouble"

    new-array v8, v5, [Ljava/lang/Class;

    aput-object v0, v8, v2

    aput-object v4, v8, v7

    .line 612
    invoke-virtual {v1, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "putDouble"

    new-array v6, v6, [Ljava/lang/Class;

    aput-object v0, v6, v2

    aput-object v4, v6, v7

    .line 613
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    aput-object v0, v6, v5

    invoke-virtual {v1, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v7

    :catchall_0
    move-exception v0

    .line 617
    invoke-static {v0}, Ll/᩸֨ۖ;->֫(Ljava/lang/Throwable;)V

    return v2
.end method

.method public final ֫(JLjava/lang/Object;)Z
    .locals 1

    .line 634
    iget-object v0, p0, Ll/ܶ֨ۖ;->֫:Lsun/misc/Unsafe;

    invoke-virtual {v0, p3, p1, p2}, Lsun/misc/Unsafe;->getBoolean(Ljava/lang/Object;J)Z

    move-result p1

    return p1
.end method

.method public final ۧ(JLjava/lang/Object;)B
    .locals 1

    .line 624
    iget-object v0, p0, Ll/ܶ֨ۖ;->֫:Lsun/misc/Unsafe;

    invoke-virtual {v0, p3, p1, p2}, Lsun/misc/Unsafe;->getByte(Ljava/lang/Object;J)B

    move-result p1

    return p1
.end method

.method public final ۧ()Z
    .locals 11

    const-string v0, "copyMemory"

    const-string v1, "getLong"

    .line 664
    const-class v2, Ljava/lang/Object;

    .line 550
    iget-object v3, p0, Ll/ܶ֨ۖ;->֫:Lsun/misc/Unsafe;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    goto :goto_0

    .line 554
    :cond_0
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string v5, "objectFieldOffset"

    const/4 v6, 0x1

    new-array v7, v6, [Ljava/lang/Class;

    .line 556
    const-class v8, Ljava/lang/reflect/Field;

    aput-object v8, v7, v4

    invoke-virtual {v3, v5, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 557
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const/4 v7, 0x2

    new-array v8, v7, [Ljava/lang/Class;

    aput-object v2, v8, v4

    aput-object v5, v8, v6

    invoke-virtual {v3, v1, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 559
    invoke-static {}, Ll/᩸֨ۖ;->֫()Ljava/lang/reflect/Field;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v3, :cond_1

    :goto_0
    return v4

    .line 669
    :cond_1
    :try_start_1
    iget-object v3, p0, Ll/ܶ֨ۖ;->֫:Lsun/misc/Unsafe;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string v8, "getByte"

    new-array v9, v6, [Ljava/lang/Class;

    aput-object v5, v9, v4

    .line 670
    invoke-virtual {v3, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v8, "putByte"

    new-array v9, v7, [Ljava/lang/Class;

    aput-object v5, v9, v4

    .line 671
    sget-object v10, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    aput-object v10, v9, v6

    invoke-virtual {v3, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v8, "getInt"

    new-array v9, v6, [Ljava/lang/Class;

    aput-object v5, v9, v4

    .line 672
    invoke-virtual {v3, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v8, "putInt"

    new-array v9, v7, [Ljava/lang/Class;

    aput-object v5, v9, v4

    .line 673
    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v10, v9, v6

    invoke-virtual {v3, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    new-array v8, v6, [Ljava/lang/Class;

    aput-object v5, v8, v4

    .line 674
    invoke-virtual {v3, v1, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v1, "putLong"

    new-array v8, v7, [Ljava/lang/Class;

    aput-object v5, v8, v4

    aput-object v5, v8, v6

    .line 675
    invoke-virtual {v3, v1, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const/4 v1, 0x3

    new-array v8, v1, [Ljava/lang/Class;

    aput-object v5, v8, v4

    aput-object v5, v8, v6

    aput-object v5, v8, v7

    .line 676
    invoke-virtual {v3, v0, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const/4 v8, 0x5

    new-array v8, v8, [Ljava/lang/Class;

    aput-object v2, v8, v4

    aput-object v5, v8, v6

    aput-object v2, v8, v7

    aput-object v5, v8, v1

    const/4 v1, 0x4

    aput-object v5, v8, v1

    .line 677
    invoke-virtual {v3, v0, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return v6

    :catchall_0
    move-exception v0

    .line 681
    invoke-static {v0}, Ll/᩸֨ۖ;->֫(Ljava/lang/Throwable;)V

    return v4

    :catchall_1
    move-exception v0

    .line 565
    invoke-static {v0}, Ll/᩸֨ۖ;->֫(Ljava/lang/Throwable;)V

    return v4
.end method

.method public final ܽ(JLjava/lang/Object;)D
    .locals 1

    .line 654
    iget-object v0, p0, Ll/ܶ֨ۖ;->֫:Lsun/misc/Unsafe;

    invoke-virtual {v0, p3, p1, p2}, Lsun/misc/Unsafe;->getDouble(Ljava/lang/Object;J)D

    move-result-wide p1

    return-wide p1
.end method

.method public final ᩳ(JLjava/lang/Object;)F
    .locals 1

    .line 644
    iget-object v0, p0, Ll/ܶ֨ۖ;->֫:Lsun/misc/Unsafe;

    invoke-virtual {v0, p3, p1, p2}, Lsun/misc/Unsafe;->getFloat(Ljava/lang/Object;J)F

    move-result p1

    return p1
.end method
