.class public final synthetic Ll/ۖܰۚ;
.super Ljava/lang/Object;
.source "64JA"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ljava/util/function/Consumer;


# direct methods
.method public synthetic constructor <init>(Ll/ۧ᩺ۚ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖܰۚ;->᩸:Ljava/util/function/Consumer;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Ll/֨᩺ۚ;

    .line 2329
    new-instance v0, Ll/᩹ᩳ֨;

    sget-object v1, Ll/۫ۧ֨;->ۜ֫:Ll/۫ۧ֨;

    invoke-virtual {p1}, Ll/֨᩺ۚ;->֫()I

    move-result v1

    .line 43
    iget-object p1, p1, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    .line 2329
    invoke-direct {v0, v1, p1}, Ll/᩹ᩳ֨;-><init>(ILjava/lang/String;)V

    iget-object p1, p0, Ll/ۖܰۚ;->᩸:Ljava/util/function/Consumer;

    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
