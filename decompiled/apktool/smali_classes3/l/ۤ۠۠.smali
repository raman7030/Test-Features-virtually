.class public final synthetic Ll/ۤ۠۠;
.super Ljava/lang/Object;
.source "544J"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۛ۠۠;

.field public final synthetic ᩹:Ll/ۨܶ۠;


# direct methods
.method public synthetic constructor <init>(Ll/ۛ۠۠;Ll/ۨܶ۠;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤ۠۠;->᩸:Ll/ۛ۠۠;

    iput-object p2, p0, Ll/ۤ۠۠;->᩹:Ll/ۨܶ۠;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ۤ۠۠;->᩹:Ll/ۨܶ۠;

    const-string v1, "onlySyntaxErrorsUnrecoverable"

    .line 80
    invoke-virtual {v0, v1}, Ll/ۨܶ۠;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    iget-object v0, p0, Ll/ۤ۠۠;->᩸:Ll/ۛ۠۠;

    iget-object v0, v0, Ll/ۛ۠۠;->֫:Ljava/util/EnumSet;

    sget-object v1, Ll/᩶۠۠;->۬:Ll/᩶۠۠;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
