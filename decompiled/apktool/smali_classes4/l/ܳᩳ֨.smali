.class public final synthetic Ll/ܳᩳ֨;
.super Ljava/lang/Object;
.source "97F2"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ll/ۗᩳ֨;

.field public final synthetic ᩹:Ljava/lang/StringBuilder;


# direct methods
.method public synthetic constructor <init>(Ll/ۗᩳ֨;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳᩳ֨;->᩸:Ll/ۗᩳ֨;

    iput-object p2, p0, Ll/ܳᩳ֨;->᩹:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 2
    check-cast p1, Ll/֡ᩳ֨;

    const-string v0, "requires"

    const/16 v1, 0x9

    .line 85
    iget-object v2, p0, Ll/ܳᩳ֨;->᩸:Ll/ۗᩳ֨;

    invoke-virtual {v2, v1, v0}, Ll/ۢܽ֨;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ܳᩳ֨;->᩹:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 165
    invoke-virtual {p1}, Ll/ۙᩳ֨;->᩷()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p1, ""

    goto :goto_0

    .line 87
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, " // @"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    invoke-virtual {p1}, Ll/ۙᩳ֨;->᩷()Ljava/lang/String;

    move-result-object p1

    .line 87
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v0, v2

    const-string p1, ";%s%n"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
