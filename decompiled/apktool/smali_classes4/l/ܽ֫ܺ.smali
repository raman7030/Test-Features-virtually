.class public final Ll/ܽ֫ܺ;
.super Ljava/lang/Object;
.source "WATP"

# interfaces
.implements Ll/᩵֫ܺ;


# static fields
.field public static final ֫:Ll/ܽ֫ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Ll/ܽ֫ܺ;

    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    sput-object v0, Ll/ܽ֫ܺ;->֫:Ll/ܽ֫ܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۨ۟ۡ;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 18
    instance-of v0, p2, Ljava/lang/reflect/GenericArrayType;

    if-eqz v0, :cond_2

    .line 19
    check-cast p2, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {p2}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object p2

    .line 20
    instance-of p3, p2, Ljava/lang/reflect/TypeVariable;

    if-eqz p3, :cond_0

    .line 21
    check-cast p2, Ljava/lang/reflect/TypeVariable;

    .line 22
    invoke-interface {p2}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    move-result-object p2

    const/4 p3, 0x0

    aget-object p2, p2, p3

    .line 25
    :cond_0
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    .line 724
    invoke-virtual {p1, p2, p3, v0}, Ll/ۨ۟ۡ;->֫(Ljava/lang/reflect/Type;Ljava/util/Collection;Ljava/lang/Object;)V

    .line 28
    instance-of p1, p2, Ljava/lang/Class;

    if-eqz p1, :cond_1

    .line 29
    check-cast p2, Ljava/lang/Class;

    .line 31
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    .line 32
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    return-object p1

    .line 35
    :cond_1
    invoke-virtual {p3}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 40
    :cond_2
    invoke-virtual {p1, p3}, Ll/ۨ۟ۡ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
