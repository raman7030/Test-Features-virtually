.class public final Ll/᩻ܳ֨;
.super Ll/ۡܳ֨;
.source "34PY"


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    .line 109
    new-instance v0, Ljava/util/HashSet;

    const-string v8, "short"

    const-string v9, "void"

    const-string v1, "boolean"

    const-string v2, "byte"

    const-string v3, "char"

    const-string v4, "double"

    const-string v5, "float"

    const-string v6, "int"

    const-string v7, "long"

    filled-new-array/range {v1 .. v9}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 96
    invoke-direct {p0}, Ll/ۡܳ֨;-><init>()V

    .line 97
    iput-object p1, p0, Ll/᩻ܳ֨;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Ll/᩻ܳ֨;->֫:Ljava/lang/String;

    return-object v0
.end method
