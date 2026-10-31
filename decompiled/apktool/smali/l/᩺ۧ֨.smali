.class public final synthetic Ll/᩺ۧ֨;
.super Ljava/lang/Object;
.source "M7E7"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/᩺ۧ֨;->᩸:I

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/᩺ۧ֨;->᩸:I

    .line 4
    check-cast p1, Ll/ۗܽ֨;

    .line 112
    invoke-interface {p1, v0}, Ll/ۗܽ֨;->֫(I)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
