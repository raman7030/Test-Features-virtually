.class public final Ll/᩵֡֫;
.super Ljava/lang/Exception;
.source "28SI"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ᩴ֡֫;)V
    .locals 1

    .line 123
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ll/ᩴ֡֫;)V
    .locals 1

    const-string v0, "Unhandled input format:"

    .line 119
    invoke-direct {p0, v0, p1}, Ll/᩵֡֫;-><init>(Ljava/lang/String;Ll/ᩴ֡֫;)V

    return-void
.end method
