.class public final synthetic Ll/֨ܽۢ;
.super Ljava/lang/Object;
.source "R1EE"

# interfaces
.implements Ll/۠ۛ᩷;


# instance fields
.field public final synthetic ᩸:Ll/ܶۛ᩷;

.field public final synthetic ᩹:Z


# direct methods
.method public synthetic constructor <init>(Ll/ܶۛ᩷;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ܽۢ;->᩸:Ll/ܶۛ᩷;

    iput-boolean p2, p0, Ll/֨ܽۢ;->᩹:Z

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    .line 2
    iget-object v0, p0, Ll/֨ܽۢ;->᩸:Ll/ܶۛ᩷;

    .line 4
    iget-boolean v1, p0, Ll/֨ܽۢ;->᩹:Z

    .line 6
    check-cast p1, Ll/ܰ֫ۢ;

    .line 664
    :try_start_0
    invoke-interface {p1}, Ll/ܰ֫ۢ;->ܿ()Ll/۠ۛ֡;

    move-result-object p1

    .line 665
    invoke-virtual {v0}, Ll/ܶۛ᩷;->get()Ll/۫ۘܽ;

    move-result-object v0

    invoke-static {p1, v0, v1}, Ll/ۛܽۢ;->ܽ(Ll/ۡ֫ۚ;Ll/۫ۘܽ;Z)Ljava/util/ArrayList;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method
