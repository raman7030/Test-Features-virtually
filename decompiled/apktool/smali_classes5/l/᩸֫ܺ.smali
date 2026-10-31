.class public final Ll/᩸֫ܺ;
.super Ljava/lang/Object;
.source "ZAWI"

# interfaces
.implements Ll/ܽۧܺ;
.implements Ll/᩵֫ܺ;


# static fields
.field public static final ֫:Ll/᩸֫ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Ll/᩸֫ܺ;

    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    sput-object v0, Ll/᩸֫ܺ;->֫:Ll/᩸֫ܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۨ۟ۡ;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 60
    iget-object p2, p1, Ll/ۨ۟ۡ;->ۛ:Ll/۟۟ۡ;

    .line 63
    invoke-virtual {p2}, Ll/۟۟ۡ;->ܶ()I

    move-result p3

    const/4 v0, 0x6

    const/16 v1, 0x10

    if-ne p3, v0, :cond_0

    .line 65
    invoke-virtual {p2, v1}, Ll/۟۟ۡ;->ۧ(I)V

    .line 66
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    const/4 v0, 0x7

    if-ne p3, v0, :cond_1

    .line 68
    invoke-virtual {p2, v1}, Ll/۟۟ۡ;->ۧ(I)V

    .line 69
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_1
    const/4 v0, 0x2

    if-ne p3, v0, :cond_3

    .line 71
    invoke-virtual {p2}, Ll/۟۟ۡ;->ܿ()I

    move-result p1

    .line 72
    invoke-virtual {p2, v1}, Ll/۟۟ۡ;->ۧ(I)V

    const/4 p2, 0x1

    if-ne p1, p2, :cond_2

    .line 75
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    .line 77
    :cond_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_3
    const/4 p2, 0x0

    .line 1380
    invoke-virtual {p1, p2}, Ll/ۨ۟ۡ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_4

    return-object p2

    .line 86
    :cond_4
    invoke-static {p1}, Ll/᩵ۧܺ;->ܽ(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 0

    .line 39
    iget-object p1, p1, Ll/ۛ֫ܺ;->ۜ:Ll/ۜۧܺ;

    .line 41
    check-cast p2, Ljava/lang/Boolean;

    const-string p3, "false"

    if-nez p2, :cond_1

    .line 43
    iget p2, p1, Ll/ۜۧܺ;->᩶:I

    sget-object p4, Ll/᩷ۧܺ;->᩻֫:Ll/᩷ۧܺ;

    iget p4, p4, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr p2, p4

    if-eqz p2, :cond_0

    .line 44
    invoke-virtual {p1, p3}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    return-void

    .line 46
    :cond_0
    invoke-virtual {p1}, Ll/ۜۧܺ;->֫()V

    return-void

    .line 51
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, "true"

    .line 52
    invoke-virtual {p1, p2}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    return-void

    .line 54
    :cond_2
    invoke-virtual {p1, p3}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    return-void
.end method
