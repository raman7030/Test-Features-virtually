.class public final Ll/ۙ֫ܺ;
.super Ljava/lang/Object;
.source "0AV8"

# interfaces
.implements Ll/ܽۧܺ;


# virtual methods
.method public final ֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 0

    .line 26
    iget-object p1, p1, Ll/ۛ֫ܺ;->ۜ:Ll/ۜۧܺ;

    .line 28
    iget p3, p1, Ll/ۜۧܺ;->᩶:I

    sget-object p4, Ll/᩷ۧܺ;->ᩳ֫:Ll/᩷ۧܺ;

    iget p4, p4, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr p3, p4

    if-eqz p3, :cond_1

    .line 29
    check-cast p2, Ljava/lang/Enum;

    .line 31
    invoke-virtual {p2}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object p2

    .line 32
    iget p3, p1, Ll/ۜۧܺ;->᩶:I

    sget-object p4, Ll/᩷ۧܺ;->֫֫:Ll/᩷ۧܺ;

    iget p4, p4, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr p3, p4

    if-eqz p3, :cond_0

    .line 35
    invoke-virtual {p1, p2}, Ll/ۜۧܺ;->ۧ(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 p3, 0x0

    .line 37
    invoke-virtual {p1, p2, p3, p3}, Ll/ۜۧܺ;->֫(Ljava/lang/String;CZ)V

    return-void

    .line 40
    :cond_1
    check-cast p2, Ljava/lang/Enum;

    .line 41
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    invoke-virtual {p1, p2}, Ll/ۜۧܺ;->writeInt(I)V

    return-void
.end method
