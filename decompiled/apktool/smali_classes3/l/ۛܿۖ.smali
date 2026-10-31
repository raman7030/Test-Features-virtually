.class public Ll/ۛܿۖ;
.super Ljava/lang/Object;
.source "47S6"

# interfaces
.implements Ll/ܶᩳۖ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ܽۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;
    .locals 1

    .line 40
    invoke-virtual {p2}, Ll/ܽۜۖ;->֫()Ljava/lang/Class;

    move-result-object p1

    .line 41
    const-class p2, Ljava/lang/Enum;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-ne p1, p2, :cond_0

    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->isEnum()Z

    move-result p2

    if-nez p2, :cond_1

    .line 45
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p1

    .line 48
    :cond_1
    new-instance p2, Ll/ۨܿۖ;

    invoke-direct {p2, p1}, Ll/ۨܿۖ;-><init>(Ljava/lang/Class;)V

    return-object p2

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
