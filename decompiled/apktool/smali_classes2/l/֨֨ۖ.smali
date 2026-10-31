.class public final Ll/֨֨ۖ;
.super Ll/ܶ֨ۖ;
.source "59PE"


# virtual methods
.method public final ֫(J)B
    .locals 0

    .line 805
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(Ljava/lang/reflect/Field;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 736
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object v0
.end method

.method public final ֫(J[BJJ)V
    .locals 0

    .line 835
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(Ljava/lang/Object;JB)V
    .locals 1

    .line 753
    sget-boolean v0, Ll/᩸֨ۖ;->ܿ:Z

    if-eqz v0, :cond_0

    .line 754
    invoke-static {p1, p2, p3, p4}, Ll/᩸֨ۖ;->֫(Ljava/lang/Object;JB)V

    return-void

    .line 756
    :cond_0
    invoke-static {p1, p2, p3, p4}, Ll/᩸֨ۖ;->ۧ(Ljava/lang/Object;JB)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;JD)V
    .locals 6

    .line 795
    invoke-static {p4, p5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    invoke-virtual/range {v0 .. v5}, Ll/ܶ֨ۖ;->֫(Ljava/lang/Object;JJ)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;JF)V
    .locals 0

    .line 785
    invoke-static {p4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p4

    invoke-virtual {p0, p4, p2, p3, p1}, Ll/ܶ֨ۖ;->֫(IJLjava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;JZ)V
    .locals 1

    .line 771
    sget-boolean v0, Ll/᩸֨ۖ;->ܿ:Z

    if-eqz v0, :cond_0

    .line 772
    invoke-static {p1, p2, p3, p4}, Ll/᩸֨ۖ;->֫(Ljava/lang/Object;JZ)V

    return-void

    .line 774
    :cond_0
    invoke-static {p1, p2, p3, p4}, Ll/᩸֨ۖ;->ۧ(Ljava/lang/Object;JZ)V

    return-void
.end method

.method public final ֫(JLjava/lang/Object;)Z
    .locals 1

    .line 762
    sget-boolean v0, Ll/᩸֨ۖ;->ܿ:Z

    if-eqz v0, :cond_0

    .line 763
    invoke-static {p1, p2, p3}, Ll/᩸֨ۖ;->ܽ(JLjava/lang/Object;)Z

    move-result p1

    return p1

    .line 765
    :cond_0
    invoke-static {p1, p2, p3}, Ll/᩸֨ۖ;->ᩳ(JLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(JLjava/lang/Object;)B
    .locals 1

    .line 744
    sget-boolean v0, Ll/᩸֨ۖ;->ܿ:Z

    if-eqz v0, :cond_0

    .line 745
    invoke-static {p1, p2, p3}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;)B

    move-result p1

    return p1

    .line 747
    :cond_0
    invoke-static {p1, p2, p3}, Ll/᩸֨ۖ;->ۧ(JLjava/lang/Object;)B

    move-result p1

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ(JLjava/lang/Object;)D
    .locals 0

    .line 790
    invoke-virtual {p0, p1, p2, p3}, Ll/ܶ֨ۖ;->ܳ(JLjava/lang/Object;)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide p1

    return-wide p1
.end method

.method public final ᩳ(JLjava/lang/Object;)F
    .locals 0

    .line 780
    invoke-virtual {p0, p1, p2, p3}, Ll/ܶ֨ۖ;->ܿ(JLjava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    return p1
.end method
