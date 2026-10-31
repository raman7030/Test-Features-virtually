.class public final Ll/᩹۠۠;
.super Ljava/lang/Object;
.source "I5ZF"


# static fields
.field public static final ֫:Ljava/util/Iterator;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 86
    new-instance v0, Ll/۠۠۠;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/᩹۠۠;->֫:Ljava/util/Iterator;

    return-void
.end method

.method public static bridge synthetic ֫()Ljava/util/Iterator;
    .locals 1

    .line 0
    sget-object v0, Ll/᩹۠۠;->֫:Ljava/util/Iterator;

    return-object v0
.end method

.method public static ֫(Ljava/lang/Iterable;Ljava/util/function/Function;)Ljava/util/Iterator;
    .locals 1

    .line 43
    new-instance v0, Ll/᩸۠۠;

    invoke-direct {v0, p0, p1}, Ll/᩸۠۠;-><init>(Ljava/lang/Iterable;Ljava/util/function/Function;)V

    return-object v0
.end method

.method public static ֫(Ljava/util/Iterator;Ljava/util/function/Predicate;)Ljava/util/Iterator;
    .locals 1

    .line 98
    new-instance v0, Ll/ܶ۠۠;

    invoke-direct {v0, p0, p1}, Ll/ܶ۠۠;-><init>(Ljava/util/Iterator;Ljava/util/function/Predicate;)V

    return-object v0
.end method
