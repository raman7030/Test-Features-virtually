.class public final Ll/ܽ֫ۘ;
.super Ljava/lang/Object;
.source "U9KI"


# static fields
.field public static final ֫:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 32
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/ܽ֫ۘ;->֫:Ljava/util/HashMap;

    .line 35
    new-instance v1, Ll/֫֫ۘ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "KDF/Counter/HMACSHA256"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ֫()Ll/֡۟ۖ;
    .locals 2

    const-string v0, "KDF/Counter/HMACSHA256"

    .line 54
    sget-object v1, Ll/ܽ֫ۘ;->֫:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶ܰۖ;

    if-eqz v0, :cond_0

    .line 58
    invoke-interface {v0}, Ll/᩶ܰۖ;->create()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡۟ۖ;

    return-object v0

    .line 56
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown DerivationFunction KDF/Counter/HMACSHA256"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
