.class public final Ll/۬ܿܺ;
.super Ljava/lang/Object;
.source "4BE7"


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/ۨܿܺ;

.field public final ܽ:Z

.field public final ܿ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(IIILl/ۨܿܺ;Z)V
    .locals 1

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    invoke-static {p1}, Ll/᩷ۨۡ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 74
    invoke-static {p2}, Ll/᩷ۨۡ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 78
    invoke-static {p3}, Ll/᩷ۨۡ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p4, :cond_0

    .line 86
    iput p1, p0, Ll/۬ܿܺ;->ܿ:I

    .line 87
    iput p2, p0, Ll/۬ܿܺ;->֫:I

    .line 88
    iput p3, p0, Ll/۬ܿܺ;->ᩳ:I

    .line 89
    iput-object p4, p0, Ll/۬ܿܺ;->ۧ:Ll/ۨܿܺ;

    .line 90
    iput-boolean p5, p0, Ll/۬ܿܺ;->ܽ:Z

    return-void

    .line 83
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "format == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 79
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "bogus nextOpcode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 75
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "bogus family"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 71
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "bogus opcode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 98
    invoke-virtual {p0}, Ll/۬ܿܺ;->ܽ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 117
    iget v0, p0, Ll/۬ܿܺ;->֫:I

    return v0
.end method

.method public final ۧ()Ll/ۨܿܺ;
    .locals 1

    .line 126
    iget-object v0, p0, Ll/۬ܿܺ;->ۧ:Ll/ۨܿܺ;

    return-object v0
.end method

.method public final ܳ()Ll/۬ܿܺ;
    .locals 3

    .line 166
    iget v0, p0, Ll/۬ܿܺ;->ܿ:I

    packed-switch v0, :pswitch_data_0

    .line 193
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "bogus opcode: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 190
    :pswitch_0
    sget-object v0, Ll/۫ܿܺ;->᩸֫:Ll/۬ܿܺ;

    return-object v0

    .line 188
    :pswitch_1
    sget-object v0, Ll/۫ܿܺ;->᩶֫:Ll/۬ܿܺ;

    return-object v0

    .line 186
    :pswitch_2
    sget-object v0, Ll/۫ܿܺ;->ۗ֫:Ll/۬ܿܺ;

    return-object v0

    .line 184
    :pswitch_3
    sget-object v0, Ll/۫ܿܺ;->۠֫:Ll/۬ܿܺ;

    return-object v0

    .line 182
    :pswitch_4
    sget-object v0, Ll/۫ܿܺ;->ۚ֫:Ll/۬ܿܺ;

    return-object v0

    .line 180
    :pswitch_5
    sget-object v0, Ll/۫ܿܺ;->۫֫:Ll/۬ܿܺ;

    return-object v0

    .line 178
    :pswitch_6
    sget-object v0, Ll/۫ܿܺ;->ܶ֫:Ll/۬ܿܺ;

    return-object v0

    .line 176
    :pswitch_7
    sget-object v0, Ll/۫ܿܺ;->᩹֫:Ll/۬ܿܺ;

    return-object v0

    .line 174
    :pswitch_8
    sget-object v0, Ll/۫ܿܺ;->ۙ֫:Ll/۬ܿܺ;

    return-object v0

    .line 172
    :pswitch_9
    sget-object v0, Ll/۫ܿܺ;->֨֫:Ll/۬ܿܺ;

    return-object v0

    .line 170
    :pswitch_a
    sget-object v0, Ll/۫ܿܺ;->֡֫:Ll/۬ܿܺ;

    return-object v0

    .line 168
    :pswitch_b
    sget-object v0, Ll/۫ܿܺ;->۬֫:Ll/۬ܿܺ;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x32
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
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 144
    iget v0, p0, Ll/۬ܿܺ;->ܿ:I

    .line 1236
    invoke-static {v0}, Ll/ۢ᩷ܺ;->֫(I)Ll/᩷᩷ܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩷᩷ܺ;->ۧ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    .line 107
    iget v0, p0, Ll/۬ܿܺ;->ܿ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 156
    iget v0, p0, Ll/۬ܿܺ;->ᩳ:I

    return v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 135
    iget-boolean v0, p0, Ll/۬ܿܺ;->ܽ:Z

    return v0
.end method
