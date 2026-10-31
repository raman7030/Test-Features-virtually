.class public abstract Ll/᩸۠֡;
.super Ll/۠ܶ֡;
.source "R4HY"


# instance fields
.field public final ᩹:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Ll/۠ܶ֡;-><init>(I)V

    .line 50
    iput p2, p0, Ll/᩸۠֡;->᩹:I

    return-void
.end method

.method public static ֫(Ll/ܶܶ֡;Ll/۠֫ۚ;)Ll/᩸۠֡;
    .locals 3

    .line 54
    invoke-interface {p1}, Ll/۠֫ۚ;->ᩳ()I

    move-result v0

    .line 55
    invoke-interface {p1}, Ll/۠֫ۚ;->ܽ()I

    move-result v1

    const/4 v2, -0x4

    packed-switch v1, :pswitch_data_0

    .line 71
    :pswitch_0
    new-instance p0, Ll/ܶ᩵ۚ;

    invoke-interface {p1}, Ll/۠֫ۚ;->ܽ()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x0

    const-string v1, "Invalid debug item type: %d"

    .line 46
    invoke-direct {p0, p1, v1, v0}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    throw p0

    .line 69
    :pswitch_1
    check-cast p1, Ll/᩸֫ۚ;

    invoke-static {v0, p1}, Ll/ۙ۠֡;->֫(ILl/᩸֫ۚ;)Ll/ۙ۠֡;

    move-result-object p0

    return-object p0

    .line 67
    :pswitch_2
    new-instance p0, Ll/۫۠֡;

    check-cast p1, Ll/ۙ֫ۚ;

    invoke-direct {p0, v0, p1}, Ll/۫۠֡;-><init>(ILl/ۙ֫ۚ;)V

    return-object p0

    .line 63
    :pswitch_3
    new-instance p0, Ll/ܶ۠֡;

    .line 40
    invoke-direct {p0, v0, v2}, Ll/᩸۠֡;-><init>(II)V

    return-object p0

    .line 65
    :pswitch_4
    new-instance p0, Ll/᩶۠֡;

    .line 40
    invoke-direct {p0, v0, v2}, Ll/᩸۠֡;-><init>(II)V

    return-object p0

    .line 61
    :pswitch_5
    new-instance v1, Ll/۬۠֡;

    check-cast p1, Ll/᩶֫ۚ;

    invoke-direct {v1, v0, p0, p1}, Ll/۬۠֡;-><init>(ILl/ܶܶ֡;Ll/᩶֫ۚ;)V

    return-object v1

    .line 59
    :pswitch_6
    new-instance v1, Ll/᩹۠֡;

    check-cast p1, Ll/ܶ֫ۚ;

    invoke-direct {v1, v0, p0, p1}, Ll/᩹۠֡;-><init>(ILl/ܶܶ֡;Ll/ܶ֫ۚ;)V

    return-object v1

    .line 57
    :pswitch_7
    new-instance v1, Ll/ۤ۠֡;

    check-cast p1, Ll/ۗ֫ۚ;

    invoke-direct {v1, v0, p0, p1}, Ll/ۤ۠֡;-><init>(ILl/ܶܶ֡;Ll/ۗ֫ۚ;)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final ۧ()D
    .locals 2

    .line 77
    iget v0, p0, Ll/᩸۠֡;->᩹:I

    int-to-double v0, v0

    return-wide v0
.end method
