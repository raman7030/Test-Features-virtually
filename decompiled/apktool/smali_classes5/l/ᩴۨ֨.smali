.class public final synthetic Ll/ᩴۨ֨;
.super Ljava/lang/Object;
.source "D7LF"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ll/᩵ۨ֨;


# direct methods
.method public synthetic constructor <init>(Ll/᩵ۨ֨;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴۨ֨;->᩸:Ll/᩵ۨ֨;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Ll/ۙ֨֨;

    const/4 v0, 0x0

    .line 4980
    iget-object v1, p0, Ll/ᩴۨ֨;->᩸:Ll/᩵ۨ֨;

    invoke-virtual {p1, v1, v0}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
