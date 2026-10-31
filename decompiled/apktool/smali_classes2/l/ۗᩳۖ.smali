.class public final Ll/ۗᩳۖ;
.super Ljava/lang/Object;
.source "P86L"

# interfaces
.implements Ll/ܶᩳۖ;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final ᩶:Ll/ۗᩳۖ;


# instance fields
.field public ᩸:Ljava/util/List;

.field public ᩹:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 51
    new-instance v0, Ll/ۗᩳۖ;

    invoke-direct {v0}, Ll/ۗᩳۖ;-><init>()V

    sput-object v0, Ll/ۗᩳۖ;->᩶:Ll/ۗᩳۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ۗᩳۖ;->᩹:Ljava/util/List;

    .line 58
    iput-object v0, p0, Ll/ۗᩳۖ;->᩸:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 63
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗᩳۖ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 65
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public final ֫(Ll/۫ܽۖ;Ll/ܽۜۖ;)Ll/۠ᩳۖ;
    .locals 8

    .line 112
    invoke-virtual {p2}, Ll/ܽۜۖ;->֫()Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x1

    .line 114
    invoke-virtual {p0, v0, v1}, Ll/ۗᩳۖ;->֫(Ljava/lang/Class;Z)Z

    move-result v5

    const/4 v1, 0x0

    .line 115
    invoke-virtual {p0, v0, v1}, Ll/ۗᩳۖ;->֫(Ljava/lang/Class;Z)Z

    move-result v4

    if-nez v5, :cond_0

    if-nez v4, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 121
    :cond_0
    new-instance v0, Ll/ۙᩳۖ;

    move-object v2, v0

    move-object v3, p0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v2 .. v7}, Ll/ۙᩳۖ;-><init>(Ll/ۗᩳۖ;ZZLl/۫ܽۖ;Ll/ܽۜۖ;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/Class;Z)Z
    .locals 2

    const/4 v0, 0x1

    if-nez p2, :cond_1

    .line 219
    const-class v1, Ljava/lang/Enum;

    .line 220
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 221
    sget v1, Ll/۬᩻ۖ;->֫:I

    .line 152
    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    move-result v1

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 157
    invoke-virtual {p1}, Ljava/lang/Class;->isAnonymousClass()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Class;->isLocalClass()Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    return v0

    :cond_1
    if-eqz p2, :cond_2

    .line 225
    iget-object p1, p0, Ll/ۗᩳۖ;->᩹:Ljava/util/List;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Ll/ۗᩳۖ;->᩸:Ljava/util/List;

    .line 226
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܺܽۖ;

    .line 227
    invoke-interface {p2}, Ll/ܺܽۖ;->֫()Z

    move-result p2

    if-eqz p2, :cond_3

    return v0

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ljava/lang/reflect/Field;Z)Z
    .locals 1

    .line 159
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    and-int/lit16 v0, v0, 0x88

    if-eqz v0, :cond_0

    goto :goto_1

    .line 168
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->isSynthetic()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 179
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Ll/ۗᩳۖ;->֫(Ljava/lang/Class;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    if-eqz p2, :cond_3

    .line 183
    iget-object p2, p0, Ll/ۗᩳۖ;->᩹:Ljava/util/List;

    goto :goto_0

    :cond_3
    iget-object p2, p0, Ll/ۗᩳۖ;->᩸:Ljava/util/List;

    .line 184
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 185
    new-instance v0, Ll/֫ܶۘ;

    invoke-direct {v0, p1}, Ll/֫ܶۘ;-><init>(Ljava/lang/reflect/Field;)V

    .line 186
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܺܽۖ;

    .line 187
    invoke-interface {p2}, Ll/ܺܽۖ;->ۧ()Z

    move-result p2

    if-eqz p2, :cond_4

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_5
    const/4 p1, 0x0

    return p1
.end method
