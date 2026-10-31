.class public final synthetic Ll/۫ܽᩳ;
.super Ljava/lang/Object;
.source "L19N"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ljava/util/HashMap;


# direct methods
.method public synthetic constructor <init>(Ljava/util/HashMap;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ܽᩳ;->᩸:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Ll/ۗ᩺ۡ;

    .line 233
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->᩹()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/۫ܽᩳ;->᩸:Ljava/util/HashMap;

    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
