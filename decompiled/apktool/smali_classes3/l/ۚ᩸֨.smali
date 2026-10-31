.class public final synthetic Ll/ۚ᩸֨;
.super Ljava/lang/Object;
.source "X43L"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:Ll/֨᩸֨;

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ll/֨᩸֨;Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ᩸֨;->᩸:Ll/֨᩸֨;

    iput-object p2, p0, Ll/ۚ᩸֨;->᩹:Ljava/lang/Object;

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
    iget-object v0, p0, Ll/ۚ᩸֨;->᩹:Ljava/lang/Object;

    .line 4
    check-cast p1, Ll/ۙ֨֨;

    .line 4900
    iget-object v1, p0, Ll/ۚ᩸֨;->᩸:Ll/֨᩸֨;

    invoke-virtual {p1, v1, v0}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 5008
    check-cast p1, Ll/ۙ֨֨;

    return-object p1
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
