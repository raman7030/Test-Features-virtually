.class public final synthetic Ll/֡ۙܽ;
.super Ljava/lang/Object;
.source "28VT"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩸ۙܽ;

.field public final synthetic ᩹:Ll/۬ܿᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩸ۙܽ;Ll/۬ܿᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ۙܽ;->᩸:Ll/᩸ۙܽ;

    iput-object p2, p0, Ll/֡ۙܽ;->᩹:Ll/۬ܿᩳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 522
    iget-object v0, p0, Ll/֡ۙܽ;->᩸:Ll/᩸ۙܽ;

    iget-object v0, v0, Ll/᩸ۙܽ;->᩹:Ll/᩹ۙܽ;

    iget-object v1, p0, Ll/֡ۙܽ;->᩹:Ll/۬ܿᩳ;

    invoke-static {v0, v1}, Ll/᩹ۙܽ;->ۧ(Ll/᩹ۙܽ;Ll/۬ܿᩳ;)V

    .line 523
    invoke-static {v0}, Ll/᩹ۙܽ;->᩷(Ll/᩹ۙܽ;)Ll/ۛ᩵᩷;

    move-result-object v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ll/۬ܿᩳ;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_key.zip"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v0, "zip"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v7, 0x10

    const v3, 0x7f1205fc

    const/4 v4, 0x0

    .line 0
    invoke-static/range {v2 .. v7}, Ll/ۛ᩵᩷;->֫(Ll/ۛ᩵᩷;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)V

    return-void
.end method
