.class public final Ll/ܿۜ֡;
.super Ll/ۖ᩹ۢ;
.source "D971"


# static fields
.field public static final ۧ:Ll/ܿۜ֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 93
    new-instance v0, Ll/ܿۜ֡;

    const/4 v1, 0x6

    .line 14
    invoke-direct {v0, v1}, Ll/ۖ᩹ۢ;-><init>(I)V

    .line 93
    sput-object v0, Ll/ܿۜ֡;->ۧ:Ll/ܿۜ֡;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)I
    .locals 2

    .line 92
    check-cast p1, Ll/᩹ܳ֡;

    .line 105
    iget-object v0, p1, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget v0, v0, Ll/᩺ܳ֡;->ܿ:I

    const/4 v1, 0x7

    invoke-static {v1, v0}, Ll/֫᩸ۡ;->ۧ(II)I

    move-result v0

    .line 106
    iget-object p1, p1, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    invoke-static {v0, p1}, Ll/֫᩸ۡ;->֫(ILjava/lang/Object;)I

    move-result p1

    const/4 v0, 0x2

    .line 107
    invoke-static {p1, v0}, Ll/֫᩸ۡ;->֫(II)I

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 92
    check-cast p1, Ll/᩹ܳ֡;

    check-cast p2, Ll/᩹ܳ֡;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    goto :goto_1

    .line 115
    :cond_1
    iget-object v0, p1, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget v0, v0, Ll/᩺ܳ֡;->ܿ:I

    iget-object v1, p2, Ll/᩹ܳ֡;->ܿ:Ll/᩺ܳ֡;

    iget v1, v1, Ll/᩺ܳ֡;->ܿ:I

    if-ne v0, v1, :cond_2

    iget-object p1, p1, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    iget-object p2, p2, Ll/᩹ܳ֡;->ۧ:Ll/ܽۜ֡;

    .line 116
    invoke-virtual {p1, p2}, Ll/ܽۜ֡;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method
