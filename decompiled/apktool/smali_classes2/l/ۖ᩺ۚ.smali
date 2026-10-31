.class public final synthetic Ll/ۖ᩺ۚ;
.super Ljava/lang/Object;
.source "B7FA"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩶:Ljava/util/function/Function;

.field public final synthetic ᩸:Ll/ᩴ᩺ۚ;

.field public final synthetic ᩹:Ljava/util/function/Function;


# direct methods
.method public synthetic constructor <init>(Ll/ᩴ᩺ۚ;Ljava/util/function/Function;Ljava/util/function/Function;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖ᩺ۚ;->᩸:Ll/ᩴ᩺ۚ;

    iput-object p2, p0, Ll/ۖ᩺ۚ;->᩹:Ljava/util/function/Function;

    iput-object p3, p0, Ll/ۖ᩺ۚ;->᩶:Ljava/util/function/Function;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 0
    iget-object v0, p0, Ll/ۖ᩺ۚ;->᩶:Ljava/util/function/Function;

    check-cast p1, Ljava/util/Map$Entry;

    iget-object v1, p0, Ll/ۖ᩺ۚ;->᩸:Ll/ᩴ᩺ۚ;

    iget-object v2, p0, Ll/ۖ᩺ۚ;->᩹:Ljava/util/function/Function;

    invoke-static {v1, v2, v0, p1}, Ll/ᩴ᩺ۚ;->֫(Ll/ᩴ᩺ۚ;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/Map$Entry;)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
