.class public final synthetic Ll/۠᩺᩷;
.super Ljava/lang/Object;
.source "F1FR"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ll/ۙ᩺᩷;

.field public final synthetic ᩹:Z


# direct methods
.method public synthetic constructor <init>(Ll/ۙ᩺᩷;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠᩺᩷;->᩸:Ll/ۙ᩺᩷;

    iput-boolean p2, p0, Ll/۠᩺᩷;->᩹:Z

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 0
    iget-boolean v0, p0, Ll/۠᩺᩷;->᩹:Z

    check-cast p1, Ll/ܿۛ᩷;

    iget-object v1, p0, Ll/۠᩺᩷;->᩸:Ll/ۙ᩺᩷;

    invoke-static {v1, v0, p1}, Ll/ۙ᩺᩷;->֫(Ll/ۙ᩺᩷;ZLl/ܿۛ᩷;)V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
