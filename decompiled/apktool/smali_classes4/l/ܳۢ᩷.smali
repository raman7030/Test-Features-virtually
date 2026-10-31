.class public final synthetic Ll/ܳۢ᩷;
.super Ljava/lang/Object;
.source "U7JF"

# interfaces
.implements Ll/᩸ᩴᩴ;


# instance fields
.field public final synthetic ᩸:Ll/᩻ۢ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/᩻ۢ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳۢ᩷;->᩸:Ll/᩻ۢ᩷;

    return-void
.end method


# virtual methods
.method public final andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 201
    new-instance p1, Ljava/lang/NoSuchMethodError;

    invoke-direct {p1}, Ljava/lang/NoSuchMethodError;-><init>()V

    throw p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 93
    invoke-virtual {p0, p1}, Ll/ܳۢ᩷;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final applyAsInt(Ljava/lang/Object;)I
    .locals 0

    .line 60
    invoke-virtual {p0, p1}, Ll/ܳۢ᩷;->ۧ(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic containsKey(Ljava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final synthetic get(Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܶᩴᩴ;->֫(Ll/᩸ᩴᩴ;Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 51
    invoke-virtual {p0, p1}, Ll/ܳۢ᩷;->get(Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic size()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public final ֫(ILjava/lang/Object;)I
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final ֫(Ljava/lang/Object;)I
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final ۧ(Ljava/lang/Object;)I
    .locals 1

    .line 41
    iget-object p1, p0, Ll/ܳۢ᩷;->᩸:Ll/᩻ۢ᩷;

    iget-object p1, p1, Ll/᩻ۢ᩷;->ۧ:Ll/۫ᩴᩴ;

    invoke-interface {p1}, Ll/ۢ᩺ۘ;->size()I

    move-result p1

    const/high16 v0, 0x7f010000

    add-int/2addr p1, v0

    return p1
.end method
