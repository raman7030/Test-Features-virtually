.class public final synthetic Ll/ۚܰ֨;
.super Ljava/lang/Object;
.source "T7LF"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ljava/util/LinkedHashSet;

.field public final synthetic ᩹:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚܰ֨;->᩸:Ljava/util/LinkedHashSet;

    iput-object p2, p0, Ll/ۚܰ֨;->᩹:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 2
    check-cast p1, Ll/֡֡֨;

    .line 1324
    iget-object v0, p0, Ll/ۚܰ֨;->᩸:Ljava/util/LinkedHashSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1325
    iget-object v0, p0, Ll/ۚܰ֨;->᩹:Ljava/util/Set;

    if-eqz v0, :cond_0

    .line 1326
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
