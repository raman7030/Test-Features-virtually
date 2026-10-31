.class public final Ll/᩶᩸ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/nio/file/DirectoryStream$Filter;
.implements Ljava/util/function/Function;


# static fields
.field public static final a:Ll/᩶᩸ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 433
    new-instance v0, Ll/᩶᩸ᩴ;

    .line 428
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 433
    sput-object v0, Ll/᩶᩸ᩴ;->a:Ll/᩶᩸ᩴ;

    return-void
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)Z
    .locals 0

    .line 425
    check-cast p1, Ll/᩷۠ᩴ;

    const/4 p1, 0x1

    return p1
.end method

.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ll/ܺ᩸ᩴ;

    sget-object v0, Ll/ܿ۠ᩴ;->a:Ljava/util/Set;

    .line 153
    iget-object p1, p1, Ll/ܺ᩸ᩴ;->b:Ll/᩷۠ᩴ;

    return-object p1
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
