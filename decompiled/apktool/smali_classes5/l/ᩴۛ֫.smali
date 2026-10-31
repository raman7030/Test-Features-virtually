.class public final synthetic Ll/ᩴۛ֫;
.super Ljava/lang/Object;
.source "H8OV"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/᩸ۜ᩵;
.implements Ll/֫۠ܳ;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩴۛ֫;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۬֫;I)V
    .locals 0

    const/4 p1, 0x4

    .line 0
    iput p1, p0, Ll/ᩴۛ֫;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۬֫;Ll/ۧۧۧ;Ll/ۜۧۧ;I)V
    .locals 0

    const/4 p1, 0x5

    .line 0
    iput p1, p0, Ll/ᩴۛ֫;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;I)Ljava/lang/Object;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, p1

    .line 2
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/֡ۛ֫;Ll/֡ۛ֫;)V
    .locals 1

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 57
    invoke-interface {p1, v0}, Ll/֡ۛ֫;->֫(Ll/ܶۛ֫;)V

    :cond_1
    if-eqz p0, :cond_2

    .line 60
    invoke-interface {p0, v0}, Ll/֡ۛ֫;->ۧ(Ll/ܶۛ֫;)V

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 2
    check-cast p1, Ljava/lang/Long;

    .line 910
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    sget-object p1, Ll/ܰۗᩳ;->᩶:Ll/ܰۗᩳ;

    return-object p1

    .line 911
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, -0x2

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    sget-object p1, Ll/ܰۗᩳ;->ۙ:Ll/ܰۗᩳ;

    return-object p1

    .line 912
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, -0x3

    cmp-long p1, v0, v2

    if-nez p1, :cond_2

    sget-object p1, Ll/ܰۗᩳ;->᩹:Ll/ܰۗᩳ;

    return-object p1

    :cond_2
    sget-object p1, Ll/ܰۗᩳ;->ۗ:Ll/ܰۗᩳ;

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/ᩴۛ֫;->᩸:I

    .line 4
    check-cast p1, Ll/֨۬֫;

    packed-switch v0, :pswitch_data_0

    .line 414
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 581
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public ֫(Landroid/widget/TextView;)V
    .locals 1

    const-string v0, "0"

    .line 169
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
