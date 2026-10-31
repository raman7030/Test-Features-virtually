.class public final Ll/ᩴ֫ۖ;
.super Ljava/lang/Exception;
.source "67O2"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "\\R"

    .line 82
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 1

    .line 47
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵۟ܺ;

    invoke-virtual {v0}, Ll/᩵۟ܺ;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 48
    invoke-static {p1}, Ll/ܳ۬ܺ;->֫(Ljava/lang/Iterable;)Ll/ܳ۬ܺ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 39
    invoke-static {p1}, Ll/᩵۟ܺ;->֫(Ljava/lang/String;)Ll/᩵۟ܺ;

    move-result-object p1

    .line 43
    invoke-static {p1}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ᩴ֫ۖ;-><init>(Ljava/lang/Iterable;)V

    return-void
.end method
