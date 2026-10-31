.class public final synthetic Ll/ᩳۨܺ;
.super Ljava/lang/Object;
.source "TUG"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ll/ܿۨܺ;


# direct methods
.method public synthetic constructor <init>(Ll/ܿۨܺ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۨܺ;->᩸:Ll/ܿۨܺ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x1

    .line 885
    iget-object v1, p0, Ll/ᩳۨܺ;->᩸:Ll/ܿۨܺ;

    iput-boolean v0, v1, Ll/ܿۨܺ;->֫:Z

    .line 886
    iput-object p1, v1, Ll/ܿۨܺ;->ۧ:Ljava/lang/Object;

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
