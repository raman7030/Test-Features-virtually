.class public Ll/᩸ܿۖ;
.super Ljava/lang/Object;
.source "8827"

# interfaces
.implements Ll/ܶᩳۖ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ܽۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;
    .locals 2

    .line 39
    invoke-virtual {p2}, Ll/ܽۜۖ;->ۧ()Ljava/lang/reflect/Type;

    move-result-object p2

    .line 40
    instance-of v0, p2, Ljava/lang/reflect/GenericArrayType;

    if-nez v0, :cond_1

    instance-of v1, p2, Ljava/lang/Class;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Ljava/lang/Class;

    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    if-eqz v0, :cond_2

    .line 301
    check-cast p2, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {p2}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object p2

    goto :goto_0

    .line 302
    :cond_2
    check-cast p2, Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p2

    .line 46
    :goto_0
    invoke-static {p2}, Ll/ܽۜۖ;->֫(Ljava/lang/reflect/Type;)Ll/ܽۜۖ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/۫ܽۖ;->֫(Ll/ܽۜۖ;)Ll/۠ᩳۖ;

    move-result-object v0

    .line 49
    new-instance v1, Ll/᩹ܿۖ;

    .line 50
    invoke-static {p2}, Ll/ۛᩳۖ;->ܽ(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    invoke-direct {v1, p1, v0, p2}, Ll/᩹ܿۖ;-><init>(Ll/۫ܽۖ;Ll/۠ᩳۖ;Ljava/lang/Class;)V

    return-object v1
.end method
