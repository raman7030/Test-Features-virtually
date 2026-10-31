.class public final Ll/᩻ۡܺ;
.super Ljava/lang/Object;
.source "4BCI"


# static fields
.field public static final ֫:Ll/᩻ۡܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 31
    new-instance v0, Ll/᩻ۡܺ;

    .line 54
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    sput-object v0, Ll/᩻ۡܺ;->֫:Ll/᩻ۡܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗۡܺ;Ll/᩸ۡܺ;Ll/᩸ۡܺ;)Z
    .locals 3

    .line 68
    invoke-virtual {p2}, Ll/᩸ۡܺ;->getType()Ll/۟ܺܺ;

    move-result-object v0

    sget-object v1, Ll/۟ܺܺ;->ܺ֫:Ll/۟ܺܺ;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {p3}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object v0

    instance-of v0, v0, Ll/ۖܺܺ;

    const/4 v1, 0x1

    if-nez v0, :cond_2

    .line 75
    invoke-virtual {p2}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object p3

    instance-of p3, p3, Ll/ۖܺܺ;

    if-eqz p3, :cond_4

    .line 76
    invoke-virtual {p1}, Ll/ۗۡܺ;->ᩳ()I

    move-result p1

    const/16 p3, 0xf

    if-ne p1, p3, :cond_4

    .line 77
    invoke-virtual {p2}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object p1

    check-cast p1, Ll/ۖܺܺ;

    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    invoke-virtual {p1}, Ll/֡ܺܺ;->ᩴ()I

    move-result p1

    int-to-short p2, p1

    if-ne p2, p1, :cond_1

    return v1

    :cond_1
    return v2

    .line 84
    :cond_2
    invoke-virtual {p3}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object p2

    check-cast p2, Ll/ۖܺܺ;

    .line 86
    invoke-virtual {p1}, Ll/ۗۡܺ;->ᩳ()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 75
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    invoke-virtual {p2}, Ll/֡ܺܺ;->ᩴ()I

    move-result p1

    int-to-byte p2, p1

    if-ne p2, p1, :cond_4

    return v1

    .line 140
    :pswitch_2
    invoke-virtual {p2}, Ll/֡ܺܺ;->ᩴ()I

    move-result p1

    neg-int p1, p1

    .line 103
    invoke-static {p1}, Ll/ۖܺܺ;->֫(I)Ll/ۖܺܺ;

    move-result-object p1

    .line 64
    invoke-virtual {p1}, Ll/֡ܺܺ;->ᩴ()I

    move-result p1

    int-to-short p2, p1

    if-ne p2, p1, :cond_3

    return v1

    :cond_3
    return v2

    .line 60
    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    invoke-virtual {p2}, Ll/֡ܺܺ;->ᩴ()I

    move-result p1

    int-to-short p2, p1

    if-ne p2, p1, :cond_4

    return v1

    :cond_4
    :goto_0
    return v2

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
