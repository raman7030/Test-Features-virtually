.class public final synthetic Ll/᩺᩺ۡ;
.super Ljava/lang/Object;
.source "A5XF"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩺᩺ۡ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 2
    iget v0, p0, Ll/᩺᩺ۡ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 9
    check-cast p2, Ljava/lang/String;

    .line 12
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result p1

    return p1

    .line 16
    :pswitch_0
    check-cast p1, Ll/᩶᩺᩻;

    .line 18
    check-cast p2, Ll/᩶᩺᩻;

    .line 87
    iget p1, p1, Ll/᩶᩺᩻;->ۜ:I

    iget p2, p2, Ll/᩶᩺᩻;->ۜ:I

    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1

    .line 0
    :pswitch_1
    check-cast p1, Ll/ۤܽܿ;

    check-cast p2, Ll/ۤܽܿ;

    .line 180
    iget p2, p2, Ll/ۤܽܿ;->ܽ:I

    iget p1, p1, Ll/ۤܽܿ;->ܽ:I

    invoke-static {p2, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1

    .line 0
    :pswitch_2
    check-cast p1, Ll/ۗ᩺ۡ;

    check-cast p2, Ll/ۗ᩺ۡ;

    .line 880
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v0

    invoke-virtual {p2}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    neg-int p1, p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
