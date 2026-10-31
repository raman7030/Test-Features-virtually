.class public final synthetic Ll/᩸ۧۢ;
.super Ljava/lang/Object;
.source "P67V"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:Ll/۫ۧۢ;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/۫ۧۢ;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ۧۢ;->᩸:Ll/۫ۧۢ;

    iput-object p2, p0, Ll/᩸ۧۢ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 2
    iget-object v0, p0, Ll/᩸ۧۢ;->᩸:Ll/۫ۧۢ;

    .line 4
    iget-object v1, p0, Ll/᩸ۧۢ;->᩹:Ljava/lang/String;

    .line 6
    check-cast p1, Ljava/lang/String;

    .line 326
    :try_start_0
    invoke-virtual {v0, v1}, Ll/۫ۧۢ;->ܳ(Ljava/lang/String;)Ll/ܿۧۢ;

    move-result-object p1

    iget-object p1, p1, Ll/ܿۧۢ;->ۧ:Ll/۠ۗ֡;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/16 p1, 0xf

    .line 129
    invoke-static {p1}, Ll/۠ۗ֡;->ۧ(I)Ll/۠ۗ֡;

    move-result-object p1

    .line 404
    :goto_0
    new-instance v0, Ll/᩹ܶ֡;

    invoke-direct {v0}, Ll/᩹ܶ֡;-><init>()V

    .line 405
    iget p1, p1, Ll/۠ۗ֡;->֫:I

    iput p1, v0, Ll/᩹ܶ֡;->֫:I

    return-object v0
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
