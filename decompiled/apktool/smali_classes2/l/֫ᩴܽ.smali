.class public final synthetic Ll/֫ᩴܽ;
.super Ljava/lang/Object;
.source "W6QR"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ljava/lang/StringBuilder;

.field public final synthetic ᩹:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/StringBuilder;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ᩴܽ;->᩸:Ljava/lang/StringBuilder;

    iput-boolean p2, p0, Ll/֫ᩴܽ;->᩹:Z

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 2
    check-cast p1, Ljava/lang/String;

    .line 586
    iget-boolean v0, p0, Ll/֫ᩴܽ;->᩹:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ll/ۨۘܽ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Ll/֫ᩴܽ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x7c

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
