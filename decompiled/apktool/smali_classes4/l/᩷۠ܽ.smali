.class public final Ll/᩷۠ܽ;
.super Ljava/lang/Object;
.source "06VH"


# instance fields
.field public final ֫:Ll/ۜ۠ܽ;

.field public final ۧ:I


# direct methods
.method public constructor <init>(ILl/ۜ۠ܽ;)V
    .locals 0

    .line 287
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 288
    iput p1, p0, Ll/᩷۠ܽ;->ۧ:I

    .line 289
    iput-object p2, p0, Ll/᩷۠ܽ;->֫:Ll/ۜ۠ܽ;

    return-void
.end method

.method public static ֫([I[Ljava/lang/Object;IILl/ۛۚܽ;Ll/ۛۚܽ;Z)Ll/᩷۠ܽ;
    .locals 2

    if-nez p6, :cond_5

    if-eqz p4, :cond_5

    .line 294
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p6

    const-class v0, Ll/֡֨ܽ;

    if-ne p6, v0, :cond_5

    iget-object p6, p4, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    if-ne p6, p5, :cond_5

    check-cast p4, Ll/֡֨ܽ;

    iget p4, p4, Ll/֡֨ܽ;->ۧ:I

    if-lez p4, :cond_5

    if-ne p2, p3, :cond_5

    aget p3, p0, p2

    const/4 p4, 0x6

    if-eq p3, p4, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 p3, p2, 0x2

    .line 297
    aget p3, p0, p3

    aget-object p1, p1, p3

    check-cast p1, Ll/ۜ۠ܽ;

    .line 298
    iget-object p3, p1, Ll/ۜ۠ܽ;->֫:[I

    if-eqz p3, :cond_5

    iget-object p4, p1, Ll/ۜ۠ܽ;->ۧ:[I

    if-nez p4, :cond_5

    iget-object p4, p1, Ll/ۜ۠ܽ;->ܽ:[I

    array-length p4, p4

    const/4 p5, 0x2

    if-ge p4, p5, :cond_1

    goto :goto_2

    .line 299
    :cond_1
    array-length p4, p3

    const/4 p5, 0x0

    const/4 p6, 0x0

    :goto_0
    if-ge p6, p4, :cond_3

    aget v0, p3, p6

    add-int/lit8 v1, v0, -0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 p6, p6, 0x1

    goto :goto_0

    .line 303
    :cond_3
    :goto_1
    array-length p3, p0

    if-ge p5, p3, :cond_4

    .line 304
    aget p3, p0, p5

    packed-switch p3, :pswitch_data_0

    :pswitch_0
    goto :goto_2

    :pswitch_1
    add-int/lit8 p5, p5, 0x8

    goto :goto_1

    .line 310
    :cond_4
    new-instance p0, Ll/᩷۠ܽ;

    invoke-direct {p0, p2, p1}, Ll/᩷۠ܽ;-><init>(ILl/ۜ۠ܽ;)V

    return-object p0

    :cond_5
    :goto_2
    const/4 p0, 0x0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
