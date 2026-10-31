.class public final Ll/᩵᩶֡;
.super Ljava/lang/Object;
.source "G5PX"


# direct methods
.method public static ֫(Ll/ۧۗ֡;Ll/ᩴ᩶֡;)V
    .locals 8

    .line 51
    :goto_0
    invoke-virtual {p0}, Ll/ۧۗ֡;->֫()I

    move-result v0

    .line 52
    invoke-virtual {p0}, Ll/ۧۗ֡;->ۧ()B

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    packed-switch v1, :pswitch_data_0

    .line 137
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    sget-object v1, Ll/֡᩶֡;->۬:Ll/֡᩶֡;

    invoke-virtual {p1, v0, v3}, Ll/ᩴ᩶֡;->֫(II)V

    goto :goto_0

    .line 130
    :pswitch_0
    invoke-virtual {p0}, Ll/ۧۗ֡;->ܳ()I

    move-result v0

    .line 131
    invoke-virtual {p1, v0}, Ll/ᩴ᩶֡;->֫(I)V

    goto :goto_0

    .line 126
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    sget-object v1, Ll/֡᩶֡;->۬:Ll/֡᩶֡;

    invoke-virtual {p1, v0, v3}, Ll/ᩴ᩶֡;->֫(II)V

    goto :goto_0

    .line 122
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    sget-object v1, Ll/֡᩶֡;->۬:Ll/֡᩶֡;

    invoke-virtual {p1, v0, v3}, Ll/ᩴ᩶֡;->֫(II)V

    goto :goto_0

    .line 111
    :pswitch_3
    invoke-virtual {p0}, Ll/ۧۗ֡;->᩻()I

    .line 117
    invoke-virtual {p0}, Ll/ۧۗ֡;->֫()I

    move-result v1

    sub-int/2addr v1, v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    sget-object v2, Ll/֡᩶֡;->۬:Ll/֡᩶֡;

    invoke-virtual {p1, v0, v1}, Ll/ᩴ᩶֡;->֫(II)V

    goto :goto_0

    .line 100
    :pswitch_4
    invoke-virtual {p0}, Ll/ۧۗ֡;->᩻()I

    .line 106
    invoke-virtual {p0}, Ll/ۧۗ֡;->֫()I

    move-result v1

    sub-int/2addr v1, v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    sget-object v2, Ll/֡᩶֡;->۬:Ll/֡᩶֡;

    invoke-virtual {p1, v0, v1}, Ll/ᩴ᩶֡;->֫(II)V

    goto :goto_0

    .line 85
    :pswitch_5
    invoke-virtual {p0}, Ll/ۧۗ֡;->᩻()I

    move-result v0

    if-gez v0, :cond_0

    not-int v0, v0

    const/4 v1, 0x1

    move v3, v0

    const/4 v7, 0x1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    move v3, v0

    const/4 v7, 0x0

    .line 91
    :goto_1
    invoke-virtual {p0}, Ll/ۧۗ֡;->ܳ()I

    move-result v0

    add-int/lit8 v4, v0, -0x1

    .line 92
    invoke-virtual {p0}, Ll/ۧۗ֡;->ܳ()I

    move-result v0

    add-int/lit8 v5, v0, -0x1

    .line 93
    invoke-virtual {p0}, Ll/ۧۗ֡;->ܳ()I

    move-result v0

    add-int/lit8 v6, v0, -0x1

    move-object v2, p1

    .line 94
    invoke-virtual/range {v2 .. v7}, Ll/ᩴ᩶֡;->֫(IIIIZ)V

    goto :goto_0

    .line 72
    :pswitch_6
    invoke-virtual {p0}, Ll/ۧۗ֡;->᩻()I

    move-result v0

    if-gez v0, :cond_1

    not-int v0, v0

    const/4 v2, 0x1

    .line 78
    :cond_1
    invoke-virtual {p0}, Ll/ۧۗ֡;->ܳ()I

    move-result v1

    sub-int/2addr v1, v3

    .line 79
    invoke-virtual {p0}, Ll/ۧۗ֡;->ܳ()I

    move-result v4

    sub-int/2addr v4, v3

    .line 80
    invoke-virtual {p1, v0, v1, v4, v2}, Ll/ᩴ᩶֡;->֫(IIIZ)V

    goto/16 :goto_0

    .line 66
    :pswitch_7
    invoke-virtual {p0}, Ll/ۧۗ֡;->ܿ()I

    .line 67
    invoke-virtual {p0}, Ll/ۧۗ֡;->֫()I

    move-result v1

    sub-int/2addr v1, v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    sget-object v2, Ll/֡᩶֡;->۬:Ll/֡᩶֡;

    invoke-virtual {p1, v0, v1}, Ll/ᩴ᩶֡;->֫(II)V

    goto/16 :goto_0

    .line 60
    :pswitch_8
    invoke-virtual {p0}, Ll/ۧۗ֡;->ܳ()I

    .line 61
    invoke-virtual {p0}, Ll/ۧۗ֡;->֫()I

    move-result v1

    sub-int/2addr v1, v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    sget-object v2, Ll/֡᩶֡;->۬:Ll/֡᩶֡;

    invoke-virtual {p1, v0, v1}, Ll/ᩴ᩶֡;->֫(II)V

    goto/16 :goto_0

    .line 56
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    sget-object p0, Ll/֡᩶֡;->۬:Ll/֡᩶֡;

    invoke-virtual {p1, v0, v3}, Ll/ᩴ᩶֡;->֫(II)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
.end method
