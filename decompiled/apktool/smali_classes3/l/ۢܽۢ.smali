.class public final synthetic Ll/ۢܽۢ;
.super Ljava/lang/Object;
.source "R1EE"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Ll/ۙۛ᩷;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/ۙۛ᩷;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢܽۢ;->᩸:Ll/ۙۛ᩷;

    iput-object p2, p0, Ll/ۢܽۢ;->᩹:Ljava/lang/String;

    iput-object p3, p0, Ll/ۢܽۢ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 298
    new-instance v0, Ll/֨ۛ᩷;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const-string v2, "Usage: "

    const-string v3, "->"

    .line 0
    iget-object v4, p0, Ll/ۢܽۢ;->᩹:Ljava/lang/String;

    iget-object v5, p0, Ll/ۢܽۢ;->᩶:Ljava/lang/String;

    invoke-static {v2, v4, v3, v5}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    .line 298
    invoke-direct {v0, v3, v2, v1}, Ll/֨ۛ᩷;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    iget-object v1, p0, Ll/ۢܽۢ;->᩸:Ll/ۙۛ᩷;

    invoke-interface {v1, v0}, Ll/ۙۛ᩷;->֫(Ll/֨ۛ᩷;)V

    .line 299
    invoke-interface {v1}, Ll/ۙۛ᩷;->ۧ()V

    return-void
.end method
