.class public final Ll/ۖ᩹۠;
.super Ll/۬᩸۠;
.source "O42Y"


# static fields
.field public static final serialVersionUID:J = 0x10dL


# instance fields
.field public transient ᩸:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/ۛ֡֨;Ljava/lang/Object;)V
    .locals 2

    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unknown element: \""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\""

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 52
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 63
    iput-object p2, p0, Ll/ۖ᩹۠;->᩸:Ljava/lang/Object;

    return-void
.end method
