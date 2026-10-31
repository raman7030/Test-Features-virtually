.class public final Ll/ۜ᩷ۧ;
.super Ljava/lang/Object;
.source "K8HG"


# direct methods
.method public static ֫(JLl/ᩳ֨֫;[Ll/᩵ۢۧ;)V
    .locals 9

    .line 49
    :goto_0
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_d

    const/4 v0, 0x0

    .line 131
    :cond_0
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֫()I

    move-result v2

    const/16 v3, 0xff

    const/4 v4, -0x1

    if-nez v2, :cond_1

    const/4 v0, -0x1

    const/4 v2, -0x1

    goto :goto_1

    .line 134
    :cond_1
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    add-int/2addr v0, v2

    if-eq v2, v3, :cond_0

    move v2, v0

    :goto_1
    const/4 v0, 0x0

    .line 131
    :cond_2
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֫()I

    move-result v5

    if-nez v5, :cond_3

    const/4 v0, -0x1

    goto :goto_2

    .line 134
    :cond_3
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֨()I

    move-result v5

    add-int/2addr v0, v5

    if-eq v5, v3, :cond_2

    .line 52
    :goto_2
    invoke-virtual {p2}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v3

    add-int/2addr v3, v0

    if-eq v0, v4, :cond_b

    .line 54
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֫()I

    move-result v4

    if-le v0, v4, :cond_4

    goto :goto_6

    :cond_4
    const/4 v4, 0x4

    if-ne v2, v4, :cond_c

    const/16 v2, 0x8

    if-lt v0, v2, :cond_c

    .line 59
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    .line 60
    invoke-virtual {p2}, Ll/ᩳ֨֫;->ۗ()I

    move-result v2

    const/16 v4, 0x31

    if-ne v2, v4, :cond_5

    .line 63
    invoke-virtual {p2}, Ll/ᩳ֨֫;->᩻()I

    move-result v5

    goto :goto_3

    :cond_5
    const/4 v5, 0x0

    .line 65
    :goto_3
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֨()I

    move-result v6

    const/16 v7, 0x2f

    if-ne v2, v7, :cond_6

    .line 67
    invoke-virtual {p2, v1}, Ll/ᩳ֨֫;->ܳ(I)V

    :cond_6
    const/16 v8, 0xb5

    if-ne v0, v8, :cond_8

    if-eq v2, v4, :cond_7

    if-ne v2, v7, :cond_8

    :cond_7
    const/4 v0, 0x3

    if-ne v6, v0, :cond_8

    const/4 v0, 0x1

    goto :goto_4

    :cond_8
    const/4 v0, 0x0

    :goto_4
    if-ne v2, v4, :cond_a

    const v2, 0x47413934

    if-ne v5, v2, :cond_9

    goto :goto_5

    :cond_9
    const/4 v1, 0x0

    :goto_5
    and-int/2addr v0, v1

    :cond_a
    if-eqz v0, :cond_c

    .line 77
    invoke-static {p0, p1, p2, p3}, Ll/ۜ᩷ۧ;->ۧ(JLl/ᩳ֨֫;[Ll/᩵ۢۧ;)V

    goto :goto_7

    :cond_b
    :goto_6
    const-string v0, "Skipping remainder of malformed SEI NAL unit."

    .line 56
    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    .line 57
    invoke-virtual {p2}, Ll/ᩳ֨֫;->ܿ()I

    move-result v3

    .line 80
    :cond_c
    :goto_7
    invoke-virtual {p2, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    goto/16 :goto_0

    :cond_d
    return-void
.end method

.method public static ۧ(JLl/ᩳ֨֫;[Ll/᩵ۢۧ;)V
    .locals 11

    .line 94
    invoke-virtual {p2}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    and-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x1

    .line 101
    invoke-virtual {p2, v1}, Ll/ᩳ֨֫;->ܳ(I)V

    mul-int/lit8 v0, v0, 0x3

    .line 105
    invoke-virtual {p2}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v1

    .line 106
    array-length v9, p3

    const/4 v2, 0x0

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_1

    aget-object v2, p3, v10

    .line 107
    invoke-virtual {p2, v1}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 108
    invoke-interface {v2, v0, p2}, Ll/᩵ۢۧ;->֫(ILl/ᩳ֨֫;)V

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, p0, v3

    if-eqz v5, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    .line 109
    :goto_1
    invoke-static {v3}, Ll/᩺֡֫;->ۧ(Z)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v5, 0x1

    move-wide v3, p0

    move v6, v0

    .line 110
    invoke-interface/range {v2 .. v8}, Ll/᩵ۢۧ;->֫(JIIILl/ᩴۢۧ;)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
