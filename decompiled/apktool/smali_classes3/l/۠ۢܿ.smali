.class public final Ll/۠ۢܿ;
.super Ljava/lang/IllegalStateException;
.source "V702"


# instance fields
.field public final ᩸:Ll/֡ۢܿ;


# direct methods
.method public constructor <init>(Ll/֡ۢܿ;)V
    .locals 2

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Incomplete syntax execution: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    iput-object p1, p0, Ll/۠ۢܿ;->᩸:Ll/֡ۢܿ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/֡ۢܿ;
    .locals 1

    .line 45
    iget-object v0, p0, Ll/۠ۢܿ;->᩸:Ll/֡ۢܿ;

    return-object v0
.end method
