.class public final Ll/᩷۠֨;
.super Ljava/lang/Object;
.source "Z7L9"


# static fields
.field public static final ۧ:Ll/᩷۠֨;


# instance fields
.field public final ֫:Ljava/util/EnumMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 45
    new-instance v0, Ll/᩷۠֨;

    invoke-direct {v0}, Ll/᩷۠֨;-><init>()V

    sput-object v0, Ll/᩷۠֨;->ۧ:Ll/᩷۠֨;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Ll/᩻۠֨;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object v0, p0, Ll/᩷۠֨;->֫:Ljava/util/EnumMap;

    return-void
.end method

.method public constructor <init>(Ll/ܳ۠֨;)V
    .locals 2

    .line 62
    invoke-direct {p0}, Ll/᩷۠֨;-><init>()V

    .line 64
    iget-object v0, p0, Ll/᩷۠֨;->֫:Ljava/util/EnumMap;

    .line 200
    sget-object v1, Ll/᩻۠֨;->᩹:Ll/᩻۠֨;

    .line 64
    invoke-virtual {v0, v1, p1}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll/᩷۠֨;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iget-object p1, p1, Ll/᩷۠֨;->֫:Ljava/util/EnumMap;

    invoke-virtual {p1}, Ljava/util/EnumMap;->clone()Ljava/util/EnumMap;

    move-result-object p1

    iput-object p1, p0, Ll/᩷۠֨;->֫:Ljava/util/EnumMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻۠֨;)Ll/ۜ۠֨;
    .locals 1

    .line 143
    iget-object v0, p0, Ll/᩷۠֨;->֫:Ljava/util/EnumMap;

    invoke-virtual {v0, p1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۜ۠֨;

    return-object p1
.end method

.method public final ֫(Ll/ܳ۠֨;)Ll/᩷۠֨;
    .locals 5

    .line 87
    new-instance v0, Ll/᩷۠֨;

    invoke-direct {v0, p0}, Ll/᩷۠֨;-><init>(Ll/᩷۠֨;)V

    .line 200
    sget-object v1, Ll/᩻۠֨;->᩹:Ll/᩻۠֨;

    .line 89
    iget-object v2, p0, Ll/᩷۠֨;->֫:Ljava/util/EnumMap;

    invoke-virtual {v2, v1}, Ljava/util/EnumMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, v0, Ll/᩷۠֨;->֫:Ljava/util/EnumMap;

    if-eqz v3, :cond_0

    .line 90
    invoke-virtual {v2, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜ۠֨;

    invoke-interface {v2, p1}, Ll/ۜ۠֨;->֫(Ll/ܳ۠֨;)Ll/ܳ۠֨;

    move-result-object p1

    .line 147
    invoke-virtual {v4, v1, p1}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_0
    invoke-virtual {v4, v1, p1}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final ۧ(Ll/᩻۠֨;)Ll/᩷۠֨;
    .locals 3

    .line 134
    sget-object v0, Ll/᩷۠֨;->ۧ:Ll/᩷۠֨;

    if-eq p0, v0, :cond_2

    iget-object v1, p0, Ll/᩷۠֨;->֫:Ljava/util/EnumMap;

    invoke-virtual {v1, p1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 137
    :cond_0
    new-instance v1, Ll/᩷۠֨;

    invoke-direct {v1, p0}, Ll/᩷۠֨;-><init>(Ll/᩷۠֨;)V

    .line 138
    iget-object v2, v1, Ll/᩷۠֨;->֫:Ljava/util/EnumMap;

    invoke-virtual {v2, p1}, Ljava/util/EnumMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    invoke-virtual {v2}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    return-object v0

    :cond_1
    return-object v1

    :cond_2
    :goto_0
    return-object p0
.end method
