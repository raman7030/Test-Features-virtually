.class public abstract Ll/۬ۜ֡;
.super Ljava/lang/Object;
.source "G5Y2"


# static fields
.field public static final ۧ:Ljava/util/List;


# instance fields
.field public ֫:Ll/᩺ܳ֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    const-string v9, "WILDCARD"

    const-string v10, "PRECEDENCE"

    const-string v0, "INVALID"

    const-string v1, "EPSILON"

    const-string v2, "RANGE"

    const-string v3, "RULE"

    const-string v4, "PREDICATE"

    const-string v5, "ATOM"

    const-string v6, "ACTION"

    const-string v7, "SET"

    const-string v8, "NOT_SET"

    .line 43
    filled-new-array/range {v0 .. v10}, [Ljava/lang/String;

    move-result-object v0

    .line 44
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll/۬ۜ֡;->ۧ:Ljava/util/List;

    .line 58
    new-instance v0, Ll/ۗۜ֡;

    .line 59
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x1

    .line 60
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, Ll/ۢ᩻֡;

    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x2

    .line 61
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, Ll/ۜۜ֡;

    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x3

    .line 62
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, Ll/ۡۜ֡;

    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x4

    .line 63
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, Ll/ۧۜ֡;

    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x5

    .line 64
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, Ll/ܽ᩻֡;

    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x6

    .line 65
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, Ll/֫᩻֡;

    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x7

    .line 66
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, Ll/֨ۜ֡;

    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x8

    .line 67
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, Ll/۫᩻֡;

    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x9

    .line 68
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, Ll/۫ۜ֡;

    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0xa

    .line 69
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, Ll/֫ۜ֡;

    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ll/᩺ܳ֡;)V
    .locals 1

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 81
    iput-object p1, p0, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    return-void

    .line 78
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "target cannot be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public abstract ֫()I
.end method

.method public abstract ֫(II)Z
.end method

.method public ۧ()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/֫᩻֡;

    return v0
.end method

.method public ܽ()Ll/᩻᩷֡;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
