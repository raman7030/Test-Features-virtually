.class public Ll/۫ܳۚ;
.super Ljava/lang/Object;
.source "82T8"

# interfaces
.implements Ll/ᩳ᩻ۚ;


# instance fields
.field public final ֫:Ll/ܽܳۚ;


# direct methods
.method public constructor <init>(Ll/ܽܳۚ;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Ll/۫ܳۚ;->֫:Ll/ܽܳۚ;

    return-void
.end method

.method public static ֫(Ll/۫ܳۚ;ILl/۠ܽۚ;)Ll/۠ܽۚ;
    .locals 1

    .line 101
    iget-object p0, p0, Ll/۫ܳۚ;->֫:Ll/ܽܳۚ;

    packed-switch p1, :pswitch_data_0

    .line 121
    new-instance p0, Ll/ܶ᩵ۚ;

    .line 122
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    const/4 p1, 0x0

    const-string v0, "Invalid reference type: %d"

    .line 46
    invoke-direct {p0, p1, v0, p2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    throw p0

    .line 116
    :pswitch_0
    check-cast p2, Ll/᩵ܽۚ;

    invoke-static {p2, p0}, Ll/᩸᩻ۚ;->֫(Ll/᩵ܽۚ;Ll/ܽܳۚ;)Ll/ۖ۬֡;

    move-result-object p0

    return-object p0

    .line 119
    :pswitch_1
    invoke-virtual {p0}, Ll/ܽܳۚ;->ܽ()Ll/ۗܿۚ;

    move-result-object p0

    check-cast p2, Ll/ۘܽۚ;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    new-instance p1, Ll/ۙܿۚ;

    invoke-direct {p1, p0, p2}, Ll/ۙܿۚ;-><init>(Ll/ۗܿۚ;Ll/ۘܽۚ;)V

    return-object p1

    .line 113
    :pswitch_2
    invoke-virtual {p0}, Ll/ܽܳۚ;->֡()Ll/ᩳ᩻ۚ;

    move-result-object p0

    check-cast p2, Ll/֡ܽۚ;

    .line 208
    new-instance p1, Ll/֨᩻ۚ;

    invoke-direct {p1, p0, p2}, Ll/֨᩻ۚ;-><init>(Ll/ᩳ᩻ۚ;Ll/֡ܽۚ;)V

    return-object p1

    .line 108
    :pswitch_3
    invoke-virtual {p0}, Ll/ܽܳۚ;->ۖ()Ll/ᩳ᩻ۚ;

    move-result-object p0

    check-cast p2, Ll/ۚܽۚ;

    invoke-interface {p0, p2}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/۠ܽۚ;

    return-object p0

    .line 106
    :pswitch_4
    invoke-virtual {p0}, Ll/ܽܳۚ;->ۜ()Ll/ᩳ᩻ۚ;

    move-result-object p0

    check-cast p2, Ll/ᩴܽۚ;

    invoke-interface {p0, p2}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/۠ܽۚ;

    return-object p0

    .line 103
    :pswitch_5
    invoke-virtual {p0}, Ll/ܽܳۚ;->֡()Ll/ᩳ᩻ۚ;

    move-result-object p0

    check-cast p2, Ll/᩸ܽۚ;

    .line 151
    new-instance p1, Ll/ᩴ᩻ۚ;

    invoke-direct {p1, p0, p2}, Ll/ᩴ᩻ۚ;-><init>(Ll/ᩳ᩻ۚ;Ll/᩸ܽۚ;)V

    return-object p1

    .line 110
    :pswitch_6
    invoke-virtual {p0}, Ll/ܽܳۚ;->ᩴ()Ll/ᩳ᩻ۚ;

    move-result-object p0

    check-cast p2, Ll/ܶܽۚ;

    invoke-interface {p0, p2}, Ll/ᩳ᩻ۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/۠ܽۚ;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public bridge synthetic ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 63
    check-cast p1, Ll/᩺֫ۚ;

    invoke-virtual {p0, p1}, Ll/۫ܳۚ;->֫(Ll/᩺֫ۚ;)Ll/᩺֫ۚ;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ll/᩺֫ۚ;)Ll/᩺֫ۚ;
    .locals 2

    .line 74
    instance-of v0, p1, Ll/ۧۧۚ;

    if-eqz v0, :cond_0

    .line 75
    sget-object v0, Ll/֡ܳۚ;->֫:[I

    invoke-interface {p1}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v1

    iget-object v1, v1, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 93
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-interface {p1}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object p1

    iget-object p1, p1, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 91
    :pswitch_0
    new-instance v0, Ll/۬ܳۚ;

    check-cast p1, Ll/᩷ܽۚ;

    .line 331
    invoke-direct {v0, p0, p1}, Ll/ۚܳۚ;-><init>(Ll/۫ܳۚ;Ll/۬֫ۚ;)V

    return-object v0

    .line 89
    :pswitch_1
    new-instance v0, Ll/ۗܳۚ;

    check-cast p1, Ll/ۜܽۚ;

    .line 293
    invoke-direct {v0, p0, p1}, Ll/ۚܳۚ;-><init>(Ll/۫ܳۚ;Ll/۬֫ۚ;)V

    return-object v0

    .line 87
    :pswitch_2
    new-instance v0, Ll/ۙܳۚ;

    check-cast p1, Ll/ܿܽۚ;

    .line 278
    invoke-direct {v0, p0, p1}, Ll/֨ܳۚ;-><init>(Ll/۫ܳۚ;Ll/ۧۧۚ;)V

    return-object v0

    .line 85
    :pswitch_3
    new-instance v0, Ll/᩶ܳۚ;

    check-cast p1, Ll/ۧܽۚ;

    .line 247
    invoke-direct {v0, p0, p1}, Ll/֨ܳۚ;-><init>(Ll/۫ܳۚ;Ll/ۧۧۚ;)V

    return-object v0

    .line 83
    :pswitch_4
    new-instance v0, Ll/᩹ܳۚ;

    check-cast p1, Ll/᩺ۧۚ;

    .line 236
    invoke-direct {v0, p0, p1}, Ll/֨ܳۚ;-><init>(Ll/۫ܳۚ;Ll/ۧۧۚ;)V

    return-object v0

    .line 81
    :pswitch_5
    new-instance v0, Ll/᩸ܳۚ;

    check-cast p1, Ll/ۙۧۚ;

    .line 221
    invoke-direct {v0, p0, p1}, Ll/֨ܳۚ;-><init>(Ll/۫ܳۚ;Ll/ۧۧۚ;)V

    return-object v0

    .line 79
    :pswitch_6
    new-instance v0, Ll/ܶܳۚ;

    check-cast p1, Ll/֨ۧۚ;

    .line 210
    invoke-direct {v0, p0, p1}, Ll/֨ܳۚ;-><init>(Ll/۫ܳۚ;Ll/ۧۧۚ;)V

    return-object v0

    .line 77
    :pswitch_7
    new-instance v0, Ll/۠ܳۚ;

    check-cast p1, Ll/֡ۧۚ;

    .line 198
    invoke-direct {v0, p0, p1}, Ll/֨ܳۚ;-><init>(Ll/۫ܳۚ;Ll/ۧۧۚ;)V

    return-object v0

    :cond_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
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
