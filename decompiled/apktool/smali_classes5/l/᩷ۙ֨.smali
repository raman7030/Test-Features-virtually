.class public final synthetic Ll/᩷ۙ֨;
.super Ljava/lang/Object;
.source "F416"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ll/ۢۗ֨;

.field public final synthetic ᩹:Ll/ۙ֨֨;


# direct methods
.method public synthetic constructor <init>(Ll/ۢۗ֨;Ll/ۙ֨֨;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۙ֨;->᩸:Ll/ۢۗ֨;

    iput-object p2, p0, Ll/᩷ۙ֨;->᩹:Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 2
    check-cast p1, Ll/ۙ֨֨;

    .line 3864
    iget-object v0, p0, Ll/᩷ۙ֨;->᩸:Ll/ۢۗ֨;

    iget-object v0, v0, Ll/ۢۗ֨;->᩷֫:Ll/ۛ᩸֨;

    const/4 v1, 0x1

    .line 1071
    iget-object v2, p0, Ll/᩷ۙ֨;->᩹:Ll/ۙ֨֨;

    invoke-virtual {v0, v2, p1, v1}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
