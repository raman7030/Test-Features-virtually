.class public final Ll/ܶۛ᩻;
.super Ljava/lang/IllegalArgumentException;
.source "A6XK"


# instance fields
.field public final ᩸:Ll/۠ۛ᩻;


# direct methods
.method public constructor <init>(Ll/۠ۛ᩻;)V
    .locals 2

    .line 479
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid MCP Home path: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 480
    iput-object p1, p0, Ll/ܶۛ᩻;->᩸:Ll/۠ۛ᩻;

    return-void
.end method
